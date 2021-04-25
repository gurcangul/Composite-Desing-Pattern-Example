import java.util.List;

/* this is the Employee interface i.e. Component.  
*/
public interface Product{//Component == Product
	
	public  int getId();	
	public String getName();	
	public double getSalary();	
    public void print();	
	public void add(Product product);	
    public void remove(Product product);    
    public List<Product> getChild();
   
}
