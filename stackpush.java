import java.util.*;

public class stackpush {
    public static void pushAtBottom(Stack<Integer>s,int x){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
int top= s.pop();
pushAtBottom(s, x);
s.push(top);
    }
    public static String reverseString(String str){
        Stack<Character>s= new Stack<>();
        int index=0;
        while(index<str.length()){
            s.push(str.charAt(index));
            index++;
        }
        StringBuilder result= new StringBuilder();
        while(!s.isEmpty()){
            char curr= s.pop();
            result.append(curr);
         
        }
        return result.toString();
    }
    public static void reverseString(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top= s.pop();
        reverseString(s);
        pushAtBottom(s, 4);
    }
    public static void  printfunc(Stack<Integer>s){
while (!s.isEmpty()) {
    System.out.println(s.pop());
    
}
    }
    public static void main(String[] args) {
      Stack<Integer>s=new Stack<>();
      s.push(1);
      s.push(5);
      s.push(8);
     reverseString(s);
     printfunc(s);
    }}

