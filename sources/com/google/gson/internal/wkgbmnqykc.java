package com.google.gson.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final int f25177iobyxmoadg = iobyxmoadg();

    private static int eablkybsjg(String str) {
        try {
            String[] strArrSplit = str.split("[._]");
            int i13 = Integer.parseInt(strArrSplit[0]);
            return (i13 != 1 || strArrSplit.length <= 1) ? i13 : Integer.parseInt(strArrSplit[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private static int iobyxmoadg() {
        return ppxfxbqfkf(System.getProperty("java.version"));
    }

    static int ppxfxbqfkf(String str) {
        int iEablkybsjg = eablkybsjg(str);
        if (iEablkybsjg == -1) {
            iEablkybsjg = zoijcleaow(str);
        }
        if (iEablkybsjg == -1) {
            return 6;
        }
        return iEablkybsjg;
    }

    public static boolean wkgbmnqykc() {
        return f25177iobyxmoadg >= 9;
    }

    private static int zoijcleaow(String str) {
        try {
            StringBuilder sb3 = new StringBuilder();
            for (int i13 = 0; i13 < str.length(); i13++) {
                char cCharAt = str.charAt(i13);
                if (!Character.isDigit(cCharAt)) {
                    break;
                }
                sb3.append(cCharAt);
            }
            return Integer.parseInt(sb3.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
