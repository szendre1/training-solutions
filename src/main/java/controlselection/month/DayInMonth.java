package controlselection.month;

public class DayInMonth {
    public int numberOfDays(int year, String month) {
        int x;
        switch (month.toLowerCase()) {
            case "január", "március", "május",
                    "július", "augusztus", "október", "december" -> x=31;
            case "április", "június", "szeptember", "november" -> x=30;
            case "február" -> {
                if ((year % 4) == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            x=29;
                        } else x=28;
                    } else x=29;
                } else x=28;
            }
            default -> { throw new IllegalArgumentException("Invalid month: " + month); }
        }  // switch



        /*
        switch (month.toLowerCase()) {
            case "január":
            case "március":
            case "május":
            case "július":
            case "augusztus":
            case "október":
            case "december":
                return 31;
            case "április":
            case "június":
            case "szeptember":
            case "november":
                return 30;
            case "február":
                if ((year % 4) == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            return 29;
                        }
                        return 28;
                    }
                    return 29;
                }
                return 28;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }  // switch
         */
    return x;
    }
}
