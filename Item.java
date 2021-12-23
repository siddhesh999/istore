package istore.istore;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	@Id
	private int itemNumber;
	private double priceCart;

	@ManyToOne
	private Cart cart;

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public double getPriceCart() {
		return priceCart;
	}

	public void setPriceCart(double priceCart) {
		this.priceCart = priceCart;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Item [itemNumber=" + itemNumber + ", priceCart=" + priceCart + ", cart=" + cart + "]";
	}
	
	
	

}
