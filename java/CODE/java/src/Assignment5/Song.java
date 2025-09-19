package Assignment5;

import java.util.Set;

public class Song {
	int srno;
	String title;
	Set<String> artists;
	int r_year;
	String rating;
	
	public Song(int srno,String title,Set<String> artists,int r_year,String rating) {
		this.srno = srno;
		this.title=title;
		this.artists=artists;
		this.r_year=r_year;
		this.rating=rating;
		
		
	}

	public int getSrno() {
		return srno;
	}

	public void setSrno(int srno) {
		this.srno = srno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set<String> getArtists() {
		return artists;
	}

	public void setArtists(Set<String> artists) {
		this.artists = artists;
	}

	public int getR_year() {
		return r_year;
	}

	public void setR_year(int r_year) {
		this.r_year = r_year;
	}

	public String getRating() {
		return rating; 
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
	
	

}
