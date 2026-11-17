package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class fmlbqenlif implements cdpycssgdh {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final int f117087iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final yadqdtsiqt f117088ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f117089zoijcleaow;

    public fmlbqenlif(int i13, int i14, yadqdtsiqt yadqdtsiqtVar) {
        this.f117087iobyxmoadg = i13;
        this.f117089zoijcleaow = i14;
        this.f117088ppxfxbqfkf = yadqdtsiqtVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof fmlbqenlif)) {
            return false;
        }
        fmlbqenlif fmlbqenlifVar = (fmlbqenlif) obj;
        return fmlbqenlifVar.f117087iobyxmoadg == this.f117087iobyxmoadg && fmlbqenlifVar.f117089zoijcleaow == this.f117089zoijcleaow && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(fmlbqenlifVar.f117088ppxfxbqfkf, this.f117088ppxfxbqfkf);
    }

    @Override // vipkmwdibw.cdpycssgdh, vipkmwdibw.gtknphoqwx
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public c0 iobyxmoadg(ezmngbhpjk ezmngbhpjkVar) {
        return new c0(this.f117087iobyxmoadg, this.f117089zoijcleaow, this.f117088ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f117087iobyxmoadg * 31) + this.f117088ppxfxbqfkf.hashCode()) * 31) + this.f117089zoijcleaow;
    }

    public /* synthetic */ fmlbqenlif(int i13, int i14, yadqdtsiqt yadqdtsiqtVar, int i15, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this((i15 & 1) != 0 ? 300 : i13, (i15 & 2) != 0 ? 0 : i14, (i15 & 4) != 0 ? lmojexxdyd.ppxfxbqfkf() : yadqdtsiqtVar);
    }
}
