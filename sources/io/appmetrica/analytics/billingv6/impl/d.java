package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingClient f45182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f45183b = new LinkedHashSet();

    public d(BillingClient billingClient) {
        this.f45182a = billingClient;
    }

    public final void a(Object obj) {
        this.f45183b.remove(obj);
        if (this.f45183b.size() == 0) {
            this.f45182a.endConnection();
        }
    }
}
