package com.company.onboarding.screen.user;

import com.company.onboarding.entity.User;
import com.company.onboarding.screen.labels.LabelScreen;
import io.jmix.ui.Notifications;
import io.jmix.ui.ScreenBuilders;
import io.jmix.ui.Screens;
import io.jmix.ui.UiComponents;
import io.jmix.ui.component.Button;
import io.jmix.ui.component.Component;
import io.jmix.ui.component.FileStorageResource;
import io.jmix.ui.component.Image;
import io.jmix.ui.navigation.Route;
import io.jmix.ui.screen.*;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("User.browse")
@UiDescriptor("user-browse.xml")
@LookupComponent("usersTable")
@Route("users")
public class UserBrowse extends StandardLookup<User> {
    @Autowired
    private UiComponents uiComponents;

    @Autowired
    private Screens screens;

    @Autowired
    private ScreenBuilders screenBuilders;

    @Autowired
    private Notifications notifications;

    @Install(to = "usersTable.picture", subject = "columnGenerator")
    private Component usersTablePictureColumnGenerator(User user) {
        if (user.getPicture() != null) {
            Image image = uiComponents.create(Image.class);
            image.setScaleMode(Image.ScaleMode.CONTAIN);
            image.setSource(FileStorageResource.class).setFileReference(user.getPicture());
            image.setWidth("50px");
            image.setHeight("50px");
            return image;
        } else {
            return null;
        }
    }

    @Subscribe("someButton")
    public void onSomeButtonClick(Button.ClickEvent event) {
        System.out.println("SomeButtom clicked!");
        screenBuilders.screen(this)
                .withScreenClass(LabelScreen.class)
                .withAfterCloseListener(e -> {
                    notifications.create().withCaption("Закрыли").show();
                })
                .build()
                .show();
    }
}