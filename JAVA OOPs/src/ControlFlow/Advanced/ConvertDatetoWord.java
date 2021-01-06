package ControlFlow.Advanced;

import java.util.Scanner;

public class ConvertDatetoWord {

    /**
     * Class Name : ConvertDatetoWord
     * Description : @params, the main string that is sent here from the main method to the above date function.
     *               @return And gives us the final string that contains the whole date string converted in
     *               it's proper format.
     * Author : Vinayak Sengupta
     */

    public static String Date(String format) {

        String date;
        String month;
        String suffix;

        String YYYY = format.substring(0, 4);
        String MM = format.substring(5, 7);
        String DD = format.substring(8, 10);

        switch (MM) {

            case "01":
                month = "January";
                break;
            case "02":
                month = "February";
                break;
            case "03":
                month = "March";
                break;
            case "04":
                month = "April";
                break;
            case "05":
                month = "May";
                break;
            case "06":
                month = "June";
                break;
            case "07":
                month = "July";
                break;
            case "08":
                month = "August";
                break;
            case "09":
                month = "September";
                break;
            case "10":
                month = "October";
                break;
            case "11":
                month = "November";
                break;
            case "12":
                month = "December";
                break;
            default:
                month = "Not a valid month number";
                break;
        }

        switch (DD) {

            case "01":
            case "21":
                suffix = "st";
                break;

            case "29":
            case "30":
                if (month.equals("February")){
                    suffix = ":Not a valid day";
                }


            case "31":
                if (month.equals("February") || month.equals("April") || month.equals("June") ||
                        month.equals("September") || month.equals("November")) {
                    suffix = ":Not a valid day";
                } else {
                    suffix = "st";
                }
                break;

            case "02":
            case "22":
                suffix = "nd";
                break;

            case "3":
            case "23":
                suffix = "rd";
                break;

            default:
                suffix = "th";
                break;
        }

        return(month+" "+DD + suffix +"," + " " + YYYY);
    }

    public static void main(String[] args) {

        /**
         * @param args
         * The main method asks the user for a string containing the date in number format.
         * Then this string is sent to the function that converts this string into a proper format.
         */

        Scanner sc = new Scanner(System.in);

        String finalformat;

        System.out.println("Enter Date in the format - YYYY/MM/DD: ");
        finalformat = sc.nextLine();

        String dateformat = Date(finalformat);

        System.out.println(dateformat);
    }// end of main
}// end of class
