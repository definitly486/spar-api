package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements PurchaseHistoryResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingConfig f45200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f45201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f45202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f45203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f45204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f45205f;

    public i(BillingConfig billingConfig, BillingClient billingClient, UtilsProvider utilsProvider, String str, d dVar, n nVar) {
        this.f45200a = billingConfig;
        this.f45201b = billingClient;
        this.f45202c = utilsProvider;
        this.f45203d = str;
        this.f45204e = dVar;
        this.f45205f = nVar;
    }

    public final void onPurchaseHistoryResponse(BillingResult billingResult, List list) {
        this.f45202c.getWorkerExecutor().execute(new g(this, billingResult, list));
    }
}
