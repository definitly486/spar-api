package km;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {
    public static String iobyxmoadg(byte[] bArr, int i13, String str, boolean z13) {
        String strZoijcleaow = zoijcleaow(bArr);
        StringBuilder sb3 = new StringBuilder();
        int i14 = 0;
        while (i14 < strZoijcleaow.length()) {
            sb3.append(str);
            int i15 = i14 + i13;
            if (i15 >= strZoijcleaow.length()) {
                sb3.append(strZoijcleaow.substring(i14));
                if (z13) {
                    sb3.append(" )");
                }
            } else {
                sb3.append((CharSequence) strZoijcleaow, i14, i15);
                sb3.append("\n");
            }
            i14 = i15;
        }
        return sb3.toString();
    }

    public static String ppxfxbqfkf(byte[] bArr, boolean z13) {
        String str = z13 ? "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_" : "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i13 = 0; i13 < (bArr.length + 2) / 3; i13++) {
            short[] sArr = new short[3];
            short[] sArr2 = new short[4];
            for (int i14 = 0; i14 < 3; i14++) {
                int i15 = (i13 * 3) + i14;
                if (i15 < bArr.length) {
                    sArr[i14] = (short) (bArr[i15] & 255);
                } else {
                    sArr[i14] = -1;
                }
            }
            sArr2[0] = (short) (sArr[0] >> 2);
            short s13 = sArr[1];
            if (s13 == -1) {
                sArr2[1] = (short) ((sArr[0] & 3) << 4);
            } else {
                sArr2[1] = (short) (((sArr[0] & 3) << 4) + (s13 >> 4));
            }
            short s14 = sArr[1];
            if (s14 == -1) {
                sArr2[3] = 64;
                sArr2[2] = 64;
            } else {
                short s15 = sArr[2];
                if (s15 == -1) {
                    sArr2[2] = (short) ((s14 & 15) << 2);
                    sArr2[3] = 64;
                } else {
                    sArr2[2] = (short) (((s14 & 15) << 2) + (s15 >> 6));
                    sArr2[3] = (short) (sArr[2] & 63);
                }
            }
            for (int i16 = 0; i16 < 4; i16++) {
                short s16 = sArr2[i16];
                if (s16 != 64 || !z13) {
                    byteArrayOutputStream.write(str.charAt(s16));
                }
            }
        }
        return new String(byteArrayOutputStream.toByteArray());
    }

    public static String zoijcleaow(byte[] bArr) {
        return ppxfxbqfkf(bArr, false);
    }
}
