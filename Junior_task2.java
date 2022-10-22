public class Junior_task2 extends UserBuilder {
    
    @Override
    public void buildId() { 
        user.setId("124"); 
    }

    @Override
    public void buildFirstname() {
        user.setFirstname("Олег");
        
    }

    @Override
    public void buildLastname() {
        user.setLastname("Васильев");
        
    }

    @Override
    public void buildData() {
        user.setData("01.02.2022");
        
    }

    @Override
    public void buildTime() {
        user.setTime("18:00");
        
    }
}
