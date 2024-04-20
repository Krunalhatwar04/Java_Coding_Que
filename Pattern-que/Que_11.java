public class Que_11 {
    public static void main(String[] args) {
        
    
    int row =6;
    
    for(int i=row;i>=1;i--){
        char x='A';
        for (int j = 1; j <= i; j++){
            System.out.print(x+" ");
        
        x++;
    }
      
        System.out.println();
       
    }
    for (int i = 2; i <= row; i++) {
        char x='A';
        for (int j = 1; j <= i; j++) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();
}
}
}