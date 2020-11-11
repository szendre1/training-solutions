package introcontrol;

public class IntroControl {
    public int substractTenIfGreaterThanTen(int number){
        return(number<=10?number:number-10 );
    }

    public String describeNumber(int number){
        return(number==0?"zero":"not zero");
    }

    public String greetingToJoe(String name){
        return(name=="Joe"?"Hello Joe":"");
    }

    public int calculateBonus(int sale){
        return(sale>=1_000_000?(sale/10):0);
    }

    public int calculateConsumption(int prev, int next){
        return(next>=prev?next-prev:10000+next-prev);
    }

    public void printNumbers(int max){
        for (int i = 0; i <= max ; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetween(int min, int max){
        if (max > min){
            for (int i = min+1; i < max ; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = min-1; i > max ; i--) {
                System.out.println(i);
            }
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b){
        if (b > a){
            for (int i = a+1; i < b ; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = a-1; i > b ; i--) {
                System.out.println(i);
            }
        }
    }

    public void printOddNumbers(int max){
        for (int i = 1; i <= max ; i=i+2) {
            System.out.println(i);
        }

    }



}
