package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f45415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final draadjrbmk f45416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SafePackageManager f45418d;

    public f(e eVar, draadjrbmk draadjrbmkVar, String str, SafePackageManager safePackageManager) {
        this.f45415a = eVar;
        this.f45416b = draadjrbmkVar;
        this.f45417c = str;
        this.f45418d = safePackageManager;
    }

    public final Object a(Context context) throws g {
        IBinder iBinder;
        if (this.f45418d.resolveService(context, this.f45415a.f45412a, 0) == null) {
            throw new l("could not resolve " + this.f45417c + " services");
        }
        try {
            e eVar = this.f45415a;
            if (context.bindService(eVar.f45412a, eVar, 1)) {
                e eVar2 = this.f45415a;
                if (eVar2.f45413b == null) {
                    synchronized (eVar2.f45414c) {
                        if (eVar2.f45413b == null) {
                            try {
                                eVar2.f45414c.wait(3000L);
                            } catch (InterruptedException unused) {
                            }
                        }
                    }
                }
                iBinder = eVar2.f45413b;
            } else {
                iBinder = null;
            }
        } catch (Throwable unused2) {
        }
        if (iBinder != null) {
            return this.f45416b.invoke(iBinder);
        }
        throw new g("could not bind to " + this.f45417c + " services");
    }

    public final void b(Context context) {
        try {
            this.f45415a.a(context);
        } catch (Throwable unused) {
        }
    }

    public f(Intent intent, draadjrbmk draadjrbmkVar, String str) {
        this(new e(intent, str), draadjrbmkVar, str, new SafePackageManager());
    }
}
