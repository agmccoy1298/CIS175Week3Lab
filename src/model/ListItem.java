package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
/**
 * @author andrewmccoy - agmccoy
 * CIS175 - Fall 2021
 * Jan 28, 2023
 */
public class ListItem {
	@Id
	@GeneratedValue
	//variables
	@Column(name="ID")
	private int id;
	@Column(name="STORE")
	private String store;
	@Column(name="ITEM")
	private String item;
	
	//constructors
	public ListItem(){
		super();
	}
	public ListItem(String store, String item) {
		this.store = store;
		this.item = item;
	}
	
	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {

		this.item = item;
	}
	
	//helper methods	
	public String returnItemDetails() {
		return this.store + ": " + this.item;
	}
}
