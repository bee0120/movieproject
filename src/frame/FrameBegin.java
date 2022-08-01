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
      //JPanel �⺻����
      setBackground(new Color(255,241,54));//���� ȭ�� ����
      setLayout(null);//?
      setSize(600,800);//���� ������
      
      //������ �̹���
      ImageIcon cinema=new ImageIcon("MSG.jpg"); //�׸��ҷ�����
      JLabel lblCinema=new JLabel(cinema); //�׸� ���̱�
      lblCinema.setSize(600,620); //�̹��� ������
      lblCinema.setLocation(-15,0);//������ �ڸ� ��ǥ 
      add(lblCinema);//�־��ֱ�
      
      //�ϴ��� ��ư ����
      JButton btnInfo=new JButton("��ȭ ����");//���� ��ư �̸�
      JButton btnPost=new JButton("��ȭ ���ϱ�");//������ ��ư �̸�
      
      btnInfo.setBackground(new Color(183,240,117));//���� ��ư ����
      btnPost.setBackground(new Color(183,240,117));//������ ��ư ����
      //��ȭ���Ź�ư
      btnInfo.setSize(300, 150);//��ư ���μ��� ũ�� 
      btnInfo.setLocation(((int)getSize().getWidth()/2)-310, //��ư ��ġ
                     ((int)getLocation().getY()/2)+610); //�Ʒ��� ��ġ��
      
      btnInfo.setFont(new Font("����", Font.BOLD, 26));
      //��ȭ������ư
      btnPost.setSize(300, 150);
      btnPost.setLocation((int)btnInfo.getLocation().getX()+300, 
                     (int)btnInfo.getLocation().getY());
      
      btnPost.setFont(new Font("����", Font.BOLD, 26));//��ư ��Ʈ
      
      add(btnInfo); //��ư ����
      add(btnPost);
      
      //��ư �̺�Ʈ
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