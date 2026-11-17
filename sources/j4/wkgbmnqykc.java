package j4;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y2.hcddaimhww;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class wkgbmnqykc extends j4.zoijcleaow {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final long f50664btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final int f50665draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final boolean f50666dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final boolean f50667eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final int f50668gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final long f50669gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final long f50670iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final long f50671lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final List f50672nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final boolean f50673ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final int f50674wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final boolean f50675wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final boolean f50676zoijcleaow;

    public static final class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f50677iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public final long f50678ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final long f50679zoijcleaow;

        private zoijcleaow(int i13, long j13, long j14) {
            this.f50677iobyxmoadg = i13;
            this.f50679zoijcleaow = j13;
            this.f50678ppxfxbqfkf = j14;
        }
    }

    private wkgbmnqykc(long j13, boolean z13, boolean z14, boolean z15, boolean z16, long j14, long j15, List list, boolean z17, long j16, int i13, int i14, int i15) {
        this.f50670iobyxmoadg = j13;
        this.f50676zoijcleaow = z13;
        this.f50673ppxfxbqfkf = z14;
        this.f50675wkgbmnqykc = z15;
        this.f50667eablkybsjg = z16;
        this.f50669gxszxtbevo = j14;
        this.f50671lqeggnwhkg = j15;
        this.f50672nufgyqmvbu = Collections.unmodifiableList(list);
        this.f50666dxjokdxxww = z17;
        this.f50664btonecajqb = j16;
        this.f50668gtknphoqwx = i13;
        this.f50665draadjrbmk = i14;
        this.f50674wflxmlrfwp = i15;
    }

    static wkgbmnqykc wkgbmnqykc(yadqdtsiqt yadqdtsiqtVar, long j13, hcddaimhww hcddaimhwwVar) {
        List list;
        boolean z13;
        boolean z14;
        long j14;
        boolean z15;
        long j15;
        int iWypolnanlu;
        int iWwaezpbzkn;
        int iWwaezpbzkn2;
        boolean z16;
        boolean z17;
        long jPkzmftpjix;
        long jPkzmftpjix2 = yadqdtsiqtVar.pkzmftpjix();
        boolean z18 = (yadqdtsiqtVar.wwaezpbzkn() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
        List listEmptyList = Collections.emptyList();
        if (z18) {
            list = listEmptyList;
            z13 = false;
            z14 = false;
            j14 = -9223372036854775807L;
            z15 = false;
            j15 = -9223372036854775807L;
            iWypolnanlu = 0;
            iWwaezpbzkn = 0;
            iWwaezpbzkn2 = 0;
            z16 = false;
        } else {
            int iWwaezpbzkn3 = yadqdtsiqtVar.wwaezpbzkn();
            boolean z19 = (iWwaezpbzkn3 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
            boolean z23 = (iWwaezpbzkn3 & 64) != 0;
            boolean z24 = (iWwaezpbzkn3 & 32) != 0;
            boolean z25 = (iWwaezpbzkn3 & 16) != 0;
            long jEablkybsjg = (!z23 || z25) ? -9223372036854775807L : lqeggnwhkg.eablkybsjg(yadqdtsiqtVar, j13);
            if (!z23) {
                int iWwaezpbzkn4 = yadqdtsiqtVar.wwaezpbzkn();
                ArrayList arrayList = new ArrayList(iWwaezpbzkn4);
                for (int i13 = 0; i13 < iWwaezpbzkn4; i13++) {
                    int iWwaezpbzkn5 = yadqdtsiqtVar.wwaezpbzkn();
                    long jEablkybsjg2 = !z25 ? lqeggnwhkg.eablkybsjg(yadqdtsiqtVar, j13) : -9223372036854775807L;
                    arrayList.add(new zoijcleaow(iWwaezpbzkn5, jEablkybsjg2, hcddaimhwwVar.zoijcleaow(jEablkybsjg2)));
                }
                listEmptyList = arrayList;
            }
            if (z24) {
                long jWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
                boolean z26 = (128 & jWwaezpbzkn) != 0;
                jPkzmftpjix = ((((jWwaezpbzkn & 1) << 32) | yadqdtsiqtVar.pkzmftpjix()) * 1000) / 90;
                z17 = z26;
            } else {
                z17 = false;
                jPkzmftpjix = -9223372036854775807L;
            }
            iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
            z16 = z23;
            iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
            iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
            list = listEmptyList;
            long j16 = jEablkybsjg;
            z15 = z17;
            j15 = jPkzmftpjix;
            z14 = z25;
            z13 = z19;
            j14 = j16;
        }
        return new wkgbmnqykc(jPkzmftpjix2, z18, z13, z16, z14, j14, hcddaimhwwVar.zoijcleaow(j14), list, z15, j15, iWypolnanlu, iWwaezpbzkn, iWwaezpbzkn2);
    }

    @Override // j4.zoijcleaow
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f50669gxszxtbevo + ", programSplicePlaybackPositionUs= " + this.f50671lqeggnwhkg + " }";
    }
}
