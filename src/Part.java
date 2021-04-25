import java.util.List;

//Create a Cashier class that will be treated as a leaf and it will implement to the Employee interface.


public  class Part implements Product{//Leaf

	/*
	     In this class,there are many methods which are not applicable to cashier because
	     it is a leaf node.
	 */

	    private int id;
	    private String name;
	    private double salary;

	    public Part(int id,String name,double salary)
	    {
	        this.id=id;
	        this.name = name;
	        this.salary = salary;
	    }
	    
	    @Override
	    public void add(Product product) {
	        //this is leaf node so this method is not applicable to this class.
	    }

	    @Override
	    public List<Product> getChild() {
	        //this is leaf node so this method is not applicable to this class.
	        return null;
	    }
	    
	    @Override
		public int getId() {
			// TODO Auto-generated method stub
			return id;
	    }
	    
	    @Override
	    public String getName() {
	        return name;
	    }

	    @Override
	    public double getSalary() {
	        return salary;
	    }

	    @Override
	    public void print() {
	        System.out.println("==========================");
	        System.out.println("Id ="+getId());
	        System.out.println("Name ="+getName());
	        System.out.println("Salary ="+getSalary());
	        System.out.println("==========================");
	    }

	    @Override
	    public void remove(Product product) {
	        //this is leaf node so this method is not applicable to this class.
	    }

		@Override
		public String toString() {
			return "Part [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}

     
	
}

	
