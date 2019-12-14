
import java.util.*;

public class Largest_Number 
{
    public static String largestnum(List<String> li)
    {
       Collections.sort(li,new Comparator<String>()
       {
           public int compare(String a,String b)
           {
               String ab=a+b;
               String ba=b+a;
               return (ab.compareTo(ba) > 0)? -1:1;
           }
       });
       String num="";
       for(int i=0;i<li.size();i++)
       {
           num+=li.get(i);
           
       }
       return num;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int n=sc.nextInt();
        
        List<String> li=new ArrayList<String>();
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++)
        {
            li.add(Integer.toString(sc.nextInt()));
        }
        System.out.println("The largest number is: "+largestnum(li));
        
        
    }
    
}
