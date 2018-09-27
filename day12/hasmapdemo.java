import java.util.*;
import java.io.*;
class Hashmapdemo
{
 //creating hashset
 public static void main(String args[])
 {
  HashMap hs = new HashMap();
  hs.put("MSD",new Double(2218.40));
  hs.put("SSA",new Double(8218.40));
  hs.put("MSS",new Double(4118.40));
  hs.put("MsR",new Double(3218.40));
  hs.put("SRR",new Double(4218.40));
  Set set = hs.entrySet();
  Iterator i=set.iterator();
  while(i.hasNext())
  {
   Map.Entry me=(Map.Entry)i.next();
   System.out.println(me.getValue()+":");
   System.out.println(me.getKey()+":");
  }
 }
} 