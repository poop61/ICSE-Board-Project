import java.util.*;
class menu
{
    String [] name= {"Apple" , "Shirt" , "Shoes" , "Pen" , "Banana" , "Lamp" , "Eraser" , "Shorts" , "Juice" , "Spoon"};
    String [] category={"Food" , "Apparel" , "Apparel" , "Stationary" , "Food", "Home Decor" , "Stationary" , "Apparel" , "Food" , "Cutlery"};
    double [] price= {12.30, 400, 650, 20.90, 13.40, 1000, 2.45, 300, 250, 780.20};
    int [] quantity={87, 43, 32, 59, 12, 29, 11, 100, 121, 375};
    int [] min={12, 7, 15, 10, 11, 9, 30, 23, 16, 38};
    int [] max={157, 145, 100, 98, 56, 66, 110, 72, 90, 241};
    long [] code={65732, 82946, 72985, 63729, 90821, 94628, 74629, 61019, 89012, 19204};
    String [] name_emp= {"Paul Pogba" , "Marcus Rashford" , "Mason Greenwood" , "Anthony Martial" , "David De Gea" , "Brandon William" , "Victor Lindelof" , "Bruno Fernandes" , "Wan Bissaka" , "Harry Maguire" };
    int [] salary= {3000, 3700, 5460, 4620, 2900, 4000, 5840, 3730, 4900, 3400};
    int [] hours= {5,7,2,6,1,3,4,5,3,5};
    String [] rating={"Good", "Very good", "Excellent", "Good", "Bad" , "Average", "Average" , "Excellent" , "Very good" , "Very bad"};
    int choice, ch;
    Scanner sc=new Scanner(System.in);
    void display()
    {
        System.out.println("WELCOME TO THE INVENTORY!");
        System.out.println();
        System.out.println("WHAT FUNCTIONS WOULD YOU LIKE TO PERFORM?");
        System.out.println("1. Stock functions");
        System.out.println("2. Employee functions");
        System.out.print("Enter 1 or 2 to proceed: ");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1: stocks obj=new stocks();
                    obj.display();
                    obj.select(name, category, price, quantity, min, max, code);
                    break;
            case 2: employees emp=new employees();
                    emp.display();
                    emp.choice(name_emp, salary, hours, rating);
                    break;
            default: System.out.println("Please choose a valid option");
                     break;
        }
    }
    void cont()
    {
          System.out.println();
          while(ch!='N')
          {
              System.out.println("Do you want to perform another function?");
              System.out.print("Enter 'Y' for yes and 'N' for no ");
              ch=sc.next().charAt(0);
              System.out.println("\f");
              if(ch=='Y')
                 display();
              else
              {
                 System.out.println();
                 System.out.println("Have a good day!");     
              }
          }
    }
    public static void main(String args[])
    {
        System.out.println("\f");
        menu obj=new menu();
        obj.display();
        obj.cont();
    }
}