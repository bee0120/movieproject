package frame;

import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//���� ���� ������
import javax.swing.JFrame;

import movieVo.Movie;

public class FrameReviewRead extends JFrame {

	public FrameReviewRead(Movie m) {
		// �ı� ��� â
		TextArea review = new TextArea("����\t�̸�\t\t\t������\n", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);

		// â �ٹ̱�
		review.setEditable(false);
		review.append(m.getReview());
		review.setSize(800, 300);
		review.setLocation(700, 200);
		review.setFont(new Font("�������", Font.PLAIN, 18));
		add(review);

		Frame fr = new Frame();
		fr.setTitle(m.getmName() + "�� ����");
		fr.setSize(800, 300);
		fr.setLocation(700, 200);
		fr.add(review);
		fr.setVisible(true);

		fr.addWindowListener(new WindowAdapter() { //�ݱ� ��ư
		
			@Override
			public void windowClosing(WindowEvent e) {
				fr.setVisible(false);
				fr.dispose();
			}
		});
		
	}

}
