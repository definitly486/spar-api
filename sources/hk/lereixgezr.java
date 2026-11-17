package hk;

/* JADX INFO: loaded from: classes3.dex */
final class lereixgezr extends ppxfxbqfkf {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private int f40527dxjokdxxww;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final gk.ppxfxbqfkf f40528lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final int f40529nufgyqmvbu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lereixgezr(gk.zoijcleaow json, gk.ppxfxbqfkf value) {
        super(json, value, null, 4, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(json, "json");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        this.f40528lqeggnwhkg = value;
        this.f40529nufgyqmvbu = auzgnhcxok().size();
        this.f40527dxjokdxxww = -1;
    }

    @Override // hk.ppxfxbqfkf
    /* JADX INFO: renamed from: skhdrjzrfn, reason: merged with bridge method [inline-methods] */
    public gk.ppxfxbqfkf auzgnhcxok() {
        return this.f40528lqeggnwhkg;
    }

    @Override // fk.vipkmwdibw
    protected String xrmfcynszj(dk.gxszxtbevo descriptor, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return String.valueOf(i13);
    }

    @Override // ek.ppxfxbqfkf
    public int yadqdtsiqt(dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        int i13 = this.f40527dxjokdxxww;
        if (i13 >= this.f40529nufgyqmvbu - 1) {
            return -1;
        }
        int i14 = i13 + 1;
        this.f40527dxjokdxxww = i14;
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // hk.ppxfxbqfkf
    public gk.btonecajqb ydmasvzmpa(String tag) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        return auzgnhcxok().get(Integer.parseInt(tag));
    }
}
