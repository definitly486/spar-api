package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3634ka extends AbstractC3659la {
    @Override // io.appmetrica.analytics.impl.AbstractC3659la
    public final C3684ma b(FeatureInfo featureInfo) {
        return new C3684ma(featureInfo.name, -1, (featureInfo.flags & 1) != 0);
    }
}
