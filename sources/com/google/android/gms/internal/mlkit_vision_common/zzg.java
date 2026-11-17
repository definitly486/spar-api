package com.google.android.gms.internal.mlkit_vision_common;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzg {
    public static String zza(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            length = objArr.length;
            if (i14 >= length) {
                break;
            }
            Object obj = objArr[i14];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e13) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e13);
                    string = "<" + str2 + " threw " + e13.getClass().getName() + ">";
                }
            }
            objArr[i14] = string;
            i14++;
        }
        StringBuilder sb3 = new StringBuilder(str.length() + (length * 16));
        int i15 = 0;
        while (true) {
            length2 = objArr.length;
            if (i13 >= length2 || (iIndexOf = str.indexOf("%s", i15)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i15, iIndexOf);
            sb3.append(objArr[i13]);
            i15 = iIndexOf + 2;
            i13++;
        }
        sb3.append((CharSequence) str, i15, str.length());
        if (i13 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i13]);
            for (int i16 = i13 + 1; i16 < objArr.length; i16++) {
                sb3.append(", ");
                sb3.append(objArr[i16]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static boolean zzb(String str) {
        return zze.zza(str);
    }
}
