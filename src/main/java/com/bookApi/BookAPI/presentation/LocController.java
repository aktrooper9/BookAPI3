package com.bookApi.BookAPI.presentation;

import com.bookApi.BookAPI.dto.Result;
import com.bookApi.BookAPI.dto.ResultList;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import com.bookApi.BookAPI.service.LocService;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin
@RestController
public class LocController {
    private final LocService locService;

    public LocController(LocService locService) {
        this.locService = locService;
    }

    @GetMapping("/searchLocResults")
    @Operation(summary= "Searches for books matching the search term",
            description = "Response may include multiple Result values.")
    @ApiResponses( value = {
            @ApiResponse(responseCode = "200", description = "Result(s) found"),
            @ApiResponse(responseCode = "404", description = "Result(s) not found")
    })
    public Result[] getResults(@RequestParam(value="q") String query) {
       // ResultList results = locService.getResults(query);
        Result[] results = locService.getResults(query);
        //Result[] result =results.getItems();
        //if(results.getItems().length==0){
        //    throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Result(s) not found.");
      // }
        return results;
    }

}
