package a5;

import android.util.SparseArray;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final class istkbnxepw implements t3.rgvfuqvkyq {

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public static final t3.yggfygwlhe f530draadjrbmk = new t3.yggfygwlhe() { // from class: a5.zynmafqrjb
        @Override // t3.yggfygwlhe
        public final t3.rgvfuqvkyq[] lqeggnwhkg() {
            return istkbnxepw.gxszxtbevo();
        }
    };

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private t3.oxmwwwfdhm f531btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private lereixgezr f532dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f533eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private boolean f534gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f535gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final y2.hcddaimhww f536iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f537lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f538nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y2.yadqdtsiqt f539ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final pmvmpeiblj f540wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final SparseArray f541zoijcleaow;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f542eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f543gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final wflxmlrfwp f544iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f545lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private long f546nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final y2.cdpycssgdh f547ppxfxbqfkf = new y2.cdpycssgdh(new byte[64]);

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private boolean f548wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final y2.hcddaimhww f549zoijcleaow;

        public iobyxmoadg(wflxmlrfwp wflxmlrfwpVar, y2.hcddaimhww hcddaimhwwVar) {
            this.f544iobyxmoadg = wflxmlrfwpVar;
            this.f549zoijcleaow = hcddaimhwwVar;
        }

        private void ppxfxbqfkf() {
            this.f546nufgyqmvbu = 0L;
            if (this.f548wkgbmnqykc) {
                this.f547ppxfxbqfkf.oxmwwwfdhm(4);
                long jNufgyqmvbu = ((long) this.f547ppxfxbqfkf.nufgyqmvbu(3)) << 30;
                this.f547ppxfxbqfkf.oxmwwwfdhm(1);
                long jNufgyqmvbu2 = jNufgyqmvbu | ((long) (this.f547ppxfxbqfkf.nufgyqmvbu(15) << 15));
                this.f547ppxfxbqfkf.oxmwwwfdhm(1);
                long jNufgyqmvbu3 = jNufgyqmvbu2 | ((long) this.f547ppxfxbqfkf.nufgyqmvbu(15));
                this.f547ppxfxbqfkf.oxmwwwfdhm(1);
                if (!this.f543gxszxtbevo && this.f542eablkybsjg) {
                    this.f547ppxfxbqfkf.oxmwwwfdhm(4);
                    long jNufgyqmvbu4 = ((long) this.f547ppxfxbqfkf.nufgyqmvbu(3)) << 30;
                    this.f547ppxfxbqfkf.oxmwwwfdhm(1);
                    long jNufgyqmvbu5 = jNufgyqmvbu4 | ((long) (this.f547ppxfxbqfkf.nufgyqmvbu(15) << 15));
                    this.f547ppxfxbqfkf.oxmwwwfdhm(1);
                    long jNufgyqmvbu6 = jNufgyqmvbu5 | ((long) this.f547ppxfxbqfkf.nufgyqmvbu(15));
                    this.f547ppxfxbqfkf.oxmwwwfdhm(1);
                    this.f549zoijcleaow.zoijcleaow(jNufgyqmvbu6);
                    this.f543gxszxtbevo = true;
                }
                this.f546nufgyqmvbu = this.f549zoijcleaow.zoijcleaow(jNufgyqmvbu3);
            }
        }

        private void zoijcleaow() {
            this.f547ppxfxbqfkf.oxmwwwfdhm(8);
            this.f548wkgbmnqykc = this.f547ppxfxbqfkf.lqeggnwhkg();
            this.f542eablkybsjg = this.f547ppxfxbqfkf.lqeggnwhkg();
            this.f547ppxfxbqfkf.oxmwwwfdhm(6);
            this.f545lqeggnwhkg = this.f547ppxfxbqfkf.nufgyqmvbu(8);
        }

        public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar) {
            yadqdtsiqtVar.draadjrbmk(this.f547ppxfxbqfkf.f123526iobyxmoadg, 0, 3);
            this.f547ppxfxbqfkf.rgvfuqvkyq(0);
            zoijcleaow();
            yadqdtsiqtVar.draadjrbmk(this.f547ppxfxbqfkf.f123526iobyxmoadg, 0, this.f545lqeggnwhkg);
            this.f547ppxfxbqfkf.rgvfuqvkyq(0);
            ppxfxbqfkf();
            this.f544iobyxmoadg.eablkybsjg(this.f546nufgyqmvbu, 4);
            this.f544iobyxmoadg.iobyxmoadg(yadqdtsiqtVar);
            this.f544iobyxmoadg.wkgbmnqykc(false);
        }

        public void wkgbmnqykc() {
            this.f543gxszxtbevo = false;
            this.f544iobyxmoadg.ppxfxbqfkf();
        }
    }

    public istkbnxepw() {
        this(new y2.hcddaimhww(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ t3.rgvfuqvkyq[] gxszxtbevo() {
        return new t3.rgvfuqvkyq[]{new istkbnxepw()};
    }

    private void lqeggnwhkg(long j13) {
        if (this.f534gtknphoqwx) {
            return;
        }
        this.f534gtknphoqwx = true;
        if (this.f540wkgbmnqykc.ppxfxbqfkf() == -9223372036854775807L) {
            this.f531btonecajqb.gxszxtbevo(new t3.pkzmftpjix.zoijcleaow(this.f540wkgbmnqykc.ppxfxbqfkf()));
            return;
        }
        lereixgezr lereixgezrVar = new lereixgezr(this.f540wkgbmnqykc.wkgbmnqykc(), this.f540wkgbmnqykc.ppxfxbqfkf(), j13);
        this.f532dxjokdxxww = lereixgezrVar;
        this.f531btonecajqb.gxszxtbevo(lereixgezrVar.zoijcleaow());
    }

    @Override // t3.rgvfuqvkyq
    public boolean draadjrbmk(t3.vdvldrhtss vdvldrhtssVar) {
        byte[] bArr = new byte[14];
        vdvldrhtssVar.ojitshcjhn(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        vdvldrhtssVar.dxjokdxxww(bArr[13] & 7);
        vdvldrhtssVar.ojitshcjhn(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // t3.rgvfuqvkyq
    public void iobyxmoadg(long j13, long j14) {
        boolean z13 = this.f536iobyxmoadg.gxszxtbevo() == -9223372036854775807L;
        if (!z13) {
            long jWkgbmnqykc = this.f536iobyxmoadg.wkgbmnqykc();
            z13 = (jWkgbmnqykc == -9223372036854775807L || jWkgbmnqykc == 0 || jWkgbmnqykc == j14) ? false : true;
        }
        if (z13) {
            this.f536iobyxmoadg.dxjokdxxww(j14);
        }
        lereixgezr lereixgezrVar = this.f532dxjokdxxww;
        if (lereixgezrVar != null) {
            lereixgezrVar.nufgyqmvbu(j14);
        }
        for (int i13 = 0; i13 < this.f541zoijcleaow.size(); i13++) {
            ((iobyxmoadg) this.f541zoijcleaow.valueAt(i13)).wkgbmnqykc();
        }
    }

    @Override // t3.rgvfuqvkyq
    public void ppxfxbqfkf(t3.oxmwwwfdhm oxmwwwfdhmVar) {
        this.f531btonecajqb = oxmwwwfdhmVar;
    }

    @Override // t3.rgvfuqvkyq
    public void release() {
    }

    @Override // t3.rgvfuqvkyq
    public int zoijcleaow(t3.vdvldrhtss vdvldrhtssVar, t3.ylkuphrtab ylkuphrtabVar) {
        wflxmlrfwp agtfadlqogVar;
        y2.iobyxmoadg.dxjokdxxww(this.f531btonecajqb);
        long length = vdvldrhtssVar.getLength();
        if (length != -1 && !this.f540wkgbmnqykc.eablkybsjg()) {
            return this.f540wkgbmnqykc.lqeggnwhkg(vdvldrhtssVar, ylkuphrtabVar);
        }
        lqeggnwhkg(length);
        lereixgezr lereixgezrVar = this.f532dxjokdxxww;
        if (lereixgezrVar != null && lereixgezrVar.wkgbmnqykc()) {
            return this.f532dxjokdxxww.ppxfxbqfkf(vdvldrhtssVar, ylkuphrtabVar);
        }
        vdvldrhtssVar.gxszxtbevo();
        long jNufgyqmvbu = length != -1 ? length - vdvldrhtssVar.nufgyqmvbu() : -1L;
        if ((jNufgyqmvbu != -1 && jNufgyqmvbu < 4) || !vdvldrhtssVar.ppxfxbqfkf(this.f539ppxfxbqfkf.eablkybsjg(), 0, 4, true)) {
            return -1;
        }
        this.f539ppxfxbqfkf.sopmlzcsov(0);
        int iVdvldrhtss = this.f539ppxfxbqfkf.vdvldrhtss();
        if (iVdvldrhtss == 441) {
            return -1;
        }
        if (iVdvldrhtss == 442) {
            vdvldrhtssVar.ojitshcjhn(this.f539ppxfxbqfkf.eablkybsjg(), 0, 10);
            this.f539ppxfxbqfkf.sopmlzcsov(9);
            vdvldrhtssVar.draadjrbmk((this.f539ppxfxbqfkf.wwaezpbzkn() & 7) + 14);
            return 0;
        }
        if (iVdvldrhtss == 443) {
            vdvldrhtssVar.ojitshcjhn(this.f539ppxfxbqfkf.eablkybsjg(), 0, 2);
            this.f539ppxfxbqfkf.sopmlzcsov(0);
            vdvldrhtssVar.draadjrbmk(this.f539ppxfxbqfkf.wypolnanlu() + 6);
            return 0;
        }
        if (((iVdvldrhtss & (-256)) >> 8) != 1) {
            vdvldrhtssVar.draadjrbmk(1);
            return 0;
        }
        int i13 = iVdvldrhtss & KotlinVersion.MAX_COMPONENT_VALUE;
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f541zoijcleaow.get(i13);
        if (!this.f533eablkybsjg) {
            if (iobyxmoadgVar == null) {
                if (i13 == 189) {
                    agtfadlqogVar = new ppxfxbqfkf("video/mp2p");
                    this.f535gxszxtbevo = true;
                    this.f538nufgyqmvbu = vdvldrhtssVar.getPosition();
                } else if ((iVdvldrhtss & 224) == 192) {
                    agtfadlqogVar = new zdlpuopuiu("video/mp2p");
                    this.f535gxszxtbevo = true;
                    this.f538nufgyqmvbu = vdvldrhtssVar.getPosition();
                } else if ((iVdvldrhtss & 240) == 224) {
                    agtfadlqogVar = new agtfadlqog("video/mp2p");
                    this.f537lqeggnwhkg = true;
                    this.f538nufgyqmvbu = vdvldrhtssVar.getPosition();
                } else {
                    agtfadlqogVar = null;
                }
                if (agtfadlqogVar != null) {
                    agtfadlqogVar.gxszxtbevo(this.f531btonecajqb, new jpowsppfya.wkgbmnqykc(i13, UserVerificationMethods.USER_VERIFY_HANDPRINT));
                    iobyxmoadgVar = new iobyxmoadg(agtfadlqogVar, this.f536iobyxmoadg);
                    this.f541zoijcleaow.put(i13, iobyxmoadgVar);
                }
            }
            if (vdvldrhtssVar.getPosition() > ((this.f535gxszxtbevo && this.f537lqeggnwhkg) ? this.f538nufgyqmvbu + 8192 : 1048576L)) {
                this.f533eablkybsjg = true;
                this.f531btonecajqb.agtfadlqog();
            }
        }
        vdvldrhtssVar.ojitshcjhn(this.f539ppxfxbqfkf.eablkybsjg(), 0, 2);
        this.f539ppxfxbqfkf.sopmlzcsov(0);
        int iWypolnanlu = this.f539ppxfxbqfkf.wypolnanlu() + 6;
        if (iobyxmoadgVar == null) {
            vdvldrhtssVar.draadjrbmk(iWypolnanlu);
        } else {
            this.f539ppxfxbqfkf.tzroggbefp(iWypolnanlu);
            vdvldrhtssVar.readFully(this.f539ppxfxbqfkf.eablkybsjg(), 0, iWypolnanlu);
            this.f539ppxfxbqfkf.sopmlzcsov(6);
            iobyxmoadgVar.iobyxmoadg(this.f539ppxfxbqfkf);
            y2.yadqdtsiqt yadqdtsiqtVar = this.f539ppxfxbqfkf;
            yadqdtsiqtVar.ulzqkzuiru(yadqdtsiqtVar.zoijcleaow());
        }
        return 0;
    }

    public istkbnxepw(y2.hcddaimhww hcddaimhwwVar) {
        this.f536iobyxmoadg = hcddaimhwwVar;
        this.f539ppxfxbqfkf = new y2.yadqdtsiqt(4096);
        this.f541zoijcleaow = new SparseArray();
        this.f540wkgbmnqykc = new pmvmpeiblj();
    }
}
