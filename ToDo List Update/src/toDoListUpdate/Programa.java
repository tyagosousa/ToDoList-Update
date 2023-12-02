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
			System.out.println("Informe uma opção para continuar: ");
			System.out.println("############################");
			System.out.println("1. Adicionar tarefa        #\n" +
			 "2. Marcar como concluída   #\n" +
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
				System.out.print("Informe a posição da tarefa concluída: ");
				check = number.nextInt();
				if(check-1 >= 0 && check <= lista.size()) {
					System.out.println("************A tarefa foi concluída, parabéns!************");
					lista.remove(check-1);
				}else {
					System.out.println("************A tarefa não foi encontrada************");
				}
				}else {
				System.out.println("************Não há tarefas aqui!************");
				}
				break;
				
			case 3:
				if(lista.size()>0) {
				System.out.print("Informe a posição da tarefa que deseja excluir: ");
				delete = number.nextInt();
				if(delete-1 >= 0 && delete <= lista.size()) {
					lista.remove(delete-1);
					System.out.println("************A tarefa foi excluida************");
				}else {
					System.out.println("************A tarefa não foi encontrada************");
				}
				}else {
					System.out.println("Não há tarefas aqui");
				}
				break;
				
			case 4:
				if(lista.size()>0) {
				for(int i = 0; i<lista.size(); i++){
					System.out.println(((i+1) + "-> " +lista.get(i).toString()));
					}
				}else {
					System.out.println("************Não há tarefas aqui!************");
				}
				break;
				
			case 0:
				System.out.println("************Encerrando aplicação, obrigado!************");
				break;
				
			default:
				System.out.println("************Opção inválida, tente de novo!************");
				break;
			}
	
		}while(opcao != 0);
	
	}

}
