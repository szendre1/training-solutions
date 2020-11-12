package controlselection.greetings;

public class Greetings {

    public String greet(int ora, int perc){
        int totalPerc = (ora*60)+perc;
        String hello="";

        if ((totalPerc >=0) & (totalPerc<=60*5)){
            hello = "jó éjt";
        } else if ((totalPerc >60*5) & (totalPerc<=60*9)){
            hello = "jó reggelt";
        } else if ((totalPerc >60*9) & (totalPerc<=(60*18)+30)){
            hello = "jó napot";
        } else if ((totalPerc >(60*18)+30) & (totalPerc<=60*20)){
            hello = "jó estét";
        } else if ((totalPerc >60*20)){
            hello = "jó éjt";
        }
        return hello;
    }

}
