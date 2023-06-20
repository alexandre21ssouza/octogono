package exercicioInterface;

public class Octogono {

	public static void main(String[] args) {
		//Criando variáveis compostas
		Lutador l[] = new Lutador[6];
		
		
		l[0] = new Lutador("Mike Tyson","Brasil", 25, 1.70f, 75.6f, 5, 1, 0);
		l[1] = new Lutador("Gilson Rodrigues","Brasil", 25, 1.70f, 75.6f, 5, 1, 0);
		l[2] = new Lutador("Minotauro", "Brasil", 25, 1.70f, 75.6f, 5, 1, 0);
		l[3] = new Lutador("Vand Silva", "Brasil", 25, 1.70f, 75.6f, 5, 1, 0);
		l[4] = new Lutador("Tyler Willians", "EUA", 25, 1.70f, 75.6f, 5, 1, 0);
		l[5] = new Lutador("Jhon Jhon", "EUA", 25, 1.70f, 75.6f, 5, 1, 0);
		
		l[0].apresentar();
		l[1].apresentar();
		l[2].apresentar();
		l[3].apresentar();
		l[4].apresentar();
		l[5].apresentar();
		
		l[0].status();
		l[0].ganharLuta();
		l[0].perderLuta();
		l[0].empatarLuta();
		l[0].status();
		
	}

}
