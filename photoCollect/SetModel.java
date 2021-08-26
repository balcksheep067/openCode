package photoCollect;

import java.util.ArrayList;

/*set 模型类  根据成员  建立set
 * 飞鸟    咩     白 ······猴   共46个
 * */
public class SetModel {
	private int setNumber;
	private String setName;
	private Group group;
	private ArrayList<Set> mode;
	
	public ArrayList<Set> getMode() {
		return mode;
	}

	//根据 成员名称  获取临时存放生写的set
	public Set getModeByMember(String memberName) {
		for (Set set : mode) {
			if (set.getMember().equals(memberName)) {
				
				return set;
			}
		}
		return null;
	}

	public void addMode(Set set) {
		this.mode.add(set);
	}

	public SetModel(int setNumber, String setName, Group group) {
		super();
		this.setNumber = setNumber;
		this.setName = setName;
		this.group = group;
		this.mode = generateMode();
	}
	
	public ArrayList<Set> generateMode() {
		ArrayList<Set> allSetMode = new ArrayList<Set>();
		for (int i = 0; i < this.group.size(); i++) {
			ArrayList<Photo> store = new ArrayList<Photo>();
			Set setName = new Set(3, group.MEMBER[i], store);
			allSetMode.add(setName); 
		}
		return allSetMode;
	}
	
	public void putIntoSetModel(Photo photo) {
	}
	
	
	
	
	public int getSetNumber() {
		return setNumber;
	}
	public void setSetNumber(int setNumber) {
		this.setNumber = setNumber;
	}
	public String getSetName() {
		return setName;
	}
	public void setSetName(String setName) {
		this.setName = setName;
	}
	public Group getGroup() {
		return group;
	}
	public void setGroup(Group group) {
		this.group = group;
	}
}
