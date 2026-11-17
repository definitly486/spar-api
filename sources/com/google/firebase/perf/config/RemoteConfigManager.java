package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, pd.draadjrbmk> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final cqumvgiudr cache;
    private final Executor executor;
    private com.google.firebase.remoteconfig.iobyxmoadg firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private tc.zoijcleaow firebaseRemoteConfigProvider;
    private static final gd.iobyxmoadg logger = gd.iobyxmoadg.eablkybsjg();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(cqumvgiudr.eablkybsjg(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, 5000 + ((long) new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS)), getInitialStartupMillis());
    }

    static long getInitialStartupMillis() {
        com.google.firebase.agtfadlqog agtfadlqogVar;
        try {
            agtfadlqogVar = (com.google.firebase.agtfadlqog) com.google.firebase.gxszxtbevo.draadjrbmk().btonecajqb(com.google.firebase.agtfadlqog.class);
        } catch (IllegalStateException unused) {
            logger.iobyxmoadg("Unable to get StartupTime instance.");
            agtfadlqogVar = null;
        }
        return agtfadlqogVar != null ? agtfadlqogVar.ppxfxbqfkf() : System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private pd.draadjrbmk getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        pd.draadjrbmk draadjrbmkVar = this.allRcConfigMap.get(str);
        if (draadjrbmkVar.lqeggnwhkg() != 2) {
            return null;
        }
        logger.zoijcleaow("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", draadjrbmkVar.iobyxmoadg(), str);
        return draadjrbmkVar;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j13) {
        return j13 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j13) {
        return j13 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.btonecajqb());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.gtknphoqwx("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.dxjokdxxww().addOnSuccessListener(this.executor, new OnSuccessListener() { // from class: com.google.firebase.perf.config.esjtqupxsv
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f24565iobyxmoadg.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
            }
        }).addOnFailureListener(this.executor, new OnFailureListener() { // from class: com.google.firebase.perf.config.lereixgezr
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f24577iobyxmoadg.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
            }
        });
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.btonecajqb());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public md.lqeggnwhkg getBoolean(String str) {
        if (str == null) {
            logger.iobyxmoadg("The key to get Remote Config boolean value is null.");
            return md.lqeggnwhkg.iobyxmoadg();
        }
        pd.draadjrbmk remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return md.lqeggnwhkg.eablkybsjg(Boolean.valueOf(remoteConfigValue.zoijcleaow()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.iobyxmoadg().isEmpty()) {
                    logger.zoijcleaow("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.iobyxmoadg(), str);
                }
            }
        }
        return md.lqeggnwhkg.iobyxmoadg();
    }

    protected long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public md.lqeggnwhkg getDouble(String str) {
        if (str == null) {
            logger.iobyxmoadg("The key to get Remote Config double value is null.");
            return md.lqeggnwhkg.iobyxmoadg();
        }
        pd.draadjrbmk remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return md.lqeggnwhkg.eablkybsjg(Double.valueOf(remoteConfigValue.wkgbmnqykc()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.iobyxmoadg().isEmpty()) {
                    logger.zoijcleaow("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.iobyxmoadg(), str);
                }
            }
        }
        return md.lqeggnwhkg.iobyxmoadg();
    }

    public md.lqeggnwhkg getLong(String str) {
        if (str == null) {
            logger.iobyxmoadg("The key to get Remote Config long value is null.");
            return md.lqeggnwhkg.iobyxmoadg();
        }
        pd.draadjrbmk remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return md.lqeggnwhkg.eablkybsjg(Long.valueOf(remoteConfigValue.ppxfxbqfkf()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.iobyxmoadg().isEmpty()) {
                    logger.zoijcleaow("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.iobyxmoadg(), str);
                }
            }
        }
        return md.lqeggnwhkg.iobyxmoadg();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t13) {
        Object objValueOf;
        pd.draadjrbmk remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue == null) {
            return t13;
        }
        try {
            if (t13 instanceof Boolean) {
                objValueOf = Boolean.valueOf(remoteConfigValue.zoijcleaow());
            } else if (t13 instanceof Double) {
                objValueOf = Double.valueOf(remoteConfigValue.wkgbmnqykc());
            } else if ((t13 instanceof Long) || (t13 instanceof Integer)) {
                objValueOf = Long.valueOf(remoteConfigValue.ppxfxbqfkf());
            } else {
                if (!(t13 instanceof String)) {
                    T t14 = (T) remoteConfigValue.iobyxmoadg();
                    try {
                        logger.zoijcleaow("No matching type found for the defaultValue: '%s', using String.", t13);
                        return t14;
                    } catch (IllegalArgumentException unused) {
                        t13 = t14;
                        if (remoteConfigValue.iobyxmoadg().isEmpty()) {
                            return t13;
                        }
                        logger.zoijcleaow("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.iobyxmoadg(), str);
                        return t13;
                    }
                }
                objValueOf = remoteConfigValue.iobyxmoadg();
            }
            return (T) objValueOf;
        } catch (IllegalArgumentException unused2) {
        }
    }

    public md.lqeggnwhkg getString(String str) {
        if (str == null) {
            logger.iobyxmoadg("The key to get Remote Config String value is null.");
            return md.lqeggnwhkg.iobyxmoadg();
        }
        pd.draadjrbmk remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? md.lqeggnwhkg.eablkybsjg(remoteConfigValue.iobyxmoadg()) : md.lqeggnwhkg.iobyxmoadg();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        tc.zoijcleaow zoijcleaowVar;
        com.google.firebase.remoteconfig.ppxfxbqfkf ppxfxbqfkfVar;
        if (this.firebaseRemoteConfig == null && (zoijcleaowVar = this.firebaseRemoteConfigProvider) != null && (ppxfxbqfkfVar = (com.google.firebase.remoteconfig.ppxfxbqfkf) zoijcleaowVar.get()) != null) {
            this.firebaseRemoteConfig = ppxfxbqfkfVar.eablkybsjg(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        com.google.firebase.remoteconfig.iobyxmoadg iobyxmoadgVar = this.firebaseRemoteConfig;
        return iobyxmoadgVar == null || iobyxmoadgVar.gtknphoqwx().iobyxmoadg() == 1 || this.firebaseRemoteConfig.gtknphoqwx().iobyxmoadg() == 2;
    }

    public void setFirebaseRemoteConfigProvider(tc.zoijcleaow zoijcleaowVar) {
        this.firebaseRemoteConfigProvider = zoijcleaowVar;
    }

    protected void syncConfigValues(Map<String, pd.draadjrbmk> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        wkgbmnqykc wkgbmnqykcVarEablkybsjg = wkgbmnqykc.eablkybsjg();
        pd.draadjrbmk draadjrbmkVar = this.allRcConfigMap.get(wkgbmnqykcVarEablkybsjg.ppxfxbqfkf());
        if (draadjrbmkVar == null) {
            logger.iobyxmoadg("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.wflxmlrfwp(wkgbmnqykcVarEablkybsjg.iobyxmoadg(), draadjrbmkVar.zoijcleaow());
        } catch (Exception unused) {
            logger.iobyxmoadg("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    RemoteConfigManager(cqumvgiudr cqumvgiudrVar, Executor executor, com.google.firebase.remoteconfig.iobyxmoadg iobyxmoadgVar, long j13, long j14) {
        ConcurrentHashMap<String, pd.draadjrbmk> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = cqumvgiudrVar;
        this.executor = executor;
        this.firebaseRemoteConfig = iobyxmoadgVar;
        if (iobyxmoadgVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>((Map<? extends String, ? extends pd.draadjrbmk>) iobyxmoadgVar.btonecajqb());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j14;
        this.appStartConfigFetchDelayInMs = j13;
    }
}
