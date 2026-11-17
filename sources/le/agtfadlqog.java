package le;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;

/* JADX INFO: loaded from: classes2.dex */
public final class agtfadlqog implements ke.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zzyb f62146iobyxmoadg;

    public agtfadlqog(zzyb zzybVar) {
        this.f62146iobyxmoadg = zzybVar;
    }

    @Override // ke.iobyxmoadg
    public final int getFormat() {
        return this.f62146iobyxmoadg.zza();
    }

    @Override // ke.iobyxmoadg
    public final Rect iobyxmoadg() {
        Point[] pointArrZzo = this.f62146iobyxmoadg.zzo();
        if (pointArrZzo == null) {
            return null;
        }
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (Point point : pointArrZzo) {
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    @Override // ke.iobyxmoadg
    public final int ppxfxbqfkf() {
        return this.f62146iobyxmoadg.zzb();
    }

    @Override // ke.iobyxmoadg
    public final Point[] wkgbmnqykc() {
        return this.f62146iobyxmoadg.zzo();
    }

    @Override // ke.iobyxmoadg
    public final String zoijcleaow() {
        return this.f62146iobyxmoadg.zzm();
    }
}
