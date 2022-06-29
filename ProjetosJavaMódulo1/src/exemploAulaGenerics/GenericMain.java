package exemploAulaGenerics;

import java.util.ArrayList;
import java.util.List;

public class GenericMain {
    public static void main(String[] args) {
        MinhaClasseGenerica<Integer> obj1= new MinhaClasseGenerica(12354);
        MinhaClasseGenerica<String> obj2= new MinhaClasseGenerica("Texto");

        System.out.println(obj1.getObj());
        System.out.println(obj2.getObj());

        List<?> lista = new ArrayList(); // Caracter coringa (?), para receber uma lista de algo que você ainda não sabe o que é

//        HashMap<Integer, String> Recebe 2 generics <Tipo, Tipo>


    }
}
