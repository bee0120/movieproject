package movieDAO;
//����Ŭ�� �����ְ� ����Ŭ���� get/set�Ұ� ��� ����

import java.util.ArrayList;

import movieVo.Movie;
import movieVo.MyMovie;

public class MovieDAO {

	// ��ȭ���� ����Ʈ, �������� ����Ʈ
	private static ArrayList<Movie> list;
	private static ArrayList<MyMovie> reservList;

	public MovieDAO() {
		if (list == null) {
			init();
		}
		if (reservList == null) {
			reservList = new ArrayList<MyMovie>();
		}
	}

	// ������ �κ� ���⼭ ���� ����
	private void init() {
		list = new ArrayList<Movie>();

		// ��ȭ ����1
		list.add(new Movie("��󷣵�", 10000, 5,
				"ȲȦ�� ���, ������ ���, �ݷ��� ����... " + "�� ������ ��� ������ �����Ѵ�! ���� �ٴ� ������� ���� ������ ���� ����󷣵塯. ���� �ǾƴϽ�Ʈ "
						+ "�����ٽ�����(���̾� ������)�� ��� ������ ���̾ơ�(���� ����) �λ����� ���� ������ ���� ���� " + "�� ����� �̿ϼ��� ������ ���븦 ������ �����Ѵ�.",
				"5��\t<������>\t������ �Դϴ�. �긤..\n"));

		// ��ȭ ����2
		list.add(new Movie("���Ҽ����º��", 10000, 5,
				"���� �ʸ� �����!�ʵ� ���� ����ϴ�? " + "�����б��� ���� �� ���(�ְɷ�)�� �ƹ����� ������ �޾� �ǾƳ뿡 õ������ ������ ���δ�. "
						+ "�б��� �ѷ����� ��, �ź񽺷��� �ǾƳ� ���ְ� �귯������ �� ���ǽ��� �߰��ϰ� �ǰ�, "
						+ "�װ����� ������(�����)�� ������. �׵��� �Ƹ��ٿ� �ǾƳ� ����ó�� ��ſ� �ð��� ������, "
						+ "�� ���̿��� ��ƶ�� ������ ��ư��. �׷��� ����� �������� �� �˰� �;��� ������ �׳�� ����̶�� "
						+ "�ϰ��ϸ� �ǹ̽����� �̼Ҹ� ���´�. �׷��� ��� ��, �������� ����� ���� �� ���л� Ī��� �ǻ��ϴ� " + "����� ���� �ǰ�, ���� �翡�� ������µ���",
				"5��\t<������>\t�ǾƳ� ��Ʋ����� �λ����̾����ϴ�...��\n"));
		
		//��ȭ ����3
		list.add(new Movie("�λ��̵�ƿ�", 10000, 4, 
				"��������, �� �� �� �ž�! �츮�� �ູ�ϰ� ����� �ٰԡ� ��� ����� �Ӹ��ӿ� �����ϴ� ���� ��Ʈ�� ���� " 
						+"�װ����� ��ö�־� ������ ���ϴ� ���, ����, ����, ��ĥ, �ҽ� �ټ� ������. �̻� �� ���ο� ȯ�濡 "
						+"�����ؾ� �ϴ� �����ϸ����� ���� �� ��� �� ���� �ٻڰ� ������ ��ȣ�� �������� �쿬�� �Ǽ��� ����ݡ��� "
						+"�����ġ��� ���θ� ��Ż�ϰ� ���� '���ϸ����� ���� �ӿ� ū ��ȭ�� ã�ƿ´�. '���ϸ�'�� ������ ����� "
						+"��ã�� ���ؼ��� ����ݡ��� �����ġ��� ���η� ���ư��߸� �Ѵ�! �׷��� ��û�� ������ ����Ǿ� �ִ� "
						+"�Ӹ��� ���迡�� ���α��� ���� ���� �賭�ϱ⸸ �ѵ��� ����, �����ϸ����� �ٽ� �ູ���� �� ������? "
						+"���� ����� �Ӹ��ӿ��� �������� ���� ��! �Ϸ翡�� ����� ���ϴ� ������ ����� ��������!",
		"4��\t<������>\t�ִϸ��̼��� ���� ��� ó���̶��...����\n"));
		
		//��ȭ ����4

		list.add(new Movie("�ܿ�ձ�", 10000, 5, 
		"������ ������ ���� �ڸŰ� �´�! ���ΰ� �ְ��� ģ������ �ڸ� �����硯�� ���ȳ���. ������ ��� "
				+"�����硯���Դ� �ϳ����� ������������ �� ���� ����� �ִ�. ��� ���� ��������� �ź�ο� ���� �ٷ� �װ�. "
				+"�����硯�� ������ �� ���� �ڽ��� ���� �η��� �ձ��� ������, ������ �ձ��� ���ָ� Ǯ�� ���� ���ȳ����� "
				+"��ϸ� ã�� ȯ������ ������ �����µ�����",
		"5��\t<������>\t�ȶȶ�, ���� ����� ���鷡?\n"));
		
		//��ȭ ����5
				list.add(new Movie("��Űű��־��ٷ���", 10000, 2, 
						"�λ��� �ڹٲ� ���� ���� 10���� ��ȸ ���� 30�� ���� ����, �� 30�� ���� �ʾߡ� 2015�� ���� �������� �ٶ�� �ҿ��� �ֽ��ϱ�?�� "
						+"������ ����(������)�� �Ƿ� ���� Ȱ�� �� �� �ҳ��� ������ ���ϰ� �ҳ��� �Ҿƹ����κ��� �ź�ο� 10���� �˾��� ��ʷ� �޴´�. "
						+"ȣ��ɿ� �˾��� ��Ų ������ ���� �ῡ ������� �ٽ� ���� ���� ��, 30�� �� ������ �ڽŰ� �����ϰ� �ȴ�. 1985�� ���� "
						+"���и� �𸣴� ����ε�... �̻��ϰ� ���� �;�� ������ ���� ����(ä����)�� �ູ�� ������ ������ ������ ����(������)�� "
						+"�쿬�� �濡 ������ ���ڸ� ���� �ȴ�. ���ڴ� ������ 30�� ���� �����̶� �����ϰ� Ȳ�����ϴ� ������ ������ �װ� ���̴� ���ŵ��� "
						+"���� ���� ȥ���� ������. �����Ŵ� �ǵ��� �� ����. ���� �� ���� ����, �ǵ��� �� ���� �ð��̰�.�� ����ſ��� �������� ������ "
						+"�̷�����. �� �̷� ���� ���ϴ� �Ű�!�� ����ߴ� ���Ƹ� �� �� �� ���� �;��ٴ� ���� ������ ���� ���� ������ �� �� ���� �ҾȰ��� "
						+"������ �̾� �ϱ� ���� �̷��� ���� �˰� �Ǵµ��� �� ���� ���ư��ٸ顦 ������ �� �λ��� �ٲ� �� �������?",
				"2��\t<�׳༮>\t�θǽ� ����\n"));

	//��ȭ ����6
		list.add(new Movie("�����̴���", 10000, 4, 
				"�����踦 ������� ����, �׷��� �ƹ��� ������ ���� �̾߱�. ��� ����� �θ� ��� ���� ���ܿ� ��� �ִ� ���� ��Ŀ(�ص�� ���ʵ�)�� "
						+"���� �����л�ó�� ����� �б� ��Ȱ�� �ϸ� �ϻ��� ������, ���� �б� �л� ���� �����̽�(���� ����)�� ù����� ���� ������ ���, "
						+"�׸��� �� ���� ����� Ű��������. �׷��� ��� �� �ƹ����� ����ߴ� ��н����� ������ �߰��ϰ� �θ���� ������ǿ� ���� �ǽ��� "
						+"ǰ�� �� �״� �� ���� ������ �Դ� ������ ����� �����ϰ� �ȴ�. �ƹ����� �� ���� �ڳʽ� �ڻ�(���� ����)�� ������� ã�ư��� �� "
						+"���ʹ� �쿬�� ����� Ư���� �ɷ��� ���� �ǰ�, ����� ������ �������� ������ �ϼ��� �ڳʽ� �ڻ�� �ڽ��� ������ �ھ��� �Ǵ� "
						+"�����ڵ塯�� ź����Ų��. ������ �����ϴ� ���¾տ� ���ʹ� ���� �λ��� ��°�� �ٲپ� ���� �ϻ��ϴ��� ����, �ٷ� �������̴��ǡ��̶� "
						+"�Ҹ���� ������ �Ǳ�� ����ϴµ��� 2012�� 6�� 28��, �����̴����� ������ ����� ��ħ�� ��������!",
					"4��\t<������>\t�ص�����ʵ� �������� 9��9\n"));

		//��ȭ ����7
		list.add(new Movie("�����", 10000, 4, 
				"������� ������! ����� ����! ������ ���� ������ ������ ���� ���ο� �ɷ��� ���ø��� ���Ÿ� ź����Ű��, ������� ������ "
						+"�����ϴ� ���� ��� ��Ÿũ�� �ϴ� ���ø����� �ʴɷ����� ���� �ڽ��� ���� �η����ϴ� �̷��� ���� �ȴ�. �̿� '��������' ���� "
						+"���� ���°� �������� �ʵ��� ��Ÿũ�� ��� �ڻ�� �Բ� ������ ��ų �ְ��� �ΰ����� ��Ʈ���� ź����Ű�� ������, ��Ʈ���� ����� "
						+"�ٸ��� ���踦 ��� �����ϱ� �����ϴµ�...",
					"4��\t<�����>\t���� ���� �� �巡���\n"));

		//��ȭ8
		list.add(new Movie("�λ���", 10000, 5, 
				"����̹��� �糭�� ���ѹα��� ��ģ��! ��ü�Ҹ��� ���̷����� �������� Ȯ��ǰ� ���ѹα� ����糭�溸���� ������ ���, "
						+"������ ���� ���� ������� �� �ϳ��� ������ ���� �λ���� ��ư��� ���� ġ���� ������ ���̰� �ȴ�. ���￡�� �λ������ �Ÿ� "
						+"442KM ��Ű�� ����, ���Ѿ߸� �ϴ� ������� ������ ����!",
				"5��\t<������>\t������ �����ؼ� ������ ���� ��ȭ\n"));
	}// init()

