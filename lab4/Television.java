/** 
*The purpose of this class is to model a television
*Edward Gregg 20200216
*/

public class Television {
	//holds the brand name. This cannot change.
	private final String MANUFACTURER;
	//holds the size of the television. This cannot change.
	private final int SCREEN_SIZE;
	
	//hold the value true if the power is on
	private boolean powerOn;
	//hold the value of the station that the television is showing
	private int channel;
	//holds the number value representing the loudness (0 being no sound)
	private int volume;

	//initializes the Television object
	public Television(String brand, int size)
	{
		this.MANUFACTURER = brand;
		this.SCREEN_SIZE = size;
		this.powerOn = false;
		this.volume = 20;
		this.channel = 2;
	}
	
	/**
	 * accessor to see the current volume
	 * @return
	 */
	public int getVolume()
	{
		return volume;
	}
	
	
	/**
	 * accessor to see the current channel
	 * @return
	 */
	public int getChannel()
	{
		return channel;
	}
	
	/**
	 * accessor to see the manufacturer of the television
	 * @return
	 */
	public String getManufacturer() 
	{
		return MANUFACTURER;
	}
	
	
	/**
	 * accessor to see the size of the television
	 * @return
	 */
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
	
	public void setChannel(int changeChannel) {
		channel = changeChannel;
	}
	
	/**
	 * turns the television off and on
	 */
	public void power()
	{
		powerOn = !powerOn;
	}
	
	/**
	 * mutator to increase the volume by 1
	 */
	public void increaseVolume()
	{
		volume++;
	}
	
	/**
	 * mutator to decrease the volume by 1
	 */
	public void decreaseVolume() {
		volume--;
	}
}
