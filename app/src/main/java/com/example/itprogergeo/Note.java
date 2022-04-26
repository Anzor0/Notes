package com.example.itprogergeo;

import io.realm.RealmObject;

public class Note extends RealmObject {
    String title;
    String description;
    long createdTime;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreatedTime(long createdTime) {
        this.createdTime = createdTime;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public long getCreatedTime() {
        return createdTime;
    }
}
