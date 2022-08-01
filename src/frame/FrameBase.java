package frame;
//����
//vo(value object)-������, dto
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameBase extends JFrame{
	
	private static FrameBase instance;
	
	public FrameBase(JPanel e) { //����� ȭ�� �߾ӿ� ����
					//JFrame����� ��� ���� ������ JFrame �Է�
		
		//�ػ�
		Toolkit tk=Toolkit.getDefaultToolkit();
		
		//�⺻ JFrame ȯ�漳��
		setTitle("��ȭ ���� ���α׷�"); //JFrameâ�� �̸�
		setLayout(null); //ȭ�� ����?
		setBounds(((int)(tk.getScreenSize().getWidth()))/2-300, //x��ǥ
				 ((int)(tk.getScreenSize().getHeight()))/2-400, //y��ǥ
						 600,800); //���� ������
		
		add(e); //�̺�Ʈ> ���� (��ü �� ����)
		setVisible(true); //����� �����ֱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x(�ݱ�)��ư Ȱ��ȭ
	}//������
	
	//�̱��� ��� ����� ���� �޼��� (getinstance�� ����ؼ��� �ҷ��� �� ����)
	static public void getInstance(JPanel e) {  
	instance=new FrameBase(e);
	
	instance.getContentPane().removeAll(); //�����
	instance.getContentPane().add(e);//�����ְ�
	
	instance.revalidate();//�ʱ�ȭ
	instance.repaint(); //�׸���
	}
}
