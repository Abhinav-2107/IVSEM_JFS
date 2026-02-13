/*class StudentScan{
	String roll_no;
	String Name;
	String Branch;
	static int grand_total;
	static int CSE_Count;
	static int CSM_Count;
	static int CSD_Count;
	static int ECE_Count;
	static int IT_Count;
	
	StudentScan(String roll_no,String Name,String Branch){
		this.roll_no = roll_no;
		this.Name=Name;
		this.Branch = Branch;
		if(Branch.equals("CSE")){
		CSE_Count +=1;
		}else if(Branch.equals("CSM")){
		CSM_Count +=1;
		}else if(Branch.equals("CSD")){
		CSD_Count +=1;
	}else if(Branch.equals("ECE")){
		ECE_Count +=1;
		}else{
		IT_Count +=1;
		}
		//grand_total +=CSE_Count+CSD_Count+CSM_Count+ECE_Count+IT_Count;
		show();
	}
	void show(){
		System.out.println("Name = "+Name);
		System.out.println("Roll_No = "+roll_no);
		System.out.println("Branch = "+Branch);
		if(Branch == "CSM"){
			System.out.println("CSM_Count =" +CSM_Count);
			grand_total++;
		}else if(Branch == "CSE"){
			System.out.println("CSE_Count =" + CSE_Count);
			grand_total++;
		}else if(Branch == "IT"){
			System.out.println("IT_Count =" + IT_Count);
			grand_total++;
			
		}else if(Branch == "ECE"){
			System.out.println("ECE_Count =" +ECE_Count);
			grand_total++;
		}else{
			System.out.println("CSD_Count =" +CSD_Count);
			grand_total++;
		}
		
		
		System.out.println("Grand Total = "+grand_total);
		System.out.println("-------------------------------------");
	}
	
	public static void main(String [] args){
		StudentScan arr[];
		int n = 5;
		arr = new StudentScan[n];
		arr[0]= new StudentScan("24951A6605","ABHI","CSM");
		arr[1]=new StudentScan("24951A6607","Ravi","CSE");
		arr[2]=new StudentScan("24951A5467","RAM","CSD");
		arr[3]=new StudentScan("24951A5h87","RAJU","CSM");
		System.out.println();
		System.out.println("CSM_Count =" +CSM_Count + ", CSE_Count ="+CSE_Count +" , IT_Count ="+ IT_Count+ ","+"CSD_Count ="+CSD_Count+" ,ECE_Count ="+ECE_Count); 
		
	}
}*/
// Hash
import java.util.*;
class StudentScan{
	String roll_no;
	String Name;
	String Branch;
	static Map<String,Integer> branchCount= new HashMap<>();
	static int total = 0;
	
	StudentScan(String roll_no,String Name,String Branch){
		this.roll_no = roll_no;
		this.Name=Name;
		this.Branch = Branch;
		branchCount.put(Branch,branchCount.getOrDefault(Branch,0)+1);
		total++;
		show();
	}
	void show(){
		System.out.println("Name = "+Name);
		System.out.println("Roll_No = "+roll_no);
		System.out.println("Branch = "+Branch);
		System.out.println("Student count in branch ="+branchCount.get(Branch));
		System.out.println("-------------------------------------");
	}
	
	public static void main(String [] args){
		StudentScan arr[];
		int n = 5;
		arr = new StudentScan[n];
		arr[0]= new StudentScan("24951A6605","ABHI","CSM");
		arr[1]=new StudentScan("24951A66232","Ravi","CSE");
		arr[2]=new StudentScan("24951A5467","RAM","CSD");
		arr[3]=new StudentScan("24951A5h87","RAJU","CSM");
		System.out.println();
		System.out.println("CSM_Count ="+branchCount.get("CSM")  + ", CSE_Count ="+branchCount.get("CSE")+" , IT_Count ="+branchCount.get(branchCount.get("IT"))+ ","+"CSD_Count ="+branchCount.get("CSD")+" ,ECE_Count ="+branchCount.get("ECE")); 
	}
}
		
