package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ra, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3808ra {
    public static boolean a(JSONObject jSONObject, String str, boolean z13) {
        return ((Boolean) WrapUtils.getOrDefault(jSONObject.has(str) ? Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean("enabled")) : null, Boolean.valueOf(z13))).booleanValue();
    }
}
