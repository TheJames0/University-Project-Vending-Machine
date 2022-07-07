
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JLayeredPane;

public class MainPanel extends JFrame  {
	//Main Controller Variable
	private VendingMachineController Controller;
	//UI Elements
	private JPanel contentPane;
	private JTextField tfPrice;
	private JTextField tfCash;
	private JTextField tfChange;
	private JTextField tfCardResult;
	private JTextField tfSavings;
	private JLabel lblTimeoutnmb;
	//Timer Variables
	private int timercount;
	/**
	 * updateTimer updates a timer count every second and if timer hits 0 the frame will be disposed.
	 */
	private void updateTimer() {
		timercount -= 1;
		if(timercount < 0)
			dispose();
	}
	/**
	 * Constructor method for class, the method has all generated code and
	 *  button handling additional function code has been added for GUI handling.
	 * @param paymenttype
	 */
	public MainPanel(int paymenttype) {
		timercount = 60;
		Controller = new VendingMachineController(paymenttype);
		ButtonGroup options = new ButtonGroup();
		
		
		
		
		
		/**
		 * Automatic Generated GUI code
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Vending Machine");
		lblTitle.setBounds(202, 10, 222, 39);
		lblTitle.setFont(new Font("Serif", Font.BOLD, 30));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTitle);
		
		JPanel pnlSelection = new JPanel();
		pnlSelection.setBounds(9, 54, 334, 146);
		contentPane.add(pnlSelection);
		pnlSelection.setLayout(null);
		
		JRadioButton rdbtnCoke = new JRadioButton("Coke");
		rdbtnCoke.setBounds(3, 0, 89, 23);
		pnlSelection.add(rdbtnCoke);
		
		JRadioButton rdbtnLemonade = new JRadioButton("Lemonade");
		rdbtnLemonade.setBounds(210, 0, 104, 23);
		pnlSelection.add(rdbtnLemonade);
		
		JRadioButton rdbtnTango = new JRadioButton("Tango");
		rdbtnTango.setBounds(0, 28, 92, 23);
		pnlSelection.add(rdbtnTango);
		
		JRadioButton rdbtnWater = new JRadioButton("Water");
		rdbtnWater.setBounds(220, 28, 94, 23);
		pnlSelection.add(rdbtnWater);
		
		JRadioButton rdbtnPepsi = new JRadioButton("Pepsi");
		rdbtnPepsi.setBounds(2, 56, 90, 23);
		pnlSelection.add(rdbtnPepsi);
		
		JRadioButton rdbtnSprite = new JRadioButton("Sprite");
		rdbtnSprite.setBounds(221, 56, 93, 23);
		pnlSelection.add(rdbtnSprite);
		
	    lblTimeoutnmb = new JLabel();
	    lblTimeoutnmb.setBounds(3, 97, 331, 72);
	    pnlSelection.add(lblTimeoutnmb);
	    lblTimeoutnmb.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPanel pnlCash = new JPanel();
		pnlCash.setBounds(347, 54, 271, 146);
		contentPane.add(pnlCash);
		pnlCash.setLayout(null);
		
		
		JLabel lblSelectionPrice = new JLabel("Selection Price:");
		lblSelectionPrice.setBounds(7, 7, 124, 14);
		pnlCash.add(lblSelectionPrice);
		
		tfPrice = new JTextField();
		tfPrice.setEditable(false);
		tfPrice.setBounds(7, 25, 257, 20);
		pnlCash.add(tfPrice);
		tfPrice.setColumns(10);
		
		JLabel lblInsertedCash = new JLabel("Inserted Cash:");
		lblInsertedCash.setBounds(7, 49, 124, 14);
		pnlCash.add(lblInsertedCash);
		
		tfCash = new JTextField();
		tfCash.setEditable(false);
		tfCash.setBounds(7, 67, 257, 20);
		pnlCash.add(tfCash);
		tfCash.setColumns(10);
		
		JLabel lblChange = new JLabel("Cash Change:");
		lblChange.setBounds(7, 95, 124, 14);
		pnlCash.add(lblChange);
		
		tfChange = new JTextField();
		tfChange.setEditable(false);
		tfChange.setBounds(7, 113, 257, 20);
		pnlCash.add(tfChange);
		tfChange.setColumns(10);
		
		tfCardResult = new JTextField();
		tfCardResult.setEditable(false);
		tfCardResult.setBounds(7, 113, 257, 20);
		pnlCash.add(tfCardResult);
		tfCardResult.setColumns(10);
		
		tfSavings = new JTextField();
		tfSavings.setEditable(false);
		tfSavings.setColumns(10);
		tfSavings.setBounds(7, 67, 257, 20);
		pnlCash.add(tfSavings);
		
		JLabel lblDiscount = new JLabel("With your loyalty card you saved:");
		lblDiscount.setBounds(7, 49, 191, 14);
		pnlCash.add(lblDiscount);
		
		JPanel pnlButtons = new JPanel();
		pnlButtons.setBounds(347, 206, 271, 91);
		contentPane.add(pnlButtons);
		pnlButtons.setLayout(null);
		
		JButton btnClear = new JButton("Clear");
		
		btnClear.setBounds(10, 11, 121, 34);
		pnlButtons.add(btnClear);
		
		JButton btnPurchase = new JButton("Purchase");
		btnPurchase.setBounds(74, 46, 121, 45);
		pnlButtons.add(btnPurchase);
		
		JButton btnCancel = new JButton("Cancel");
		
		btnCancel.setBounds(140, 11, 121, 34);
		pnlButtons.add(btnCancel);
		
		JPanel pnlCoins = new JPanel();
		
		pnlCoins.setBounds(10, 211, 242, 91);
		contentPane.add(pnlCoins);
		
		JButton btn1p = new JButton("1p");
		
		pnlCoins.add(btn1p);
		
		JButton btn2p = new JButton("2p");
		pnlCoins.add(btn2p);
		
		JButton btn5p = new JButton("5p");
		pnlCoins.add(btn5p);
		
		JButton btn10p = new JButton("10p");
		pnlCoins.add(btn10p);
		
		JButton btn20p = new JButton("20p");
		pnlCoins.add(btn20p);
		
		JButton btn50p = new JButton("50p");
		pnlCoins.add(btn50p);
		
		JButton btnpound = new JButton("\u00A31");
		pnlCoins.add(btnpound);
		
		JButton btn2pound = new JButton("\u00A32");
		pnlCoins.add(btn2pound);
		
		JButton btn5pound = new JButton("\u00A35");
		pnlCoins.add(btn5pound);
		
		JButton btn10pound = new JButton("\u00A310");
		pnlCoins.add(btn10pound);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1, 1);
		contentPane.add(layeredPane);
		layeredPane.setLayout(null);
		
		/**
		 * Panel contents overlay on same JFrame therefore this logic hides unwanted UI elements
		 */
		if (paymenttype == 0) {
			lblDiscount.setVisible(false);
			tfSavings.setVisible(false);
			tfCardResult.setVisible(false);
		}
		else {
			pnlCoins.setVisible(false);
			lblInsertedCash.setVisible(false);
			lblChange.setVisible(false);
			tfCash.setVisible(false);
			tfChange.setVisible(false);
		}
		
		/**
		 * Custom Event Handler for radio button
		 */
		ActionListener rblistener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String temp = options.getSelection().getActionCommand();
				 tfPrice.setText(Controller.ReturnPrice(temp));
				 tfSavings.setText(Controller.returnSavings());
				 timercount = 60;
			}
			
		};
		/**
		 * Radio buttons are added to a button group and assigned the same listener to avoid creating many event handlers
		 */
		options.add(rdbtnSprite);
		rdbtnSprite.setActionCommand("Sprite");
		rdbtnSprite.addActionListener(rblistener);
		options.add(rdbtnPepsi);
		rdbtnPepsi.setActionCommand("Pepsi");
		rdbtnPepsi.addActionListener(rblistener);
		options.add(rdbtnWater);
		rdbtnWater.setActionCommand("Water");
		rdbtnWater.addActionListener(rblistener);
		options.add(rdbtnTango);
		rdbtnTango.setActionCommand("Tango");
		rdbtnTango.addActionListener(rblistener);
		options.add(rdbtnLemonade);
		rdbtnLemonade.setActionCommand("Lemonade");
		rdbtnLemonade.addActionListener(rblistener);
		options.add(rdbtnCoke);
		rdbtnCoke.setActionCommand("Coke");
		rdbtnCoke.addActionListener(rblistener);
		/**
		 * Coin event listeners, on coin click they send the cash value to the controller to total and update the cash textfield from controller, they additionally
		 * reset the timer count back to 60
		 */
		btn1p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.InsertCash("0.01");
				tfCash.setText(Controller.ReturnCash());
				timercount = 60;
			}
		});
		btn2p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.InsertCash("0.02");
				tfCash.setText(Controller.ReturnCash());
				timercount = 60;
			}
		});
		btn5p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.InsertCash("0.05");
				tfCash.setText(Controller.ReturnCash());
				timercount = 60;
			}
		});
		btn10p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.InsertCash("0.10");
				tfCash.setText(Controller.ReturnCash());
				timercount = 60;
			}
		});
		btn20p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.InsertCash("0.20");
				tfCash.setText(Controller.ReturnCash());
				timercount = 60;
			}
		});
		btn50p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.InsertCash("0.50");
				tfCash.setText(Controller.ReturnCash());
				timercount = 60;
			}
		});
		btnpound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.InsertCash("1.00");
				tfCash.setText(Controller.ReturnCash());
				timercount = 60;
			}
		});
		btn2pound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.InsertCash("2.00");
				tfCash.setText(Controller.ReturnCash());
				timercount = 60;
			}
		});
		btn5pound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.InsertCash("5.00");
				tfCash.setText(Controller.ReturnCash());
				timercount = 60;
			}
		});
		btn10pound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Controller.InsertCash("10.00");
				tfCash.setText(Controller.ReturnCash());
				timercount = 60;
			}
		});
		/**
		 * Main button handlers
		 */
		/**
		 * The purchase button checks for drink selection and sends purchase information to controller.
		 * It then resets the display apart from the transaction result, it then resets the timeout.
		 */
		btnPurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (options.getSelection() == null) {
					tfChange.setText("Select a drink first");;
				}
				else {
					tfChange.setText(Controller.Purchase());
				}
				Controller.resetCash();
				tfCash.setText("");
				tfPrice.setText("");
				tfSavings.setText("");
				tfCardResult.setText(Controller.Purchase());
				options.clearSelection();
				timercount = 60;
			}
		});
		/**
		 * Button clear resets the display and resets the timeout.
		 */
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfPrice.setText("");
				tfCash.setText("");
				tfChange.setText("");
				tfSavings.setText("");
				tfCardResult.setText("");
				Controller.resetCash();
				options.clearSelection();
				timercount = 60;
				
			}
		});
		/**
		 * Cancel returns to the previous screen and closes this class.
		 */
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		/**
		 * Timer Logic to call the updateTimer function every second, the logic requires repainting the GUI to update the text label.
		 */
		Timer t = new Timer(1000, new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		        updateTimer();
		        lblTimeoutnmb.setText(Integer.toString(timercount + 1) + " seconds of inactivity left until termination");
		        repaint();
		    }
		});
		t.start();
	}
}
