public class MainClass {

    public static void main(String args[]){

        WithLocalDateTime localDateTime=new WithLocalDateTime();
//        localDateTime.dateOnly();
//        localDateTime.timeOnly();
//        localDateTime.dateTime();
       WithZonedDateTime withZonedDateTime=new WithZonedDateTime();
        withZonedDateTime.zonedDateTime();
    }
}
