public class Singleton {
    private static  Singleton instance;
    private Singleton(){}
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
            System.out.println("Creating new instance");
        }
        return instance;
    }
    public void Showmessage(){
        System.out.println("Created Object");
    }
}
