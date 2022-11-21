package Diogof;
/*singleton test */
public class Teste {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager Eager = SingletonEager.getinstance();
        System.out.println(Eager);
        Eager = SingletonEager.getinstance();
        System.out.println(Eager);

        System.out.println(Eager);
        System.out.println(Eager);
    }
}
