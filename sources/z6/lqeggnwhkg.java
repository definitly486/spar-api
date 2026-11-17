package z6;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class lqeggnwhkg extends nufgyqmvbu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Drawable f129207iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final x6.wkgbmnqykc f129208ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f129209zoijcleaow;

    public lqeggnwhkg(Drawable drawable, boolean z13, x6.wkgbmnqykc wkgbmnqykcVar) {
        super(null);
        this.f129207iobyxmoadg = drawable;
        this.f129209zoijcleaow = z13;
        this.f129208ppxfxbqfkf = wkgbmnqykcVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lqeggnwhkg) {
            lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
            if (zdlpuopuiu.eablkybsjg(this.f129207iobyxmoadg, lqeggnwhkgVar.f129207iobyxmoadg) && this.f129209zoijcleaow == lqeggnwhkgVar.f129209zoijcleaow && this.f129208ppxfxbqfkf == lqeggnwhkgVar.f129208ppxfxbqfkf) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f129207iobyxmoadg.hashCode() * 31) + Boolean.hashCode(this.f129209zoijcleaow)) * 31) + this.f129208ppxfxbqfkf.hashCode();
    }

    public final x6.wkgbmnqykc iobyxmoadg() {
        return this.f129208ppxfxbqfkf;
    }

    public final boolean ppxfxbqfkf() {
        return this.f129209zoijcleaow;
    }

    public final Drawable zoijcleaow() {
        return this.f129207iobyxmoadg;
    }
}
