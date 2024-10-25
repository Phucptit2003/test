package event;

public class PublicEvent {

    private static PublicEvent instance;
    private EventMain eventMain;
    private EventLogin eventLogin;

    public static PublicEvent getInstance() {
        if (instance == null) {
            instance = new PublicEvent();
        }
        return instance;
    }

    private PublicEvent() {

    }

    public void addEventMain(EventMain event) {
        this.eventMain = event;
    }



    public void addEventLogin(EventLogin event) {
        this.eventLogin = event;
    }

    public EventMain getEventMain() {
        return eventMain;
    }

    public void setEventMain(EventMain eventMain) {
        this.eventMain = eventMain;
    }

    public EventLogin getEventLogin() {
        return eventLogin;
    }

    public void setEventLogin(EventLogin eventLogin) {
        this.eventLogin = eventLogin;
    }
    

}