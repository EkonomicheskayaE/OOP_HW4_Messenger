public class Junior_task1 extends UserBuilder {

    @Override
    public void buildId() { 
        user.setId("123");
        
    }

    @Override
    public void buildFirstname() {
        user.setFirstname("Денис");
        
        
    }

    @Override
    public void buildLastname() {
        user.setLastname("Гришин");
        
    }

    @Override
    public void buildData() {
        user.setData("01.01.2022");
        
    }

    @Override
    public void buildTime() {
        user.setTime("08:00");
        
    }
}
