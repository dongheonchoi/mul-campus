package 배열심화;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class 이차원배열 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setSize(500, 500);
		
		
		String[] header = { "국어", "영어", "수학", "컴퓨터", "회화", "사회", "과학" };
		
		String[][] contents = {   //String을 Integer로 바꾸면 int도 가능
				{"70", "67", "57", "40", "80","90", "15"},
				{"68", "69", "28", "33", "60","77", "15"},
				{"33", "64", "57", "40", "80","45", "32"},
				{"70", "43", "51", "90", "80","90", "71"},
				{"75", "67", "26", "100", "80","33", "37"}
		};
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		
		f.setVisible(true);
		
	}
}
