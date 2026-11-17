package gm;

import org.threeten.bp.temporal.UnsupportedTemporalTypeException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ppxfxbqfkf {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final nufgyqmvbu f37852iobyxmoadg = zoijcleaow.f37867zdlpuopuiu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final nufgyqmvbu f37855zoijcleaow = zoijcleaow.f37866yggfygwlhe;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final nufgyqmvbu f37853ppxfxbqfkf = zoijcleaow.f37865jyumaefscl;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public static final nufgyqmvbu f37854wkgbmnqykc = zoijcleaow.f37864iwizpuwonk;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public static final gtknphoqwx f37850eablkybsjg = EnumC0854ppxfxbqfkf.WEEK_BASED_YEARS;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public static final gtknphoqwx f37851gxszxtbevo = EnumC0854ppxfxbqfkf.QUARTER_YEARS;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f37856iobyxmoadg;

        static {
            int[] iArr = new int[EnumC0854ppxfxbqfkf.values().length];
            f37856iobyxmoadg = iArr;
            try {
                iArr[EnumC0854ppxfxbqfkf.WEEK_BASED_YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37856iobyxmoadg[EnumC0854ppxfxbqfkf.QUARTER_YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: gm.ppxfxbqfkf$ppxfxbqfkf, reason: collision with other inner class name */
    private enum EnumC0854ppxfxbqfkf implements gtknphoqwx {
        WEEK_BASED_YEARS("WeekBasedYears", cm.ppxfxbqfkf.dxjokdxxww(31556952)),
        QUARTER_YEARS("QuarterYears", cm.ppxfxbqfkf.dxjokdxxww(7889238));


        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final cm.ppxfxbqfkf f37860yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f37861zdlpuopuiu;

        EnumC0854ppxfxbqfkf(String str, cm.ppxfxbqfkf ppxfxbqfkfVar) {
            this.f37861zdlpuopuiu = str;
            this.f37860yggfygwlhe = ppxfxbqfkfVar;
        }

        @Override // gm.gtknphoqwx
        public boolean iobyxmoadg() {
            return true;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f37861zdlpuopuiu;
        }

        @Override // gm.gtknphoqwx
        public wkgbmnqykc wkgbmnqykc(wkgbmnqykc wkgbmnqykcVar, long j13) {
            int i13 = iobyxmoadg.f37856iobyxmoadg[ordinal()];
            if (i13 == 1) {
                nufgyqmvbu nufgyqmvbuVar = ppxfxbqfkf.f37854wkgbmnqykc;
                return wkgbmnqykcVar.rgvfuqvkyq(nufgyqmvbuVar, fm.ppxfxbqfkf.btonecajqb(wkgbmnqykcVar.ojitshcjhn(nufgyqmvbuVar), j13));
            }
            if (i13 == 2) {
                return wkgbmnqykcVar.wkgbmnqykc(j13 / 256, gm.zoijcleaow.YEARS).wkgbmnqykc((j13 % 256) * 3, gm.zoijcleaow.MONTHS);
            }
            throw new IllegalStateException("Unreachable");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class zoijcleaow implements nufgyqmvbu {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private static final int[] f37862cqumvgiudr;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private static final /* synthetic */ zoijcleaow[] f37863esjtqupxsv;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        public static final zoijcleaow f37864iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        public static final zoijcleaow f37865jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        public static final zoijcleaow f37866yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f37867zdlpuopuiu;

        final enum iobyxmoadg extends zoijcleaow {
            iobyxmoadg(String str, int i13) {
                super(str, i13, null);
            }

            @Override // gm.nufgyqmvbu
            public gm.wkgbmnqykc btonecajqb(gm.wkgbmnqykc wkgbmnqykcVar, long j13) {
                long jWkgbmnqykc = wkgbmnqykc(wkgbmnqykcVar);
                dxjokdxxww().wkgbmnqykc(j13, this);
                gm.iobyxmoadg iobyxmoadgVar = gm.iobyxmoadg.f37835stevsuqkhv;
                return wkgbmnqykcVar.rgvfuqvkyq(iobyxmoadgVar, wkgbmnqykcVar.agtfadlqog(iobyxmoadgVar) + (j13 - jWkgbmnqykc));
            }

            @Override // gm.nufgyqmvbu
            public draadjrbmk dxjokdxxww() {
                return draadjrbmk.rgvfuqvkyq(1L, 90L, 92L);
            }

            @Override // gm.nufgyqmvbu
            public draadjrbmk lqeggnwhkg(eablkybsjg eablkybsjgVar) {
                if (!eablkybsjgVar.iobyxmoadg(this)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                long jAgtfadlqog = eablkybsjgVar.agtfadlqog(zoijcleaow.f37866yggfygwlhe);
                if (jAgtfadlqog == 1) {
                    return dm.gxszxtbevo.f29133cqumvgiudr.draadjrbmk(eablkybsjgVar.agtfadlqog(gm.iobyxmoadg.f37816crxdokpmqz)) ? draadjrbmk.ojitshcjhn(1L, 91L) : draadjrbmk.ojitshcjhn(1L, 90L);
                }
                if (jAgtfadlqog == 2) {
                    return draadjrbmk.ojitshcjhn(1L, 91L);
                }
                return (jAgtfadlqog == 3 || jAgtfadlqog == 4) ? draadjrbmk.ojitshcjhn(1L, 92L) : dxjokdxxww();
            }

            @Override // gm.nufgyqmvbu
            public boolean nufgyqmvbu(eablkybsjg eablkybsjgVar) {
                return eablkybsjgVar.iobyxmoadg(gm.iobyxmoadg.f37835stevsuqkhv) && eablkybsjgVar.iobyxmoadg(gm.iobyxmoadg.f37830ntlheqmsrt) && eablkybsjgVar.iobyxmoadg(gm.iobyxmoadg.f37816crxdokpmqz) && zoijcleaow.zynmafqrjb(eablkybsjgVar);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "DayOfQuarter";
            }

            @Override // gm.nufgyqmvbu
            public long wkgbmnqykc(eablkybsjg eablkybsjgVar) {
                if (!eablkybsjgVar.iobyxmoadg(this)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: DayOfQuarter");
                }
                return eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37835stevsuqkhv) - zoijcleaow.f37862cqumvgiudr[((eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37830ntlheqmsrt) - 1) / 3) + (dm.gxszxtbevo.f29133cqumvgiudr.draadjrbmk(eablkybsjgVar.agtfadlqog(gm.iobyxmoadg.f37816crxdokpmqz)) ? 4 : 0)];
            }
        }

        /* JADX INFO: renamed from: gm.ppxfxbqfkf$zoijcleaow$ppxfxbqfkf, reason: collision with other inner class name */
        final enum C0855ppxfxbqfkf extends zoijcleaow {
            C0855ppxfxbqfkf(String str, int i13) {
                super(str, i13, null);
            }

            @Override // gm.nufgyqmvbu
            public gm.wkgbmnqykc btonecajqb(gm.wkgbmnqykc wkgbmnqykcVar, long j13) {
                dxjokdxxww().wkgbmnqykc(j13, this);
                return wkgbmnqykcVar.wkgbmnqykc(fm.ppxfxbqfkf.draadjrbmk(j13, wkgbmnqykc(wkgbmnqykcVar)), gm.zoijcleaow.WEEKS);
            }

            @Override // gm.nufgyqmvbu
            public draadjrbmk dxjokdxxww() {
                return draadjrbmk.rgvfuqvkyq(1L, 52L, 53L);
            }

            @Override // gm.nufgyqmvbu
            public draadjrbmk lqeggnwhkg(eablkybsjg eablkybsjgVar) {
                if (eablkybsjgVar.iobyxmoadg(this)) {
                    return zoijcleaow.pmvmpeiblj(cm.eablkybsjg.zynmafqrjb(eablkybsjgVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // gm.nufgyqmvbu
            public boolean nufgyqmvbu(eablkybsjg eablkybsjgVar) {
                return eablkybsjgVar.iobyxmoadg(gm.iobyxmoadg.f37826kegysxyocb) && zoijcleaow.zynmafqrjb(eablkybsjgVar);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // gm.nufgyqmvbu
            public long wkgbmnqykc(eablkybsjg eablkybsjgVar) {
                if (eablkybsjgVar.iobyxmoadg(this)) {
                    return zoijcleaow.jyumaefscl(cm.eablkybsjg.zynmafqrjb(eablkybsjgVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekOfWeekBasedYear");
            }
        }

        final enum wkgbmnqykc extends zoijcleaow {
            wkgbmnqykc(String str, int i13) {
                super(str, i13, null);
            }

            @Override // gm.nufgyqmvbu
            public gm.wkgbmnqykc btonecajqb(gm.wkgbmnqykc wkgbmnqykcVar, long j13) {
                if (!nufgyqmvbu(wkgbmnqykcVar)) {
                    throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
                }
                int iIobyxmoadg = dxjokdxxww().iobyxmoadg(j13, zoijcleaow.f37864iwizpuwonk);
                cm.eablkybsjg eablkybsjgVarZynmafqrjb = cm.eablkybsjg.zynmafqrjb(wkgbmnqykcVar);
                gm.iobyxmoadg iobyxmoadgVar = gm.iobyxmoadg.f37820hkdspvbjdz;
                int iOjitshcjhn = eablkybsjgVarZynmafqrjb.ojitshcjhn(iobyxmoadgVar);
                int iJyumaefscl = zoijcleaow.jyumaefscl(eablkybsjgVarZynmafqrjb);
                if (iJyumaefscl == 53 && zoijcleaow.lereixgezr(iIobyxmoadg) == 52) {
                    iJyumaefscl = 52;
                }
                cm.eablkybsjg eablkybsjgVarWypolnanlu = cm.eablkybsjg.wypolnanlu(iIobyxmoadg, 1, 4);
                return wkgbmnqykcVar.draadjrbmk(eablkybsjgVarWypolnanlu.ntlheqmsrt((iOjitshcjhn - eablkybsjgVarWypolnanlu.ojitshcjhn(iobyxmoadgVar)) + ((iJyumaefscl - 1) * 7)));
            }

            @Override // gm.nufgyqmvbu
            public draadjrbmk dxjokdxxww() {
                return gm.iobyxmoadg.f37816crxdokpmqz.dxjokdxxww();
            }

            @Override // gm.nufgyqmvbu
            public draadjrbmk lqeggnwhkg(eablkybsjg eablkybsjgVar) {
                return gm.iobyxmoadg.f37816crxdokpmqz.dxjokdxxww();
            }

            @Override // gm.nufgyqmvbu
            public boolean nufgyqmvbu(eablkybsjg eablkybsjgVar) {
                return eablkybsjgVar.iobyxmoadg(gm.iobyxmoadg.f37826kegysxyocb) && zoijcleaow.zynmafqrjb(eablkybsjgVar);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekBasedYear";
            }

            @Override // gm.nufgyqmvbu
            public long wkgbmnqykc(eablkybsjg eablkybsjgVar) {
                if (eablkybsjgVar.iobyxmoadg(this)) {
                    return zoijcleaow.cqumvgiudr(cm.eablkybsjg.zynmafqrjb(eablkybsjgVar));
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: WeekBasedYear");
            }
        }

        /* JADX INFO: renamed from: gm.ppxfxbqfkf$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        final enum C0856zoijcleaow extends zoijcleaow {
            C0856zoijcleaow(String str, int i13) {
                super(str, i13, null);
            }

            @Override // gm.nufgyqmvbu
            public gm.wkgbmnqykc btonecajqb(gm.wkgbmnqykc wkgbmnqykcVar, long j13) {
                long jWkgbmnqykc = wkgbmnqykc(wkgbmnqykcVar);
                dxjokdxxww().wkgbmnqykc(j13, this);
                gm.iobyxmoadg iobyxmoadgVar = gm.iobyxmoadg.f37830ntlheqmsrt;
                return wkgbmnqykcVar.rgvfuqvkyq(iobyxmoadgVar, wkgbmnqykcVar.agtfadlqog(iobyxmoadgVar) + ((j13 - jWkgbmnqykc) * 3));
            }

            @Override // gm.nufgyqmvbu
            public draadjrbmk dxjokdxxww() {
                return draadjrbmk.ojitshcjhn(1L, 4L);
            }

            @Override // gm.nufgyqmvbu
            public draadjrbmk lqeggnwhkg(eablkybsjg eablkybsjgVar) {
                return dxjokdxxww();
            }

            @Override // gm.nufgyqmvbu
            public boolean nufgyqmvbu(eablkybsjg eablkybsjgVar) {
                return eablkybsjgVar.iobyxmoadg(gm.iobyxmoadg.f37830ntlheqmsrt) && zoijcleaow.zynmafqrjb(eablkybsjgVar);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "QuarterOfYear";
            }

            @Override // gm.nufgyqmvbu
            public long wkgbmnqykc(eablkybsjg eablkybsjgVar) {
                if (eablkybsjgVar.iobyxmoadg(this)) {
                    return (eablkybsjgVar.agtfadlqog(gm.iobyxmoadg.f37830ntlheqmsrt) + 2) / 3;
                }
                throw new UnsupportedTemporalTypeException("Unsupported field: QuarterOfYear");
            }
        }

        static {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg("DAY_OF_QUARTER", 0);
            f37867zdlpuopuiu = iobyxmoadgVar;
            C0856zoijcleaow c0856zoijcleaow = new C0856zoijcleaow("QUARTER_OF_YEAR", 1);
            f37866yggfygwlhe = c0856zoijcleaow;
            C0855ppxfxbqfkf c0855ppxfxbqfkf = new C0855ppxfxbqfkf("WEEK_OF_WEEK_BASED_YEAR", 2);
            f37865jyumaefscl = c0855ppxfxbqfkf;
            wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc("WEEK_BASED_YEAR", 3);
            f37864iwizpuwonk = wkgbmnqykcVar;
            f37863esjtqupxsv = new zoijcleaow[]{iobyxmoadgVar, c0856zoijcleaow, c0855ppxfxbqfkf, wkgbmnqykcVar};
            f37862cqumvgiudr = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
        }

        private zoijcleaow(String str, int i13) {
            super(str, i13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int cqumvgiudr(cm.eablkybsjg eablkybsjgVar) {
            int iPkzmftpjix = eablkybsjgVar.pkzmftpjix();
            int iLmojexxdyd = eablkybsjgVar.lmojexxdyd();
            if (iLmojexxdyd <= 3) {
                return iLmojexxdyd - eablkybsjgVar.yadqdtsiqt().ordinal() < -2 ? iPkzmftpjix - 1 : iPkzmftpjix;
            }
            if (iLmojexxdyd >= 363) {
                return ((iLmojexxdyd - 363) - (eablkybsjgVar.hcddaimhww() ? 1 : 0)) - eablkybsjgVar.yadqdtsiqt().ordinal() >= 0 ? iPkzmftpjix + 1 : iPkzmftpjix;
            }
            return iPkzmftpjix;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int jyumaefscl(cm.eablkybsjg eablkybsjgVar) {
            int iOrdinal = eablkybsjgVar.yadqdtsiqt().ordinal();
            int iLmojexxdyd = eablkybsjgVar.lmojexxdyd() - 1;
            int i13 = (3 - iOrdinal) + iLmojexxdyd;
            int i14 = i13 - ((i13 / 7) * 7);
            int i15 = i14 - 3;
            if (i15 < -3) {
                i15 = i14 + 4;
            }
            if (iLmojexxdyd < i15) {
                return (int) pmvmpeiblj(eablkybsjgVar.okpsazkaxt(180).dsvhmnatus(1L)).lqeggnwhkg();
            }
            int i16 = ((iLmojexxdyd - i15) / 7) + 1;
            if (i16 != 53 || i15 == -3 || (i15 == -2 && eablkybsjgVar.hcddaimhww())) {
                return i16;
            }
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int lereixgezr(int i13) {
            cm.eablkybsjg eablkybsjgVarWypolnanlu = cm.eablkybsjg.wypolnanlu(i13, 1, 1);
            if (eablkybsjgVarWypolnanlu.yadqdtsiqt() != cm.zoijcleaow.THURSDAY) {
                return (eablkybsjgVarWypolnanlu.yadqdtsiqt() == cm.zoijcleaow.WEDNESDAY && eablkybsjgVarWypolnanlu.hcddaimhww()) ? 53 : 52;
            }
            return 53;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static draadjrbmk pmvmpeiblj(cm.eablkybsjg eablkybsjgVar) {
            return draadjrbmk.ojitshcjhn(1L, lereixgezr(cqumvgiudr(eablkybsjgVar)));
        }

        public static zoijcleaow valueOf(String str) {
            return (zoijcleaow) Enum.valueOf(zoijcleaow.class, str);
        }

        public static zoijcleaow[] values() {
            return (zoijcleaow[]) f37863esjtqupxsv.clone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean zynmafqrjb(eablkybsjg eablkybsjgVar) {
            return dm.eablkybsjg.lqeggnwhkg(eablkybsjgVar).equals(dm.gxszxtbevo.f29133cqumvgiudr);
        }

        @Override // gm.nufgyqmvbu
        public boolean draadjrbmk() {
            return false;
        }

        @Override // gm.nufgyqmvbu
        public boolean iobyxmoadg() {
            return true;
        }

        /* synthetic */ zoijcleaow(String str, int i13, iobyxmoadg iobyxmoadgVar) {
            this(str, i13);
        }
    }
}
