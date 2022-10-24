package com.company.onboarding.screen.labels;

import io.jmix.ui.component.Button;
import io.jmix.ui.component.Label;
import io.jmix.ui.screen.Screen;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("sample_LabelScreen")
@UiDescriptor("label-screen.xml")
public class LabelScreen extends Screen {
    @Autowired
    private Label<String> messageLabel;

    public void setMessageLabel(String message) {
        messageLabel.setValue(message);
    }

    @Subscribe("closeBtn")
    protected void onCloseBtnClick(Button.ClickEvent event) {
        closeWithDefaultAction();
    }
}
