package com.shopbag.store.store.service;

import com.shopbag.store.store.domain.Article;
import com.shopbag.store.store.domain.CartItem;
import com.shopbag.store.store.domain.ShoppingCart;
import com.shopbag.store.store.domain.User;


public interface ShoppingCartService {

	ShoppingCart getShoppingCart(User user);
	
	int getItemsNumber(User user);
	
	CartItem findCartItemById(Long cartItemId);
	
	CartItem addArticleToShoppingCart(Article article, User user, int qty, String size);
		
	void clearShoppingCart(User user);
	
	void updateCartItem(CartItem cartItem, Integer qty);

	void removeCartItem(CartItem cartItem);
	
}
