package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class G6 implements InterfaceC3381ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f45845a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC3381ab
    public final void a(Throwable th2, U u13) {
        Iterator it = this.f45845a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3381ab) it.next()).a(th2, u13);
        }
    }

    public final void a(InterfaceC3381ab... interfaceC3381abArr) {
        hg.jyumaefscl.cdpycssgdh(this.f45845a, interfaceC3381abArr);
    }

    public final void a(List<? extends InterfaceC3381ab> list) {
        this.f45845a.addAll(list);
    }

    public final void a() {
        this.f45845a.clear();
    }
}
