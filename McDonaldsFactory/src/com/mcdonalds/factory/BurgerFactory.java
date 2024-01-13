package com.mcdonalds.factory;

import com.mcdonalds.entity.Burger;
import com.mcdonalds.entity.builder.BurgerBuilder;

public class BurgerFactory {
	BurgerBuilder burgerBuilder;

	public Burger getBurger(BurgerType bt) {
		return this.burgerBuilder.prepareBurger(bt).getBurger();
	}
}
