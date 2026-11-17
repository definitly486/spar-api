package io.appmetrica.analytics.billingv6.impl;

import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.QueryProductDetailsParams;
import hg.jyumaefscl;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.billinginterface.internal.library.UtilsProvider;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f45194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BillingResult f45195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f45196c;

    public g(i iVar, BillingResult billingResult, List list) {
        this.f45194a = iVar;
        this.f45195b = billingResult;
        this.f45196c = list;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        i iVar = this.f45194a;
        BillingResult billingResult = this.f45195b;
        List<PurchaseHistoryRecord> list = this.f45196c;
        iVar.getClass();
        if (billingResult.getResponseCode() != 0 || list == null) {
            iVar.f45205f.onUpdateFinished();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                for (String str : purchaseHistoryRecord.getProducts()) {
                    String str2 = iVar.f45203d;
                    BillingInfo billingInfo = new BillingInfo(zdlpuopuiu.eablkybsjg(str2, "inapp") ? ProductType.INAPP : zdlpuopuiu.eablkybsjg(str2, "subs") ? ProductType.SUBS : ProductType.UNKNOWN, str, purchaseHistoryRecord.getPurchaseToken(), purchaseHistoryRecord.getPurchaseTime(), 0L);
                    linkedHashMap.put(billingInfo.productId, billingInfo);
                }
            }
            Map<String, BillingInfo> billingInfoToUpdate = iVar.f45202c.getUpdatePolicy().getBillingInfoToUpdate(iVar.f45200a, linkedHashMap, iVar.f45202c.getBillingInfoManager());
            if (billingInfoToUpdate.isEmpty()) {
                m.a(linkedHashMap, billingInfoToUpdate, iVar.f45203d, iVar.f45202c.getBillingInfoManager());
                iVar.f45205f.onUpdateFinished();
            } else {
                List listM = jyumaefscl.m(billingInfoToUpdate.keySet());
                n nVar = iVar.f45205f;
                h hVar = new h(linkedHashMap, billingInfoToUpdate, iVar);
                String str3 = iVar.f45203d;
                BillingClient billingClient = iVar.f45201b;
                UtilsProvider utilsProvider = iVar.f45202c;
                d dVar = iVar.f45204e;
                f fVar = new f(str3, billingClient, utilsProvider, hVar, list, dVar, nVar);
                dVar.f45183b.add(fVar);
                if (iVar.f45201b.isReady()) {
                    BillingClient billingClient2 = iVar.f45201b;
                    QueryProductDetailsParams.Builder builderNewBuilder = QueryProductDetailsParams.newBuilder();
                    ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listM, 10));
                    Iterator it = listM.iterator();
                    while (it.hasNext()) {
                        arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductId((String) it.next()).setProductType(iVar.f45203d).build());
                    }
                    billingClient2.queryProductDetailsAsync(builderNewBuilder.setProductList(arrayList).build(), fVar);
                } else {
                    iVar.f45204e.a(fVar);
                    nVar.onUpdateFinished();
                }
            }
        }
        i iVar2 = this.f45194a;
        iVar2.f45204e.a(iVar2);
    }
}
