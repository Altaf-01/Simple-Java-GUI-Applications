import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RockPaperScissorsGame extends JFrame {

    private JButton rockButton;
    private JButton paperButton;
    private JButton scissorsButton;
    private JLabel resultLabel;

    public RockPaperScissorsGame() {
        setTitle("Rock Paper Scissors Game");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new GridLayout(2, 1));

        JPanel buttonPanel = new JPanel(new GridLayout(1, 3));
        rockButton = new JButton("Rock");
        paperButton = new JButton("Paper");
        scissorsButton = new JButton("Scissors");

        rockButton.addActionListener(new ButtonListener());
        paperButton.addActionListener(new ButtonListener());
        scissorsButton.addActionListener(new ButtonListener());

        buttonPanel.add(rockButton);
        buttonPanel.add(paperButton);
        buttonPanel.add(scissorsButton);

        resultLabel = new JLabel("Result will be displayed here");
        resultLabel.setHorizontalAlignment(JLabel.CENTER);

        mainPanel.add(buttonPanel);
        mainPanel.add(resultLabel);

        add(mainPanel);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String playerChoice = e.getActionCommand();
            String computerChoice = generateComputerChoice();

            String result = determineWinner(playerChoice, computerChoice);
            resultLabel.setText(result);
        }

        private String generateComputerChoice() {
            int randomNumber = (int) (Math.random() * 3);
            switch (randomNumber) {
                case 0:
                    return "Rock";
                case 1:
                    return "Paper";
                case 2:
                    return "Scissors";
                default:
                    return "";
            }
        }

        private String determineWinner(String playerChoice, String computerChoice) {
            if (playerChoice.equals(computerChoice)) {
                return "It's a tie!";
            } else if ((playerChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                    (playerChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                    (playerChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
                return "You win! Computer chose " + computerChoice + ".";
            } else {
                return "You lose! Computer chose " + computerChoice + ".";
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RockPaperScissorsGame().setVisible(true);
            }
        });
    }
}
