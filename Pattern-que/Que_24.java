public class Que_24 {
    public static void main(String[] args) {
        int row=5;
        int num=1;
        for(int i=1;i<=row;i++){
            int nextNum = num;
            for(int j=1;j<=i;j++){
                System.out.print(nextNum+" ");
                nextNum+=row-j;
            }
            
            System.out.println();
            num++;
        }
    }
}
