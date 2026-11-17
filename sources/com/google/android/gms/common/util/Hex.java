package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@KeepForSdk
public class Hex {
    private static final char[] zza = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] zzb = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @KeepForSdk
    public static String bytesToStringLowercase(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i13 = 0;
        for (byte b13 : bArr) {
            char[] cArr2 = zzb;
            cArr[i13] = cArr2[(b13 & 255) >>> 4];
            cArr[i13 + 1] = cArr2[b13 & 15];
            i13 += 2;
        }
        return new String(cArr);
    }

    @KeepForSdk
    public static String bytesToStringUppercase(byte[] bArr) {
        return bytesToStringUppercase(bArr, false);
    }

    @KeepForSdk
    public static byte[] stringToBytes(String str) throws IllegalArgumentException {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i13 = 0;
        while (i13 < length) {
            int i14 = i13 + 2;
            bArr[i13 / 2] = (byte) Integer.parseInt(str.substring(i13, i14), 16);
            i13 = i14;
        }
        return bArr;
    }

    @KeepForSdk
    public static String bytesToStringUppercase(byte[] bArr, boolean z13) {
        int length = bArr.length;
        StringBuilder sb3 = new StringBuilder(length + length);
        for (int i13 = 0; i13 < length && (!z13 || i13 != length - 1 || (bArr[i13] & 255) != 0); i13++) {
            char[] cArr = zza;
            sb3.append(cArr[(bArr[i13] & 240) >>> 4]);
            sb3.append(cArr[bArr[i13] & 15]);
        }
        return sb3.toString();
    }
}
