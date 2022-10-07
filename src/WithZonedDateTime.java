import java.time.ZoneId;
import java.time.ZonedDateTime;

public class WithZonedDateTime {


    public void zonedDateTime(){

        ZonedDateTime currentZone=ZonedDateTime.now();
        System.out.println("currentZone "+currentZone);

        ZonedDateTime dateTimeParticularZoned=currentZone.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        System.out.println("dateTimeParticularZoned "+dateTimeParticularZoned);

        ZonedDateTime addDays=dateTimeParticularZoned.minusDays(15);
        System.out.println("addDate "+addDays);
        ZonedDateTime minusHours=dateTimeParticularZoned.minusHours(20);
        System.out.println("minusHours "+minusHours);

        /*
        Similarly We can convert into special format and parse.
         */


    }

}
