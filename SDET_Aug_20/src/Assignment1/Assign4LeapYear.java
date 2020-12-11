package Assignment1;

import java.util.Scanner;

public class Assign4LeapYear 
{

	public static void main(String[] args) {

        int year;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the Year: ");
        
            year  = s.nextInt();
        boolean leap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;

        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}

