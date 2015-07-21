package diyer.apjava.guessmybirthday;

import java.io.IOException;

import javax.swing.JOptionPane;


public class CalculationTest {
	public static void main(String[] args) throws IOException{
		String str="";
		str=str+"This program will guess your birthday and month"+'\n';
		str=str+"Answer the following questions and do the simple math" +'\n'+'\n';
		System.out.println();
		str=str+"1. Take the number of the month that you were born 1-jan 2-Feb, etc"+'\n';
		str=str+"2. Double the month number" + '\n';
		str=str+"3. Next add 6"+'\n';
		
		JOptionPane.showMessageDialog(null,str);
	}
}
