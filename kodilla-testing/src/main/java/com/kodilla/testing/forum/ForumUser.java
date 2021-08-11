package com.kodilla.testing.forum;

import java.util.Objects;

public class ForumUser {
    private String postBody;
    private String author;

    public ForumUser(String postBody, String author) {
        this.postBody = postBody;
        this.author = author;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;
        ForumUser forumUser = (ForumUser) o;
        return Objects.equals(getPostBody(), forumUser.getPostBody()) && Objects.equals(getAuthor(), forumUser.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPostBody(), getAuthor());
    }
}
