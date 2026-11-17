package f6;

import android.graphics.Rect;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f32942iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f32943ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f32944wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f32945zoijcleaow;

    public zoijcleaow(int i13, int i14, int i15, int i16) {
        this.f32942iobyxmoadg = i13;
        this.f32945zoijcleaow = i14;
        this.f32943ppxfxbqfkf = i15;
        this.f32944wkgbmnqykc = i16;
    }

    public final boolean eablkybsjg() {
        return iobyxmoadg() == 0 && wkgbmnqykc() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zdlpuopuiu.eablkybsjg(zoijcleaow.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        zoijcleaow zoijcleaowVar = (zoijcleaow) obj;
        return this.f32942iobyxmoadg == zoijcleaowVar.f32942iobyxmoadg && this.f32945zoijcleaow == zoijcleaowVar.f32945zoijcleaow && this.f32943ppxfxbqfkf == zoijcleaowVar.f32943ppxfxbqfkf && this.f32944wkgbmnqykc == zoijcleaowVar.f32944wkgbmnqykc;
    }

    public final Rect gxszxtbevo() {
        return new Rect(this.f32942iobyxmoadg, this.f32945zoijcleaow, this.f32943ppxfxbqfkf, this.f32944wkgbmnqykc);
    }

    public int hashCode() {
        return (((((this.f32942iobyxmoadg * 31) + this.f32945zoijcleaow) * 31) + this.f32943ppxfxbqfkf) * 31) + this.f32944wkgbmnqykc;
    }

    public final int iobyxmoadg() {
        return this.f32944wkgbmnqykc - this.f32945zoijcleaow;
    }

    public final int ppxfxbqfkf() {
        return this.f32945zoijcleaow;
    }

    public String toString() {
        return ((Object) zoijcleaow.class.getSimpleName()) + " { [" + this.f32942iobyxmoadg + ',' + this.f32945zoijcleaow + ',' + this.f32943ppxfxbqfkf + ',' + this.f32944wkgbmnqykc + "] }";
    }

    public final int wkgbmnqykc() {
        return this.f32943ppxfxbqfkf - this.f32942iobyxmoadg;
    }

    public final int zoijcleaow() {
        return this.f32942iobyxmoadg;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        zdlpuopuiu.btonecajqb(rect, "rect");
    }
}
