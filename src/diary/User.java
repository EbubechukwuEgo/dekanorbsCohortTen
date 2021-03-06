package diary;

public class User {

    private String email;
    private String accountName;
    private String password;

    public User(String email, String name, String password){
        this.email = email;
        accountName = name;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountName(){
        return accountName;
    }

    public void setAccountName(String username){
        accountName = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
