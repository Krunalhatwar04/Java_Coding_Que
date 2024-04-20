public class Que_4 {
    public static void main(String[] args) {
        int row=5;
        for(int i=0;i<row;i++){
            for(int j=0;j<row-i-1;j++){
                System.out.print(" ");
            }
        
        // Calculate and print the numbers in the row
        int num=1;
        for(int j=0;j<=i;j++)
        {
            if (j==0||i==0)
                num=1;
            else
               num=num*(i-j+1)/j;
            System.out.print(" "+num);
        }
        System.out.print("\n");

    }
}
}