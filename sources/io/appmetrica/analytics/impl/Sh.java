package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.internal.CounterConfiguration;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class Sh extends C3452d4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected W8 f46510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected If f46511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f46513f;

    public Sh(Pf pf2, CounterConfiguration counterConfiguration, W8 w13) {
        this(pf2, counterConfiguration, w13, null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        this.f47066b.toBundle(bundle);
        Pf pf2 = this.f47065a;
        synchronized (pf2) {
            bundle.putParcelable("PROCESS_CFG_OBJ", pf2);
        }
        return bundle;
    }

    public final synchronized String d() {
        W8 w13;
        w13 = this.f46510c;
        return w13.f46706a.isEmpty() ? null : new JSONObject(w13.f46706a).toString();
    }

    public final synchronized String e() {
        return this.f46513f;
    }

    public boolean f() {
        return this.f46512e;
    }

    public Sh(Pf pf2, CounterConfiguration counterConfiguration, W8 w13, String str) {
        super(pf2, counterConfiguration);
        this.f46512e = true;
        this.f46513f = str;
        this.f46510c = w13;
    }
}
