public class TimeCalc {
    public static void main(String[] args) {
        String FullTime = (args[0]);
        String[] TimeParts = FullTime.split(":");
        int Hours = Integer.parseInt(TimeParts[0]);
        int Minutes = Integer.parseInt(TimeParts[1]);
        int MinutesToAdd = Integer.parseInt(args[1]);
        int TotalMinutes = Hours * 60 + Minutes + MinutesToAdd;
        int TotalHours = TotalMinutes / 60 ;
        int NewHours = TotalHours % 24;
        int NewMinutes = TotalMinutes - TotalHours * 60;
        String zero;
        String zero2;
        if(NewHours < 10 ){
            zero = "0";
        } else{zero = "";
        }
        if(NewMinutes<10){zero2 = "0";}
        else{ zero2 = "";}
        System.out.println( zero + NewHours + ":" + zero2 + NewMinutes);
}
}

