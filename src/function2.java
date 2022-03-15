public class function2 {
    public static void main(String[] args) {

        HelloWorld("Kevin");
        fungsiDua("dari input");
        System.out.println(test());
    }

    //fungsi1
    public static void HelloWorld(String nama){
        System.out.println("Halo kaka " + nama);
    }

    //fungsi2
    public static void fungsiDua(String input){
        System.out.println(input);
    }

    //fungsi3
    public static float test(){
        return 10.5f;
    }
}
