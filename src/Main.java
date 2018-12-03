
public class Main {

    public static void main(String[] args) {

        Singleton instanceOne = Singleton.getInstance();
        Singleton instanceTwo = null;

        System.out.println(instanceOne.hashCode());
        try {
            System.out.println(instanceTwo.hashCode());
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
