package jztzpxfvev;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class lqeggnwhkg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final a f52799iobyxmoadg = androidx.compose.runtime.lmojexxdyd.dxjokdxxww(new tg.draadjrbmk() { // from class: jztzpxfvev.gxszxtbevo
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return lqeggnwhkg.zoijcleaow((androidx.compose.runtime.cdpycssgdh) obj);
        }
    });

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final eablkybsjg f52800zoijcleaow = new iobyxmoadg();

    public static final class iobyxmoadg implements eablkybsjg {

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final float f52801ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final float f52802zoijcleaow = 0.3f;

        iobyxmoadg() {
        }

        @Override // jztzpxfvev.eablkybsjg
        public float iobyxmoadg(float f13, float f14, float f15) {
            float fAbs = Math.abs((f14 + f13) - f13);
            boolean z13 = fAbs <= f15;
            float f16 = (this.f52802zoijcleaow * f15) - (this.f52801ppxfxbqfkf * fAbs);
            float f17 = f15 - f16;
            if (z13 && f17 < fAbs) {
                f16 = f15 - fAbs;
            }
            return f13 - f16;
        }
    }

    public static final a ppxfxbqfkf() {
        return f52799iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eablkybsjg zoijcleaow(androidx.compose.runtime.cdpycssgdh cdpycssgdhVar) {
        return !((Context) cdpycssgdhVar.yggfygwlhe(AndroidCompositionLocals_androidKt.lqeggnwhkg())).getPackageManager().hasSystemFeature("android.software.leanback") ? eablkybsjg.f52666iobyxmoadg.zoijcleaow() : f52800zoijcleaow;
    }
}
