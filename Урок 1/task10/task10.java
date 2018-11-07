public class task10 {
    public static void main(String[] args) {

        System.out.println(Mask("9778015347"));
    }

    public static String Mask(String s){

        String maskStr="";

        for (int i=0; i<s.length(); i++) {


            if (s.length()==10){

                maskStr = "+7 (" + s.substring(0, 3)+") "+ s.substring(3,6) +"-"+s.substring(6, 8)+"-"+s.substring(8,10) ;
                
            }

            else {System.out.println("Введи без 8");}

        }
        return maskStr;
    }

}
