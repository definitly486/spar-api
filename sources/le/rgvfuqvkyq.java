package le;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;

/* JADX INFO: loaded from: classes2.dex */
public final class rgvfuqvkyq implements ke.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zzu f62185iobyxmoadg;

    public rgvfuqvkyq(zzu zzuVar) {
        this.f62185iobyxmoadg = zzuVar;
    }

    @Override // ke.iobyxmoadg
    public final int getFormat() {
        return this.f62185iobyxmoadg.zza;
    }

    @Override // ke.iobyxmoadg
    public final Rect iobyxmoadg() {
        zzu zzuVar = this.f62185iobyxmoadg;
        if (zzuVar.zze == null) {
            return null;
        }
        int i13 = 0;
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = zzuVar.zze;
            if (i13 >= pointArr.length) {
                return new Rect(iMin, iMin2, iMax, iMax2);
            }
            Point point = pointArr[i13];
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i13++;
        }
    }

    @Override // ke.iobyxmoadg
    public final int ppxfxbqfkf() {
        return this.f62185iobyxmoadg.zzd;
    }

    @Override // ke.iobyxmoadg
    public final Point[] wkgbmnqykc() {
        return this.f62185iobyxmoadg.zze;
    }

    @Override // ke.iobyxmoadg
    public final String zoijcleaow() {
        return this.f62185iobyxmoadg.zzb;
    }
}
