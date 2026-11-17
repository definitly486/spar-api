package io.appmetrica.analytics.screenshot.impl;

import android.os.Bundle;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4029h implements BundleToServiceConfigConverter {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final B fromBundle(Bundle bundle) {
        bundle.setClassLoader(B.class.getClassLoader());
        B b13 = (B) bundle.getParcelable("config");
        return b13 == null ? new B(new g0()) : b13;
    }
}
