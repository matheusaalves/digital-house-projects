package exemploAulaFuncaoLambda;

import java.util.Arrays;
import java.util.List;

public class ExemploAula {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        numeros.forEach( n -> System.out.println(n) ); // Função lambda ou arrow function

        numeros.forEach( n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });

//        for (Integer n : numeros) {
//            System.out.println(n);
//        }


    }

//    public boolean par(int n) {
//        return n % 2 == 0;
//    }
//
//    n -> n % 2 == 0;

}
