public class removeStrings {
    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
    }

    private static String  removeWhiteSpaces(String str) {
        //StringBuilder updStr = new StringBuilder(str) ;
        String updStr = new String(str);
        updStr = updStr.replace(" " ,"");
        return updStr;
        //return "abc";
    }
}