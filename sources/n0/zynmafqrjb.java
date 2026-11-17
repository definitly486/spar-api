package n0;

import android.graphics.Typeface;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class zynmafqrjb {
    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    public static final Object iobyxmoadg(int i13, Object obj, draadjrbmk draadjrbmkVar, yadqdtsiqt yadqdtsiqtVar, int i14) {
        boolean z13;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z14 = false;
        if (!pmvmpeiblj.gtknphoqwx(i13) || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(draadjrbmkVar.zoijcleaow(), yadqdtsiqtVar)) {
            z13 = false;
        } else {
            yadqdtsiqt.iobyxmoadg iobyxmoadgVar = yadqdtsiqt.f68367yggfygwlhe;
            if (yadqdtsiqtVar.compareTo(gxszxtbevo.iobyxmoadg(iobyxmoadgVar)) < 0 || draadjrbmkVar.zoijcleaow().compareTo(gxszxtbevo.iobyxmoadg(iobyxmoadgVar)) >= 0) {
                z13 = false;
            } else {
                z13 = true;
            }
        }
        boolean z15 = pmvmpeiblj.btonecajqb(i13) && !lereixgezr.gxszxtbevo(i14, draadjrbmkVar.ppxfxbqfkf());
        if (!z15 && !z13) {
            return obj;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return jlmebxxoox.f68272iobyxmoadg.iobyxmoadg((Typeface) obj, z13 ? yadqdtsiqtVar.dxjokdxxww() : draadjrbmkVar.zoijcleaow().dxjokdxxww(), z15 ? lereixgezr.gxszxtbevo(i14, lereixgezr.f68283zoijcleaow.iobyxmoadg()) : lereixgezr.gxszxtbevo(draadjrbmkVar.ppxfxbqfkf(), lereixgezr.f68283zoijcleaow.iobyxmoadg()));
        }
        if (z15 && lereixgezr.gxszxtbevo(i14, lereixgezr.f68283zoijcleaow.iobyxmoadg())) {
            z14 = true;
        }
        return Typeface.create((Typeface) obj, gxszxtbevo.zoijcleaow(z13, z14));
    }
}
