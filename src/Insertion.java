public class Insertion {

    int[] vetor = new int[500];
    int i;

    public Insertion(){

    }

    public void add(int n){
        vetor[i] = n;
        i++;
    }

    public void sort(){
        int n = vetor.length;
        for (int i = 1; i< n; ++i){
            int key = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > key){
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = key;
        }
    }
    public void printArray(){
        int n = vetor.length;
        for (int i = 0; i < n; ++i)
            System.out.print(vetor[i] + " ");

        System.out.println();
    }



}
