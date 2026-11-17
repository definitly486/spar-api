package io.appmetrica.analytics.networktasks.internal;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* JADX INFO: loaded from: classes3.dex */
public class BaseRequestConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f48813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SdkEnvironment f48814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SdkIdentifiers f48815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppSetId f48816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RetryPolicyConfig f48817e;

    public static abstract class BaseRequestArguments<I, O> implements ArgumentsMerger<I, O> {
    }

    public static abstract class ComponentLoader<T extends BaseRequestConfig, A extends BaseRequestArguments, D extends DataSource<A>> implements RequestConfigLoader<T, D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f48818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f48819b;

        protected ComponentLoader(Context context, String str) {
            this.f48818a = context;
            this.f48819b = str;
        }

        protected abstract T createBlankConfig();

        public Context getContext() {
            return this.f48818a;
        }

        public String getPackageName() {
            return this.f48819b;
        }

        @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
        public T load(D d13) {
            T t13 = (T) createBlankConfig();
            t13.setSdkIdentifiers(d13.sdkIdentifiers);
            t13.setSdkEnvironment(d13.sdkEnvironmentProvider.getSdkEnvironment());
            t13.setAppSetId(d13.platformIdentifiers.getAppSetIdProvider().getAppSetId());
            t13.setPackageName(this.f48819b);
            return t13;
        }
    }

    public static class DataSource<A> {
        public final A componentArguments;
        public final PlatformIdentifiers platformIdentifiers;
        public final SdkEnvironmentProvider sdkEnvironmentProvider;
        public final SdkIdentifiers sdkIdentifiers;

        public DataSource(SdkIdentifiers sdkIdentifiers, SdkEnvironmentProvider sdkEnvironmentProvider, PlatformIdentifiers platformIdentifiers, A a13) {
            this.sdkIdentifiers = sdkIdentifiers;
            this.componentArguments = a13;
            this.sdkEnvironmentProvider = sdkEnvironmentProvider;
            this.platformIdentifiers = platformIdentifiers;
        }
    }

    public interface RequestConfigLoader<T extends BaseRequestConfig, D> {
        T load(D d13);
    }

    protected BaseRequestConfig() {
    }

    public String getAnalyticsSdkBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f48814b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildNumber();
    }

    public String getAnalyticsSdkBuildType() {
        SdkEnvironment sdkEnvironment = this.f48814b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildType();
    }

    public String getAnalyticsSdkVersionName() {
        SdkEnvironment sdkEnvironment = this.f48814b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkVersionName();
    }

    public String getAppBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f48814b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppBuildNumber();
    }

    public String getAppFramework() {
        SdkEnvironment sdkEnvironment = this.f48814b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppFramework();
    }

    public String getAppPlatform() {
        return ConstantDeviceInfo.APP_PLATFORM;
    }

    public synchronized String getAppSetId() {
        AppSetId appSetId;
        try {
            appSetId = this.f48816d;
        } catch (Throwable th2) {
            throw th2;
        }
        return (appSetId == null || appSetId.getId() == null) ? "" : this.f48816d.getId();
    }

    public synchronized String getAppSetIdScope() {
        AppSetId appSetId;
        try {
            appSetId = this.f48816d;
        } catch (Throwable th2) {
            throw th2;
        }
        return appSetId == null ? "" : appSetId.getScope().getValue();
    }

    public String getAppVersion() {
        SdkEnvironment sdkEnvironment = this.f48814b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppVersionName();
    }

    public synchronized String getDeviceIDHash() {
        String deviceIdHash;
        deviceIdHash = "";
        SdkIdentifiers sdkIdentifiers = this.f48815c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceIdHash() != null) {
            deviceIdHash = this.f48815c.getDeviceIdHash();
        }
        return deviceIdHash;
    }

    public synchronized String getDeviceId() {
        String deviceId;
        deviceId = "";
        SdkIdentifiers sdkIdentifiers = this.f48815c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceId() != null) {
            deviceId = this.f48815c.getDeviceId();
        }
        return deviceId;
    }

    public String getDeviceRootStatus() {
        return ConstantDeviceInfo.DEVICE_ROOT_STATUS;
    }

    public String getDeviceType() {
        SdkEnvironment sdkEnvironment = this.f48814b;
        return sdkEnvironment != null ? sdkEnvironment.getDeviceType() : "phone";
    }

    public String getLocale() {
        String str;
        SdkEnvironment sdkEnvironment = this.f48814b;
        return (sdkEnvironment == null || (str = (String) CollectionUtils.getFirstOrNull(sdkEnvironment.getLocales())) == null) ? "" : str;
    }

    public String getManufacturer() {
        return (String) WrapUtils.getOrDefault(ConstantDeviceInfo.MANUFACTURER, "");
    }

    public String getModel() {
        return ConstantDeviceInfo.MODEL;
    }

    public int getOsApiLevel() {
        return ConstantDeviceInfo.OS_API_LEVEL;
    }

    public String getOsVersion() {
        return ConstantDeviceInfo.OS_VERSION;
    }

    public String getPackageName() {
        return this.f48813a;
    }

    public String getProtocolVersion() {
        return "2";
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f48817e;
    }

    public float getScaleFactor() {
        SdkEnvironment sdkEnvironment = this.f48814b;
        if (sdkEnvironment == null) {
            return 0.0f;
        }
        return sdkEnvironment.getScreenInfo().getScaleFactor();
    }

    public int getScreenDpi() {
        SdkEnvironment sdkEnvironment = this.f48814b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getDpi();
    }

    public int getScreenHeight() {
        SdkEnvironment sdkEnvironment = this.f48814b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getHeight();
    }

    public int getScreenWidth() {
        SdkEnvironment sdkEnvironment = this.f48814b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getWidth();
    }

    public synchronized String getUuid() {
        String uuid;
        uuid = "";
        SdkIdentifiers sdkIdentifiers = this.f48815c;
        if (sdkIdentifiers != null && sdkIdentifiers.getUuid() != null) {
            uuid = this.f48815c.getUuid();
        }
        return uuid;
    }

    public synchronized boolean isIdentifiersValid() {
        SdkIdentifiers sdkIdentifiers;
        String uuid;
        String deviceId;
        String deviceIdHash;
        sdkIdentifiers = this.f48815c;
        return (sdkIdentifiers == null || (uuid = sdkIdentifiers.getUuid()) == null || uuid.length() == 0 || (deviceId = sdkIdentifiers.getDeviceId()) == null || deviceId.length() == 0 || (deviceIdHash = sdkIdentifiers.getDeviceIdHash()) == null || deviceIdHash.length() == 0) ? false : true;
    }

    protected void setAppSetId(AppSetId appSetId) {
        this.f48816d = appSetId;
    }

    protected void setPackageName(String str) {
        this.f48813a = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setRetryPolicyConfig(RetryPolicyConfig retryPolicyConfig) {
        this.f48817e = retryPolicyConfig;
    }

    protected void setSdkEnvironment(SdkEnvironment sdkEnvironment) {
        this.f48814b = sdkEnvironment;
    }

    protected void setSdkIdentifiers(SdkIdentifiers sdkIdentifiers) {
        this.f48815c = sdkIdentifiers;
    }

    public String toString() {
        return "BaseRequestConfig{mPackageName='" + this.f48813a + "', sdkEnvironment=" + this.f48814b + ", mProtocolVersion='2', sdkIdentifiers=" + this.f48815c + ", retryPolicyConfig=" + this.f48817e + '}';
    }
}
