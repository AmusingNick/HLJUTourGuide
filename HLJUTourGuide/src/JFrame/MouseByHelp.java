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
	JTextArea jt1 = new JTextArea("@2015-11��"
			+"ע������:\n"
			+"1.����ǵ��\n"
			+"2.�Ҽ���ȡ�����ͼ�еĲ���\n"
			+"3.���нڵ�26��\n"
			+"���幦��:\n"
			+"1.Ϊ���ÿ����ṩͼ�����⾰�������Ϣ�Ĳ�ѯ;\n"
			+"2.Ϊ���ÿ����ṩ��У�ſڵ�ͼ�����⾰�����·��ѯ;\n"
			+"3.Ϊ���ÿ����ṩͼ�����⾰������·��ѯ;\n"
			+"4.��̾���͹��Ѿ���ıȽ�\n"
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
