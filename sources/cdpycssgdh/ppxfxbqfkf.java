package cdpycssgdh;

import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public abstract class ppxfxbqfkf {
    public static int iobyxmoadg(int i13, int i14, boolean z13) {
        int i15 = z13 ? ((i14 - i13) + 360) % 360 : (i14 + i13) % 360;
        if (sopmlzcsov.nufgyqmvbu("CameraOrientationUtil")) {
            sopmlzcsov.iobyxmoadg("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i13), Integer.valueOf(i14), Boolean.valueOf(z13), Integer.valueOf(i15)));
        }
        return i15;
    }

    public static int zoijcleaow(int i13) {
        if (i13 == 0) {
            return 0;
        }
        if (i13 == 1) {
            return 90;
        }
        if (i13 == 2) {
            return 180;
        }
        if (i13 == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i13);
    }
}
