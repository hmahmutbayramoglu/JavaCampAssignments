package Concrete;

import Abstract.SaleService;

import Entities.Campain;
import Entities.Customer;
import Entities.Product;
import Entities.Sale;

public class SaleManager implements SaleService{

	@Override
	public void add(Sale sales) {
		System.out.println(sales.getId()+" "+"Numaralý Satýþ Eklendi");				
	}

	@Override
	public void getAll() {
		System.out.println("Satýþlar Getirildi");				
			
	}

	@Override
	public void get(int id) {
		System.out.println(id+" "+"Numaralý Satýþ Getirildi");				
	}

	@Override
	public void update(Sale sales) {
		System.out.println(sales.getId()+" "+"Numaralý Satýþ Güncellendi");
		
	}

	@Override
	public void delete(Sale sales) {
		System.out.println(sales.getId()+" "+"Numaralý Satýþ Silindi");
		
	}

	@Override
	public void sale(Product product, Customer customer) {
		System.out.println(customer.getId()+" "+"Numaralý Müþteriye"+" "+product.getName()+" "+"Ýsimli Ürün Satýldý.");			

		
	}

	@Override
	public void saleWithCampain(Customer customer ,Product product, Campain campain, int piece) {
		double price = product.getPiecePrice();
	 
		price = (price*piece);
		short discount = campain.getCampaignRate();
		
		double totalprice =price-(price*discount/100);
		
 
		System.out.println(customer.getId()+" "+"Numaralý Müþteriye"+" "+product.getName()+" "+"Ýsimli Ürünü"+" "+ campain.getName()+" "+"Kampanyasý ile Þu Fiyata Satýldý"+" "+totalprice+"$");			
	}

}
