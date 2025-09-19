package Assignment5;

import java.util.ArrayList;
import java.util.List;

public class SongCollection {
	
	List<Song> lst = new ArrayList<Song>() ;
	
	public void addsong(Song s) {
		lst.add(s);
		
	}
	public void  display() {
		for (Song s : lst) {
			System.out.print("Srno: "+s.getSrno());
			System.out.print("Name: "+s.getTitle());
			System.out.print("Artist: "+s.getArtists());
			
		}
	}
	

}
