package v7;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import k7.gtknphoqwx;
import q7.ojitshcjhn;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final PointF f116250iobyxmoadg = new PointF();

    public static int btonecajqb(int i13, int i14, float f13) {
        return (int) (i13 + (f13 * (i14 - i13)));
    }

    public static float dxjokdxxww(float f13, float f14, float f15) {
        return f13 + (f15 * (f14 - f13));
    }

    private static int eablkybsjg(int i13, int i14) {
        int i15 = i13 / i14;
        return (((i13 ^ i14) >= 0) || i13 % i14 == 0) ? i15 : i15 - 1;
    }

    public static void gtknphoqwx(o7.eablkybsjg eablkybsjgVar, int i13, List list, o7.eablkybsjg eablkybsjgVar2, gtknphoqwx gtknphoqwxVar) {
        if (eablkybsjgVar.ppxfxbqfkf(gtknphoqwxVar.getName(), i13)) {
            list.add(eablkybsjgVar2.iobyxmoadg(gtknphoqwxVar.getName()).dxjokdxxww(gtknphoqwxVar));
        }
    }

    static int gxszxtbevo(float f13, float f14) {
        return lqeggnwhkg((int) f13, (int) f14);
    }

    public static PointF iobyxmoadg(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    private static int lqeggnwhkg(int i13, int i14) {
        return i13 - (i14 * eablkybsjg(i13, i14));
    }

    public static void nufgyqmvbu(ojitshcjhn ojitshcjhnVar, Path path) {
        path.reset();
        PointF pointFZoijcleaow = ojitshcjhnVar.zoijcleaow();
        path.moveTo(pointFZoijcleaow.x, pointFZoijcleaow.y);
        f116250iobyxmoadg.set(pointFZoijcleaow.x, pointFZoijcleaow.y);
        for (int i13 = 0; i13 < ojitshcjhnVar.iobyxmoadg().size(); i13++) {
            o7.iobyxmoadg iobyxmoadgVar = (o7.iobyxmoadg) ojitshcjhnVar.iobyxmoadg().get(i13);
            PointF pointFIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            PointF pointFZoijcleaow2 = iobyxmoadgVar.zoijcleaow();
            PointF pointFPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
            PointF pointF = f116250iobyxmoadg;
            if (pointFIobyxmoadg.equals(pointF) && pointFZoijcleaow2.equals(pointFPpxfxbqfkf)) {
                path.lineTo(pointFPpxfxbqfkf.x, pointFPpxfxbqfkf.y);
            } else {
                path.cubicTo(pointFIobyxmoadg.x, pointFIobyxmoadg.y, pointFZoijcleaow2.x, pointFZoijcleaow2.y, pointFPpxfxbqfkf.x, pointFPpxfxbqfkf.y);
            }
            pointF.set(pointFPpxfxbqfkf.x, pointFPpxfxbqfkf.y);
        }
        if (ojitshcjhnVar.wkgbmnqykc()) {
            path.close();
        }
    }

    public static int ppxfxbqfkf(int i13, int i14, int i15) {
        return Math.max(i14, Math.min(i15, i13));
    }

    public static boolean wkgbmnqykc(float f13, float f14, float f15) {
        return f13 >= f14 && f13 <= f15;
    }

    public static float zoijcleaow(float f13, float f14, float f15) {
        return Math.max(f14, Math.min(f15, f13));
    }
}
