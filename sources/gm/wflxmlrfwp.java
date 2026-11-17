package gm;

import cm.agtfadlqog;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes3.dex */
public final class wflxmlrfwp implements Serializable {
    private static final long serialVersionUID = -1177360819670808121L;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f37876yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final cm.zoijcleaow f37877zdlpuopuiu;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final ConcurrentMap f37869pmvmpeiblj = new ConcurrentHashMap(4, 0.75f, 2);

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    public static final wflxmlrfwp f37870zynmafqrjb = new wflxmlrfwp(cm.zoijcleaow.MONDAY, 4);

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    public static final wflxmlrfwp f37868istkbnxepw = dxjokdxxww(cm.zoijcleaow.SUNDAY, 1);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final transient nufgyqmvbu f37874jyumaefscl = iobyxmoadg.gtknphoqwx(this);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final transient nufgyqmvbu f37873iwizpuwonk = iobyxmoadg.agtfadlqog(this);

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final transient nufgyqmvbu f37871cqumvgiudr = iobyxmoadg.rgvfuqvkyq(this);

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final transient nufgyqmvbu f37872esjtqupxsv = iobyxmoadg.ojitshcjhn(this);

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final transient nufgyqmvbu f37875lereixgezr = iobyxmoadg.wflxmlrfwp(this);

    static class iobyxmoadg implements nufgyqmvbu {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        private final draadjrbmk f37883cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        private final gtknphoqwx f37884iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final gtknphoqwx f37885jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final wflxmlrfwp f37886yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f37887zdlpuopuiu;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        private static final draadjrbmk f37878esjtqupxsv = draadjrbmk.ojitshcjhn(1, 7);

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        private static final draadjrbmk f37880lereixgezr = draadjrbmk.vdvldrhtss(0, 1, 4, 6);

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        private static final draadjrbmk f37881pmvmpeiblj = draadjrbmk.vdvldrhtss(0, 1, 52, 54);

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        private static final draadjrbmk f37882zynmafqrjb = draadjrbmk.rgvfuqvkyq(1, 52, 53);

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        private static final draadjrbmk f37879istkbnxepw = gm.iobyxmoadg.f37816crxdokpmqz.dxjokdxxww();

        private iobyxmoadg(String str, wflxmlrfwp wflxmlrfwpVar, gtknphoqwx gtknphoqwxVar, gtknphoqwx gtknphoqwxVar2, draadjrbmk draadjrbmkVar) {
            this.f37887zdlpuopuiu = str;
            this.f37886yggfygwlhe = wflxmlrfwpVar;
            this.f37885jyumaefscl = gtknphoqwxVar;
            this.f37884iwizpuwonk = gtknphoqwxVar2;
            this.f37883cqumvgiudr = draadjrbmkVar;
        }

        static iobyxmoadg agtfadlqog(wflxmlrfwp wflxmlrfwpVar) {
            return new iobyxmoadg("WeekOfMonth", wflxmlrfwpVar, zoijcleaow.WEEKS, zoijcleaow.MONTHS, f37880lereixgezr);
        }

