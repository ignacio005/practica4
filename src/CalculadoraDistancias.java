import java.util.Arrays;

/**
 * La clase CalculadoraDistancias se encarga de gestionar
 */
public class CalculadoraDistancias {
    /**
     * Este método permite calcular la distancia de edición.
     * @param s1 contiene la palabra1.
     * @param s2 contiene la palabra2.
     * @return devuelve un int con la distancia de edición.
     */
    public static int calcularDistancia(String s1, String s2) {
        int[][] matriz = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0) {
                    matriz[i][j] = j;
                } else if (j == 0) {
                    matriz[i][j] = i;
                } else {
                    int costeSustitucion = s1.charAt(i - 1) == s2.charAt(j - 1) ? 0 : 2;
                    matriz[i][j] = min(matriz[i - 1][j - 1] + costeSustitucion,
                            matriz[i - 1][j] + 1,
                            matriz[i][j - 1] + 1);
                }
            }
        }
        return matriz[s1.length()][s2.length()];
    }

    /**
     * Este método permite saber cual es el minimo coste para formar la palabra.
     * @param numeros contiene el array de sustitución, eliminación e inserción.
     * @return devuelve un int con el mínimo coste para formar la palabra.
     */
    public static int min(int... numeros) {
        return Arrays.stream(numeros).min().getAsInt();
    }
}
