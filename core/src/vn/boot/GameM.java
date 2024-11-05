package vn.boot;

import gro.AppListener;
import gro.GameSrc;

public class GameM extends AppListener {

    public static AppListener a() {
        return AppListener.gI();
    }

    public static void s() {
        GameSrc.gI();
        GameSrc.F();
    }
}
