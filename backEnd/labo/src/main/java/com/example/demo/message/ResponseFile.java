package com.example.demo.message;

public class ResponseFile {
    private String name;
    private String url;
    private String type;
    private long size;
    private String email;

    public ResponseFile(String name, String url, String type, long size, String email) {
        this.name = name;
        this.url = url;
        this.type = type;
        this.size = size;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}