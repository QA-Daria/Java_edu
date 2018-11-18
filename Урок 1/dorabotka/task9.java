public class task9 {

    public static void main(String[] args) {
        System.out.println(format(3500));
        System.out.println(format(120));
        System.out.println(format(-32));
        System.out.println(format(0));
        System.out.println(format(188));
        System.out.println(format(26250));
    }

    public static String format(int num) {
        String hour_string = "часов", minute_string = "минут", sec_string = "секунд";
        if (num <=0) return "0 секунд";
        else if(num < 60) {

            if(num % 10 == 1) sec_string = "секунда";
            else if ((num % 10 > 1) && (num % 10 < 5)) sec_string = "секунды";
            else if ((num % 10 > 5) && (num % 10 <= 9)) sec_string = "секунд";

            return num + " " + sec_string;
        }
        else if(num < 3600) {

            int minutes = num / 60;
            num = num - minutes * 60;

            if(minutes == 1) minute_string = "минута";
            else if ((minutes > 1) && (minutes < 5)) minute_string = "минуты";
            else if ((minutes > 5) && (minutes <= 9)) minute_string = "минут";

            if(num % 10 == 1) sec_string = "секунда";
            else if ((num % 10 > 1) && (num % 10 < 5)) sec_string = "секунды";
            else if ((num % 10 > 5) && (num % 10 <= 9)) sec_string = "секунд";

            return minutes + " " + minute_string + " " + num % 60 + " " + sec_string;
        } else {

            int hours = num / 3600;
            num = num - hours * 3600;
            int minutes = num / 60;
            num = num - minutes * 60;

            if(hours == 1) hour_string = "час";
            else if ((hours > 1) && (hours < 5)) hour_string = "часа";
            else if ((hours > 5) && (hours <= 9)) hour_string = "часов";

            if(minutes == 1) minute_string = "минута";
            else if ((minutes > 1) && (minutes < 5)) minute_string = "минуты";
            else if ((minutes > 5) && (minutes <= 9)) minute_string = "минут";

            if(num % 10 == 1) sec_string = "секунда";
            else if ((num % 10 > 1) && (num % 10 < 5)) sec_string = "секунды";
            else if ((num % 10 > 5) && (num % 10 <= 9)) sec_string = "секунд";

            return hours + " " + hour_string + " " + minutes + " " + minute_string + " " + num % 60 + " " + sec_string;
        }
    }
}
