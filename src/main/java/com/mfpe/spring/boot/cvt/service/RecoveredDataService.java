package com.mfpe.spring.boot.cvt.service;

import java.io.IOException;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.mfpe.spring.boot.cvt.model.RecoveredStats;
@Service
public class RecoveredDataService {
	private static String RECOVERED_DATA_URL = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_recovered_global.csv";
	   
    private List<RecoveredStats> recoveredStats = new ArrayList<>();

    public List<RecoveredStats> getAllRecoverdStats() {
        return recoveredStats;
    }

    @PostConstruct
    @Scheduled(cron = "* * 1 * * *")
    public void fetchRecoveredData() throws IOException, InterruptedException {
    	List<RecoveredStats> newrecoveredStats = new ArrayList<>();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(RECOVERED_DATA_URL))
                .build();
        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
       
        StringReader csvBodyReader = new StringReader(httpResponse.body());
        Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvBodyReader);
        for (CSVRecord record : records) {
        	RecoveredStats recovStats = new RecoveredStats();
        	recovStats.setState(record.get("Province/State"));
        	recovStats.setCountry(record.get("Country/Region"));
            int latestCases = Integer.parseInt(record.get(record.size() - 1));
            int prevDayCases = Integer.parseInt(record.get(record.size() - 2));
            recovStats.setLatestTotalCases(latestCases);
            recovStats.setDiffFromPrevDay(latestCases - prevDayCases);
            
            newrecoveredStats.add(recovStats);
        }
        this.recoveredStats= newrecoveredStats;
    }
}
