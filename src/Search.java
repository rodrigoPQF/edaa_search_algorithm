public class Search {


    public Search(){

    }

    public void binarySearch(int x, int[] arr){
        int inicio = 0;
        int meio = 0;
        int fim = arr.length - 1;

        while (inicio <= fim){
            meio = (fim + inicio) / 2;
            System.out.println("Inicio: "+ arr[inicio] + " - Meio: " + arr[meio] + " - ");
            System.out.println("Inicio: "+ inicio + " - Meio: " + meio + " - Fim: " + fim);

            if(arr[meio] == x){
                System.out.println("Encontrou o número "+ x);
                break;
            }

            if(arr[meio] < x){
                inicio = meio + 1;

            }else {
                fim = meio - 1;
            }

            if(inicio > fim){
                System.out.println("Não encontrou o numero "+ x);
            }
        }

    }

    public void seqSearch(int x, int[] arr){
        int cont = 0;

        for(cont = 0; cont < arr.length; cont++){
            if (arr[cont] == x){
                System.out.println("Encontrou o número "+ x);
                break;
            }
        }
        if(cont >= arr.length){
            System.out.println("Nao encontrou o numero" + x);
        }
    }
}
