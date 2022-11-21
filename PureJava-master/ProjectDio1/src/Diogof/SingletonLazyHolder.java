package Diogof;

public class SingletonLazyHolder {
    private static class InstaceHolder{
        public static SingletonLazyHolder instace = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }
    public static SingletonLazyHolder getinstance(){
        return InstaceHolder.instace;
    }
}
