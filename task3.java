import java.util.Scanner;
public class task3 {
    int i; 
    int j;
   void astericks(int no){
    for(i=1;i<=no;i++){
        for(j=1;j<=i;j++){
            System.out.print("*");
         }
         System.out.println();
    }
    System.out.println("inverted one");
    for(i=no;i>0;i--){
        for(j=0;j<i;j++){
            System.out.print("*");

        }System.out.println();
    }
   }    
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("enter no of asterics");
    int no=scan.nextInt();
    task3 t1=new task3();
    t1.astericks(no);
    
   }
}