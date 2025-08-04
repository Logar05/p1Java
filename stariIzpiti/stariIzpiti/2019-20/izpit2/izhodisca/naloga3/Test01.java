
public class Test01 {

    public static void main(String[] args) {
        Tretja.Ukaz[] ukazi1 = {
            new Tretja.Postavi(3), 
            new Tretja.Odvzemi(4),
            new Tretja.Postavi(0),
            new Tretja.Odvzemi(1),
            new Tretja.Postavi(1),
            new Tretja.Postavi(2),
            new Tretja.Postavi(1),
            new Tretja.Postavi(0),
            new Tretja.Postavi(2),
            new Tretja.Odvzemi(2)
        };
        System.out.println(Tretja.Ukaz.bilanca(ukazi1));

        Tretja.Ukaz[] ukazi2 = {
            new Tretja.Odvzemi(3), 
            new Tretja.Postavi(4),
            new Tretja.Odvzemi(0),
            new Tretja.Postavi(1),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(2),
            new Tretja.Odvzemi(1),
            new Tretja.Odvzemi(0),
            new Tretja.Odvzemi(2),
            new Tretja.Postavi(2)
        };
        System.out.println(Tretja.Ukaz.bilanca(ukazi2));
    }
}
