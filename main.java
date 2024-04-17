import java.util.Scanner;
public class main {
public static void main(String[] args) {
    //Criando um objeto Scanner para lar entrada do teclado
    Scanner scanner = new Scanner(System.in);
int excelenteCount = 0;
int ruimCount = 0;
for (int i = 1; i <= 50; i++) {
    // utilizando Scanner como visto nas agendas anteriores.
    System.out.println("entrevistado #" + i);
    System.out.print("Digite o seu nome");
String name= scanner.nextLine();
System.out.println("Olá," + name + ", bem-vindo!");

System.out.print("Digite a sua idade");
int idade= scanner.nextInt();
System.out.println("Sua idade é:" + idade);

System.out.print("Digite a sua opinião (1-EXCELENTE, 2-BOM, 3-RUIM): ");
int opiniao= scanner.nextInt();
System.out.println("Sua nota avaliativa é:" + opiniao + ", Obrigado por me avaliar!");

if (opiniao == 1) {
    excelenteCount++;
} //Fim do if
else if (opiniao == 3) {
   ruimCount++; 
} //Fim do else if
} 
System.out.println("\nResultado da Pesquisa:");
System.out.println("Quantidade de respostas EXCELENTE" + excelenteCount);
System.out.println("Quantidade de respostas RUINS" + ruimCount); 
//Fim do scanner
scanner.close();
} //Fim do main
} //Fim da class