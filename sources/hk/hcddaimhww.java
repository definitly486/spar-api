package hk;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hcddaimhww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final String[] f40499iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final byte[] f40500zoijcleaow;

    static {
        String[] strArr = new String[93];
        for (int i13 = 0; i13 < 32; i13++) {
            strArr[i13] = "\\u" + eablkybsjg(i13 >> 12) + eablkybsjg(i13 >> 8) + eablkybsjg(i13 >> 4) + eablkybsjg(i13);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f40499iobyxmoadg = strArr;
        byte[] bArr = new byte[93];
        for (int i14 = 0; i14 < 32; i14++) {
            bArr[i14] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f40500zoijcleaow = bArr;
    }

    private static final char eablkybsjg(int i13) {
        int i14 = i13 & 15;
        return (char) (i14 < 10 ? i14 + 48 : i14 + 87);
    }

    public static final byte[] iobyxmoadg() {
        return f40500zoijcleaow;
    }

    public static final void ppxfxbqfkf(StringBuilder sb3, String value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sb3, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        sb3.append('\"');
        int length = value.length();
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = value.charAt(i14);
            String[] strArr = f40499iobyxmoadg;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb3.append((CharSequence) value, i13, i14);
                sb3.append(strArr[cCharAt]);
                i13 = i14 + 1;
            }
        }
        if (i13 != 0) {
            sb3.append((CharSequence) value, i13, value.length());
        } else {
            sb3.append(value);
        }
        sb3.append('\"');
    }

    public static final Boolean wkgbmnqykc(String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(str, "<this>");
        if (mj.kcexrzcfyt.istkbnxepw(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (mj.kcexrzcfyt.istkbnxepw(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final String[] zoijcleaow() {
        return f40499iobyxmoadg;
    }
}
