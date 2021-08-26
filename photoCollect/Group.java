package photoCollect;

import java.util.Random;

public class Group {
	public final String MEMBER[] = {"秋元真夏",
			"生田绘梨花",
			"斋藤飞鸟",
			//"白石麻衣",
			"高山一实",
			"中田花奈",
			"樋口日奈",
			"星野南",
			"松村沙友理",
			"和田玛雅",
			"伊藤纯奈",
			"北野日奈子",
			"新内真衣",
			"铃木绚音",
			"寺田兰世",
			"堀未央奈",
			"山崎怜奈",
			"渡边米丽爱",
			"伊藤理理杏",
			"岩本莲加",
			"梅泽美波",
			"大园桃子",
			"久保史绪里",
			"阪口珠美",
			"佐藤枫",
			"中村丽乃",
			"向井叶月",
			"山下美月",
			"吉田绫乃克莉丝蒂",
			"与田祐希",
			"远藤樱",
			"贺喜遥香",
			"挂桥沙耶香",
			"金川纱耶",
			"北川悠理",
			"柴田柚菜",
			"清宫玲",
			"田村真佑",
			"筒井彩萌",
			"早川圣来",
			"矢久保美绪",
			"黒见明香",
			"佐藤璃果",
			"林瑠奈",
			"松尾美佑",
			"弓木奈於"
			};
	
	public int size() {
		return MEMBER.length;
	}
	
	//随机获得成员的名字 用于出生写，后续可以考虑给成员加权重来开包
	public String getMEMBER() {
		Random num = new Random();
		int groupSize = size();
		return MEMBER[num.nextInt(groupSize)];
	}
}
