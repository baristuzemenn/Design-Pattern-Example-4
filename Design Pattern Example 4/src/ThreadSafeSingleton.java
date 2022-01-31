public class ThreadSafeSingleton
{
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.addCoins(3);
        object.decrease(2);
    }
}


class SingleObject3 {
    private int coins;
    private static SingleObject3 instance;
    private SingleObject3(int c){
        coins=c;
    }
    public static synchronized SingleObject3 getInstance(){
        if(instance == null){
            instance = new SingleObject3(3);
        }
        return instance;
    }
    public void addCoins(int c){
        coins=coins+c;
        System.out.println("The number of coins is "+coins);
    }
    public void decrease(int c){
        coins=coins-c;
        System.out.println("The number of coins is "+coins);
    }
}