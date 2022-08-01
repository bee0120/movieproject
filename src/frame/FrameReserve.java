package frame;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import movieDAO.MovieDAO;
import movieVo.Movie;
import movieVo.MyMovie;

public class FrameReserve extends JPanel {

	public FrameReserve(Movie m) {
		// JPanel����
		// �⺻ â ���,����
		setBackground(new Color(0xFFD700));
		setLayout(null);
		setSize(600, 800);

		// ���κ�
		JPanel top = new JPanel();
		top.setBackground(new Color(0xFFD700));
		top.setLayout(null);
		top.setSize(600, 300);
		top.setLocation(0, 0);
		// �߰��κ�
		JPanel center = new JPanel();
		center.setBackground(new Color(0xFFD700));
		center.setLayout(new GridLayout(5, 8));// üũ�� �迭��
		center.setSize(600, 350); // ���δ� 600���� ���� 350���� ���α��̸� ����
		center.setLocation(0, 305);
		// �Ʒ��κ�
		JPanel bottom = new JPanel();
		bottom.setBackground(new Color(0xFFD700));
		bottom.setLayout(null);
		bottom.setSize(600, 200);
		bottom.setLocation(0, 660);

		// TOP�κ� JPanel(��ȭ ������, �̸�, �ð���)
		final int movieNum = 8;
		int movieflag = 0;
		String[] movieurl = { "��󷣵�.png", "���Ҽ����º��.jpg", "�λ��̵�ƿ�.png", "�ܿ�ձ�.png", "��Űű��־��ٷ���.png", "�����̴���.png",
				"�����.png", "�λ���.png" };

		ImageIcon[] movieImg = new ImageIcon[movieNum]; // �̹��� ���� ���� Ȯ��

		for (int i = 0; i < movieNum; i++) {
			movieImg[i] = new ImageIcon(movieurl[i]); // �̹��� ����
			if (m.getmName().equals("��󷣵�")) {
				movieflag = 0;
			} else if (m.getmName().equals("���Ҽ����º��")) {
				movieflag = 1;
			} else if (m.getmName().equals("�λ��̵�ƿ�")) {
				movieflag = 2;
			} else if (m.getmName().equals("�ܿ�ձ�")) {
				movieflag = 3;
			} else if (m.getmName().equals("��Űű��־��ٷ���")) {
				movieflag = 4;
			} else if (m.getmName().equals("�����̴���")) {
				movieflag = 5;
			} else if (m.getmName().equals("�����̴���")) {
				movieflag = 5;
			} else if (m.getmName().equals("�����")) {
				movieflag = 6;
			} else if (m.getmName().equals("�λ���")) {
				movieflag = 7;
			}
		} // for end

		JLabel img = new JLabel(movieImg[movieflag]); // ������ �̹��� ���̱� *�̹����� JLabel�� �ٿ�����
		img.setBounds(50, 15, 175, 248);

		JLabel name = new JLabel(m.getmName()); // JLabel�� �ؽ�Ʈ �ҷ�����
		name.setFont(new Font("��������ڵ�", Font.BOLD, 32));
		name.setBounds(260, 35, 300, 175);

		// choice��ư ����� ����(���� �ڽ�)
		Choice movieTime = new Choice();

		// ��¥ ǥ�� ��Ʈ(�ϱ� �ʼ�)
		long time = System.currentTimeMillis(); // ���� �ð����� ���
		SimpleDateFormat dayTime = new SimpleDateFormat("MM�� dd��(EE)");// (EE:����)
		String str = dayTime.format(new Date(time));

		String[] timeSlot = { "�ð��� ����", str + " 06:30~08:30", str + " 09:00~11:00", str + " 11:30~13:30",
				str + " 14:00~16:00", str + " 16:30~18:30", str + " 19:00~21:30", str + " 22:00~00:00",
				str + " 00:30~02:30" };

		for (int i = 0; i < timeSlot.length; i++) {
			movieTime.add(timeSlot[i]);
		} // for�� end
			// choice���� ��ġ�� ũ��
		movieTime.setFont(new Font("��������ڵ�", Font.PLAIN, 18));
		movieTime.setSize(270, 200);
		movieTime.setLocation(260, 200); // �ؽ�Ʈ�� ���� ��ġ�� �����ֱ�

		// -----------------------------------��ܺ�
		// ��----------------------------------------------

		// ��ܺ�
		JLabel screen = new JLabel("[�� ũ ��]");
		screen.setFont(new Font("��������ڵ�", Font.BOLD, 32));
		screen.setBounds(180, 223, 240, 120);
		screen.setVisible(false);

		// �߾Ӻ� JPanel(�¼� ����)
		ButtonGroup bg = new ButtonGroup();
		final int seatNum = 5 * 8; // 40�� �¼� ����°�
		JRadioButton[] seatChoice = new JRadioButton[seatNum];
		String[] seatn = { "1", "2", "3", "4", "5", "6", "7", "8" };
		String seatAl = "A";

		for (int i = 0; i < 5; i++) {

			if (i == 1) {
				seatAl = "B";
			} else if (i == 2) {
				seatAl = "C";
			} else if (i == 3) {
				seatAl = "D";
			} else if (i == 4) {
				seatAl = "E";
			}

			for (int j = 0; j < 8; j++) { // 8�� ���°�
				seatChoice[(i * 8) + j] = new JRadioButton(seatAl + seatn[j]);
				bg.add(seatChoice[(i * 8) + j]); // �� �� ������ �гο� �ٿ��ַ��� �����
				center.add(seatChoice[(i * 8) + j]);
				seatChoice[(i * 8) + j].setVisible(false);
			} // in for�� end
		} // out for�� end

		// -------------------------------�߾Ӻ� ��------------------------------------

		// �ϴܺ�
		JButton btnBack = new JButton("�ڷΰ���");
		//(��� ���� �����°��� �ľ� �ʿ� get.set���ַ� �ڵ� ����)
		btnBack.setBackground(new Color(0xA6A6A6));
		btnBack.setSize(183, 87);
		btnBack.setLocation(5, 0);
		btnBack.setFont(new Font("��������ڵ�", Font.BOLD, 22));
		bottom.add(btnBack);

		btnBack.addActionListener(new ActionListener() { // �׼�

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameMovieInfo(m));
			}
		});
		JButton btnHome = new JButton("ó�� ȭ������");

		btnHome.setBackground(new Color(0xA6A6A6));
		btnHome.setSize(183, 87);
		btnHome.setLocation(198, 0);
		btnHome.setFont(new Font("��������ڵ�", Font.BOLD, 22));
		bottom.add(btnHome);

		btnHome.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBegin());
			}
		});

		// �����ϱ�

		JButton btnBuy = new JButton("�����ϱ�");

		btnBuy.setBackground(new Color(0xA6A6A6));
		btnBuy.setSize(183, 87);
		btnBuy.setLocation(391, 0);
		btnBuy.setFont(new Font("��������ڵ�", Font.BOLD, 22));
		bottom.add(btnBuy);

		// �����ϱ� �׼�
		btnBuy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				MyMovie myM = new MyMovie();
				myM.setmName(m.getmName());
				myM.setTime(movieTime.getSelectedItem()); // choice box���� �����Ѱ� �������
				int seatIndex = -1;

				for (int i = 0; i < seatNum; i++) { // 40��
					if (seatChoice[i].isSelected()) { // 8�� �¼� �� ���� ������ �� ǥ��
						seatIndex = i; // ??

					}
				}
				// �ð�,�¼� ���� ������ ��츦 ���� ���� ó��
				if (movieTime.getSelectedItem().equals("�ð��� ����")) { // �ð� ���� ������ ���
					JOptionPane.showMessageDialog(null, "�ð��� �������ּ���");
				} else if (seatIndex == -1) {
					JOptionPane.showMessageDialog(null, "�¼��� �������ּ���");

				} else {
					myM.setSeat(seatChoice[seatIndex].getText()); // ������ ������ ��� �̹� �����
					// ���� ���� �ڵ� �߰�
					FrameBase.getInstance(new FrameMovieConfirm(m, myM));
				}

			}
		});// addActionListenner

		top.add(img);
		top.add(name);
		top.add(movieTime);
		top.add(screen);

		add(top);
		add(center);
		add(bottom);

		// �̹� ����� �������� Ȯ��
		movieTime.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				for (int i = 0; i < seatNum; i++) {
					seatChoice[i].setVisible(true); //

				}
				// �ð��� �������� �Ǿ����� ��� (�¼� ���� �޴� ��ų���) -�ƹ��͵� �Ⱥ���
				if (e.getItem().equals("�ð��� ����")) { // ������ �Ǿ��ִ°��
					for (int i = 0; i < seatNum; i++) {// ���� ���� ���ϵ��� ��Ȱ��ȭ
						seatChoice[i].setVisible(false); // ���������� ���̻� ���� ���ϵ��� ��ų��
						screen.setVisible(false);
					}
				} else { // '�ð��� ����' ������ �Ⱥ��̰� �ð��� ���õ� ��� (�¼� ���� �޴� Ȱ��ȭ)
					for (int i = 0; i < seatNum; i++) {
						seatChoice[i].setVisible(true); // ���þ�������� �¼� ����â Ȱ��ȭ
						screen.setVisible(true);
					}
				}

				MovieDAO setSeat = new MovieDAO();
				for (int j = 0; j < seatNum; j++) {
					// dupseat�޼��带 �̿��Ͽ� ���Ÿ� Ȯ���ϰ� ���ŵ� �¼��� ��Ȱ��ȭ �Ѵ�
					if (setSeat.dupSeat(m.getmName(), e.getItem().toString(), seatChoice[j].getText())) {
						; // gettext�� �ؾ��ϳ�?
					seatChoice[j].setEnabled(false);
				}//if 
				}//for

			}//itemstatechanged
		});//additemListener(�׼�)

	}//������
}// class
