package q4;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class rgvfuqvkyq extends e3.eablkybsjg implements gtknphoqwx {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private gtknphoqwx f77835cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private long f77836esjtqupxsv;

    @Override // e3.eablkybsjg, e3.iobyxmoadg
    public void gxszxtbevo() {
        super.gxszxtbevo();
        this.f77835cqumvgiudr = null;
    }

    @Override // q4.gtknphoqwx
    public int iobyxmoadg(long j13) {
        return ((gtknphoqwx) y2.iobyxmoadg.eablkybsjg(this.f77835cqumvgiudr)).iobyxmoadg(j13 - this.f77836esjtqupxsv);
    }

    @Override // q4.gtknphoqwx
    public long ppxfxbqfkf(int i13) {
        return ((gtknphoqwx) y2.iobyxmoadg.eablkybsjg(this.f77835cqumvgiudr)).ppxfxbqfkf(i13) + this.f77836esjtqupxsv;
    }

    public void rgvfuqvkyq(long j13, gtknphoqwx gtknphoqwxVar, long j14) {
        this.f30239yggfygwlhe = j13;
        this.f77835cqumvgiudr = gtknphoqwxVar;
        if (j14 != Long.MAX_VALUE) {
            j13 = j14;
        }
        this.f77836esjtqupxsv = j13;
    }

    @Override // q4.gtknphoqwx
    public int wkgbmnqykc() {
        return ((gtknphoqwx) y2.iobyxmoadg.eablkybsjg(this.f77835cqumvgiudr)).wkgbmnqykc();
    }

    @Override // q4.gtknphoqwx
    public List zoijcleaow(long j13) {
        return ((gtknphoqwx) y2.iobyxmoadg.eablkybsjg(this.f77835cqumvgiudr)).zoijcleaow(j13 - this.f77836esjtqupxsv);
    }
}
