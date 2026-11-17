package io.appmetrica.analytics;

import android.location.Location;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC3426c4;
import io.appmetrica.analytics.impl.Bb;
import io.appmetrica.analytics.impl.Bn;
import io.appmetrica.analytics.impl.C3499f0;
import io.appmetrica.analytics.impl.I5;
import io.appmetrica.analytics.impl.Y7;
import io.appmetrica.analytics.impl.io;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AppMetricaConfig {
    public final Map<String, Object> additionalConfig;
    public final Boolean advIdentifiersTracking;
    public final Boolean anrMonitoring;
    public final Integer anrMonitoringTimeout;
    public final String apiKey;
    public final Integer appBuildNumber;
    public final Map<String, String> appEnvironment;
    public final Boolean appOpenTrackingEnabled;
    public final String appVersion;
    public final Boolean crashReporting;
    public final ICrashTransformer crashTransformer;
    public final List<String> customHosts;
    public final Boolean dataSendingEnabled;
    public final String deviceType;
    public final Integer dispatchPeriodSeconds;
    public final Map<String, String> errorEnvironment;
    public final Boolean firstActivationAsUpdate;
    public final Location location;
    public final Boolean locationTracking;
    public final Boolean logs;
    public final Integer maxReportsCount;
    public final Integer maxReportsInDatabaseCount;
    public final Boolean nativeCrashReporting;
    public final PreloadInfo preloadInfo;
    public final Boolean revenueAutoTrackingEnabled;
    public final Integer sessionTimeout;
    public final Boolean sessionsAutoTrackingEnabled;
    public final String userProfileID;

    public static class Builder {
        private static final Bn D = new Bn(new C3499f0());
        private Integer A;
        private List B;
        private final HashMap C;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final I5 f45071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f45072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f45073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f45074d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f45075e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Boolean f45076f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Location f45077g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Boolean f45078h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Boolean f45079i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Boolean f45080j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private PreloadInfo f45081k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Boolean f45082l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Boolean f45083m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Integer f45084n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final LinkedHashMap f45085o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private String f45086p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Boolean f45087q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Boolean f45088r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Boolean f45089s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f45090t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private Integer f45091u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Integer f45092v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Integer f45093w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private final LinkedHashMap f45094x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private ICrashTransformer f45095y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private Boolean f45096z;

        /* synthetic */ Builder(String str, int i13) {
            this(str);
        }

        public AppMetricaConfig build() {
            return new AppMetricaConfig(this, 0);
        }

        public Builder handleFirstActivationAsUpdate(boolean z13) {
            this.f45082l = Boolean.valueOf(z13);
            return this;
        }

        public Builder withAdditionalConfig(String str, Object obj) {
            this.C.put(str, obj);
            return this;
        }

        public Builder withAdvIdentifiersTracking(boolean z13) {
            this.f45079i = Boolean.valueOf(z13);
            return this;
        }

        public Builder withAnrMonitoring(boolean z13) {
            this.f45096z = Boolean.valueOf(z13);
            return this;
        }

        public Builder withAnrMonitoringTimeout(int i13) {
            this.A = Integer.valueOf(i13);
            return this;
        }

        public Builder withAppBuildNumber(int i13) {
            if (i13 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid %1$s. %1$s should be positive.", "App Build Number"));
            }
            this.f45091u = Integer.valueOf(i13);
            return this;
        }

        public Builder withAppEnvironmentValue(String str, String str2) {
            this.f45094x.put(str, str2);
            return this;
        }

        public Builder withAppOpenTrackingEnabled(boolean z13) {
            this.f45089s = Boolean.valueOf(z13);
            return this;
        }

        public Builder withAppVersion(String str) {
            this.f45073c = str;
            return this;
        }

        public Builder withCrashReporting(boolean z13) {
            this.f45075e = Boolean.valueOf(z13);
            return this;
        }

        public Builder withCrashTransformer(ICrashTransformer iCrashTransformer) {
            this.f45095y = iCrashTransformer;
            return this;
        }

        public Builder withCustomHosts(List<String> list) {
            this.B = CollectionUtils.unmodifiableListCopy(list);
            return this;
        }

        public Builder withDataSendingEnabled(boolean z13) {
            this.f45083m = Boolean.valueOf(z13);
            return this;
        }

        public Builder withDeviceType(String str) {
            this.f45090t = str;
            return this;
        }

        public Builder withDispatchPeriodSeconds(int i13) {
            this.f45092v = Integer.valueOf(i13);
            return this;
        }

        public Builder withErrorEnvironmentValue(String str, String str2) {
            this.f45085o.put(str, str2);
            return this;
        }

        public Builder withLocation(Location location) {
            this.f45077g = location;
            return this;
        }

        public Builder withLocationTracking(boolean z13) {
            this.f45078h = Boolean.valueOf(z13);
            return this;
        }

        public Builder withLogs() {
            this.f45080j = Boolean.TRUE;
            return this;
        }

        public Builder withMaxReportsCount(int i13) {
            this.f45093w = Integer.valueOf(i13);
            return this;
        }

        public Builder withMaxReportsInDatabaseCount(int i13) {
            this.f45084n = Integer.valueOf(this.f45071a.a(i13));
            return this;
        }

        public Builder withNativeCrashReporting(boolean z13) {
            this.f45076f = Boolean.valueOf(z13);
            return this;
        }

        public Builder withPreloadInfo(PreloadInfo preloadInfo) {
            this.f45081k = preloadInfo;
            return this;
        }

        public Builder withRevenueAutoTrackingEnabled(boolean z13) {
            this.f45087q = Boolean.valueOf(z13);
            return this;
        }

        public Builder withSessionTimeout(int i13) {
            this.f45074d = Integer.valueOf(i13);
            return this;
        }

        public Builder withSessionsAutoTrackingEnabled(boolean z13) {
            this.f45088r = Boolean.valueOf(z13);
            return this;
        }

        public Builder withUserProfileID(String str) {
            this.f45086p = str;
            return this;
        }

        private Builder(String str) {
            this.f45085o = new LinkedHashMap();
            this.f45094x = new LinkedHashMap();
            this.C = new HashMap();
            D.a(str);
            this.f45071a = new I5(str);
            this.f45072b = str;
        }
    }

    /* synthetic */ AppMetricaConfig(Builder builder, int i13) {
        this(builder);
    }

    public static AppMetricaConfig fromJson(String str) {
        AppMetricaConfig appMetricaConfig;
        HashMap mapC;
        HashMap mapC2;
        new Y7();
        if (TextUtils.isEmpty(str)) {
            appMetricaConfig = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Builder builderNewConfigBuilder = newConfigBuilder(jSONObject.getString("apikey"));
                if (jSONObject.has("app_version")) {
                    builderNewConfigBuilder.withAppVersion(jSONObject.optString("app_version"));
                }
                if (jSONObject.has("session_timeout")) {
                    builderNewConfigBuilder.withSessionTimeout(jSONObject.getInt("session_timeout"));
                }
                builderNewConfigBuilder.withLocation(AbstractC3426c4.a(jSONObject.optString("location")));
                builderNewConfigBuilder.withPreloadInfo(AbstractC3426c4.b(jSONObject.optString("preload_info")));
                if (jSONObject.has("logs") && jSONObject.optBoolean("logs")) {
                    builderNewConfigBuilder.withLogs();
                }
                if (jSONObject.has("crash_enabled")) {
                    builderNewConfigBuilder.withCrashReporting(jSONObject.optBoolean("crash_enabled"));
                }
                if (jSONObject.has("crash_native_enabled")) {
                    builderNewConfigBuilder.withNativeCrashReporting(jSONObject.optBoolean("crash_native_enabled"));
                }
                if (jSONObject.has("location_enabled")) {
                    builderNewConfigBuilder.withLocationTracking(jSONObject.optBoolean("location_enabled"));
                }
                if (jSONObject.has("adv_identifiers_tracking")) {
                    builderNewConfigBuilder.withAdvIdentifiersTracking(jSONObject.optBoolean("adv_identifiers_tracking", true));
                }
                if (jSONObject.has("max_reports_in_db_count")) {
                    builderNewConfigBuilder.withMaxReportsInDatabaseCount(jSONObject.optInt("max_reports_in_db_count"));
                }
                if (jSONObject.has("error_environment") && (mapC2 = Bb.c(jSONObject.optString("error_environment"))) != null) {
                    for (Map.Entry entry : mapC2.entrySet()) {
                        builderNewConfigBuilder.withErrorEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (jSONObject.has("first_activation_as_update")) {
                    builderNewConfigBuilder.handleFirstActivationAsUpdate(jSONObject.optBoolean("first_activation_as_update"));
                }
                if (jSONObject.has("data_sending_enabled")) {
                    builderNewConfigBuilder.withDataSendingEnabled(jSONObject.optBoolean("data_sending_enabled"));
                }
                if (jSONObject.has("user_profile_id")) {
                    appMetricaConfig = null;
                    try {
                        builderNewConfigBuilder.withUserProfileID(jSONObject.optString("user_profile_id", null));
                    } catch (Throwable unused) {
                    }
                } else {
                    appMetricaConfig = null;
                }
                if (jSONObject.has("revenue_auto_tracking_enabled")) {
                    builderNewConfigBuilder.withRevenueAutoTrackingEnabled(jSONObject.optBoolean("revenue_auto_tracking_enabled"));
                }
                if (jSONObject.has("sessions_auto_tracking_enabled")) {
                    builderNewConfigBuilder.withSessionsAutoTrackingEnabled(jSONObject.optBoolean("sessions_auto_tracking_enabled"));
                }
                if (jSONObject.has("app_open_tracking_enabled")) {
                    builderNewConfigBuilder.withAppOpenTrackingEnabled(jSONObject.optBoolean("app_open_tracking_enabled"));
                }
                if (jSONObject.has(CommonUrlParts.DEVICE_TYPE)) {
                    builderNewConfigBuilder.withDeviceType(jSONObject.optString(CommonUrlParts.DEVICE_TYPE));
                }
                if (jSONObject.has(CommonUrlParts.APP_VERSION_CODE)) {
                    builderNewConfigBuilder.withAppBuildNumber(jSONObject.optInt(CommonUrlParts.APP_VERSION_CODE));
                }
                if (jSONObject.has("dispatch_period_seconds")) {
                    builderNewConfigBuilder.withDispatchPeriodSeconds(jSONObject.optInt("dispatch_period_seconds"));
                }
                if (jSONObject.has("max_reports_count")) {
                    builderNewConfigBuilder.withMaxReportsCount(jSONObject.optInt("max_reports_count"));
                }
                if (jSONObject.has("app_environment") && (mapC = Bb.c(jSONObject.optString("app_environment"))) != null) {
                    for (Map.Entry entry2 : mapC.entrySet()) {
                        builderNewConfigBuilder.withAppEnvironmentValue((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
                if (jSONObject.has("anr_monitoring")) {
                    builderNewConfigBuilder.withAnrMonitoring(jSONObject.optBoolean("anr_monitoring"));
                }
                if (jSONObject.has("anr_monitoring_timeout")) {
                    builderNewConfigBuilder.withAnrMonitoringTimeout(jSONObject.optInt("anr_monitoring_timeout"));
                }
                if (jSONObject.has("customHosts")) {
                    builderNewConfigBuilder.withCustomHosts(Bb.a(jSONObject.optJSONArray("customHosts")));
                }
                if (jSONObject.has("additional_config")) {
                    jSONObject.optJSONObject("additional_config");
                }
                return builderNewConfigBuilder.build();
            } catch (Throwable unused2) {
                appMetricaConfig = null;
            }
        }
        return appMetricaConfig;
    }

    public static Builder newConfigBuilder(String str) {
        return new Builder(str, 0);
    }

    public String toJson() {
        String string;
        new Y7();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apikey", this.apiKey);
            jSONObject.put("app_version", this.appVersion);
            jSONObject.put("session_timeout", this.sessionTimeout);
            jSONObject.put("location", AbstractC3426c4.a(this.location));
            PreloadInfo preloadInfo = this.preloadInfo;
            JSONArray jSONArray = null;
            if (preloadInfo == null) {
                string = null;
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("trackid", preloadInfo.getTrackingId());
                    Map<String, String> additionalParams = preloadInfo.getAdditionalParams();
                    jSONObject2.put("params", additionalParams == null ? null : new JSONObject(additionalParams));
                    string = jSONObject2.toString();
                } catch (Throwable unused) {
                    string = null;
                }
            }
            jSONObject.put("preload_info", string);
            jSONObject.put("logs", this.logs);
            jSONObject.put("crash_enabled", this.crashReporting);
            jSONObject.put("crash_native_enabled", this.nativeCrashReporting);
            jSONObject.put("location_enabled", this.locationTracking);
            jSONObject.put("adv_identifiers_tracking", this.advIdentifiersTracking);
            jSONObject.put("max_reports_in_db_count", this.maxReportsInDatabaseCount);
            Map<String, String> map = this.errorEnvironment;
            jSONObject.put("error_environment", map == null ? null : new JSONObject(map));
            jSONObject.put("first_activation_as_update", this.firstActivationAsUpdate);
            jSONObject.put("data_sending_enabled", this.dataSendingEnabled);
            jSONObject.put("user_profile_id", this.userProfileID);
            jSONObject.put("revenue_auto_tracking_enabled", this.revenueAutoTrackingEnabled);
            jSONObject.put("sessions_auto_tracking_enabled", this.sessionsAutoTrackingEnabled);
            jSONObject.put("app_open_tracking_enabled", this.appOpenTrackingEnabled);
            jSONObject.put(CommonUrlParts.DEVICE_TYPE, this.deviceType);
            jSONObject.put(CommonUrlParts.APP_VERSION_CODE, this.appBuildNumber);
            jSONObject.put("dispatch_period_seconds", this.dispatchPeriodSeconds);
            jSONObject.put("max_reports_count", this.maxReportsCount);
            Map<String, String> map2 = this.appEnvironment;
            jSONObject.put("app_environment", map2 == null ? null : new JSONObject(map2));
            jSONObject.put("anr_monitoring", this.anrMonitoring);
            jSONObject.put("anr_monitoring_timeout", this.anrMonitoringTimeout);
            List<String> list = this.customHosts;
            if (list != null) {
                if (!io.a((Collection) list)) {
                    jSONArray = new JSONArray((Collection) list);
                }
                jSONObject.put("customHosts", jSONArray);
            }
            jSONObject.put("additional_config", new JSONObject());
            return jSONObject.toString();
        } catch (Throwable unused2) {
            return "";
        }
    }

    private AppMetricaConfig(Builder builder) {
        this.apiKey = builder.f45072b;
        this.appVersion = builder.f45073c;
        this.sessionTimeout = builder.f45074d;
        this.crashReporting = builder.f45075e;
        this.nativeCrashReporting = builder.f45076f;
        this.location = builder.f45077g;
        this.locationTracking = builder.f45078h;
        this.advIdentifiersTracking = builder.f45079i;
        this.logs = builder.f45080j;
        this.preloadInfo = builder.f45081k;
        this.firstActivationAsUpdate = builder.f45082l;
        this.dataSendingEnabled = builder.f45083m;
        this.maxReportsInDatabaseCount = builder.f45084n;
        this.errorEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f45085o);
        this.userProfileID = builder.f45086p;
        this.revenueAutoTrackingEnabled = builder.f45087q;
        this.sessionsAutoTrackingEnabled = builder.f45088r;
        this.appOpenTrackingEnabled = builder.f45089s;
        this.deviceType = builder.f45090t;
        this.appBuildNumber = builder.f45091u;
        this.dispatchPeriodSeconds = builder.f45092v;
        this.maxReportsCount = builder.f45093w;
        this.appEnvironment = CollectionUtils.unmodifiableSameOrderMapCopy(builder.f45094x);
        this.crashTransformer = builder.f45095y;
        this.anrMonitoring = builder.f45096z;
        this.anrMonitoringTimeout = builder.A;
        this.customHosts = builder.B;
        this.additionalConfig = CollectionUtils.unmodifiableSameOrderMapCopy(builder.C);
    }

    protected AppMetricaConfig(AppMetricaConfig appMetricaConfig) {
        this.apiKey = appMetricaConfig.apiKey;
        this.appVersion = appMetricaConfig.appVersion;
        this.sessionTimeout = appMetricaConfig.sessionTimeout;
        this.crashReporting = appMetricaConfig.crashReporting;
        this.nativeCrashReporting = appMetricaConfig.nativeCrashReporting;
        this.location = appMetricaConfig.location;
        this.locationTracking = appMetricaConfig.locationTracking;
        this.advIdentifiersTracking = appMetricaConfig.advIdentifiersTracking;
        this.logs = appMetricaConfig.logs;
        this.preloadInfo = appMetricaConfig.preloadInfo;
        this.firstActivationAsUpdate = appMetricaConfig.firstActivationAsUpdate;
        this.dataSendingEnabled = appMetricaConfig.dataSendingEnabled;
        this.maxReportsInDatabaseCount = appMetricaConfig.maxReportsInDatabaseCount;
        this.errorEnvironment = appMetricaConfig.errorEnvironment;
        this.userProfileID = appMetricaConfig.userProfileID;
        this.revenueAutoTrackingEnabled = appMetricaConfig.revenueAutoTrackingEnabled;
        this.sessionsAutoTrackingEnabled = appMetricaConfig.sessionsAutoTrackingEnabled;
        this.appOpenTrackingEnabled = appMetricaConfig.appOpenTrackingEnabled;
        this.deviceType = appMetricaConfig.deviceType;
        this.appBuildNumber = appMetricaConfig.appBuildNumber;
        this.dispatchPeriodSeconds = appMetricaConfig.dispatchPeriodSeconds;
        this.maxReportsCount = appMetricaConfig.maxReportsCount;
        this.appEnvironment = appMetricaConfig.appEnvironment;
        this.crashTransformer = appMetricaConfig.crashTransformer;
        this.anrMonitoring = appMetricaConfig.anrMonitoring;
        this.anrMonitoringTimeout = appMetricaConfig.anrMonitoringTimeout;
        this.customHosts = appMetricaConfig.customHosts;
        this.additionalConfig = appMetricaConfig.additionalConfig;
    }
}
