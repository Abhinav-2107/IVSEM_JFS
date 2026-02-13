class Customer{
	String name;
	int acc_no;
	int amount;
	static int grand_total;
	Customer(String n,int acc_no,int amt){
		this.name = n;
		this.acc_no=acc_no;
		amount = amt;
		grand_total +=amount;
	}
	void show(){
		System.out.println("Name = "+name);
		System.out.println("Acc_No = "+acc_no);
		System.out.println("amt = "+amount);
		System.out.println("Grand Total = "+grand_total);
	}
	public static void main(String [] args){
		Customer arr[];
		int n = 3;
		arr = new Customer[n];
		for(int i =0;i<n;i++){
			arr[i] = new Customer("Customer " +( i+1),100+i,2000);
		}
		for(int i =0;i<n;i++){
			arr[i].show();
			System.out.println("-----------------------------------");
		}
	}
}
		
