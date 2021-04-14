import java.util.Scanner;

class PasswordGenerator {

  private String word1;
  private String word2;
  private String word3;
  private String word4;
  private String word5;
  private int n;
  
  public PasswordGenerator(int n,String word1, String word2, String word3, String word4, String word5){
    this.n = n;
    this.word1 = word1;
    this.word2 = word2;
    this.word3 = word3;
    this.word4 = word4;
    this.word5 = word5;
  }

  public void setPhrase(String word1, String word2, String word3, String word4, String word5){
    word1 = word1;
    word2 = word2;
    word3 = word3;
    word4 = word4;
    word5 = word5;
  }

  public String getPhrase(){
    return word1 + " " + word2 + " " + word3 + " " + word4 + " " + word5;
  }

  public void setN(int n){
    this.n = n;
  }

  public int getN(){
    return n;
  }

  public String getPassword(){
    String passwrd = ""; //null
    
    if (word1.length()>n) passwrd = passwrd + word1.substring(0,n); // necessary for passwrd string to be ocuppied else string is lost. 
      
    
    else
      passwrd = passwrd + word1;
    

    if (word2.length()>n)
      passwrd = passwrd + word2.substring(0,n);
      
    
    
    else
      passwrd = passwrd + word2;
    

    if (word3.length()>n)
      passwrd = passwrd + word3.substring(0,n);
      
    
    
    else
      passwrd = passwrd + word3;
    

    if (word4.length()>n)
      passwrd = passwrd + word4.substring(0,n);
      
    
    
    else
      passwrd = passwrd + word4;
    

    if (word5.length()>n)
      passwrd = passwrd + word5.substring(0,n); 
      
    
    
    else
      passwrd = passwrd + word5;
    

    return passwrd;
    
  }

  public int getPasswordLength(){
    return getPassword().length();
  }
}


class Main {
  public static void main(String[] args) {

  Scanner scnr = new Scanner(System.in);
  String word1, word2, word3, word4, word5;
  int n = 0;

 System.out.println("Enter 5 phrases words:");

  word1 = scnr.next();
  word2 = scnr.next();
  word3 = scnr.next();
  word4 = scnr.next();
  word5 = scnr.next();

  System.out.println();

  System.out.println("Enter default n value:");

  n = scnr.nextInt();

  PasswordGenerator password = new PasswordGenerator(n, word1, word2, word3, word4, word5);
      
  System.out.println("Using n: "+password.getN());
       
  System.out.println("Password length = "+password.getPasswordLength()+": "+password.getPassword());
  
  password.setN(n);
       
 }
}