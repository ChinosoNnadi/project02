package Project2;
/*
* Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName
* */

public class Registration {
    private String  email, userName, password;
    public Registration(String email, String userName,
                        String password){
        this.email=email;
        this.userName=userName;
        this.password=password;
    }
    public void setEmail(){
        if(email.contains("yahoo")){
            this.email=email;
        }else{
            System.out.println("Error");
        }
    } public void setUserName(){
        if(!userName.isEmpty() && userName.length() > 6){
            this.userName = userName;
        }else{
            System.out.println("Error Username");
        }
    } public void setPassword() {
        if (!password.isEmpty() && password.length() > 6) {
            this.password = password;
        } else {
            System.out.println("Error Password");
        }
    }
    public String getEmail() {
        return email;
    }
    public String getUsername() {
        return userName;
    }
    public String getPassword() {
        return password;
    }

}
class RegistrationTester{
    public static void main(String[] args) {
        Registration  r = new Registration("devonmillz1991@gmail.com", "Myusername123", "Abracadabra");
        System.out.println(r.getEmail());
        System.out.println(r.getUsername());
        System.out.println(r.getPassword());
    }
}