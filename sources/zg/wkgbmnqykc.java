package zg;

/* JADX INFO: loaded from: classes3.dex */
final class wkgbmnqykc implements gxszxtbevo {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final double f129937yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final double f129938zdlpuopuiu;

    public wkgbmnqykc(double d13, double d14) {
        this.f129938zdlpuopuiu = d13;
        this.f129937yggfygwlhe = d14;
    }

    @Override // zg.lqeggnwhkg
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public Double ppxfxbqfkf() {
        return Double.valueOf(this.f129937yggfygwlhe);
    }

    public boolean equals(Object obj) {
        if (obj instanceof wkgbmnqykc) {
            if (!isEmpty() || !((wkgbmnqykc) obj).isEmpty()) {
                wkgbmnqykc wkgbmnqykcVar = (wkgbmnqykc) obj;
                if (this.f129938zdlpuopuiu != wkgbmnqykcVar.f129938zdlpuopuiu || this.f129937yggfygwlhe != wkgbmnqykcVar.f129937yggfygwlhe) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // zg.lqeggnwhkg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public Double getStart() {
        return Double.valueOf(this.f129938zdlpuopuiu);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.hashCode(this.f129938zdlpuopuiu) * 31) + Double.hashCode(this.f129937yggfygwlhe);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zg.gxszxtbevo, zg.lqeggnwhkg
    public /* bridge */ /* synthetic */ boolean iobyxmoadg(Comparable comparable) {
        return wkgbmnqykc(((Number) comparable).doubleValue());
    }

    @Override // zg.gxszxtbevo
    public boolean isEmpty() {
        return this.f129938zdlpuopuiu > this.f129937yggfygwlhe;
    }

    public boolean lqeggnwhkg(double d13, double d14) {
        return d13 <= d14;
    }

    public String toString() {
        return this.f129938zdlpuopuiu + ".." + this.f129937yggfygwlhe;
    }

    public boolean wkgbmnqykc(double d13) {
        return d13 >= this.f129938zdlpuopuiu && d13 <= this.f129937yggfygwlhe;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zg.gxszxtbevo
    public /* bridge */ /* synthetic */ boolean zoijcleaow(Comparable comparable, Comparable comparable2) {
        return lqeggnwhkg(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }
}
