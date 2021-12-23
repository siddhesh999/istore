package istore.istore;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;





public class Flipcart {
public static void main(String[] args) {
	Item item = new Item();
	item.setItemNumber(1);
	Cart cart = new Cart();
	cart.setId(101);
	cart.setName("Iphone 13");
	cart.setCost(85000);
	item.setPriceCart(65000);

	Item item2 = new Item();
	item2.setItemNumber(2);
	cart.setName("samsung s21");
	cart.setCost(120000);
	item2.setPriceCart(120000);

	Item item3 = new Item();
	item3.setItemNumber(3);
	cart.setName("samsung note 9");
	cart.setCost(100000);
	item3.setPriceCart(100000);

	List<Item> asList = Arrays.asList(item, item2, item3);
	cart.setItem(asList);
	item.setCart(cart);
	item2.setCart(cart);
	item3.setCart(cart);
	EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("flipcartApp");
	EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
	EntityTransaction transaction = createEntityManager.getTransaction();
	transaction.begin();
	createEntityManager.persist(cart);
	createEntityManager.persist(item);
	createEntityManager.persist(item2);
	createEntityManager.persist(item3);
	transaction.commit();
}
}
