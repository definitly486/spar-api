package o9;

/* JADX INFO: loaded from: classes2.dex */
final class iobyxmoadg extends wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Integer f72339iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gxszxtbevo f72340ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final lqeggnwhkg f72341wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Object f72342zoijcleaow;

    iobyxmoadg(Integer num, Object obj, gxszxtbevo gxszxtbevoVar, lqeggnwhkg lqeggnwhkgVar, eablkybsjg eablkybsjgVar) {
        this.f72339iobyxmoadg = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f72342zoijcleaow = obj;
        if (gxszxtbevoVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f72340ppxfxbqfkf = gxszxtbevoVar;
        this.f72341wkgbmnqykc = lqeggnwhkgVar;
    }

    @Override // o9.wkgbmnqykc
    public lqeggnwhkg eablkybsjg() {
        return this.f72341wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        lqeggnwhkg lqeggnwhkgVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wkgbmnqykc)) {
            return false;
        }
        wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
        Integer num = this.f72339iobyxmoadg;
        if (num != null ? num.equals(wkgbmnqykcVar.iobyxmoadg()) : wkgbmnqykcVar.iobyxmoadg() == null) {
            if (this.f72342zoijcleaow.equals(wkgbmnqykcVar.ppxfxbqfkf()) && this.f72340ppxfxbqfkf.equals(wkgbmnqykcVar.wkgbmnqykc()) && ((lqeggnwhkgVar = this.f72341wkgbmnqykc) != null ? lqeggnwhkgVar.equals(wkgbmnqykcVar.eablkybsjg()) : wkgbmnqykcVar.eablkybsjg() == null)) {
                wkgbmnqykcVar.zoijcleaow();
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f72339iobyxmoadg;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f72342zoijcleaow.hashCode()) * 1000003) ^ this.f72340ppxfxbqfkf.hashCode()) * 1000003;
        lqeggnwhkg lqeggnwhkgVar = this.f72341wkgbmnqykc;
        return (iHashCode ^ (lqeggnwhkgVar != null ? lqeggnwhkgVar.hashCode() : 0)) * 1000003;
    }

    @Override // o9.wkgbmnqykc
    public Integer iobyxmoadg() {
        return this.f72339iobyxmoadg;
    }

    @Override // o9.wkgbmnqykc
    public Object ppxfxbqfkf() {
        return this.f72342zoijcleaow;
    }

    public String toString() {
        return "Event{code=" + this.f72339iobyxmoadg + ", payload=" + this.f72342zoijcleaow + ", priority=" + this.f72340ppxfxbqfkf + ", productData=" + this.f72341wkgbmnqykc + ", eventContext=" + ((Object) null) + "}";
    }

    @Override // o9.wkgbmnqykc
    public gxszxtbevo wkgbmnqykc() {
        return this.f72340ppxfxbqfkf;
    }

    @Override // o9.wkgbmnqykc
    public eablkybsjg zoijcleaow() {
        return null;
    }
}
