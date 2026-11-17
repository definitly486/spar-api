package rlfsiqarku;

import android.os.Parcel;
import android.util.Base64;
import h.c;
import h.oipsdeybqn;
import h.wwaezpbzkn;
import hg.jyumaefscl;
import j0.jrbgnlbqoe;
import n0.lereixgezr;
import n0.pmvmpeiblj;
import n0.yadqdtsiqt;
import v0.gtknphoqwx;
import v0.vdvldrhtss;
import w0.cqumvgiudr;
import w0.iwizpuwonk;

/* JADX INFO: loaded from: classes.dex */
public final class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Parcel f83121iobyxmoadg;

    public ppxfxbqfkf(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.f83121iobyxmoadg = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    private final vdvldrhtss agtfadlqog() {
        return new vdvldrhtss(eablkybsjg(), eablkybsjg());
    }

    private final c btonecajqb() {
        long jWkgbmnqykc = wkgbmnqykc();
        float fEablkybsjg = eablkybsjg();
        float fEablkybsjg2 = eablkybsjg();
        return new c(jWkgbmnqykc, g.eablkybsjg.eablkybsjg((((long) Float.floatToRawIntBits(fEablkybsjg)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fEablkybsjg2)))), eablkybsjg(), null);
    }

    private final String draadjrbmk() {
        return this.f83121iobyxmoadg.readString();
    }

    private final int dxjokdxxww() {
        return this.f83121iobyxmoadg.readInt();
    }

    private final float eablkybsjg() {
        return this.f83121iobyxmoadg.readFloat();
    }

    private final int iobyxmoadg() {
        return this.f83121iobyxmoadg.dataAvail();
    }

    private final byte ppxfxbqfkf() {
        return this.f83121iobyxmoadg.readByte();
    }

    private final gtknphoqwx wflxmlrfwp() {
        int iDxjokdxxww = dxjokdxxww();
        gtknphoqwx.iobyxmoadg iobyxmoadgVar = gtknphoqwx.f114956zoijcleaow;
        boolean z13 = (iobyxmoadgVar.zoijcleaow().eablkybsjg() & iDxjokdxxww) != 0;
        boolean z14 = (iDxjokdxxww & iobyxmoadgVar.wkgbmnqykc().eablkybsjg()) != 0;
        if (z13 && z14) {
            return iobyxmoadgVar.iobyxmoadg(jyumaefscl.rgvfuqvkyq(iobyxmoadgVar.zoijcleaow(), iobyxmoadgVar.wkgbmnqykc()));
        }
        if (z13) {
            return iobyxmoadgVar.zoijcleaow();
        }
        return z14 ? iobyxmoadgVar.wkgbmnqykc() : iobyxmoadgVar.ppxfxbqfkf();
    }

    private final float zoijcleaow() {
        return v0.iobyxmoadg.eablkybsjg(eablkybsjg());
    }

    public final jrbgnlbqoe gtknphoqwx() {
        gxszxtbevo gxszxtbevoVar;
        gxszxtbevo gxszxtbevoVar2 = gxszxtbevoVar;
        gxszxtbevo gxszxtbevoVar3 = new gxszxtbevo(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.f83121iobyxmoadg.dataAvail() > 1) {
            byte bPpxfxbqfkf = ppxfxbqfkf();
            if (bPpxfxbqfkf != 1) {
                gxszxtbevoVar = gxszxtbevoVar2;
                if (bPpxfxbqfkf == 2) {
                    if (iobyxmoadg() < 5) {
                        return gxszxtbevoVar.wflxmlrfwp();
                    }
                    gxszxtbevoVar.eablkybsjg(ojitshcjhn());
                    gxszxtbevoVar2 = gxszxtbevoVar;
                } else if (bPpxfxbqfkf == 3) {
                    if (iobyxmoadg() < 4) {
                        return gxszxtbevoVar.wflxmlrfwp();
                    }
                    gxszxtbevoVar.nufgyqmvbu(nufgyqmvbu());
                    gxszxtbevoVar2 = gxszxtbevoVar;
                } else if (bPpxfxbqfkf == 4) {
                    if (iobyxmoadg() < 1) {
                        return gxszxtbevoVar.wflxmlrfwp();
                    }
                    gxszxtbevoVar.gxszxtbevo(lereixgezr.ppxfxbqfkf(gxszxtbevo()));
                    gxszxtbevoVar2 = gxszxtbevoVar;
                } else if (bPpxfxbqfkf != 5) {
                    if (bPpxfxbqfkf == 6) {
                        gxszxtbevoVar.wkgbmnqykc(draadjrbmk());
                    } else if (bPpxfxbqfkf == 7) {
                        if (iobyxmoadg() < 5) {
                            return gxszxtbevoVar.wflxmlrfwp();
                        }
                        gxszxtbevoVar.dxjokdxxww(ojitshcjhn());
                    } else if (bPpxfxbqfkf == 8) {
                        if (iobyxmoadg() < 4) {
                            return gxszxtbevoVar.wflxmlrfwp();
                        }
                        gxszxtbevoVar.zoijcleaow(v0.iobyxmoadg.wkgbmnqykc(zoijcleaow()));
                    } else if (bPpxfxbqfkf == 9) {
                        if (iobyxmoadg() < 8) {
                            return gxszxtbevoVar.wflxmlrfwp();
                        }
                        gxszxtbevoVar.draadjrbmk(agtfadlqog());
                    } else if (bPpxfxbqfkf == 10) {
                        if (iobyxmoadg() < 8) {
                            return gxszxtbevoVar.wflxmlrfwp();
                        }
                        gxszxtbevoVar.iobyxmoadg(wkgbmnqykc());
                    } else if (bPpxfxbqfkf == 11) {
                        if (iobyxmoadg() < 4) {
                            return gxszxtbevoVar.wflxmlrfwp();
                        }
                        gxszxtbevoVar.gtknphoqwx(wflxmlrfwp());
                    } else if (bPpxfxbqfkf == 12) {
                        if (iobyxmoadg() < 20) {
                            return gxszxtbevoVar.wflxmlrfwp();
                        }
                        gxszxtbevoVar.btonecajqb(btonecajqb());
                    }
                    gxszxtbevoVar2 = gxszxtbevoVar;
                } else {
                    if (iobyxmoadg() < 1) {
                        return gxszxtbevoVar.wflxmlrfwp();
                    }
                    gxszxtbevoVar.lqeggnwhkg(pmvmpeiblj.eablkybsjg(lqeggnwhkg()));
                    gxszxtbevoVar2 = gxszxtbevoVar;
                }
            } else {
                if (iobyxmoadg() < 8) {
                    break;
                }
                gxszxtbevoVar2.ppxfxbqfkf(wkgbmnqykc());
            }
        }
        gxszxtbevoVar = gxszxtbevoVar2;
        return gxszxtbevoVar.wflxmlrfwp();
    }

    public final int gxszxtbevo() {
        byte bPpxfxbqfkf = ppxfxbqfkf();
        if (bPpxfxbqfkf != 0 && bPpxfxbqfkf == 1) {
            return lereixgezr.f68283zoijcleaow.iobyxmoadg();
        }
        return lereixgezr.f68283zoijcleaow.zoijcleaow();
    }

    public final int lqeggnwhkg() {
        byte bPpxfxbqfkf = ppxfxbqfkf();
        if (bPpxfxbqfkf == 0) {
            return pmvmpeiblj.f68323zoijcleaow.zoijcleaow();
        }
        if (bPpxfxbqfkf == 1) {
            return pmvmpeiblj.f68323zoijcleaow.iobyxmoadg();
        }
        if (bPpxfxbqfkf == 3) {
            return pmvmpeiblj.f68323zoijcleaow.ppxfxbqfkf();
        }
        return bPpxfxbqfkf == 2 ? pmvmpeiblj.f68323zoijcleaow.wkgbmnqykc() : pmvmpeiblj.f68323zoijcleaow.zoijcleaow();
    }

    public final yadqdtsiqt nufgyqmvbu() {
        return new yadqdtsiqt(dxjokdxxww());
    }

    public final long ojitshcjhn() {
        long jIobyxmoadg;
        byte bPpxfxbqfkf = ppxfxbqfkf();
        if (bPpxfxbqfkf == 1) {
            jIobyxmoadg = cqumvgiudr.f118246zoijcleaow.zoijcleaow();
        } else {
            jIobyxmoadg = bPpxfxbqfkf == 2 ? cqumvgiudr.f118246zoijcleaow.iobyxmoadg() : cqumvgiudr.f118246zoijcleaow.ppxfxbqfkf();
        }
        return cqumvgiudr.lqeggnwhkg(jIobyxmoadg, cqumvgiudr.f118246zoijcleaow.ppxfxbqfkf()) ? w0.jyumaefscl.f118259zoijcleaow.iobyxmoadg() : iwizpuwonk.iobyxmoadg(eablkybsjg(), jIobyxmoadg);
    }

    public final long wkgbmnqykc() {
        return wwaezpbzkn.iobyxmoadg(oipsdeybqn.f38945zoijcleaow, this.f83121iobyxmoadg.readLong());
    }
}
