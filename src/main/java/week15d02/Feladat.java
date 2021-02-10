package week15d02;

public class Feladat {

    private String question;
    private String answer;
    private int point;
    private String subject;

    public Feladat(String question, String answer, int point, String subject) {
        this.question = question;
        this.answer = answer;
        this.point = point;
        this.subject = subject;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public int getPoint() {
        return point;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Feladat{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", point=" + point +
                ", subject='" + subject + '\'' +
                '}';
    }
}
