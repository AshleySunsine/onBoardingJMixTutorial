package com.company.onboarding.banner;

import io.jmix.ui.UiComponents;
import io.jmix.ui.component.Label;
import io.jmix.ui.screen.Extensions;
import io.jmix.ui.screen.Screen;
import io.jmix.ui.screen.Subscribe;
import io.jmix.ui.theme.ThemeClassNames;
import org.springframework.context.ApplicationContext;

public interface HasBanner {
    @Subscribe
    default void initBanner(Screen.InitEvent event) {
        ApplicationContext applicationContext = Extensions.getApplicationContext(event.getSource());
        UiComponents uiComponents = applicationContext.getBean(UiComponents.class);
        Label<String> banner = uiComponents.create(Label.TYPE_STRING);
        banner.setStyleName(ThemeClassNames.LABEL_H2);
        banner.setValue("Баннер");

        event.getSource().getWindow().add(banner, 0);
    }
}
