package schoolrecords;

public class Mark {
    private MarkType markType;
    private Subject subject;
    private Tutor tutor;

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        if ((markType==null) || (subject==null) || (tutor==null)){
            throw new NullPointerException("Both subject and tutor must be provided!");
        } else {
            this.markType = markType;
            this.subject = subject;
            this.tutor = tutor;
        }
    }

    public Mark(String markType, Subject subject, Tutor tutor) {
        if ((markType==null) || (subject==null) || (tutor==null)){
            throw new NullPointerException("Both subject and tutor must be provided!");
        }
        switch (markType) {  // Van ennél rugalmasabb megoldás?
            case "excellent" -> this.markType = MarkType.A;
            case "very good" -> this.markType = MarkType.B;
            case "improvement need" -> this.markType = MarkType.C;
            case "close fail" -> this.markType = MarkType.D;
            case "fail" -> this.markType = MarkType.F;
            default -> throw new NullPointerException("Both subject and tutor must be provided!");
        }
        this.subject = subject;
        this.tutor = tutor;
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

      @Override
      public String toString() {
        return (markType.toString());
      }


}