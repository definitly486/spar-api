package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class czzsidtyhn implements wwaezpbzkn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final float f117051iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Object f117052ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final float f117053zoijcleaow;

    public czzsidtyhn(float f13, float f14, Object obj) {
        this.f117051iobyxmoadg = f13;
        this.f117053zoijcleaow = f14;
        this.f117052ppxfxbqfkf = obj;
    }

    @Override // vipkmwdibw.gtknphoqwx
    /* JADX INFO: renamed from: dxjokdxxww, reason: merged with bridge method [inline-methods] */
    public b0 iobyxmoadg(ezmngbhpjk ezmngbhpjkVar) {
        return new b0(this.f117051iobyxmoadg, this.f117053zoijcleaow, draadjrbmk.zoijcleaow(ezmngbhpjkVar, this.f117052ppxfxbqfkf));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof czzsidtyhn)) {
            return false;
        }
        czzsidtyhn czzsidtyhnVar = (czzsidtyhn) obj;
        return czzsidtyhnVar.f117051iobyxmoadg == this.f117051iobyxmoadg && czzsidtyhnVar.f117053zoijcleaow == this.f117053zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(czzsidtyhnVar.f117052ppxfxbqfkf, this.f117052ppxfxbqfkf);
    }

    public final float gxszxtbevo() {
        return this.f117051iobyxmoadg;
    }

    public int hashCode() {
        Object obj = this.f117052ppxfxbqfkf;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + Float.hashCode(this.f117051iobyxmoadg)) * 31) + Float.hashCode(this.f117053zoijcleaow);
    }

    public final float lqeggnwhkg() {
        return this.f117053zoijcleaow;
    }

    public final Object nufgyqmvbu() {
        return this.f117052ppxfxbqfkf;
    }

    public /* synthetic */ czzsidtyhn(float f13, float f14, Object obj, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? 1.0f : f13, (i13 & 2) != 0 ? 1500.0f : f14, (i13 & 4) != 0 ? null : obj);
    }
}
