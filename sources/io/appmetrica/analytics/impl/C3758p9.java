package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3758p9 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map f47866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C3758p9 f47867i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Md f47868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qo f47869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final R8 f47870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O9 f47871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3786qc f47872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3613je f47873f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3585ia f47874g;

    static {
        HashMap map = new HashMap();
        map.put(EnumC3983ya.FIRST_OCCURRENCE, 1);
        map.put(EnumC3983ya.NON_FIRST_OCCURENCE, 0);
        map.put(EnumC3983ya.UNKNOWN, -1);
        f47866h = Collections.unmodifiableMap(map);
        f47867i = new C3758p9(new C3492ej(), new Ym(), new C3812re(), new C3467dj(), new Ea(), new Fa(), new Da());
    }

    public C3758p9(C3733o9 c3733o9) {
        this(c3733o9.f47818a, c3733o9.f47819b, c3733o9.f47820c, c3733o9.f47821d, c3733o9.f47822e, c3733o9.f47823f, c3733o9.f47824g);
    }

    public final C4007z9 a(C3534g9 c3534g9, C3965xh c3965xh) {
        C4007z9 c4007z9 = new C4007z9();
        C3982y9 c3982y9A = this.f47873f.a(c3534g9.f47313l, c3534g9.f47314m);
        C3882u9 c3882u9A = this.f47872e.a(c3534g9.f47308g);
        if (c3982y9A != null) {
            c4007z9.f48584g = c3982y9A;
        }
        if (c3882u9A != null) {
            c4007z9.f48583f = c3882u9A;
        }
        String strA = this.f47868a.a(c3534g9.f47302a);
        if (strA != null) {
            c4007z9.f48581d = strA;
        }
        c4007z9.f48582e = this.f47869b.a(c3534g9, c3965xh);
        String str = c3534g9.f47311j;
        if (str != null) {
            c4007z9.f48585h = str;
        }
        Integer numA = this.f47871d.a(c3534g9);
        if (numA != null) {
            c4007z9.f48580c = numA.intValue();
        }
        Long l13 = c3534g9.f47304c;
        if (l13 != null) {
            c4007z9.f48578a = l13.longValue();
        }
        Long l14 = c3534g9.f47305d;
        if (l14 != null) {
            c4007z9.f48591n = l14.longValue();
        }
        Long l15 = c3534g9.f47306e;
        if (l15 != null) {
            c4007z9.f48592o = l15.longValue();
        }
        Long l16 = c3534g9.f47307f;
        if (l16 != null) {
            c4007z9.f48579b = l16.longValue();
        }
        Integer num = c3534g9.f47312k;
        if (num != null) {
            c4007z9.f48586i = num.intValue();
        }
        c4007z9.f48587j = this.f47870c.a(c3534g9.f47316o);
        E7 e13 = c3534g9.f47308g;
        c4007z9.f48588k = e13 != null ? new D6().a(e13.f45689a) : -1;
        String str2 = c3534g9.f47315n;
        if (str2 != null) {
            c4007z9.f48589l = str2.getBytes();
        }
        EnumC3983ya enumC3983ya = c3534g9.f47317p;
        Integer num2 = enumC3983ya != null ? (Integer) f47866h.get(enumC3983ya) : null;
        if (num2 != null) {
            c4007z9.f48590m = num2.intValue();
        }
        H9 h13 = c3534g9.f47318q;
        if (h13 != null) {
            int iOrdinal = h13.ordinal();
            if (iOrdinal == 0) {
                c4007z9.f48593p = 0;
            } else if (iOrdinal == 1) {
                c4007z9.f48593p = 1;
            } else if (iOrdinal == 2) {
                c4007z9.f48593p = 2;
            }
        }
        Boolean bool = c3534g9.f47319r;
        if (bool != null) {
            c4007z9.f48594q = bool.booleanValue();
        }
        Integer num3 = c3534g9.f47320s;
        if (num3 != null) {
            c4007z9.f48595r = num3.intValue();
        }
        c4007z9.f48596s = ((Da) this.f47874g).a(c3534g9.f47321t);
        return c4007z9;
    }

    public C3758p9(Md md2, qo qoVar, R8 r13, O9 o13, InterfaceC3786qc interfaceC3786qc, InterfaceC3613je interfaceC3613je, InterfaceC3585ia interfaceC3585ia) {
        this.f47868a = md2;
        this.f47869b = qoVar;
        this.f47870c = r13;
        this.f47871d = o13;
        this.f47872e = interfaceC3786qc;
        this.f47873f = interfaceC3613je;
        this.f47874g = interfaceC3585ia;
    }

    public static C3733o9 a() {
        return new C3733o9(f47867i);
    }
}
