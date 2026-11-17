package ip1;

import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final C1047iobyxmoadg f49154iobyxmoadg = new C1047iobyxmoadg(null);

    /* JADX INFO: renamed from: ip1.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C1047iobyxmoadg {
        public /* synthetic */ C1047iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private C1047iobyxmoadg() {
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
