package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetailsResponseListener;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import java.util.List;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements ProductDetailsResponseListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BillingClient f45188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilsProvider f45189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final iobyxmoadg f45190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f45191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f45192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f45193g;

    public f(String str, BillingClient billingClient, UtilsProvider utilsProvider, h hVar, List list, d dVar, n nVar) {
        this.f45187a = str;
        this.f45188b = billingClient;
        this.f45189c = utilsProvider;
        this.f45190d = hVar;
        this.f45191e = list;
        this.f45192f = dVar;
        this.f45193g = nVar;
    }

    public final void onProductDetailsResponse(BillingResult billingResult, List list) {
        this.f45189c.getWorkerExecutor().execute(new e(this, billingResult, list));
    }
}
