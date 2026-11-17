package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.PreloadInfo;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class If {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ef f46030a;

    public If(PreloadInfo preloadInfo, PublicLogger publicLogger, boolean z13) {
        if (preloadInfo != null) {
            if (TextUtils.isEmpty(preloadInfo.getTrackingId())) {
                publicLogger.error("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.", new Object[0]);
            } else {
                this.f46030a = new Ef(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z13, EnumC3657l8.f47648c);
            }
        }
    }
}