	// �̸����� ��ȭ������ ã�� �޼���
	public Movie searchMovie(String name) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getmName().equals(name)) {
				return list.get(i);
		
			} // if end

		} // for end
		return null;
	}// �޼���
//--------------------------------------------------------------------------
	//�������� ����Ʈ�� ��� ������ ������ ���
	public void addReserveInfo(MyMovie e) { //���� ������ ���� Ȯ�� ����
		reservList.add(new MyMovie(e.getmName(),e.getTime(),e.getSeat())); //�̺�Ʈ���� �̸�,�ð�,�¼� ���� ��������
	}
	
	//�̹� ������ �������� �˻�
	public boolean dupSeat(String name,String time,String seat) {
		for(int i=0; i<reservList.size(); i++) {
			if(reservList.get(i).getmName().equals(name) //�̸�
					&&reservList.get(i).getTime().equals(time) //�ð�
					&&reservList.get(i).getSeat().equals(seat)) { //�¼�
				return true;
			}	
		}
		return false;
	}

//�ۼ��� �ı� ����ϱ� (�߿��� �κ�)
	public void inputReview(
			String mName, String reName, String reMsg,int ScoreNum) {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getmName().equals(mName)) {
					list.get(i).setReviewName(reName);
					list.get(i).setPersonScore(ScoreNum);//���� ���� ����
					list.get(i).setRev(reMsg);
					
					list.get(i).setPersonNum();
					list.get(i).setTotal(ScoreNum); //�� ���� �ջ�(�����,����)
					list.get(i).setScore();
					list.get(i).setReview();//������
					
				}
			}
	

	}

}// class