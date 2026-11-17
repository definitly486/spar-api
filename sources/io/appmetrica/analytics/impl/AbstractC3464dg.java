package io.appmetrica.analytics.impl;

import android.text.TextUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3464dg {
    public static final String a(C4007z9 c4007z9) {
        String string;
        StringBuilder sb3 = new StringBuilder("Event sent: ");
        int i13 = c4007z9.f48580c;
        String str = c4007z9.f48581d;
        byte[] bArr = c4007z9.f48582e;
        if (i13 == 1) {
            string = "Attribution";
        } else if (i13 == 2) {
            string = "Session start";
        } else if (i13 == 4) {
            if (str == null) {
                str = "null";
            }
            StringBuilder sb4 = new StringBuilder(str);
            if (bArr != null) {
                String str2 = new String(bArr, mj.wkgbmnqykc.f67326zoijcleaow);
                if (!TextUtils.isEmpty(str2)) {
                    sb4.append(" with value ");
                    sb4.append(str2);
                }
            }
            string = sb4.toString();
        } else if (i13 == 5) {
            string = "Referrer";
        } else if (i13 == 7) {
            string = "Session heartbeat";
        } else if (i13 == 13) {
            string = "The very first event";
        } else if (i13 == 35) {
            string = "E-Commerce";
        } else if (i13 == 40) {
            string = "Ad revenue (ILRD)";
        } else if (i13 == 42) {
            string = "External attribution";
        } else if (i13 == 16) {
            string = "Open";
        } else if (i13 == 17) {
            string = "Update";
        } else if (i13 == 20) {
            string = "User profile update";
        } else if (i13 != 21) {
            switch (i13) {
                case C4007z9.F /* 25 */:
                    string = "ANR";
                    break;
                case C4007z9.G /* 26 */:
                    string = "Crash: " + str;
                    break;
                case 27:
                    string = "Error: " + str;
                    break;
                default:
                    string = "type=" + i13;
                    break;
            }
        } else {
            string = "Revenue";
        }
        sb3.append(string);
        return sb3.toString();
    }

    public static final String a(String str, EnumC3934wb enumC3934wb, String str2, String str3) {
        if (!R9.f46444d.contains(EnumC3934wb.a(enumC3934wb.f48324a))) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(": ");
        sb3.append(enumC3934wb.name());
        if (R9.f46446f.contains(enumC3934wb) && !TextUtils.isEmpty(str2)) {
            sb3.append(" with name ");
            sb3.append(str2);
        }
        if (R9.f46445e.contains(enumC3934wb) && !TextUtils.isEmpty(str3)) {
            sb3.append(" with value ");
            sb3.append(str3);
        }
        return sb3.toString();
    }
}
