
public class Company
{
    static String companyName="infosys";
    String employeeName;
    Company(String myemployeeName){
    //this.companyName=mycompanyName;
    this.employeeName=myemployeeName;
    }
    void display(){
    System.out.println("company:"+companyName);
    System.out.println("employee:"
    +employeeName);
    }

public static void main(String[] args){
    Company com1= new Company("dharsh");
    Company com2= new Company("deeks");
    com1.display();
    com2.display();
        companyName="techpark";
            com1.display();
                com2.display();


}
}
    
    
