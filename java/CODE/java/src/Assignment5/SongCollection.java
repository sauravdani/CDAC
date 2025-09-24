package Assignment5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SongCollection {
	
	List<Song> lst = new ArrayList<Song>() ;
	
	Scanner sc = new Scanner(System.in);
	
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
	
	public void update(Song song) {
		for(Song s:lst) {
			if (song.equals(s)) {
				// UPDATING SERIAL NUMBER
				System.out.println("Enter the srno you want to update: ");
				int sno = sc.nextInt();
				if (sno != 0) {
					s.setSrno(sno);
				}
				// UPDATING NAME TITLE
				System.out.println("Enter the srno you want to update: ");
				String title = sc.next();
				if (title != null) {
					s.setTitle(title);
				}
				// ADD ARTIST
				System.out.println("Enter the name of the artist you want to add : ");
				String artist  = sc.next();
				if (artist != null) {
					s.addArtist(artist);
				}
				// REMOVE ARTITS
				System.out.println("Enter the name of artist in lower case to be removed: ");
				artist  = sc.next();
				s.addArtist(artist);
				
				
				
				
			}
		}
	}
	
	public void delete(Song song) {
		
	}
	

}
