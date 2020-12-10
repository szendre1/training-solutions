package week07d4;

import java.time.LocalDate;

public class Lab {
    private String title;
    private boolean completed;
    private LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
        this.completed = false;
    }

    public Lab(String title, LocalDate completedAt) {
        this.title = title;
        this.completedAt = completedAt;
        this.completed = true;
    }

    public void complete(LocalDate completedAt) {
        this.completedAt = completedAt;
        this.completed = true;
    }

    public void complete() {
        this.completedAt = LocalDate.now();
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Subject info: " +
                "title='" + title + '\'' +
                ", completed=" + completed +
                ", completedAt=" + completedAt;
    }
}
