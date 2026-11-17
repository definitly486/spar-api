package ph;

/* JADX INFO: loaded from: classes3.dex */
public final class jyumaefscl extends nufgyqmvbu implements zh.wflxmlrfwp {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Enum f76585ppxfxbqfkf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyumaefscl(ii.gxszxtbevo gxszxtbevoVar, Enum value) {
        super(gxszxtbevoVar, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        this.f76585ppxfxbqfkf = value;
    }

    @Override // zh.wflxmlrfwp
    public ii.gxszxtbevo eablkybsjg() {
        return ii.gxszxtbevo.gxszxtbevo(this.f76585ppxfxbqfkf.name());
    }

    @Override // zh.wflxmlrfwp
    public ii.zoijcleaow wkgbmnqykc() {
        Class<?> enclosingClass = this.f76585ppxfxbqfkf.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(enclosingClass);
        return gxszxtbevo.eablkybsjg(enclosingClass);
    }
}
