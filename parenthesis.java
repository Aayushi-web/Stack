import java.util.Stack;

public class parenthesis {
      public static  boolean isValid(String[] str){
        Stack<Character>s= new Stack<>();
        for(int i=0;i<str.length;i++){
            char ch= (char) str.length;
            //opening
            if(ch=='('||ch=='{'||ch=='['){
s.push(ch);
            }
            //closing
            else{
                if(s.isEmpty()){ //case-1
                    return false;
                }
              if(s.peek()=='('&&ch==')'//case-2
              || s.peek()=='{'&& ch=='}'
              || s.peek()=='['&&ch==']'
              ){
             s.pop();}
             else return false;
            }
        }
        if(s.isEmpty()){
            return true;
        }else {
            return false;
        }
      }
    
    public static void main(String[] args) {
        String str[]={"({[]}]"};
    System.out.println(isValid(str));
    }
}
