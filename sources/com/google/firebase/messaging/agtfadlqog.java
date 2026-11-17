package com.google.firebase.messaging;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
abstract class agtfadlqog {
    static ExecutorService eablkybsjg() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
    }

    static ExecutorService gxszxtbevo() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
    }

    private static Executor iobyxmoadg(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
    }

    static ScheduledExecutorService lqeggnwhkg() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
    }

    static ScheduledExecutorService ppxfxbqfkf() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
    }

    static ExecutorService wkgbmnqykc() {
        return cd.zoijcleaow.iobyxmoadg().iobyxmoadg(new NamedThreadFactory("Firebase-Messaging-Intent-Handle"), cd.ppxfxbqfkf.HIGH_SPEED);
    }

    static Executor zoijcleaow() {
        return iobyxmoadg("Firebase-Messaging-File-Io");
    }
}
