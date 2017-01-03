package interview;

import java.util.*;

/**
 * Created by gunjunLee on 2016-11-30.
 */
public class PermutationStr {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();

        str = str.replace(" ", "");
        str2 = str2.replace(" ", "");
        List<Character> strList = new ArrayList<Character>();
        List<Character> strList2 = new ArrayList<Character>();

        for(int i=0;i<str.length();i++){
            strList.add(str.charAt(i));
            strList2.add(str2.charAt(i));
        }
        Collections.sort(strList);
        Collections.sort(strList2);
        System.out.println(strList.equals(strList2));
    }

}
