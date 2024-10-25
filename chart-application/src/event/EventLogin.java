package event;

import model.Model_Login;
import model.Model_Register;

public interface EventLogin {

    public void login(Model_Login data);

    public void goRegister();

    public void goLogin();

    public void register(Model_Register data, EventMessage eventMessage);
    
}
