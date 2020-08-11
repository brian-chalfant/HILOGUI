package sample;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import javax.swing.*;
import java.util.ArrayList;

public class Controller {
    boolean cheatMode = false;
    @FXML
    public GridPane arraycontainer;
    @FXML
    private Button buttonNewGame;
    @FXML
    private MenuItem settingsPreferences;
    @FXML
    private MenuItem cheatModeToggle;
    private static int guesses = 6;
    @FXML
    private Label notifyLabel;
    private int guessesRemaining = guesses;
    public Label label0;
    public Label label1;
    public Label label2;
    public Label label3;
    public Label label4;
    public Label label5;
    public Label label6;
    public Label label7;
    public Label label8;
    public Label label9;
    public Label label10;
    public Label label11;
    public Label label12;
    public Label label13;
    public Label label14;
    public Label label15;
    public Label label16;
    public Label label17;
    public Label label18;
    public Label label19;
    public Label label20;
    public Label label21;
    public Label label22;
    public Label label23;
    public Label label24;
    public Label label25;
    public Label label26;
    public Label label27;
    public Label label28;
    public Label label29;
    public Label label30;
    public Label label31;
    public Label label32;
    public Label label33;
    public Label label34;
    public Label label35;
    public Label label36;
    public Label label37;
    public Label label38;
    public Label label39;
    public Label label40;
    public Label label41;
    public Label label42;
    public Label label43;
    public Label label44;
    public Label label45;
    public Label label46;
    public Label label47;
    public Label label48;
    public Label label49;
    public Label label50;
    public Label label51;
    public Label label52;
    public Label label53;
    public Label label54;
    public Label label55;
    public Label label56;
    public Label label57;
    public Label label58;
    public Label label59;
    public Label label60;
    public Label label61;
    public Label label62;
    public Label label63;
    public Label label64;
    public Label label65;
    public Label label66;
    public Label label67;
    public Label label68;
    public Label label69;
    public Label label70;
    public Label label71;
    public Label label72;
    public Label label73;
    public Label label74;
    public Label label75;
    public Label label76;
    public Label label77;
    public Label label78;
    public Label label79;
    public Label label80;
    public Label label81;
    public Label label82;
    public Label label83;
    public Label label84;
    public Label label85;
    public Label label86;
    public Label label87;
    public Label label88;
    public Label label89;
    public Label label90;
    public Label label91;
    public Label label92;
    public Label label93;
    public Label label94;
    public Label label95;
    public Label label96;
    public Label label97;
    public Label label98;
    public Label label99;
    @FXML
    private TextField textfield;
    @FXML
    private Label guessPromptLabel;
    @FXML
    private Button buttonGuess;
    @FXML
    private MenuItem FileExit;
    @FXML
    private Label remainingLabel;
    final private ArrayList<Label> myLabel = new ArrayList<>();
    @FXML
    private MenuItem FileNewGame;
    private int magicNumber = randomizeMagicNumber();


