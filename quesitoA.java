public class quesitoA {

    public static int uniao(int[] a, int tamA, int[] b, int tamB, int[] u) {
        int tamU = 0;

        for (int i = 0; i < tamA; i+=1) {
            if (!pertence(u, tamU, a[i])) {
                u[tamU] = a[i];
                tamU+=1;
            }
        }

        for (int i = 0; i < tamB; i+=1) {
            if (!pertence(u, tamU, b[i])) {
                u[tamU] = b[i];
                tamU+=1;
            }
        }

        return tamU;
    }

    public static boolean pertence(int[] v, int tam, int valor) {
        for (int i = 0; i < tam; i+=1) {
            if (v[i] == valor) {
                return true;
            }
        }

        return false;
    }
}

// tempo: 10 minutos
