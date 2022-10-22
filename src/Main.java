import java.util.Random;

public class Main {
    public static void main(String [] args){

        Random gerar = new Random();
        Insertion in = new Insertion();

        Search ser = new Search();

        for(int i =0; i < 500; i++){
            in.add(gerar.nextInt(10000));
        }

        in.sort();
        in.printArray();
        long startTime = System.nanoTime();
        ser.binarySearch(30, in.vetor);
        long endTime = System.nanoTime();
        System.out.println("TEMPO DE EXECUÇÃO DO BINARY FOI DE ["+ (endTime - startTime)/ 1000+"] Milisegundos");

        long startTime2 = System.nanoTime();
        ser.seqSearch(30, in.vetor);
        long endTime2 = System.nanoTime();
        System.out.println("TEMPO DE EXECUÇÃO DO SEQUENCY FOI DE ["+ (endTime2 - startTime2)/ 1000+"] Milisegundos");


    }
}
