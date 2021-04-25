import java.util.ArrayList;
import java.util.List;

public class Manager {//Client == Manager
	
	public List<Product>  engine = new ArrayList<Product>();
	
	public Manager() {	
	}
		Product product1=new Part(1,"Camshaft", 20000.0);		//leaf == Part
		Product product2=new Part(2,"parça2", 25000.0);		 //leaf == Part	
		Product product3=new Part(1,"parça3", 20000.0);
		Product product4=new Part(1,"parçaboşşşş", 20000.0);

		Product assembly=new Assembly(1,"Engine Block",100000.0); // composite == Assembly
		Product assembly2=new Assembly(1,"assembly2",100000.0); 
		Product assembly3=new Assembly(1,"assembly3",100000.0); 				
		
		public void add() {
		assembly.add(product1);	
		assembly.add(product2);
		assembly.add(product3);
		
		engine.add(assembly);	
		engine.add(assembly2);	
		engine.add(product4);
		}
		
		public void print() {
			for(Product p: engine) {
				p.print();	
			}
		}

		@Override
		public String toString() {
			return "Manager [engine=" + engine + ", product1=" + product1 + ", product2=" + product2 + ", product3="
					+ product3 + ", product4=" + product4 + ", assembly=" + assembly + ", assembly2=" + assembly2
					+ ", assembly3=" + assembly3 + "]";
		}
		
		

		 // System.out.println(manager1.getChild(0).getId());

		 
		 
		 


}
