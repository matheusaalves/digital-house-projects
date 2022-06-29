package exemploAulaWrapper;

public class exemploAulaWrapper {
    public static void main(String[] args) {
        Integer n1 = 100;
        Integer n2 = 100; // É inicializado como o mesmo objeto do n1 por conta de otimiziação

        System.out.println(n1 == n2);

        n2 = 90; // Cria um objeto
        System.out.println(n1 == n2);

        System.out.println(n1.equals(n2)); // Jeito correto de comparar os valores
    }
}
