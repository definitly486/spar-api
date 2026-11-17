package m32;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final C1358iobyxmoadg f65090iobyxmoadg = new C1358iobyxmoadg(null);

    /* JADX INFO: renamed from: m32.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C1358iobyxmoadg {
        public /* synthetic */ C1358iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1358iobyxmoadg() {
        }
    }

    public final String iobyxmoadg(String rawMatrixCode) {
        zdlpuopuiu.btonecajqb(rawMatrixCode, "rawMatrixCode");
        Character chU = kcexrzcfyt.u(rawMatrixCode);
        if (chU == null || chU.charValue() != 29) {
            return rawMatrixCode;
        }
        String strSubstring = rawMatrixCode.substring(1);
        zdlpuopuiu.dxjokdxxww(strSubstring, "substring(...)");
        return strSubstring;
    }
}
