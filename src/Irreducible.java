import java.util.Scanner;

// 기약 분수(GCD를 이용한) 소스
public class Irreducible {

    public static void main(String[] args){
        Irreducible gcd = new Irreducible();
        Scanner san = new Scanner(System.in);
        int Solutions, testCase, maxNum;

        System.out.println("총 테스트 개수 : ");
        int n = san.nextInt();

        for(int i =0;i<n;i++){
            Solutions = 0;

            System.out.println("기약 분수의 최댓값 : ");
            maxNum = san.nextInt();

            for(int j =1;j<=maxNum;j++){
                for(int k=2;k<=maxNum;k++){

                    if(j < k && gcd.gcd(j,k) == 1){
                        System.out.println("찾은 기약 분수 : " + j + "/" + k);
                        Solutions++;
                    }
                }

            }

            System.out.println("찾은 기약 분수 : 1/" + maxNum);
            System.out.println("찾은 기약 분수의 총 개수 : " + (Solutions + 1));
        }

    }

    public int gcd(int a, int b){

        if(b==0)
            return a;

        return gcd(b, a%b);
    }
}
