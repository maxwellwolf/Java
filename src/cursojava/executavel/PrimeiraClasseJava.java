package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String args[]) {
		
		Aluno aluno1 = new Aluno(); /*João*/
		Aluno aluno2 = new Aluno(); //Pedro
		
		
		aluno1.setNome("Maxwell");
		aluno1.setIdade(34);
		aluno1.setDataNasc("11/02/1985");
		aluno1.setNomeMae("Lina");
		
		
		Aluno aluno3 = new Aluno("Maxwell", 34);

		System.out.println("O seu nome é "+ aluno1.getNome() + " e a sua idade é " + aluno1.getIdade());

	}

}
