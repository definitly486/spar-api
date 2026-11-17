package t4;

import android.graphics.Bitmap;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;
import q4.eablkybsjg;
import q4.oxmwwwfdhm;
import y2.stevsuqkhv;
import y2.wflxmlrfwp;
import y2.yadqdtsiqt;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg implements oxmwwwfdhm {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Inflater f109615wkgbmnqykc;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final yadqdtsiqt f109613iobyxmoadg = new yadqdtsiqt();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yadqdtsiqt f109616zoijcleaow = new yadqdtsiqt();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final C2692iobyxmoadg f109614ppxfxbqfkf = new C2692iobyxmoadg();

    /* JADX INFO: renamed from: t4.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    private static final class C2692iobyxmoadg {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private int f109617dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private int f109618eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private int f109619gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private int f109621lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private int f109622nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private boolean f109623ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private int f109624wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final yadqdtsiqt f109620iobyxmoadg = new yadqdtsiqt();

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final int[] f109625zoijcleaow = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];

        /* JADX INFO: Access modifiers changed from: private */
        public void eablkybsjg(yadqdtsiqt yadqdtsiqtVar, int i13) {
            int iHcddaimhww;
            if (i13 < 4) {
                return;
            }
            yadqdtsiqtVar.crxdokpmqz(3);
            int i14 = i13 - 4;
            if ((yadqdtsiqtVar.wwaezpbzkn() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                if (i14 < 7 || (iHcddaimhww = yadqdtsiqtVar.hcddaimhww()) < 4) {
                    return;
                }
                this.f109622nufgyqmvbu = yadqdtsiqtVar.wypolnanlu();
                this.f109617dxjokdxxww = yadqdtsiqtVar.wypolnanlu();
                this.f109620iobyxmoadg.tzroggbefp(iHcddaimhww - 4);
                i14 = i13 - 11;
            }
            int iGxszxtbevo = this.f109620iobyxmoadg.gxszxtbevo();
            int iLqeggnwhkg = this.f109620iobyxmoadg.lqeggnwhkg();
            if (iGxszxtbevo >= iLqeggnwhkg || i14 <= 0) {
                return;
            }
            int iMin = Math.min(i14, iLqeggnwhkg - iGxszxtbevo);
            yadqdtsiqtVar.draadjrbmk(this.f109620iobyxmoadg.eablkybsjg(), iGxszxtbevo, iMin);
            this.f109620iobyxmoadg.sopmlzcsov(iGxszxtbevo + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gxszxtbevo(yadqdtsiqt yadqdtsiqtVar, int i13) {
            if (i13 < 19) {
                return;
            }
            this.f109624wkgbmnqykc = yadqdtsiqtVar.wypolnanlu();
            this.f109618eablkybsjg = yadqdtsiqtVar.wypolnanlu();
            yadqdtsiqtVar.crxdokpmqz(11);
            this.f109619gxszxtbevo = yadqdtsiqtVar.wypolnanlu();
            this.f109621lqeggnwhkg = yadqdtsiqtVar.wypolnanlu();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lqeggnwhkg(yadqdtsiqt yadqdtsiqtVar, int i13) {
            if (i13 % 5 != 2) {
                return;
            }
            yadqdtsiqtVar.crxdokpmqz(2);
            Arrays.fill(this.f109625zoijcleaow, 0);
            int i14 = i13 / 5;
            for (int i15 = 0; i15 < i14; i15++) {
                int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
                int iWwaezpbzkn2 = yadqdtsiqtVar.wwaezpbzkn();
                int iWwaezpbzkn3 = yadqdtsiqtVar.wwaezpbzkn();
                int iWwaezpbzkn4 = yadqdtsiqtVar.wwaezpbzkn();
                double d13 = iWwaezpbzkn2;
                double d14 = iWwaezpbzkn3 - 128;
                double d15 = iWwaezpbzkn4 - 128;
                this.f109625zoijcleaow[iWwaezpbzkn] = (stevsuqkhv.ojitshcjhn((int) ((d13 - (0.34414d * d15)) - (d14 * 0.71414d)), 0, KotlinVersion.MAX_COMPONENT_VALUE) << 8) | (yadqdtsiqtVar.wwaezpbzkn() << 24) | (stevsuqkhv.ojitshcjhn((int) ((1.402d * d14) + d13), 0, KotlinVersion.MAX_COMPONENT_VALUE) << 16) | stevsuqkhv.ojitshcjhn((int) (d13 + (d15 * 1.772d)), 0, KotlinVersion.MAX_COMPONENT_VALUE);
            }
            this.f109623ppxfxbqfkf = true;
        }

        public void nufgyqmvbu() {
            this.f109624wkgbmnqykc = 0;
            this.f109618eablkybsjg = 0;
            this.f109619gxszxtbevo = 0;
            this.f109621lqeggnwhkg = 0;
            this.f109622nufgyqmvbu = 0;
            this.f109617dxjokdxxww = 0;
            this.f109620iobyxmoadg.tzroggbefp(0);
            this.f109623ppxfxbqfkf = false;
        }

        public x2.iobyxmoadg wkgbmnqykc() {
            int iWwaezpbzkn;
            if (this.f109624wkgbmnqykc == 0 || this.f109618eablkybsjg == 0 || this.f109622nufgyqmvbu == 0 || this.f109617dxjokdxxww == 0 || this.f109620iobyxmoadg.lqeggnwhkg() == 0 || this.f109620iobyxmoadg.gxszxtbevo() != this.f109620iobyxmoadg.lqeggnwhkg() || !this.f109623ppxfxbqfkf) {
                return null;
            }
            this.f109620iobyxmoadg.sopmlzcsov(0);
            int i13 = this.f109622nufgyqmvbu * this.f109617dxjokdxxww;
            int[] iArr = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int iWwaezpbzkn2 = this.f109620iobyxmoadg.wwaezpbzkn();
                if (iWwaezpbzkn2 != 0) {
                    iWwaezpbzkn = i14 + 1;
                    iArr[i14] = this.f109625zoijcleaow[iWwaezpbzkn2];
                } else {
                    int iWwaezpbzkn3 = this.f109620iobyxmoadg.wwaezpbzkn();
                    if (iWwaezpbzkn3 != 0) {
                        iWwaezpbzkn = ((iWwaezpbzkn3 & 64) == 0 ? iWwaezpbzkn3 & 63 : ((iWwaezpbzkn3 & 63) << 8) | this.f109620iobyxmoadg.wwaezpbzkn()) + i14;
                        Arrays.fill(iArr, i14, iWwaezpbzkn, (iWwaezpbzkn3 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0 ? this.f109625zoijcleaow[0] : this.f109625zoijcleaow[this.f109620iobyxmoadg.wwaezpbzkn()]);
                    }
                }
                i14 = iWwaezpbzkn;
            }
            return new x2.iobyxmoadg.zoijcleaow().gxszxtbevo(Bitmap.createBitmap(iArr, this.f109622nufgyqmvbu, this.f109617dxjokdxxww, Bitmap.Config.ARGB_8888)).gtknphoqwx(this.f109619gxszxtbevo / this.f109624wkgbmnqykc).draadjrbmk(0).nufgyqmvbu(this.f109621lqeggnwhkg / this.f109618eablkybsjg, 0).dxjokdxxww(0).agtfadlqog(this.f109622nufgyqmvbu / this.f109624wkgbmnqykc).lqeggnwhkg(this.f109617dxjokdxxww / this.f109618eablkybsjg).iobyxmoadg();
        }
    }

    private static x2.iobyxmoadg eablkybsjg(yadqdtsiqt yadqdtsiqtVar, C2692iobyxmoadg c2692iobyxmoadg) {
        int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
        int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
        int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
        int iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo() + iWypolnanlu;
        x2.iobyxmoadg iobyxmoadgVarWkgbmnqykc = null;
        if (iGxszxtbevo > iLqeggnwhkg) {
            yadqdtsiqtVar.sopmlzcsov(iLqeggnwhkg);
            return null;
        }
        if (iWwaezpbzkn != 128) {
            switch (iWwaezpbzkn) {
                case 20:
                    c2692iobyxmoadg.lqeggnwhkg(yadqdtsiqtVar, iWypolnanlu);
                    break;
                case 21:
                    c2692iobyxmoadg.eablkybsjg(yadqdtsiqtVar, iWypolnanlu);
                    break;
                case 22:
                    c2692iobyxmoadg.gxszxtbevo(yadqdtsiqtVar, iWypolnanlu);
                    break;
            }
        } else {
            iobyxmoadgVarWkgbmnqykc = c2692iobyxmoadg.wkgbmnqykc();
            c2692iobyxmoadg.nufgyqmvbu();
        }
        yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
        return iobyxmoadgVarWkgbmnqykc;
    }

    @Override // q4.oxmwwwfdhm
    public void ppxfxbqfkf(byte[] bArr, int i13, int i14, oxmwwwfdhm.zoijcleaow zoijcleaowVar, wflxmlrfwp wflxmlrfwpVar) {
        this.f109613iobyxmoadg.ntlheqmsrt(bArr, i14 + i13);
        this.f109613iobyxmoadg.sopmlzcsov(i13);
        if (this.f109615wkgbmnqykc == null) {
            this.f109615wkgbmnqykc = new Inflater();
        }
        if (stevsuqkhv.grlcpdaxtj(this.f109613iobyxmoadg, this.f109616zoijcleaow, this.f109615wkgbmnqykc)) {
            this.f109613iobyxmoadg.ntlheqmsrt(this.f109616zoijcleaow.eablkybsjg(), this.f109616zoijcleaow.lqeggnwhkg());
        }
        this.f109614ppxfxbqfkf.nufgyqmvbu();
        ArrayList arrayList = new ArrayList();
        while (this.f109613iobyxmoadg.iobyxmoadg() >= 3) {
            x2.iobyxmoadg iobyxmoadgVarEablkybsjg = eablkybsjg(this.f109613iobyxmoadg, this.f109614ppxfxbqfkf);
            if (iobyxmoadgVarEablkybsjg != null) {
                arrayList.add(iobyxmoadgVarEablkybsjg);
            }
        }
        wflxmlrfwpVar.accept(new eablkybsjg(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // q4.oxmwwwfdhm
    public int wkgbmnqykc() {
        return 2;
    }
}
