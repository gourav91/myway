package com.gourav.hackerrank.practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateConverter {
	public static void main(String[] args) throws ParseException {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String time = in.next();
		try {
			DateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
			Date date = new SimpleDateFormat("hh:mm:ssa").parse(time);
			System.out.println(displayFormat.format(date));
		} catch (ParseException ex) {
			System.out.println("Unable to parse given time : " + time + " "
					+ ex.getMessage());
		}
	}
}
