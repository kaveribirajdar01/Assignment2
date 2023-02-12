package assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Sortlist_ComparableInterface2 {

	public static void main(String[] args) {	
				
				List<product> ls=new ArrayList<>();
				ls.add(new product("Patanjali", 100));
				ls.add(new product("Dove", 313));
				ls.add(new product("Senthol", 414));
				ls.add(new product("Lux", 123));
				ls.add(new product("Medimix", 212));
				ls.add(new product("Santoor", 111));
				Collections.sort(ls);
				for(product s:ls)
				{
					System.out.println("Product name is "+s.getPname()+" Price of product is "+s.getPprice());
				}

			}

		}
		class product implements Comparable<product>
		{
			String pname;
			int pprice;
			public String getPname() {
				return pname;
			}
			public void setPname(String pname) {
				this.pname = pname;
			}
			public int getPprice() {
				return pprice;
			}
			public void setPprice(int pprice) {
				this.pprice = pprice;
			}
			public product(String pname, int pprice) {
				this.pname = pname;
				this.pprice = pprice;
			}
			@Override
			public int compareTo(product o) {
				
				if(this.pprice>o.pprice)
				{
					return 1;
				}	
				else if(this.pprice<o.pprice)
				{
					return -1;
				}
					
				return 0;

	}

}
