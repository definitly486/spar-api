package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3382ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3399b3 f46913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3676m2 f46914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f46915c;

    public C3382ac(C3399b3 c3399b3, C3676m2 c3676m2) {
        ArrayList arrayList = new ArrayList();
        this.f46915c = arrayList;
        this.f46913a = c3399b3;
        arrayList.add(c3399b3);
        this.f46914b = c3676m2;
        arrayList.add(c3676m2);
    }

    public final synchronized void a() {
        Iterator it = this.f46915c.iterator();
        while (it.hasNext()) {
            ((InterfaceC3843sk) it.next()).onCreate();
        }
    }

    public final synchronized void a(Ha ha3) {
        this.f46915c.add(ha3);
    }
}
