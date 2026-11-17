package km;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final char[] f59807iobyxmoadg = "0123456789ABCDEF".toCharArray();

    public static String iobyxmoadg(String str, byte[] bArr) {
        return zoijcleaow(str, bArr, 0, bArr.length);
    }

    public static String zoijcleaow(String str, byte[] bArr, int i13, int i14) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(i14);
        sb3.append("b");
        if (str != null) {
            sb3.append(" (");
            sb3.append(str);
            sb3.append(")");
        }
        sb3.append(':');
        int length = (sb3.toString().length() + 8) & (-8);
        sb3.append('\t');
        int i15 = (80 - length) / 3;
        for (int i16 = 0; i16 < i14; i16++) {
            if (i16 != 0 && i16 % i15 == 0) {
                sb3.append('\n');
                for (int i17 = 0; i17 < length / 8; i17++) {
                    sb3.append('\t');
                }
            }
            byte b13 = bArr[i16 + i13];
            char[] cArr = f59807iobyxmoadg;
            sb3.append(cArr[(b13 & 255) >> 4]);
            sb3.append(cArr[b13 & 15]);
            sb3.append(' ');
        }
        sb3.append('\n');
        return sb3.toString();
    }
}
