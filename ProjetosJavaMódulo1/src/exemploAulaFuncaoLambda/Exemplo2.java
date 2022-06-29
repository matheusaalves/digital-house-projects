package exemploAulaFuncaoLambda;

public class Exemplo2 {

    interface InterfaceString {
        String executar(String str);
    }

    public static void imprimir(String texto, InterfaceString inter) {
        String resultado = inter.executar(texto);
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        InterfaceString mudar = n -> "String executada: " + n;
        String exemplo = "Testezão da massa";
        imprimir(exemplo, mudar);
    }
}
