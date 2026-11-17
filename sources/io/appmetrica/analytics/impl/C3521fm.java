package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3521fm {
    public final Dm A;
    public final Map B;
    public final W9 C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f47229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3621jm f47230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f47232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f47233f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f47234g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f47235h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f47236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f47237j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f47238k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f47239l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f47240m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final G4 f47241n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f47242o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f47243p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f47244q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f47245r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Le f47246s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RetryPolicyConfig f47247t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f47248u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f47249v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f47250w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final BillingConfig f47251x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C4001z3 f47252y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C3800r2 f47253z;

    public C3521fm(String str, String str2, C3621jm c3621jm) {
        this.f47228a = str;
        this.f47229b = str2;
        this.f47230c = c3621jm;
        this.f47231d = c3621jm.f47544a;
        this.f47232e = c3621jm.f47545b;
        this.f47233f = c3621jm.f47549f;
        this.f47234g = c3621jm.f47550g;
        this.f47235h = c3621jm.f47552i;
        this.f47236i = c3621jm.f47546c;
        this.f47237j = c3621jm.f47547d;
        this.f47238k = c3621jm.f47553j;
        this.f47239l = c3621jm.f47554k;
        this.f47240m = c3621jm.f47555l;
        this.f47241n = c3621jm.f47556m;
        this.f47242o = c3621jm.f47557n;
        this.f47243p = c3621jm.f47558o;
        this.f47244q = c3621jm.f47559p;
        this.f47245r = c3621jm.f47560q;
        this.f47246s = c3621jm.f47562s;
        this.f47247t = c3621jm.f47563t;
        this.f47248u = c3621jm.f47564u;
        this.f47249v = c3621jm.f47565v;
        this.f47250w = c3621jm.f47566w;
        this.f47251x = c3621jm.f47567x;
        this.f47252y = c3621jm.f47568y;
        this.f47253z = c3621jm.f47569z;
        this.A = c3621jm.A;
        this.B = c3621jm.B;
        this.C = c3621jm.C;
    }

    public final String a() {
        return this.f47228a;
    }

    public final String b() {
        return this.f47229b;
    }

    public final long c() {
        return this.f47249v;
    }

    public final long d() {
        return this.f47248u;
    }

    public final String e() {
        return this.f47231d;
    }

    public final String toString() {
        return "StartupState(deviceId=" + this.f47228a + ", deviceIdHash=" + this.f47229b + ", startupStateModel=" + this.f47230c + ')';
    }
}
