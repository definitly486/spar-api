package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3527g2 implements AppSetIdProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IAppSetIdRetriever f47273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile AppSetId f47274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CountDownLatch f47275d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47276e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3501f2 f47277f;

    public C3527g2(Context context, IAppSetIdRetriever iAppSetIdRetriever) {
        this.f47272a = context;
        this.f47273b = iAppSetIdRetriever;
        this.f47275d = new CountDownLatch(1);
        this.f47276e = 20L;
        this.f47277f = new C3501f2(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f47274c == null) {
            try {
                this.f47275d = new CountDownLatch(1);
                this.f47273b.retrieveAppSetId(this.f47272a, this.f47277f);
                this.f47275d.await(this.f47276e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f47274c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f47274c = appSetId;
        }
        return appSetId;
    }

    public C3527g2(Context context) {
        this(context, AbstractC3552h2.a());
    }
}
