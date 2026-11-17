package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3418bm extends C3605j6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f46986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f46987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f46988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f46989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map f46990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public N3 f46991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f46992j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f46993k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f46994l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f46995m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f46996n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C3989yg f46997o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C3404b8 f46998p;

    public C3418bm() {
        this(Ia.j().t(), new C3404b8());
    }

    public final long a(long j13) {
        if (this.f46996n == 0) {
            this.f46996n = j13;
        }
        return this.f46996n;
    }

    public final N3 c() {
        return this.f46991i;
    }

    public final Map<String, String> d() {
        return this.f46990h;
    }

    public final String e() {
        return this.f46995m;
    }

    public final String f() {
        return this.f46988f;
    }

    public final long g() {
        return this.f46996n;
    }

    public final String h() {
        return this.f46989g;
    }

    public final List<String> i() {
        return this.f46992j;
    }

    public final C3989yg j() {
        return this.f46997o;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0055, please report this as an issue */
    public final List<String> k() {
        String[] strArr;
        ArrayList arrayList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!io.a((Collection) this.f46986d)) {
            linkedHashSet.addAll(this.f46986d);
        }
        if (!io.a((Collection) this.f46987e)) {
            linkedHashSet.addAll(this.f46987e);
        }
        String[] strArr2 = (String[]) this.f46998p.f46954a.a();
        if (strArr2 != null) {
            arrayList = new ArrayList();
            for (String str : strArr2) {
                if (str == null || mj.kcexrzcfyt.zfvoamnweg(str)) {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList == null) {
                strArr = BuildConfig.DEFAULT_HOSTS;
                arrayList = new ArrayList();
                for (String str2 : strArr) {
                    if (str2 != null || mj.kcexrzcfyt.zfvoamnweg(str2)) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                }
            }
        } else {
            strArr = BuildConfig.DEFAULT_HOSTS;
            arrayList = new ArrayList();
            while (i < r5) {
                if (str2 != null) {
                    str2 = null;
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
        }
        linkedHashSet.addAll(arrayList);
        return new ArrayList(linkedHashSet);
    }

    public final List<String> l() {
        return this.f46987e;
    }

    public final List<String> m() {
        return this.f46986d;
    }

    public final boolean n() {
        return this.f46993k;
    }

    public final boolean o() {
        return this.f46994l;
    }

    @Override // io.appmetrica.analytics.impl.C3605j6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f46986d + ", mStartupHostsFromClient=" + this.f46987e + ", mDistributionReferrer='" + this.f46988f + "', mInstallReferrerSource='" + this.f46989g + "', mClidsFromClient=" + this.f46990h + ", mNewCustomHosts=" + this.f46992j + ", mHasNewCustomHosts=" + this.f46993k + ", mSuccessfulStartup=" + this.f46994l + ", mCountryInit='" + this.f46995m + "', mFirstStartupTime=" + this.f46996n + "} " + super.toString();
    }

    public C3418bm(C3989yg c3989yg, C3404b8 c3404b8) {
        this.f46991i = new N3(null, EnumC3657l8.f47648c);
        this.f46996n = 0L;
        this.f46997o = c3989yg;
        this.f46998p = c3404b8;
    }

    public final void a(List<String> list) {
        this.f46992j = list;
    }

    public final void a(boolean z13) {
        this.f46993k = z13;
    }

    public final void a(String str) {
        this.f46995m = str;
    }
}
