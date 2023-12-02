package toDoListUpdate;
import java.util.Scanner;
import java.util.ArrayList;

public class Programa {
	

	public static void main(String[] args) {
		
		Scanner text = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		Tarefas tarefas;
		ArrayList<Tarefas> lista = new ArrayList<Tarefas>();
		int opcao, check, delete;
		
		do {
			System.out.println("Informe uma op��o para continuar: ");
			System.out.println("############################");
			System.out.println("1. Adicionar tarefa        #\n" +
			 "2. Marcar como conclu�da   #\n" +
			 "3. Excluir tarefa          #\n" + 
			 "4. Exibir lista de tarefas #\n" + 
			 "0. Encerrar programa       #");
			System.out.println("############################");
			opcao = number.nextInt();
			
			switch(opcao) {
			
			case 1:
				tarefas = new Tarefas();
				System.out.print("Informe a atividade: ");
				tarefas.setDescricao(text.nextLine());
				lista.add(tarefas);
				System.out.println("************Tarefa cadastrada************");
				break;
				
			case 2:
				if(lista.size()>0) {
				System.out.print("Informe a posi��o da tarefa conclu�da: ");
				check = number.nextInt();
				if(check-1 >= 0 && check <= lista.size()) {
					System.out.println("************A tarefa foi conclu�da, parab�ns!************");
					lista.remove(check-1);
				}else {
					System.out.println("************A tarefa n�o foi encontrada************");
				}
				}else {
				System.out.println("************N�o h� tarefas aqui!************");
				}
				break;
				
			case 3:
				if(lista.size()>0) {
				System.out.print("Informe a posi��o da tarefa que deseja excluir: ");
				delete = number.nextInt();
				if(delete-1 >= 0 && delete <= lista.size()) {
					lista.remove(delete-1);
					System.out.println("************A tarefa foi excluida************");
				}else {
					System.out.println("************A tarefa n�o foi encontrada************");
				}
				}else {
					System.out.println("N�o h� tarefas aqui");
				}
				break;
				
			case 4:
				if(lista.size()>0) {
				for(int i = 0; i<lista.size(); i++){
					System.out.println(((i+1) + "-> " +lista.get(i).toString()));
					}
				}else {
					System.out.println("************N�o h� tarefas aqui!************");
				}
				break;
				
			case 0:
				System.out.println("************Encerrando aplica��o, obrigado!************");
				break;
				
			default:
				System.out.println("************Op��o inv�lida, tente de novo!************");
				break;
			}
	
		}while(opcao != 0);
	
	}

}
