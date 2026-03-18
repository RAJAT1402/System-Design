package models;


public class Button extends BaseModel{
    private String buttonInfo;
    private ButtonType buttonType;

    public String getButtonInfo() {
        return buttonInfo;
    }
    public void setButtonInfo(String buttonInfo) {
        this.buttonInfo = buttonInfo;
    }
    public ButtonType getButtonType() {
        return buttonType;
    }
    public void setButtonType(ButtonType buttonType) {
        this.buttonType = buttonType;
    }
}