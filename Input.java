public class Input {
    private UserBuilder userBuilder;

    public void setUserBuilder(UserBuilder pb) { 
        userBuilder = pb; 
    }
    
    public User getUser() {
        return userBuilder.getUser();
    }

    
    public void constructUser() {
        userBuilder.createUser();
        userBuilder.buildId();
        userBuilder.buildFirstname();
        userBuilder.buildLastname();
        userBuilder.buildData();
        userBuilder.buildTime();
    }
}
