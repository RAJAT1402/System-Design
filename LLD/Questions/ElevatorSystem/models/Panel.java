package models;

import java.util.List;

public class Panel extends BaseModel{
    private String display;
    private List<Button> buttons;
    private PanelType panelType;
    
    public String getDisplay() {
        return display;
    }
    public void setDisplay(String display) {
        this.display = display;
    }
    public List<Button> getButtons() {
        return buttons;
    }
    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }
    public PanelType getPanelType() {
        return panelType;
    }
    public void setPanelType(PanelType panelType) {
        this.panelType = panelType;
    }

    
}
