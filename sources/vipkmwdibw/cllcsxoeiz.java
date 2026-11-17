package vipkmwdibw;

/* JADX INFO: loaded from: classes.dex */
public final class cllcsxoeiz implements gtknphoqwx {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final int f117043wkgbmnqykc = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cdpycssgdh f117044iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final long f117045ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final okpsazkaxt f117046zoijcleaow;

    public /* synthetic */ cllcsxoeiz(cdpycssgdh cdpycssgdhVar, okpsazkaxt okpsazkaxtVar, long j13, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(cdpycssgdhVar, okpsazkaxtVar, j13);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof cllcsxoeiz)) {
            return false;
        }
        cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(cllcsxoeizVar.f117044iobyxmoadg, this.f117044iobyxmoadg) && cllcsxoeizVar.f117046zoijcleaow == this.f117046zoijcleaow && ydmasvzmpa.wkgbmnqykc(cllcsxoeizVar.f117045ppxfxbqfkf, this.f117045ppxfxbqfkf);
    }

    public int hashCode() {
        return (((this.f117044iobyxmoadg.hashCode() * 31) + this.f117046zoijcleaow.hashCode()) * 31) + ydmasvzmpa.eablkybsjg(this.f117045ppxfxbqfkf);
    }

    @Override // vipkmwdibw.gtknphoqwx
    public q iobyxmoadg(ezmngbhpjk ezmngbhpjkVar) {
        return new x(this.f117044iobyxmoadg.iobyxmoadg(ezmngbhpjkVar), this.f117046zoijcleaow, this.f117045ppxfxbqfkf, null);
    }

    private cllcsxoeiz(cdpycssgdh cdpycssgdhVar, okpsazkaxt okpsazkaxtVar, long j13) {
        this.f117044iobyxmoadg = cdpycssgdhVar;
        this.f117046zoijcleaow = okpsazkaxtVar;
        this.f117045ppxfxbqfkf = j13;
    }
}
