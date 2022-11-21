package bridge.domain;

import bridge.view.InputView;

public class Player {
    private String command;
    private final InputView inputView;
    public Player(){
        inputView = new InputView();
    }
    public void getInputMoving(){
        command =  inputView.readMoving();
        isCorrectMoving();
    }
    public void getPlayerCommand(){
        command = inputView.readGameCommand();
        isCorrectCommand();
    }
    public String getCommand(){
        return command;
    }
    private boolean isCorrectMoving(){
        return true;
    }
    private boolean isCorrectCommand(){
        return true;
    }

}
