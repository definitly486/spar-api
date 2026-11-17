package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3460dc {
    public static List a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? AbstractC3485ec.a(configuration) : hg.jyumaefscl.eablkybsjg(Ue.a(configuration.locale));
    }
}
