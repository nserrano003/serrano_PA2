import java.util.Scanner;

public class Serrano_p03 {
public static void main(String[] args) {
	
  Scanner scnr = new Scanner(System.in);
  String topics[] = new String[]{"Politics","Videogames","Anime","Food","Movies"};
  int a;
  int g = 0;
  int avg = 0;
  int max = 0;
  int min = 9999;
  int indexmax = 0;
  int indexmin = 0;
  int[] tot = new int[] {0,0,0,0,0};
  int[][] responses = new int[5][10];
  for(int i=0;i<5;i++) {
	  for(int j=0;j<10;j++) {
		  responses[i][j]= 0;
	  }
  }
  while(g!=-1){
  System.out.println("Please rate Politics from 1-10");
  a = scnr.nextInt();
  responses[0][a-1]++;
  tot[0]+=a-1;
  System.out.println("Please rate Videogames from 1-10");
  a = scnr.nextInt();
  responses[1][a-1]++;
  tot[1]+=a-1;
  System.out.println("Please rate Anime from 1-10");
  a = scnr.nextInt();
  responses[2][a-1]++;
  tot[2]+=a-1;
  System.out.println("Please rate Food from 1-10");
  a = scnr.nextInt();
  responses[3][a-1]++;
  tot[3]+=a-1;
  System.out.println("Please rate Movies from 1-10");
  a = scnr.nextInt();
  responses[4][a-1]++;
  tot[4]+=a-1;
  System.out.println("Type -1 to stop. Else type 0.");
  g = scnr.nextInt();
  }
  System.out.println("\t" + "1" + "\t" + "2" + "\t" + "3" + "\t" + "4" + "\t" + "5" + "\t" +
  "6" + "\t" + "7" + "\t" + "8" + "\t" + "9" + "\t" + "10");
  for(int i=0;i<5;i++){
    if(i==0) 
    System.out.print("Pol" + "\t");
    if(i==1)
    System.out.print("Video" + "\t");
    if(i==2)
    System.out.print("Anime" + "\t");
    if(i==3)
    System.out.print("Food" + "\t");
    if(i==4)
    System.out.print("Movies" + "\t");
    for(int j=0;j<10;j++){
      System.out.print(responses[i][j] + "\t");
      avg=tot[i]/10;
      if(j==9){
        if(tot[i] > max) {
          max = avg;
          indexmax = i;
        }
        if(tot[i] < min) {
          min = avg;
          indexmin = i;
        }
        System.out.println(avg);
      }
    }
  }
  System.out.println("Highest score is: " + topics[indexmax] + " with " + max + " points.");
  System.out.println("Lowest score is: " + topics[indexmin] + " with " + min + " points.");
}
}

