package km;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes3.dex */
public class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final String f59808iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f59809ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f59810zoijcleaow;

    public zoijcleaow(String str, boolean z13, boolean z14) {
        this.f59808iobyxmoadg = str;
        this.f59810zoijcleaow = z13;
        this.f59809ppxfxbqfkf = z14;
    }

    private static int iobyxmoadg(int i13) {
        if (i13 == 1) {
            return 6;
        }
        if (i13 == 2) {
            return 4;
        }
        if (i13 == 3) {
            return 3;
        }
        if (i13 != 4) {
            return i13 != 5 ? -1 : 0;
        }
        return 1;
    }

    public String zoijcleaow(byte[] bArr) {
        int i13;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i14 = 0; i14 < (bArr.length + 4) / 5; i14++) {
            short[] sArr = new short[5];
            int i15 = 5;
            for (int i16 = 0; i16 < 5; i16++) {
                int i17 = (i14 * 5) + i16;
                if (i17 < bArr.length) {
                    sArr[i16] = (short) (bArr[i17] & 255);
                } else {
                    sArr[i16] = 0;
                    i15--;
                }
            }
            int iIobyxmoadg = iobyxmoadg(i15);
            short s13 = sArr[0];
            int i18 = (byte) ((s13 >> 3) & 31);
            short s14 = sArr[1];
            int i19 = (byte) (((s13 & 7) << 2) | ((s14 >> 6) & 3));
            int i23 = (byte) ((s14 >> 1) & 31);
            short s15 = sArr[2];
            int i24 = (byte) (((s14 & 1) << 4) | ((s15 >> 4) & 15));
            short s16 = sArr[3];
            short s17 = sArr[4];
            int[] iArr = {i18, i19, i23, i24, (byte) (((s15 & 15) << 1) | ((s16 >> 7) & 1)), (byte) ((s16 >> 2) & 31), (byte) (((s17 >> 5) & 7) | ((s16 & 3) << 3)), (byte) (s17 & 31)};
            int i25 = 0;
            while (true) {
                i13 = 8 - iIobyxmoadg;
                if (i25 >= i13) {
                    break;
                }
                char cCharAt = this.f59808iobyxmoadg.charAt(iArr[i25]);
                if (this.f59809ppxfxbqfkf) {
                    cCharAt = Character.toLowerCase(cCharAt);
                }
                byteArrayOutputStream.write(cCharAt);
                i25++;
            }
            if (this.f59810zoijcleaow) {
                while (i13 < 8) {
                    byteArrayOutputStream.write(61);
                    i13++;
                }
            }
        }
        return new String(byteArrayOutputStream.toByteArray());
    }
}