        private int eablkybsjg(eablkybsjg eablkybsjgVar) {
            int iGxszxtbevo = fm.ppxfxbqfkf.gxszxtbevo(eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37820hkdspvbjdz) - this.f37886yggfygwlhe.lqeggnwhkg().kcexrzcfyt(), 7) + 1;
            long jGxszxtbevo = gxszxtbevo(eablkybsjgVar, iGxszxtbevo);
            if (jGxszxtbevo == 0) {
                return ((int) gxszxtbevo(dm.eablkybsjg.lqeggnwhkg(eablkybsjgVar).wkgbmnqykc(eablkybsjgVar).zdlpuopuiu(1L, zoijcleaow.WEEKS), iGxszxtbevo)) + 1;
            }
            if (jGxszxtbevo >= 53) {
                int iZoijcleaow = zoijcleaow(oxmwwwfdhm(eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37835stevsuqkhv), iGxszxtbevo), (agtfadlqog.zdlpuopuiu((long) eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37816crxdokpmqz)) ? 366 : 365) + this.f37886yggfygwlhe.nufgyqmvbu());
                if (jGxszxtbevo >= iZoijcleaow) {
                    return (int) (jGxszxtbevo - ((long) (iZoijcleaow - 1)));
                }
            }
            return (int) jGxszxtbevo;
        }

        static iobyxmoadg gtknphoqwx(wflxmlrfwp wflxmlrfwpVar) {
            return new iobyxmoadg("DayOfWeek", wflxmlrfwpVar, zoijcleaow.DAYS, zoijcleaow.WEEKS, f37878esjtqupxsv);
        }

        private long gxszxtbevo(eablkybsjg eablkybsjgVar, int i13) {
            int iOjitshcjhn = eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37835stevsuqkhv);
            return zoijcleaow(oxmwwwfdhm(iOjitshcjhn, i13), iOjitshcjhn);
        }

        static iobyxmoadg ojitshcjhn(wflxmlrfwp wflxmlrfwpVar) {
            return new iobyxmoadg("WeekOfWeekBasedYear", wflxmlrfwpVar, zoijcleaow.WEEKS, ppxfxbqfkf.f37850eablkybsjg, f37882zynmafqrjb);
        }

        private int oxmwwwfdhm(int i13, int i14) {
            int iGxszxtbevo = fm.ppxfxbqfkf.gxszxtbevo(i13 - i14, 7);
            return iGxszxtbevo + 1 > this.f37886yggfygwlhe.nufgyqmvbu() ? 7 - iGxszxtbevo : -iGxszxtbevo;
        }

        private int ppxfxbqfkf(eablkybsjg eablkybsjgVar) {
            int iGxszxtbevo = fm.ppxfxbqfkf.gxszxtbevo(eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37820hkdspvbjdz) - this.f37886yggfygwlhe.lqeggnwhkg().kcexrzcfyt(), 7) + 1;
            int iOjitshcjhn = eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37816crxdokpmqz);
            long jGxszxtbevo = gxszxtbevo(eablkybsjgVar, iGxszxtbevo);
            if (jGxszxtbevo == 0) {
                return iOjitshcjhn - 1;
            }
            if (jGxszxtbevo < 53) {
                return iOjitshcjhn;
            }
            return jGxszxtbevo >= ((long) zoijcleaow(oxmwwwfdhm(eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37835stevsuqkhv), iGxszxtbevo), (agtfadlqog.zdlpuopuiu((long) iOjitshcjhn) ? 366 : 365) + this.f37886yggfygwlhe.nufgyqmvbu())) ? iOjitshcjhn + 1 : iOjitshcjhn;
        }

        static iobyxmoadg rgvfuqvkyq(wflxmlrfwp wflxmlrfwpVar) {
            return new iobyxmoadg("WeekOfYear", wflxmlrfwpVar, zoijcleaow.WEEKS, zoijcleaow.YEARS, f37881pmvmpeiblj);
        }

        private draadjrbmk vdvldrhtss(eablkybsjg eablkybsjgVar) {
            int iGxszxtbevo = fm.ppxfxbqfkf.gxszxtbevo(eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37820hkdspvbjdz) - this.f37886yggfygwlhe.lqeggnwhkg().kcexrzcfyt(), 7) + 1;
            long jGxszxtbevo = gxszxtbevo(eablkybsjgVar, iGxszxtbevo);
            if (jGxszxtbevo == 0) {
                return vdvldrhtss(dm.eablkybsjg.lqeggnwhkg(eablkybsjgVar).wkgbmnqykc(eablkybsjgVar).zdlpuopuiu(2L, zoijcleaow.WEEKS));
            }
            int iZoijcleaow = zoijcleaow(oxmwwwfdhm(eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37835stevsuqkhv), iGxszxtbevo), (agtfadlqog.zdlpuopuiu((long) eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37816crxdokpmqz)) ? 366 : 365) + this.f37886yggfygwlhe.nufgyqmvbu());
            return jGxszxtbevo >= ((long) iZoijcleaow) ? vdvldrhtss(dm.eablkybsjg.lqeggnwhkg(eablkybsjgVar).wkgbmnqykc(eablkybsjgVar).wkgbmnqykc(2L, zoijcleaow.WEEKS)) : draadjrbmk.ojitshcjhn(1L, iZoijcleaow - 1);
        }

        static iobyxmoadg wflxmlrfwp(wflxmlrfwp wflxmlrfwpVar) {
            return new iobyxmoadg("WeekBasedYear", wflxmlrfwpVar, ppxfxbqfkf.f37850eablkybsjg, zoijcleaow.FOREVER, f37879istkbnxepw);
        }

        private int zoijcleaow(int i13, int i14) {
            return ((i13 + 7) + (i14 - 1)) / 7;
        }

        @Override // gm.nufgyqmvbu
        public wkgbmnqykc btonecajqb(wkgbmnqykc wkgbmnqykcVar, long j13) {
            int iIobyxmoadg = this.f37883cqumvgiudr.iobyxmoadg(j13, this);
            int iOjitshcjhn = wkgbmnqykcVar.ojitshcjhn(this);
            if (iIobyxmoadg == iOjitshcjhn) {
                return wkgbmnqykcVar;
            }
            if (this.f37884iwizpuwonk != zoijcleaow.FOREVER) {
                return wkgbmnqykcVar.wkgbmnqykc(iIobyxmoadg - iOjitshcjhn, this.f37885jyumaefscl);
            }
            int iOjitshcjhn2 = wkgbmnqykcVar.ojitshcjhn(this.f37886yggfygwlhe.f37872esjtqupxsv);
            long j14 = (long) ((j13 - ((long) iOjitshcjhn)) * 52.1775d);
            zoijcleaow zoijcleaowVar = zoijcleaow.WEEKS;
            wkgbmnqykc wkgbmnqykcVarWkgbmnqykc = wkgbmnqykcVar.wkgbmnqykc(j14, zoijcleaowVar);
            if (wkgbmnqykcVarWkgbmnqykc.ojitshcjhn(this) > iIobyxmoadg) {
                return wkgbmnqykcVarWkgbmnqykc.zdlpuopuiu(wkgbmnqykcVarWkgbmnqykc.ojitshcjhn(this.f37886yggfygwlhe.f37872esjtqupxsv), zoijcleaowVar);
            }
            if (wkgbmnqykcVarWkgbmnqykc.ojitshcjhn(this) < iIobyxmoadg) {
                wkgbmnqykcVarWkgbmnqykc = wkgbmnqykcVarWkgbmnqykc.wkgbmnqykc(2L, zoijcleaowVar);
            }
            wkgbmnqykc wkgbmnqykcVarWkgbmnqykc2 = wkgbmnqykcVarWkgbmnqykc.wkgbmnqykc(iOjitshcjhn2 - wkgbmnqykcVarWkgbmnqykc.ojitshcjhn(this.f37886yggfygwlhe.f37872esjtqupxsv), zoijcleaowVar);
            return wkgbmnqykcVarWkgbmnqykc2.ojitshcjhn(this) > iIobyxmoadg ? wkgbmnqykcVarWkgbmnqykc2.zdlpuopuiu(1L, zoijcleaowVar) : wkgbmnqykcVarWkgbmnqykc2;
        }

        @Override // gm.nufgyqmvbu
        public boolean draadjrbmk() {
            return false;
        }

        @Override // gm.nufgyqmvbu
        public draadjrbmk dxjokdxxww() {
            return this.f37883cqumvgiudr;
        }

        @Override // gm.nufgyqmvbu
        public boolean iobyxmoadg() {
            return true;
        }

        @Override // gm.nufgyqmvbu
        public draadjrbmk lqeggnwhkg(eablkybsjg eablkybsjgVar) {
            gm.iobyxmoadg iobyxmoadgVar;
            gtknphoqwx gtknphoqwxVar = this.f37884iwizpuwonk;
            if (gtknphoqwxVar == zoijcleaow.WEEKS) {
                return this.f37883cqumvgiudr;
            }
            if (gtknphoqwxVar == zoijcleaow.MONTHS) {
                iobyxmoadgVar = gm.iobyxmoadg.f37840wypolnanlu;
            } else {
                if (gtknphoqwxVar != zoijcleaow.YEARS) {
                    if (gtknphoqwxVar == ppxfxbqfkf.f37850eablkybsjg) {
                        return vdvldrhtss(eablkybsjgVar);
                    }
                    if (gtknphoqwxVar == zoijcleaow.FOREVER) {
                        return eablkybsjgVar.lqeggnwhkg(gm.iobyxmoadg.f37816crxdokpmqz);
                    }
                    throw new IllegalStateException("unreachable");
                }
                iobyxmoadgVar = gm.iobyxmoadg.f37835stevsuqkhv;
            }
            int iOxmwwwfdhm = oxmwwwfdhm(eablkybsjgVar.ojitshcjhn(iobyxmoadgVar), fm.ppxfxbqfkf.gxszxtbevo(eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37820hkdspvbjdz) - this.f37886yggfygwlhe.lqeggnwhkg().kcexrzcfyt(), 7) + 1);
            draadjrbmk draadjrbmkVarLqeggnwhkg = eablkybsjgVar.lqeggnwhkg(iobyxmoadgVar);
            return draadjrbmk.ojitshcjhn(zoijcleaow(iOxmwwwfdhm, (int) draadjrbmkVarLqeggnwhkg.nufgyqmvbu()), zoijcleaow(iOxmwwwfdhm, (int) draadjrbmkVarLqeggnwhkg.lqeggnwhkg()));
        }

        @Override // gm.nufgyqmvbu
        public boolean nufgyqmvbu(eablkybsjg eablkybsjgVar) {
            if (!eablkybsjgVar.iobyxmoadg(gm.iobyxmoadg.f37820hkdspvbjdz)) {
                return false;
            }
            gtknphoqwx gtknphoqwxVar = this.f37884iwizpuwonk;
            if (gtknphoqwxVar == zoijcleaow.WEEKS) {
                return true;
            }
            if (gtknphoqwxVar == zoijcleaow.MONTHS) {
                return eablkybsjgVar.iobyxmoadg(gm.iobyxmoadg.f37840wypolnanlu);
            }
            if (gtknphoqwxVar == zoijcleaow.YEARS) {
                return eablkybsjgVar.iobyxmoadg(gm.iobyxmoadg.f37835stevsuqkhv);
            }
            if (gtknphoqwxVar == ppxfxbqfkf.f37850eablkybsjg || gtknphoqwxVar == zoijcleaow.FOREVER) {
                return eablkybsjgVar.iobyxmoadg(gm.iobyxmoadg.f37826kegysxyocb);
            }
            return false;
        }

        public String toString() {
            return this.f37887zdlpuopuiu + "[" + this.f37886yggfygwlhe.toString() + "]";
        }

        @Override // gm.nufgyqmvbu
        public long wkgbmnqykc(eablkybsjg eablkybsjgVar) {
            int iPpxfxbqfkf;
            int iGxszxtbevo = fm.ppxfxbqfkf.gxszxtbevo(eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37820hkdspvbjdz) - this.f37886yggfygwlhe.lqeggnwhkg().kcexrzcfyt(), 7) + 1;
            gtknphoqwx gtknphoqwxVar = this.f37884iwizpuwonk;
            if (gtknphoqwxVar == zoijcleaow.WEEKS) {
                return iGxszxtbevo;
            }
            if (gtknphoqwxVar == zoijcleaow.MONTHS) {
                int iOjitshcjhn = eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37840wypolnanlu);
                iPpxfxbqfkf = zoijcleaow(oxmwwwfdhm(iOjitshcjhn, iGxszxtbevo), iOjitshcjhn);
            } else if (gtknphoqwxVar == zoijcleaow.YEARS) {
                int iOjitshcjhn2 = eablkybsjgVar.ojitshcjhn(gm.iobyxmoadg.f37835stevsuqkhv);
                iPpxfxbqfkf = zoijcleaow(oxmwwwfdhm(iOjitshcjhn2, iGxszxtbevo), iOjitshcjhn2);
            } else if (gtknphoqwxVar == ppxfxbqfkf.f37850eablkybsjg) {
                iPpxfxbqfkf = eablkybsjg(eablkybsjgVar);
            } else {
                if (gtknphoqwxVar != zoijcleaow.FOREVER) {
                    throw new IllegalStateException("unreachable");
                }
                iPpxfxbqfkf = ppxfxbqfkf(eablkybsjgVar);
            }
            return iPpxfxbqfkf;
        }
    }

    private wflxmlrfwp(cm.zoijcleaow zoijcleaowVar, int i13) {
        fm.ppxfxbqfkf.dxjokdxxww(zoijcleaowVar, "firstDayOfWeek");
        if (i13 < 1 || i13 > 7) {
            throw new IllegalArgumentException("Minimal number of days is invalid");
        }
        this.f37877zdlpuopuiu = zoijcleaowVar;
        this.f37876yggfygwlhe = i13;
    }

    public static wflxmlrfwp btonecajqb(Locale locale) {
        fm.ppxfxbqfkf.dxjokdxxww(locale, CommonUrlParts.LOCALE);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(new Locale(locale.getLanguage(), locale.getCountry()));
        return dxjokdxxww(cm.zoijcleaow.SUNDAY.jyumaefscl(gregorianCalendar.getFirstDayOfWeek() - 1), gregorianCalendar.getMinimalDaysInFirstWeek());
    }

    public static wflxmlrfwp dxjokdxxww(cm.zoijcleaow zoijcleaowVar, int i13) {
        String str = zoijcleaowVar.toString() + i13;
        ConcurrentMap concurrentMap = f37869pmvmpeiblj;
        wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) concurrentMap.get(str);
        if (wflxmlrfwpVar != null) {
            return wflxmlrfwpVar;
        }
        concurrentMap.putIfAbsent(str, new wflxmlrfwp(zoijcleaowVar, i13));
        return (wflxmlrfwp) concurrentMap.get(str);
    }

    private Object readResolve() throws InvalidObjectException {
        try {
            return dxjokdxxww(this.f37877zdlpuopuiu, this.f37876yggfygwlhe);
        } catch (IllegalArgumentException e13) {
            throw new InvalidObjectException("Invalid WeekFields" + e13.getMessage());
        }
    }

    public nufgyqmvbu agtfadlqog() {
        return this.f37873iwizpuwonk;
    }

    public nufgyqmvbu draadjrbmk() {
        return this.f37875lereixgezr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wflxmlrfwp) && hashCode() == obj.hashCode();
    }

    public int hashCode() {
        return (this.f37877zdlpuopuiu.ordinal() * 7) + this.f37876yggfygwlhe;
    }

    public cm.zoijcleaow lqeggnwhkg() {
        return this.f37877zdlpuopuiu;
    }

    public int nufgyqmvbu() {
        return this.f37876yggfygwlhe;
    }

    public nufgyqmvbu ojitshcjhn() {
        return this.f37872esjtqupxsv;
    }

    public String toString() {
        return "WeekFields[" + this.f37877zdlpuopuiu + ',' + this.f37876yggfygwlhe + ']';
    }

    public nufgyqmvbu wkgbmnqykc() {
        return this.f37874jyumaefscl;
    }
}
