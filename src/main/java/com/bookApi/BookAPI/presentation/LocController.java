package com.bookApi.BookAPI.presentation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocController {
    @GetMapping("/searchLocResults")
    @Operation(summary= "Searches for books matching the search term",
            description = "Response may include multiple Result values.")
    @ApiResponses( value = {
            @ApiResponse(responseCode = "200", description = "Result(s) found"),
            @ApiResponse(responseCode = "404", description = "Result(s) not found")
    })
    public String getResults(@RequestParam(value = "q") String query) {
        return "Searching for books related to " + query;
    }


}
