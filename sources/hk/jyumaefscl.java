package hk;

/* JADX INFO: loaded from: classes3.dex */
final class jyumaefscl extends ppxfxbqfkf {

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final gk.btonecajqb f40524lqeggnwhkg;

    public /* synthetic */ jyumaefscl(gk.zoijcleaow zoijcleaowVar, gk.btonecajqb btonecajqbVar, String str, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(zoijcleaowVar, btonecajqbVar, (i13 & 4) != 0 ? null : str);
    }

    @Override // hk.ppxfxbqfkf
    public gk.btonecajqb auzgnhcxok() {
        return this.f40524lqeggnwhkg;
    }

    @Override // ek.ppxfxbqfkf
    public int yadqdtsiqt(dk.gxszxtbevo descriptor) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(descriptor, "descriptor");
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // hk.ppxfxbqfkf
    public gk.btonecajqb ydmasvzmpa(String tag) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tag, "tag");
        if (tag == "primitive") {
            return auzgnhcxok();
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyumaefscl(gk.zoijcleaow json, gk.btonecajqb value, String str) {
        super(json, value, str, null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(json, "json");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        this.f40524lqeggnwhkg = value;
        ikoacuggdj("primitive");
    }
}
