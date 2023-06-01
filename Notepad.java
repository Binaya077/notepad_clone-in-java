package chapter2;
import java.awt.*;
import javax.swing.*;

public class Notepad {
	
	public static void main(String[] args) 
	{
		
		JFrame jf=new JFrame("Notepad");
		jf.setSize(500,500);
		ImageIcon icon=new ImageIcon("image/notepad.jpg");
		jf.setIconImage(icon.getImage());
		
		
	    //MENU bar
		JMenuBar mb=new JMenuBar();
		JMenu file= new JMenu("File");
		JMenu edit=new JMenu("Edit");
		JMenu Format=new JMenu("Format");
		JMenu View=new JMenu("View");
		JMenu Help=new JMenu("Help");
		
		//ITEM INSIDE FILE
		
		JMenuItem i1=new JMenuItem("New                              ctrl+N");
		JMenuItem i2=new JMenuItem("New Window             ctrl+shift+N");
		JMenuItem i3=new JMenuItem("Open...                          ctrl+O");
		JMenuItem i4=new JMenuItem("Save                             ctrl+S");
		JMenuItem i5=new JMenuItem("Save As...");
		JMenuItem i6=new JMenuItem("Page Setup...");
		JMenuItem i7=new JMenuItem("Print...                          ctrl+P");
		JMenuItem i8=new JMenuItem("Exit");
		file.add(i1);
		file.add(i2);
		file.add(i3);
		file.add(i4);
		file.add(i5);
		file.add(i6);
		file.add(i7);
		file.add(i8);
		
		//ITEM INSIDE EDIT
		
		JMenuItem i9=new JMenuItem("Undo                          ctrl+z");
		JMenuItem i10=new JMenuItem("Cut                          ctrl+X");
		JMenuItem i11=new JMenuItem("Copy                         ctrl+C");
		JMenuItem i12=new JMenuItem("Paste                        ctrl+V");
		JMenuItem i13=new JMenuItem("Delete                        Del");
		JMenuItem i14=new JMenuItem("Find...                       Ctrl+F");
		JMenuItem i15=new JMenuItem("Find Next                       F3");
		JMenuItem i16=new JMenuItem("Find Previous           Shift+F3");
		JMenuItem i17=new JMenuItem("Replace                       ctrl+H");
		JMenuItem i18=new JMenuItem("Go TO...                      Ctrl+G");
		JMenuItem i19=new JMenuItem("Select All                    ctrl+A");
		JMenuItem i20=new JMenuItem("Time/Date                 F5");
		edit.add(i9);
		edit.add(i10);
		edit.add(i11);
		edit.add(i12);
		edit.add(i13);
		edit.add(i14);
		edit.add(i15);
		edit.add(i16);
		edit.add(i17);
		edit.add(i18);
		edit.add(i19);
		edit.add(i20);
		
		//item disable in EDIT
		
		i9.setEnabled(false);
		i10.setEnabled(false);
		i11.setEnabled(false);
		i13.setEnabled(false);
		i14.setEnabled(false);
		i15.setEnabled(false);
		i16.setEnabled(false);
		
		
		//ITEM INSIDE Format

		JMenuItem i21=new JMenuItem("Word Wrap");
		JMenuItem i22=new JMenuItem("Font...");
		Format.add(i21);
		Format.add(i22);
		
		//ITEM INSIDE View

		JMenu submenu=new JMenu("Zoom");
		JMenuItem i25=new JMenuItem("Zoom In                               ctrl+Plus");
		JMenuItem i26=new JMenuItem("Zoom Out                              ctrl+Minus");
		JMenuItem i27=new JMenuItem("Restore Default Zoom        ctrl+O");
		submenu.add(i25);
		submenu.add(i26);
		submenu.add(i27);
		View.add(submenu);
		JCheckBoxMenuItem caseMenuItem = new JCheckBoxMenuItem("Status Bar"); 
		caseMenuItem.setSelected(true);
		 View.add(caseMenuItem);
		
		 
		
		//ITEM INSIDE HELP
		
		JMenuItem i28=new JMenuItem("View Help");
		JMenuItem i29=new JMenuItem("Send Feedback");
		JMenuItem i30=new JMenuItem("About Notepad");
		Help.add(i28);
		Help.add(i29);
		Help.add(i30);
		
				
		//Item add in MENUBAR
		mb.add(file);
		mb.add(edit);
		mb.add(Format);
		mb.add(View);
		mb.add(Help);
	
		
		
		//TEXT AREA
	   JTextArea area=new JTextArea();
	 // area.setSize(1400, 700);
	  // area.setBackground(Color.WHITE);
	   //Font font = new Font("Font.SERIF",Font.PLAIN, 15);
       //area.setFont(font);
      // area.setForeground(Color.BLACK);
      // area.setVisible(true);
      JScrollPane js=new JScrollPane(area);
	   jf.add(js,BorderLayout.CENTER);
		jf.setJMenuBar(mb);
	   jf.setResizable(false);
	   
	   // ScrollBar
	    	
//	        jf.getContentPane().setLayout(new BorderLayout());  
//	        JScrollPane scrollableTextArea = new JScrollPane(area);
//			   scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
//		        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
//		        jf.getContentPane().add(scrollableTextArea); 
////		       
	        
		
	
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        

	}

	

}
