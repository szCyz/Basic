package com.example.hsxfd.cyzim.common.util.log;

import com.example.hsxfd.cyzim.common.util.log.sdk.LogBase;
import com.example.hsxfd.cyzim.common.util.log.sdk.wrapper.MyLog;
import com.example.hsxfd.cyzim.common.util.storage.ExternalStorage;

/**
 * Created by chenyuzhao on 17/12/15.
 */

public class LogUtil extends MyLog {
    private static final String LOG_FILE_NAME_PREFIX = "demo";

    public static void init(String logDir, int level) {
        final LogBase.LogInterceptor interceptor = new LogBase.LogInterceptor() {
            @Override
            public boolean checkValidBeforeWrite() {
                return ExternalStorage.getInstance().checkStorageValid();
            }
        };

        MyLog.initDateNLog(null, logDir, LOG_FILE_NAME_PREFIX, level, 0, 0, true, interceptor);
    }

    public static void ui(String msg) {
        getLog().i("ui", buildMessage(msg));
    }

    public static void res(String msg) {
        getLog().i("res", buildMessage(msg));
    }

    public static void audio(String msg) {
        getLog().i("AudioRecorder", buildMessage(msg));
    }
}
