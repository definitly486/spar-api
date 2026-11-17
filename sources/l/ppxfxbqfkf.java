package l;

import androidx.compose.ui.graphics.wkgbmnqykc;
import g.eablkybsjg;
import g.gtknphoqwx;
import g.lqeggnwhkg;
import g.nufgyqmvbu;
import gg.wwaezpbzkn;
import h.dsvhmnatus;
import h.ipoelvxyzq;
import h.metgxyhuhe;
import j.gxszxtbevo;
import kotlin.jvm.internal.jyumaefscl;
import tg.draadjrbmk;
import w0.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private ipoelvxyzq f61194iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private wkgbmnqykc f61195ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f61197zoijcleaow;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private float f61196wkgbmnqykc = 1.0f;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private zdlpuopuiu f61192eablkybsjg = zdlpuopuiu.Ltr;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final draadjrbmk f61193gxszxtbevo = new iobyxmoadg();

    static final class iobyxmoadg extends jyumaefscl implements draadjrbmk {
        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((gxszxtbevo) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            ppxfxbqfkf.this.btonecajqb(gxszxtbevoVar);
        }
    }

    private final ipoelvxyzq dxjokdxxww() {
        ipoelvxyzq ipoelvxyzqVar = this.f61194iobyxmoadg;
        if (ipoelvxyzqVar != null) {
            return ipoelvxyzqVar;
        }
        ipoelvxyzq ipoelvxyzqVarIobyxmoadg = dsvhmnatus.iobyxmoadg();
        this.f61194iobyxmoadg = ipoelvxyzqVarIobyxmoadg;
        return ipoelvxyzqVarIobyxmoadg;
    }

    private final void eablkybsjg(wkgbmnqykc wkgbmnqykcVar) {
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f61195ppxfxbqfkf, wkgbmnqykcVar)) {
            return;
        }
        if (!zoijcleaow(wkgbmnqykcVar)) {
            if (wkgbmnqykcVar == null) {
                ipoelvxyzq ipoelvxyzqVar = this.f61194iobyxmoadg;
                if (ipoelvxyzqVar != null) {
                    ipoelvxyzqVar.wkgbmnqykc(null);
                }
                this.f61197zoijcleaow = false;
            } else {
                dxjokdxxww().wkgbmnqykc(wkgbmnqykcVar);
                this.f61197zoijcleaow = true;
            }
        }
        this.f61195ppxfxbqfkf = wkgbmnqykcVar;
    }

    private final void gxszxtbevo(zdlpuopuiu zdlpuopuiuVar) {
        if (this.f61192eablkybsjg != zdlpuopuiuVar) {
            ppxfxbqfkf(zdlpuopuiuVar);
            this.f61192eablkybsjg = zdlpuopuiuVar;
        }
    }

    private final void wkgbmnqykc(float f13) {
        if (this.f61196wkgbmnqykc == f13) {
            return;
        }
        if (!iobyxmoadg(f13)) {
            if (f13 == 1.0f) {
                ipoelvxyzq ipoelvxyzqVar = this.f61194iobyxmoadg;
                if (ipoelvxyzqVar != null) {
                    ipoelvxyzqVar.eablkybsjg(f13);
                }
                this.f61197zoijcleaow = false;
            } else {
                dxjokdxxww().eablkybsjg(f13);
                this.f61197zoijcleaow = true;
            }
        }
        this.f61196wkgbmnqykc = f13;
    }

    protected abstract void btonecajqb(gxszxtbevo gxszxtbevoVar);

    protected abstract boolean iobyxmoadg(float f13);

    public final void lqeggnwhkg(gxszxtbevo gxszxtbevoVar, long j13, float f13, wkgbmnqykc wkgbmnqykcVar) {
        wkgbmnqykc(f13);
        eablkybsjg(wkgbmnqykcVar);
        gxszxtbevo(gxszxtbevoVar.getLayoutDirection());
        int i13 = (int) (j13 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (gxszxtbevoVar.zoijcleaow() >> 32)) - Float.intBitsToFloat(i13);
        int i14 = (int) (j13 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (gxszxtbevoVar.zoijcleaow() & 4294967295L)) - Float.intBitsToFloat(i14);
        gxszxtbevoVar.K().wkgbmnqykc().dxjokdxxww(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f13 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i13) > 0.0f && Float.intBitsToFloat(i14) > 0.0f) {
                    if (this.f61197zoijcleaow) {
                        long jPpxfxbqfkf = eablkybsjg.f35584zoijcleaow.ppxfxbqfkf();
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i13);
                        lqeggnwhkg lqeggnwhkgVarZoijcleaow = nufgyqmvbu.zoijcleaow(jPpxfxbqfkf, gtknphoqwx.wkgbmnqykc((((long) Float.floatToRawIntBits(Float.intBitsToFloat(i14))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)));
                        metgxyhuhe metgxyhuheVarGxszxtbevo = gxszxtbevoVar.K().gxszxtbevo();
                        try {
                            metgxyhuheVarGxszxtbevo.dxjokdxxww(lqeggnwhkgVarZoijcleaow, dxjokdxxww());
                            btonecajqb(gxszxtbevoVar);
                            metgxyhuheVarGxszxtbevo.agtfadlqog();
                        } catch (Throwable th2) {
                            metgxyhuheVarGxszxtbevo.agtfadlqog();
                            throw th2;
                        }
                    } else {
                        btonecajqb(gxszxtbevoVar);
                    }
                }
            } catch (Throwable th3) {
                gxszxtbevoVar.K().wkgbmnqykc().dxjokdxxww(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th3;
            }
        }
        gxszxtbevoVar.K().wkgbmnqykc().dxjokdxxww(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }

    public abstract long nufgyqmvbu();

    protected boolean ppxfxbqfkf(zdlpuopuiu zdlpuopuiuVar) {
        return false;
    }

    protected abstract boolean zoijcleaow(wkgbmnqykc wkgbmnqykcVar);
}
