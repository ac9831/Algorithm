/**
 * Created by gunjunLee on 2016-09-27.
 */
public class tmp {

    public static void main(String[] args){
        int a = 5, b = 10;
        int[] value = swap(a,b);
        System.out.println("a : " + value[0] + ", b : " + value[1]);

    }

    public static int[] swap(int a, int b){

        int[] ret = new int[2];
        ret[0] = b;
        ret[1] = a;



        return ret;
    }
}
