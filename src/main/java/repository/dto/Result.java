package repository.dto;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
public class Result {


    private String kind;
    private String id;
    private String etag;
    private String selfLink;
    private volumeInfo volumeInfo;

    @JsonAlias("contributor")
    private List<String> authors;

    @JsonAlias("id")
    private String link;

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

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    public void setVolumeInfo(repository.dto.volumeInfo volumeInfo) {
        this.volumeInfo = volumeInfo;
    }

    public repository.dto.volumeInfo getVolumeInfo() {
        return volumeInfo;
    }
}
