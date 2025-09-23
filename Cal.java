import java.util.Scanner;
class Cal{
    public static void main(String[]args){
     Scanner scan = new Scanner(System.in);
       System.out.print("Enter the year");
     int year = scan.nextInt();
       System.out.print("Enter the Month");
     int month = scan.nextInt();
       System.out.print("Enter the Date");
     int date = scan.nextInt();

    int[]daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31}; 

       boolean isLeap = (year%4==0 && year%100!=0 || year%400==0);
     if(isLeap && month == 2){
        daysInMonth[1] = 29;
}

       int[] t = {0,3,2,5,0,3,5,1,4,6,2,4};
       int y = month<3 ? year-1 : year;
       int firstDayIndex = (y+y/4 - y/100 + y/400 + t[month-1] + 1) % 7;

       String[] weekDays = {"Sun","Mon","Tues","Wed","Thus","Fri","Sat"};

      System.out.println("\nCalendar for"+date+"-"+month+ "-" +year+"\n");
     for(String day : weekDays){
     System.out.print(day+"\t");
}
    System.out.println();
 
      for(int i = 0;i<firstDayIndex;i++){
        System.out.print("\t");
}

      int totalDays = daysInMonth[month-1];
       for(int day = 1;day<= totalDays; day++){
        if(day == date){
          System.out.print("["+day+"]\t");
}  else{
          System.out.print(day+"\t");
} 
   if((firstDayIndex+day)%7==0){
      System.out.println();
}
}
 scan.close();
}
}
