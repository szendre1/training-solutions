package week08d04;

public class Trainer {

    CanMark canMark;

    public Trainer(CanMark canMark) {
        this.canMark = canMark;
    }

    public int giveMark(){
        return canMark.giveMark();
    }

    public static void main(String[] args) {
        Trainer happyTrainer = new Trainer(new GoodMood());
        Trainer sadTrainer = new Trainer(new BadMood());
        System.out.println(happyTrainer.giveMark());
        System.out.println(sadTrainer.giveMark());

    }

}
