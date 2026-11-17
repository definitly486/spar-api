package com.google.android.datatransport.cct;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eablkybsjg {
    static String iobyxmoadg(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb3 = new StringBuilder(str.length() + str2.length());
        for (int i13 = 0; i13 < str.length(); i13++) {
            sb3.append(str.charAt(i13));
            if (str2.length() > i13) {
                sb3.append(str2.charAt(i13));
            }
        }
        return sb3.toString();
    }
}
