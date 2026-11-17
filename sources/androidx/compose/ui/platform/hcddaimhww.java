package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class hcddaimhww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static tg.draadjrbmk f6945iobyxmoadg = iobyxmoadg.f6946zdlpuopuiu;

    static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f6946zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final p0.jpowsppfya invoke(p0.jpowsppfya jpowsppfyaVar) {
            return jpowsppfyaVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void btonecajqb(float[] fArr, float f13, float f14, float[] fArr2) {
        h.hszhottldk.nufgyqmvbu(fArr2);
        h.hszhottldk.ojitshcjhn(fArr2, f13, f14, 0.0f, 4, null);
        dxjokdxxww(fArr, fArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dxjokdxxww(float[] fArr, float[] fArr2) {
        float fGxszxtbevo = gxszxtbevo(fArr2, 0, fArr, 0);
        float fGxszxtbevo2 = gxszxtbevo(fArr2, 0, fArr, 1);
        float fGxszxtbevo3 = gxszxtbevo(fArr2, 0, fArr, 2);
        float fGxszxtbevo4 = gxszxtbevo(fArr2, 0, fArr, 3);
        float fGxszxtbevo5 = gxszxtbevo(fArr2, 1, fArr, 0);
        float fGxszxtbevo6 = gxszxtbevo(fArr2, 1, fArr, 1);
        float fGxszxtbevo7 = gxszxtbevo(fArr2, 1, fArr, 2);
        float fGxszxtbevo8 = gxszxtbevo(fArr2, 1, fArr, 3);
        float fGxszxtbevo9 = gxszxtbevo(fArr2, 2, fArr, 0);
        float fGxszxtbevo10 = gxszxtbevo(fArr2, 2, fArr, 1);
        float fGxszxtbevo11 = gxszxtbevo(fArr2, 2, fArr, 2);
        float fGxszxtbevo12 = gxszxtbevo(fArr2, 2, fArr, 3);
        float fGxszxtbevo13 = gxszxtbevo(fArr2, 3, fArr, 0);
        float fGxszxtbevo14 = gxszxtbevo(fArr2, 3, fArr, 1);
        float fGxszxtbevo15 = gxszxtbevo(fArr2, 3, fArr, 2);
        float fGxszxtbevo16 = gxszxtbevo(fArr2, 3, fArr, 3);
        fArr[0] = fGxszxtbevo;
        fArr[1] = fGxszxtbevo2;
        fArr[2] = fGxszxtbevo3;
        fArr[3] = fGxszxtbevo4;
        fArr[4] = fGxszxtbevo5;
        fArr[5] = fGxszxtbevo6;
        fArr[6] = fGxszxtbevo7;
        fArr[7] = fGxszxtbevo8;
        fArr[8] = fGxszxtbevo9;
        fArr[9] = fGxszxtbevo10;
        fArr[10] = fGxszxtbevo11;
        fArr[11] = fGxszxtbevo12;
        fArr[12] = fGxszxtbevo13;
        fArr[13] = fGxszxtbevo14;
        fArr[14] = fGxszxtbevo15;
        fArr[15] = fGxszxtbevo16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean eablkybsjg(View view, View view2) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(view2, view)) {
            return false;
        }
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view) {
                return true;
            }
        }
        return false;
    }

    private static final float gxszxtbevo(float[] fArr, int i13, float[] fArr2, int i14) {
        int i15 = i13 * 4;
        return (fArr[i15] * fArr2[i14]) + (fArr[i15 + 1] * fArr2[4 + i14]) + (fArr[i15 + 2] * fArr2[8 + i14]) + (fArr[i15 + 3] * fArr2[12 + i14]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c0.ppxfxbqfkf lqeggnwhkg(View view) {
        c0.wkgbmnqykc.ppxfxbqfkf(view, 1);
        return c0.wkgbmnqykc.zoijcleaow(view);
    }

    public static final tg.draadjrbmk nufgyqmvbu() {
        return f6945iobyxmoadg;
    }
}
