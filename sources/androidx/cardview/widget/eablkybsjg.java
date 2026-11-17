package androidx.cardview.widget;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
abstract class eablkybsjg extends Drawable {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final double f4213iobyxmoadg = Math.cos(Math.toRadians(45.0d));

    static float iobyxmoadg(float f13, float f14, boolean z13) {
        return z13 ? (float) (((double) f13) + ((1.0d - f4213iobyxmoadg) * ((double) f14))) : f13;
    }

    static float zoijcleaow(float f13, float f14, boolean z13) {
        return z13 ? (float) (((double) (f13 * 1.5f)) + ((1.0d - f4213iobyxmoadg) * ((double) f14))) : f13 * 1.5f;
    }
}
