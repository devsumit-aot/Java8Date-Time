import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WithLocalDateTime {

    // printing Date
    public void dateOnly(){
        LocalDate date=LocalDate.now();
        System.out.println("date "+ date);

        LocalDate plusDays=date.plusDays(5);
        LocalDate minusMonth=date.minusMonths(2);
        LocalDate addYear=date.plusYears(12);

        System.out.println("plusDays "+plusDays);
        System.out.println("minusMonth "+minusMonth);
        System.out.println("addYear "+addYear);

    }
    public void timeOnly(){
        LocalTime time=LocalTime.now();
        System.out.println("time "+time);

        LocalTime plusHours=time.plusHours(5);
        LocalTime minusMinutes=time.minusMinutes(36);
        LocalTime plusSecond=time.plusSeconds(60);

        System.out.println("plusHours "+plusHours);
        System.out.println("minusMinutes "+minusMinutes);
        System.out.println("plusSecond "+plusSecond);

    }

    public  void dateTime(){
        LocalDateTime localDateTime=LocalDateTime.now();

        LocalDateTime addDate=localDateTime.plusMonths(3);
        LocalDateTime minusHours=localDateTime.minusHours(13);

        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

        // Converting into String from Date type
        String formatedDate=localDateTime.format(formatter);
        System.out.println("formatedDate "+formatedDate);

        // Converting into Date type from String
        LocalDateTime parseLocalDateTime=LocalDateTime.parse(formatedDate,formatter);
        System.out.println("parseLocalDate "+parseLocalDateTime);

        System.out.println("addDate "+addDate);
        System.out.println("minusHours "+minusHours);

    }

}
