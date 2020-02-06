import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main{
	final String filename = "stats.txt";
	List<String> lines = Files.readAllLines(Paths.get(filename)); //gets file, puts it in to listarray of strings.
	List<List<String>> playerInfo = new ArrayList<>(lines.size()); //creates new playerStats arraylist, Strings
	
	Scanner fs = new Scanner(new File(filename)); //opens file in scanner.
	int lineAmount;
	int quarters = 4;
	Random random = new Random();
	double randomNum;
	public Main() throws IOException {
		for (String line : lines) {
		    String[] lineValues = line.split(",");
		    playerInfo.add(Arrays.asList(lineValues));
			lineAmount++;
		}
		String playerVitals[][] = new String[lineAmount][5];
		Float playerAttributes[][] = new Float[lineAmount][17];
		for (int i = 0; i < lineAmount; i++) {
			playerVitals[i][0] = playerInfo.get(i).get(0);
			playerVitals[i][1] = playerInfo.get(i).get(1);
			playerVitals[i][2] = playerInfo.get(i).get(2);
			playerVitals[i][3] = playerInfo.get(i).get(3);
			playerVitals[i][4] = playerInfo.get(i).get(4);
			
			playerAttributes[i][0] = Float.parseFloat(playerInfo.get(i).get(5)); //0 to 3 feet FGA
			playerAttributes[i][1] = Float.parseFloat(playerInfo.get(i).get(6)); // 3 to 10 feet FGA
			playerAttributes[i][2] = Float.parseFloat(playerInfo.get(i).get(7)); //10 to 16 feet FGA
			playerAttributes[i][3] = Float.parseFloat(playerInfo.get(i).get(8)); //16 feet to 3pt FGA
			playerAttributes[i][4] = Float.parseFloat(playerInfo.get(i).get(9)); //3pt FGA
			playerAttributes[i][5] = Float.parseFloat(playerInfo.get(i).get(10)); //0 to 3 feet FG
			playerAttributes[i][6] = Float.parseFloat(playerInfo.get(i).get(11)); //3 to 10 feet FG
			playerAttributes[i][7] = Float.parseFloat(playerInfo.get(i).get(12)); //10 to 16 feet FG
			playerAttributes[i][8] = Float.parseFloat(playerInfo.get(i).get(13)); //16 to 3pt FG
			playerAttributes[i][9] = Float.parseFloat(playerInfo.get(i).get(14)); //3pt FG
//			playerAttributes[i][10] = Float.parseFloat(playerInfo.get(i).get(15)); //TOV%
//			playerAttributes[i][11] = Float.parseFloat(playerInfo.get(i).get(16)); //Athleticism
//			playerAttributes[i][12] = Float.parseFloat(playerInfo.get(i).get(17)); //Clutch
//			playerAttributes[i][13] = Float.parseFloat(playerInfo.get(i).get(18)); //OReb
//			playerAttributes[i][14] = Float.parseFloat(playerInfo.get(i).get(19)); //Steal
//			playerAttributes[i][15] = Float.parseFloat(playerInfo.get(i).get(20)); //Block
//			playerAttributes[i][16] = Float.parseFloat(playerInfo.get(i).get(21)); //DReb
		}
		}
		
	
	public static void main(String[] args) throws FileNotFoundException,IOException{
		new Main();
	}
}
