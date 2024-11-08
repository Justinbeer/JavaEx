package com.javaex.oop.point.v1;

class Song {
	
	private String artist; // 가수
	private String title; // 제목
	private String album; // 앨범제목
	private int year; // 발표된연도
	private int track; //트랙번호
	private String composer; // 작곡가
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public void showInfo() {
		System.out.printf("%s, %s (%s, %d, %d번 track, %s 작곡)%n", 
								artist, title, album, year, track, composer);
	}
	
	
}





public class SongApp {

	public static void main(String[] args) {
		Song s1 = new Song();
		s1.setArtist("아이유");
		s1.setTitle("좋은날");
		s1.setAlbum("Real");
		s1.setYear(2010);
		s1.setTrack(3);
		s1.setComposer("이민수");
		s1.showInfo();
		
		Song s2 = new Song();
		s2.setArtist("BIGBANG");
		s2.setTitle("거짓말");
		s2.setAlbum("Always");
		s2.setYear(2007);
		s2.setTrack(2);
		s2.setComposer("G-DRAGON");
		s2.showInfo();

		Song s3 = new Song();
		s3.setArtist("BIGBANG");
		s3.setTitle("거짓말");
		s3.setAlbum("Always");
		s3.setYear(2007);
		s3.setTrack(2);
		s3.setComposer("G-DRAGON");
		s3.showInfo();

	}

	
	
}
