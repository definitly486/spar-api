package io.appmetrica.analytics.coreutils.internal.logger;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LoggerStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static HashMap f45313a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f45314b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile PublicLogger f45315c = PublicLogger.getAnonymousInstance();

    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return f45315c;
    }

    public static PublicLogger getOrCreateMainPublicLogger(String str) {
        f45315c = getOrCreatePublicLogger(str);
        return f45315c;
    }

    public static PublicLogger getOrCreatePublicLogger(String str) {
        if (TextUtils.isEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger = (PublicLogger) f45313a.get(str);
        if (publicLogger == null) {
            synchronized (f45314b) {
                try {
                    publicLogger = (PublicLogger) f45313a.get(str);
                    if (publicLogger == null) {
                        publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                        f45313a.put(str, publicLogger);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return publicLogger;
    }

    public static void unsetPublicLoggers() {
        f45313a = new HashMap();
        f45315c = PublicLogger.getAnonymousInstance();
    }
}
