package e7;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class gxszxtbevo extends dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Drawable f30650iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Throwable f30651ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final nufgyqmvbu f30652zoijcleaow;

    public gxszxtbevo(Drawable drawable, nufgyqmvbu nufgyqmvbuVar, Throwable th2) {
        super(null);
        this.f30650iobyxmoadg = drawable;
        this.f30652zoijcleaow = nufgyqmvbuVar;
        this.f30651ppxfxbqfkf = th2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gxszxtbevo) {
            gxszxtbevo gxszxtbevoVar = (gxszxtbevo) obj;
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(iobyxmoadg(), gxszxtbevoVar.iobyxmoadg()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zoijcleaow(), gxszxtbevoVar.zoijcleaow()) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f30651ppxfxbqfkf, gxszxtbevoVar.f30651ppxfxbqfkf)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Drawable drawableIobyxmoadg = iobyxmoadg();
        return ((((drawableIobyxmoadg != null ? drawableIobyxmoadg.hashCode() : 0) * 31) + zoijcleaow().hashCode()) * 31) + this.f30651ppxfxbqfkf.hashCode();
    }

    @Override // e7.dxjokdxxww
    public Drawable iobyxmoadg() {
        return this.f30650iobyxmoadg;
    }

    public final Throwable ppxfxbqfkf() {
        return this.f30651ppxfxbqfkf;
    }

    @Override // e7.dxjokdxxww
    public nufgyqmvbu zoijcleaow() {
        return this.f30652zoijcleaow;
    }
}
