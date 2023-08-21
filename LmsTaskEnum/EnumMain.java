package LmsTaskEnum;

import java.util.Scanner;

public class EnumMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Жуманын бир кунун танданыз");
            int day = scanner.nextInt();
            switch (day){
                case 1:
                  Days monday = Days.MONDAY;
                  monday.method();
                  break;
                case 2:
                    Days tuesday = Days.TUESDAY;
                    tuesday.method();
                    break;
                case 3:
                    Days w = Days.WEDNESDAY;
                    w.method();
                    break;
                case 4:
                    Days t = Days.THURSDAY;
                    t.method();
                    break;
                case 5:
                    Days f = Days.FRIDAY;
                    f.method();
                    break;
                case 6:
                    Days s = Days.SATURDAY;
                    s.method();
                    break;
                case 7:
                    Days sa = Days.SUNDAY;
                    sa.method();
                    break;
            }
        }
    }
}
