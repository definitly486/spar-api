package v3;

import y2.kcexrzcfyt;
import y2.stevsuqkhv;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
final class wkgbmnqykc implements iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final int f115880eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final int f115881gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final int f115882iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final int f115883lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final int f115884ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final int f115885wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final int f115886zoijcleaow;

    private wkgbmnqykc(int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f115882iobyxmoadg = i13;
        this.f115886zoijcleaow = i14;
        this.f115884ppxfxbqfkf = i15;
        this.f115885wkgbmnqykc = i16;
        this.f115880eablkybsjg = i17;
        this.f115881gxszxtbevo = i18;
        this.f115883lqeggnwhkg = i19;
    }

    public static wkgbmnqykc ppxfxbqfkf(yadqdtsiqt yadqdtsiqtVar) {
        int iYggfygwlhe = yadqdtsiqtVar.yggfygwlhe();
        yadqdtsiqtVar.crxdokpmqz(12);
        int iYggfygwlhe2 = yadqdtsiqtVar.yggfygwlhe();
        int iYggfygwlhe3 = yadqdtsiqtVar.yggfygwlhe();
        int iYggfygwlhe4 = yadqdtsiqtVar.yggfygwlhe();
        yadqdtsiqtVar.crxdokpmqz(4);
        int iYggfygwlhe5 = yadqdtsiqtVar.yggfygwlhe();
        int iYggfygwlhe6 = yadqdtsiqtVar.yggfygwlhe();
        yadqdtsiqtVar.crxdokpmqz(4);
        return new wkgbmnqykc(iYggfygwlhe, iYggfygwlhe2, iYggfygwlhe3, iYggfygwlhe4, iYggfygwlhe5, iYggfygwlhe6, yadqdtsiqtVar.yggfygwlhe());
    }

    @Override // v3.iobyxmoadg
    public int getType() {
        return 1752331379;
    }

    public long iobyxmoadg() {
        return stevsuqkhv.b(this.f115880eablkybsjg, ((long) this.f115884ppxfxbqfkf) * 1000000, this.f115885wkgbmnqykc);
    }

    public int zoijcleaow() {
        int i13 = this.f115882iobyxmoadg;
        if (i13 == 1935960438) {
            return 2;
        }
        if (i13 == 1935963489) {
            return 1;
        }
        if (i13 == 1937012852) {
            return 3;
        }
        kcexrzcfyt.nufgyqmvbu("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f115882iobyxmoadg));
        return -1;
    }
}
