package sit.int202.simple;

import java.util.Date;

public class TestTime {
    public static void main(String[] args) {
        Date d1 = new Date(1000*60); //1 mins
        Date d2 = new Date(1000*60*60*24); // 1 day
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(System.currentTimeMillis());

        Date toDay =  new Date(1694145277601L);
        Date tomorrow =  new Date(1694145277601L*1000*60*60*24); // today in 1 day
        System.out.println(toDay);
        System.out.println(tomorrow);
    }
}
