package bl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pkzmftpjix {
    public static final long iobyxmoadg(String str, int i13, int i14) {
        int i15;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        if (i13 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i13).toString());
        }
        if (i14 < i13) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i14 + " < " + i13).toString());
        }
        if (i14 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i14 + " > " + str.length()).toString());
        }
        long j13 = 0;
        while (i13 < i14) {
            char cCharAt = str.charAt(i13);
            if (cCharAt < 128) {
                j13++;
            } else {
                if (cCharAt < 2048) {
                    i15 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i15 = 3;
                } else {
                    int i16 = i13 + 1;
                    char cCharAt2 = i16 < i14 ? str.charAt(i16) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j13++;
                        i13 = i16;
                    } else {
                        j13 += (long) 4;
                        i13 += 2;
                    }
                }
                j13 += (long) i15;
            }
            i13++;
        }
        return j13;
    }

    public static /* synthetic */ long zoijcleaow(String str, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = str.length();
        }
        return iobyxmoadg(str, i13, i14);
    }
}
