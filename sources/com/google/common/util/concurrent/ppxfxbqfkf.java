package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f23809iobyxmoadg = new Object();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private volatile Logger f23810ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f23811zoijcleaow;

    ppxfxbqfkf(Class cls) {
        this.f23811zoijcleaow = cls.getName();
    }

    Logger iobyxmoadg() {
        Logger logger = this.f23810ppxfxbqfkf;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f23809iobyxmoadg) {
            try {
                Logger logger2 = this.f23810ppxfxbqfkf;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f23811zoijcleaow);
                this.f23810ppxfxbqfkf = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
