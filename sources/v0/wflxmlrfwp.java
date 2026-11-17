package v0;

import h.bfopjjpdmp;
import h.jztzpxfvev;
import h.oipsdeybqn;
import j0.ezmngbhpjk;

/* JADX INFO: loaded from: classes.dex */
public abstract class wflxmlrfwp {
    public static final long ppxfxbqfkf(long j13, float f13) {
        return (Float.isNaN(f13) || f13 >= 1.0f) ? j13 : oipsdeybqn.wflxmlrfwp(j13, oipsdeybqn.rgvfuqvkyq(j13) * f13, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float wkgbmnqykc(float f13, tg.iobyxmoadg iobyxmoadgVar) {
        return Float.isNaN(f13) ? ((Number) iobyxmoadgVar.invoke()).floatValue() : f13;
    }

    public static final rgvfuqvkyq zoijcleaow(rgvfuqvkyq rgvfuqvkyqVar, rgvfuqvkyq rgvfuqvkyqVar2, float f13) {
        boolean z13 = rgvfuqvkyqVar instanceof ppxfxbqfkf;
        if (!z13 && !(rgvfuqvkyqVar2 instanceof ppxfxbqfkf)) {
            return rgvfuqvkyq.f115018iobyxmoadg.zoijcleaow(bfopjjpdmp.gxszxtbevo(rgvfuqvkyqVar.zoijcleaow(), rgvfuqvkyqVar2.zoijcleaow(), f13));
        }
        if (!z13 || !(rgvfuqvkyqVar2 instanceof ppxfxbqfkf)) {
            return (rgvfuqvkyq) ezmngbhpjk.wkgbmnqykc(rgvfuqvkyqVar, rgvfuqvkyqVar2, f13);
        }
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) rgvfuqvkyqVar;
        ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) rgvfuqvkyqVar2;
        return rgvfuqvkyq.f115018iobyxmoadg.iobyxmoadg((jztzpxfvev) ezmngbhpjk.wkgbmnqykc(ppxfxbqfkfVar.dxjokdxxww(), ppxfxbqfkfVar2.dxjokdxxww(), f13), y0.wkgbmnqykc.zoijcleaow(ppxfxbqfkfVar.iobyxmoadg(), ppxfxbqfkfVar2.iobyxmoadg(), f13));
    }
}
