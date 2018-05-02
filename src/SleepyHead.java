//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        int isWeekday, isVacation = 0;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
   isWeekday=JOptionPane.showConfirmDialog(null, "Is it a weekday?","",JOptionPane.YES_NO_OPTION);
System.out.println(isWeekday);
System.out.println(isVacation);
   if(isWeekday==1); {
	  isVacation=JOptionPane.showConfirmDialog(null, "So it's a weekend or vacation?","",JOptionPane.YES_NO_OPTION);
   }

if(isWeekday==0 && isVacation==1) {
	JOptionPane.showMessageDialog(null, "Get up lazybones!");
}
else if(isVacation==0 && isWeekday==1) {
	  JOptionPane.showMessageDialog(null, "Sleep in then.");	  
  }
else if(isVacation==1 && isWeekday==1) {
	  JOptionPane.showMessageDialog(null, "uhhhhhhhh");
  }




/*
         * Print "sleep in" if it is a vacation or a weekend. If it's a weekday,
         * print â€œget up lazybones!â€� If it is a weekday, and we are on vacation,
         * print â€œsleep inâ€�.
         */
    }
}
