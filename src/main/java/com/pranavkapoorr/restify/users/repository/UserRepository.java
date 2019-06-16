package com.pranavkapoorr.restify.users.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pranavkapoorr.restify.users.model.Address;
import com.pranavkapoorr.restify.users.model.Company;
import com.pranavkapoorr.restify.users.model.User;

@Repository
public class UserRepository implements UserDao{
	List<User> userDb;
	
	public UserRepository() {
		this.userDb = new ArrayList<>();
		this.userDb.add(
				new User(
					1,
					"Pranav Kapoor",
					"pranavkapoorr",
					"pranavkapoorr@gmail.com",
					new Address("Oxford Street", "London", "ME52A1", "UK"),
					"7488706094",
					"pranavkapoorr.com",
					new Company("pranavkapoorr", "IT")
				)
			);
		this.userDb.add(
				new User(
					2,
					"Michael Jackson",
					"themj",
					"michaeljackson@mj.com",
					new Address("Beverly Hills", "California", "232456", "USA"),
					"7453825674",
					"michaeljackson.com",
					new Company("MJ", "Celeb")
				)
			);
		this.userDb.add(
				new User(
					3,
					"Sachin Tendulekar",
					"stendulekar",
					"sachintendulekar@gmail.com",
					new Address("andheri", "Mumbai", "1246245", "India"),
					"9876543210",
					"godofcricket.com",
					new Company("BCI", "Sports")
				)
			);
		this.userDb.add(
				new User(
					4,
					"Donald Trump",
					"djtrump",
					"djtrump@trump.com",
					new Address("White House", "Washington DC", "11111", "USA"),
					"1000000001",
					"trump.com",
					new Company("Trump Inc.", "President")
				)
			);
		this.userDb.add(
				new User(
					5,
					"Narendra Modi",
					"namo",
					"namo@pmo.com",
					new Address("PMO", "New Delhi", "126878", "India"),
					"9100000123",
					"pmoindia.com",
					new Company("BJP", "Politics")
				)
			);
		this.userDb.add(
				new User(
					6,
					"Leanne Graham",
					"Bret",
					"Sincere@april.biz",
					new Address("Kulas Light", "Gwenborough", "655421", "Sweden"),
					"1779548412",
					"hildegard.org",
					new Company("Romaguera-Crona", "X")
				)
			);
		this.userDb.add(
				new User(
					7,
					"Ervin Howell",
					"Antonette",
					"Shanna@melissa.tv",
					new Address("Victor Plains", "Wisokyburgh", "54641", "Russia"),
					"905667771",
					"anastasia.net",
					new Company("Deckow Lilo", "Medical")
				)
			);
		this.userDb.add(
				new User(
					8,
					"Clementine Bauch",
					"samantha",
					"Nathan@yesenia.net",
					new Address("Queens Harbour", "Sydney", "SE15AS", "Australia"),
					"6457841265",
					"ramiro.info",
					new Company("Romaguera-Jacobson", "IT")
				)
			);
		this.userDb.add(
				new User(
					9,
					"Chelsey Dietrich",
					"kamren",
					"Lucio_Hettinger@annie.ca",
					new Address("Queens Street", "Toronto", "ME5281", "Canada"),
					"6478954123",
					"demarco.info",
					new Company("Keebler LCC", "Lcc")
				)
			);
		this.userDb.add(
				new User(
					10,
					"Glenna Reichert",
					"Delphine",
					"Chaim_McDermott@dana.io",
					new Address("Dayna Park", "Berlin", "BE52A1", "Germany"),
					"7759795415",
					"conrad.com",
					new Company("Yost and Sons", "Textile")
				)
			);
	}
	
	@Override
	public List<User> getAllUsers() {
		return this.userDb;
	}

	@Override
	public User getUserById(int id) {
		return this.userDb.stream().filter((u) -> id == u.getId()).findAny().orElse(null);
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
