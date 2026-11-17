package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3556h6 extends BaseRequestConfig.DataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3521fm f47372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SdkEnvironmentProvider f47373b;

    public C3556h6(C3521fm c3521fm, SdkEnvironmentProvider sdkEnvironmentProvider, PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c3521fm.e(), c3521fm.a(), c3521fm.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f47372a = c3521fm;
        this.f47373b = sdkEnvironmentProvider;
    }
}
