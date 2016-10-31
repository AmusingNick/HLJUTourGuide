package JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MouseByHelp implements ActionListener{
	private BlockDemo bd;
	public MouseByHelp(BlockDemo bd){
		this.bd = bd;
	}
	JTextArea jt1 = new JTextArea("@2015-11月"
			+"注意事项:\n"
			+"1.左键是点击\n"
			+"2.右键是取消点击图中的操作\n"
			+"3.共有节点26个\n"
			+"具体功能:\n"
			+"1.为来访客人提供图中任意景点相关信息的查询;\n"
			+"2.为来访客人提供从校门口到图中任意景点的问路查询;\n"
			+"3.为来访客人提供图中任意景点间的问路查询;\n"
			+"4.最短距离和广搜距离的比较\n"
			);
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame();
		jf.setSize(400,400);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jt1.setEditable(false);
		jt1.setLineWrap(true);
		jf.add(jt1);
	}

}
