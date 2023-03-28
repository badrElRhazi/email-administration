import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastname;
    private String password;
    private String department;
    private String Email;
    private int mailboxCapacity=100;
    private int defaultPasswordlength=10 ;
    private String alternateEmail;
    private String companySuffix="aeycompany.com";

    // Constructor Fist-Last name
    public Email(String firstName,String lastname){
        this.firstName = firstName;
        this.lastname = lastname;
        //System.out.println("EMAIL CREATED ! :" +" " +this.firstName+" " +this.lastname);

        // Call a method for the department - return the department
        this.department=setDepartment();

        //call random pass methode
        this.password=randomPassword(defaultPasswordlength);
        System.out.println("Your password is : "+this.password);
        // combine elements to generate emails :
        Email= firstName.toLowerCase() +"."+lastname.toLowerCase()+"@"+department+"."+companySuffix;

    }

    // Ask for department
    private String setDepartment(){
        System.out.print("New worker : "+firstName+" ,Department Codes :\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter dep code : ");
        Scanner sc = new Scanner(System.in);
        int depChoice=sc.nextInt();
        if(depChoice ==1){return "Sales";}
        else if(depChoice ==2){return "Development";}
        else if(depChoice ==3){return "Accounting";}
        else return "None";
    }
    // Generate a random password
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password=new char[length];
        for(int i=0; i<length;i++){
           int rand= (int) (Math.random() * passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }
    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }
    // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail=altEmail;
    }
    // Change the password
    public void changePassword(String password){
        this.password=password;
    }

    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}
    public  String showInfo(){
        return "Display name : "+firstName+ " "+lastname+"\nCompany Email : "+Email+"\nMailBox Capacity :"+mailboxCapacity+" mb   ";
    }
}
