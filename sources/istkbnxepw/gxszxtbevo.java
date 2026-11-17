package istkbnxepw;

/* JADX INFO: loaded from: classes.dex */
final class gxszxtbevo extends oipsdeybqn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final oipsdeybqn.zoijcleaow f49326iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f49327ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final oipsdeybqn.iobyxmoadg f49328zoijcleaow;

    gxszxtbevo(oipsdeybqn.zoijcleaow zoijcleaowVar, oipsdeybqn.iobyxmoadg iobyxmoadgVar, long j13) {
        if (zoijcleaowVar == null) {
            throw new NullPointerException("Null configType");
        }
        this.f49326iobyxmoadg = zoijcleaowVar;
        if (iobyxmoadgVar == null) {
            throw new NullPointerException("Null configSize");
        }
        this.f49328zoijcleaow = iobyxmoadgVar;
        this.f49327ppxfxbqfkf = j13;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oipsdeybqn)) {
            return false;
        }
        oipsdeybqn oipsdeybqnVar = (oipsdeybqn) obj;
        return this.f49326iobyxmoadg.equals(oipsdeybqnVar.wkgbmnqykc()) && this.f49328zoijcleaow.equals(oipsdeybqnVar.ppxfxbqfkf()) && this.f49327ppxfxbqfkf == oipsdeybqnVar.gxszxtbevo();
    }

    @Override // istkbnxepw.oipsdeybqn
    public long gxszxtbevo() {
        return this.f49327ppxfxbqfkf;
    }

    public int hashCode() {
        int iHashCode = (((this.f49326iobyxmoadg.hashCode() ^ 1000003) * 1000003) ^ this.f49328zoijcleaow.hashCode()) * 1000003;
        long j13 = this.f49327ppxfxbqfkf;
        return iHashCode ^ ((int) (j13 ^ (j13 >>> 32)));
    }

    @Override // istkbnxepw.oipsdeybqn
    public oipsdeybqn.iobyxmoadg ppxfxbqfkf() {
        return this.f49328zoijcleaow;
    }

    public String toString() {
        return "SurfaceConfig{configType=" + this.f49326iobyxmoadg + ", configSize=" + this.f49328zoijcleaow + ", streamUseCase=" + this.f49327ppxfxbqfkf + "}";
    }

    @Override // istkbnxepw.oipsdeybqn
    public oipsdeybqn.zoijcleaow wkgbmnqykc() {
        return this.f49326iobyxmoadg;
    }
}
