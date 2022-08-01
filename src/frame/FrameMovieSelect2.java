package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import movieDAO.MovieDAO;
import movieVo.Movie;

public class FrameMovieSelect2 extends JPanel {

	public FrameMovieSelect2() {
		setBackground(new Color(0xFFD700));
	      setLayout(null);
	      setSize(600, 2000);

	      // ���� �ȿ� ����ִ� �̹��� ���� ��� ������ image/"��Űű��־��ٷ���.png"
	      ImageIcon movie1 = new ImageIcon("��Űű��־��ٷ���.png"); //�̹��� �������ֱ�
	      JButton btnMovie1 = new JButton(movie1); //��ư�� ������ �������ֱ�
	      btnMovie1.setName("��Űű��־��ٷ���"); //��ư ������ ������ �̸� �����ֱ� 

	      btnMovie1.setSize(185, 250);//��ư ������ ������ ������ ������ ����
	      btnMovie1.setLocation(72, 30);//��Ʈ ������ �ߴ� ������ ��ġ ����
	      add(btnMovie1);//���� �� �������ֱ�

	      btnMovie1.addActionListener(new ActionListener() { //��ư 1�� �׼� �־��ֱ�

	         @Override
	         public void actionPerformed(ActionEvent e) {
	        	 MovieDAO md=new MovieDAO(); //��ȭ�� ���� �� ����?��°� ����
	        	 Movie movie4=md.searchMovie("��Űű��־��ٷ���"); //movie4 ��ȭ�� ���� ���� �ҷ����� 
	        	 FrameBase.getInstance(new FrameMovieInfo(movie4));
	         }
	      });

	      // -----------------------------------------------------

	      // ��ȭ2�� ����
	      ImageIcon movie2 = new ImageIcon("�����̴���.png");
	      JButton btnMovie2 = new JButton(movie2);
	      btnMovie2.setName("�����̴���");

	      btnMovie2.setSize(185, 250);
	      btnMovie2.setLocation(320, 30);
	      add(btnMovie2);

	      btnMovie2.addActionListener(new ActionListener() {

	         @Override
	         public void actionPerformed(ActionEvent e) {
	        	 Movie movie5=new MovieDAO().searchMovie("�����̴���");
	        	 FrameBase.getInstance(new FrameMovieInfo(movie5));
	         }
	      });

	      // -----------------------------------------------------

	      // ��ȭ3�� ����
	      ImageIcon movie3 = new ImageIcon("�����.png");
	      JButton btnMovie3 = new JButton(movie3);
	      btnMovie3.setName("�����");

	      btnMovie3.setSize(185, 250);
	      btnMovie3.setLocation(72, 340);
	      add(btnMovie3);

	      btnMovie3.addActionListener(new ActionListener() {

	         @Override
	         public void actionPerformed(ActionEvent e) {
	        	 Movie movie6=new MovieDAO().searchMovie("�����");
	        	 FrameBase.getInstance(new FrameMovieInfo(movie6));
	         }
	      });

	      // -----------------------------------------------------

	      // ��ȭ4�� ����
	      ImageIcon movie4 = new ImageIcon("�λ���.png");
	      JButton btnMovie4 = new JButton(movie4);
	      btnMovie4.setName("�λ���");

	      btnMovie4.setSize(185, 250);
	      btnMovie4.setLocation(320, 340);
	      add(btnMovie4);
	      
	      btnMovie4.addActionListener(new ActionListener() {
	         
	         @Override
	         public void actionPerformed(ActionEvent e) {
	        	 Movie movie7=new MovieDAO().searchMovie("�λ���");
	        	 FrameBase.getInstance(new FrameMovieInfo(movie7));
	         }
	      });
	      
	      // �ϴ� ��ư
	      JPanel bottomSet = new JPanel();

	      bottomSet.setBounds(0, 660, 600, 100);
	      bottomSet.setLayout(null);
	      bottomSet.setBackground(new Color(0xFFD700));

	      JButton btnBack = new JButton("�ڷΰ���");

	      btnBack.setBackground(new Color(0xA6A6A6));
	      btnBack.setSize(183, 87);
	      btnBack.setLocation(5, 0);
	      btnBack.setFont(new Font("��������ڵ�", Font.BOLD, 22));
	      bottomSet.add(btnBack);
	      
	      btnBack.addActionListener(new ActionListener() {
	         
	         @Override
	         public void actionPerformed(ActionEvent e) {
	          FrameBase.getInstance(new FrameMovieSelect()); //���� �������� ������ 
	         }
	      });
	      
	      JButton btnNext = new JButton("ó�� ȭ������ ");

	      btnNext.setBackground(new Color(0xA6A6A6));
	      btnNext.setSize(183, 87);
	      btnNext.setLocation(391, 0);
	      btnNext.setFont(new Font("��������ڵ�", Font.BOLD, 22));
	      bottomSet.add(btnNext);
	      
	      btnNext.addActionListener(new ActionListener() {
	         
	         @Override
	         public void actionPerformed(ActionEvent e) {
	        	 FrameBase.getInstance(new FrameBegin());
	         }
	      });
	      JButton btnBuy = new JButton("�����ϱ�");

			btnBuy.setBackground(new Color(0xA6A6A6));
			btnBuy.setSize(183, 87);
			btnBuy.setLocation(391, 0);
			btnBuy.setFont(new Font("��������ڵ�", Font.BOLD, 22));
			bottomSet.add(btnBuy);
	      
			btnBuy.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			
			
	      add(bottomSet, BorderLayout.SOUTH);

	}//������
	
}
