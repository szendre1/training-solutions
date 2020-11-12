package controlselection.week;

public class DayOfWeeks {
    public String whichDay(String day){
        String dayMessage="";
        String lday = day.toLowerCase();
        switch (lday){
            case "hétfő":
                dayMessage = "hét eleje";
                break;
            case "kedd":
            case "szerda":
            case "csütörtök":
                dayMessage = "hét közepe";
                break;
            case "péntek":
                dayMessage = "majdnem hétvége";
                break;
            case "szombat":
            case "vasárnap":
                dayMessage = "hét vége";
                break;
            default:
                throw new IllegalArgumentException("Invalid day "+day);
        }




        return dayMessage;

    }
}
