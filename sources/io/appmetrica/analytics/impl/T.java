package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class T implements Va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f46526b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FutureTask f46533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final I f46534j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f46537m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46527c = "advertising identifiers collecting is forbidden by client configuration";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46528d = "advertising identifiers collecting is forbidden by startup";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f46529e = "advertising identifiers collecting is forbidden by unknown reason";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M f46530f = new M(new Mg("google"));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final M f46531g = new M(new Mg("huawei"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M f46532h = new M(new Mg("yandex"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile AdvertisingIdsHolder f46535k = new AdvertisingIdsHolder();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public F f46536l = new F(4, 4, 4);

    public T(Context context, ICommonExecutor iCommonExecutor, C3521fm c3521fm) {
        this.f46525a = context;
        this.f46526b = iCommonExecutor;
        this.f46534j = new I(c3521fm);
    }

    public static final Void e(T t13) {
        t13.f46535k = new AdvertisingIdsHolder(t13.a(t13.f46536l.f45769a, new P(t13)), t13.a(t13.f46536l.f45770b, new Q(t13)), t13.a(t13.f46536l.f45771c, new S(t13, new C3688me())));
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.SimpleAdvertisingIdGetter
    public final synchronized AdvertisingIdsHolder getIdentifiers(Context context) {
        return getIdentifiers();
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final synchronized void init() {
        if (this.f46533i == null) {
            this.f46536l = this.f46534j.a();
            FutureTask futureTask = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.ojitshcjhn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return T.e(this.f47846iobyxmoadg);
                }
            });
            this.f46533i = futureTask;
            this.f46526b.execute(futureTask);
        }
    }

    @Override // io.appmetrica.analytics.impl.Va, io.appmetrica.analytics.impl.InterfaceC3646km
    public final synchronized void a(C3521fm c3521fm) {
        this.f46534j.a(c3521fm);
        a((Ti) new C3688me(), false);
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final synchronized void b(boolean z13) {
        this.f46537m = true;
        this.f46534j.f45954b.update(z13);
        a((Ti) new C3688me(), false);
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final synchronized void c(boolean z13) {
        if (!this.f46537m) {
            b(z13);
        }
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final synchronized AdvertisingIdsHolder getIdentifiers() {
        FutureTask futureTask = this.f46533i;
        if (futureTask == null) {
            kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("refresh");
            futureTask = null;
        }
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f46535k;
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final synchronized AdvertisingIdsHolder a() {
        return a(new C3688me());
    }

    @Override // io.appmetrica.analytics.impl.Va
    public final synchronized AdvertisingIdsHolder a(Ti ti2) {
        try {
            a(ti2, true).get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f46535k;
    }

    public final FutureTask a(final Ti ti2, final boolean z13) {
        final F fA = this.f46534j.a();
        FutureTask futureTask = new FutureTask(new Callable() { // from class: io.appmetrica.analytics.impl.rgvfuqvkyq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return T.a(z13, fA, this, ti2);
            }
        });
        this.f46533i = futureTask;
        this.f46526b.execute(futureTask);
        FutureTask futureTask2 = this.f46533i;
        if (futureTask2 != null) {
            return futureTask2;
        }
        kotlin.jvm.internal.zdlpuopuiu.pmvmpeiblj("refresh");
        return null;
    }

    public static final Void a(boolean z13, F f13, T t13, Ti ti2) {
        if (!z13 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(f13, t13.f46536l)) {
            return null;
        }
        AdvertisingIdsHolder advertisingIdsHolder = t13.f46535k;
        AdTrackingInfoResult adTrackingInfoResultA = t13.a(f13.f45769a, new P(t13));
        AdTrackingInfoResult google = advertisingIdsHolder.getGoogle();
        IdentifierStatus identifierStatus = adTrackingInfoResultA.mStatus;
        IdentifierStatus identifierStatus2 = IdentifierStatus.UNKNOWN;
        if (identifierStatus == identifierStatus2) {
            adTrackingInfoResultA = new AdTrackingInfoResult(google.mAdTrackingInfo, identifierStatus, adTrackingInfoResultA.mErrorExplanation);
        }
        AdTrackingInfoResult adTrackingInfoResultA2 = t13.a(f13.f45770b, new Q(t13));
        AdTrackingInfoResult huawei = advertisingIdsHolder.getHuawei();
        IdentifierStatus identifierStatus3 = adTrackingInfoResultA2.mStatus;
        if (identifierStatus3 == identifierStatus2) {
            adTrackingInfoResultA2 = new AdTrackingInfoResult(huawei.mAdTrackingInfo, identifierStatus3, adTrackingInfoResultA2.mErrorExplanation);
        }
        AdTrackingInfoResult adTrackingInfoResultA3 = t13.a(f13.f45771c, new S(t13, ti2));
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        IdentifierStatus identifierStatus4 = adTrackingInfoResultA3.mStatus;
        if (identifierStatus4 == identifierStatus2) {
            adTrackingInfoResultA3 = new AdTrackingInfoResult(yandex.mAdTrackingInfo, identifierStatus4, adTrackingInfoResultA3.mErrorExplanation);
        }
        t13.f46535k = new AdvertisingIdsHolder(adTrackingInfoResultA, adTrackingInfoResultA2, adTrackingInfoResultA3);
        return null;
    }

    public final AdTrackingInfoResult a(int i13, tg.iobyxmoadg iobyxmoadgVar) {
        if (i13 == 0) {
            throw null;
        }
        int i14 = i13 - 1;
        if (i14 == 0) {
            return (AdTrackingInfoResult) iobyxmoadgVar.invoke();
        }
        if (i14 == 1) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FORBIDDEN_BY_CLIENT_CONFIG, this.f46527c);
        }
        if (i14 == 2) {
            return new AdTrackingInfoResult(null, IdentifierStatus.FEATURE_DISABLED, this.f46528d);
        }
        if (i14 == 3) {
            return new AdTrackingInfoResult(null, IdentifierStatus.UNKNOWN, this.f46529e);
        }
        throw new NoWhenBranchMatchedException();
    }
}
