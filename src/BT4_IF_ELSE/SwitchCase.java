package BT4_IF_ELSE;

public class SwitchCase {
    public static void main(String[] args) {
        int month = 13;
        String monthName;
        switch (month) {
            case 1:
                monthName = "Tháng 1";
                break;
            case 2:
                monthName = "Tháng 2";
                break;
            case 3:
                monthName = "Tháng 3";
                break;
            case 4:
                monthName = "Tháng 4";
                break;
            case 5:
                monthName = "Tháng 5";
                break;
            case 6:
                monthName = "Tháng 6";
                break;
            case 7:
                monthName = "Tháng 7";
                break;
            case 8:
                monthName = "Tháng 8";
                break;
            case 9:
                monthName = "Tháng 9";
                break;
            case 10:
                monthName = "Tháng 10";
                break;
            case 11:
                monthName = "Tháng 11";
                break;
            case 12:
                monthName = "Tháng 12";
                break;
            default:
                monthName = "Số tháng không hợp lệ";
                break;
        }
        System.out.println("Tháng " + month + " tương ứng với " + monthName);
    }
}