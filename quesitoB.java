public class quesitoB {
    public static void ordenar(int[] v, int n) {
    for (int i = 1; i < n; i+=1) {
        int chave = v[i];
        int j = i - 1;

        while (j >= 0 && v[j] > chave) {
            v[j + 1] = v[j];
            j-=1;
        }

        v[j + 1] = chave;
    }
}
}

// tempo: 5 minutos
