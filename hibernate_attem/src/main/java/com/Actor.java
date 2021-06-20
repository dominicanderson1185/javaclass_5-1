package com;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Actor {
	private Object actorId;
	private String firstName;
	private String lastName;
	private Timestamp lastUpdate;

	@Id
	@Column(name = "actor_id")
	public Object getActorId() {
		return actorId;
	}

	public void setActorId(Object actorId) {
		this.actorId = actorId;
	}

	@Basic
	@Column(name = "first_name")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Basic
	@Column(name = "last_name")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Basic
	@Column(name = "last_update")
	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate() {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Actor actor = (Actor) o;

		if (actorId != null ? !actorId.equals(actor.actorId) : actor.actorId != null) return false;
		if (firstName != null ? !firstName.equals(actor.firstName) : actor.firstName != null) return false;
		if (lastName != null ? !lastName.equals(actor.lastName) : actor.lastName != null) return false;
		if (lastUpdate != null ? !lastUpdate.equals(actor.lastUpdate) : actor.lastUpdate != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = actorId != null ? actorId.hashCode() : 0;
		result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
		result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
		result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
		return result;
	}
}
