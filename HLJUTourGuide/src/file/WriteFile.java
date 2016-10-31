package file;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Transparency;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

import JFrame.BlockDemo;

public class WriteFile implements ActionListener{
	private BlockDemo bd;
	public WriteFile(BlockDemo bd){
		this.bd = bd;
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("����ͼд�뵽����");
		//����:1.�����潨��1.png�ļ�;
		//2.�����õ�ͼд��1.png��ȥ
		//����:д����ļ���
		File f = new File("C://Users//hongyu//Desktop//1.png");
		try {
			Component com = bd.getImageLabel();
			Rectangle rect = com.getBounds();
			BufferedImage bi = (BufferedImage)com.createImage(rect.width,rect.height);
			Graphics g = bi.getGraphics();
			com.paint(g);
			g.dispose();
			
			JFileChooser jfc = new JFileChooser();
			jfc.setFileFilter(new FileFilter() {
				@Override
				public String getDescription() {
					// TODO Auto-generated method stub
					return "*.png";
				}
				@Override
				public boolean accept(File f) {
					// TODO Auto-generated method stub
					return  f.isDirectory()
						      || f.getName().toLowerCase().endsWith(".png");
				}
			});
			int type = jfc.showSaveDialog(null);
			if(type==0){
				File file = jfc.getSelectedFile();
				try {
				    if (!file.exists()) {
				     file.createNewFile();
				    }
				    ImageIO.write(bi, "PNG", file);
				} catch (IOException e1) {
				    e1.printStackTrace();
				}
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
