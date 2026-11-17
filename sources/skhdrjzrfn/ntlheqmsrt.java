package skhdrjzrfn;

/* JADX INFO: loaded from: classes.dex */
public abstract class ntlheqmsrt {
    private static final int agtfadlqog(gg.gtknphoqwx gtknphoqwxVar) {
        return ((Number) gtknphoqwxVar.getValue()).intValue();
    }

    private static final boolean btonecajqb(pkzmftpjix pkzmftpjixVar, int i13, boolean z13) {
        if (pkzmftpjixVar.gxszxtbevo() == -1) {
            return true;
        }
        if (i13 == pkzmftpjixVar.gxszxtbevo()) {
            return false;
        }
        if (z13 ^ (pkzmftpjixVar.wkgbmnqykc() == wflxmlrfwp.CROSSED)) {
            if (i13 < pkzmftpjixVar.gxszxtbevo()) {
                return true;
            }
        } else if (i13 > pkzmftpjixVar.gxszxtbevo()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jpowsppfya.iobyxmoadg draadjrbmk(final okpsazkaxt okpsazkaxtVar, final pkzmftpjix pkzmftpjixVar, jpowsppfya.iobyxmoadg iobyxmoadgVar) {
        final int iLqeggnwhkg = okpsazkaxtVar.iobyxmoadg() ? pkzmftpjixVar.lqeggnwhkg() : pkzmftpjixVar.eablkybsjg();
        if ((okpsazkaxtVar.iobyxmoadg() ? okpsazkaxtVar.gtknphoqwx() : okpsazkaxtVar.wkgbmnqykc()) != pkzmftpjixVar.dxjokdxxww()) {
            return pkzmftpjixVar.iobyxmoadg(iLqeggnwhkg);
        }
        gg.ojitshcjhn ojitshcjhnVar = gg.ojitshcjhn.NONE;
        final gg.gtknphoqwx gtknphoqwxVarIobyxmoadg = gg.draadjrbmk.iobyxmoadg(ojitshcjhnVar, new tg.iobyxmoadg() { // from class: skhdrjzrfn.tzroggbefp
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Integer.valueOf(ntlheqmsrt.wflxmlrfwp(pkzmftpjixVar, iLqeggnwhkg));
            }
        });
        final int iEablkybsjg = okpsazkaxtVar.iobyxmoadg() ? pkzmftpjixVar.eablkybsjg() : pkzmftpjixVar.lqeggnwhkg();
        final int i13 = iLqeggnwhkg;
        gg.gtknphoqwx gtknphoqwxVarIobyxmoadg2 = gg.draadjrbmk.iobyxmoadg(ojitshcjhnVar, new tg.iobyxmoadg() { // from class: skhdrjzrfn.mbcevpiqjq
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ntlheqmsrt.ojitshcjhn(pkzmftpjixVar, i13, iEablkybsjg, okpsazkaxtVar, gtknphoqwxVarIobyxmoadg);
            }
        });
        if (pkzmftpjixVar.nufgyqmvbu() != iobyxmoadgVar.wkgbmnqykc()) {
            return rgvfuqvkyq(gtknphoqwxVarIobyxmoadg2);
        }
        int iGxszxtbevo = pkzmftpjixVar.gxszxtbevo();
        if (iLqeggnwhkg == iGxszxtbevo) {
            return iobyxmoadgVar;
        }
        if (agtfadlqog(gtknphoqwxVarIobyxmoadg) != pkzmftpjixVar.gtknphoqwx().vdvldrhtss(iGxszxtbevo)) {
            return rgvfuqvkyq(gtknphoqwxVarIobyxmoadg2);
        }
        int iPpxfxbqfkf = iobyxmoadgVar.ppxfxbqfkf();
        long jIstkbnxepw = pkzmftpjixVar.gtknphoqwx().istkbnxepw(iPpxfxbqfkf);
        if (btonecajqb(pkzmftpjixVar, iLqeggnwhkg, okpsazkaxtVar.iobyxmoadg())) {
            return (iPpxfxbqfkf == j0.l.agtfadlqog(jIstkbnxepw) || iPpxfxbqfkf == j0.l.dxjokdxxww(jIstkbnxepw)) ? rgvfuqvkyq(gtknphoqwxVarIobyxmoadg2) : pkzmftpjixVar.iobyxmoadg(iLqeggnwhkg);
        }
        return pkzmftpjixVar.iobyxmoadg(iLqeggnwhkg);
    }

