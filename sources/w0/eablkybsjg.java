package w0;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg implements wkgbmnqykc {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final float f118248yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final float f118249zdlpuopuiu;

    public eablkybsjg(float f13, float f14) {
        this.f118249zdlpuopuiu = f13;
        this.f118248yggfygwlhe = f14;
    }

    @Override // w0.draadjrbmk
    public float F() {
        return this.f118248yggfygwlhe;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eablkybsjg)) {
            return false;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
        return Float.compare(this.f118249zdlpuopuiu, eablkybsjgVar.f118249zdlpuopuiu) == 0 && Float.compare(this.f118248yggfygwlhe, eablkybsjgVar.f118248yggfygwlhe) == 0;
    }

    @Override // w0.wkgbmnqykc
    public float getDensity() {
        return this.f118249zdlpuopuiu;
    }

    public int hashCode() {
        return (Float.hashCode(this.f118249zdlpuopuiu) * 31) + Float.hashCode(this.f118248yggfygwlhe);
    }

    public String toString() {
        return "DensityImpl(density=" + this.f118249zdlpuopuiu + ", fontScale=" + this.f118248yggfygwlhe + ')';
    }
}
