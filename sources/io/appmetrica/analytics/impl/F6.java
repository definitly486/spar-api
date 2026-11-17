package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ICrashTransformer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class F6 implements InterfaceC3381ab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E6 f45791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICrashTransformer f45792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3560ha f45793c;

    public F6(E6 e13, ICrashTransformer iCrashTransformer, C3560ha c3560ha) {
        this.f45791a = e13;
        this.f45792b = iCrashTransformer;
        this.f45793c = c3560ha;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3381ab
    public final void a(Throwable th2, U u13) {
        if (this.f45791a.a(th2)) {
            ICrashTransformer iCrashTransformer = this.f45792b;
            if (iCrashTransformer == null || th2 == null || (th2 = iCrashTransformer.process(th2)) != null) {
                Nn nnA = Qn.a(th2, u13, null, (String) this.f45793c.f47382b.a(), (Boolean) this.f45793c.f47383c.a());
                Ac ac3 = (Ac) ((Oh) this).f46343d;
                ac3.f46588a.a().a(ac3.f45460b).a(nnA);
            }
        }
    }

    public final E6 b() {
        return this.f45791a;
    }

    public final ICrashTransformer a() {
        return this.f45792b;
    }
}
