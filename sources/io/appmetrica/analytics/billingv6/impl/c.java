package io.appmetrica.analytics.billingv6.impl;

import hg.jyumaefscl;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements BillingInfoManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillingInfoStorage f45179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f45180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f45181c;

    public c(BillingInfoStorage billingInfoStorage) {
        this.f45179a = billingInfoStorage;
        this.f45180b = billingInfoStorage.isFirstInappCheckOccurred();
        List<BillingInfo> billingInfo = billingInfoStorage.getBillingInfo();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : billingInfo) {
            linkedHashMap.put(((BillingInfo) obj).productId, obj);
        }
        this.f45181c = linkedHashMap;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final BillingInfo get(String str) {
        return (BillingInfo) this.f45181c.get(str);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final boolean isFirstInappCheckOccurred() {
        return this.f45180b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void markFirstInappCheckOccurred() {
        if (this.f45180b) {
            return;
        }
        this.f45180b = true;
        this.f45179a.saveInfo(jyumaefscl.m(this.f45181c.values()), this.f45180b);
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoManager
    public final void update(Map<String, ? extends BillingInfo> map) {
        for (BillingInfo billingInfo : map.values()) {
            this.f45181c.put(billingInfo.productId, billingInfo);
        }
        this.f45179a.saveInfo(jyumaefscl.m(this.f45181c.values()), this.f45180b);
    }
}
