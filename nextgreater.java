import java.util.Stack;

public class nextgreater {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer>s= new Stack<>();
        int[] nextgret=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            //1
            while(!s.isEmpty()&&arr[s.peek()]<=arr[i]){
                s.pop();

            }
            //2
            if(s.isEmpty()){
                nextgret[i]=-1;
            }
            else{
                nextgret[i]=arr[(s.peek())];
            }
            s.push(i);
        }
        //output
        for(int i=0;i<nextgret.length;i++){
            System.out.print(nextgret[i]+" ");

        }
        System.out.println();
    }
}
