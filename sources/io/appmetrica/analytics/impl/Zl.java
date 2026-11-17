package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Zl extends BaseRequestConfig.BaseRequestArguments {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f46891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<String> f46893e;

    public Zl(C3452d4 c3452d4) {
        this(c3452d4.a().c(), c3452d4.a().d(), c3452d4.a().a(), c3452d4.a().h(), c3452d4.a().b());
    }

    public final boolean a(Zl zl2) {
        return false;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Zl mergeFrom(Zl zl2) {
        return new Zl((String) WrapUtils.getOrDefaultNullable(this.f46889a, zl2.f46889a), (String) WrapUtils.getOrDefaultNullable(this.f46890b, zl2.f46890b), (Map) WrapUtils.getOrDefaultNullable(this.f46891c, zl2.f46891c), this.f46892d || zl2.f46892d, zl2.f46892d ? zl2.f46893e : this.f46893e);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return false;
    }

    public final String toString() {
        return "Arguments{distributionReferrer='" + this.f46889a + "', installReferrerSource='" + this.f46890b + "', clientClids=" + this.f46891c + ", hasNewCustomHosts=" + this.f46892d + ", newCustomHosts=" + this.f46893e + '}';
    }

    public Zl(String str, String str2, Map<String, String> map, boolean z13, List<String> list) {
        this.f46889a = str;
        this.f46890b = str2;
        this.f46891c = map;
        this.f46892d = z13;
        this.f46893e = list;
    }

    public Zl() {
        this(null, null, null, false, null);
    }
}
