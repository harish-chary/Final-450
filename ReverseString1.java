import java.util.*;
public class ReverseString1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int index = 0;
        String str = sc.nextLine();
        //char arr[] = new char[str.length()];
        ArrayList<Character> arr = new ArrayList<>();
        for(int i=0;i<str.length();i++)
            if(str.charAt(i)!=' ')
            {arr.add(str.charAt(i));}
        System.out.println("ArrayList : "+(reverseStringArrayList(arr)).toString());
        System.out.println("Stack : "+(reverseStringStack(arr)).toString());
        System.out.println("Recursion : "+(reverseStringRecursion(arr).toString()));
        Collections.reverse(arr);
        System.out.println("Collections : "+(arr));
    }
    public static ArrayList<Character> reverseStringRecursion(ArrayList<Character> arr)
    {
        int start=0, end = arr.size()-1;
        return recursion(arr,start,end);
    }
    public static ArrayList<Character> recursion(ArrayList<Character> arr,int start,int end)
    {
        if(start>=end)
            return arr;
        if(start<end)
        {
            char temp1 = arr.get(start), temp2=arr.get(end);
            System.out.println("Temp1 : "+temp1+" temp2 : "+temp2);
            arr.remove(start);
            arr.remove(end-1);
            arr.add(start,temp2);
            arr.add(end,temp1);
        //Collections.swap(arr,start,end);
        System.out.println("Hi : "+start+"  - "+end);
        recursion(arr,start+1,end-1);
        System.out.println("Bye : "+start+"  - "+end);}
        return arr;
    }
    public static ArrayList<Character> reverseStringArrayList(ArrayList<Character> arr)
    {
        int lindex = arr.size()-1;
        for(int i=0;i<arr.size()/2;i++)
        {
//            temp = arr[i];
//            arr[i] = arr[lindex-i];
//            arr[lindex-i] = temp;
            Collections.swap(arr,i,lindex-i);
        }
        return arr;
    }
    public static ArrayList<Character> reverseStringStack(ArrayList<Character> arr)
    {
        Stack<Character> st = new Stack<>();
        int size= arr.size();
        for(int i=size-1;i>-1;i--)
            st.push(arr.get(i));
        arr.clear();
        for(int i=0;i<size;i++)
            arr.add(st.pop());
        return arr;
    }
}
