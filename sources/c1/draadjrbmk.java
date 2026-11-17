package c1;

/* JADX INFO: loaded from: classes.dex */
public class draadjrbmk extends wflxmlrfwp {
    @Override // c1.wflxmlrfwp
    public void M(int i13, int i14, int i15, int i16) {
        int iJ = J() + K();
        int iL = L() + I();
        if (this.f18229b > 0) {
            iJ += this.f18228a[0].jlmebxxoox();
            iL += this.f18228a[0].lereixgezr();
        }
        int iMax = Math.max(hcddaimhww(), iJ);
        int iMax2 = Math.max(pkzmftpjix(), iL);
        if (i13 != 1073741824) {
            if (i13 == Integer.MIN_VALUE) {
                i14 = Math.min(iMax, i14);
            } else {
                i14 = i13 == 0 ? iMax : 0;
            }
        }
        if (i15 != 1073741824) {
            if (i15 == Integer.MIN_VALUE) {
                i16 = Math.min(iMax2, i16);
            } else {
                i16 = i15 == 0 ? iMax2 : 0;
            }
        }
        R(i14, i16);
        u(i14);
        ezmngbhpjk(i16);
        Q(this.f18229b > 0);
    }

    @Override // c1.eablkybsjg
    public void lqeggnwhkg(z0.wkgbmnqykc wkgbmnqykcVar, boolean z13) {
        super.lqeggnwhkg(wkgbmnqykcVar, z13);
        if (this.f18229b > 0) {
            eablkybsjg eablkybsjgVar = this.f18228a[0];
            eablkybsjgVar.tbqsvytpvh();
            wkgbmnqykc.iobyxmoadg iobyxmoadgVar = wkgbmnqykc.iobyxmoadg.LEFT;
            eablkybsjgVar.btonecajqb(iobyxmoadgVar, this, iobyxmoadgVar);
            wkgbmnqykc.iobyxmoadg iobyxmoadgVar2 = wkgbmnqykc.iobyxmoadg.RIGHT;
            eablkybsjgVar.btonecajqb(iobyxmoadgVar2, this, iobyxmoadgVar2);
            wkgbmnqykc.iobyxmoadg iobyxmoadgVar3 = wkgbmnqykc.iobyxmoadg.TOP;
            eablkybsjgVar.btonecajqb(iobyxmoadgVar3, this, iobyxmoadgVar3);
            wkgbmnqykc.iobyxmoadg iobyxmoadgVar4 = wkgbmnqykc.iobyxmoadg.BOTTOM;
            eablkybsjgVar.btonecajqb(iobyxmoadgVar4, this, iobyxmoadgVar4);
        }
    }
}
