
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PaymentChoiceScreen extends JFrame {

	private JPanel contentPane;
	private MainPanel cash;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentChoiceScreen frame = new PaymentChoiceScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creates the frame.
	 */
	public PaymentChoiceScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCashPay = new JButton("Cash");
		/**
		 * Adds an action listener to call the MainPanel constructor method, the parameter passed in 
		 * is to tell the MainPanel class what payment method was chosen and then what elements to hide.
		 * 0 for cash and 1 for card
		 */
		btnCashPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    cash = new MainPanel(0);
				cash.setVisible(true);
				
			}
		});
		
		btnCashPay.setBounds(21, 79, 179, 92);
		contentPane.add(btnCashPay);
		
		JButton btnCardPay = new JButton("Loyalty Card");
		/**
		 * Adds an action listener to call the MainPanel constructor method, the parameter passed in 
		 * is to tell the MainPanel class what payment method was chosen and then what elements to hide.
		 * 0 for cash and 1 for card
		 */
		btnCardPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cash = new MainPanel(1);
				
				cash.setVisible(true);
				
			}
		});
		btnCardPay.setBounds(230, 79, 179, 92);
		contentPane.add(btnCardPay);
		
	}
}
