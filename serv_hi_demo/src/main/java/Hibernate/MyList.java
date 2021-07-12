package Hibernate;
import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.*;

public class MyList {



	@Entity
	@Table(name="users")
	public class User {

		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		@Column(name="id")
		protected int id;

		@Column(name="name")
		protected String name;

		@Column(name="description")
		protected String description;

		@Column(name="date")
		protected Date date;

		public User() {
		}

		public User(String name, String description, Date date) {
			super();
			this.name = name;
			this.description = description;
			this.date = date;
		}

		public User(int id, String name, String description, Date date) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.date = date;
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
	}



}
