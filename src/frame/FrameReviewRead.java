package frame;

import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//리뷰 보기 페이지
import javax.swing.JFrame;

import movieVo.Movie;

public class FrameReviewRead extends JFrame {

	public FrameReviewRead(Movie m) {
		// 후기 출력 창
		TextArea review = new TextArea("평점\t이름\t\t\t한줄평\n", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);

		// 창 꾸미기
		review.setEditable(false);
		review.append(m.getReview());
		review.setSize(800, 300);
		review.setLocation(700, 200);
		review.setFont(new Font("맑은고딕", Font.PLAIN, 18));
		add(review);

		Frame fr = new Frame();
		fr.setTitle(m.getmName() + "의 리뷰");
		fr.setSize(800, 300);
		fr.setLocation(700, 200);
		fr.add(review);
		fr.setVisible(true);

		fr.addWindowListener(new WindowAdapter() { //닫기 버튼
		
			@Override
			public void windowClosing(WindowEvent e) {
				fr.setVisible(false);
				fr.dispose();
			}
		});
		
	}

}
