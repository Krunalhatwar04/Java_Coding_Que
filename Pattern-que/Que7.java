public class Que7 {
    public static void main(String[] args) {
        int row=5;
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                System.out.print((i+j)%2+" ");
            }
            System.out.println();
        }
    }
}
