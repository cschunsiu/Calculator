package cal;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;

/**
 * Created by US20280 on 2/16/2017.
 */
public class App extends JFrame{
    AppControl ac = new AppControl();

    private JButton one;
    private JButton two;
    private JButton three;
    private JButton plus;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton minus;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton times;
    private JButton divide;
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton equal;
    private JButton clearButton;
    private JButton zero;
    private String result;

    public App(){

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(panel1);
        pack();
        setVisible(true);


        one.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickinjecter("1");
            }
        });


        two.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickinjecter("2");
            }
        });
        plus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickinjecter("+");

            }
        });
        three.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickinjecter("3");
            }
        });
        four.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickinjecter("4");
            }
        });
        five.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickinjecter("5");
            }
        });
        six.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickinjecter("6");
            }
        });
        seven.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickinjecter("7");
            }
        });
        eight.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickinjecter("8");
            }
        });
        nine.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickinjecter("9");
            }
        });
        equal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickinjecter("=");
            }
        });
        clearButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickinjecter("cc");
            }
        });
        minus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickinjecter("-");
            }
        });
        times.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickinjecter("*");
            }
        });
        divide.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickinjecter("/");
            }
        });
        zero.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clickinjecter("0");
            }
        });
    }

    public void clickinjecter(String CalVal){
        String result = ac.ValDistributor(CalVal);
        textArea1.setText(result);
    }

}
