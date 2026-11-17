package sj;

/* JADX INFO: loaded from: classes3.dex */
public final class ylkuphrtab extends tj.ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public long f107102iobyxmoadg = -1;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public lg.gxszxtbevo f107103zoijcleaow;

    @Override // tj.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public boolean iobyxmoadg(lmojexxdyd lmojexxdydVar) {
        if (this.f107102iobyxmoadg >= 0) {
            return false;
        }
        this.f107102iobyxmoadg = lmojexxdydVar.sopmlzcsov();
        return true;
    }

    @Override // tj.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public lg.gxszxtbevo[] zoijcleaow(lmojexxdyd lmojexxdydVar) {
        long j13 = this.f107102iobyxmoadg;
        this.f107102iobyxmoadg = -1L;
        this.f107103zoijcleaow = null;
        return lmojexxdydVar.ulzqkzuiru(j13);
    }
}
