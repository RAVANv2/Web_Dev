package com.course.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class YoutubeCourse {

    @Id
    private Integer id;
    private String title;
    private String description;

    public YoutubeCourse(Integer id, String title, String description){
        super();
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public YoutubeCourse(){
        super();
    }

    @Override
    public String toString() {
        return "YoutubeCourse{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
