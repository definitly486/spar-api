package u0;

import android.graphics.Paint;
import h.g;
import h.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class eablkybsjg {
    public static final Paint.Cap iobyxmoadg(int i13) {
        g.iobyxmoadg iobyxmoadgVar = g.f38891iobyxmoadg;
        if (g.eablkybsjg(i13, iobyxmoadgVar.iobyxmoadg())) {
            return Paint.Cap.BUTT;
        }
        if (g.eablkybsjg(i13, iobyxmoadgVar.zoijcleaow())) {
            return Paint.Cap.ROUND;
        }
        return g.eablkybsjg(i13, iobyxmoadgVar.ppxfxbqfkf()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    public static final Paint.Join zoijcleaow(int i13) {
        h.iobyxmoadg iobyxmoadgVar = h.f38898iobyxmoadg;
        if (h.eablkybsjg(i13, iobyxmoadgVar.zoijcleaow())) {
            return Paint.Join.MITER;
        }
        if (h.eablkybsjg(i13, iobyxmoadgVar.ppxfxbqfkf())) {
            return Paint.Join.ROUND;
        }
        return h.eablkybsjg(i13, iobyxmoadgVar.iobyxmoadg()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
