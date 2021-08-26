package photoCollect;

import java.util.ArrayList;

public class Set {
	private int setNumber;
	private String member;
	private ArrayList<Photo> photoInfos;
	public int getSetNumber() {
		return setNumber;
	}
	public void setSetNumber(int setNumber) {
		this.setNumber = setNumber;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public ArrayList<Photo> getPhotoInfos() {
		return photoInfos;
	}
	public void addPhoto(Photo photo) {
		this.photoInfos.add(photo);
	}
	public Set(int setNumber, String member, ArrayList<Photo> store) {
		super();
		this.setNumber = setNumber;
		this.member = member;
		this.photoInfos = store;
	}
	
	public int showSetAmount() {
		int a[] = {0,0,0};
		for (Photo photo : photoInfos) {
			for (int i = 0; i < setNumber; i++) {
				if (photo.getPhotoNo() == i) {
					a[i]++;
				}
			}
		}
//		System.out.println("0"+a[0]);
//		System.out.println("1"+a[1]);
//		System.out.println("2"+a[2]);
		return min(a[0], a[1], a[2]);
	}
	
	private int min(int a ,int b, int c) {
		return (a<b)?(a<c?a:c):(b<c?b:c);
	}
}
