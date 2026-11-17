package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class G5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3763pe f45843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H5 f45844b;

    public G5(H5 h13, InterfaceC3763pe interfaceC3763pe) {
        this.f45844b = h13;
        this.f45843a = interfaceC3763pe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f45844b) {
            try {
                H5 h13 = this.f45844b;
                Object obj = h13.f45879a;
                if (obj == null) {
                    h13.f45880b.add(this.f45843a);
                } else {
                    this.f45843a.consume(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
