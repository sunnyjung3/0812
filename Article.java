package java0812;

public class Article {    // class에는 메인이 없음. 메인은 딱 하나만


		// 접근제어자
		private int id;
		private String title;
		private String body;
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getBody() {
			return body;
		}
		public void setBody(String body) {
			this.body = body;
		}

	}

