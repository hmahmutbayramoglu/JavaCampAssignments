package Concrete;

import Abstract.SaleService;

import Entities.Campain;
import Entities.Customer;
import Entities.Product;
import Entities.Sale;

public class SaleManager implements SaleService{

	@Override
	public void add(Sale sales) {
		System.out.println(sales.getId()+" "+"Numaral� Sat�� Eklendi");				
	}

	@Override
	public void getAll() {
		System.out.println("Sat��lar Getirildi");				
			
	}

	@Override
	public void get(int id) {
		System.out.println(id+" "+"Numaral� Sat�� Getirildi");				
	}

	@Override
	public void update(Sale sales) {
		System.out.println(sales.getId()+" "+"Numaral� Sat�� G�ncellendi");
		
	}

	@Override
	public void delete(Sale sales) {
		System.out.println(sales.getId()+" "+"Numaral� Sat�� Silindi");
		
	}

	@Override
	public void sale(Product product, Customer customer) {
		System.out.println(customer.getId()+" "+"Numaral� M��teriye"+" "+product.getName()+" "+"�simli �r�n Sat�ld�.");			

		
	}

	@Override
	public void saleWithCampain(Customer customer ,Product product, Campain campain, int piece) {
		double price = product.getPiecePrice();
	 
		price = (price*piece);
		short discount = campain.getCampaignRate();
		
		double totalprice =price-(price*discount/100);
		
 
		System.out.println(customer.getId()+" "+"Numaral� M��teriye"+" "+product.getName()+" "+"�simli �r�n�"+" "+ campain.getName()+" "+"Kampanyas� ile �u Fiyata Sat�ld�"+" "+totalprice+"$");			
	}

}
