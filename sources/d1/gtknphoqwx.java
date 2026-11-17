package d1;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class gtknphoqwx extends rgvfuqvkyq {
    gtknphoqwx(c1.eablkybsjg eablkybsjgVar) {
        super(eablkybsjgVar);
    }

    private void vdvldrhtss(gxszxtbevo gxszxtbevoVar) {
        this.f26647nufgyqmvbu.f26604gtknphoqwx.add(gxszxtbevoVar);
        gxszxtbevoVar.f26601draadjrbmk.add(this.f26647nufgyqmvbu);
    }

    @Override // d1.rgvfuqvkyq
    public void eablkybsjg() {
        c1.eablkybsjg eablkybsjgVar = this.f26650zoijcleaow;
        if (eablkybsjgVar instanceof c1.iobyxmoadg) {
            int iF = ((c1.iobyxmoadg) eablkybsjgVar).F();
            if (iF == 0 || iF == 1) {
                this.f26650zoijcleaow.w(this.f26647nufgyqmvbu.f26607lqeggnwhkg);
            } else {
                this.f26650zoijcleaow.x(this.f26647nufgyqmvbu.f26607lqeggnwhkg);
            }
        }
    }

    @Override // d1.rgvfuqvkyq
    void gxszxtbevo() {
        this.f26648ppxfxbqfkf = null;
        this.f26647nufgyqmvbu.ppxfxbqfkf();
    }

    @Override // d1.rgvfuqvkyq, d1.wkgbmnqykc
    public void iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
        c1.iobyxmoadg iobyxmoadgVar = (c1.iobyxmoadg) this.f26650zoijcleaow;
        int iF = iobyxmoadgVar.F();
        Iterator it = this.f26647nufgyqmvbu.f26601draadjrbmk.iterator();
        int i13 = 0;
        int i14 = -1;
        while (it.hasNext()) {
            int i15 = ((gxszxtbevo) it.next()).f26607lqeggnwhkg;
            if (i14 == -1 || i15 < i14) {
                i14 = i15;
            }
            if (i13 < i15) {
                i13 = i15;
            }
        }
        if (iF == 0 || iF == 2) {
            this.f26647nufgyqmvbu.wkgbmnqykc(i14 + iobyxmoadgVar.G());
        } else {
            this.f26647nufgyqmvbu.wkgbmnqykc(i13 + iobyxmoadgVar.G());
        }
    }

    @Override // d1.rgvfuqvkyq
    boolean wflxmlrfwp() {
        return false;
    }

    @Override // d1.rgvfuqvkyq
    void wkgbmnqykc() {
        c1.eablkybsjg eablkybsjgVar = this.f26650zoijcleaow;
        if (eablkybsjgVar instanceof c1.iobyxmoadg) {
            this.f26647nufgyqmvbu.f26611zoijcleaow = true;
            c1.iobyxmoadg iobyxmoadgVar = (c1.iobyxmoadg) eablkybsjgVar;
            int iF = iobyxmoadgVar.F();
            boolean zE = iobyxmoadgVar.E();
            int i13 = 0;
            if (iF == 0) {
                this.f26647nufgyqmvbu.f26603eablkybsjg = gxszxtbevo.iobyxmoadg.LEFT;
                while (i13 < iobyxmoadgVar.f18229b) {
                    c1.eablkybsjg eablkybsjgVar2 = iobyxmoadgVar.f18228a[i13];
                    if (zE || eablkybsjgVar2.crxdokpmqz() != 8) {
                        gxszxtbevo gxszxtbevoVar = eablkybsjgVar2.f18245eablkybsjg.f26647nufgyqmvbu;
                        gxszxtbevoVar.f26604gtknphoqwx.add(this.f26647nufgyqmvbu);
                        this.f26647nufgyqmvbu.f26601draadjrbmk.add(gxszxtbevoVar);
                    }
                    i13++;
                }
                vdvldrhtss(this.f26650zoijcleaow.f18245eablkybsjg.f26647nufgyqmvbu);
                vdvldrhtss(this.f26650zoijcleaow.f18245eablkybsjg.f26642dxjokdxxww);
                return;
            }
            if (iF == 1) {
                this.f26647nufgyqmvbu.f26603eablkybsjg = gxszxtbevo.iobyxmoadg.RIGHT;
                while (i13 < iobyxmoadgVar.f18229b) {
                    c1.eablkybsjg eablkybsjgVar3 = iobyxmoadgVar.f18228a[i13];
                    if (zE || eablkybsjgVar3.crxdokpmqz() != 8) {
                        gxszxtbevo gxszxtbevoVar2 = eablkybsjgVar3.f18245eablkybsjg.f26642dxjokdxxww;
                        gxszxtbevoVar2.f26604gtknphoqwx.add(this.f26647nufgyqmvbu);
                        this.f26647nufgyqmvbu.f26601draadjrbmk.add(gxszxtbevoVar2);
                    }
                    i13++;
                }
                vdvldrhtss(this.f26650zoijcleaow.f18245eablkybsjg.f26647nufgyqmvbu);
                vdvldrhtss(this.f26650zoijcleaow.f18245eablkybsjg.f26642dxjokdxxww);
                return;
            }
            if (iF == 2) {
                this.f26647nufgyqmvbu.f26603eablkybsjg = gxszxtbevo.iobyxmoadg.TOP;
                while (i13 < iobyxmoadgVar.f18229b) {
                    c1.eablkybsjg eablkybsjgVar4 = iobyxmoadgVar.f18228a[i13];
                    if (zE || eablkybsjgVar4.crxdokpmqz() != 8) {
                        gxszxtbevo gxszxtbevoVar3 = eablkybsjgVar4.f18254gxszxtbevo.f26647nufgyqmvbu;
                        gxszxtbevoVar3.f26604gtknphoqwx.add(this.f26647nufgyqmvbu);
                        this.f26647nufgyqmvbu.f26601draadjrbmk.add(gxszxtbevoVar3);
                    }
                    i13++;
                }
                vdvldrhtss(this.f26650zoijcleaow.f18254gxszxtbevo.f26647nufgyqmvbu);
                vdvldrhtss(this.f26650zoijcleaow.f18254gxszxtbevo.f26642dxjokdxxww);
                return;
            }
            if (iF != 3) {
                return;
            }
            this.f26647nufgyqmvbu.f26603eablkybsjg = gxszxtbevo.iobyxmoadg.BOTTOM;
            while (i13 < iobyxmoadgVar.f18229b) {
                c1.eablkybsjg eablkybsjgVar5 = iobyxmoadgVar.f18228a[i13];
                if (zE || eablkybsjgVar5.crxdokpmqz() != 8) {
                    gxszxtbevo gxszxtbevoVar4 = eablkybsjgVar5.f18254gxszxtbevo.f26642dxjokdxxww;
                    gxszxtbevoVar4.f26604gtknphoqwx.add(this.f26647nufgyqmvbu);
                    this.f26647nufgyqmvbu.f26601draadjrbmk.add(gxszxtbevoVar4);
                }
                i13++;
            }
            vdvldrhtss(this.f26650zoijcleaow.f18254gxszxtbevo.f26647nufgyqmvbu);
            vdvldrhtss(this.f26650zoijcleaow.f18254gxszxtbevo.f26642dxjokdxxww);
        }
    }
}
