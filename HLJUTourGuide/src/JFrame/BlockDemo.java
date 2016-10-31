package JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.Enumeration;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

import model.AMGraph;
import control.Mouse26toWhere;
import control.MouseByFindSpots;
import control.MouseByFindWayAtoB;
import control.MouseByFindWayToAll;
import control.MouseByFindWayToAtoBShort;
import control.MousePaintTime;
import control.MouseSpotInfo;
import file.WriteFile;

public class BlockDemo extends JFrame{
	private JMenu file = new JMenu("�ļ�����(Q)");
	private JMenu jm = new JMenu("�����ѯ(W)");
	private JMenu jm1 = new JMenu("��·��ѯ(E)");
	private JMenu jm2 = new JMenu("����(R)");
	private JMenuItem saveImg = new JMenuItem("ͼƬ����");
	private JMenuItem showTime = new JMenuItem("��ʾʱ��");
	private JMenuItem exit = new JMenuItem("�˳�");
	private JMenuItem help = new JMenuItem("�鿴����");
	private JMenuItem tour = new JMenuItem("���ڵ���");
	private JMenuItem findSpots = new JMenuItem("���Ҿ���");
	private JMenuItem spotsInfo = new JMenuItem("������Ϣ(��ѡ)");
	private JMenuItem jmiv26toAll = new JMenuItem("У�ſڵ���������");
	private JMenuItem jmiv26towhere = new JMenuItem("У�ſڵ�ĳ��");
	private JMenuItem jmiAtoB = new JMenuItem("ѧУĳ�ص�ĳ��(����)");
	private JMenuItem jmiAtoBShort = new JMenuItem("ѧУĳ�ص�ĳ��(DIJ)");
	private JMenuItem jmi_1 = new JMenuItem("�½�");
	private JMenuBar jmb = new JMenuBar();
	
	private JPanel jpOn = new JPanel();
	private JPanel jpDown = new JPanel();
	
	private ImageIcon icon = new ImageIcon("src/Image/BlockChange.png");
	private JLabel imageLabel = new JLabel(icon);
	private MouseListener acImage = new MouseByImage(this);
	private ActionListener acFindWayAtoB = new MouseByFindWayAtoB(this);
	private ActionListener acFindWayAll = new MouseByFindWayToAll(this);
	private ActionListener acHelp = new MouseByHelp(this);
	private ActionListener acFindWayAtoBShort = new MouseByFindWayToAtoBShort(this);
	private ActionListener acFindSpots = new MouseByFindSpots(this);
	private ActionListener acPaintTime = new MousePaintTime(this);
	private ActionListener acWriteFile = new WriteFile(this);
	private ActionListener acSpotInfo = new MouseSpotInfo(this);
	private ActionListener ac26toWhere = new Mouse26toWhere(this);
	private AMGraph amg = new AMGraph();
	private int selectedSpotCount;
	private int selectedXCenter;
	private int selectedYCenter;
	
	public ImageIcon getIcon() {
		return icon;
	}
	public void setIcon(ImageIcon icon) {
		this.icon = icon;
	}
	public int getSelectedSpotCount() {
		return selectedSpotCount;
	}
	public void setSelectedSpotCount(int selectedSpotCount) {
		this.selectedSpotCount = selectedSpotCount;
	}
	public int getSelectedXCenter() {
		return selectedXCenter;
	}
	public void setSelectedXCenter(int selectedXCenter) {
		this.selectedXCenter = selectedXCenter;
	}
	public int getSelectedYCenter() {
		return selectedYCenter;
	}
	public void setSelectedYCenter(int selectedYCenter) {
		this.selectedYCenter = selectedYCenter;
	}
	public AMGraph getAmg() {
		return amg;
	}
	public void setAmg(AMGraph amg) {
		this.amg = amg;
	}
	public MouseListener getAcImage() {
		return acImage;
	}
	public void setAcImage(MouseListener acImage) {
		this.acImage = acImage;
	}
	public JPanel getJpDown() {
		return jpDown;
	}
	public void setJpDown(JPanel jpDown) {
		this.jpDown = jpDown;
	}
	
	public JLabel getImageLabel() {
		return imageLabel;
	}
	public void setImageLabel(JLabel imageLabel) {
		this.imageLabel = imageLabel;
	}
	private static void InitGlobalFont(Font font) { // ����ȫ��Ĭ������
		FontUIResource fontRes = new FontUIResource(font);
		for (Enumeration<Object> keys = UIManager.getDefaults().keys(); keys
				.hasMoreElements();) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof FontUIResource) {
				UIManager.put(key, fontRes);
			}
		}
	}
	public BlockDemo(){
		InitGlobalFont(new Font("΢���ź�", Font.PLAIN, 15));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(897,617);
		this.setTitle("��������ѧУ԰����ϵͳ");
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.cyan);
		this.setIconImage(new ImageIcon("src/Image/logo.png").getImage());
		this.setResizable(false);
		setJpOn();
		setJpDown();
		this.setLayout(new BorderLayout());
		this.add(jpOn,BorderLayout.NORTH);
		this.add(jpDown,BorderLayout.CENTER);
		this.setForeground(Color.red);
		String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
		try {
			UIManager.setLookAndFeel(lookAndFeel);
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void setJpOn(){
		jpOn.setLayout(new BorderLayout());	
		file.add(saveImg);
		file.add(showTime);
		file.add(exit);
		jm.add(findSpots);
		jm.add(spotsInfo);
		jm1.add(jmiv26toAll);
		jm1.add(jmiv26towhere);
		jm1.add(jmiAtoB);
		jm1.add(jmiAtoBShort);
		jmiv26toAll.addActionListener(acFindWayAll);
		jmiAtoB.addActionListener(acFindWayAtoB);
		jmiAtoBShort.addActionListener(acFindWayAtoBShort);
		jm2.add(help);
		jm2.add(tour);
		file.setMnemonic('q');
		jm.setMnemonic('w');
		jm1.setMnemonic('e');
		jm2.setMnemonic('r');
		jmb.add(file);
		jmb.add(jm);
		jmb.add(jm1);
		jmb.add(jm2);
		AddMenuFunction();
		jpOn.add(jmb,BorderLayout.CENTER);
	}
	private void AddMenuFunction(){
		findSpots.addActionListener(acFindSpots);
		help.addActionListener(acHelp);
		imageLabel.addMouseListener(acImage);
		tour.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {new JOptionPane().showMessageDialog(null, "·��ʵ�������,�ߵ��˶���Ҳ�����·,�⵼��ϵͳ��ȫ������");}});
		exit.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {System.exit(0);}});
		showTime.addActionListener(acPaintTime);
		saveImg.addActionListener(acWriteFile);
		spotsInfo.addActionListener(acSpotInfo);
		jmiv26towhere.addActionListener(ac26toWhere);
	}
	private void setJpDown(){
		jpDown.setLayout(new FlowLayout());
		jpDown.add(imageLabel);
	}
	public static void main(String[] args) throws IOException{
		Runtime run = Runtime.getRuntime();
		String cmd = "java -splash:src/Image/whyisperfect.jpg";
		for(int i=0;i<15;i++){
			Process p = run.exec(cmd);
		}
		BlockDemo bd = new BlockDemo();
	}
}
