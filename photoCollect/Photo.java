package photoCollect;

public class Photo {
	private String memberName;
	private int photoNo;
	public String getMemberName() {
		return memberName;
	}
	public Photo(String memberName, int photoNo) {
		super();
		this.memberName = memberName;
		this.photoNo = photoNo;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getPhotoNo() {
		return photoNo;
	}
	public void setPhotoNo(int photoNo) {
		this.photoNo = photoNo;
	}
	public void showPhotoInfo() {
		System.out.println("这是 "+this.memberName+" 的第"+this.photoNo+"张");
	}

}
