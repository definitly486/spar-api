package ra;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ppxfxbqfkf f82397iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f82398zoijcleaow;

    public zoijcleaow(float f13, ppxfxbqfkf ppxfxbqfkfVar) {
        while (ppxfxbqfkfVar instanceof zoijcleaow) {
            ppxfxbqfkfVar = ((zoijcleaow) ppxfxbqfkfVar).f82397iobyxmoadg;
            f13 += ((zoijcleaow) ppxfxbqfkfVar).f82398zoijcleaow;
        }
        this.f82397iobyxmoadg = ppxfxbqfkfVar;
        this.f82398zoijcleaow = f13;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoijcleaow)) {
            return false;
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f82397iobyxmoadg.equals(zoijcleaowVar.f82397iobyxmoadg) && this.f82398zoijcleaow == zoijcleaowVar.f82398zoijcleaow;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f82397iobyxmoadg, Float.valueOf(this.f82398zoijcleaow)});
    }

    @Override // ra.ppxfxbqfkf
    public float iobyxmoadg(RectF rectF) {
        return Math.max(0.0f, this.f82397iobyxmoadg.iobyxmoadg(rectF) + this.f82398zoijcleaow);
    }
}
