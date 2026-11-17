package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3534g9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f47302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f47303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f47304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f47305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f47306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f47307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final E7 f47308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EnumC3934wb f47309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f47310i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f47311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f47312k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f47313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f47314m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f47315n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final EnumC3405b9 f47316o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EnumC3983ya f47317p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final H9 f47318q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f47319r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f47320s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f47321t;

    /* JADX WARN: Multi-variable type inference failed */
    public C3534g9(ContentValues contentValues) {
        A7 model = new B7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.f47302a = model.a().j();
        this.f47303b = model.a().p();
        this.f47304c = model.c();
        this.f47305d = model.b();
        this.f47306e = model.a().k();
        this.f47307f = model.d();
        this.f47308g = model.a().i();
        this.f47309h = model.e();
        this.f47310i = model.a().d();
        this.f47311j = model.a().f();
        this.f47312k = model.a().o();
        this.f47313l = model.a().c();
        this.f47314m = model.a().b();
        this.f47315n = model.a().m();
        EnumC3405b9 enumC3405b9E = model.a().e();
        this.f47316o = enumC3405b9E == null ? EnumC3405b9.a(null) : enumC3405b9E;
        EnumC3983ya enumC3983yaH = model.a().h();
        this.f47317p = enumC3983yaH == null ? EnumC3983ya.a(null) : enumC3983yaH;
        this.f47318q = model.a().n();
        this.f47319r = model.a().a();
        this.f47320s = model.a().l();
        this.f47321t = model.a().g();
    }
}
