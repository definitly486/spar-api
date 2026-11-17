package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3602j3 implements BillingInfoStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProtobufStateStorage f47509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C3925w2 f47510b;

    public C3602j3(Context context) {
        this(Qm.a(C3925w2.class).a(context));
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final List<BillingInfo> getBillingInfo() {
        return this.f47510b.f48261a;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final boolean isFirstInappCheckOccurred() {
        return this.f47510b.f48262b;
    }

    @Override // io.appmetrica.analytics.billinginterface.internal.storage.BillingInfoStorage
    public final void saveInfo(List<BillingInfo> list, boolean z13) {
        for (BillingInfo billingInfo : list) {
        }
        C3925w2 c3925w2 = new C3925w2(list, z13);
        this.f47510b = c3925w2;
        this.f47509a.save(c3925w2);
    }

    public C3602j3(ProtobufStateStorage protobufStateStorage) {
        this.f47509a = protobufStateStorage;
        this.f47510b = (C3925w2) protobufStateStorage.read();
    }
}
