public class Tv implements CanOnOff, CanChangeChannel, CanChangeVolume{
    private boolean isOn = false;
    private int channel =1;
    private int volume = 1;

    @Override
    public void off() {
        // TODO Auto-generated method stub
        isOn=false;
    }

    @Override
    public void on() {
        // TODO Auto-generated method stub
        isOn=true;
    }

    @Override
    public void channelDown() {
        // TODO Auto-generated method stub
        if (channel>1 && isOn){
            channel--;
        }
    }

    @Override
    public void channelUp() {
        // TODO Auto-generated method stub
        if (channel<99 && isOn){
            channel++;
        }
    }

    @Override
    public void setChannel(int channelNo) {
        // TODO Auto-generated method stub
        if (channelNo>=1 && channelNo<=99 && isOn){
            channel= channelNo;
        }
    }
    

    @Override
    public void volumeDown() {
        // TODO Auto-generated method stub
        if (volume>0 && volume <=10 && isOn){
            volume--;
        }
    }

    @Override
    public void volumeUp() {
        // TODO Auto-generated method stub
        if (volume>=0 && volume <10 && isOn){
            volume++;
        }
    }

    public void status(){
        if (isOn){
            System.out.println("The tv is on: "+ isOn+" | The channel is: "+channel + " | volume: "+ volume);
        } else {
            System.out.println("The tv is on: "+ isOn);
        }
    }


    
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.on();
        tv.status();
        tv.channelUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.volumeUp();
        tv.setChannel(7);
        tv.setChannel(142);
        tv.status();
        tv.channelDown();
        tv.status();
        tv.off();
        tv.status();
    }
}
