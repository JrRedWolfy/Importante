package PasswordFicherosBinario;

public class Main {

	public static void main(String[] args) {
		
		Password vPassword[] = new Password[10];
		vPassword[0] = new Password("Juan", 1, false);
		vPassword[1] = new Password("Pepe", 2, true);
		vPassword[2] = new Password("Adelin", 3, true);
		vPassword[3] = new Password("Jordi", 4, false);
		vPassword[4] = new Password("Vector", 4763, false);
		vPassword[5] = new Password("Jean", 12, false);
		vPassword[6] = new Password("Boros", 012, true);
		vPassword[7] = new Password("Violet", 570, true);
		vPassword[8] = new Password("Liam", 112, false);
		vPassword[9] = new Password("Wolf", 1313, true);
		
		IODatos.guardarDatos("pass.dat", vPassword);
	}

}
