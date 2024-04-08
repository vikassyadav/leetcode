// 2678.  leetcode
public class NumberofSeniorCitizens {
    public static void main(String[] args) {
        String[] detail = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSenior2(detail));
        
    }
    public static int countSenior(String[] details){
        int result =0;

        for (String  s : details) {
            int age = Integer.parseInt(s.substring(11, 13));
            if(age>60){
                result++;
            }   
        }
        return result;
    }
    //  same as previous method bas code chota h
    public static int countSenior1(String[] details){
        int result =0;

        for (String  s : details) {
            if(Integer.parseInt(s.substring(11, 13)) > 60){
                result++;
            }   
        }
        return result;
    }

    public static int countSenior2(String[] details){
        int result =0;

        for (String  s : details) {
            if(s.charAt(11)>'6' || s.charAt(11)=='6' && s.charAt(12)>'0'){
                result++;
            }   
        }
        return result;
    }
}
