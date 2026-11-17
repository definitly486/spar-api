package w0;

/* JADX INFO: loaded from: classes.dex */
final class lqeggnwhkg implements wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final x0.iobyxmoadg f118261jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final float f118262yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final float f118263zdlpuopuiu;

    public lqeggnwhkg(float f13, float f14, x0.iobyxmoadg iobyxmoadgVar) {
        this.f118263zdlpuopuiu = f13;
        this.f118262yggfygwlhe = f14;
        this.f118261jyumaefscl = iobyxmoadgVar;
    }

    @Override // w0.draadjrbmk
    public float F() {
        return this.f118262yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqeggnwhkg)) {
            return false;
        }
        lqeggnwhkg lqeggnwhkgVar = (lqeggnwhkg) obj;
        return Float.compare(this.f118263zdlpuopuiu, lqeggnwhkgVar.f118263zdlpuopuiu) == 0 && Float.compare(this.f118262yggfygwlhe, lqeggnwhkgVar.f118262yggfygwlhe) == 0 && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f118261jyumaefscl, lqeggnwhkgVar.f118261jyumaefscl);
    }

    @Override // w0.wkgbmnqykc
    public float getDensity() {
        return this.f118263zdlpuopuiu;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f118263zdlpuopuiu) * 31) + Float.hashCode(this.f118262yggfygwlhe)) * 31) + this.f118261jyumaefscl.hashCode();
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.f118263zdlpuopuiu + ", fontScale=" + this.f118262yggfygwlhe + ", converter=" + this.f118261jyumaefscl + ')';
    }

    @Override // w0.draadjrbmk
    public long tzroggbefp(float f13) {
        return iwizpuwonk.nufgyqmvbu(this.f118261jyumaefscl.iobyxmoadg(f13));
    }

    @Override // w0.draadjrbmk
    public float vipkmwdibw(long j13) {
        if (cqumvgiudr.lqeggnwhkg(jyumaefscl.lqeggnwhkg(j13), cqumvgiudr.f118246zoijcleaow.zoijcleaow())) {
            return nufgyqmvbu.lqeggnwhkg(this.f118261jyumaefscl.zoijcleaow(jyumaefscl.nufgyqmvbu(j13)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }
}
