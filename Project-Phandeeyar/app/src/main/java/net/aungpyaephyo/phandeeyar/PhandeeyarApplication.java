package net.aungpyaephyo.phandeeyar;

import android.app.Application;
import android.content.Context;

import net.aungpyaephyo.phandeeyar.managers.DataManager;

/**
 * Created by aung on 2/25/16.
 */
public class PhandeeyarApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        DataManager.getInstance().loadEventList();
    }

    public static Context getContext() {
        return context;
    }
}
