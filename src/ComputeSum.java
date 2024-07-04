import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {

       int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println(" Digite 10 números");
        System.out.println(" Informe 0 para sair");

        for (int i = 0; i < 10; i++) {

            int num = in.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }
        System.out.println("A soma dos números é " + sum);
        
        //Escreva 10 números e no final será somado
        //Digite 0 para encerrar, e os números digitados serão somados
}
}


