package n0;

/* JADX INFO: loaded from: classes.dex */
public final class ribwqtqdhb {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final Object f68329eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final wflxmlrfwp f68330iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f68331ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final int f68332wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yadqdtsiqt f68333zoijcleaow;

    public /* synthetic */ ribwqtqdhb(wflxmlrfwp wflxmlrfwpVar, yadqdtsiqt yadqdtsiqtVar, int i13, int i14, Object obj, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(wflxmlrfwpVar, yadqdtsiqtVar, i13, i14, obj);
    }

    public static /* synthetic */ ribwqtqdhb zoijcleaow(ribwqtqdhb ribwqtqdhbVar, wflxmlrfwp wflxmlrfwpVar, yadqdtsiqt yadqdtsiqtVar, int i13, int i14, Object obj, int i15, Object obj2) {
        if ((i15 & 1) != 0) {
            wflxmlrfwpVar = ribwqtqdhbVar.f68330iobyxmoadg;
        }
        if ((i15 & 2) != 0) {
            yadqdtsiqtVar = ribwqtqdhbVar.f68333zoijcleaow;
        }
        yadqdtsiqt yadqdtsiqtVar2 = yadqdtsiqtVar;
        if ((i15 & 4) != 0) {
            i13 = ribwqtqdhbVar.f68331ppxfxbqfkf;
        }
        int i16 = i13;
        if ((i15 & 8) != 0) {
            i14 = ribwqtqdhbVar.f68332wkgbmnqykc;
        }
        int i17 = i14;
        if ((i15 & 16) != 0) {
            obj = ribwqtqdhbVar.f68329eablkybsjg;
        }
        return ribwqtqdhbVar.iobyxmoadg(wflxmlrfwpVar, yadqdtsiqtVar2, i16, i17, obj);
    }

    public final int eablkybsjg() {
        return this.f68332wkgbmnqykc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ribwqtqdhb)) {
            return false;
        }
        ribwqtqdhb ribwqtqdhbVar = (ribwqtqdhb) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f68330iobyxmoadg, ribwqtqdhbVar.f68330iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f68333zoijcleaow, ribwqtqdhbVar.f68333zoijcleaow) && lereixgezr.gxszxtbevo(this.f68331ppxfxbqfkf, ribwqtqdhbVar.f68331ppxfxbqfkf) && pmvmpeiblj.nufgyqmvbu(this.f68332wkgbmnqykc, ribwqtqdhbVar.f68332wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f68329eablkybsjg, ribwqtqdhbVar.f68329eablkybsjg);
    }

    public final yadqdtsiqt gxszxtbevo() {
        return this.f68333zoijcleaow;
    }

    public int hashCode() {
        wflxmlrfwp wflxmlrfwpVar = this.f68330iobyxmoadg;
        int iHashCode = (((((((wflxmlrfwpVar == null ? 0 : wflxmlrfwpVar.hashCode()) * 31) + this.f68333zoijcleaow.hashCode()) * 31) + lereixgezr.lqeggnwhkg(this.f68331ppxfxbqfkf)) * 31) + pmvmpeiblj.dxjokdxxww(this.f68332wkgbmnqykc)) * 31;
        Object obj = this.f68329eablkybsjg;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final ribwqtqdhb iobyxmoadg(wflxmlrfwp wflxmlrfwpVar, yadqdtsiqt yadqdtsiqtVar, int i13, int i14, Object obj) {
        return new ribwqtqdhb(wflxmlrfwpVar, yadqdtsiqtVar, i13, i14, obj, null);
    }

    public final wflxmlrfwp ppxfxbqfkf() {
        return this.f68330iobyxmoadg;
    }

    public String toString() {
        return "TypefaceRequest(fontFamily=" + this.f68330iobyxmoadg + ", fontWeight=" + this.f68333zoijcleaow + ", fontStyle=" + ((Object) lereixgezr.nufgyqmvbu(this.f68331ppxfxbqfkf)) + ", fontSynthesis=" + ((Object) pmvmpeiblj.draadjrbmk(this.f68332wkgbmnqykc)) + ", resourceLoaderCacheKey=" + this.f68329eablkybsjg + ')';
    }

    public final int wkgbmnqykc() {
        return this.f68331ppxfxbqfkf;
    }

    private ribwqtqdhb(wflxmlrfwp wflxmlrfwpVar, yadqdtsiqt yadqdtsiqtVar, int i13, int i14, Object obj) {
        this.f68330iobyxmoadg = wflxmlrfwpVar;
        this.f68333zoijcleaow = yadqdtsiqtVar;
        this.f68331ppxfxbqfkf = i13;
        this.f68332wkgbmnqykc = i14;
        this.f68329eablkybsjg = obj;
    }
}
