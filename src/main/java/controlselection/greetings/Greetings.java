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

/*
    assertEquals("jó éjt", greetings.greet(4, 30));
    assertEquals("jó éjt", greetings.greet(5, 0));
    assertEquals("jó reggelt", greetings.greet(5, 1));
    assertEquals("jó reggelt", greetings.greet(9, 0));
    assertEquals("jó napot", greetings.greet(9, 1));
    assertEquals("jó napot", greetings.greet(18, 30));
    assertEquals("jó estét", greetings.greet(18, 31));
    assertEquals("jó estét", greetings.greet(20, 0));
    assertEquals("jó éjt", greetings.greet(20, 1));


 */

}
