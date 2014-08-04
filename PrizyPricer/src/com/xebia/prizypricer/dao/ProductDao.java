package com.xebia.prizypricer.dao;

import java.util.List;

import com.xebia.prizypricer.pojo.ProductModel;

public interface ProductDao {
   public ProductModel getProductbyBarcode(long barcode);
}
