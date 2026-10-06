public class quesitoC {
    
    public static int gerarVetorSemRepeticao(int[] v, int tamV, int[] vsr) {
    int tamVSR = 0;

    for (int i = 0; i < tamV; i+=1) {
        if (!pertence(vsr, tamVSR, v[i])) {
            vsr[tamVSR] = v[i];
            tamVSR+=1;
        }
    }

    return tamVSR;
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

// tempo: 11 minutos
