/**
 * Classe main
 * @author vyamane
 *@since 18/02/2020
 *@version 0.1
 */

import controller.AlunoController;
import view.AlunoView;
//import controller.ProfessorController;

public class Main {
	public static void main(String[] args) {
//		ProfessorController pc1 = new ProfessorController();
//		pc1.testaProfessor();
		AlunoController aluno = new AlunoController();
//		aluno.inserirAluno();
//		aluno.listarTodos();
		//aluno.listaAniversariantes(9);
		new AlunoView();
	}

}