    public void initialize() {

        myLabel.add(0, label0);
        myLabel.add(1, label1);
        myLabel.add(2, label2);
        myLabel.add(3, label3);
        myLabel.add(4, label4);
        myLabel.add(5, label5);
        myLabel.add(6, label6);
        myLabel.add(7, label7);
        myLabel.add(8, label8);
        myLabel.add(9, label9);
        myLabel.add(10, label10);
        myLabel.add(11, label11);
        myLabel.add(12, label12);
        myLabel.add(13, label13);
        myLabel.add(14, label14);
        myLabel.add(15, label15);
        myLabel.add(16, label16);
        myLabel.add(17, label17);
        myLabel.add(18, label18);
        myLabel.add(19, label19);
        myLabel.add(20, label20);
        myLabel.add(21, label21);
        myLabel.add(22, label22);
        myLabel.add(23, label23);
        myLabel.add(24, label24);
        myLabel.add(25, label25);
        myLabel.add(26, label26);
        myLabel.add(27, label27);
        myLabel.add(28, label28);
        myLabel.add(29, label29);
        myLabel.add(30, label30);
        myLabel.add(31, label31);
        myLabel.add(32, label32);
        myLabel.add(33, label33);
        myLabel.add(34, label34);
        myLabel.add(35, label35);
        myLabel.add(36, label36);
        myLabel.add(37, label37);
        myLabel.add(38, label38);
        myLabel.add(39, label39);
        myLabel.add(40, label40);
        myLabel.add(41, label41);
        myLabel.add(42, label42);
        myLabel.add(43, label43);
        myLabel.add(44, label44);
        myLabel.add(45, label45);
        myLabel.add(46, label46);
        myLabel.add(47, label47);
        myLabel.add(48, label48);
        myLabel.add(49, label49);
        myLabel.add(50, label50);
        myLabel.add(51, label51);
        myLabel.add(52, label52);
        myLabel.add(53, label53);
        myLabel.add(54, label54);
        myLabel.add(55, label55);
        myLabel.add(56, label56);
        myLabel.add(57, label57);
        myLabel.add(58, label58);
        myLabel.add(59, label59);
        myLabel.add(60, label60);
        myLabel.add(61, label61);
        myLabel.add(62, label62);
        myLabel.add(63, label63);
        myLabel.add(64, label64);
        myLabel.add(65, label65);
        myLabel.add(66, label66);
        myLabel.add(67, label67);
        myLabel.add(68, label68);
        myLabel.add(69, label69);
        myLabel.add(70, label70);
        myLabel.add(71, label71);
        myLabel.add(72, label72);
        myLabel.add(73, label73);
        myLabel.add(74, label74);
        myLabel.add(75, label75);
        myLabel.add(76, label76);
        myLabel.add(77, label77);
        myLabel.add(78, label78);
        myLabel.add(79, label79);
        myLabel.add(80, label80);
        myLabel.add(81, label81);
        myLabel.add(82, label82);
        myLabel.add(83, label83);
        myLabel.add(84, label84);
        myLabel.add(85, label85);
        myLabel.add(86, label86);
        myLabel.add(87, label87);
        myLabel.add(88, label88);
        myLabel.add(89, label89);
        myLabel.add(90, label90);
        myLabel.add(91, label91);
        myLabel.add(92, label92);
        myLabel.add(93, label93);
        myLabel.add(94, label94);
        myLabel.add(95, label95);
        myLabel.add(96, label96);
        myLabel.add(97, label97);
        myLabel.add(98, label98);
        myLabel.add(99, label99);
        textfield.textProperty().addListener((observable, oldValue, newValue) -> buttonGuess.setDisable(textfield.getText().isEmpty() || textfield.getText().trim().isEmpty()));
        buttonGuess.setDisable(true);
        FileNewGame.setOnAction(e -> reset());
        FileExit.setOnAction(event -> {

        });

        FileExit.setOnAction(event -> System.exit(0));
        cheatModeToggle.setOnAction(event -> myLabel.get(magicNumber).setStyle("-fx-background-color: green;"));
        cheatModeToggle.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(cheatMode){
                    myLabel.get(magicNumber).setStyle("-fx-background-color: inherit;");
                } else {
                    myLabel.get(magicNumber).setStyle("-fx-background-color: green");
                }
                cheatMode = !cheatMode;


            }
        });
        {


        }
        settingsPreferences.setOnAction(event -> setGuesses());
    }


    @FXML
    public void onButtonClick() {
        int user_input = Integer.parseInt(textfield.getText());
        if (guessesRemaining == 1 && user_input != magicNumber) {
            notifyLabel.setText("You Lose");
            endGame(magicNumber);
        } else{
            if (user_input == magicNumber) {
                notifyLabel.setText("You Win");
                endGame(magicNumber);
            } else if (user_input > magicNumber) {
                System.out.println("Greater Than");
                for (int i = user_input; i < myLabel.size(); i++) {
                    System.out.println(i);
                    Label Labelx = myLabel.get(i);
                    Labelx.setStyle("-fx-background-color: salmon;");
                }
            } else {
                System.out.println("Less Than");
                for (int i = user_input; i >= 0; i--) {
                    Label Labelx = myLabel.get(i);
                    System.out.println("myLabel:" + myLabel.get(i).getText());
                    Labelx.setStyle("-fx-background-color: salmon;");

                }
        }

            guessesRemaining--;
            textfield.clear();
            remainingLabel.setText(guessesRemaining + " Remaining");
        }

    }

    public void endGame(int magicNumber) {
        for (Label Labelx : myLabel) {
            if (Labelx.getText().equals(Integer.toString(magicNumber))) {
                Labelx.setStyle("-fx-background-color: green");
            } else {
                Labelx.setStyle("-fx-background-color: red;");
            }
        }
        textfield.setDisable(true);
        remainingLabel.setText("");
        buttonGuess.setVisible(false);
        buttonNewGame.setVisible(true);


    }

    public void reset() {
        guessPromptLabel.setText("Enter your Guess: ");
        buttonGuess.setText("Guess");
        buttonGuess.setDisable(true);
        textfield.setDisable(false);
        for (Label Labelx : myLabel) {
            System.out.println("myLabel:" + Labelx.getText());
            Labelx.setStyle("-fx-background-color: gray;");
        }
        buttonNewGame.setVisible(false);
        buttonGuess.setVisible(true);
        magicNumber = randomizeMagicNumber();
        guessesRemaining = guesses;
        remainingLabel.setText(guessesRemaining + " Remaining");
        notifyLabel.setText("");


    }
    public void setGuesses(){
       int userRequest = Integer.parseInt(JOptionPane.showInputDialog("How Many Guesses do you want?: "));
        if (userRequest < 100){
            Controller.guesses = userRequest;
            remainingLabel.setText(guesses + " Remaining");
        }else {
            //JOptionPane.showMessageDialog(null,"Error","Error",2);
            Alert alert = new Alert(Alert.AlertType.WARNING, "That's way too many guesses!  there's only 100 numbers");
            alert.showAndWait();
        }
    }

    public int randomizeMagicNumber(){
        int magicNumber = ((int) (Math.random() * (99 + 1)));
        if(cheatMode){
            myLabel.get(magicNumber).setStyle("-fx-background-color: green;");
        }
        return magicNumber;
    }

}

