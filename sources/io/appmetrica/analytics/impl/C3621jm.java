package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3621jm {
    public final Dm A;
    public final Map B;
    public final W9 C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f47545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f47548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f47549f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f47550g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f47551h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f47552i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f47553j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f47554k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f47555l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final G4 f47556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f47557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f47558o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f47559p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f47560q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Hm f47561r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Le f47562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f47563t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f47564u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f47565v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f47566w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final BillingConfig f47567x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C4001z3 f47568y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C3800r2 f47569z;

    public C3621jm(C3596im c3596im) {
        this.f47544a = c3596im.f47462a;
        List list = c3596im.f47463b;
        this.f47545b = list == null ? null : CollectionUtils.unmodifiableListCopy(list);
        this.f47546c = c3596im.f47464c;
        this.f47547d = c3596im.f47465d;
        this.f47548e = c3596im.f47466e;
        List list2 = c3596im.f47467f;
        this.f47549f = list2 == null ? null : CollectionUtils.unmodifiableListCopy(list2);
        List list3 = c3596im.f47468g;
        this.f47550g = list3 == null ? null : CollectionUtils.unmodifiableListCopy(list3);
        List list4 = c3596im.f47469h;
        this.f47551h = list4 == null ? null : CollectionUtils.unmodifiableListCopy(list4);
        Map map = c3596im.f47470i;
        this.f47552i = map != null ? CollectionUtils.unmodifiableMapCopy(map) : null;
        this.f47553j = c3596im.f47471j;
        this.f47554k = c3596im.f47472k;
        this.f47556m = c3596im.f47474m;
        this.f47562s = c3596im.f47475n;
        this.f47557n = c3596im.f47476o;
        this.f47558o = c3596im.f47477p;
        this.f47555l = c3596im.f47473l;
        this.f47559p = c3596im.f47478q;
        this.f47560q = c3596im.f47479r;
        this.f47561r = c3596im.f47480s;
        this.f47564u = c3596im.f47481t;
        this.f47565v = c3596im.f47482u;
        this.f47566w = c3596im.f47483v;
        RetryPolicyConfig retryPolicyConfig = c3596im.f47484w;
        if (retryPolicyConfig == null) {
            C3970xm c3970xm = new C3970xm();
            this.f47563t = new RetryPolicyConfig(c3970xm.f48481w, c3970xm.f48482x);
        } else {
            this.f47563t = retryPolicyConfig;
        }
        this.f47567x = c3596im.f47485x;
        this.f47568y = c3596im.f47486y;
        this.f47569z = c3596im.f47487z;
        this.A = c3596im.A == null ? new Dm(AbstractC3430c8.f47015b.f48251a) : c3596im.A;
        this.B = c3596im.B == null ? Collections.emptyMap() : c3596im.B;
        this.C = c3596im.C;
    }

    public final C3596im a(G4 g13) {
        C3596im c3596im = new C3596im(g13);
        c3596im.f47462a = this.f47544a;
        c3596im.f47467f = this.f47549f;
        c3596im.f47468g = this.f47550g;
        c3596im.f47471j = this.f47553j;
        c3596im.f47463b = this.f47545b;
        c3596im.f47464c = this.f47546c;
        c3596im.f47465d = this.f47547d;
        c3596im.f47466e = this.f47548e;
        c3596im.f47469h = this.f47551h;
        c3596im.f47470i = this.f47552i;
        c3596im.f47472k = this.f47554k;
        c3596im.f47473l = this.f47555l;
        c3596im.f47478q = this.f47559p;
        c3596im.f47476o = this.f47557n;
        c3596im.f47477p = this.f47558o;
        c3596im.f47479r = this.f47560q;
        c3596im.f47475n = this.f47562s;
        c3596im.f47481t = this.f47564u;
        c3596im.f47482u = this.f47565v;
        c3596im.f47480s = this.f47561r;
        c3596im.f47483v = this.f47566w;
        c3596im.f47484w = this.f47563t;
        c3596im.f47486y = this.f47568y;
        c3596im.f47485x = this.f47567x;
        c3596im.f47487z = this.f47569z;
        c3596im.A = this.A;
        c3596im.B = this.B;
        c3596im.C = this.C;
        return c3596im;
    }

    public final String toString() {
        return "StartupStateModel{uuid='" + this.f47544a + "', reportUrls=" + this.f47545b + ", getAdUrl='" + this.f47546c + "', reportAdUrl='" + this.f47547d + "', certificateUrl='" + this.f47548e + "', hostUrlsFromStartup=" + this.f47549f + ", hostUrlsFromClient=" + this.f47550g + ", diagnosticUrls=" + this.f47551h + ", customSdkHosts=" + this.f47552i + ", encodedClidsFromResponse='" + this.f47553j + "', lastClientClidsForStartupRequest='" + this.f47554k + "', lastChosenForRequestClids='" + this.f47555l + "', collectingFlags=" + this.f47556m + ", obtainTime=" + this.f47557n + ", hadFirstStartup=" + this.f47558o + ", startupDidNotOverrideClids=" + this.f47559p + ", countryInit='" + this.f47560q + "', statSending=" + this.f47561r + ", permissionsCollectingConfig=" + this.f47562s + ", retryPolicyConfig=" + this.f47563t + ", obtainServerTime=" + this.f47564u + ", firstStartupServerTime=" + this.f47565v + ", outdated=" + this.f47566w + ", autoInappCollectingConfig=" + this.f47567x + ", cacheControl=" + this.f47568y + ", attributionConfig=" + this.f47569z + ", startupUpdateConfig=" + this.A + ", modulesRemoteConfigs=" + this.B + ", externalAttributionConfig=" + this.C + '}';
    }
}
