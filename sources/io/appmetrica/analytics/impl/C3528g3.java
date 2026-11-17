package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3528g3 implements ProtobufConverter {
    public static C3975y2 a(BillingInfo billingInfo) {
        C3975y2 c3975y2 = new C3975y2();
        int i13 = AbstractC3502f3.f47204a[billingInfo.type.ordinal()];
        int i14 = 2;
        if (i13 != 1) {
            i14 = i13 != 2 ? 1 : 3;
        }
        c3975y2.f48493a = i14;
        c3975y2.f48494b = billingInfo.productId;
        c3975y2.f48495c = billingInfo.purchaseToken;
        c3975y2.f48496d = billingInfo.purchaseTime;
        c3975y2.f48497e = billingInfo.sendTime;
        return c3975y2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((BillingInfo) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        ProductType productType;
        C3975y2 c3975y2 = (C3975y2) obj;
        int i13 = c3975y2.f48493a;
        if (i13 != 2) {
            productType = i13 != 3 ? ProductType.UNKNOWN : ProductType.SUBS;
        } else {
            productType = ProductType.INAPP;
        }
        return new BillingInfo(productType, c3975y2.f48494b, c3975y2.f48495c, c3975y2.f48496d, c3975y2.f48497e);
    }
}
