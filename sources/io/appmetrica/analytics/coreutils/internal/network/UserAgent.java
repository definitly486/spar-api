package io.appmetrica.analytics.coreutils.internal.network;

import android.os.Build;
import io.appmetrica.analytics.coreutils.internal.StringExtensionsKt;
import kotlin.Metadata;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\u0007"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/network/UserAgent;", "", "", "sdkName", "versionName", "buildNumber", "getFor", "core-utils_release"}, k = 1, mv = {1, 6, 0})
public final class UserAgent {
    public static final UserAgent INSTANCE = new UserAgent();

    private UserAgent() {
    }

    public static final String getFor(String sdkName, String versionName, String buildNumber) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sdkName);
        sb3.append('/');
        sb3.append(versionName);
        sb3.append('.');
        sb3.append(buildNumber);
        sb3.append(" (");
        INSTANCE.getClass();
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        if (!kcexrzcfyt.stevsuqkhv(str, str2, false, 2, null)) {
            str = str2 + ' ' + str;
        }
        sb3.append(StringExtensionsKt.replaceFirstCharWithTitleCase(str));
        sb3.append("; Android ");
        sb3.append(Build.VERSION.RELEASE);
        sb3.append(')');
        return sb3.toString();
    }
}
