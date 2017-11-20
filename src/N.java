public class N {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Integer num, i;
        double f = 1;

        System.out.println("請輸入計算幾階層") ;
        num=sc.nextInt() ;

        if (num>=0){
            for (i=1;i<=num;i++){
                f=f*i;
            }
            System.out.println(num+"!="+f);
        }
        else{

            if(num<0){
                System.out.println(num+"!,無定義") ;
            }
        }
    }
}