package Strings;

public class SumOfNumberInString {
    public static void main(String[] args) {
        String str = "1abc23";
        System.out.println(findSum(str));

    }
    public static long findSum(String s)
    {
        long sum = 0;
        String str = "";
        s = s + " ";
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) 
            str += ch;
            else if(str.length() > 0)
            {sum += Integer.parseInt(str);
             str = "";}
        }
        return sum;
    }
}
