public int zapatos(int P, int[] cajas) {

    if (P == 1)
        return 0;	

    int cantCajas = 0;

    for (int i = 0; i < P; i++) //Complejidad O(P)	
        cantCajas += cajas[i]; 

    double doubleCc = (double) cantCajas;
    double doubleP = (double) P;

    int media = (int) Math.round(doubleCc / doubleP);

    int sobreMedia = 0, bajoMedia = 0;

    for (int i = 0; i < P; i++) { //Complejidad O(P)

        if (cajas[i] > media)
            sobreMedia += (cajas[i] - media); 

        if (cajas[i] < media)
            bajoMedia += (media - cajas[i]); 
    }

return bajoMedia <= sobreMedia ? bajoMedia : sobreMedia;
}
