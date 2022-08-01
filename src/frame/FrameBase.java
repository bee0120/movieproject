package frame;
//무비
//vo(value object)-보관용, dto
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameBase extends JFrame{
	
	private static FrameBase instance;
	
	public FrameBase(JPanel e) { //모니터 화면 중앙에 띄우기
					//JFrame사용할 경우 여기 변수에 JFrame 입력
		
		//해상도
		Toolkit tk=Toolkit.getDefaultToolkit();
		
		//기본 JFrame 환경설정
		setTitle("영화 예매 프로그램"); //JFrame창의 이름
		setLayout(null); //화면 구성?
		setBounds(((int)(tk.getScreenSize().getWidth()))/2-300, //x좌표
				 ((int)(tk.getScreenSize().getHeight()))/2-400, //y좌표
						 600,800); //상자 사이즈
		
		add(e); //이벤트> 적용 (본체 값 적용)
		setVisible(true); //모니터 보여주기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x(닫기)버튼 활성화
	}//생성자
	
	//싱글톤 기법 사용을 위한 메서드 (getinstance를 사용해서만 불러올 수 있음)
	static public void getInstance(JPanel e) {  
	instance=new FrameBase(e);
	
	instance.getContentPane().removeAll(); //지우기
	instance.getContentPane().add(e);//더해주고
	
	instance.revalidate();//초기화
	instance.repaint(); //그리기
	}
}
