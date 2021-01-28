package com.revature.util;

import com.revature.screens.Screen;

public class ScreenRouter {

    private Set<Screen> screens = new Set<Screen>();

    public Set<Screen> getScreens() {
        return screens;
    }

    public ScreenRouter addScreen(Screen screen){
        System.out.println("[LOG] - Loading " + screen.getName() + " into router");
        screens.add(screen);
        return this;
    }

    public void navigate(String route){
        for(Screen screen : screens.toArray(Screen.class)){
            if(screen.getRoute().equals(route)){
                screen.render();
            }
        }
//        LinkedList<Screen> tempScreens = new LinkedList<>();
//        Screen currentScreen = screens.pop();
//        while(currentScreen != null){
//            tempScreens.insert(currentScreen);
//            if(currentScreen.getRoute().equals(route)){
//                currentScreen.render();
//            }
//            currentScreen = screens.pop();
//        }
//        screens = tempScreens;
    }
}
