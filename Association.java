class Association{
public static void main(String args[]){
        Mobile mobObj1=new Mobile("750 731 7865");
        Mobile mobObj2=new Mobile("992 329 8765");

        mobObj1.call("750 731 7865");

        Battery batteryObj=new Battery(90.0f);
        Screen scrObj=new Screen("190x150");
        mobObj2.message("992 329 8765", "Good Morning",batteryObj,scrObj);
    }
}
class Phone{
    private String phoneNumber;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void call(String number){
        System.out.println("Calling: "+number);
    }
}
class Mobile extends Phone{
    public Mobile(String phoneNumber){
        super(phoneNumber);
    }
    //private Battery batteryObj=new Battery();
    //private Screen scrObj=new Screen();

    /*void call(Contact reciever){
        System.out.println("Calling "+reciever);
    }*/
    void message(String number,String textMessage,Battery batteryObjRef,Screen scrObjRef){
        System.out.println("Sending a text message to "+number+" : "+textMessage+" having battery "+batteryObjRef.getChargePercent()+" and screen resolution of "+scrObjRef.getResolution());
    }

}
class Battery{
    float chargePercent;
    public Battery(float chargePercent) {
        this.chargePercent = chargePercent;
    }
    public float getChargePercent() {
        return chargePercent;
    }
    public void setChargePercent(float chargePercent) {
        this.chargePercent = chargePercent;
    }
    
}
class Screen{
    String resolution;

    public Screen(String resolution) {
        this.resolution = resolution;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    
}