package a5;

import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class lereixgezr extends t3.eablkybsjg {

    private static final class zoijcleaow implements t3.eablkybsjg.gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final y2.hcddaimhww f598iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final y2.yadqdtsiqt f599zoijcleaow;

        private t3.eablkybsjg.C2687eablkybsjg ppxfxbqfkf(y2.yadqdtsiqt yadqdtsiqtVar, long j13, long j14) {
            int iGxszxtbevo = -1;
            int iGxszxtbevo2 = -1;
            long j15 = -9223372036854775807L;
            while (yadqdtsiqtVar.iobyxmoadg() >= 4) {
                if (lereixgezr.gtknphoqwx(yadqdtsiqtVar.eablkybsjg(), yadqdtsiqtVar.gxszxtbevo()) != 442) {
                    yadqdtsiqtVar.crxdokpmqz(1);
                } else {
                    yadqdtsiqtVar.crxdokpmqz(4);
                    long jDraadjrbmk = pmvmpeiblj.draadjrbmk(yadqdtsiqtVar);
                    if (jDraadjrbmk != -9223372036854775807L) {
                        long jZoijcleaow = this.f598iobyxmoadg.zoijcleaow(jDraadjrbmk);
                        if (jZoijcleaow > j13) {
                            return j15 == -9223372036854775807L ? t3.eablkybsjg.C2687eablkybsjg.wkgbmnqykc(jZoijcleaow, j14) : t3.eablkybsjg.C2687eablkybsjg.eablkybsjg(j14 + ((long) iGxszxtbevo2));
                        }
                        if (100000 + jZoijcleaow > j13) {
                            return t3.eablkybsjg.C2687eablkybsjg.eablkybsjg(j14 + ((long) yadqdtsiqtVar.gxszxtbevo()));
                        }
                        iGxszxtbevo2 = yadqdtsiqtVar.gxszxtbevo();
                        j15 = jZoijcleaow;
                    }
                    wkgbmnqykc(yadqdtsiqtVar);
                    iGxszxtbevo = yadqdtsiqtVar.gxszxtbevo();
                }
            }
            return j15 != -9223372036854775807L ? t3.eablkybsjg.C2687eablkybsjg.gxszxtbevo(j15, j14 + ((long) iGxszxtbevo)) : t3.eablkybsjg.C2687eablkybsjg.f109398wkgbmnqykc;
        }

        private static void wkgbmnqykc(y2.yadqdtsiqt yadqdtsiqtVar) {
            int iGtknphoqwx;
            int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
            if (yadqdtsiqtVar.iobyxmoadg() < 10) {
                yadqdtsiqtVar.sopmlzcsov(iLqeggnwhkg);
                return;
            }
            yadqdtsiqtVar.crxdokpmqz(9);
            int iWwaezpbzkn = yadqdtsiqtVar.wwaezpbzkn() & 7;
            if (yadqdtsiqtVar.iobyxmoadg() < iWwaezpbzkn) {
                yadqdtsiqtVar.sopmlzcsov(iLqeggnwhkg);
                return;
            }
            yadqdtsiqtVar.crxdokpmqz(iWwaezpbzkn);
            if (yadqdtsiqtVar.iobyxmoadg() < 4) {
                yadqdtsiqtVar.sopmlzcsov(iLqeggnwhkg);
                return;
            }
            if (lereixgezr.gtknphoqwx(yadqdtsiqtVar.eablkybsjg(), yadqdtsiqtVar.gxszxtbevo()) == 443) {
                yadqdtsiqtVar.crxdokpmqz(4);
                int iWypolnanlu = yadqdtsiqtVar.wypolnanlu();
                if (yadqdtsiqtVar.iobyxmoadg() < iWypolnanlu) {
                    yadqdtsiqtVar.sopmlzcsov(iLqeggnwhkg);
                    return;
                }
                yadqdtsiqtVar.crxdokpmqz(iWypolnanlu);
            }
            while (yadqdtsiqtVar.iobyxmoadg() >= 4 && (iGtknphoqwx = lereixgezr.gtknphoqwx(yadqdtsiqtVar.eablkybsjg(), yadqdtsiqtVar.gxszxtbevo())) != 442 && iGtknphoqwx != 441 && (iGtknphoqwx >>> 8) == 1) {
                yadqdtsiqtVar.crxdokpmqz(4);
                if (yadqdtsiqtVar.iobyxmoadg() < 2) {
                    yadqdtsiqtVar.sopmlzcsov(iLqeggnwhkg);
                    return;
                }
                yadqdtsiqtVar.sopmlzcsov(Math.min(yadqdtsiqtVar.lqeggnwhkg(), yadqdtsiqtVar.gxszxtbevo() + yadqdtsiqtVar.wypolnanlu()));
            }
        }

        @Override // t3.eablkybsjg.gxszxtbevo
        public t3.eablkybsjg.C2687eablkybsjg iobyxmoadg(t3.vdvldrhtss vdvldrhtssVar, long j13) {
            long position = vdvldrhtssVar.getPosition();
            int iMin = (int) Math.min(20000L, vdvldrhtssVar.getLength() - position);
            this.f599zoijcleaow.tzroggbefp(iMin);
            vdvldrhtssVar.ojitshcjhn(this.f599zoijcleaow.eablkybsjg(), 0, iMin);
            return ppxfxbqfkf(this.f599zoijcleaow, j13, position);
        }

        @Override // t3.eablkybsjg.gxszxtbevo
        public void zoijcleaow() {
            this.f599zoijcleaow.mbcevpiqjq(stevsuqkhv.f123601gxszxtbevo);
        }

        private zoijcleaow(y2.hcddaimhww hcddaimhwwVar) {
            this.f598iobyxmoadg = hcddaimhwwVar;
            this.f599zoijcleaow = new y2.yadqdtsiqt();
        }
    }

    public lereixgezr(y2.hcddaimhww hcddaimhwwVar, long j13, long j14) {
        super(new t3.eablkybsjg.zoijcleaow(), new zoijcleaow(hcddaimhwwVar), j13, 0L, j13 + 1, 0L, j14, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int gtknphoqwx(byte[] bArr, int i13) {
        return (bArr[i13 + 3] & 255) | ((bArr[i13] & 255) << 24) | ((bArr[i13 + 1] & 255) << 16) | ((bArr[i13 + 2] & 255) << 8);
    }
}
