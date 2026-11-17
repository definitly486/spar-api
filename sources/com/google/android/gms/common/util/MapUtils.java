package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(StringBuilder sb3, HashMap<String, String> map) {
        sb3.append("{");
        boolean z13 = true;
        for (String str : map.keySet()) {
            if (!z13) {
                sb3.append(StringUtils.COMMA);
            }
            String str2 = map.get(str);
            sb3.append("\"");
            sb3.append(str);
            sb3.append("\":");
            if (str2 == null) {
                sb3.append("null");
            } else {
                sb3.append("\"");
                sb3.append(str2);
                sb3.append("\"");
            }
            z13 = false;
        }
        sb3.append("}");
    }
}
