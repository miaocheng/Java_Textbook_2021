
import java.util.Scanner;

public class WhatDayOfTheYear	{
	public static int leap(int year)	{
		int lp;
		lp = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1: 0;
		return lp;
	}
	
	public static int month_days(int year, int month)
	{
		int d;
		switch(month)
		{
			case 1:
			case 3:
			case 5: case 7: case 8: case 10:
			case 12: d = 31; break;
			case 2: d = leap(year) > 0? 29: 28; break;
			
			default: d = 30;
		}
		
		return d;
	}
	
	public static int days(int year, int month, int day)
	{
		int i, ds = 0;
		for (i = 1; i < month; i++)
			ds = ds + month_days(year, i);
		
		ds = ds + day;
		return ds;
	}
	
	public static void main(String args [])	
	{
		int year, month, day, t_day;
		System.out.print("Input year-month-day: \n");
		Scanner input = new Scanner(System.in);
		year = input.nextInt();
		month = input.nextInt();
		day = input.nextInt();
		t_day = days(year, month, day);
		System.out.printf("%d-%d-%d is %dth day of the year!\n", year, month, day, t_day);
		
	}

}


