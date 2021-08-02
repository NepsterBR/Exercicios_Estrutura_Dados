package mergeSort;

public class MergeSort {

    //Código idealizado de https://www.geeksforgeeks.org/merge-sort/

    public void juntar(int array[], int e, int m, int d) {

        //Encontrar os tamanhos das subs arrays para fundir elas
        int n1 = m - e + 1;
        int n2 = d - m;

        //criando duas arrays temporarias
        int E[] = new int[n1];
        int D[] = new int[n2];

        //copiar os dados par arrays temporarios
        for (int i = 0; i < n1; ++i) {
            E[i] = array[e + i];
        }
        for (int j = 0; j < n2; ++j) {
            D[j] = array[m + 1 + j];
        }

        int i = 0;
        int j = 0;

        //Indíce inicial da subarray mesclada
        int k = e;
        while (i < n1 && j < n2) {
            if (E[i] <= D[j]) {
                array[k] = E[i];
                i++;
            } else {
                array[k] = D[j];
                j++;
            }
            k++;
        }

        //copiar os elementos que sobraram no Array Esquerdo
        while (i < n1) {
            array[k] = E[i];
            i++;
            k++;
        }

        //copiar os elementos que sobraram do array da direita
        while (i < n2) {
            array[k] = D[i];
            j++;
            k++;
        }

    }

    public void organizar(int array[], int e, int d) {
        if (e < d) {
            // achar o meio do array
            int m = e + (d - e) / 2;

            //organizar a primeira e segunda metade
            organizar(array, e, m);
            organizar(array, m + 1, d);

            // juntar as metades do array
            juntar(array, e, m, d);
        }
    }

    public void printar() {
        int[] array = {23, 53, 934, 34, 1, 30, 84, 12, 3, 109};

        organizar(array,0,array.length -1);


        for (int i = 0; i< array.length; i++){
            System.out.println(array[i] + " ");
        }

    }
}
