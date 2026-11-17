package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Pair;
import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3655l6 implements CounterReportApi, Parcelable {
    public static final Parcelable.Creator<C3655l6> CREATOR = new C3630k6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f47631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f47632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f47633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f47635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Pair f47636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f47637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f47638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f47639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f47640j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public EnumC3983ya f47641k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public H9 f47642l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bundle f47643m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f47644n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Integer f47645o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Map f47646p;

    public C3655l6() {
        this("", 0);
    }

    public final void a(String str, String str2) {
        if (this.f47636f == null) {
            this.f47636f = new Pair(str, str2);
        }
    }

    public final Pair<String, String> b() {
        return this.f47636f;
    }

    public final void c(Bundle bundle) {
        this.f47643m = bundle;
    }

    public final long d() {
        return this.f47639i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.f47640j;
    }

    public final String f() {
        return this.f47633c;
    }

    public final EnumC3983ya g() {
        return this.f47641k;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getBytesTruncated() {
        return this.f47637g;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getCustomType() {
        return this.f47635e;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final Map<String, byte[]> getExtras() {
        return this.f47646p;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getName() {
        return this.f47631a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final int getType() {
        return this.f47634d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final String getValue() {
        return this.f47632b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final byte[] getValueBytes() {
        String str = this.f47632b;
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public final Integer h() {
        return this.f47645o;
    }

    public final Bundle i() {
        return this.f47643m;
    }

    public final String j() {
        return this.f47638h;
    }

    public final H9 k() {
        return this.f47642l;
    }

    public final boolean l() {
        return this.f47631a == null;
    }

    public final boolean m() {
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        return -1 == this.f47634d;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setBytesTruncated(int i13) {
        this.f47637g = i13;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setCustomType(int i13) {
        this.f47635e = i13;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setExtras(Map<String, byte[]> map) {
        this.f47646p = map;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setName(String str) {
        this.f47631a = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setType(int i13) {
        this.f47634d = i13;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValue(String str) {
        this.f47632b = str;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public void setValueBytes(byte[] bArr) {
        this.f47632b = bArr == null ? null : new String(Base64.encode(bArr, 0));
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = this.f47631a;
        String str2 = EnumC3934wb.a(this.f47634d).f48325b;
        String strSubstring = this.f47632b;
        if (strSubstring == null) {
            strSubstring = null;
        } else if (strSubstring.length() > 500) {
            strSubstring = strSubstring.substring(0, 500);
        }
        return String.format(locale, "[event: %s, type: %s, value: %s]", str, str2, strSubstring);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        Bundle bundle = new Bundle();
        bundle.putString("CounterReport.Event", this.f47631a);
        bundle.putString("CounterReport.Value", this.f47632b);
        bundle.putInt("CounterReport.Type", this.f47634d);
        bundle.putInt("CounterReport.CustomType", this.f47635e);
        bundle.putInt("CounterReport.TRUNCATED", this.f47637g);
        bundle.putString("CounterReport.ProfileID", this.f47638h);
        bundle.putInt("CounterReport.UniquenessStatus", this.f47641k.f48521a);
        Bundle bundle2 = this.f47643m;
        if (bundle2 != null) {
            bundle.putParcelable("CounterReport.Payload", bundle2);
        }
        String str = this.f47633c;
        if (str != null) {
            bundle.putString("CounterReport.Environment", str);
        }
        Pair pair = this.f47636f;
        if (pair != null) {
            bundle.putString("CounterReport.AppEnvironmentDiffKey", (String) pair.first);
            bundle.putString("CounterReport.AppEnvironmentDiffValue", (String) pair.second);
        }
        bundle.putLong("CounterReport.CreationElapsedRealtime", this.f47639i);
        bundle.putLong("CounterReport.CreationTimestamp", this.f47640j);
        H9 h13 = this.f47642l;
        if (h13 != null) {
            bundle.putInt("CounterReport.Source", h13.f45909a);
        }
        Boolean bool = this.f47644n;
        if (bool != null) {
            bundle.putBoolean("CounterReport.AttributionIdChanged", bool.booleanValue());
        }
        Integer num = this.f47645o;
        if (num != null) {
            bundle.putInt("CounterReport.OpenId", num.intValue());
        }
        bundle.putBundle("CounterReport.Extras", CollectionUtils.mapToBundle(this.f47646p));
        parcel.writeBundle(bundle);
    }

    public C3655l6(String str, int i13) {
        this("", str, i13);
    }

    public static C3655l6 e(C3655l6 c3655l6) {
        return a(c3655l6, EnumC3934wb.EVENT_TYPE_APP_UPDATE);
    }

    public final void b(String str) {
        this.f47633c = str;
    }

    public void c(String str) {
        this.f47638h = str;
    }

    public final Bundle d(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putParcelable("CounterReport.Object", this);
        return bundle;
    }

    public C3655l6(String str, String str2, int i13) {
        this(str, str2, i13, new SystemTimeProvider());
    }

    public final void a(long j13) {
        this.f47639i = j13;
    }

    public final void b(long j13) {
        this.f47640j = j13;
    }

    public final Boolean c() {
        return this.f47644n;
    }

    public C3655l6(String str, String str2, int i13, SystemTimeProvider systemTimeProvider) {
        this.f47641k = EnumC3983ya.UNKNOWN;
        this.f47646p = new HashMap();
        this.f47631a = str2;
        this.f47634d = i13;
        this.f47632b = str;
        this.f47639i = systemTimeProvider.elapsedRealtime();
        this.f47640j = systemTimeProvider.currentTimeMillis();
    }

    public static C3655l6 b(Bundle bundle) {
        if (bundle != null) {
            try {
                C3655l6 c3655l6 = (C3655l6) bundle.getParcelable("CounterReport.Object");
                if (c3655l6 != null) {
                    return c3655l6;
                }
            } catch (Throwable unused) {
                return new C3655l6("", 0);
            }
        }
        return new C3655l6("", 0);
    }

    public static C3655l6 c(C3655l6 c3655l6) {
        return a(c3655l6, EnumC3934wb.EVENT_TYPE_INIT);
    }

    public static C3655l6 d(C3655l6 c3655l6) {
        C3655l6 c3655l7 = new C3655l6("", 0);
        c3655l7.f47640j = c3655l6.f47640j;
        c3655l7.f47639i = c3655l6.f47639i;
        c3655l7.f47636f = c3655l6.f47636f;
        c3655l7.f47633c = c3655l6.f47633c;
        c3655l7.f47643m = c3655l6.f47643m;
        c3655l7.f47646p = c3655l6.f47646p;
        c3655l7.f47638h = c3655l6.f47638h;
        return c3655l7;
    }

    public final void a(EnumC3983ya enumC3983ya) {
        this.f47641k = enumC3983ya;
    }

    public final void a(H9 h13) {
        this.f47642l = h13;
    }

    public final void a(Boolean bool) {
        this.f47644n = bool;
    }

    public final void a(Integer num) {
        this.f47645o = num;
    }

    public static Pair a(Bundle bundle) {
        if (bundle.containsKey("CounterReport.AppEnvironmentDiffKey") && bundle.containsKey("CounterReport.AppEnvironmentDiffValue")) {
            return new Pair(bundle.getString("CounterReport.AppEnvironmentDiffKey"), bundle.getString("CounterReport.AppEnvironmentDiffValue"));
        }
        return null;
    }

    public static C3655l6 b(C3655l6 c3655l6) {
        return a(c3655l6, EnumC3934wb.EVENT_TYPE_FIRST_ACTIVATION);
    }

    public static C3655l6 a(C3655l6 c3655l6, EnumC3934wb enumC3934wb) {
        C3655l6 c3655l6D = d(c3655l6);
        c3655l6D.f47634d = enumC3934wb.f48324a;
        return c3655l6D;
    }

    public static C3655l6 a(C3655l6 c3655l6) {
        return a(c3655l6, EnumC3934wb.EVENT_TYPE_ALIVE);
    }

    public static C3655l6 a(C3655l6 c3655l6, C3560ha c3560ha) {
        C3655l6 c3655l6A = a(c3655l6, EnumC3934wb.EVENT_TYPE_START);
        c3655l6A.setValueBytes(MessageNano.toByteArray(new K9().fromModel(new J9((String) c3560ha.f47382b.a()))));
        c3655l6A.f47640j = c3655l6.f47640j;
        c3655l6A.f47639i = c3655l6.f47639i;
        return c3655l6A;
    }

    public static C3655l6 a(C3655l6 c3655l6, Collection<PermissionState> collection, J2 j13, C3577i2 c3577i2, List<String> list) {
        String string;
        String str;
        C3655l6 c3655l6D = d(c3655l6);
        try {
            JSONArray jSONArray = new JSONArray();
            for (PermissionState permissionState : collection) {
                jSONArray.put(new JSONObject().put(ExternalMetricsManagerImpl.NAME, permissionState.name).put("granted", permissionState.granted));
            }
            JSONObject jSONObject = new JSONObject();
            if (j13 != null) {
                jSONObject.put("background_restricted", j13.f46053b);
                I2 i13 = j13.f46052a;
                c3577i2.getClass();
                if (i13 != null) {
                    switch (i13) {
                        case EXEMPTED:
                            str = "EXEMPTED";
                            break;
                        case ACTIVE:
                            str = "ACTIVE";
                            break;
                        case WORKING_SET:
                            str = "WORKING_SET";
                            break;
                        case FREQUENT:
                            str = "FREQUENT";
                            break;
                        case RARE:
                            str = "RARE";
                            break;
                        case RESTRICTED:
                            str = "RESTRICTED";
                            break;
                        case UNKNOWN:
                            str = "UNKNOWN";
                            break;
                    }
                    jSONObject.put("app_standby_bucket", str);
                }
                str = null;
                jSONObject.put("app_standby_bucket", str);
            }
            string = new JSONObject().put("permissions", jSONArray).put("background_restrictions", jSONObject).put("available_providers", new JSONArray((Collection) list)).toString();
        } catch (Throwable unused) {
            string = "";
        }
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        c3655l6D.f47634d = 12288;
        c3655l6D.setValue(string);
        return c3655l6D;
    }

    public static C3655l6 a(C3655l6 c3655l6, String str) {
        C3655l6 c3655l6D = d(c3655l6);
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        c3655l6D.f47634d = 12289;
        c3655l6D.setValue(str);
        return c3655l6D;
    }

    public static C3655l6 a() {
        C3655l6 c3655l6 = new C3655l6("", 0);
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        c3655l6.f47634d = 16384;
        return c3655l6;
    }

    public static C3655l6 a(Tf tf2) {
        int i13;
        String currencyCode = "";
        int i14 = 0;
        C3655l6 c3655l6 = new C3655l6("", "", 0);
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        c3655l6.f47634d = 40976;
        ProductInfo productInfo = tf2.f46574a;
        Zi zi2 = new Zi();
        zi2.f46877a = productInfo.quantity;
        zi2.f46882f = productInfo.priceMicros;
        try {
            currencyCode = Currency.getInstance(productInfo.priceCurrency).getCurrencyCode();
        } catch (Throwable unused) {
        }
        zi2.f46878b = currencyCode.getBytes();
        zi2.f46879c = productInfo.sku.getBytes();
        Ui ui2 = new Ui();
        ui2.f46627a = productInfo.purchaseOriginalJson.getBytes();
        ui2.f46628b = productInfo.signature.getBytes();
        zi2.f46881e = ui2;
        zi2.f46883g = true;
        zi2.f46884h = 1;
        zi2.f46885i = Sf.f46508a[productInfo.type.ordinal()] != 2 ? 1 : 2;
        Yi yi2 = new Yi();
        yi2.f46814a = productInfo.purchaseToken.getBytes();
        yi2.f46815b = TimeUnit.MILLISECONDS.toSeconds(productInfo.purchaseTime);
        zi2.f46886j = yi2;
        if (productInfo.type == ProductType.SUBS) {
            Xi xi2 = new Xi();
            xi2.f46776a = productInfo.autoRenewing;
            Period period = productInfo.subscriptionPeriod;
            if (period != null) {
                Wi wi2 = new Wi();
                wi2.f46727a = period.number;
                int i15 = Sf.f46509b[period.timeUnit.ordinal()];
                if (i15 == 1) {
                    i13 = 1;
                } else if (i15 == 2) {
                    i13 = 2;
                } else if (i15 != 3) {
                    i13 = i15 != 4 ? 0 : 4;
                } else {
                    i13 = 3;
                }
                wi2.f46728b = i13;
                xi2.f46777b = wi2;
            }
            Vi vi2 = new Vi();
            vi2.f46682a = productInfo.introductoryPriceMicros;
            Period period2 = productInfo.introductoryPricePeriod;
            if (period2 != null) {
                Wi wi3 = new Wi();
                wi3.f46727a = period2.number;
                int i16 = Sf.f46509b[period2.timeUnit.ordinal()];
                if (i16 == 1) {
                    i14 = 1;
                } else if (i16 == 2) {
                    i14 = 2;
                } else if (i16 == 3) {
                    i14 = 3;
                } else if (i16 == 4) {
                    i14 = 4;
                }
                wi3.f46728b = i14;
                vi2.f46683b = wi3;
            }
            vi2.f46684c = productInfo.introductoryPriceCycles;
            xi2.f46778c = vi2;
            zi2.f46887k = xi2;
        }
        c3655l6.setValueBytes(MessageNano.toByteArray(zi2));
        return c3655l6;
    }

    public static C3655l6 a(String str) {
        C3655l6 c3655l6 = new C3655l6("", 0);
        EnumC3934wb enumC3934wb = EnumC3934wb.EVENT_TYPE_UNDEFINED;
        c3655l6.f47634d = 12320;
        c3655l6.f47632b = str;
        c3655l6.f47642l = H9.JS;
        return c3655l6;
    }
}
