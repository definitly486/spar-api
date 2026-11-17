package io.appmetrica.analytics.impl;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class En {
    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    public static Dn a(Throwable th2, int i13, int i14) {
        StackTraceElement[] stackTrace;
        Dn dnA;
        ArrayList arrayList;
        String name = th2.getClass().getName();
        String message = th2.getMessage();
        try {
            stackTrace = th2.getStackTrace();
        } catch (Throwable unused) {
            stackTrace = new StackTraceElement[0];
        }
        ArrayList arrayList2 = new ArrayList(stackTrace.length);
        for (StackTraceElement stackTraceElement : stackTrace) {
            arrayList2.add(new Dl(stackTraceElement));
        }
        Throwable cause = th2.getCause();
        if (cause == null) {
            dnA = null;
        } else {
            if (i14 >= i13) {
                cause = null;
            }
            if (cause != null) {
                dnA = a(cause, 30, i14 + 1);
            } else {
                dnA = null;
            }
        }
        if (i14 < i13) {
            Throwable[] suppressed = th2.getSuppressed();
            arrayList = new ArrayList(suppressed.length);
            for (Throwable th3 : suppressed) {
                arrayList.add(a(th3, 1, i14));
            }
        } else {
            arrayList = null;
        }
        return new Dn(name, message, arrayList2, dnA, arrayList);
    }
}
