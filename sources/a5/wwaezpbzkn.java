package a5;

import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
final class wwaezpbzkn extends t3.eablkybsjg {

    private static final class iobyxmoadg implements t3.eablkybsjg.gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final y2.hcddaimhww f752iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final int f753ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final int f754wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final y2.yadqdtsiqt f755zoijcleaow = new y2.yadqdtsiqt();

        public iobyxmoadg(int i13, y2.hcddaimhww hcddaimhwwVar, int i14) {
            this.f753ppxfxbqfkf = i13;
            this.f752iobyxmoadg = hcddaimhwwVar;
            this.f754wkgbmnqykc = i14;
        }

        private t3.eablkybsjg.C2687eablkybsjg ppxfxbqfkf(y2.yadqdtsiqt yadqdtsiqtVar, long j13, long j14) {
            int iIobyxmoadg;
            int iIobyxmoadg2;
            int iLqeggnwhkg = yadqdtsiqtVar.lqeggnwhkg();
            long j15 = -1;
            long j16 = -1;
            long j17 = -9223372036854775807L;
            while (yadqdtsiqtVar.iobyxmoadg() >= 188 && (iIobyxmoadg2 = (iIobyxmoadg = hkdspvbjdz.iobyxmoadg(yadqdtsiqtVar.eablkybsjg(), yadqdtsiqtVar.gxszxtbevo(), iLqeggnwhkg)) + 188) <= iLqeggnwhkg) {
                long jPpxfxbqfkf = hkdspvbjdz.ppxfxbqfkf(yadqdtsiqtVar, iIobyxmoadg, this.f753ppxfxbqfkf);
                if (jPpxfxbqfkf != -9223372036854775807L) {
                    long jZoijcleaow = this.f752iobyxmoadg.zoijcleaow(jPpxfxbqfkf);
                    if (jZoijcleaow > j13) {
                        return j17 == -9223372036854775807L ? t3.eablkybsjg.C2687eablkybsjg.wkgbmnqykc(jZoijcleaow, j14) : t3.eablkybsjg.C2687eablkybsjg.eablkybsjg(j14 + j16);
                    }
                    if (100000 + jZoijcleaow > j13) {
                        return t3.eablkybsjg.C2687eablkybsjg.eablkybsjg(j14 + ((long) iIobyxmoadg));
                    }
                    j16 = iIobyxmoadg;
                    j17 = jZoijcleaow;
                }
                yadqdtsiqtVar.sopmlzcsov(iIobyxmoadg2);
                j15 = iIobyxmoadg2;
            }
            return j17 != -9223372036854775807L ? t3.eablkybsjg.C2687eablkybsjg.gxszxtbevo(j17, j14 + j15) : t3.eablkybsjg.C2687eablkybsjg.f109398wkgbmnqykc;
        }

        @Override // t3.eablkybsjg.gxszxtbevo
        public t3.eablkybsjg.C2687eablkybsjg iobyxmoadg(t3.vdvldrhtss vdvldrhtssVar, long j13) {
            long position = vdvldrhtssVar.getPosition();
            int iMin = (int) Math.min(this.f754wkgbmnqykc, vdvldrhtssVar.getLength() - position);
            this.f755zoijcleaow.tzroggbefp(iMin);
            vdvldrhtssVar.ojitshcjhn(this.f755zoijcleaow.eablkybsjg(), 0, iMin);
            return ppxfxbqfkf(this.f755zoijcleaow, j13, position);
        }

        @Override // t3.eablkybsjg.gxszxtbevo
        public void zoijcleaow() {
            this.f755zoijcleaow.mbcevpiqjq(stevsuqkhv.f123601gxszxtbevo);
        }
    }

    public wwaezpbzkn(y2.hcddaimhww hcddaimhwwVar, long j13, long j14, int i13, int i14) {
        super(new t3.eablkybsjg.zoijcleaow(), new iobyxmoadg(i13, hcddaimhwwVar, i14), j13, 0L, j13 + 1, 0L, j14, 188L, 940);
    }
}
