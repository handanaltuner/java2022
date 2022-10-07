package oopWithNLayeredApp.business;


import java.util.List;
import oopWithNLayeredApp.core.logging.Logger;
//import oopWithNLayeredApp.dataAccess.HibernateProductDao;
//import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[]loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao=productDao;
		this.loggers=loggers;
		
	}
	
	public void add (Product product)throws Exception{
		//iş kuralı
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10 dan küçükk olamaz");
		}
	    
		productDao.add(product);
	    
	    for (Logger logger : loggers) {//[db, mail]
			logger.log(product.getName());
		}
	    }
		
	}


