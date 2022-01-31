public class LazyInitialization
{
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();
        object.addCoins(3);
        object.decrease(2);
    }
}


class SingleObject2 {
    private int coins;
    private static SingleObject2 instance;
    private SingleObject2(int c){
        coins=c;
    }
    public static SingleObject2 getInstance(){
        if(instance == null){
            instance = new SingleObject2(3);
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