package io.appmetrica.analytics.impl;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3683m9 f45627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S8 f45628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3525g0 f45629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C3431c9 f45630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final G7 f45631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C3655l6 f45632h;

    public D7(Context context, Uk uk2, int i13, C3683m9 c3683m9, S8 s13, C3525g0 c3525g0, C3431c9 c3431c9, G7 g13) {
        this.f45625a = context;
        this.f45626b = i13;
        this.f45627c = c3683m9;
        this.f45628d = s13;
        this.f45629e = c3525g0;
        this.f45630f = c3431c9;
        this.f45631g = g13;
        this.f45632h = s13.f46502a;
    }

    public static String b() {
        kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar = new kotlin.jvm.internal.hkdspvbjdz();
        C3672ln c3672lnA = Ia.F.A();
        C7 c13 = new C7(hkdspvbjdzVar);
        synchronized (c3672lnA) {
            c3672lnA.f47671b.a(c13);
        }
        return (String) hkdspvbjdzVar.f60015zdlpuopuiu;
    }

    public final C4005z7 a() throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        Eo eo2;
        Integer numValueOf = Integer.valueOf(this.f45632h.f47635e);
        String name = this.f45632h.getName();
        String value = this.f45632h.getValue();
        C3683m9 c3683m9 = this.f45627c;
        int i13 = this.f45626b;
        uo uoVar = c3683m9.f47696a.f47750a;
        synchronized (uoVar) {
            jSONObjectOptJSONObject = uoVar.f48216a.a().optJSONObject("numbers_of_type");
        }
        long jOptLong = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optLong(String.valueOf(i13)) : 0L;
        c3683m9.f47696a.a(i13, 1 + jOptLong);
        Long lValueOf = Long.valueOf(jOptLong);
        G7 g13 = this.f45631g;
        g13.getClass();
        InterfaceC3511fc interfaceC3511fcL = Ia.F.l();
        Location userLocation = interfaceC3511fcL.getUserLocation();
        if (userLocation != null) {
            int i14 = Eo.f45767b;
            Location location = new Location(userLocation);
            String provider = location.getProvider();
            location.setProvider("");
            eo2 = new Eo(location, provider);
        } else {
            Location systemLocation = interfaceC3511fcL.getSystemLocation();
            eo2 = systemLocation != null ? new Eo(new Location(systemLocation), "") : null;
        }
        boolean z13 = g13.f45846a.f48432d;
        Double dValueOf = eo2 != null ? Double.valueOf(eo2.getLatitude()) : null;
        Double dValueOf2 = eo2 != null ? Double.valueOf(eo2.getLongitude()) : null;
        Long lValueOf2 = eo2 != null ? Long.valueOf(eo2.getTime()) : null;
        Integer numValueOf2 = eo2 != null ? Integer.valueOf((int) eo2.getAccuracy()) : null;
        Integer numValueOf3 = eo2 != null ? Integer.valueOf((int) eo2.getBearing()) : null;
        Integer numValueOf4 = eo2 != null ? Integer.valueOf((int) eo2.getSpeed()) : null;
        E7 e13 = new E7(Boolean.valueOf(z13), dValueOf2, dValueOf, eo2 != null ? Integer.valueOf((int) eo2.getAltitude()) : null, numValueOf3, numValueOf2, numValueOf4, lValueOf2, eo2 != null ? eo2.getProvider() : null, eo2 != null ? eo2.f45768a : null);
        String str = this.f45632h.f47633c;
        C3525g0 c3525g0 = this.f45629e;
        String str2 = c3525g0.f47268a;
        Long lValueOf3 = Long.valueOf(c3525g0.f47269b);
        Integer numValueOf5 = Integer.valueOf(this.f45632h.f47637g);
        Context context = this.f45625a;
        SafePackageManager safePackageManager = Ue.f46612a;
        Integer num = (Integer) Ue.f46615d.a((Te) SystemServiceUtils.accessSystemServiceSafelyOrDefault((ConnectivityManager) context.getSystemService("connectivity"), "getting connection type", "ConnectivityManager", Te.UNDEFINED, new Se()));
        num.intValue();
        String strB = b();
        EnumC3405b9 enumC3405b9 = this.f45628d.f46503b;
        C3655l6 c3655l6 = this.f45632h;
        return new C4005z7(numValueOf, name, value, lValueOf, e13, str, str2, lValueOf3, numValueOf5, num, strB, enumC3405b9, c3655l6.f47638h, c3655l6.f47641k, c3655l6.f47642l, c3655l6.f47644n, c3655l6.f47645o, this.f45630f.fromModel(c3655l6.f47646p));
    }

    public /* synthetic */ D7(Context context, Uk uk2, int i13, C3683m9 c3683m9, S8 s13, C3965xh c3965xh, C3525g0 c3525g0) {
        this(context, uk2, i13, c3683m9, s13, c3525g0, new C3431c9(), new G7(c3965xh));
    }
}
