package te;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public enum ppxfxbqfkf {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");


    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final String[] f110326yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int[] f110327zdlpuopuiu;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private static final Map f110317sopmlzcsov = new HashMap();

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private static final Map f110299crxdokpmqz = new HashMap();

    static {
        for (ppxfxbqfkf ppxfxbqfkfVar : values()) {
            for (int i13 : ppxfxbqfkfVar.f110327zdlpuopuiu) {
                f110317sopmlzcsov.put(Integer.valueOf(i13), ppxfxbqfkfVar);
            }
            f110299crxdokpmqz.put(ppxfxbqfkfVar.name(), ppxfxbqfkfVar);
            for (String str : ppxfxbqfkfVar.f110326yggfygwlhe) {
                f110299crxdokpmqz.put(str, ppxfxbqfkfVar);
            }
        }
    }

    ppxfxbqfkf(int i13) {
        this(new int[]{i13}, new String[0]);
    }

    public static ppxfxbqfkf iobyxmoadg(String str) {
        return (ppxfxbqfkf) f110299crxdokpmqz.get(str);
    }

    public int wkgbmnqykc() {
        return this.f110327zdlpuopuiu[0];
    }

    ppxfxbqfkf(int i13, String... strArr) {
        this.f110327zdlpuopuiu = new int[]{i13};
        this.f110326yggfygwlhe = strArr;
    }

    ppxfxbqfkf(int[] iArr, String... strArr) {
        this.f110327zdlpuopuiu = iArr;
        this.f110326yggfygwlhe = strArr;
    }
}
