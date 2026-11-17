package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3438cg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f47021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseArray f47022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f47023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f47024d;

    static {
        HashMap map = new HashMap();
        Wk wk2 = Wk.FOREGROUND;
        map.put(wk2, 0);
        Wk wk3 = Wk.BACKGROUND;
        map.put(wk3, 1);
        f47021a = Collections.unmodifiableMap(map);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, wk2);
        sparseArray.put(1, wk3);
        f47022b = sparseArray;
        HashMap map2 = new HashMap();
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_INIT;
        map2.put(enumC3934wb, 1);
        EnumC3934wb enumC3934wb2 = EnumC3934wb.EVENT_TYPE_REGULAR;
        map2.put(enumC3934wb2, 4);
        EnumC3934wb enumC3934wb3 = EnumC3934wb.EVENT_TYPE_SEND_REFERRER;
        map2.put(enumC3934wb3, 5);
        EnumC3934wb enumC3934wb4 = EnumC3934wb.EVENT_TYPE_ALIVE;
        map2.put(enumC3934wb4, 7);
        EnumC3934wb enumC3934wb5 = EnumC3934wb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        map2.put(enumC3934wb5, 26);
        EnumC3934wb enumC3934wb6 = EnumC3934wb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC3934wb6, 26);
        EnumC3934wb enumC3934wb7 = EnumC3934wb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        map2.put(enumC3934wb7, 26);
        EnumC3934wb enumC3934wb8 = EnumC3934wb.EVENT_TYPE_ANR;
        map2.put(enumC3934wb8, 25);
        EnumC3934wb enumC3934wb9 = EnumC3934wb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC3934wb9, 26);
        EnumC3934wb enumC3934wb10 = EnumC3934wb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        map2.put(enumC3934wb10, 26);
        EnumC3934wb enumC3934wb11 = EnumC3934wb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        map2.put(enumC3934wb11, 27);
        EnumC3934wb enumC3934wb12 = EnumC3934wb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        map2.put(enumC3934wb12, 27);
        EnumC3934wb enumC3934wb13 = EnumC3934wb.EVENT_TYPE_FIRST_ACTIVATION;
        map2.put(enumC3934wb13, 13);
        EnumC3934wb enumC3934wb14 = EnumC3934wb.EVENT_TYPE_START;
        map2.put(enumC3934wb14, 2);
        EnumC3934wb enumC3934wb15 = EnumC3934wb.EVENT_TYPE_APP_OPEN;
        map2.put(enumC3934wb15, 16);
        EnumC3934wb enumC3934wb16 = EnumC3934wb.EVENT_TYPE_APP_UPDATE;
        map2.put(enumC3934wb16, 17);
        EnumC3934wb enumC3934wb17 = EnumC3934wb.EVENT_TYPE_PERMISSIONS;
        map2.put(enumC3934wb17, 18);
        EnumC3934wb enumC3934wb18 = EnumC3934wb.EVENT_TYPE_APP_FEATURES;
        map2.put(enumC3934wb18, 19);
        EnumC3934wb enumC3934wb19 = EnumC3934wb.EVENT_TYPE_SEND_USER_PROFILE;
        map2.put(enumC3934wb19, 20);
        EnumC3934wb enumC3934wb20 = EnumC3934wb.EVENT_TYPE_SEND_REVENUE_EVENT;
        map2.put(enumC3934wb20, 21);
        EnumC3934wb enumC3934wb21 = EnumC3934wb.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        map2.put(enumC3934wb21, 40);
        EnumC3934wb enumC3934wb22 = EnumC3934wb.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        map2.put(enumC3934wb22, 35);
        map2.put(EnumC3934wb.EVENT_TYPE_CLEANUP, 29);
        EnumC3934wb enumC3934wb23 = EnumC3934wb.EVENT_TYPE_WEBVIEW_SYNC;
        map2.put(enumC3934wb23, 38);
        EnumC3934wb enumC3934wb24 = EnumC3934wb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        map2.put(enumC3934wb24, 42);
        f47023c = Collections.unmodifiableMap(map2);
        HashMap map3 = new HashMap();
        P8 p13 = new P8();
        V8 v13 = new V8(new C3379a9());
        Q8 q13 = new Q8();
        C3976y3 c3976y3 = new C3976y3(new C3379a9());
        Mn mn2 = new Mn(new C3379a9());
        Yf yf2 = new Yf();
        C3733o9 c3733o9A = C3758p9.a();
        c3733o9A.f47819b = yf2;
        c3733o9A.f47820c = yf2;
        C3758p9 c3758p9 = new C3758p9(c3733o9A);
        C3733o9 c3733o9A2 = C3758p9.a();
        c3733o9A2.f47819b = v13;
        C3758p9 c3758p10 = new C3758p9(c3733o9A2);
        C3733o9 c3733o9A3 = C3758p9.a();
        c3733o9A3.f47819b = c3976y3;
        C3758p9 c3758p11 = new C3758p9(c3733o9A3);
        C3733o9 c3733o9A4 = C3758p9.a();
        c3733o9A4.f47819b = mn2;
        C3758p9 c3758p12 = new C3758p9(c3733o9A4);
        C3733o9 c3733o9A5 = C3758p9.a();
        c3733o9A5.f47818a = p13;
        C3758p9 c3758p13 = new C3758p9(c3733o9A5);
        C3733o9 c3733o9A6 = C3758p9.a();
        c3733o9A6.f47819b = new ro(new V8());
        C3758p9 c3758p14 = new C3758p9(c3733o9A6);
        map3.put(enumC3934wb2, c3758p10);
        C3733o9 c3733o9A7 = C3758p9.a();
        c3733o9A7.f47819b = new C3386ag();
        map3.put(enumC3934wb3, new C3758p9(c3733o9A7));
        C3733o9 c3733o9A8 = C3758p9.a();
        c3733o9A8.f47818a = p13;
        c3733o9A8.f47819b = q13;
        c3733o9A8.f47822e = new C3782q8();
        c3733o9A8.f47823f = new C3806r8();
        map3.put(enumC3934wb4, new C3758p9(c3733o9A8));
        map3.put(enumC3934wb9, c3758p9);
        map3.put(enumC3934wb10, c3758p9);
        map3.put(enumC3934wb11, c3758p11);
        map3.put(enumC3934wb12, c3758p11);
        map3.put(enumC3934wb5, c3758p11);
        map3.put(enumC3934wb6, c3758p11);
        map3.put(enumC3934wb7, c3758p11);
        map3.put(enumC3934wb8, c3758p11);
        C3733o9 c3733o9A9 = C3758p9.a();
        c3733o9A9.f47818a = new P8();
        c3733o9A9.f47819b = c3976y3;
        map3.put(enumC3934wb14, new C3758p9(c3733o9A9));
        EnumC3934wb enumC3934wb25 = EnumC3934wb.EVENT_TYPE_CUSTOM_EVENT;
        C3733o9 c3733o9A10 = C3758p9.a();
        c3733o9A10.f47821d = new C3412bg();
        map3.put(enumC3934wb25, new C3758p9(c3733o9A10));
        map3.put(enumC3934wb15, c3758p10);
        map3.put(enumC3934wb17, c3758p13);
        map3.put(enumC3934wb18, c3758p13);
        map3.put(enumC3934wb19, c3758p11);
        map3.put(enumC3934wb20, c3758p11);
        map3.put(enumC3934wb21, c3758p11);
        map3.put(enumC3934wb22, c3758p12);
        map3.put(enumC3934wb, c3758p14);
        map3.put(enumC3934wb16, c3758p14);
        map3.put(enumC3934wb13, c3758p10);
        map3.put(enumC3934wb23, c3758p10);
        map3.put(enumC3934wb24, c3758p11);
        f47024d = Collections.unmodifiableMap(map3);
    }

    public static D9 a(Long l13, Long l14, Boolean bool) {
        D9 d13 = new D9();
        if (l13 != null) {
            d13.f45636a = l13.longValue();
            d13.f45637b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l13.longValue() * 1000) / 1000;
        }
        if (l14 != null) {
            d13.f45638c = l14.longValue();
        }
        if (bool != null) {
            d13.f45639d = bool.booleanValue();
        }
        return d13;
    }

    public static void a(B9 b13) {
        C4007z9[] c4007z9Arr = b13.f45518c;
        if (c4007z9Arr != null) {
            for (C4007z9 c4007z9 : c4007z9Arr) {
            }
        }
    }
}
