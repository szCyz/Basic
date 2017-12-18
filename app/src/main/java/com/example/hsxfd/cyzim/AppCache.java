package com.example.hsxfd.cyzim;

import android.app.Notification;
import android.content.Context;
import android.util.SparseArray;


/**
 * Created by jezhee on 2/20/15.
 */
public class AppCache {

    private static Context context;

    private static String account;

    private static StatusBarNotificationConfig notificationConfig;

    private static SparseArray<Notification> notifications = new SparseArray<>();

    public static SparseArray<Notification> getNotifications() {
        return notifications;
    }

    public static void clear() {
        account = null;
    }

    public static String getAccount() {
        return account;
    }

    private static boolean mainTaskLaunching;

    public static void setAccount(String account) {
        AppCache.account = account;
//        NimUIKit.setAccount(account);//云信UI组件接口/定制化
    }

    public static void setNotificationConfig(StatusBarNotificationConfig notificationConfig) {
        AppCache.notificationConfig = notificationConfig;
    }

    public static StatusBarNotificationConfig getNotificationConfig() {
        return notificationConfig;
    }

    public static Context getContext() {
        return context;
    }

    public static void setContext(Context context) {
        AppCache.context = context.getApplicationContext();
    }

    public static void setMainTaskLaunching(boolean mainTaskLaunching) {
        AppCache.mainTaskLaunching = mainTaskLaunching;
    }

    public static boolean isMainTaskLaunching() {
        return mainTaskLaunching;
    }
}
