package repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

@Repository
public class LocRepository {

    private final WebClient webClient;

    private static final String baseUrl = "https://www.googleapis.com/auth/books"; //I am not 100% sure that this is correct
    private final String yourAPIKey="AIzaSyCmNoIcMptf7SBUj-m5iCuKkod8AU2eDXw" ;

    public LocRepository() {
        webClient = WebClient
                .builder()
                .baseUrl(baseUrl)
                .build();
    }

    public String getResults(String query) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("query", query)
                        .queryParam("intitle", query)//NOT CORRECT PLEASE FIX NEXT TIME
                        .queryParam("apiKey",yourAPIKey)

                        .build()
                )
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }


}
