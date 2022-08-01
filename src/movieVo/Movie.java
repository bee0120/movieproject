package movieVo;
//������ ���̽��� ���� �Ǿ��ִ� �κ�
//��ȭ����
public class Movie {
	
		//1.���� ����
		String mName;//��ȭ
		int price;// ��ȭ ����
		double score;//��ȭ ����
		String story;//��ȭ �ٰŸ�
		String review; //��ȭ ����
		int total;//���� ����
		int personScore;//��� ����� ����
		String rev;//������ ���
		int personNum;//������ ����� ��� �� 
		String reviewName; //���� ����� ��� �̸� 
		
		//2.������ + �ʱ�ȭ
		public Movie(String mName,int price,double score,String story,String review) {
			this.mName = mName;
			this.price = price;
			this.total = (int)score;
			this.story = story;
			this.review = review;
			this.personNum = 1;
		}

		public String getmName() {
			return mName;
		}

		public void setmName(String mName) {
			this.mName = mName;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public double getScore() {
			return score;
		}

		public void setScore() { //��Ż ������ ����� �� 
			this.score =(double)this.total/this.personNum; //score�� double ���̰� ������ int�̴� �����ϳ���double�� �����ٰ�
		}

		public String getStory() {
			return story;
		}

		public void setStory(String story) {
			this.story = story;
		}

		public String getReview() {
			return review;
		}

		public void setReview() {
			this.review +=this.personScore+"��\t<"+this.reviewName+">\t"+this.rev +"\n"; //���信�� ������,������,���� �� Ȯ�� �Ҽ� �ֶǷ�
		}

		public int getTotal() {
			return total;
		}

		public void setTotal(int personN) { //������ �������� �����ϱ� ����
			this.total+=personN; //(=this.total=total+personN;)
		}

		public int getPersonScore() {
			return personScore;
		}

		public void setPersonScore(int personScore) {
			this.personScore = personScore;
		}

		public String getRev() {
			return rev;
		}

		public void setRev(String rev) {
			this.rev = rev;
		}

		public int getPersonNum() {
			return personNum;
		}

		public void setPersonNum() {
			this.personNum++;
		}

		public String getReviewName() {
			return reviewName;
		}

		public void setReviewName(String reviewName) {
			this.reviewName = reviewName;
		}

		@Override
		public String toString() {
		
			return "�ڿ�ȭ ���� : " + mName + 
					"\n�ڰ��� : " + price + "\n������ : " + score + 
					"\n���ֽ� ���� �� : " + review;
		}
		
		
		
		
		
}//class
