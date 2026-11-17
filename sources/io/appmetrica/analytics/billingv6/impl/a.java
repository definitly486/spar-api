package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchaseHistoryParams;
import hg.jyumaefscl;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f45172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f45173b;

    public a(b bVar, BillingResult billingResult) {
        this.f45172a = bVar;
        this.f45173b = billingResult;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        b bVar = this.f45172a;
        BillingResult billingResult = this.f45173b;
        bVar.getClass();
        if (billingResult.getResponseCode() != 0) {
            bVar.f45178e.onUpdateFinished();
            return;
        }
        for (String str : jyumaefscl.rgvfuqvkyq("inapp", "subs")) {
            BillingConfig billingConfig = bVar.f45174a;
            BillingClient billingClient = bVar.f45175b;
            UtilsProvider utilsProvider = bVar.f45176c;
            d dVar = bVar.f45177d;
            i iVar = new i(billingConfig, billingClient, utilsProvider, str, dVar, bVar.f45178e);
            dVar.f45183b.add(iVar);
            if (bVar.f45175b.isReady()) {
                bVar.f45175b.queryPurchaseHistoryAsync(QueryPurchaseHistoryParams.newBuilder().setProductType(str).build(), iVar);
            } else {
                bVar.f45177d.a(iVar);
                bVar.f45178e.onUpdateFinished();
            }
        }
    }
}
