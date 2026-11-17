package ne;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zoijcleaow {
    public static int iobyxmoadg(int i13) {
        if (i13 == 0) {
            return 0;
        }
        if (i13 == 90) {
            return 1;
        }
        if (i13 == 180) {
            return 2;
        }
        if (i13 == 270) {
            return 3;
        }
        throw new IllegalArgumentException("Invalid rotation: " + i13);
    }

    public static void ppxfxbqfkf(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public static void zoijcleaow(Point[] pointArr, Matrix matrix) {
        int length = pointArr.length;
        float[] fArr = new float[length + length];
        for (int i13 = 0; i13 < pointArr.length; i13++) {
            Point point = pointArr[i13];
            int i14 = i13 + i13;
            fArr[i14] = point.x;
            fArr[i14 + 1] = point.y;
        }
        matrix.mapPoints(fArr);
        for (int i15 = 0; i15 < pointArr.length; i15++) {
            int i16 = i15 + i15;
            pointArr[i15].set((int) fArr[i16], (int) fArr[i16 + 1]);
        }
    }
}
