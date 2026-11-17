package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3379a9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yc f46911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Yc f46912b;

    public C3379a9() {
        this(new C3757p8(), new C3535ga(), new C3395b());
    }

    public C3379a9(C3757p8 c3757p8, C3535ga c3535ga, C3395b c3395b) {
        Yc yc2 = new Yc(c3757p8);
        this.f46911a = yc2;
        yc2.a(EnumC3405b9.NONE, c3757p8);
        yc2.a(EnumC3405b9.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER, c3535ga);
        yc2.a(EnumC3405b9.AES_VALUE_ENCRYPTION, c3395b);
        this.f46912b = new Yc(c3757p8);
    }
}
