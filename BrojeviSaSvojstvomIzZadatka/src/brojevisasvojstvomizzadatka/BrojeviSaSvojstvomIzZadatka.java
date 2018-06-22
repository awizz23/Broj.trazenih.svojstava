package brojevisasvojstvomizzadatka;
import java.util.*;

public class BrojeviSaSvojstvomIzZadatka {

    
    public static void main(String[] args) {
        
        System.out.println("Program pronalazi i spisuje brojeve sa svojstvom iz zadatka.");
        Scanner tastature = new Scanner (System.in);
        System.out.print("Unesite broj do kojeg želite pretragu: ");
        
        int a = tastature.nextInt();
        
        for (int b=1;b<=a;b++)
        {
            if (b%2==1 && b%3==2 && b%4==3 && b%5==4 && b%6==5 && b%7==6 && b%8==7 && b%9==8 && b%10==9)
            {
                System.out.println(b+ "je broj traženih svojstava.");
            }
                }
        
    }
    
}
