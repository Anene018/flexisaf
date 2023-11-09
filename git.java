package git.flexisaf;
import java.time.*;

class newExcepion extends Exception {
    public newExcepion (String error){
        super(error); 
    }
}

public class git {
    public static void main(String[] args) {

        int dividend = 20;
        int divisor = 10;
        int result ;

        try {
            if(divisor == 0 ){
                throw new newExcepion("Cannot divide by zero");
            }
            result = dividend / divisor;
        } catch (newExcepion e) {
            // TODO: handle exception
            System.out.println(e);
            result = 0; 
        } 
        System.out.println("Result is : " + result);
        

        for ( Month month : Month.values()){
            LocalDate date = LocalDate.of(2024, month, 13);
            if( date.getDayOfWeek() == DayOfWeek.FRIDAY){
                System.out.println( date + " falls on a friday");
            } else {
                try {
                    throw new newExcepion(date + " does not fall on a Friday");
                } catch (newExcepion e) {
                    // TODO: handle exception
                    System.out.println(e);
                }
            }
        }
    }
}
