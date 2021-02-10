package model.dao;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller dep);
	void update(Seller dep);
	void deleteById(Integer Id);
	Seller findById(Integer Id);
	
}
