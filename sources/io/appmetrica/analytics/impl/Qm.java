package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class Qm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f46434a;

    public Qm() {
        HashMap map = new HashMap();
        this.f46434a = map;
        Km km2 = new Km();
        Lm lm2 = new Lm();
        Mm mm2 = new Mm();
        Nm nm2 = new Nm();
        Om om2 = new Om();
        map.put(C3621jm.class, km2);
        map.put(Z1.class, lm2);
        map.put(C3813rf.class, mm2);
        map.put(C3925w2.class, nm2);
        map.put(O3.class, om2);
    }

    public static Rm a(Class cls) {
        return (Rm) Pm.f46400a.f46434a.get(cls);
    }
}
