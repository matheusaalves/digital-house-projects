package praticaIntegradora1;

public class ProjetoIntegrador {
    public static void main(String[] args) {
        String[] cities = {
                "Londres", "Madrid", "Nueva York",
                "Buenos Aires", "Asunción", "São Paulo", "Lima",
                "Santiago de Chile", "Lisboa", "Tokio"
        };

        int temps[][] = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 26},
                {-1, 31},
                {-10, 35},
        };

        int minTempIndex = -1, maxTempIndex = -1, minTemp = 999, maxTemp = -999;

        for (int i = 0; i < cities.length; i++) {
            if (temps[i][0] < minTemp) {
                minTempIndex = i;
                minTemp = temps[i][0];
            }
            if (temps[i][1] > maxTemp) {
                maxTempIndex = i;
                maxTemp = temps[i][1];
            }
        }

        System.out.println("Temperatura máxima: " + maxTemp + "° (" + cities[maxTempIndex] + ")");
        System.out.println("Temperatura mínima: " + minTemp + "° (" + cities[minTempIndex] + ")");
    }
}
