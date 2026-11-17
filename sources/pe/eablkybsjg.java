package pe;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_text_common.zzf;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
abstract class eablkybsjg {
    static Rect iobyxmoadg(List list) {
        Iterator it = list.iterator();
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
        }
        return new Rect(iMin, iMin2, iMax, iMax2);
    }

    static List zoijcleaow(zzf zzfVar) {
        double dSin = Math.sin(Math.toRadians(zzfVar.zze));
        double dCos = Math.cos(Math.toRadians(zzfVar.zze));
        double d13 = zzfVar.zza;
        double d14 = zzfVar.zzc;
        Point point = new Point((int) (d13 + (d14 * dCos)), (int) (((double) zzfVar.zzb) + (d14 * dSin)));
        double d15 = point.x;
        int i13 = zzfVar.zzd;
        double d16 = ((double) i13) * dSin;
        double d17 = ((double) pointArr[1].y) + (((double) i13) * dCos);
        Point point2 = pointArr[0];
        int i14 = point2.x;
        Point point3 = pointArr[2];
        int i15 = point3.x;
        Point point4 = pointArr[1];
        Point[] pointArr = {new Point(zzfVar.zza, zzfVar.zzb), point, new Point((int) (d15 - d16), (int) d17), new Point(i14 + (i15 - point4.x), point2.y + (point3.y - point4.y))};
        return Arrays.asList(pointArr);
    }
}
