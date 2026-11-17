package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.internal.CounterConfiguration;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3452d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pf f47065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CounterConfiguration f47066b;

    public C3452d4(Pf pf2, CounterConfiguration counterConfiguration) {
        this.f47065a = pf2;
        this.f47066b = counterConfiguration;
    }

    public static C3452d4 a(Context context, Bundle bundle) {
        Pf pf2;
        String str = Pf.f46388c;
        if (bundle != null) {
            try {
                pf2 = (Pf) bundle.getParcelable("PROCESS_CFG_OBJ");
            } catch (Throwable unused) {
                pf2 = null;
            }
        } else {
            pf2 = null;
        }
        CounterConfiguration counterConfigurationFromBundle = CounterConfiguration.fromBundle(bundle);
        if (counterConfigurationFromBundle == null || pf2 == null || !context.getPackageName().equals(pf2.f46389a.getAsString("PROCESS_CFG_PACKAGE_NAME")) || pf2.f46389a.getAsInteger("PROCESS_CFG_SDK_API_LEVEL").intValue() != AppMetrica.getLibraryApiLevel()) {
            return null;
        }
        return new C3452d4(pf2, counterConfigurationFromBundle);
    }

    public final CounterConfiguration b() {
        return this.f47066b;
    }

    public final String toString() {
        return "ClientConfiguration{mProcessConfiguration=" + this.f47065a + ", mCounterConfiguration=" + this.f47066b + '}';
    }

    public final Pf a() {
        return this.f47065a;
    }
}
