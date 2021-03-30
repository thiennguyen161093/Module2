import java.util.Scanner;

public class kiemtrathang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon thang ma ban muon dem ngay:");
        int month = sc.nextInt();
        String dayInMonth;
        switch (month){
            case 2:
                dayInMonth = "28 & 29 days";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = "30 days";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "31 days";
                break;
            default:
                dayInMonth="Invalid";
                break;
        }
        if (dayInMonth != "") System.out.printf("The month '%d' has %s days!", month, dayInMonth);
        else System.out.print("Invalid input!");
    }
}
