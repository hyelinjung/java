package P290;

public class DmbCellPhone extends CellPhone{
//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel =channel;
		
	}
	//메소드
	void turnOnDmb() { System.out.println("재널" + channel + "번 DMB 방송 수신을 시작합니다.");}  
	void changeChannelDmb(int channel) { System.out.println("재널" + channel + "번 으로 바꿉니다.");}  
	void turnOffDmb() { System.out.println("DMB 방송 수신을 멈춥니다.");}  
}
