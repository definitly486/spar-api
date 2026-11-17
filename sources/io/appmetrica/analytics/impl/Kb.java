package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.lang.ref.WeakReference;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class Kb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f46142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f46143b;

    public Kb(Handler handler, V2 v13) {
        this.f46142a = new WeakReference(handler);
        this.f46143b = new WeakReference(v13);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = (Handler) this.f46142a.get();
        V2 v13 = (V2) this.f46143b.get();
        if (handler == null || v13 == null) {
            return;
        }
        boolean zF = v13.f46643b.f();
        if (!zF) {
            PublicLogger publicLogger = v13.f46644c;
            Set set = R9.f46441a;
            EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
            C3579i4 c3579i4 = new C3579i4("", "", 3, 0, publicLogger);
            Ji ji2 = v13.f46649h;
            Sh sh2 = v13.f46643b;
            ji2.getClass();
            ji2.a(Ji.a(c3579i4, sh2), sh2, 1, null);
        }
        if (zF) {
            return;
        }
        Jb.a(handler, v13, this);
    }
}
