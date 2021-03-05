package com.cdemarti;

public class UIControl {
    private boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        System.out.println("UIcontrol");
        this.isEnabled = isEnabled;
    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
