package algorithmsmax;

import java.util.List;

    public class spCalc {

        // legnagyobb árbevétel
        public Salesperson bigArbevetel(List<Salesperson> sales){
            Salesperson winnerPerson = sales.get(0);
            for (Salesperson x:sales) {
                if (x.getAmount()> winnerPerson.getAmount()){
                    winnerPerson=x;
                }
            }
            return winnerPerson;
        }


        public Salesperson bigAlatta(List<Salesperson> sales) {
            Salesperson winnerPerson = sales.get(0);
            for (Salesperson x : sales) {
                if (x.getAmount() < x.getTarget()) {
                    if (x.getTarget()-x.getAmount() > winnerPerson.getTarget()-winnerPerson.getAmount()) {
                        winnerPerson = x;
                    }
                }
            }
            return winnerPerson;
        }



        public Salesperson bigFelette (List < Salesperson > sales) {
            Salesperson looserPerson = sales.get(0);
            for (Salesperson x : sales) {
                if (x.getAmount() > x.getTarget()) {
                    if (x.getAmount() - x.getTarget() > looserPerson.getAmount() - looserPerson.getTarget()) {
                        looserPerson = x;
                    }
                }

            }
            return looserPerson;
        }
    }





