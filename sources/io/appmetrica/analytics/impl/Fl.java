package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Fl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Hl f45824a;

    public Fl(Hl hl2) {
        this.f45824a = hl2;
    }

    public final void a(String str, Jl jl2, C3521fm c3521fm) {
        ArrayList arrayList;
        synchronized (this.f45824a.f45946b) {
            try {
                Collection collection = (Collection) this.f45824a.f45945a.f46140a.get(str);
                arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Ql) it.next()).a(jl2, c3521fm);
        }
    }
}
