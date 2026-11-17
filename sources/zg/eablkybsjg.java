package zg;

/* JADX INFO: loaded from: classes3.dex */
final class eablkybsjg implements gxszxtbevo {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final float f129925yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final float f129926zdlpuopuiu;

    public eablkybsjg(float f13, float f14) {
        this.f129926zdlpuopuiu = f13;
        this.f129925yggfygwlhe = f14;
    }

    @Override // zg.lqeggnwhkg
    /* JADX INFO: renamed from: eablkybsjg, reason: merged with bridge method [inline-methods] */
    public Float ppxfxbqfkf() {
        return Float.valueOf(this.f129925yggfygwlhe);
    }

    public boolean equals(Object obj) {
        if (obj instanceof eablkybsjg) {
            if (!isEmpty() || !((eablkybsjg) obj).isEmpty()) {
                eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
                if (this.f129926zdlpuopuiu != eablkybsjgVar.f129926zdlpuopuiu || this.f129925yggfygwlhe != eablkybsjgVar.f129925yggfygwlhe) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // zg.lqeggnwhkg
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public Float getStart() {
        return Float.valueOf(this.f129926zdlpuopuiu);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f129926zdlpuopuiu) * 31) + Float.hashCode(this.f129925yggfygwlhe);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zg.gxszxtbevo, zg.lqeggnwhkg
    public /* bridge */ /* synthetic */ boolean iobyxmoadg(Comparable comparable) {
        return wkgbmnqykc(((Number) comparable).floatValue());
    }

    @Override // zg.gxszxtbevo
    public boolean isEmpty() {
        return this.f129926zdlpuopuiu > this.f129925yggfygwlhe;
    }

    public boolean lqeggnwhkg(float f13, float f14) {
        return f13 <= f14;
    }

    public String toString() {
        return this.f129926zdlpuopuiu + ".." + this.f129925yggfygwlhe;
    }

    public boolean wkgbmnqykc(float f13) {
        return f13 >= this.f129926zdlpuopuiu && f13 <= this.f129925yggfygwlhe;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zg.gxszxtbevo
    public /* bridge */ /* synthetic */ boolean zoijcleaow(Comparable comparable, Comparable comparable2) {
        return lqeggnwhkg(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }
}
