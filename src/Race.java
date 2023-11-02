import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class Race {
	int numbersOfRacer;
	int distance;
	Integer winner = -1;
	public void setWinner(int winner) {
		this.winner = winner;
	}

	public Race(int numbersOfRacer,  int distance) {
		this.numbersOfRacer = numbersOfRacer;
		this.distance = distance;
	}
	
	public static int sleepTimer() {
		return (int) (Math.random() * (5 - 2 + 1) + 2);
	}
	}


