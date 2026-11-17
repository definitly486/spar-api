package ribwqtqdhb;

import vipkmwdibw.wwaezpbzkn;

/* JADX INFO: loaded from: classes.dex */
public final class gtknphoqwx {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f82725iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final wwaezpbzkn f82726zoijcleaow;

    public gtknphoqwx(float f13, wwaezpbzkn wwaezpbzknVar) {
        this.f82725iobyxmoadg = f13;
        this.f82726zoijcleaow = wwaezpbzknVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtknphoqwx)) {
            return false;
        }
        gtknphoqwx gtknphoqwxVar = (gtknphoqwx) obj;
        return Float.compare(this.f82725iobyxmoadg, gtknphoqwxVar.f82725iobyxmoadg) == 0 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f82726zoijcleaow, gtknphoqwxVar.f82726zoijcleaow);
    }

    public int hashCode() {
        return (Float.hashCode(this.f82725iobyxmoadg) * 31) + this.f82726zoijcleaow.hashCode();
    }

    public final float iobyxmoadg() {
        return this.f82725iobyxmoadg;
    }

    public String toString() {
        return "Fade(alpha=" + this.f82725iobyxmoadg + ", animationSpec=" + this.f82726zoijcleaow + ')';
    }

    public final wwaezpbzkn zoijcleaow() {
        return this.f82726zoijcleaow;
    }
}
