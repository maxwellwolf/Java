package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String args[]) {

		Aluno aluno1 = new Aluno(); /* João */
		Aluno aluno2 = new Aluno(); // Pedro

		aluno1.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
		aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno: ")));
		aluno1.setDataNasc(JOptionPane.showInputDialog("Digite a data de nascimento do aluno: "));
		aluno1.setNomeMae(JOptionPane.showInputDialog("Digite o nome da mãe do aluno: "));

		/*Disciplina disciplina1 = new Disciplina();
		Disciplina disciplina2 = new Disciplina();
		Disciplina disciplina3 = new Disciplina();
		Disciplina disciplina4 = new Disciplina();
		
		disciplina1.setDisciplina(JOptionPane.showInputDialog("Digite o nome da primeira disciplina: "));
		disciplina1.setNota(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da disciplina "+disciplina1.getDisciplina())));
		disciplina2.setDisciplina(JOptionPane.showInputDialog("Digite o nome da segunda disciplina: "));
		disciplina2.setNota(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da disciplina "+disciplina2.getDisciplina())));
		disciplina3.setDisciplina(JOptionPane.showInputDialog("Digite o nome da terceira disciplina: "));
		disciplina3.setNota(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da disciplina "+disciplina3.getDisciplina())));
		disciplina4.setDisciplina(JOptionPane.showInputDialog("Digite o nome da quarta disciplina: "));
		disciplina4.setNota(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da disciplina "+disciplina4.getDisciplina())));
		
		aluno1.getDisciplina().add(disciplina1);
		aluno1.getDisciplina().add(disciplina2);
		aluno1.getDisciplina().add(disciplina3);
		aluno1.getDisciplina().add(disciplina4);*/
		
		for (int i = 1; i <= 4; i++) {
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(JOptionPane.showInputDialog("Digite o nome da disciplina "+i+":"));
			disciplina.setNota(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da disciplina "+disciplina.getDisciplina())));
			aluno1.getDisciplina().add(disciplina);
		}

		/*
		 * aluno1.getDisciplina().setDisciplina1(JOptionPane.
		 * showInputDialog("Digite o nome da primeira disciplina: "));;
		 * aluno1.getDisciplina().setNota1(Double.parseDouble(JOptionPane.
		 * showInputDialog("Digite a nota da disciplina "+aluno1.getDisciplina().
		 * getDisciplina1()+":")));; aluno1.getDisciplina().setDisciplina2(JOptionPane.
		 * showInputDialog("Digite o nome da segunda disciplina: "));;
		 * aluno1.getDisciplina().setNota2(Double.parseDouble(JOptionPane.
		 * showInputDialog("Digite a nota da disciplina "+aluno1.getDisciplina().
		 * getDisciplina2()+":")));; aluno1.getDisciplina().setDisciplina3(JOptionPane.
		 * showInputDialog("Digite o nome da terceira disciplina: "));;
		 * aluno1.getDisciplina().setNota3(Double.parseDouble(JOptionPane.
		 * showInputDialog("Digite a nota da disciplina "+aluno1.getDisciplina().
		 * getDisciplina3()+":")));; aluno1.getDisciplina().setDisciplina4(JOptionPane.
		 * showInputDialog("Digite o nome da quarta disciplina: "));;
		 * aluno1.getDisciplina().setNota4(Double.parseDouble(JOptionPane.
		 * showInputDialog("Digite a nota da disciplina "+aluno1.getDisciplina().
		 * getDisciplina4()+":")));;
		 */

		System.out.println(aluno1);
		System.out.println("A média das notas das matérias é: " + aluno1.getMediaNota());

	}

}
