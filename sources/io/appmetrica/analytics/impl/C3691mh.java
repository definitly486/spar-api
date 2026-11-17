package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.AdvIdWithLimitedAppender;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.IParamsAppender;
import io.appmetrica.analytics.networktasks.internal.NetworkTaskForSendingDataParamsAppender;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3691mh implements IParamsAppender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdvIdWithLimitedAppender f47707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NetworkTaskForSendingDataParamsAppender f47708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H7 f47709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3434cc f47710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f47711e;

    public C3691mh(RequestBodyEncrypter requestBodyEncrypter) {
        this(new AdvIdWithLimitedAppender(), new NetworkTaskForSendingDataParamsAppender(requestBodyEncrypter), new C3434cc());
    }

    public final void a(H7 h13) {
        this.f47709c = h13;
    }

    public C3691mh(AdvIdWithLimitedAppender advIdWithLimitedAppender, NetworkTaskForSendingDataParamsAppender networkTaskForSendingDataParamsAppender, C3434cc c3434cc) {
        this.f47707a = advIdWithLimitedAppender;
        this.f47708b = networkTaskForSendingDataParamsAppender;
        this.f47710d = c3434cc;
    }

    public final void a(long j13) {
        this.f47711e = j13;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.IParamsAppender
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void appendParams(Uri.Builder builder, C3965xh c3965xh) {
        builder.path("report");
        this.f47708b.appendEncryptedData(builder);
        H7 h13 = this.f47709c;
        if (h13 != null) {
            builder.appendQueryParameter(CommonUrlParts.DEVICE_ID, StringUtils.ifIsEmptyToDef(h13.f45883a, c3965xh.getDeviceId()));
            builder.appendQueryParameter(CommonUrlParts.UUID, StringUtils.ifIsEmptyToDef(this.f47709c.f45884b, c3965xh.getUuid()));
            a(builder, CommonUrlParts.ANALYTICS_SDK_VERSION_NAME, this.f47709c.f45885c);
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION, StringUtils.ifIsEmptyToDef(this.f47709c.f45888f, c3965xh.getAppVersion()));
            builder.appendQueryParameter(CommonUrlParts.APP_VERSION_CODE, StringUtils.ifIsEmptyToDef(this.f47709c.f45890h, c3965xh.getAppBuildNumber()));
            builder.appendQueryParameter(CommonUrlParts.OS_VERSION, StringUtils.ifIsEmptyToDef(this.f47709c.f45891i, c3965xh.getOsVersion()));
            a(builder, CommonUrlParts.OS_API_LEVEL, this.f47709c.f45892j);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_NUMBER, this.f47709c.f45886d);
            a(builder, CommonUrlParts.ANALYTICS_SDK_BUILD_TYPE, this.f47709c.f45887e);
            a(builder, "app_debuggable", this.f47709c.f45889g);
            builder.appendQueryParameter(CommonUrlParts.LOCALE, StringUtils.ifIsEmptyToDef(this.f47709c.f45893k, c3965xh.getLocale()));
            builder.appendQueryParameter(CommonUrlParts.ROOT_STATUS, StringUtils.ifIsEmptyToDef(this.f47709c.f45894l, c3965xh.getDeviceRootStatus()));
            builder.appendQueryParameter(CommonUrlParts.APP_FRAMEWORK, StringUtils.ifIsEmptyToDef(this.f47709c.f45895m, c3965xh.getAppFramework()));
            a(builder, "attribution_id", this.f47709c.f45896n);
        }
        builder.appendQueryParameter("api_key_128", c3965xh.f48441m);
        builder.appendQueryParameter(CommonUrlParts.APP_ID, c3965xh.getPackageName());
        builder.appendQueryParameter(CommonUrlParts.APP_PLATFORM, c3965xh.getAppPlatform());
        builder.appendQueryParameter(CommonUrlParts.MODEL, c3965xh.getModel());
        builder.appendQueryParameter(CommonUrlParts.MANUFACTURER, c3965xh.getManufacturer());
        builder.appendQueryParameter(CommonUrlParts.SCREEN_WIDTH, String.valueOf(c3965xh.getScreenWidth()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_HEIGHT, String.valueOf(c3965xh.getScreenHeight()));
        builder.appendQueryParameter(CommonUrlParts.SCREEN_DPI, String.valueOf(c3965xh.getScreenDpi()));
        builder.appendQueryParameter(CommonUrlParts.SCALE_FACTOR, String.valueOf(c3965xh.getScaleFactor()));
        builder.appendQueryParameter(CommonUrlParts.DEVICE_TYPE, c3965xh.getDeviceType());
        a(builder, "clids_set", (String) WrapUtils.getOrDefault(c3965xh.f48444p, ""));
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID, c3965xh.getAppSetId());
        builder.appendQueryParameter(CommonUrlParts.APP_SET_ID_SCOPE, c3965xh.getAppSetIdScope());
        AdvIdWithLimitedAppender advIdWithLimitedAppender = this.f47707a;
        this.f47710d.getClass();
        advIdWithLimitedAppender.appendParams(builder, Ia.F.b().getIdentifiers());
        builder.appendQueryParameter(CommonUrlParts.REQUEST_ID, String.valueOf(this.f47711e));
    }

    public static void a(Uri.Builder builder, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
