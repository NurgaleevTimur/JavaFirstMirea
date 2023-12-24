package pr5_task1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatch extends JFrame {
    private JButton milanButton; // кнопка для команды Милан
    private JButton madridButton; // кнопка для команды Мадрид
    private JLabel resultLabel; // метка для отображения результата матча
    private JLabel lastScorerLabel; // метка для отображения последнего забившего
    private JLabel winnerLabel; // метка для отображения победителя
    private int milanScore = 0; // счет Милана
    private int madridScore = 0; // счет Мадрида

    public FootballMatch() {
        setTitle("Football Match"); // устанавливаем заголовок окна
        setLayout(new FlowLayout()); // устанавливаем менеджер компоновки FlowLayout

        milanButton = new JButton("AC Milan"); // создаем кнопку для команды Милан
        madridButton = new JButton("Real Madrid"); // создаем кнопку для команды Мадрид
        resultLabel = new JLabel("Result: 0 X 0"); // создаем метку для отображения результата матча
        lastScorerLabel = new JLabel("Last Scorer: N/A"); // создаем метку для отображения последнего забившего
        winnerLabel = new JLabel("Winner: DRAW"); // создаем метку для отображения победителя

        // добавляем слушателя событий к кнопке Милана
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++; // увеличиваем счет Милана
                updateResult(); // обновляем результат матча
                lastScorerLabel.setText("Last Scorer: AC Milan"); // выводим информацию о последнем забившем
                checkWinner(); // проверяем победителя
            }
        });

        // добавляем слушателя событий к кнопке Мадрида
        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++; // увеличиваем счет Мадрида
                updateResult(); // обновляем результат матча
                lastScorerLabel.setText("Last Scorer: Real Madrid"); // выводим информацию о последнем забившем
                checkWinner(); // проверяем победителя
            }
        });

        // добавляем компоненты на панель
        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);

        setSize(300, 200); // устанавливаем размер окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // устанавливаем операцию закрытия окна при нажатии на крестик
        setVisible(true); // делаем окно видимым
    }

    // метод для обновления результата матча
    private void updateResult() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
    }

    // метод для проверки победителя
    private void checkWinner() {
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new FootballMatch(); // создаем объект класса FootballMatch
    }
}