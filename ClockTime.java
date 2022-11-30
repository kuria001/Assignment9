
/**
 *NAME: Reeja Accamma Kurian
 *COURSE: Computer Science I - CSCI 241
 *
 *PROJECT DESCRIPTION
 *To omplete and test an instantiable Java class that keeps track of information for a clock time.
 *
 *
 */   

import java.util.*;

public class ClockTime
{
    private int hour;
    private int minute;
    private int second;

    public ClockTime()
    {
        hour = 0;
        minute = 0;
        second =0;

    }


    public ClockTime(int h, int m, int s)
    {
        hour = h;
        minute = m ;
        second = s ;

        if(s>59)
        {
            minute=s%60;
            second=s/60;
        }
        else if(s<0)
        {
            second=0;
        }

        if(m>59)
        {
            hour=m%60;
            minute=m/60;

        }
        else if(m<0)
        {
            minute=0;
        }

        if(h>24)
        {
            hour=h%24;

        }
        else if(h<0)
        {
            hour=0;
        }
    }

    public int getHour()
    {

        return hour;

    }

    public int getMinute()
    {

        return minute;

    }

    public int getSecond()
    {

        return second;

    }

    public void setHour(int h)
    {
        hour = h;
    }

    public void setMinute(int min)
    {
        minute = min;
    }

    public void setSecond(int sec)
    {
        second = sec;
    }

    //24 HOUR FORMAT
    public String toString()
    {
        String result = hour + ":" + minute + ":" + second;
        return result;

    }

    public String toString12() {
  
        if(hour>12)
        {
            hour = hour%12;
            String time = "P.M.";

           String result = hour + ":" + minute + ":" + second + time;
           return result;
        }
        else
        {

           String result = hour + ":" + minute + ":" + second ;
           return result;
        }
    }

    public void advance (int a)
    {
        Scanner input = new Scanner (System.in);
        a= input.nextInt();

        for (; a>60; minute++)
        {
            a=a%60;
            for(; minute>60; hour++)
            {
                minute = minute%60;
            }
        }
    }

   public boolean equals (ClockTime a)

    {
         if (hour == a.getHour() && minute == a.getMinute() && second == a.getSecond())
              return true;
         else
              return false;
    }
    
}

