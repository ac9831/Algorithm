/**
 * Created by gunjunLee on 2016-09-29.
 */
public class division {

    int cnt;
    int[] Array = new int[100];

    public division(){
        cnt = 0;
    }

    public int partition(int n, int m){
        int count = 0, i;

        if(n < m){
            m = n;
        }
        if(n == 0) {
            Array[cnt] = 1;
            for(int j=0;j<cnt;j++){
                System.out.print(Array[j]);
            }
            System.out.println();
            cnt--;
            return 1;
        }

        for(i = 1; i<= m; i++){
            Array[cnt] = i;
            cnt++;
            count += partition(n-i, i);
        }
        cnt--;
        return count;
    }


    public static void main(String[] args){
        division div = new division();

        int ret = div.partition(5,3);
        System.out.println(ret);
    }

}
