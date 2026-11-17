package ra;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class iobyxmoadg implements ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f82318iobyxmoadg;

    public iobyxmoadg(float f13) {
        this.f82318iobyxmoadg = f13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iobyxmoadg) && this.f82318iobyxmoadg == ((iobyxmoadg) obj).f82318iobyxmoadg;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f82318iobyxmoadg)});
    }

    @Override // ra.ppxfxbqfkf
    public float iobyxmoadg(RectF rectF) {
        return this.f82318iobyxmoadg;
    }
}
