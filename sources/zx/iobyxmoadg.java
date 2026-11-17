package zx;

import androidx.appcompat.app.lqeggnwhkg;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import w10.gxszxtbevo;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements gxszxtbevo {

    /* JADX INFO: renamed from: zx.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C3360iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f131457iobyxmoadg;

        static {
            int[] iArr = new int[x00.iobyxmoadg.values().length];
            try {
                iArr[x00.iobyxmoadg.DARK_MODE_ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x00.iobyxmoadg.DARK_MODE_OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x00.iobyxmoadg.DARK_MODE_SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f131457iobyxmoadg = iArr;
        }
    }

    @Override // w10.gxszxtbevo
    public void iobyxmoadg(x00.iobyxmoadg darkModeState) {
        zdlpuopuiu.btonecajqb(darkModeState, "darkModeState");
        int i13 = C3360iobyxmoadg.f131457iobyxmoadg[darkModeState.ordinal()];
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
