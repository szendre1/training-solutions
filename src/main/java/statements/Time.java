package statements;

public class Time {
    private int ora;
    private int perc;
    private int masodperc;

    public Time(int ora, int perc, int masodperc) {
        this.ora = ora;
        this.perc = perc;
        this.masodperc = masodperc;
    }

    public int getInMinutes(){
        return((ora*60)+perc);
    }

    public int getInSeconds(){
        return((((ora*60)+perc)*60)+masodperc);
    }

    public boolean earlierThan(Time masikIdo){
        return (getInSeconds()<masikIdo.getInSeconds());
    }

    public String toString(){
        return (ora+":"+perc+":"+masodperc);
    }

}
