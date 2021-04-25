import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// this is the BankManager class i.e. Composite.  


public class Assembly implements Product {//Composite==Assembly
	
	 private int id;
	 private String name;
	 private double salary;

	 public Assembly(int id,String name,double salary)
	 {
	  this.id=id;	 
	  this.name = name;
	  this.salary = salary;
	 }
	 
	 List<Product> productList = new ArrayList<Product>();
	 
	 @Override
	 public void add(Product product) 
	 {
		 productList.add(product);
	 }

	 @Override
	 public List<Product> getChild() 
	 {
	  return productList;
	 }

	 @Override
	 public void remove(Product employee) {
		 productList.remove(employee);
	 }	
	 
	 @Override
	 public int getId() 
	 {
	  return id;
	 }
	 
	 @Override
	 public String getName() 
	 {
	  return name;
	 }
	 
    @Override
	 public double getSalary()
	 {
	  return salary;
	 }

	 @Override
	 public void print() 
	 {
		 
	  System.out.println("==========================");
	  System.out.println("Id ="+getId());
	  System.out.println("Name ="+getName());
	  System.out.println("Salary ="+getSalary());
	  System.out.println("==========================");
	  
	  Iterator<Product> it = productList.iterator();
	  
	      while(it.hasNext())
	     {
	    	  Product employee = it.next();
	        employee.print();
	     }
	 }

	@Override
	public String toString() {
		return "Assembly [id=" + id + ", name=" + name + ", salary=" + salary + ", productList=" + productList + "]";
	}

	 


	

}
