package poo.corrida.sapos;

public class Sapo extends Thread {
	
	private String name;
	private int distanceRunning = 0;
	private int totalDistanceRunning;
	private int jump = 0;
	private int totalJumps = 0;
	static int position = 0;
	final static int MAX_JUMP = 50;
	
	public Sapo(String name, int totalDistanceRunning) {
		super(name);
		this.name = name;
		this.totalDistanceRunning = totalDistanceRunning;
	}
	
	public void statusSapo() {
		System.out.println("O " + name +  " pulou " + jump + "cm \t e já percorreu " +
								distanceRunning + "cm");
	}
	
	public void jumpingSapo() {
		totalJumps++;
		jump = (int) (Math.random() * MAX_JUMP);
		distanceRunning += jump;
		if(distanceRunning > totalDistanceRunning) {
			distanceRunning = totalDistanceRunning;
		}
	}
	
	public void stopSapo() {
		yield();
	}
	
	public void placingSapo() {
		position++;
		System.out.println(name + " foi o " + position + 
				"º colocado com " + totalJumps + " pulos");
	}
	
	public void run() {
		while(distanceRunning < totalDistanceRunning) {
			jumpingSapo();
			statusSapo();
			stopSapo();
		}
		placingSapo();
	}
}
