import java.util.*;
class list
{
    void sort(String name[] , int salary[] , int hours[] , String rating [])
    {
        String temp1="", temp4="";
        int temp2=0, temp3=0;
        for(int i=0; i<name.length; i++)
        {
            for(int j=0; j<name.length-i-1; j++)
            {
                if(name[j].compareTo(name[j+1])>0)
                {
                    temp1=name[j];
                    name[j]=name[j+1];
                    name[j+1]=temp1;
                    
                    temp2=salary[j];
                    salary[j]=salary[j+1];
                    salary[j+1]=temp2;
                    
                    temp2=salary[j];
                    salary[j]=salary[j+1];
                    salary[j+1]=temp2;
                    
                    temp3=hours[j];
                    hours[j]=hours[j+1];
                    hours[j+1]=temp3;
                    
                    temp4=rating[j];
                    rating[j]=rating[j+1];
                    rating[j+1]=temp4;
                }
            }
        }
        System.out.println("NAME"+"\t"+"\t"+"\t"+"SALARY"+"\t"+"\t"+"WORKING HOURS"+"\t"+"\t"+"CUSTOMER RATING");
        for(int k=0; k<name.length; k++)
        {
            System.out.println(name[k]+"\t"+"\t"+salary[k]+"\t"+"\t"+hours[k]+"\t"+"\t"+"\t"+rating[k]);
        }
    }
}
            