package com.bookApi.BookAPI.dto;

public class ResultList {
    private String kind;
    private int totalItems;
    private Result[] items;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Result[] getItems() {
        return items;
    }

    public void setItems(Result[] items) {
        this.items = items;
    }
}
