package Javafsd;

class Tv {
    int channel=1;
    int volumeLevel=1;
    boolean on=false;
    
    public Tv() {
    }
    public void turnon() {
    	on=true;
    }
    public void turnoff() {
    	on=false;
    }
    public void setChannel(int newChannel) {
    	if(on && newChannel>=1 && newChannel<=120) 
    		channel=newChannel;
    }
    public void setVolume(int newVolumeLevel) {
    	if(on && newVolumeLevel>=1 && newVolumeLevel<=7) 
    		volumeLevel=newVolumeLevel;
    }
    public void channelUp() {
    	if(on && channel<120)
    		channel++;
    }
    public void channelDown() {
    	if(on && channel<120)
    		channel--;
    }
    public void volumeUp() {
    	if(on && volumeLevel<7)
    		volumeLevel++;
    }
    public void volumeDown() {
    	if(on && volumeLevel<120)
    		volumeLevel--;
    }
    
void print()
{
	System.out.println("Channel : "+channel + "volume : "+volumeLevel);
}
 public static void main(String[] args)
 {
	
	 Tv watch= new Tv();
	 watch.turnon();
	 watch.setChannel(6);
	 watch.setVolume(3);
	 watch.channelUp();
	 watch.volumeUp();
	 watch.print();
	 
	 
 }	

}
