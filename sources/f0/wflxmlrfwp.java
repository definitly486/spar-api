package f0;

import g0.agtfadlqog;
import g0.cqumvgiudr;
import g0.esjtqupxsv;
import g0.zdlpuopuiu;
import java.util.List;
import kotlin.KotlinNothingValueException;
import tg.rgvfuqvkyq;
import w0.vdvldrhtss;
import z.xrmfcynszj;

/* JADX INFO: loaded from: classes.dex */
public abstract class wflxmlrfwp {
    static /* synthetic */ void eablkybsjg(zdlpuopuiu zdlpuopuiuVar, int i13, tg.draadjrbmk draadjrbmkVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        wkgbmnqykc(zdlpuopuiuVar, i13, draadjrbmkVar);
    }

    private static final boolean iobyxmoadg(zdlpuopuiu zdlpuopuiuVar) {
        rgvfuqvkyq rgvfuqvkyqVarPpxfxbqfkf = ppxfxbqfkf(zdlpuopuiuVar);
        g0.btonecajqb btonecajqbVar = (g0.btonecajqb) agtfadlqog.iobyxmoadg(zdlpuopuiuVar.esjtqupxsv(), esjtqupxsv.f35662iobyxmoadg.dsvhmnatus());
        return (rgvfuqvkyqVarPpxfxbqfkf == null || btonecajqbVar == null || ((Number) btonecajqbVar.iobyxmoadg().invoke()).floatValue() <= 0.0f) ? false : true;
    }

    public static final rgvfuqvkyq ppxfxbqfkf(zdlpuopuiu zdlpuopuiuVar) {
        return (rgvfuqvkyq) agtfadlqog.iobyxmoadg(zdlpuopuiuVar.esjtqupxsv(), g0.draadjrbmk.f35622iobyxmoadg.jyumaefscl());
    }

    private static final void wkgbmnqykc(zdlpuopuiu zdlpuopuiuVar, int i13, tg.draadjrbmk draadjrbmkVar) {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new zdlpuopuiu[16], 0);
        List listZoijcleaow = zoijcleaow(zdlpuopuiuVar);
        while (true) {
            ppxfxbqfkfVar.eablkybsjg(ppxfxbqfkfVar.draadjrbmk(), listZoijcleaow);
            while (ppxfxbqfkfVar.draadjrbmk() != 0) {
                zdlpuopuiu zdlpuopuiuVar2 = (zdlpuopuiu) ppxfxbqfkfVar.oxmwwwfdhm(ppxfxbqfkfVar.draadjrbmk() - 1);
                if (!cqumvgiudr.ppxfxbqfkf(zdlpuopuiuVar2) && !zdlpuopuiuVar2.esjtqupxsv().ppxfxbqfkf(esjtqupxsv.f35662iobyxmoadg.gxszxtbevo())) {
                    xrmfcynszj xrmfcynszjVarGxszxtbevo = zdlpuopuiuVar2.gxszxtbevo();
                    if (xrmfcynszjVarGxszxtbevo == null) {
                        w.iobyxmoadg.ppxfxbqfkf("Expected semantics node to have a coordinator.");
                        throw new KotlinNothingValueException();
                    }
                    x.rgvfuqvkyq rgvfuqvkyqVarPmvmpeiblj = xrmfcynszjVarGxszxtbevo.pmvmpeiblj();
                    w0.rgvfuqvkyq rgvfuqvkyqVarZoijcleaow = vdvldrhtss.zoijcleaow(x.vdvldrhtss.ppxfxbqfkf(rgvfuqvkyqVarPmvmpeiblj));
                    if (rgvfuqvkyqVarZoijcleaow.draadjrbmk()) {
                        continue;
                    } else if (iobyxmoadg(zdlpuopuiuVar2)) {
                        int i14 = i13 + 1;
                        draadjrbmkVar.invoke(new draadjrbmk(zdlpuopuiuVar2, i14, rgvfuqvkyqVarZoijcleaow, rgvfuqvkyqVarPmvmpeiblj));
                        wkgbmnqykc(zdlpuopuiuVar2, i14, draadjrbmkVar);
                    } else {
                        listZoijcleaow = zoijcleaow(zdlpuopuiuVar2);
                    }
                }
            }
            return;
        }
    }

    private static final List zoijcleaow(zdlpuopuiu zdlpuopuiuVar) {
        return zdlpuopuiuVar.agtfadlqog(false, false, false);
    }
}