    private static final jpowsppfya dxjokdxxww(jpowsppfya jpowsppfyaVar, okpsazkaxt okpsazkaxtVar) {
        pkzmftpjix pkzmftpjixVarZoijcleaow = okpsazkaxtVar.zoijcleaow();
        String strPpxfxbqfkf = pkzmftpjixVarZoijcleaow.ppxfxbqfkf();
        int iLqeggnwhkg = pkzmftpjixVarZoijcleaow.lqeggnwhkg();
        int length = strPpxfxbqfkf.length();
        if (iLqeggnwhkg == 0) {
            int iPpxfxbqfkf = opjhrmiecq.fmlbqenlif.ppxfxbqfkf(strPpxfxbqfkf, 0);
            return okpsazkaxtVar.iobyxmoadg() ? jpowsppfya.zoijcleaow(jpowsppfyaVar, lqeggnwhkg(jpowsppfyaVar.eablkybsjg(), pkzmftpjixVarZoijcleaow, iPpxfxbqfkf), null, true, 2, null) : jpowsppfya.zoijcleaow(jpowsppfyaVar, null, lqeggnwhkg(jpowsppfyaVar.ppxfxbqfkf(), pkzmftpjixVarZoijcleaow, iPpxfxbqfkf), false, 1, null);
        }
        if (iLqeggnwhkg == length) {
            int iWkgbmnqykc = opjhrmiecq.fmlbqenlif.wkgbmnqykc(strPpxfxbqfkf, length);
            return okpsazkaxtVar.iobyxmoadg() ? jpowsppfya.zoijcleaow(jpowsppfyaVar, lqeggnwhkg(jpowsppfyaVar.eablkybsjg(), pkzmftpjixVarZoijcleaow, iWkgbmnqykc), null, false, 2, null) : jpowsppfya.zoijcleaow(jpowsppfyaVar, null, lqeggnwhkg(jpowsppfyaVar.ppxfxbqfkf(), pkzmftpjixVarZoijcleaow, iWkgbmnqykc), true, 1, null);
        }
        jpowsppfya jpowsppfyaVarLqeggnwhkg = okpsazkaxtVar.lqeggnwhkg();
        boolean z13 = jpowsppfyaVarLqeggnwhkg != null && jpowsppfyaVarLqeggnwhkg.wkgbmnqykc();
        int iWkgbmnqykc2 = okpsazkaxtVar.iobyxmoadg() ^ z13 ? opjhrmiecq.fmlbqenlif.wkgbmnqykc(strPpxfxbqfkf, iLqeggnwhkg) : opjhrmiecq.fmlbqenlif.ppxfxbqfkf(strPpxfxbqfkf, iLqeggnwhkg);
        return okpsazkaxtVar.iobyxmoadg() ? jpowsppfya.zoijcleaow(jpowsppfyaVar, lqeggnwhkg(jpowsppfyaVar.eablkybsjg(), pkzmftpjixVarZoijcleaow, iWkgbmnqykc2), null, z13, 2, null) : jpowsppfya.zoijcleaow(jpowsppfyaVar, null, lqeggnwhkg(jpowsppfyaVar.ppxfxbqfkf(), pkzmftpjixVarZoijcleaow, iWkgbmnqykc2), z13, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jpowsppfya eablkybsjg(okpsazkaxt okpsazkaxtVar, gtknphoqwx gtknphoqwxVar) {
        boolean z13 = okpsazkaxtVar.gxszxtbevo() == wflxmlrfwp.CROSSED;
        return new jpowsppfya(gxszxtbevo(okpsazkaxtVar.btonecajqb(), z13, true, okpsazkaxtVar.gtknphoqwx(), gtknphoqwxVar), gxszxtbevo(okpsazkaxtVar.nufgyqmvbu(), z13, false, okpsazkaxtVar.wkgbmnqykc(), gtknphoqwxVar), z13);
    }

    private static final jpowsppfya.iobyxmoadg gtknphoqwx(pkzmftpjix pkzmftpjixVar, int i13, int i14, int i15, boolean z13, boolean z14) {
        int iYggfygwlhe;
        int iRgvfuqvkyq;
        long jIstkbnxepw = pkzmftpjixVar.gtknphoqwx().istkbnxepw(i14);
        if (pkzmftpjixVar.gtknphoqwx().vdvldrhtss(j0.l.agtfadlqog(jIstkbnxepw)) == i13) {
            iYggfygwlhe = j0.l.agtfadlqog(jIstkbnxepw);
        } else {
            iYggfygwlhe = i13 >= pkzmftpjixVar.gtknphoqwx().agtfadlqog() ? pkzmftpjixVar.gtknphoqwx().yggfygwlhe(pkzmftpjixVar.gtknphoqwx().agtfadlqog() - 1) : pkzmftpjixVar.gtknphoqwx().yggfygwlhe(i13);
        }
        if (pkzmftpjixVar.gtknphoqwx().vdvldrhtss(j0.l.dxjokdxxww(jIstkbnxepw)) == i13) {
            iRgvfuqvkyq = j0.l.dxjokdxxww(jIstkbnxepw);
        } else {
            iRgvfuqvkyq = i13 >= pkzmftpjixVar.gtknphoqwx().agtfadlqog() ? j0.f.rgvfuqvkyq(pkzmftpjixVar.gtknphoqwx(), pkzmftpjixVar.gtknphoqwx().agtfadlqog() - 1, false, 2, null) : j0.f.rgvfuqvkyq(pkzmftpjixVar.gtknphoqwx(), i13, false, 2, null);
        }
        if (iYggfygwlhe == i15) {
            return pkzmftpjixVar.iobyxmoadg(iRgvfuqvkyq);
        }
        if (iRgvfuqvkyq == i15) {
            return pkzmftpjixVar.iobyxmoadg(iYggfygwlhe);
        }
        if (!(z13 ^ z14) ? i14 >= iYggfygwlhe : i14 > iRgvfuqvkyq) {
            iYggfygwlhe = iRgvfuqvkyq;
        }
        return pkzmftpjixVar.iobyxmoadg(iYggfygwlhe);
    }

    private static final jpowsppfya.iobyxmoadg gxszxtbevo(pkzmftpjix pkzmftpjixVar, boolean z13, boolean z14, int i13, gtknphoqwx gtknphoqwxVar) {
        int iLqeggnwhkg = z14 ? pkzmftpjixVar.lqeggnwhkg() : pkzmftpjixVar.eablkybsjg();
        if (i13 != pkzmftpjixVar.dxjokdxxww()) {
            return pkzmftpjixVar.iobyxmoadg(iLqeggnwhkg);
        }
        long jIobyxmoadg = gtknphoqwxVar.iobyxmoadg(pkzmftpjixVar, iLqeggnwhkg);
        return pkzmftpjixVar.iobyxmoadg(z13 ^ z14 ? j0.l.agtfadlqog(jIobyxmoadg) : j0.l.dxjokdxxww(jIobyxmoadg));
    }

    private static final jpowsppfya.iobyxmoadg lqeggnwhkg(jpowsppfya.iobyxmoadg iobyxmoadgVar, pkzmftpjix pkzmftpjixVar, int i13) {
        return jpowsppfya.iobyxmoadg.zoijcleaow(iobyxmoadgVar, pkzmftpjixVar.gtknphoqwx().ppxfxbqfkf(i13), i13, 0L, 4, null);
    }

    public static final jpowsppfya nufgyqmvbu(jpowsppfya jpowsppfyaVar, okpsazkaxt okpsazkaxtVar) {
        if (xrmfcynszj.ppxfxbqfkf(jpowsppfyaVar, okpsazkaxtVar)) {
            return (okpsazkaxtVar.getSize() > 1 || okpsazkaxtVar.lqeggnwhkg() == null || okpsazkaxtVar.zoijcleaow().ppxfxbqfkf().length() == 0) ? jpowsppfyaVar : dxjokdxxww(jpowsppfyaVar, okpsazkaxtVar);
        }
        return jpowsppfyaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jpowsppfya.iobyxmoadg ojitshcjhn(pkzmftpjix pkzmftpjixVar, int i13, int i14, okpsazkaxt okpsazkaxtVar, gg.gtknphoqwx gtknphoqwxVar) {
        return gtknphoqwx(pkzmftpjixVar, agtfadlqog(gtknphoqwxVar), i13, i14, okpsazkaxtVar.iobyxmoadg(), okpsazkaxtVar.gxszxtbevo() == wflxmlrfwp.CROSSED);
    }

    private static final jpowsppfya.iobyxmoadg rgvfuqvkyq(gg.gtknphoqwx gtknphoqwxVar) {
        return (jpowsppfya.iobyxmoadg) gtknphoqwxVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int wflxmlrfwp(pkzmftpjix pkzmftpjixVar, int i13) {
        return pkzmftpjixVar.gtknphoqwx().vdvldrhtss(i13);
    }
}
