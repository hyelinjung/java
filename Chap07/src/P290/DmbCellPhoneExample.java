package P290;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		//DubCellPhone ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���","�˵�",10);
		
		
		//CellPhone���� ���� ��ӹ��� �ʵ�
		System.out.println("��:" + dmbCellPhone.model);
		System.out.println("����:" + dmbCellPhone.color);
		//DubCellPhone�� �ʵ�
		System.out.println("ä��:" + dmbCellPhone.channel);
		
		//CellPhone���� ���� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbCellPhone.hangUp();
		//DubCellPhone�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
