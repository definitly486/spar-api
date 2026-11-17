package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Jg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SafePackageManager f46098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3685mb f46099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Yc f46100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f46101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f46102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f46103g;

    public Jg(Context context, SafePackageManager safePackageManager, InterfaceC3685mb interfaceC3685mb) {
        this.f46097a = context;
        this.f46098b = safePackageManager;
        this.f46099c = interfaceC3685mb;
        Yc yc2 = new Yc(0);
        yc2.a(EnumC4014zg.f48614d, 1);
        yc2.a(EnumC4014zg.f48613c, 2);
        this.f46100d = yc2;
        this.f46101e = TimeUnit.DAYS.toSeconds(1L);
        this.f46102f = "com.android.vending";
        this.f46103g = "com.huawei.appmarket";
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0098  */
    public final Ag a(List list) {
        Ag ag2;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (Ag) list.get(0);
        }
        SafePackageManager safePackageManager = this.f46098b;
        Context context = this.f46097a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 0);
        if (packageInfo != null) {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(packageInfo.firstInstallTime);
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Ag ag3 = (Ag) it.next();
            gg.vdvldrhtss vdvldrhtssVarIobyxmoadg = gg.cqumvgiudr.iobyxmoadg(ag3, Long.valueOf(Math.abs(ag3.f45470c - seconds)));
            while (it.hasNext()) {
                Ag ag4 = (Ag) it.next();
                gg.vdvldrhtss vdvldrhtssVarIobyxmoadg2 = gg.cqumvgiudr.iobyxmoadg(ag4, Long.valueOf(Math.abs(ag4.f45470c - seconds)));
                if (kg.iobyxmoadg.wkgbmnqykc((Comparable) vdvldrhtssVarIobyxmoadg.nufgyqmvbu(), (Comparable) vdvldrhtssVarIobyxmoadg2.nufgyqmvbu()) > 0) {
                    vdvldrhtssVarIobyxmoadg = vdvldrhtssVarIobyxmoadg2;
                }
            }
            ag2 = (Ag) vdvldrhtssVarIobyxmoadg.iobyxmoadg();
            if (((Number) vdvldrhtssVarIobyxmoadg.wkgbmnqykc()).longValue() >= this.f46101e) {
                ag2 = null;
            }
        } else {
            ag2 = null;
        }
        if (ag2 == null) {
            Comparator comparator = new Comparator() { // from class: io.appmetrica.analytics.impl.gtknphoqwx
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Jg.a(this.f47359zdlpuopuiu, (Ag) obj, (Ag) obj2);
                }
            };
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Ag ag5 = (Ag) it2.next();
            while (it2.hasNext()) {
                Ag ag6 = (Ag) it2.next();
                if (comparator.compare(ag5, ag6) < 0) {
                    ag5 = ag6;
                }
            }
            ag2 = ag5;
        }
        InterfaceC3685mb interfaceC3685mb = this.f46099c;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList(hg.jyumaefscl.cqumvgiudr(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Ag ag7 = (Ag) it3.next();
            arrayList.add(new JSONObject().put("referrer", ag7.f45468a).put("install_timestamp_seconds", ag7.f45470c).put("click_timestamp_seconds", ag7.f45469b).put(AdRevenueConstants.SOURCE_KEY, ag7.f45471d.f48616a));
        }
        interfaceC3685mb.reportEvent("several_filled_referrers", jSONObject.put("candidates", io.a((Collection) arrayList) ? null : new JSONArray((Collection) arrayList)).put("chosen", new JSONObject().put("referrer", ag2.f45468a).put("install_timestamp_seconds", ag2.f45470c).put("click_timestamp_seconds", ag2.f45469b).put(AdRevenueConstants.SOURCE_KEY, ag2.f45471d.f48616a)).putOpt("install_time", packageInfo != null ? Long.valueOf(packageInfo.firstInstallTime) : null).toString());
        return ag2;
    }

    public /* synthetic */ Jg(Context context) {
        this(context, new SafePackageManager(), AbstractC3849t1.a());
    }

    public static final int a(Jg jg2, Ag ag2, Ag ag3) {
        int iZoijcleaow = vg.iobyxmoadg.zoijcleaow(ag2.f45470c - ag3.f45470c);
        return iZoijcleaow == 0 ? ((Number) jg2.f46100d.a(ag2.f45471d)).intValue() - ((Number) jg2.f46100d.a(ag3.f45471d)).intValue() : iZoijcleaow;
    }
}
