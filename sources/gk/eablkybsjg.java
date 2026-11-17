package gk;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    private boolean f37690agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f37691btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    private boolean f37692draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private iobyxmoadg f37693dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f37694eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f37695gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private String f37696gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private boolean f37697iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f37698lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private String f37699nufgyqmvbu;

    /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
    private boolean f37700ojitshcjhn;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private boolean f37701ppxfxbqfkf;

    /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
    private boolean f37702rgvfuqvkyq;

    /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
    private ik.zoijcleaow f37703vdvldrhtss;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    private boolean f37704wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private boolean f37705wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f37706zoijcleaow;

    public eablkybsjg(zoijcleaow json) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(json, "json");
        this.f37697iobyxmoadg = json.eablkybsjg().dxjokdxxww();
        this.f37706zoijcleaow = json.eablkybsjg().btonecajqb();
        this.f37701ppxfxbqfkf = json.eablkybsjg().gtknphoqwx();
        this.f37705wkgbmnqykc = json.eablkybsjg().vdvldrhtss();
        this.f37694eablkybsjg = json.eablkybsjg().wflxmlrfwp();
        this.f37696gxszxtbevo = json.eablkybsjg().agtfadlqog();
        this.f37698lqeggnwhkg = json.eablkybsjg().lqeggnwhkg();
        this.f37699nufgyqmvbu = json.eablkybsjg().eablkybsjg();
        this.f37693dxjokdxxww = json.eablkybsjg().gxszxtbevo();
        this.f37691btonecajqb = json.eablkybsjg().ojitshcjhn();
        json.eablkybsjg().draadjrbmk();
        this.f37695gtknphoqwx = json.eablkybsjg().nufgyqmvbu();
        this.f37692draadjrbmk = json.eablkybsjg().wkgbmnqykc();
        this.f37704wflxmlrfwp = json.eablkybsjg().iobyxmoadg();
        this.f37690agtfadlqog = json.eablkybsjg().zoijcleaow();
        this.f37700ojitshcjhn = json.eablkybsjg().ppxfxbqfkf();
        this.f37702rgvfuqvkyq = json.eablkybsjg().rgvfuqvkyq();
        this.f37703vdvldrhtss = json.iobyxmoadg();
    }

    public final void eablkybsjg(boolean z13) {
        this.f37705wkgbmnqykc = z13;
    }

    public final lqeggnwhkg iobyxmoadg() {
        if (this.f37702rgvfuqvkyq) {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f37699nufgyqmvbu, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (this.f37693dxjokdxxww != iobyxmoadg.POLYMORPHIC) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (this.f37694eablkybsjg) {
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f37696gxszxtbevo, "    ")) {
                String str = this.f37696gxszxtbevo;
                for (int i13 = 0; i13 < str.length(); i13++) {
                    char cCharAt = str.charAt(i13);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f37696gxszxtbevo).toString());
                    }
                }
            }
        } else if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f37696gxszxtbevo, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new lqeggnwhkg(this.f37697iobyxmoadg, this.f37701ppxfxbqfkf, this.f37705wkgbmnqykc, this.f37700ojitshcjhn, this.f37694eablkybsjg, this.f37706zoijcleaow, this.f37696gxszxtbevo, this.f37698lqeggnwhkg, this.f37702rgvfuqvkyq, this.f37699nufgyqmvbu, this.f37690agtfadlqog, this.f37691btonecajqb, null, this.f37695gtknphoqwx, this.f37692draadjrbmk, this.f37704wflxmlrfwp, this.f37693dxjokdxxww);
    }

    public final void ppxfxbqfkf(boolean z13) {
        this.f37697iobyxmoadg = z13;
    }

    public final void wkgbmnqykc(boolean z13) {
        this.f37701ppxfxbqfkf = z13;
    }

    public final ik.zoijcleaow zoijcleaow() {
        return this.f37703vdvldrhtss;
    }
}
