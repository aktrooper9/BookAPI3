package com.bookApi.BookAPI.dto;

import java.util.List;

public class volumeInfo {
    private String title;
    private List authors;

    public List getAuthors() {
        return authors;
    }

    public void setAuthors(List authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
