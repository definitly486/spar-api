package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor$updateBilling$1;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements BillingClientStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f45174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f45175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f45176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f45177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f45178e;

    public b(BillingConfig billingConfig, BillingClient billingClient, BillingLibraryMonitor$updateBilling$1 billingLibraryMonitor$updateBilling$1, d dVar, n nVar) {
        this.f45174a = billingConfig;
        this.f45175b = billingClient;
        this.f45176c = billingLibraryMonitor$updateBilling$1;
        this.f45177d = dVar;
        this.f45178e = nVar;
    }

    public final void onBillingServiceDisconnected() {
    }

    public final void onBillingSetupFinished(BillingResult billingResult) {
        this.f45176c.getWorkerExecutor().execute(new a(this, billingResult));
    }
}
