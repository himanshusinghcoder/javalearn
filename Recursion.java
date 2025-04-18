public class Recursion {
    public static void main(String[] arg){
        int x = sum(5,10);
        System.out.println(x);
    }

    static int sum(int start, int end){
        if(start < end){
            return start + sum(start + 1, end);
        }else{
            return start;
        }
    }
}
