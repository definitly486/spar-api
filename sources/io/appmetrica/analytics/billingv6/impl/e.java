package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.QueryPurchasesParams;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.List;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f45184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f45185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f45186c;

    public e(f fVar, BillingResult billingResult, List list) {
        this.f45184a = fVar;
        this.f45185b = billingResult;
        this.f45186c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        f fVar = this.f45184a;
        BillingResult billingResult = this.f45185b;
        List list = this.f45186c;
        fVar.getClass();
        if (billingResult.getResponseCode() != 0 || list.isEmpty()) {
            fVar.f45193g.onUpdateFinished();
        } else {
            UtilsProvider utilsProvider = fVar.f45189c;
            iobyxmoadg iobyxmoadgVar = fVar.f45190d;
            List list2 = fVar.f45191e;
            d dVar = fVar.f45192f;
            k kVar = new k(utilsProvider, iobyxmoadgVar, list2, list, dVar, fVar.f45193g);
            dVar.f45183b.add(kVar);
            if (fVar.f45188b.isReady()) {
                fVar.f45188b.queryPurchasesAsync(QueryPurchasesParams.newBuilder().setProductType(fVar.f45187a).build(), kVar);
            } else {
                fVar.f45192f.a(kVar);
                fVar.f45193g.onUpdateFinished();
            }
        }
        f fVar2 = this.f45184a;
        fVar2.f45192f.a(fVar2);
    }
}
