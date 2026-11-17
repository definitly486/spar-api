package h2;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg extends zoijcleaow {

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private boolean f39087istkbnxepw;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private gxszxtbevo f39088pmvmpeiblj;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private float f39089zynmafqrjb;

    public eablkybsjg(wkgbmnqykc wkgbmnqykcVar) {
        super(wkgbmnqykcVar);
        this.f39088pmvmpeiblj = null;
        this.f39089zynmafqrjb = Float.MAX_VALUE;
        this.f39087istkbnxepw = false;
    }

    private void yggfygwlhe() {
        gxszxtbevo gxszxtbevoVar = this.f39088pmvmpeiblj;
        if (gxszxtbevoVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dIobyxmoadg = gxszxtbevoVar.iobyxmoadg();
        if (dIobyxmoadg > this.f39135lqeggnwhkg) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dIobyxmoadg < this.f39136nufgyqmvbu) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public eablkybsjg jyumaefscl(gxszxtbevo gxszxtbevoVar) {
        this.f39088pmvmpeiblj = gxszxtbevoVar;
        return this;
    }

    public void kcexrzcfyt(float f13) {
        if (lqeggnwhkg()) {
            this.f39089zynmafqrjb = f13;
            return;
        }
        if (this.f39088pmvmpeiblj == null) {
            this.f39088pmvmpeiblj = new gxszxtbevo(f13);
        }
        this.f39088pmvmpeiblj.eablkybsjg(f13);
        rgvfuqvkyq();
    }

    @Override // h2.zoijcleaow
    void ojitshcjhn(float f13) {
    }

    @Override // h2.zoijcleaow
    boolean oxmwwwfdhm(long j13) {
        if (this.f39087istkbnxepw) {
            float f13 = this.f39089zynmafqrjb;
            if (f13 != Float.MAX_VALUE) {
                this.f39088pmvmpeiblj.eablkybsjg(f13);
                this.f39089zynmafqrjb = Float.MAX_VALUE;
            }
            this.f39139zoijcleaow = this.f39088pmvmpeiblj.iobyxmoadg();
            this.f39134iobyxmoadg = 0.0f;
            this.f39087istkbnxepw = false;
            return true;
        }
        if (this.f39089zynmafqrjb != Float.MAX_VALUE) {
            this.f39088pmvmpeiblj.iobyxmoadg();
            long j14 = j13 / 2;
            zoijcleaow.rgvfuqvkyq rgvfuqvkyqVarNufgyqmvbu = this.f39088pmvmpeiblj.nufgyqmvbu(this.f39139zoijcleaow, this.f39134iobyxmoadg, j14);
            this.f39088pmvmpeiblj.eablkybsjg(this.f39089zynmafqrjb);
            this.f39089zynmafqrjb = Float.MAX_VALUE;
            zoijcleaow.rgvfuqvkyq rgvfuqvkyqVarNufgyqmvbu2 = this.f39088pmvmpeiblj.nufgyqmvbu(rgvfuqvkyqVarNufgyqmvbu.f39142iobyxmoadg, rgvfuqvkyqVarNufgyqmvbu.f39143zoijcleaow, j14);
            this.f39139zoijcleaow = rgvfuqvkyqVarNufgyqmvbu2.f39142iobyxmoadg;
            this.f39134iobyxmoadg = rgvfuqvkyqVarNufgyqmvbu2.f39143zoijcleaow;
        } else {
            zoijcleaow.rgvfuqvkyq rgvfuqvkyqVarNufgyqmvbu3 = this.f39088pmvmpeiblj.nufgyqmvbu(this.f39139zoijcleaow, this.f39134iobyxmoadg, j13);
            this.f39139zoijcleaow = rgvfuqvkyqVarNufgyqmvbu3.f39142iobyxmoadg;
            this.f39134iobyxmoadg = rgvfuqvkyqVarNufgyqmvbu3.f39143zoijcleaow;
        }
        float fMax = Math.max(this.f39139zoijcleaow, this.f39136nufgyqmvbu);
        this.f39139zoijcleaow = fMax;
        float fMin = Math.min(fMax, this.f39135lqeggnwhkg);
        this.f39139zoijcleaow = fMin;
        if (!zdlpuopuiu(fMin, this.f39134iobyxmoadg)) {
            return false;
        }
        this.f39139zoijcleaow = this.f39088pmvmpeiblj.iobyxmoadg();
        this.f39134iobyxmoadg = 0.0f;
        return true;
    }

    @Override // h2.zoijcleaow
    public void rgvfuqvkyq() {
        yggfygwlhe();
        this.f39088pmvmpeiblj.lqeggnwhkg(gxszxtbevo());
        super.rgvfuqvkyq();
    }

    boolean zdlpuopuiu(float f13, float f14) {
        return this.f39088pmvmpeiblj.ppxfxbqfkf(f13, f14);
    }
}
