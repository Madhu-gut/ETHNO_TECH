import java.util.*;
class Aarraylist
{
	public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	ArrayList<String> playlist = new ArrayList<>();
	System.out.print("Enter your first song:");
	String f  = s.nextLine();
	playlist.add(f);
	
	System.out.print("Enter your second song:");
	String se = s.nextLine();
	playlist.add(se);
	
	System.out.print("Enter your third song:");
	String t = s.nextLine();
	playlist.add(t);
	
	System.out.print("Enter your fourth song:");
	String fo = s.nextLine();
	playlist.add(fo);
	
	System.out.println("Size of playlist before removal: "+playlist.size());
	System.out.println("Removed song: "+playlist.remove(2));
	System.out.println("have it or not: "+playlist.contains("a"));
	System.out.println("Use get() method: "+playlist.get(1));
	System.out.println("Size of playlist after removal: "+playlist.size());
	
	for(String str:playlist)
	{
		System.out.print(str+" ");
	}
	}
}