package service;

import org.springframework.stereotype.Service;
import repository.LocRepository;

@Service
public class LocService {
    private final LocRepository locRepository;

    public LocService(LocRepository locRepository) {
        this.locRepository = locRepository;
    }

    public String getResults(String query){
        return locRepository.getResults(query);
    }


}
