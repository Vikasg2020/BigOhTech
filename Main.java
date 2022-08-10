
import java.util.ArrayList;
import java.util.List;

public class Main {

	public String name;
	public int age;

	public static void main(String[] args) {

		// Admin am=new Admin();
		// am.getAllDetail();
		User u1 = new User();
		User u2 = new User();

		List<User> list_user = new ArrayList<User>();

		list_user.add(u1);
		list_user.add(u2);

		Brick bri1 = new Brick();
		Brick bri2 = new Brick();
		Brick bri3 = new Brick();

		List<Brick> bri = new ArrayList<Brick>();

		bri.add(bri1);
		bri.add(bri2);
		bri.add(bri3);

		Wall w1 = new Wall();
		Wall w2 = new Wall();

		List<Wall> listWall = new ArrayList<Wall>();

		listWall.add(w1);
		listWall.add(w2);

	}

}

class Person {

	String name;
	String email;

	int age;
	char gender;

}

/*
 * class Admin extends Person{
 * 
 * public void editAllUser() {
 * 
 * System.out.println(" Edit data all user "); }
 * 
 * public void getAllDetail() {
 * 
 * System.out.println(" User name :- "+name);
 * 
 * System.out.println(" User Gender :- "+gender);
 * 
 * System.out.println(" User Comment :- "+comment);
 * 
 * }
 * 
 * public String setAllName( String names) {
 * 
 * this.name=names;
 * 
 * return name; } public char setAllGender( char gend) {
 * 
 * this.gender=gend;
 * 
 * return gender; }
 * 
 * public String setAllComment( String com) {
 * 
 * this.comment=com;
 * 
 * return comment; }
 * 
 * }
 * 
 */

class User extends Person {

	boolean role;
	boolean flagged;
	List<Brick> listBrick;
	int lengtBrick = listBrick.size();
	List<Wall> listwall;
	String roleUser;
	List<Country> lcountry;

	public boolean assigedRole() {
		//if (roleUser == "Admin") {
		if (roleUser.equals(roleUser)) {
			return true;
		} else {
			return false;
		}

	}

	public void editUser() {

		if (role = assigedRole()) {

			System.out.println(" Edit all user ");
		} else {

			System.out.println(" Edit only user ");
		}

	}

	public void getDetail() {

		System.out.println(" User name :- " + name);

		System.out.println(" User Gender :- " + gender);

	}

	public String setName(String names) {

		this.name = names;

		return name;
	}

	public char setGender(char gend) {

		this.gender = gend;

		return gender;
	}

	public boolean getFlag() {

		if (lengtBrick >= 10) {

			return true;
		} else {
			return false;
		}

	}

	public void getFlag(boolean flagg) {

		this.flagged = flagg;

	}

	public void setFlag(boolean flagg) {
		this.flagged = flagg;
	}

}

class Country {

	String name_country;
	List<City> cities;

	public String getCountry() {

		return name_country;
	}

	public void setCountry(String name_co) {

		this.name_country = name_co;

	}

}

class City {

	String name_city;
	List<Wall> listWall;

	public void getCity() {

		System.out.println("City name :-" + name_city);
	}

	public void setCity(String name_c) {

		this.name_city = name_c;

	}

}

class Wall {

	int heigth;
	int width;
	int max_brick;
	int brick_count;
	String wall_initiated;

	List<Brick> list_brick;

	public void getDetail() {

		System.out.println("max wall 90");
	}

	public void setWall() {

		heigth = 2;
		width = 4;

		if (max_brick <= 90) {

			System.out.println("we  have max of 90 bricks");
		} else {

			System.out.println("assigned  bricks");
			System.out.println(" wall length :- " + heigth * width);
		}

	}

	public List<Brick> etTotalBrick() {

		return list_brick;
	}

}

class Brick {

	String texture;
	String color;
	String comment;
	String readContent;

	public String getDetail() {
		System.out.println("Brick class");
		return comment;
	}

	public void setComment(String com) {
		this.comment = com;

	}

	public void setReadContent(String read_Contex) {
		this.readContent = read_Contex;
	}

	public String getreadContent() {

		return readContent;

	}

	public void setColor(String col) {

		this.color = col;
	}

	public String getColor() {

		return color;
	}
}