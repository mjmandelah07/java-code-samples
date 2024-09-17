import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDates {
    // Java does not have a built-in Date class,
    // but we can import the java.time package to work with the date and time API.

    // Class	                Description
    //LocalDate	                Represents a date (year, month, day (yyyy-MM-dd))
    //LocalTime	                Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
    //LocalDateTime	            Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
    //DateTimeFormatter	        Formatter for displaying and parsing date-time objects

    public static void main(String[] args) {
        // Display Current Date
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj); // Display the current date

        // Display Current Time
        LocalTime myObj1 = LocalTime.now();
        System.out.println(myObj1);

        // Display Current Date and Time
        LocalDateTime myObj2 = LocalDateTime.now();
        System.out.println(myObj2);

        // Formatting Date and Time
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
