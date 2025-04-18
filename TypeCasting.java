public class TypeCasting {
    public static void main(String[] arg){
        // widening casting
        System.out.println("2" + 2);
        // narrowing casting
        int num = (int)9.9d;
        System.out.println(num + 2);

        // example 
        int maxScore = 500;
        int userScore = 436;

        float percentage = (float)maxScore/userScore * 100.0f;
        System.out.println(percentage);
    }    
}
