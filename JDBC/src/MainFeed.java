import java.awt.EventQueue;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;

public class MainFeed extends JFrame {

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public MainFeed() {
		setBackground(new Color(255, 255, 255));
		setBounds(100, 100, 480, 801);
		setTitle("Twitter");
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel appbar = new JPanel();
		appbar.setBackground(new Color(255, 255, 255));
		appbar.setBounds(0, 0, 464, 60);
		appbar.setLayout(null);
		contentPane.add(appbar);
		
		ImageIcon logo = ImageManager.GetImageUsingFileSystem("src/assets/logo.png", 50,50);
		
		JLabel Logo = new JLabel(logo);
		Logo.setBounds(200, 5, 50, 50);
		appbar.add(Logo);
		
		ImageIcon userImage = ImageManager.GetImageUsingURL("https://pbs.twimg.com/profile_images/1374979417915547648/vKspl9Et_400x400.jpg", 100, 100);
		JLabel UserBtn = new JLabel(userImage);
		UserBtn.setBounds(12, 5, 50, 50);
		appbar.add(UserBtn);
		
		ImageIcon searchIcon = ImageManager.GetImageUsingFileSystem("src/assets/UI/search.png",30,30);
		JLabel SearchBtn = new JLabel(searchIcon);
		SearchBtn.setBounds(402, 5, 50, 50);
		appbar.add(SearchBtn);
		
		
//		JScrollPane imageScroll = new JScrollPane();
//		imageScroll.setBounds(12, 175, 428, 115);
//		panel.add(imageScroll);
//
//		JPanel images = new JPanel();
//		images.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
//		imageScroll.add(images);
//		imageScroll.setViewportView(images);
//		
//		for(int i =0;i<imgs.size(); i++) {
//			ImageIcon img = ImageManager.GetImageUsingURL(imgs.get(i), 100,100);
//			JLabel imgLabel = new JLabel(img);
//			imgLabel.setSize(100,100);
//			images.add(imgLabel);
//			
//		}
		

		
		//�������������� Scrollpane�� post�� ��Ƴ��� pane�� �ִ´�.
		//scrollpane�� contentPane�� add�Ѵ�.
		//- �� ��Ĥ� ������ �ȵǴ� ��Ȳ
		//���� �����δ� posts �гο��� flow���̾ƿ����� �س���
		//�����Ҷ� ������ �ȵ�
		//��� 1
		//---------------------------------
//		JScrollPane scrollBar = new JScrollPane();
//		//scrollBar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
//		scrollBar.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
//		scrollBar.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//		scrollBar.setBounds(0, 60, 464, 702);
//		contentPane.add(scrollBar);
//		
//		
//		JPanel posts = new JPanel();
//		scrollBar.setViewportView(posts);
//		posts.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
//		posts.setBounds(0,60,464,702);
//		
//		for(int i =0;i<3;i++) {
//			Post p = new Post("abcd1");
//			PostPanel post = new PostPanel(p, p.images);
//			post.setSize(454, 300);
//			
//			posts.add(post);
//			
//		}
//		
//		contentPane.add(posts);
	

		//�Ϲ� ��ǥ ���� ����
		//--------------------------------
		
//		
		for(int i =0;i<3;i++) {
			Post p = new Post("abcd1");
			PostPanel post = new PostPanel(p, p.images);
			post.setSize(464, 300);
			post.setLocation(0, 70 + 300 * i);
			
			contentPane.add(post);
			
		}
	
		setVisible(true);
	}
}
