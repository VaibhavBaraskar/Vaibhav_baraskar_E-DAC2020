package BasicsPrograms;

public class TowerOfHanoi {
	public static void doTowers(int topN, char from, char inter, char to) {
	      if (topN == 1) {
	         System.out.println("Disk 1 from " + from + " to " + to);
	      } else {
	         doTowers(topN - 1, from, to, inter);
	         System.out.println("Disk " + topN + " from " + from + " to " + to);
	         doTowers(topN - 1, inter, from, to);
	      }
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowerOfHanoi ob=new TowerOfHanoi();
		 int nDisks = 3;
	      ob.doTowers(nDisks, 'A', 'B', 'C');
	}

}
