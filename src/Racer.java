

public class Racer extends Thread{
	private Race race;
	private int racerNumber; 
	static int sleepMin = 2;
	static int sleepMax = 5;
	public Racer(Race race, int racerNumber) {
		this.race = race;
		this.racerNumber = racerNumber;
		
	}
	public int getRacerNumber() {
		return racerNumber;
	}
	public static int sleepTimer() {
		return (int) (Math.random() * (sleepMax - sleepMin + 1) + sleepMin);
	}
	@Override
	public void run() {
		for(int i = 0; i < race.distance;i++) {
			try {
				
				sleep(sleepTimer());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(racerNumber);
			
		}
		synchronized(race.winner) {
			if(race.winner == -1) {
//				System.out.println("win");
				race.setWinner(racerNumber);
			}
		}
		
		}
	}


