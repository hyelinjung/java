package P290;

public class DmbCellPhone extends CellPhone{
//�ʵ�
	int channel;
	
	//������
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel =channel;
		
	}
	//�޼ҵ�
	void turnOnDmb() { System.out.println("���" + channel + "�� DMB ��� ������ �����մϴ�.");}  
	void changeChannelDmb(int channel) { System.out.println("���" + channel + "�� ���� �ٲߴϴ�.");}  
	void turnOffDmb() { System.out.println("DMB ��� ������ ����ϴ�.");}  
}
