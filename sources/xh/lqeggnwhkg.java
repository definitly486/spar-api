package xh;

import java.util.List;
import jh.yfnezrywwk;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import zi.ageimvtcrz;
import zi.auzgnhcxok;
import zi.iozdgvuglv;
import zi.iwxlajgraz;
import zi.kegysxyocb;
import zi.lmojexxdyd;
import zi.mhtqkkgtqm;
import zi.skhdrjzrfn;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends iozdgvuglv {

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f122383iobyxmoadg;

        static {
            int[] iArr = new int[ppxfxbqfkf.values().length];
            try {
                iArr[ppxfxbqfkf.FLEXIBLE_LOWER_BOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ppxfxbqfkf.FLEXIBLE_UPPER_BOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ppxfxbqfkf.INFLEXIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f122383iobyxmoadg = iArr;
        }
    }

    @Override // zi.iozdgvuglv
    public iwxlajgraz iobyxmoadg(yfnezrywwk parameter, lmojexxdyd typeAttr, auzgnhcxok typeParameterUpperBoundEraser, kegysxyocb erasedUpperBound) {
        zdlpuopuiu.btonecajqb(parameter, "parameter");
        zdlpuopuiu.btonecajqb(typeAttr, "typeAttr");
        zdlpuopuiu.btonecajqb(typeParameterUpperBoundEraser, "typeParameterUpperBoundEraser");
        zdlpuopuiu.btonecajqb(erasedUpperBound, "erasedUpperBound");
        if (!(typeAttr instanceof xh.iobyxmoadg)) {
            return super.iobyxmoadg(parameter, typeAttr, typeParameterUpperBoundEraser, erasedUpperBound);
        }
        xh.iobyxmoadg iobyxmoadgVarDraadjrbmk = (xh.iobyxmoadg) typeAttr;
        if (!iobyxmoadgVarDraadjrbmk.dxjokdxxww()) {
            iobyxmoadgVarDraadjrbmk = iobyxmoadgVarDraadjrbmk.draadjrbmk(ppxfxbqfkf.INFLEXIBLE);
        }
        int i13 = iobyxmoadg.f122383iobyxmoadg[iobyxmoadgVarDraadjrbmk.lqeggnwhkg().ordinal()];
        if (i13 == 1) {
            return new skhdrjzrfn(mhtqkkgtqm.INVARIANT, erasedUpperBound);
        }
        if (i13 != 2 && i13 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (!parameter.draadjrbmk().wkgbmnqykc()) {
            return new skhdrjzrfn(mhtqkkgtqm.INVARIANT, pi.eablkybsjg.wflxmlrfwp(parameter).wwaezpbzkn());
        }
        List parameters = erasedUpperBound.grlcpdaxtj().getParameters();
        zdlpuopuiu.dxjokdxxww(parameters, "getParameters(...)");
        if (!parameters.isEmpty()) {
            return new skhdrjzrfn(mhtqkkgtqm.OUT_VARIANCE, erasedUpperBound);
        }
        iwxlajgraz iwxlajgrazVarZdlpuopuiu = ageimvtcrz.zdlpuopuiu(parameter, iobyxmoadgVarDraadjrbmk);
        zdlpuopuiu.lqeggnwhkg(iwxlajgrazVarZdlpuopuiu);
        return iwxlajgrazVarZdlpuopuiu;
    }
}
