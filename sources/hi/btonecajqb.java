package hi;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public abstract class btonecajqb {
    public static final byte[] iobyxmoadg(String[] strings) {
        zdlpuopuiu.btonecajqb(strings, "strings");
        int length = 0;
        for (String str : strings) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i13 = 0;
        for (String str2 : strings) {
            int length2 = str2.length();
            int i14 = 0;
            while (i14 < length2) {
                bArr[i13] = (byte) str2.charAt(i14);
                i14++;
                i13++;
            }
        }
        return bArr;
    }
}
