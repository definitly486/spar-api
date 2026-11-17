package l;

import androidx.compose.ui.graphics.wkgbmnqykc;
import h.oipsdeybqn;
import j.gxszxtbevo;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow extends ppxfxbqfkf {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final long f61199btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private wkgbmnqykc f61200dxjokdxxww;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final long f61201lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private float f61202nufgyqmvbu;

    public /* synthetic */ zoijcleaow(long j13, gtknphoqwx gtknphoqwxVar) {
        this(j13);
    }

    @Override // l.ppxfxbqfkf
    protected void btonecajqb(gxszxtbevo gxszxtbevoVar) {
        gxszxtbevo.ribwqtqdhb(gxszxtbevoVar, this.f61201lqeggnwhkg, 0L, 0L, this.f61202nufgyqmvbu, null, this.f61200dxjokdxxww, 0, 86, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoijcleaow) && oipsdeybqn.ojitshcjhn(this.f61201lqeggnwhkg, ((zoijcleaow) obj).f61201lqeggnwhkg);
    }

    public int hashCode() {
        return oipsdeybqn.yggfygwlhe(this.f61201lqeggnwhkg);
    }

    @Override // l.ppxfxbqfkf
    protected boolean iobyxmoadg(float f13) {
        this.f61202nufgyqmvbu = f13;
        return true;
    }

    @Override // l.ppxfxbqfkf
    public long nufgyqmvbu() {
        return this.f61199btonecajqb;
    }

    public String toString() {
        return "ColorPainter(color=" + ((Object) oipsdeybqn.jyumaefscl(this.f61201lqeggnwhkg)) + ')';
    }

    @Override // l.ppxfxbqfkf
    protected boolean zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
        this.f61200dxjokdxxww = wkgbmnqykcVar;
        return true;
    }

    private zoijcleaow(long j13) {
        this.f61201lqeggnwhkg = j13;
        this.f61202nufgyqmvbu = 1.0f;
        this.f61199btonecajqb = g.gtknphoqwx.f35588zoijcleaow.iobyxmoadg();
    }
}
