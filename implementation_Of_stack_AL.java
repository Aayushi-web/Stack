import java.util.ArrayList;
import java.util.List;

public class implementation_Of_stack_AL{
     static class stck{
      static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
return (list.size()==0);
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            if (isEmpty()){
                return -1;
            }
          int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;

        }
        //peek
        public static int  peek(){
            if(isEmpty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            return top;
        }
    }
    public static void main(String[] args) {
       stck stack= new stck();
       stack.push(1);
       stack.push(2);
       stack.push(5);
       stack.push(4);
       while(!stack.isEmpty()){
        System.out.print(stack.peek()+" ");
        stack.pop();

       }
    }
}