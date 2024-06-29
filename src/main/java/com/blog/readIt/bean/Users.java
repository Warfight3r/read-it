package com.blog.readIt.bean;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

// BECAUSE THESE VARIABLES ARE ***PRIVATE***, ONLY THIS CLASS AND ITS GETTERS CAN ACCESS IT AND ****NO OTHER OBJECTS****

@Document(collection = "users")
public class Users {
    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("pwd")
    private String pwd;

    @Field("email")
    private String email;

    @Field("blogs")
    private List<String> blogs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return name;
    }

    public void setUsername(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<String> blogs) {
        this.blogs = blogs;
    }
    @Override
    public String toString() {
        return "User [name=" + name + ", pwd=" + pwd + "]";
    }
    
}