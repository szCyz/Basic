package com.example.hsxfd.cyzim;

import android.app.Activity;

import java.io.Serializable;

/**
 * Created by chenyuzhao on 17/12/18.
 */

public class StatusBarNotificationConfig implements Serializable {
    public int notificationSmallIconId;
    public boolean ring = true;
    public String notificationSound;
    public boolean vibrate = true;
    public int ledARGB = -1;
    public int ledOnMs = -1;
    public int ledOffMs = -1;
    public boolean hideContent = false;
    public boolean downTimeToggle = false;
    public String downTimeBegin;
    public String downTimeEnd;
    public Class<? extends Activity> notificationEntrance;
    public boolean titleOnlyShowAppName = false;
    public boolean notificationFolded = true;
    public int notificationColor;
    public boolean showBadge = false;

    public StatusBarNotificationConfig() {
    }
}