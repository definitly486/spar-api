package je;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.common.internal.Preconditions;
import ne.zoijcleaow;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ke.iobyxmoadg f51181iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Point[] f51182ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Rect f51183zoijcleaow;

    public iobyxmoadg(ke.iobyxmoadg iobyxmoadgVar, Matrix matrix) {
        this.f51181iobyxmoadg = (ke.iobyxmoadg) Preconditions.checkNotNull(iobyxmoadgVar);
        Rect rectIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
        if (rectIobyxmoadg != null && matrix != null) {
            zoijcleaow.ppxfxbqfkf(rectIobyxmoadg, matrix);
        }
        this.f51183zoijcleaow = rectIobyxmoadg;
        Point[] pointArrWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
        if (pointArrWkgbmnqykc != null && matrix != null) {
            zoijcleaow.zoijcleaow(pointArrWkgbmnqykc, matrix);
        }
        this.f51182ppxfxbqfkf = pointArrWkgbmnqykc;
    }

    public Point[] iobyxmoadg() {
        return this.f51182ppxfxbqfkf;
    }

    public String ppxfxbqfkf() {
        return this.f51181iobyxmoadg.zoijcleaow();
    }

    public int wkgbmnqykc() {
        return this.f51181iobyxmoadg.ppxfxbqfkf();
    }

    public int zoijcleaow() {
        int format = this.f51181iobyxmoadg.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }
}
