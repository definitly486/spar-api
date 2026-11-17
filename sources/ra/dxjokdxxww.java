package ra;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class dxjokdxxww implements ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f82291iobyxmoadg;

    public dxjokdxxww(float f13) {
        this.f82291iobyxmoadg = f13;
    }

    private static float zoijcleaow(RectF rectF) {
        return Math.min(rectF.width(), rectF.height());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dxjokdxxww) && this.f82291iobyxmoadg == ((dxjokdxxww) obj).f82291iobyxmoadg;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f82291iobyxmoadg)});
    }

    @Override // ra.ppxfxbqfkf
    public float iobyxmoadg(RectF rectF) {
        return this.f82291iobyxmoadg * zoijcleaow(rectF);
    }
}
