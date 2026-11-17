package j4;

import y2.hcddaimhww;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class lqeggnwhkg extends zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final long f50659iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final long f50660zoijcleaow;

    private lqeggnwhkg(long j13, long j14) {
        this.f50659iobyxmoadg = j13;
        this.f50660zoijcleaow = j14;
    }

    static long eablkybsjg(yadqdtsiqt yadqdtsiqtVar, long j13) {
        long jWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        if ((128 & jWwaezpbzkn) != 0) {
            return 8589934591L & ((((jWwaezpbzkn & 1) << 32) | yadqdtsiqtVar.pkzmftpjix()) + j13);
        }
        return -9223372036854775807L;
    }

    static lqeggnwhkg wkgbmnqykc(yadqdtsiqt yadqdtsiqtVar, long j13, hcddaimhww hcddaimhwwVar) {
        long jEablkybsjg = eablkybsjg(yadqdtsiqtVar, j13);
        return new lqeggnwhkg(jEablkybsjg, hcddaimhwwVar.zoijcleaow(jEablkybsjg));
    }

    @Override // j4.zoijcleaow
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f50659iobyxmoadg + ", playbackPositionUs= " + this.f50660zoijcleaow + " }";
    }
}
