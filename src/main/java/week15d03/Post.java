package week15d03;

import java.time.LocalDate;

public class Post {
    private String title;
    private LocalDate publishedAt;
    private String content;
    private String owner;

    public Post(String title, LocalDate publishedAt, String content, String owner) {
        PostValidCheck(title, publishedAt, content);
        this.title = title;
        this.publishedAt = publishedAt;
        this.content = content;
        this.owner = owner;
    }

    public void PostValidCheck(String title, LocalDate publishedAt, String content) {
        if (publishedAt.isAfter(LocalDate.now()) || publishedAt.isEqual(LocalDate.now())) {
            throw new IllegalArgumentException("Invalid date!");
        }
        if (content == null || content.trim().equals("")) {
            throw new IllegalArgumentException("Invalid content!");
        }
        if (title == null || title.trim().equals("")) {
            throw new IllegalArgumentException("Invalid title!");
        }
        return;
    }


    public String getTitle() {
        return title;
    }

    public LocalDate getPublishedAt() {
        return publishedAt;
    }

    public String getContent() {
        return content;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", publishedAt=" + publishedAt +
                ", content='" + content + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}


