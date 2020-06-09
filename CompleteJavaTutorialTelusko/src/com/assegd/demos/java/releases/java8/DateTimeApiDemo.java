package com.assegd.demos.java.releases.java8;

import java.time.*;

/** ------------------------- Date Time Api ---------------------
 *  - it is using java.time package
 *          - not anymore java.util and java.sql
 *  - it simplifies so many things
 *
 *
 */


public class DateTimeApiDemo {

    public static void main(String[] args) {

        /**---------------------------- Date----------------------------------------------*/
        LocalDate d = LocalDate.now();
        System.out.println("Local Date now is:- " + d);

        LocalDate after10Days = LocalDate.now().plusDays(10);
        System.out.println("Local date after 10 day from now:- "+ after10Days);

        LocalDate dateSpecific = LocalDate.of(1985, Month.AUGUST, 25);
        System.out.println("Specific date My Birthday:- "+ dateSpecific);

        /**---------------------------- Time ----------------------------------------------*/

        LocalTime localTime = LocalTime.now();
        System.out.println("Local Time now is :- " +localTime);

        LocalTime specificTime = LocalTime.of(12,35,45,9999);
        System.out.println("local Time specific :- "+ specificTime);

        LocalTime zoneTime = LocalTime.now(ZoneId.of("Africa/Nairobi"));
        System.out.println("Local Time using zone in nairobi:-  " + zoneTime);


        //Human Readable Time
        LocalDateTime datetime1 = LocalDateTime.now(ZoneId.of("GMT"));
        System.out.println("Local Time using zone in GMT (Human Readable Time):-  " + datetime1);

        //Mashine Readable time
        Instant i = Instant.now();
        System.out.println("Dispalying current time using Instant(displays by default GMT)(Mashine Readable Time):-  " + i);



        /** - ----------- displays all the zone ids of time ----------------------------
        for (String s : ZoneId.getAvailableZoneIds()){
            System.out.println(s);
        }
*/
    }
}
