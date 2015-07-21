package diyer.apjava.guessmybirthday;

public class Calculation{
	private int value;
	private int month;
	private int day;
	
	String[] monthsOfTheYear = new String[12];
	String[] daysOfTheMonth = new String[31];
	
	public Calculation(int value){
		this.value = value;
		
		//Setting Months
		monthsOfTheYear[0] = "January";
		monthsOfTheYear[1] = "Feburary";
		monthsOfTheYear[2] = "March";
		monthsOfTheYear[3] = "April";
		monthsOfTheYear[4] = "May";
		monthsOfTheYear[5] = "June";
		monthsOfTheYear[6] = "July";
		monthsOfTheYear[7] = "August";
		monthsOfTheYear[8] = "September";
		monthsOfTheYear[9] = "October";
		monthsOfTheYear[10] = "November";
		monthsOfTheYear[11] = "December";
		
		//Setting Days
		daysOfTheMonth[0] = "1st";
		daysOfTheMonth[1] = "2nd";
		daysOfTheMonth[2] = "3rd";
		daysOfTheMonth[3] = "4th";
		daysOfTheMonth[4] = "5th";
		daysOfTheMonth[5] = "6th";
		daysOfTheMonth[6] = "7th";
		daysOfTheMonth[7] = "8th";
		daysOfTheMonth[8] = "9th";
		daysOfTheMonth[9] = "10th";
		daysOfTheMonth[10] = "11th";
		daysOfTheMonth[11] = "12th";
		daysOfTheMonth[12] = "13th";
		daysOfTheMonth[13] = "14th";
		daysOfTheMonth[14] = "15th";
		daysOfTheMonth[15] = "16th";
		daysOfTheMonth[16] = "17th";
		daysOfTheMonth[17] = "18th";
		daysOfTheMonth[18] = "19th";
		daysOfTheMonth[19] = "20th";
		daysOfTheMonth[20] = "21st";
		daysOfTheMonth[21] = "22nd";
		daysOfTheMonth[22] = "23rd";
		daysOfTheMonth[23] = "24th";
		daysOfTheMonth[24] = "25th";
		daysOfTheMonth[25] = "26th";
		daysOfTheMonth[26] = "27th";
		daysOfTheMonth[27] = "28th";
		daysOfTheMonth[28] = "29th";
		daysOfTheMonth[29] = "30th";
		daysOfTheMonth[30] = "31st";
	}
	
	public void finalCalculation(int current){
		value = current+65;
		month = value/100;
		day = value-month*100;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
	
	public String getMonthString(){
		return monthsOfTheYear[month-1];
	}
	
	public String getDayString(){
		return daysOfTheMonth[day-1];
	}
	
	
}
