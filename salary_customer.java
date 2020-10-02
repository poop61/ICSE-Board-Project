import java.util.*;
class salary_customer
{
    Scanner sc=new Scanner(System.in);
    int [] bonus=new int[10];
    String e_name;
    int e_hours, num;
    String ch;
    void input(String name[], int hours[], int salary[])
    {
        System.out.println();
        System.out.println("Did any employee work for extra hours?");
        System.out.println("Enter yes or no");
        ch=sc.next();
        if(ch.equalsIgnoreCase("no"))
           calc(salary,  name,  hours);
        else
        {
           System.out.print("How many employees worked for extra hours?");
           num=sc.nextInt();
           System.out.println("Enter the details of the employee who worked for extra hours");
           for(int j=0; j<num; j++)
           {
           sc.useDelimiter("\n");
           System.out.print("Name of the employee: ");
           e_name=sc.next();
           System.out.print("No of extra hours: ");
           e_hours=sc.nextInt();
           for(int i=0; i<name.length; i++)
           {
               if(name[i].equalsIgnoreCase(e_name))
                  hours[i]=hours[i]+e_hours;
           }
        }
          calc(salary,  name,  hours);
    }
}
    void calc(int salary[] , String name[], int hours[])
    {
         for(int i=0; i<salary.length; i++)
         {
             if(hours[i]<2)
                 bonus[i]=0; 
               else if(hours[i]==3)
                  bonus[i]=500;
                else if(hours[i]==4)
                    bonus[i]=700;
                else if(hours[i]==5)         
                    bonus[i]=900;
                else if(hours[i]>=6)
                    bonus[i]=1200;  
             salary[i]=salary[i]+bonus[i];
         }
         System.out.println("NAME"+"\t"+"\t"+"\t"+"SALARY"+"\t"+"\t"+"WORKING HOURS"+"\t"+"\t"+"BONUS");
        for(int k=0; k<name.length; k++)
        {
            System.out.println(name[k]+"\t"+"\t"+salary[k]+"\t"+"\t"+hours[k]+"\t"+"\t"+"\t"+bonus[k]);
        }
    }
    void customer(String name[], String rating[])
    {
        
        System.out.println("Following is your customer performance:");
        System.out.println();
        System.out.println("NAME"+"\t"+"\t"+"CUSTOMER RATING");
        System.out.println();
        for(int i=0; i<name.length; i++)
            System.out.println(name[i]+"\t"+"\t"+rating[i]);
        System.out.println();
        System.out.println("Employees that need to improve:");
        for(int j=0; j<name.length; j++)
        {
            if(rating[j].equalsIgnoreCase("Very Bad") || (rating[j].equalsIgnoreCase("Bad")))
               System.out.println(name[j]);
        }
    }
    void employee_of_month(String name[], int hours[], String rating[])
    {
        String ch="", e_name="";
        int n=0, h=0;
        System.out.println();
        System.out.println("Did any employee work for extra hours? ");
        System.out.print("Enter yes or no: ");
        ch=sc.next();
        if(ch.equalsIgnoreCase("yes"))
        {
           System.out.print("How many employees worked for extra hours? "); 
           n=sc.nextInt();
           for(int i=0; i<n; i++)
           {
               sc.useDelimiter("\n");
               System.out.print("Full name of the employee who worked for extra hours");
               e_name=sc.next();
               System.out.print("No of extra hours: ");
               h=sc.nextInt();
               for(int j=0; j<name.length; j++)
               {
                   if(name[j].equalsIgnoreCase(e_name))
                      hours[j]=hours[j]+h;
               }
            }
        }
        int max=0;
        String n_max="";
        for(int i=0; i<name.length; i++)
        {
            if(rating[i].equalsIgnoreCase("Excellent")||(rating[i].equalsIgnoreCase("Very Good"))||(rating[i].equalsIgnoreCase("Good")))
            {
              if(hours[i]>max)
              {
                 max=hours[i];
                 n_max=name[i]; 
              }
            }
        }
        System.out.println();
        System.out.println("CONGRATULATIONS!");
        System.out.println();
        System.out.println(n_max+" is "+"the employee of the month");   
        System.out.println("Thank you for your outstanding performance");
        }
    }
           
