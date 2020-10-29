package com.laivanon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductsModel {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_product;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private double price;

	@Column(name = "discout")
	private short discout;

	@Column(name = "image")
	private String image;

	@Column(name = "id_category")
	private int id_category;

	public ProductsModel() {
	}

	public ProductsModel(int id_product, String title, String description, double price, short discout, String image,
			int id_category) {
		this.id_product = id_product;
		this.title = title;
		this.description = description;
		this.price = price;
		this.discout = discout;
		this.image = image;
		this.id_category = id_category;
	}

	public ProductsModel(String title, String description, double price, short discout, String image, int id_category) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.discout = discout;
		this.image = image;
		this.id_category = id_category;
	}

	public int getId_product() {
		return id_product;
	}

	public void setId_product(int id_product) {
		this.id_product = id_product;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public short getDiscout() {
		return discout;
	}

	public void setDiscout(short discout) {
		this.discout = discout;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getId_category() {
		return id_category;
	}

	public void setId_category(int id_category) {
		this.id_category = id_category;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + discout;
		result = prime * result + id_category;
		result = prime * result + id_product;
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductsModel other = (ProductsModel) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (discout != other.discout)
			return false;
		if (id_category != other.id_category)
			return false;
		if (id_product != other.id_product)
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProductsModel [id_product=" + id_product + ", title=" + title + ", description=" + description
				+ ", price=" + price + ", discout=" + discout + ", image=" + image + ", id_category=" + id_category
				+ "]";
	}

}
