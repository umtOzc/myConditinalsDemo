import java.util.Scanner; 

public class myConditinalsDemo
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int sayi = obj.nextInt();
        
        if (sayi<20){
            System.out.println("number equal to 20");
        }
        
        else if (sayi==20){
            System.out.println("Number equal to 20");
        }
    
        else {   
            System.out.println("Number greater than 20");           
        }
    }

}
