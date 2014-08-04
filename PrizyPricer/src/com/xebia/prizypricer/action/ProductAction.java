package com.xebia.prizypricer.action;

import java.util.List;

import com.xebia.prizypricer.dao.ProductDao;
import com.xebia.prizypricer.daoimpl.ProductDaoImpl;
import com.xebia.prizypricer.pojo.ProductModel;

public class ProductAction {
public ProductModel getProductmodel() {
		return productmodel;
	}
	public void setProductmodel(ProductModel productmodel) {
		this.productmodel = productmodel;
	}
private ProductModel productmodel;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getBarcode() {
		return barcode;
	}
	public void setBarcode(long barcode) {
		this.barcode = barcode;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdes() {
		return productdes;
	}
	public void setProductdes(String productdes) {
		this.productdes = productdes;
	}
	private String id;

	private long barcode;
	private String category;
private String productname;
private String productdes;
private List<ProductModel> productlist;
public List<ProductModel> getProductlist() {
	return productlist;
}
public void setProductlist(List<ProductModel> productlist) {
	this.productlist = productlist;
} 
	
public String getProductList(){
		ProductDaoImpl productDaoImpl=new ProductDaoImpl();
	productlist=productDaoImpl.getProductList();
	return "success";
}

public String getProductbyBarcode(){
	ProductDaoImpl productDaoImpl=new ProductDaoImpl();
productmodel=productDaoImpl.getProductbyBarcode(barcode);
return "success";
}

}
