package post;

public class PostTbl {
	private int id;
	private String title;
	private String content;
	
	public PostTbl() {
	
	}
	
	public PostTbl(int id, String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
	}
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "PostTbl [id=" + id + ", title=" + title + ", content=" + content + "]";
	}
	
	
}
