// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        int res = sum(5);
//        System.out.print(res);
        pattern7(3);


    }
    public static void pattern7(int n){

        for(int i = 0;i<n;i++){
//            Space
            for(int j = 0;j<i;j++){
                System.out.print( "_ ");
            }

//            stars
            for(int k = 0; k<(2*n -(2*i  +1) ); k++){
                System.out.print("* ");
            }

//            Space
            for(int j = 0;j<i;j++){
                System.out.print( " ");
            }

            System.out.println();
        }
    }

    public static int sum(int n){

        int ans = 0;
//        for(int i =1;i<=n;i++){
//            ans += i;
//        }
        ans = n * (n+1) / 2;

        return ans;
    }
}