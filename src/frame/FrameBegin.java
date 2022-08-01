package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameBegin extends JPanel {

   public FrameBegin() {
      //JPanel 기본구조
      setBackground(new Color(255,241,54));//바탕 화면 색깔
      setLayout(null);//?
      setSize(600,800);//상자 사이즈
      
      //포스터 이미지
      ImageIcon cinema=new ImageIcon("MSG.jpg"); //그림불러오기
      JLabel lblCinema=new JLabel(cinema); //그림 붙이기
      lblCinema.setSize(600,620); //이미지 사이즈
      lblCinema.setLocation(-15,0);//포스터 자리 좌표 
      add(lblCinema);//넣어주기
      
      //하단의 버튼 설정
      JButton btnInfo=new JButton("영화 예매");//왼쪽 버튼 이름
      JButton btnPost=new JButton("영화 평가하기");//오른쪽 버튼 이름
      
      btnInfo.setBackground(new Color(183,240,117));//왼쪽 버튼 색상
      btnPost.setBackground(new Color(183,240,117));//오른쪽 버튼 색상
      //영화예매버튼
      btnInfo.setSize(300, 150);//버튼 가로세로 크기 
      btnInfo.setLocation(((int)getSize().getWidth()/2)-310, //버튼 위치
                     ((int)getLocation().getY()/2)+610); //아래로 위치됨
      
      btnInfo.setFont(new Font("굴림", Font.BOLD, 26));
      //영화평점버튼
      btnPost.setSize(300, 150);
      btnPost.setLocation((int)btnInfo.getLocation().getX()+300, 
                     (int)btnInfo.getLocation().getY());
      
      btnPost.setFont(new Font("굴림", Font.BOLD, 26));//버튼 폰트
      
      add(btnInfo); //버튼 삽입
      add(btnPost);
      
      //버튼 이벤트
      btnInfo.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            FrameBase.getInstance(new FrameMovieSelect());
            
         }
      });
      
      btnPost.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            FrameBase.getInstance(new FrameMovieReview());
            
         }
      });
      
   }
   
}