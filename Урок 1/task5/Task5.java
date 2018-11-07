public class Task5 {

    public static void main(String[] args) {

        System.out.println(Mask("235434"));
    }

    public static String Mask(String s){

        String maskStr="";







        for (int i=0; i<s.length(); i++) {

            if ( i<s.length()-2 ){
                maskStr=maskStr +"#";

            }
            else {
                maskStr = maskStr + s.substring(i,i+1);
            }

        }
        return maskStr;
    }
}
