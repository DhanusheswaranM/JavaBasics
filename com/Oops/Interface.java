package com.Oops;

import java.text.DateFormat;
import java.util.Calendar;


interface Vehicle1{
	void changeGear(int newGear);
	void speedUp(int increment);
	void applyBrakes(int decrement);
}

class Bicycle implements Vehicle1{
	int speed ;
	int gear ;
	public void changeGear(int newGear) {
		gear = newGear ;
	}
	public void speedUp(int increment) {
		speed = speed + increment ;
	}
	public void applyBrakes(int decrement) {
		speed = speed - decrement ;
	}
	public void printStates() {
		System.out.println("Speed : "+speed+"\nGear : "+gear);
	}
	
}
class Bike implements Vehicle1{
	int speed ;
	int gear ;
	public void changeGear(int newGear) {
		gear = newGear ;
	}
	public void speedUp(int increment) {
		speed = speed + increment ;
	}
	public void applyBrakes(int decrement) {
		speed = speed - decrement ;
	}
	public void printStates() {
		System.out.println("Speed : "+speed+"\nGear : "+gear);
	}
	
}

public class Interface {
	public static void main(String args[]) {
		Bicycle bc = new Bicycle();
		bc.changeGear(3);
		bc.speedUp(3);
		bc.applyBrakes(1);
		System.out.println("Bicycle");
		bc.printStates();
		Bike bi = new Bike();
		bi.changeGear(5);
		bi.speedUp(8);
		bi.applyBrakes(6);
		System.out.println("Bike");
		bi.printStates();
	}
}

/*
interface Search{
	abstract void searchbyTitle(String title);
	abstract void searchbyLangugae(String language);
	abstract void searchbyGenre(String genre);
	abstract void searchbyReleaseDate(Date reldate);
	abstract void searchbyCity(String city);
}

class Catalog implements Search{
	private static Date lastUpdated;
	private static List<Movie> MovieList = new ArrayList<movie>();
	void addMovie(Movie M) {
		MovieList.add(M);
		Calendar cal = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = cal.getTime();
		String todaysdate = dateFormat.format(date);
		System.out.println("Todays date: "+todaysdate);
		lastUpdated= date;
	}
	void listMovie() {
		for(Movie movie : MovieList) {
			movie.getMovieDetails();
		}
	}
	@Override
	void searchbyTitle(String title)
}*/
