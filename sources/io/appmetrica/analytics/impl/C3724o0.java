package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3724o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Vn f47790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Boolean f47791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Wa f47792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Xa f47793d;

    public C3724o0() {
        this(new Vn());
    }

    public final synchronized Wa a(Context context, C3703n4 c3703n4) {
        try {
            if (this.f47792c == null) {
                if (a(context)) {
                    this.f47792c = new C3774q0();
                } else {
                    this.f47792c = new C3699n0(context, c3703n4);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f47792c;
    }

    public C3724o0(Vn vn2) {
        this.f47790a = vn2;
    }

    public final boolean a(Context context) {
        Boolean boolValueOf = this.f47791b;
        if (boolValueOf == null) {
            synchronized (this) {
                try {
                    boolValueOf = this.f47791b;
                    if (boolValueOf == null) {
                        this.f47790a.getClass();
                        boolean zA = Vn.a(context);
                        boolValueOf = Boolean.valueOf(!zA);
                        this.f47791b = boolValueOf;
                        if (!zA) {
                            ImportantLogger.INSTANCE.info("AppMetrica", "User is locked. So use stubs. Events will not be sent.", new Object[0]);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return boolValueOf.booleanValue();
    }
}
