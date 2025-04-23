package JavaClasses;

public class Constructor {
    String name;
    int age;
    String country;
    public Constructor(String personName, int personAge, String personCountry){ //  these contructor don't have return type
        name = personName;
        age = personAge;
        country = personCountry;
    }
    
    public static void main(String[] arg){
        Constructor obj = new Constructor("Himanshu Singh", 27, "India");
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.country);
    }
}
