package interview;

import java.util.Scanner;

/**
 * Created by gunjunLee on 2016-11-30.
 */
public class spaceReplace {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(str.replace(" ", "%20"));

    }
}
