package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.la, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3659la {
    public final C3684ma a(FeatureInfo featureInfo) {
        int i13;
        if (featureInfo.name == null && (i13 = featureInfo.reqGlEsVersion) != 0) {
            return new C3684ma("openGlFeature", i13, (featureInfo.flags & 1) != 0);
        }
        return b(featureInfo);
    }

    public abstract C3684ma b(FeatureInfo featureInfo);
}
