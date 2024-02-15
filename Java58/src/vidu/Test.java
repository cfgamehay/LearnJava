package vidu;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        for (int i = 1; i < 10; i++) {
            System.out.println("okok");

        }
        long t2 = System.currentTimeMillis();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(((t2-t1)) + "mls" );
        System.out.println(((t2-t1)/1000) + "s" );
        //TimeUnit

        System.out.println("35h: "+ TimeUnit.HOURS.toSeconds(35));

        Date d = new Date(System.currentTimeMillis());
        System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));

        Calendar c = Calendar.getInstance();

        System.out.println(c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));

        c.add(Calendar.DATE,14);

        System.out.println(c.get(Calendar.DATE)+"/"+(c.get(Calendar.MONTH)+1)+"/"+c.get(Calendar.YEAR));

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

        System.out.println(df.format(d));
    }
}
