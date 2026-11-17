package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.s9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3832s9 extends Qf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ei f48053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f48054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final L4 f48055c;

    public C3832s9(C3828s5 c3828s5) {
        Ei ei2 = new Ei(c3828s5);
        this.f48053a = ei2;
        this.f48055c = new L4(ei2);
        this.f48054b = a();
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        map.put(EnumC3934wb.EVENT_TYPE_ACTIVATION, new C3549h(this.f48053a));
        map.put(EnumC3934wb.EVENT_TYPE_START, new El(this.f48053a));
        map.put(EnumC3934wb.EVENT_TYPE_REGULAR, new Tg(this.f48053a));
        Db db3 = new Db(this.f48053a);
        map.put(EnumC3934wb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, db3);
        map.put(EnumC3934wb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, db3);
        map.put(EnumC3934wb.EVENT_TYPE_SEND_REFERRER, db3);
        map.put(EnumC3934wb.EVENT_TYPE_CUSTOM_EVENT, db3);
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_SET_SESSION_EXTRA;
        Ei ei2 = this.f48053a;
        map.put(enumC3934wb, new C4019zl(ei2, ei2.f45753t));
        map.put(EnumC3934wb.EVENT_TYPE_APP_OPEN, new C3387ah(this.f48053a));
        map.put(EnumC3934wb.EVENT_TYPE_PURGE_BUFFER, new C3489eg(this.f48053a));
        map.put(EnumC3934wb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new N6(this.f48053a));
        map.put(EnumC3934wb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new Jf(this.f48053a));
        map.put(EnumC3934wb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Sn(this.f48053a));
        map.put(EnumC3934wb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new Kf(this.f48053a));
        map.put(EnumC3934wb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new Rn(this.f48053a));
        map.put(EnumC3934wb.EVENT_TYPE_ANR, db3);
        EnumC3934wb enumC3934wb2 = EnumC3934wb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        Ei ei3 = this.f48053a;
        map.put(enumC3934wb2, new C4019zl(ei3, ei3.f45738e));
        EnumC3934wb enumC3934wb3 = EnumC3934wb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        Ei ei4 = this.f48053a;
        map.put(enumC3934wb3, new C4019zl(ei4, ei4.f45739f));
        map.put(EnumC3934wb.EVENT_TYPE_SEND_USER_PROFILE, db3);
        EnumC3934wb enumC3934wb4 = EnumC3934wb.EVENT_TYPE_SET_USER_PROFILE_ID;
        Ei ei5 = this.f48053a;
        map.put(enumC3934wb4, new C4019zl(ei5, ei5.f45744k));
        map.put(EnumC3934wb.EVENT_TYPE_SEND_REVENUE_EVENT, db3);
        map.put(EnumC3934wb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, db3);
        map.put(EnumC3934wb.EVENT_TYPE_CLEANUP, db3);
        map.put(EnumC3934wb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, db3);
        map.put(EnumC3934wb.EVENT_TYPE_WEBVIEW_SYNC, db3);
        map.put(EnumC3934wb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new Z9(this.f48053a));
        return map;
    }

    public final Ei b() {
        return this.f48053a;
    }

    public final void a(EnumC3934wb enumC3934wb, Ja ja3) {
        this.f48054b.put(enumC3934wb, ja3);
    }

    @Override // io.appmetrica.analytics.impl.Qf
    public final AbstractC3807r9 a(int i13) {
        LinkedList linkedList = new LinkedList();
        EnumC3934wb enumC3934wbA = EnumC3934wb.a(i13);
        L4 l13 = this.f48055c;
        if (l13 != null) {
            l13.a(enumC3934wbA, linkedList);
        }
        Ja ja3 = (Ja) this.f48054b.get(enumC3934wbA);
        if (ja3 != null) {
            ja3.a(linkedList);
        }
        return new C3783q9(linkedList);
    }

    public final Ja a(EnumC3934wb enumC3934wb) {
        return (Ja) this.f48054b.get(enumC3934wb);
    }
}
