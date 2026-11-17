package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class Dg implements InterfaceC3964xg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f45651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Ag f45653c;

    public Dg() {
        this(Ia.j().t());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3964xg
    public final synchronized void a(Ag ag2) {
        if (ag2 != null) {
            try {
                LoggerStorage.getMainPublicOrAnonymousLogger().info("Received referrer from source %s: %s", ag2.f45471d.f48616a, ag2.f45468a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f45653c = ag2;
        this.f45652b = true;
        Iterator it = this.f45651a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3839sg) it.next()).a(this.f45653c);
        }
        this.f45651a.clear();
    }

    public Dg(C3989yg c3989yg) {
        this.f45651a = new HashSet();
        c3989yg.a(new C3969xl(this));
        c3989yg.a();
    }

    public final synchronized void a(InterfaceC3839sg interfaceC3839sg) {
        this.f45651a.add(interfaceC3839sg);
        if (this.f45652b) {
            interfaceC3839sg.a(this.f45653c);
            this.f45651a.remove(interfaceC3839sg);
        }
    }
}
