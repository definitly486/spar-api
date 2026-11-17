package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class An {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4021zn f45477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BiFunction f45478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M6 f45479c;

    public An() {
        this(new C3971xn(), new Ga(), C3952x4.l().n());
    }

    public final ArrayList a(Thread thread, Thread thread2) {
        Map mapC;
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new C3996yn());
        try {
            mapC = this.f45477a.c();
        } catch (SecurityException unused) {
            mapC = null;
        }
        if (mapC != null) {
            treeMap.putAll(mapC);
        }
        if (thread2 != null) {
            treeMap.remove(thread2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread3 = (Thread) entry.getKey();
            if (thread3 != thread && thread3 != thread2) {
                arrayList.add((C3871tn) this.f45478b.apply(thread3, (StackTraceElement[]) entry.getValue()));
            }
        }
        return arrayList;
    }

    public An(InterfaceC4021zn interfaceC4021zn, Ga ga3, M6 m13) {
        this.f45477a = interfaceC4021zn;
        this.f45478b = ga3;
        this.f45479c = m13;
    }
}
