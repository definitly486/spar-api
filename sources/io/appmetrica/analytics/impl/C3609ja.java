package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3609ja extends AbstractC3659la {
    @Override // io.appmetrica.analytics.impl.AbstractC3659la
    @TargetApi(24)
    public final C3684ma b(FeatureInfo featureInfo) {
        return new C3684ma(featureInfo.name, featureInfo.version, (featureInfo.flags & 1) != 0);
    }
}
