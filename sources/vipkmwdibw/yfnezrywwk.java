package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
final class yfnezrywwk implements q {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final q f117377iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final long f117378zoijcleaow;

    public yfnezrywwk(q qVar, long j13) {
        this.f117377iobyxmoadg = qVar;
        this.f117378zoijcleaow = j13;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof yfnezrywwk)) {
            return false;
        }
        yfnezrywwk yfnezrywwkVar = (yfnezrywwk) obj;
        return yfnezrywwkVar.f117378zoijcleaow == this.f117378zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(yfnezrywwkVar.f117377iobyxmoadg, this.f117377iobyxmoadg);
    }

    @Override // vipkmwdibw.q
    public kcexrzcfyt gxszxtbevo(long j13, kcexrzcfyt kcexrzcfytVar, kcexrzcfyt kcexrzcfytVar2, kcexrzcfyt kcexrzcfytVar3) {
        long j14 = this.f117378zoijcleaow;
        return j13 < j14 ? kcexrzcfytVar3 : this.f117377iobyxmoadg.gxszxtbevo(j13 - j14, kcexrzcfytVar, kcexrzcfytVar2, kcexrzcfytVar3);
    }

    public int hashCode() {
        return (this.f117377iobyxmoadg.hashCode() * 31) + Long.hashCode(this.f117378zoijcleaow);
    }

    @Override // vipkmwdibw.q
    public boolean iobyxmoadg() {
        return this.f117377iobyxmoadg.iobyxmoadg();
    }

    @Override // vipkmwdibw.q
    public kcexrzcfyt lqeggnwhkg(long j13, kcexrzcfyt kcexrzcfytVar, kcexrzcfyt kcexrzcfytVar2, kcexrzcfyt kcexrzcfytVar3) {
        long j14 = this.f117378zoijcleaow;
        return j13 < j14 ? kcexrzcfytVar : this.f117377iobyxmoadg.lqeggnwhkg(j13 - j14, kcexrzcfytVar, kcexrzcfytVar2, kcexrzcfytVar3);
    }

    @Override // vipkmwdibw.q
    public long zoijcleaow(kcexrzcfyt kcexrzcfytVar, kcexrzcfyt kcexrzcfytVar2, kcexrzcfyt kcexrzcfytVar3) {
        return this.f117377iobyxmoadg.zoijcleaow(kcexrzcfytVar, kcexrzcfytVar2, kcexrzcfytVar3) + this.f117378zoijcleaow;
    }
}
