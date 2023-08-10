package repository.dto;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
public class Result {
    private String title;
    private String kind;
    public String id;
    public String etag;
    @JsonAlias("contributor")
    private List<String> authors;

    @JsonAlias("id")
    private String link;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getETag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }
}
