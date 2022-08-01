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
		// JPanel구조
		// 기본 창 배경,구성
		setBackground(new Color(0xFFD700));
		setLayout(null);
		setSize(600, 800);

		// 윗부분
		JPanel top = new JPanel();
		top.setBackground(new Color(0xFFD700));
		top.setLayout(null);
		top.setSize(600, 300);
		top.setLocation(0, 0);
		// 중간부분
		JPanel center = new JPanel();
		center.setBackground(new Color(0xFFD700));
		center.setLayout(new GridLayout(5, 8));// 체크로 배열함
		center.setSize(600, 350); // 가로는 600으로 맞춤 350으로 세로길이만 변경
		center.setLocation(0, 305);
		// 아랫부분
		JPanel bottom = new JPanel();
		bottom.setBackground(new Color(0xFFD700));
		bottom.setLayout(null);
		bottom.setSize(600, 200);
		bottom.setLocation(0, 660);

		// TOP부분 JPanel(영화 포스터, 이름, 시간대)
		final int movieNum = 8;
		int movieflag = 0;
		String[] movieurl = { "라라랜드.png", "말할수없는비밀.jpg", "인사이드아웃.png", "겨울왕국.png", "당신거기있어줄래요.png", "스파이더맨.png",
				"어벤져스.png", "부산행.png" };

		ImageIcon[] movieImg = new ImageIcon[movieNum]; // 이미지 넣을 공간 확보

		for (int i = 0; i < movieNum; i++) {
			movieImg[i] = new ImageIcon(movieurl[i]); // 이미지 저장
			if (m.getmName().equals("라라랜드")) {
				movieflag = 0;
			} else if (m.getmName().equals("말할수없는비밀")) {
				movieflag = 1;
			} else if (m.getmName().equals("인사이드아웃")) {
				movieflag = 2;
			} else if (m.getmName().equals("겨울왕국")) {
				movieflag = 3;
			} else if (m.getmName().equals("당신거기있어줄래요")) {
				movieflag = 4;
			} else if (m.getmName().equals("스파이더맨")) {
				movieflag = 5;
			} else if (m.getmName().equals("스파이더맨")) {
				movieflag = 5;
			} else if (m.getmName().equals("어벤져스")) {
				movieflag = 6;
			} else if (m.getmName().equals("부산행")) {
				movieflag = 7;
			}
		} // for end

		JLabel img = new JLabel(movieImg[movieflag]); // 라벨지에 이미지 붙이기 *이미지는 JLabel에 붙여야함
		img.setBounds(50, 15, 175, 248);

		JLabel name = new JLabel(m.getmName()); // JLabel로 텍스트 불러오기
		name.setFont(new Font("나눔고딕코딩", Font.BOLD, 32));
		name.setBounds(260, 35, 300, 175);

		// choice버튼 만들기 선언(선택 박스)
		Choice movieTime = new Choice();

		// 날짜 표시 세트(암기 필수)
		long time = System.currentTimeMillis(); // 현재 시간분초 출력
		SimpleDateFormat dayTime = new SimpleDateFormat("MM월 dd일(EE)");// (EE:요일)
		String str = dayTime.format(new Date(time));

		String[] timeSlot = { "시간대 선택", str + " 06:30~08:30", str + " 09:00~11:00", str + " 11:30~13:30",
				str + " 14:00~16:00", str + " 16:30~18:30", str + " 19:00~21:30", str + " 22:00~00:00",
				str + " 00:30~02:30" };

		for (int i = 0; i < timeSlot.length; i++) {
			movieTime.add(timeSlot[i]);
		} // for문 end
			// choice상자 위치와 크기
		movieTime.setFont(new Font("나눔고딕코딩", Font.PLAIN, 18));
		movieTime.setSize(270, 200);
		movieTime.setLocation(260, 200); // 텍스트와 같은 위치로 맞춰주기

		// -----------------------------------상단부
		// 끝----------------------------------------------

		// 상단부
		JLabel screen = new JLabel("[스 크 린]");
		screen.setFont(new Font("나눔고딕코딩", Font.BOLD, 32));
		screen.setBounds(180, 223, 240, 120);
		screen.setVisible(false);

		// 중앙부 JPanel(좌석 선택)
		ButtonGroup bg = new ButtonGroup();
		final int seatNum = 5 * 8; // 40개 좌석 만드는것
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

			for (int j = 0; j < 8; j++) { // 8번 도는것
				seatChoice[(i * 8) + j] = new JRadioButton(seatAl + seatn[j]);
				bg.add(seatChoice[(i * 8) + j]); // 젤 위 한줄을 패널에 붙여주려고 만든것
				center.add(seatChoice[(i * 8) + j]);
				seatChoice[(i * 8) + j].setVisible(false);
			} // in for문 end
		} // out for문 end

		// -------------------------------중앙부 끝------------------------------------

		// 하단부
		JButton btnBack = new JButton("뒤로가기");
		//(어디서 끌고 들어오는건지 파악 필요 get.set위주로 코드 보기)
		btnBack.setBackground(new Color(0xA6A6A6));
		btnBack.setSize(183, 87);
		btnBack.setLocation(5, 0);
		btnBack.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottom.add(btnBack);

		btnBack.addActionListener(new ActionListener() { // 액션

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameMovieInfo(m));
			}
		});
		JButton btnHome = new JButton("처음 화면으로");

		btnHome.setBackground(new Color(0xA6A6A6));
		btnHome.setSize(183, 87);
		btnHome.setLocation(198, 0);
		btnHome.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottom.add(btnHome);

		btnHome.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameBase.getInstance(new FrameBegin());
			}
		});

		// 결제하기

		JButton btnBuy = new JButton("결제하기");

		btnBuy.setBackground(new Color(0xA6A6A6));
		btnBuy.setSize(183, 87);
		btnBuy.setLocation(391, 0);
		btnBuy.setFont(new Font("나눔고딕코딩", Font.BOLD, 22));
		bottom.add(btnBuy);

		// 결제하기 액션
		btnBuy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				MyMovie myM = new MyMovie();
				myM.setmName(m.getmName());
				myM.setTime(movieTime.getSelectedItem()); // choice box에서 선택한것 끌어오기
				int seatIndex = -1;

				for (int i = 0; i < seatNum; i++) { // 40개
					if (seatChoice[i].isSelected()) { // 8개 좌석 중 내가 선택한 것 표시
						seatIndex = i; // ??

					}
				}
				// 시간,좌석 선택 안했을 경우를 위한 예외 처리
				if (movieTime.getSelectedItem().equals("시간대 선택")) { // 시간 선택 안했을 경우
					JOptionPane.showMessageDialog(null, "시간을 선택해주세요");
				} else if (seatIndex == -1) {
					JOptionPane.showMessageDialog(null, "좌석을 선택해주세요");

				} else {
					myM.setSeat(seatChoice[seatIndex].getText()); // 오류가 없었을 경우 이미 저장됨
					// 결제 성공 코드 추가
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

		// 이미 예약된 정보인지 확인
		movieTime.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				for (int i = 0; i < seatNum; i++) {
					seatChoice[i].setVisible(true); //

				}
				// 시간대 선택으로 되어있을 경우 (좌석 선택 메뉴 잠궈놓기) -아무것도 안보임
				if (e.getItem().equals("시간대 선택")) { // 선택이 되어있는경우
					for (int i = 0; i < seatNum; i++) {// 이후 선택 못하도록 비활성화
						seatChoice[i].setVisible(false); // 선택했으면 더이상 선택 못하도록 잠궈논것
						screen.setVisible(false);
					}
				} else { // '시간대 선택' 문구가 안보이고 시간이 선택된 경우 (좌석 선택 메뉴 활성화)
					for (int i = 0; i < seatNum; i++) {
						seatChoice[i].setVisible(true); // 선택안했을경우 좌석 선택창 활성화
						screen.setVisible(true);
					}
				}

				MovieDAO setSeat = new MovieDAO();
				for (int j = 0; j < seatNum; j++) {
					// dupseat메서드를 이용하여 예매를 확인하고 예매된 좌석은 비활성화 한다
					if (setSeat.dupSeat(m.getmName(), e.getItem().toString(), seatChoice[j].getText())) {
						; // gettext왜 해야하나?
					seatChoice[j].setEnabled(false);
				}//if 
				}//for

			}//itemstatechanged
		});//additemListener(액션)

	}//생성자
}// class
