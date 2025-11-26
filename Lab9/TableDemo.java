import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TableDemo extends JFrame{
	Label l;
	TableDemo(){
		super("JTable pane Demo");
		String[] heading= {"Name", "Course", "Rollno."};
		
		String[][] data={
				{"ana", "CSE", "1234"},
				{"bella", "CSM", "12345"},
				{"cella", "IT", "12346"},
				{"hinna", "CSO", "12347"}
			};
		JTable jt=new JTable(data,heading);
		JScrollPane jsp=new JScrollPane(jt);
		add(jsp);
		
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String...args){
		new TableDemo();
	}
	
}
