public abstract class UserBuilder {
    protected User user;

    public User getUser() { 
        return user; 
    }

    public void createUser() { 
        user = new User(); 
    }

    public abstract void buildId();
    public abstract void buildFirstname();
    public abstract void buildLastname();
    public abstract void buildData();
    public abstract void buildTime();
}