package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes2.dex */
abstract class lqeggnwhkg {
    static void iobyxmoadg(Object obj, long j13) {
        LockSupport.parkNanos(obj, Math.min(j13, 2147483647999999999L));
    }
}
