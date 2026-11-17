package com.google.android.gms.internal.identity;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzes {
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
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb3 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb3.append(name);
                    sb3.append("@");
                    sb3.append(hexString);
                    String string2 = sb3.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(string2), (Throwable) e13);
                    String name2 = e13.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(string2.length() + 8 + name2.length() + 1);
                    sb4.append("<");
                    sb4.append(string2);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    string = sb4.toString();
                }
            }
            objArr[i14] = string;
            i14++;
        }
        StringBuilder sb5 = new StringBuilder(str.length() + (length * 16));
        int i15 = 0;
        while (true) {
            length2 = objArr.length;
            if (i13 >= length2 || (iIndexOf = str.indexOf("%s", i15)) == -1) {
                break;
            }
            sb5.append((CharSequence) str, i15, iIndexOf);
            sb5.append(objArr[i13]);
            i15 = iIndexOf + 2;
            i13++;
        }
        sb5.append((CharSequence) str, i15, str.length());
        if (i13 < length2) {
            sb5.append(" [");
            sb5.append(objArr[i13]);
            for (int i16 = i13 + 1; i16 < objArr.length; i16++) {
                sb5.append(", ");
                sb5.append(objArr[i16]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }
}
