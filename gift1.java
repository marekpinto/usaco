/*
ID: marek.p1
LANG: JAVA
TASK: gift1
*/
import java.io.*;
import java.util.*;
public class gift1 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new FileReader("gift1.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
		int np = Integer.parseInt(br.readLine());
		// np = 10
		Map<String, Integer> People = new HashMap<String, Integer>();
		String[] peop = new String[np];
		for(int i = 0; i<np; i++) {	
		String name = br.readLine();
			People.put(name, 0);
			peop[i] = name;
			
		}
		
		for(int i = 0; i<np; i++) {
			String names = br.readLine();
			//mitnik
			System.out.println("Name: " + names);
			StringTokenizer st = new StringTokenizer(br.readLine());
			int money = Integer.parseInt(st.nextToken());
			System.out.println("Money: " + money);
			int people = Integer.parseInt(st.nextToken());
			//3
			System.out.println("num People: " + people);
			String[] peopleShared = new String[people];
			for(int q = 0; q<peopleShared.length; q++) {
				peopleShared[q] = br.readLine();
				System.out.println("People shared: " +peopleShared[q]);
			}
			int moneyPer = 0;
			if(people > 0) {
			moneyPer = money/people;
			}

			System.out.println("Money Per: " + moneyPer);
			int moneyLeft = money - (moneyPer*people);
			System.out.println("Money Left: " + moneyLeft);
			People.put(names, People.get(names) - (moneyPer*people));
			for(int q = 0;q<peopleShared.length;q++) {
				People.put(peopleShared[q], People.get(peopleShared[q])+moneyPer);
				
			}
		}
		for(int i = 0; i<peop.length; i++) {
		    int money = People.get(peop[i]);
		    out.println(peop[i] + " " + money);
		}
		
		
		
		
		
		out.close();
		br.close();
	}

}
