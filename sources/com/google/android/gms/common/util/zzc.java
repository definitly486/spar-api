package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class zzc {
    private static final Pattern zza = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static String zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = zza.matcher(str);
        StringBuilder sb3 = null;
        int iEnd = 0;
        while (matcher.find()) {
            if (sb3 == null) {
                sb3 = new StringBuilder();
            }
            int iStart = matcher.start();
            int i13 = iStart;
            while (i13 >= 0 && str.charAt(i13) == '\\') {
                i13--;
            }
            if ((iStart - i13) % 2 != 0) {
                int i14 = Integer.parseInt(matcher.group().substring(2), 16);
                sb3.append((CharSequence) str, iEnd, matcher.start());
                if (i14 == 92) {
                    sb3.append("\\\\");
                } else {
                    sb3.append(Character.toChars(i14));
                }
                iEnd = matcher.end();
            }
        }
        if (sb3 == null) {
            return str;
        }
        if (iEnd < matcher.regionEnd()) {
            sb3.append((CharSequence) str, iEnd, matcher.regionEnd());
        }
        return sb3.toString();
    }
}
