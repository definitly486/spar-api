package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements PurchasesResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UtilsProvider f45209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final iobyxmoadg f45210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f45211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f45212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f45213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n f45214f;

    public k(UtilsProvider utilsProvider, iobyxmoadg iobyxmoadgVar, List list, List list2, d dVar, n nVar) {
        this.f45209a = utilsProvider;
        this.f45210b = iobyxmoadgVar;
        this.f45211c = list;
        this.f45212d = list2;
        this.f45213e = dVar;
        this.f45214f = nVar;
    }

    public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
        this.f45209a.getWorkerExecutor().execute(new j(this, billingResult, list));
    }
}
