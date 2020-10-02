import java.util.*;
class replace_word
{
    Scanner sc=new Scanner(System.in);
    String str, find_word, replace;
    void input()
    {
        sc.useDelimiter("\n");
        System.out.print("Enter a string: ");
        str=sc.next();
        System.out.print("Enter the word you want to replace: ");
        find_word=sc.next();
        System.out.print("Enter the word you want to replace it with: ");
        replace=sc.next();
        str=str+" ";
    }
    void change()
    {
        int pos=0;
        String new_String="";
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)==' ')
            {
               String word=str.substring(pos,i);
               pos=i+1;
               if(word.equalsIgnoreCase(find_word))
                   new_String =new_String+" "+replace;
            
               else 
                  new_String= new_String +" "+word; 
            }
        }
        System.out.println(new_String); 
       }
    public static void main(String args[])
    {
        System.out.println("\f");
        replace_word obj= new replace_word();
        obj.input();
        obj.change();
    }
}