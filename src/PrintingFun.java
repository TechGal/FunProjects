import java.util.Date;

public class PrintingFun {
    public static void main (String[] args) {
        Date date = new Date();
        System.out.println(date);
        date.toString();
        System.out.println("Today is: " + date);
        System.out.println("Today is " + new Date().toString().substring(0, 10) );
    }
}
