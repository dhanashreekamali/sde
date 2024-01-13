package com.mcdonalds.entity.builder;

import com.mcdonalds.entity.Burger;
import com.mcdonalds.factory.BurgerType;

public class BurgerBuilder {
	private Burger burger;

	public BurgerBuilder(Burger burger) {
		super();
		this.burger = burger;
	}

	public BurgerBuilder prepareBurger(BurgerType bt) {
		if (bt.equals(BurgerType.doublePatty)) {
			this.patty("doublePatty");
			this.sauce("doublePattySauce");
		} else if (bt.equals(BurgerType.maharaja)) {
			this.patty("maharajaPatty");
			this.sauce("maharajaSauce");
		} else if (bt.equals(BurgerType.nonveg)) {
			this.patty("nonVegPatty");
			this.sauce("nonVegSauce");
		}
		return this;
	}

	/**
	 * @return the burger
	 */
	public Burger getBurger() {
		return burger;
	}

	public BurgerBuilder patty(String patty) {
		this.burger.setPatty(patty);
		return this;
	}

	public BurgerBuilder sauce(String sauce) {
		this.burger.setSauce(sauce);
		return this;
	}
}
