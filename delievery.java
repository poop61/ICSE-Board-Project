import java.util.*;
class delievery
{
    char ch;
    int num;
    double total_price;
    Scanner sc=new Scanner(System.in);
    void input(String name[], long code[], double price[], int quan[])
    {
        String item="", p_name="";
        long code_item=0, code_p=0;
        System.out.println("Would you like to sell an item by the name or code?");
        System.out.println("Enter 'N' for name and 'C' for code");
        ch=sc.next().charAt(0);
        int j,k;
        int quan_p=0;
        if(ch=='N')
        {
           System.out.print("Enter the name of the item:");
           item=sc.next();
           System.out.print("Enter the quantity:");
           num=sc.nextInt();
           for(j=0; j<name.length; j++)
           {
               if(name[j].equalsIgnoreCase(item))
               {
                   if(quan[j]<num)
                     System.out.println("Quantity exceeds the number of items in stock");
                   else
                   {
                     quan[j]=quan[j]-num;
                     quan_p=quan[j];
                     total_price=price[j]*num;
                     code_p=code[j];
                   }
               }  
               
            }
            System.out.println("Code of the item:" +code_p);
            System.out.println("Total price: "+total_price);
            System.out.println("Items left in stock: " +quan_p);
        }
        else
        {
            System.out.print("Enter the code of the item:");
            code_item=sc.nextLong();
            System.out.print("Enter the quantity:");
            num=sc.nextInt();
            for(k=0; k<code.length; k++)
            {
                if(name[k].equalsIgnoreCase(item))
                {
                    if(quan[k]<num)
                     System.out.println("Quantity exceeds the number of items in stock");
                   else
                   {
                    quan[k]=quan[k]-num;
                    quan_p=quan[k];
                    total_price=price[k]*num;
                    p_name=name[k];
                }
            }
                
            }  
            System.out.println("Name of the item:" +p_name);
            System.out.println("Total price: "+total_price);
            System.out.println("Items left in stock: " +quan_p);
        }
    }
}