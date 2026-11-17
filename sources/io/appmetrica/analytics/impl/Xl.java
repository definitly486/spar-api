package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Xl implements IParamsAppender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3912ve f46786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ed f46787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3434cc f46788c = new C3434cc();

    public Xl(C3912ve c3912ve, Ed ed2) {
        this.f46786a = c3912ve;
        this.f46787b = ed2;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C3418bm c3418bm) {
        String str;
        Ag ag2;
        builder.path("analytics/startup");
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.DEVICE_ID), c3418bm.getDeviceId());
        a(builder, Ia.F.g(), this.f46788c);
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.APP_SET_ID), c3418bm.getAppSetId());
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.APP_SET_ID_SCOPE), c3418bm.getAppSetIdScope());
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.APP_PLATFORM), c3418bm.getAppPlatform());
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.PROTOCOL_VERSION), c3418bm.getProtocolVersion());
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.ANALYTICS_SDK_VERSION_NAME), c3418bm.getAnalyticsSdkVersionName());
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.MODEL), c3418bm.getModel());
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.MANUFACTURER), c3418bm.getManufacturer());
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.OS_VERSION), c3418bm.getOsVersion());
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.SCREEN_WIDTH), String.valueOf(c3418bm.getScreenWidth()));
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.SCREEN_HEIGHT), String.valueOf(c3418bm.getScreenHeight()));
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.SCREEN_DPI), String.valueOf(c3418bm.getScreenDpi()));
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.SCALE_FACTOR), String.valueOf(c3418bm.getScaleFactor()));
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.LOCALE), c3418bm.getLocale());
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.DEVICE_TYPE), c3418bm.getDeviceType());
        builder.appendQueryParameter(this.f46786a.a("queries"), String.valueOf(1));
        builder.appendQueryParameter(this.f46786a.a("query_hosts"), String.valueOf(2));
        String strA = this.f46786a.a("features");
        List<String> listH = ((C3993yk) this.f46787b).h();
        String[] strArr = {this.f46786a.a("permissions_collecting"), this.f46786a.a("features_collecting"), this.f46786a.a("google_aid"), this.f46786a.a("huawei_oaid"), this.f46786a.a("sim_info"), this.f46786a.a("ssl_pinning")};
        ArrayList arrayList = new ArrayList(listH);
        arrayList.addAll(Arrays.asList(strArr));
        builder.appendQueryParameter(strA, StringUtils.wrapFeatures((String[]) arrayList.toArray(new String[0])));
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.APP_ID), c3418bm.getPackageName());
        builder.appendQueryParameter(this.f46786a.a("app_debuggable"), ((C3605j6) c3418bm).f47514a);
        if (c3418bm.f46994l) {
            String str2 = c3418bm.f46995m;
            if (!TextUtils.isEmpty(str2)) {
                builder.appendQueryParameter(this.f46786a.a("country_init"), str2);
            }
        } else {
            builder.appendQueryParameter(this.f46786a.a("detect_locale"), String.valueOf(1));
        }
        N3 n13 = c3418bm.f46991i;
        if (!io.a(n13.f46249a)) {
            builder.appendQueryParameter(this.f46786a.a("distribution_customization"), String.valueOf(1));
            builder.appendQueryParameter(this.f46786a.a("clids_set"), Gm.a(n13.f46249a));
            int iOrdinal = n13.f46250b.ordinal();
            if (iOrdinal == 1) {
                str = "api";
            } else if (iOrdinal != 2) {
                str = iOrdinal != 3 ? "" : "retail";
            } else {
                str = "satellite";
            }
            builder.appendQueryParameter(this.f46786a.a("clids_set_source"), str);
            String str3 = c3418bm.f46988f;
            String str4 = c3418bm.f46989g;
            if (TextUtils.isEmpty(str3) && (ag2 = c3418bm.f46997o.f48527b) != null) {
                str3 = ag2.f45468a;
                str4 = ag2.f45471d.f48616a;
            }
            if (!TextUtils.isEmpty(str3)) {
                builder.appendQueryParameter(this.f46786a.a("install_referrer"), str3);
                if (str4 == null) {
                    str4 = "null";
                }
                builder.appendQueryParameter(this.f46786a.a("install_referrer_source"), str4);
            }
        }
        String uuid = c3418bm.getUuid();
        if (!TextUtils.isEmpty(uuid)) {
            builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.UUID), uuid);
        }
        builder.appendQueryParameter(this.f46786a.a("time"), String.valueOf(1));
        builder.appendQueryParameter(this.f46786a.a("stat_sending"), String.valueOf(1));
        builder.appendQueryParameter(this.f46786a.a("retry_policy"), String.valueOf(1));
        builder.appendQueryParameter(this.f46786a.a("cache_control"), String.valueOf(1));
        builder.appendQueryParameter(this.f46786a.a("permissions_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f46786a.a("app_system_flag"), ((C3605j6) c3418bm).f47515b);
        builder.appendQueryParameter(this.f46786a.a("auto_inapp_collecting"), String.valueOf(1));
        builder.appendQueryParameter(this.f46786a.a("attribution"), String.valueOf(1));
        builder.appendQueryParameter(this.f46786a.a("startup_update"), String.valueOf(1));
        builder.appendQueryParameter(this.f46786a.a("external_attribution"), String.valueOf(1));
        Map<String, Integer> mapD = ((C3993yk) this.f46787b).d();
        for (String str5 : mapD.keySet()) {
            builder.appendQueryParameter(str5, String.valueOf(mapD.get(str5)));
        }
    }

    public final void a(Uri.Builder builder, DataSendingRestrictionController dataSendingRestrictionController, C3434cc c3434cc) {
        c3434cc.getClass();
        AdvertisingIdsHolder identifiers = Ia.F.b().getIdentifiers();
        if (identifiers != null && !dataSendingRestrictionController.isRestrictedForSdk()) {
            AdTrackingInfoResult google = identifiers.getGoogle();
            if (!google.isValid()) {
                builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.ADV_ID), "");
            } else {
                builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.ADV_ID), google.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult huawei = identifiers.getHuawei();
            if (!huawei.isValid()) {
                builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.HUAWEI_OAID), "");
            } else {
                builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.HUAWEI_OAID), huawei.mAdTrackingInfo.advId);
            }
            AdTrackingInfoResult yandex = identifiers.getYandex();
            if (!yandex.isValid()) {
                builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.YANDEX_ADV_ID), "");
                return;
            } else {
                builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.YANDEX_ADV_ID), yandex.mAdTrackingInfo.advId);
                return;
            }
        }
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.ADV_ID), "");
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.HUAWEI_OAID), "");
        builder.appendQueryParameter(this.f46786a.a(CommonUrlParts.YANDEX_ADV_ID), "");
    }
}
