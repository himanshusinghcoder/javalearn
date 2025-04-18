public class IfElse {
    public static void main(String[] arg){
        // if 
        if (2 > 3) {
            System.out.println("it is true");
        } else if(3 > 2){
            System.out.println("3 is greater then 2");
        }else{
            System.out.println("it is false");
        }
        // short hand
        String result = (2 > 3) ? "2 is greater then 3" : "3 is greater than 2";
        System.out.println(result);
    }    
}
