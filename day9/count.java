import java.util.Scanner;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence: ");
        String st=sc.nextLine();
        int count=1;
        for(int i=0;i<=st.length()-1;i++)
        {
            if(st.charAt(i)==' '&&st.charAt(i+1)!=' ')
            {
                ++count;
            }
        }
        System.out.println("words in the sentence: "+count);
    }
}