package formFiller;

import java.awt.Font;
//import java.awt.GridBagConstraints;
//import java.awt.GridBagLayout;
//import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//import javax.swing.JFrame;
//import java.awt.CardLayout;
import java.awt.EventQueue;

//import javax.swing.JComboBox;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
//import javax.swing.JTextPane;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
//import javax.swing.JLabel;
//import java.awt.Font;
//import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
//import javax.swing.JButton;
import javax.swing.filechooser.FileSystemView;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.util.Matrix;

public class Main {
	JFrame frame;
	JTextField textField_1;
	JTextField textField;
	JTextField textField_2;
	JTextField textField_3;
	JTextField textField_4;
	JTextField textField_5;
	JTextField textField_6;
	JTextField textField_7;
	JTextField textField_8;
	JTextField textField_9;
	JTextField textField_10;
	JTextField textField_11;
	JTextField textField_12;
	JTextField textField_13;
	JTextField textField_14;
	JTextField textField_15;
	JTextField textField_16;
	JTextField textField_17;
	JTextField textField_18;

	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Main() {
		initialize();
	}
	
	public void initialize() {
        JFileChooser fileToEdit = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        fileToEdit.setDialogTitle("Choose the pdf to edit: ");
        fileToEdit.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        int returnValue = fileToEdit.showSaveDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            if (fileToEdit.getSelectedFile().isFile()) {
                System.out.println("You selected the directory: " + fileToEdit.getSelectedFile());
            }
        }
        String fileToEditString = fileToEdit.getSelectedFile().toString();
        JFileChooser folderToSave = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        folderToSave.setDialogTitle("Choose the folder to save in: ");
        folderToSave.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int returnValue1 = folderToSave.showSaveDialog(null);
        if (returnValue1 == JFileChooser.APPROVE_OPTION) {
            if (folderToSave.getSelectedFile().isDirectory()) {
                System.out.println("You selected the directory: " + folderToSave.getSelectedFile());
            }
        }
        String folderToSaveString = folderToSave.getSelectedFile().toString();
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		
		JLabel lblNewLabel = new JLabel("Landlord Name:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Landlord Address:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel lblNewLabel_2 = new JLabel("City:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel lblNewLabel_3 = new JLabel("State:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel lblNewLabel_4 = new JLabel("Zip Code:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel lblNewLabel_5 = new JLabel("Tenant Name:");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel lblNewLabel_6 = new JLabel("Address:");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel lblState = new JLabel("State:");
		lblState.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel lblZipCode = new JLabel("Zip Code:");
		lblZipCode.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel lblApartment = new JLabel("Apartment:");
		lblApartment.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel lblLegalRent = new JLabel("Legal Rent:");
		lblLegalRent.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel lblLeaseDate = new JLabel("Lease Date:");
		lblLeaseDate.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel lblLeaseBeginning = new JLabel("Lease Beginning:");
		lblLeaseBeginning.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_13.setColumns(10);
		
		JLabel lblLeaseEnding = new JLabel("Lease Ending:");
		lblLeaseEnding.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel lblLeaseTerm = new JLabel("Lease Term:");
		lblLeaseTerm.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel lblMonthlyRent = new JLabel("Monthly Rent:");
		lblMonthlyRent.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel lblSecurity = new JLabel("Security:");
		lblSecurity.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel lblYearlyRent = new JLabel("Yearly Rent:");
		lblYearlyRent.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		textField_18.setColumns(10);
		
		JButton saveButton = new JButton("Save");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblLeaseBeginning)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblLegalRent, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblYearlyRent, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblApartment, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblSecurity, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblZipCode, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblMonthlyRent, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblState, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblLeaseTerm, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblLeaseEnding, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblLeaseDate, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
							.addComponent(saveButton)
							.addGap(52))))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCity, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLeaseEnding, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblState, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLeaseTerm, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblZipCode, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMonthlyRent, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblApartment, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSecurity, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLegalRent, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblYearlyRent, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLeaseDate, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(saveButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblLeaseBeginning, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(7, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String lName = textField.getText();
				String lAddress = textField_1.getText();
				String lCity = textField_2.getText();
				String lState = textField_3.getText();
				String lZipCode = textField_4.getText();
				String tName = textField_5.getText();
				String tAddress = textField_6.getText();
				String tCity = textField_7.getText();
				String tState = textField_8.getText();
				String tZipCode = textField_9.getText();
				String tApartment = textField_10.getText();
				String legalRent = textField_11.getText();
				String leaseDate = textField_12.getText();
				String beginningDate = textField_13.getText();
				String endingDate = textField_14.getText();
				String term = textField_15.getText();
				String monthlyRent = textField_16.getText();
				String security = textField_17.getText();
				String yearlyRent = textField_18.getText();
				lName = "lName";
				lAddress = "lAddress";
				lCity = "lCity";
				lState = "lState";
				lZipCode = "lZipCode";
				tName = "tName";
				tAddress = "tAddress";
				tCity = "tCity";
				tState = "tState";
				tZipCode = "tZipCode";
				tApartment = "tApartment";
				legalRent = "legalRent";
				leaseDate = "leaseDate";
				beginningDate = "beginningDate";
				endingDate = "endingDate";
				term = "term";
				monthlyRent = "monthlyRent";
				security = "security";
				yearlyRent = "yearlyRent";
				try {
					char[] temp = fileToEditString.toCharArray();
					String repl = "";
					for(int k = 0; k < fileToEditString.length(); k++) {
						if (fileToEditString.charAt(k) != '\\') {
							repl = repl + temp[k];
						} else {
							repl = repl + "\\\\";
						}
					}
					System.out.println("yes "+repl);
					File blankCopy = new File("C:\\Users\\jerem\\Documents\\GitHub\\formFiller\\formFiller\\docs\\Blank Copy.pdf");
					PDDocument blank = Loader.loadPDF(blankCopy);
					for (int i = 0; i < blank.getNumberOfPages(); i++) {
						if (i == 0) { // page 1
							PDPage page = blank.getPage(i);
							PDPageContentStream content = new PDPageContentStream(blank, page, PDPageContentStream.AppendMode.APPEND, true);
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(285, 695);
							content.showText(tName);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(75, 695);
							content.showText(lName);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(92, 678);
							content.showText(lAddress);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(245, 678);
							content.showText(tApartment);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(32, 662);
							content.showText(lCity+", "+lState+" "+lZipCode);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(245, 662);
							content.showText(tCity+", "+tState+" "+tZipCode);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(128, 644);
							content.showText(tApartment);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(66, 624);
							content.showText(leaseDate);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(193, 624);
							content.showText(beginningDate);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(330, 624);
							content.showText(endingDate);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(53, 610);
							content.showText(term);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(220, 600);
							content.showText(monthlyRent);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(345, 605);
							content.showText(security);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(75, 595);
							content.showText(yearlyRent);
							content.endText();
							content.close();
						} else if (i == 4) {
							PDPage page = blank.getPage(i);
							PDPageContentStream content = new PDPageContentStream(blank, page, PDPageContentStream.AppendMode.APPEND, true);
							content.transform(Matrix.getRotateInstance(-Math.PI / 180, 0, 0));
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(55, 130);
							content.showText(tName);
							content.endText();
							content.close();
						} else if (i == 5) {
							PDPage page = blank.getPage(i);
							PDPageContentStream content = new PDPageContentStream(blank, page, PDPageContentStream.AppendMode.APPEND, true);
							/*for (int k = 0; k < 800; k += 10) {
								content.beginText();
								content.setFont(PDType1Font.TIMES_ROMAN, 10);
								content.newLineAtOffset(k, k);
								String ki = String.valueOf(k);
								content.showText(ki);
								content.endText();
							}*/
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(70, 248);
							content.showText(tName);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(70, 227);
							content.showText(tAddress + " " + tApartment);
							content.endText();
							content.close();
						} else if (i == 6) {
							PDPage page = blank.getPage(i);
							PDPageContentStream content = new PDPageContentStream(blank, page, PDPageContentStream.AppendMode.APPEND, true);
							content.transform(Matrix.getRotateInstance(-Math.PI / 150, 0, 0));
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(310, 345);
							content.showText(tName);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(60, 335);
							content.showText(tAddress + " " + tApartment);
							content.endText();
							content.close();
						} else if (i == 8) {
							PDPage page = blank.getPage(i);
							PDPageContentStream content = new PDPageContentStream(blank, page, PDPageContentStream.AppendMode.APPEND, true);
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(200, 535);
							content.showText(leaseDate);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(160, 495);
							content.showText(tName);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(120, 470);
							content.showText(tAddress);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(130, 440);
							content.showText(tAddress);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(320, 250);
							content.showText(leaseDate);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(150, 195);
							content.showText(tName);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(115, 165);
							content.showText(tAddress);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(130, 135);
							content.showText(tApartment);
							content.endText();
							content.close();
						} else if (i == 9) {
							PDPage page = blank.getPage(i);
							PDPageContentStream content = new PDPageContentStream(blank, page, PDPageContentStream.AppendMode.APPEND, true);
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(170, 590);
							content.showText(leaseDate);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(110, 565);
							content.showText(tName);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(80, 542);
							content.showText(tAddress);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(90, 517);
							content.showText(tApartment);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(325, 275);
							content.showText(leaseDate);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(100, 210);
							content.showText(tName);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(80, 188);
							content.showText(tAddress);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(80, 160);
							content.showText(tApartment);
							content.endText();
							content.close();
						} else if (i == 10) {
							PDPage page = blank.getPage(i);
							PDPageContentStream content = new PDPageContentStream(blank, page, PDPageContentStream.AppendMode.APPEND, true);
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(120, 560);
							content.showText(tName);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(120, 525);
							content.showText(tAddress);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(70, 490);
							content.showText(tApartment);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(140, 450);
							content.showText(leaseDate);
							content.endText();
							content.close();
						} else if (i == 11) {
							PDPage page = blank.getPage(i);
							PDPageContentStream content = new PDPageContentStream(blank, page, PDPageContentStream.AppendMode.APPEND, true);
							/*for (int k = 0; k < 800; k += 10) {
								content.beginText();
								content.setFont(PDType1Font.TIMES_ROMAN, 10);
								int x = k;
								
								content.newLineAtOffset(k, k);
								String ki = String.valueOf(k);
								content.showText(ki);
								content.endText();
							}*/
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(165, 320);
							content.showText(tName);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(165, 260);
							content.showText(tAddress);
							content.endText();
							content.beginText();
							content.setFont(PDType1Font.TIMES_ROMAN, 10);
							content.newLineAtOffset(410, 260);
							content.showText(tApartment);
							content.endText();
							content.close();
						}
					}
					blank.save("C:\\Users\\jerem\\Documents\\GitHub\\formFiller\\formFiller\\EmptyPDF.pdf");
					blank.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
	}
	public String convertFileLink(String s) {
		
		return s;
	}
}
