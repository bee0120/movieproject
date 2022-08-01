package movieVo;
//데이터 베이스랑 연결 되어있는 부분
//영화정보
public class Movie {
	
		//1.변수 설정
		String mName;//영화
		int price;// 영화 가격
		double score;//영화 평점
		String story;//영화 줄거리
		String review; //영화 평점
		int total;//평점 누적
		int personScore;//방금 등록한 평점
		String rev;//한줄평 등록
		int personNum;//평점을 등록한 사람 수 
		String reviewName; //평점 등록한 사람 이름 
		
		//2.생성자 + 초기화
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

		public void setScore() { //토탈 나누기 사람의 수 
			this.score =(double)this.total/this.personNum; //score가 double 형이고 나머진 int이니 둘중하나를double로 맞춰줄것
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
			this.review +=this.personScore+"점\t<"+this.reviewName+">\t"+this.rev +"\n"; //리뷰에서 한줄평,남긴사람,점수 등 확인 할수 있또록
		}

		public int getTotal() {
			return total;
		}

		public void setTotal(int personN) { //다음에 사람수대로 누적하기 위함
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
		
			return "★영화 제목 : " + mName + 
					"\n★가격 : " + price + "\n★평점 : " + score + 
					"\n★최신 한줄 평 : " + review;
		}
		
		
		
		
		
}//class
