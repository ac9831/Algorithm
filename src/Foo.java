public class Foo {
    public static void main(String[] args) {

        String str = "50";
        if (isStringDouble(str))
            System.out.println("숫자입니다.");
        else
            System.out.println("숫자가 아닙니다.");

    }




    public static boolean isStringDouble(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}