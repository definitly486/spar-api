package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements LastKnownLocationExtractorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f48706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48707c;

    public v(String str, s sVar, String str2) {
        this.f48705a = str;
        this.f48706b = sVar;
        this.f48707c = str2;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u getExtractor(Context context, PermissionExtractor permissionExtractor, IHandlerExecutor iHandlerExecutor, LocationListener locationListener) {
        return new u(context, this.f48706b.a(permissionExtractor), locationListener, this.f48705a);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    public final String getIdentifier() {
        return this.f48707c;
    }
}
