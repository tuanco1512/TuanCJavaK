package session6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld.getDayOfWeek());
        LocalDate ld2 = LocalDate.of(2022,12,25);
        LocalDate ld3 = LocalDate.parse("2022-11-25");
        System.out.println(ld3);
        System.out.println(ld.plusMonths(1));
        int c = ld.compareTo(ld3);
        System.out.println(c);
        long kc = ChronoUnit.DAYS.between(ld,ld3);
        System.out.println(kc);

        LocalDateTime t1 = LocalDateTime.now();
        System.out.println(t1);
        System.out.println(t1.plusHours(1));
        System.out.println(t1.minusHours(1));
        LocalDateTime t2 = LocalDateTime.of(2022,10,27,12,15);
        LocalDateTime t3 = LocalDateTime.parse("2022-10-27T14:15:38");
    }
}
