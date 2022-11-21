package Diogof;
/*the eager singleton */
public class SingletonEager {
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){
        super();
    }
    public static SingletonEager getinstance(){
        return instance;
    }
}
