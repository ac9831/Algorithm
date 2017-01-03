/**
 * Created by gunjunLee on 2016-10-22.
 */
public class copang {

    //2번
    public int solution(int[] coinTypes, int money){
        int[] save= new int[10001];
        int len = coinTypes.length;

        save[0] = 1;
        for(int i=0;i<len;i++){
            for(int j=coinTypes[i];j<=money;j++){
                save[j]+=save[j-coinTypes[i]];
            }
        }

        return save[money];
    }

    //4번
    /*public int solution(String A, String B){
        char[] cA = A.toCharArray();
        char[] cB = B.toCharArray();

        int cnt = 0;
        if(A.length() == B.length()){
            int F = 0;
            for(int i=A.length()-1;i>0;i--){
                if(cA[i]!=cB[i]){
                    for(int j=i;;j--){
                        if(j < 0) {
                            F = 1;
                            break;
                        }
                        if(cA[i] != cA[j]){
                            cnt += i-j;
                            char tmp = cA[j];
                            cA[j] = cA[i];
                            cA[i] = tmp;
                            break;
                        }
                    }
                }
                if(F == 1){
                    cnt = -1;
                    break;
                }
            }
        }else{
            cnt = -1;
        }


        return cnt;
    }*/

    // 3번
   /* public int solution(String str){
        int len = str.length();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == str.charAt(len-1)) {
                len--;
            }
        }
        return str.length() + len;
    }*/


    // 5번
    /*public int solution(String str){

        char[] c = str.toCharArray();
        int[][] map = new int[str.length()+1][str.length()+1];
        int[] ret = new int[str.length()+1];

        int len = str.length();
        for(int i=1;i<len;i++){
            map[i][i] = 1;
        }
        for(int i=1;i<len;i++){
            if(c[i] == c[i-1])
                map[i][i+1] = 1;
        }

        for(int i=2;i<len;i++){
            for(int j=1;i+j <=len;j++){
                if(c[j-1] == c[j+i-1] && map[j+1][i+j-1] == 1)
                    map[j][i+j] = 1;
            }
        }

        for(int i=1;i<=len;i++){
            if((ret[i] != 0 && ret[i] > ret[i-1] + 1) || ret[i] == 0)
                ret[i] = ret[i-1]+1;

            for(int j=i+1;j<=len;j++){
                if(map[i][j] != 0){
                    if((ret[j] != 0 && ret[j] > ret[i-1] + 1) || ret[j] == 0)
                        ret[j] = ret[i-1] + 1;
                }
            }
        }

        return ret[len];
    }*/
}
