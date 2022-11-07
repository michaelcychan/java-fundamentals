package leap.years;

public class LeapYear {

    public static Boolean isLeap(Integer year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0){
            return false;
        } else if (year % 4 == 0){
            return true;
        } else {
            return false;
        }
    }
}
