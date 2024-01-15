
import javax.swing.*;
import java.awt.*;

public class NotepadFrame {
	JMenu edit,format,view,help;
	JMenuItem New,open,save,saveAs,print,exit,cut,copy,paste,delete,undo,replace,view_help,about;
	
	NotepadFrame(){
		JTextArea text=new  JTextArea();
		text.setBounds(5,5,400,400);
		JFrame frame=new JFrame("Notepad");
		JMenuBar bar=new JMenuBar();
		JMenu file=new JMenu("File");
		format=new JMenu("Format");
		frame.add(text);
		view=new JMenu("View");
		help=new JMenu("Help");
		New=new JMenuItem("New File");
		open=new JMenuItem("Open File");
		save=new JMenuItem("Save");
		saveAs=new JMenuItem("Save As");
		print=new JMenuItem("Print");
		exit=new JMenuItem("Exit");
		file.add(New);file.add(open);file.add(save);file.add(saveAs);file.add(print);file.add(exit);
		bar.add(file);
		edit=new JMenu("Edit");
		cut=new JMenuItem("Cut");
		copy=new JMenuItem("Copy");
		paste=new JMenuItem("Paste");
		delete=new JMenuItem("Delete");
		undo=new JMenuItem("Undo");
		replace=new JMenuItem("Replace");
		edit.add(cut);	edit.add(copy);	edit.add(paste);edit.add(delete);edit.add(undo);edit.add(replace);
		bar.add(edit);
		view=new JMenu("View");
		view_help=new JMenuItem("View Help");
		view.add(view_help);
		help=new JMenu("Help");
		about=new JMenuItem("About");
		help.add(about);
		bar.add(view); bar.add(help);
		frame.setJMenuBar(bar);
		frame.setLayout(new BorderLayout());
		frame.add(text,BorderLayout.CENTER);
		frame.setSize(500,500);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new NotepadFrame();

	}

}
