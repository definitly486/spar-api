package a5;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class yadqdtsiqt implements jpowsppfya {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f756eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private boolean f757gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final cdpycssgdh f758iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f759ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private int f760wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final y2.yadqdtsiqt f761zoijcleaow = new y2.yadqdtsiqt(32);

    public yadqdtsiqt(cdpycssgdh cdpycssgdhVar) {
        this.f758iobyxmoadg = cdpycssgdhVar;
    }

    @Override // a5.jpowsppfya
    public void iobyxmoadg(y2.yadqdtsiqt yadqdtsiqtVar, int i13) {
        int iGxszxtbevo;
        boolean z13 = (i13 & 1) != 0;
        if (z13) {
            iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo() + yadqdtsiqtVar.wwaezpbzkn();
        } else {
            iGxszxtbevo = -1;
        }
        if (this.f757gxszxtbevo) {
            if (!z13) {
                return;
            }
            this.f757gxszxtbevo = false;
            yadqdtsiqtVar.sopmlzcsov(iGxszxtbevo);
            this.f760wkgbmnqykc = 0;
        }
        while (yadqdtsiqtVar.iobyxmoadg() > 0) {
            int i14 = this.f760wkgbmnqykc;
            if (i14 < 3) {
                if (i14 == 0) {
                    int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn();
                    yadqdtsiqtVar.sopmlzcsov(yadqdtsiqtVar.gxszxtbevo() - 1);
                    if (iWwaezpbzkn == 255) {
                        this.f757gxszxtbevo = true;
                        return;
                    }
                }
                int iMin = Math.min(yadqdtsiqtVar.iobyxmoadg(), 3 - this.f760wkgbmnqykc);
                yadqdtsiqtVar.draadjrbmk(this.f761zoijcleaow.eablkybsjg(), this.f760wkgbmnqykc, iMin);
                int i15 = this.f760wkgbmnqykc + iMin;
                this.f760wkgbmnqykc = i15;
                if (i15 == 3) {
                    this.f761zoijcleaow.sopmlzcsov(0);
                    this.f761zoijcleaow.ulzqkzuiru(3);
                    this.f761zoijcleaow.crxdokpmqz(1);
                    int iWwaezpbzkn2 = this.f761zoijcleaow.wwaezpbzkn();
                    int iWwaezpbzkn3 = this.f761zoijcleaow.wwaezpbzkn();
                    this.f756eablkybsjg = (iWwaezpbzkn2 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
                    this.f759ppxfxbqfkf = (((iWwaezpbzkn2 & 15) << 8) | iWwaezpbzkn3) + 3;
                    int iZoijcleaow = this.f761zoijcleaow.zoijcleaow();
                    int i16 = this.f759ppxfxbqfkf;
                    if (iZoijcleaow < i16) {
                        this.f761zoijcleaow.ppxfxbqfkf(Math.min(4098, Math.max(i16, this.f761zoijcleaow.zoijcleaow() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(yadqdtsiqtVar.iobyxmoadg(), this.f759ppxfxbqfkf - this.f760wkgbmnqykc);
                yadqdtsiqtVar.draadjrbmk(this.f761zoijcleaow.eablkybsjg(), this.f760wkgbmnqykc, iMin2);
                int i17 = this.f760wkgbmnqykc + iMin2;
                this.f760wkgbmnqykc = i17;
                int i18 = this.f759ppxfxbqfkf;
                if (i17 != i18) {
                    continue;
                } else {
                    if (!this.f756eablkybsjg) {
                        this.f761zoijcleaow.ulzqkzuiru(i18);
                    } else {
                        if (stevsuqkhv.iwizpuwonk(this.f761zoijcleaow.eablkybsjg(), 0, this.f759ppxfxbqfkf, -1) != 0) {
                            this.f757gxszxtbevo = true;
                            return;
                        }
                        this.f761zoijcleaow.ulzqkzuiru(this.f759ppxfxbqfkf - 4);
                    }
                    this.f761zoijcleaow.sopmlzcsov(0);
                    this.f758iobyxmoadg.iobyxmoadg(this.f761zoijcleaow);
                    this.f760wkgbmnqykc = 0;
                }
            }
        }
    }

    @Override // a5.jpowsppfya
    public void ppxfxbqfkf() {
        this.f757gxszxtbevo = true;
    }

    @Override // a5.jpowsppfya
    public void zoijcleaow(y2.hcddaimhww hcddaimhwwVar, t3.oxmwwwfdhm oxmwwwfdhmVar, jpowsppfya.wkgbmnqykc wkgbmnqykcVar) {
        this.f758iobyxmoadg.zoijcleaow(hcddaimhwwVar, oxmwwwfdhmVar, wkgbmnqykcVar);
        this.f757gxszxtbevo = true;
    }
}
