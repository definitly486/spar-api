package io.appmetrica.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.AbstractC3775q1;
import io.appmetrica.analytics.impl.C3750p1;
import io.appmetrica.analytics.impl.F0;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AppMetrica {
    public static void activate(Context context, AppMetricaConfig appMetricaConfig) {
        AbstractC3775q1.f47908a.a(context, appMetricaConfig);
    }

    public static void activateReporter(Context context, ReporterConfig reporterConfig) {
        AbstractC3775q1.f47908a.a(context, reporterConfig);
    }

    public static void clearAppEnvironment() {
        AbstractC3775q1.f47908a.a();
    }

    public static void enableActivityAutoTracking(Application application) {
        AbstractC3775q1.f47908a.a(application);
    }

    public static String getDeviceId(Context context) {
        return AbstractC3775q1.f47908a.b();
    }

    public static int getLibraryApiLevel() {
        return BuildConfig.API_LEVEL;
    }

    public static String getLibraryVersion() {
        return "7.10.0";
    }

    public static AppMetricaPlugins getPluginExtension() {
        return F0.f45772a;
    }

    public static IReporter getReporter(Context context, String str) {
        return AbstractC3775q1.f47908a.a(context, str);
    }

    public static String getUuid(Context context) {
        return AbstractC3775q1.f47908a.a(context).f48647id;
    }

    public static void initWebViewReporting(WebView webView) {
        AbstractC3775q1.f47908a.a(webView);
    }

    public static void pauseSession(Activity activity) {
        AbstractC3775q1.f47908a.a(activity);
    }

    public static void putAppEnvironmentValue(String str, String str2) {
        AbstractC3775q1.f47908a.a(str, str2);
    }

    public static void putErrorEnvironmentValue(String str, String str2) {
        AbstractC3775q1.f47908a.b(str, str2);
    }

    public static void registerAnrListener(AnrListener anrListener) {
        AbstractC3775q1.f47908a.a(anrListener);
    }

    public static void reportAdRevenue(AdRevenue adRevenue) {
        AbstractC3775q1.f47908a.a(adRevenue);
    }

    public static void reportAnr(Map<Thread, StackTraceElement[]> map) {
        AbstractC3775q1.f47908a.a(map);
    }

    public static void reportAppOpen(Activity activity) {
        AbstractC3775q1.f47908a.b(activity);
    }

    public static void reportECommerce(ECommerceEvent eCommerceEvent) {
        AbstractC3775q1.f47908a.a(eCommerceEvent);
    }

    public static void reportError(String str, String str2) {
        AbstractC3775q1.f47908a.a(str, str2, (Throwable) null);
    }

    public static void reportEvent(String str) {
        AbstractC3775q1.f47908a.b(str);
    }

    public static void reportExternalAdRevenue(Object... objArr) {
        AbstractC3775q1.f47908a.b(objArr);
    }

    public static void reportExternalAttribution(ExternalAttribution externalAttribution) {
        AbstractC3775q1.f47908a.a(externalAttribution);
    }

    public static void reportReferralUrl(String str) {
        AbstractC3775q1.f47908a.d(str);
    }

    public static void reportRevenue(Revenue revenue) {
        AbstractC3775q1.f47908a.a(revenue);
    }

    public static void reportUnhandledException(Throwable th2) {
        AbstractC3775q1.f47908a.a(th2);
    }

    public static void reportUserProfile(UserProfile userProfile) {
        AbstractC3775q1.f47908a.a(userProfile);
    }

    public static void requestDeferredDeeplink(DeferredDeeplinkListener deferredDeeplinkListener) {
        AbstractC3775q1.f47908a.a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        AbstractC3775q1.f47908a.a(deferredDeeplinkParametersListener);
    }

    public static void requestStartupParams(Context context, StartupParamsCallback startupParamsCallback, List<String> list) {
        C3750p1 c3750p1 = AbstractC3775q1.f47908a;
        if (list.isEmpty()) {
            list = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);
        }
        c3750p1.a(context, startupParamsCallback, list);
    }

    public static void resumeSession(Activity activity) {
        AbstractC3775q1.f47908a.c(activity);
    }

    public static void sendEventsBuffer() {
        AbstractC3775q1.f47908a.f();
    }

    public static void setAdvIdentifiersTracking(boolean z13) {
        AbstractC3775q1.f47908a.a(z13);
    }

    public static void setDataSendingEnabled(boolean z13) {
        AbstractC3775q1.f47908a.b(z13);
    }

    public static void setLocation(Location location) {
        AbstractC3775q1.f47908a.a(location);
    }

    public static void setLocationTracking(boolean z13) {
        AbstractC3775q1.f47908a.c(z13);
    }

    public static void setUserProfileID(String str) {
        AbstractC3775q1.f47908a.e(str);
    }

    public static void reportAppOpen(Intent intent) {
        AbstractC3775q1.f47908a.a(intent);
    }

    public static void reportError(String str, String str2, Throwable th2) {
        AbstractC3775q1.f47908a.a(str, str2, th2);
    }

    public static void reportEvent(String str, String str2) {
        AbstractC3775q1.f47908a.c(str, str2);
    }

    public static void reportAppOpen(String str) {
        AbstractC3775q1.f47908a.a(str);
    }

    public static void reportError(String str, Throwable th2) {
        AbstractC3775q1.f47908a.a(str, th2);
    }

    public static void reportEvent(String str, Map<String, Object> map) {
        AbstractC3775q1.f47908a.a(str, map);
    }
}
