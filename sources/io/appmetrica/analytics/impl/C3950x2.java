package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3950x2 implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3528g3 f48369a;

    public C3950x2() {
        this(new C3528g3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4000z2 fromModel(C3925w2 c3925w2) {
        C4000z2 c4000z2 = new C4000z2();
        c4000z2.f48546a = new C3975y2[c3925w2.f48261a.size()];
        int i13 = 0;
        for (BillingInfo billingInfo : c3925w2.f48261a) {
            C3975y2[] c3975y2Arr = c4000z2.f48546a;
            this.f48369a.getClass();
            c3975y2Arr[i13] = C3528g3.a(billingInfo);
            i13++;
        }
        c4000z2.f48547b = c3925w2.f48262b;
        return c4000z2;
    }

    public C3950x2(C3528g3 c3528g3) {
        this.f48369a = c3528g3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3925w2 toModel(C4000z2 c4000z2) {
        ProductType productType;
        ArrayList arrayList = new ArrayList(c4000z2.f48546a.length);
        for (C3975y2 c3975y2 : c4000z2.f48546a) {
            this.f48369a.getClass();
            int i13 = c3975y2.f48493a;
            if (i13 == 2) {
                productType = ProductType.INAPP;
            } else if (i13 != 3) {
                productType = ProductType.UNKNOWN;
            } else {
                productType = ProductType.SUBS;
            }
            arrayList.add(new BillingInfo(productType, c3975y2.f48494b, c3975y2.f48495c, c3975y2.f48496d, c3975y2.f48497e));
        }
        return new C3925w2(arrayList, c4000z2.f48547b);
    }
}
