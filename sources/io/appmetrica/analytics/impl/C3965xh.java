package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3965xh extends C3605j6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f48432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f48433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f48435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f48436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f48437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f48438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InterfaceC3890uh f48439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC3940wh f48440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f48441m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f48442n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f48443o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f48444p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f48445q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f48446r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f48447s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f48448t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f48449u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f48450v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f48451w;

    public C3965xh(C3828s5 c3828s5) {
        this.f48440l = c3828s5;
    }

    public final void a(int i13) {
        this.f48446r = i13;
    }

    public final void b(List<String> list) {
        this.f48445q = list;
    }

    public final String c() {
        return this.f48441m;
    }

    public final void d(boolean z13) {
        this.f48432d = z13;
    }

    public final void e(boolean z13) {
        this.f48436h = z13;
    }

    public final void f(boolean z13) {
        this.f48442n = z13;
    }

    public final String g() {
        return (String) WrapUtils.getOrDefault(this.f48444p, "");
    }

    public final boolean h() {
        return this.f48439k.a(this.f48438j);
    }

    public final int i() {
        return this.f48435g;
    }

    public final long j() {
        return this.f48450v;
    }

    public final int k() {
        return this.f48437i;
    }

    public final long l() {
        return this.f48447s;
    }

    public final long m() {
        return this.f48448t;
    }

    public final List<String> n() {
        return this.f48445q;
    }

    public final int o() {
        return this.f48434f;
    }

    public final boolean p() {
        return this.f48443o;
    }

    public final boolean q() {
        return this.f48433e;
    }

    public final boolean r() {
        return this.f48432d;
    }

    public final boolean s() {
        return this.f48442n;
    }

    public final boolean t() {
        return isIdentifiersValid() && !io.a((Collection) this.f48445q) && this.f48449u;
    }

    @Override // io.appmetrica.analytics.impl.C3605j6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f48432d + ", mFirstActivationAsUpdate=" + this.f48433e + ", mSessionTimeout=" + this.f48434f + ", mDispatchPeriod=" + this.f48435g + ", mLogEnabled=" + this.f48436h + ", mMaxReportsCount=" + this.f48437i + ", dataSendingEnabledFromArguments=" + this.f48438j + ", dataSendingStrategy=" + this.f48439k + ", mPreloadInfoSendingStrategy=" + this.f48440l + ", mApiKey='" + this.f48441m + "', mPermissionsCollectingEnabled=" + this.f48442n + ", mFeaturesCollectingEnabled=" + this.f48443o + ", mClidsFromStartupResponse='" + this.f48444p + "', mReportHosts=" + this.f48445q + ", mAttributionId=" + this.f48446r + ", mPermissionsCollectingIntervalSeconds=" + this.f48447s + ", mPermissionsForceSendIntervalSeconds=" + this.f48448t + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f48449u + ", mMaxReportsInDbCount=" + this.f48450v + ", mCertificates=" + this.f48451w + "} " + super.toString();
    }

    public final boolean u() {
        return ((C3828s5) this.f48440l).A();
    }

    public final void a(long j13) {
        this.f48450v = j13;
    }

    public final void b(long j13) {
        this.f48447s = j13;
    }

    public final void c(long j13) {
        this.f48448t = j13;
    }

    public final void d(int i13) {
        this.f48434f = i13;
    }

    public final List<String> e() {
        return this.f48451w;
    }

    public final boolean f() {
        return this.f48449u;
    }

    public final void a(List<String> list) {
        this.f48451w = list;
    }

    public final void b(boolean z13) {
        this.f48443o = z13;
    }

    public final void c(boolean z13) {
        this.f48433e = z13;
    }

    public final int d() {
        return this.f48446r;
    }

    public final void a(Boolean bool, InterfaceC3890uh interfaceC3890uh) {
        this.f48438j = bool;
        this.f48439k = interfaceC3890uh;
    }

    public final void b(int i13) {
        this.f48435g = i13;
    }

    public final void c(int i13) {
        this.f48437i = i13;
    }

    public final void a(boolean z13) {
        this.f48449u = z13;
    }
}
