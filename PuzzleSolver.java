import java.util.List;
import java.util.ArrayList;
/**
 * This calls contains the method solve which can be used to solve puzzles
 * @author Patrick
 *
 */
public class PuzzleSolver 
{
	/**
	 * This method finds all the permutations of a set of numbers and compares the first 
	 * @param k number of digits in u
	 * @param s empty set that can hold 9 digits
	 * @param u set of 10 digits 
	 */
	public static void solve(int k, List<Integer> s,ArrayList<Integer> u)
	{
		for(int x=0; x<u.size();x++)
		{
			Integer e = u.remove(x);
			s.add(e);
			
			if(k == 1)
			{
				//check to see if s is a correct configuration
				Integer F = s.get(9);
				Integer O = s.get(8);
				Integer R = s.get(7);
				Integer T = s.get(6);
				Integer Y = s.get(5);
				Integer E = s.get(4);
				Integer N = s.get(3);
				Integer S = s.get(2);
				Integer I = s.get(1);
				Integer X = s.get(0);
				int forty = F*10000 + O*1000 + R*100 + T*10 + Y;
				int ten =  T*100 + E*10 + N;
				int sixty = S*10000 + I*1000 + X*100 + T*10 + Y;
				if(forty + ten + ten == sixty)
				{
					System.out.println(forty + " + " + ten + " + " + ten + " = " +sixty);
					System.out.println(s.toString());
					break;
				}
				
			}
			else
			{
				solve(k-1,s,u); // Recursively calls the method again with a lower k
			}
			//removes the value from s and adds i back to u
			u.add(s.remove(s.size()-1));
		
		}
	}
	
	public static void main(String[] args)
	{
		List<Integer> S = new ArrayList<Integer>(10);
		ArrayList<Integer> U = new ArrayList<Integer>(10);
		
		// loop that adds values 0 1 2 3 4 5 6 7 8 9 to U
		for(int x = 0; x<10;x++)
		{
			U.add(x);
		}
		solve(10,S,U);
		
		
		
	}
}
