package vw0;

import androidx.appcompat.app.lqeggnwhkg;
import k01.gxszxtbevo;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
public final class iobyxmoadg implements gxszxtbevo {

    /* JADX INFO: renamed from: vw0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C2934iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f118135iobyxmoadg;

        static {
            int[] iArr = new int[oz0.iobyxmoadg.values().length];
            try {
                iArr[oz0.iobyxmoadg.DARK_MODE_ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[oz0.iobyxmoadg.DARK_MODE_OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[oz0.iobyxmoadg.DARK_MODE_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f118135iobyxmoadg = iArr;
        }
    }

    @Override // k01.gxszxtbevo
    public void iobyxmoadg(oz0.iobyxmoadg darkModeState) {
        zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
        int i13 = C2934iobyxmoadg.f118135iobyxmoadg[darkModeState.ordinal()];
        int i14 = 2;
        if (i13 != 1) {
            if (i13 == 2) {
                i14 = 1;
            } else {
                if (i13 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i14 = -1;
            }
        }
        lqeggnwhkg.cllcsxoeiz(i14);
    }
}
