package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final kcexrzcfyt f117374iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final int f117375ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yadqdtsiqt f117376zoijcleaow;

    public /* synthetic */ y(kcexrzcfyt kcexrzcfytVar, yadqdtsiqt yadqdtsiqtVar, int i13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(kcexrzcfytVar, yadqdtsiqtVar, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117374iobyxmoadg, yVar.f117374iobyxmoadg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f117376zoijcleaow, yVar.f117376zoijcleaow) && jyumaefscl.ppxfxbqfkf(this.f117375ppxfxbqfkf, yVar.f117375ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f117374iobyxmoadg.hashCode() * 31) + this.f117376zoijcleaow.hashCode()) * 31) + jyumaefscl.wkgbmnqykc(this.f117375ppxfxbqfkf);
    }

    public final int iobyxmoadg() {
        return this.f117375ppxfxbqfkf;
    }

    public final kcexrzcfyt ppxfxbqfkf() {
        return this.f117374iobyxmoadg;
    }

    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f117374iobyxmoadg + ", easing=" + this.f117376zoijcleaow + ", arcMode=" + ((Object) jyumaefscl.eablkybsjg(this.f117375ppxfxbqfkf)) + ')';
    }

    public final yadqdtsiqt zoijcleaow() {
        return this.f117376zoijcleaow;
    }

    private y(kcexrzcfyt kcexrzcfytVar, yadqdtsiqt yadqdtsiqtVar, int i13) {
        this.f117374iobyxmoadg = kcexrzcfytVar;
        this.f117376zoijcleaow = yadqdtsiqtVar;
        this.f117375ppxfxbqfkf = i13;
    }
}
