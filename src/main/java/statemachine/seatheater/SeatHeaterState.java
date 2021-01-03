package statemachine.seatheater;

public enum SeatHeaterState {
    ONE{
        public SeatHeaterState next(){
            return SeatHeaterState.OFF;
        }
    },
    TWO{
        public SeatHeaterState next(){
            return SeatHeaterState.ONE;
        }

    }
    ,
    THREE{
        public SeatHeaterState next(){
            return SeatHeaterState.TWO;
        }

    },
    OFF{
        public SeatHeaterState next(){
            return SeatHeaterState.THREE;
        }

    };
//
    abstract SeatHeaterState next();
}
