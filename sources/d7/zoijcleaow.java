package d7;

import i7.jyumaefscl;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.yggfygwlhe;
import lk.zynmafqrjb;
import mj.kcexrzcfyt;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f27128ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zynmafqrjb f27129iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final d7.iobyxmoadg f27130zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private final boolean eablkybsjg(String str) {
            return (kcexrzcfyt.istkbnxepw("Connection", str, true) || kcexrzcfyt.istkbnxepw("Keep-Alive", str, true) || kcexrzcfyt.istkbnxepw("Proxy-Authenticate", str, true) || kcexrzcfyt.istkbnxepw("Proxy-Authorization", str, true) || kcexrzcfyt.istkbnxepw("TE", str, true) || kcexrzcfyt.istkbnxepw("Trailers", str, true) || kcexrzcfyt.istkbnxepw("Transfer-Encoding", str, true) || kcexrzcfyt.istkbnxepw("Upgrade", str, true)) ? false : true;
        }

        private final boolean wkgbmnqykc(String str) {
            return kcexrzcfyt.istkbnxepw("Content-Length", str, true) || kcexrzcfyt.istkbnxepw("Content-Encoding", str, true) || kcexrzcfyt.istkbnxepw("Content-Type", str, true);
        }

        public final yggfygwlhe iobyxmoadg(yggfygwlhe yggfygwlheVar, yggfygwlhe yggfygwlheVar2) {
            yggfygwlhe.iobyxmoadg iobyxmoadgVar = new yggfygwlhe.iobyxmoadg();
            int size = yggfygwlheVar.size();
            for (int i13 = 0; i13 < size; i13++) {
                String strWkgbmnqykc = yggfygwlheVar.wkgbmnqykc(i13);
                String strBtonecajqb = yggfygwlheVar.btonecajqb(i13);
                if ((!kcexrzcfyt.istkbnxepw("Warning", strWkgbmnqykc, true) || !kcexrzcfyt.stevsuqkhv(strBtonecajqb, "1", false, 2, null)) && (wkgbmnqykc(strWkgbmnqykc) || !eablkybsjg(strWkgbmnqykc) || yggfygwlheVar2.iobyxmoadg(strWkgbmnqykc) == null)) {
                    iobyxmoadgVar.iobyxmoadg(strWkgbmnqykc, strBtonecajqb);
                }
            }
            int size2 = yggfygwlheVar2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                String strWkgbmnqykc2 = yggfygwlheVar2.wkgbmnqykc(i14);
                if (!wkgbmnqykc(strWkgbmnqykc2) && eablkybsjg(strWkgbmnqykc2)) {
                    iobyxmoadgVar.iobyxmoadg(strWkgbmnqykc2, yggfygwlheVar2.btonecajqb(i14));
                }
            }
            return iobyxmoadgVar.gxszxtbevo();
        }

        public final boolean ppxfxbqfkf(zynmafqrjb zynmafqrjbVar, cdpycssgdh cdpycssgdhVar) {
            return (zynmafqrjbVar.zoijcleaow().btonecajqb() || cdpycssgdhVar.lqeggnwhkg().btonecajqb() || zdlpuopuiu.eablkybsjg(cdpycssgdhVar.kcexrzcfyt().iobyxmoadg("Vary"), "*")) ? false : true;
        }

        public final boolean zoijcleaow(zynmafqrjb zynmafqrjbVar, d7.iobyxmoadg iobyxmoadgVar) {
            return (zynmafqrjbVar.zoijcleaow().btonecajqb() || iobyxmoadgVar.iobyxmoadg().btonecajqb() || zdlpuopuiu.eablkybsjg(iobyxmoadgVar.wkgbmnqykc().iobyxmoadg("Vary"), "*")) ? false : true;
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: d7.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C0500zoijcleaow {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private String f27131btonecajqb;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private long f27132dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private Date f27133eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private int f27134gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private String f27135gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final zynmafqrjb f27136iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private Date f27137lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private long f27138nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private Date f27139ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private String f27140wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final d7.iobyxmoadg f27141zoijcleaow;

        public C0500zoijcleaow(zynmafqrjb zynmafqrjbVar, d7.iobyxmoadg iobyxmoadgVar) {
            this.f27136iobyxmoadg = zynmafqrjbVar;
            this.f27141zoijcleaow = iobyxmoadgVar;
            this.f27134gtknphoqwx = -1;
            if (iobyxmoadgVar != null) {
                this.f27138nufgyqmvbu = iobyxmoadgVar.eablkybsjg();
                this.f27132dxjokdxxww = iobyxmoadgVar.ppxfxbqfkf();
                yggfygwlhe yggfygwlheVarWkgbmnqykc = iobyxmoadgVar.wkgbmnqykc();
                int size = yggfygwlheVarWkgbmnqykc.size();
                for (int i13 = 0; i13 < size; i13++) {
                    String strWkgbmnqykc = yggfygwlheVarWkgbmnqykc.wkgbmnqykc(i13);
                    if (kcexrzcfyt.istkbnxepw(strWkgbmnqykc, "Date", true)) {
                        this.f27139ppxfxbqfkf = yggfygwlheVarWkgbmnqykc.zoijcleaow("Date");
                        this.f27140wkgbmnqykc = yggfygwlheVarWkgbmnqykc.btonecajqb(i13);
                    } else if (kcexrzcfyt.istkbnxepw(strWkgbmnqykc, "Expires", true)) {
                        this.f27137lqeggnwhkg = yggfygwlheVarWkgbmnqykc.zoijcleaow("Expires");
                    } else if (kcexrzcfyt.istkbnxepw(strWkgbmnqykc, "Last-Modified", true)) {
                        this.f27133eablkybsjg = yggfygwlheVarWkgbmnqykc.zoijcleaow("Last-Modified");
                        this.f27135gxszxtbevo = yggfygwlheVarWkgbmnqykc.btonecajqb(i13);
                    } else if (kcexrzcfyt.istkbnxepw(strWkgbmnqykc, "ETag", true)) {
                        this.f27131btonecajqb = yggfygwlheVarWkgbmnqykc.btonecajqb(i13);
                    } else if (kcexrzcfyt.istkbnxepw(strWkgbmnqykc, "Age", true)) {
                        this.f27134gtknphoqwx = i7.gtknphoqwx.lereixgezr(yggfygwlheVarWkgbmnqykc.btonecajqb(i13), -1);
                    }
                }
            }
        }

        private final long iobyxmoadg() {
            Date date = this.f27139ppxfxbqfkf;
            long jMax = date != null ? Math.max(0L, this.f27132dxjokdxxww - date.getTime()) : 0L;
            int i13 = this.f27134gtknphoqwx;
            if (i13 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i13));
            }
            return jMax + (this.f27132dxjokdxxww - this.f27138nufgyqmvbu) + (jyumaefscl.f42065iobyxmoadg.iobyxmoadg() - this.f27132dxjokdxxww);
        }

        private final long ppxfxbqfkf() {
            d7.iobyxmoadg iobyxmoadgVar = this.f27141zoijcleaow;
            zdlpuopuiu.lqeggnwhkg(iobyxmoadgVar);
            lk.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = iobyxmoadgVar.iobyxmoadg();
            if (wkgbmnqykcVarIobyxmoadg.eablkybsjg() != -1) {
                return TimeUnit.SECONDS.toMillis(wkgbmnqykcVarIobyxmoadg.eablkybsjg());
            }
            Date date = this.f27137lqeggnwhkg;
            if (date != null) {
                Date date2 = this.f27139ppxfxbqfkf;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f27132dxjokdxxww);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f27133eablkybsjg == null || this.f27136iobyxmoadg.gtknphoqwx().vdvldrhtss() != null) {
                return 0L;
            }
            Date date3 = this.f27139ppxfxbqfkf;
            long time2 = date3 != null ? date3.getTime() : this.f27138nufgyqmvbu;
            Date date4 = this.f27133eablkybsjg;
            zdlpuopuiu.lqeggnwhkg(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / ((long) 10);
            }
            return 0L;
        }

        private final boolean wkgbmnqykc(zynmafqrjb zynmafqrjbVar) {
            return (zynmafqrjbVar.wkgbmnqykc("If-Modified-Since") == null && zynmafqrjbVar.wkgbmnqykc("If-None-Match") == null) ? false : true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final zoijcleaow zoijcleaow() {
            String str;
            d7.iobyxmoadg iobyxmoadgVar = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            Object[] objArr10 = 0;
            Object[] objArr11 = 0;
            Object[] objArr12 = 0;
            if (this.f27141zoijcleaow == null) {
                return new zoijcleaow(this.f27136iobyxmoadg, iobyxmoadgVar, objArr12 == true ? 1 : 0);
            }
            if (this.f27136iobyxmoadg.gxszxtbevo() && !this.f27141zoijcleaow.gxszxtbevo()) {
                return new zoijcleaow(this.f27136iobyxmoadg, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0);
            }
            lk.wkgbmnqykc wkgbmnqykcVarIobyxmoadg = this.f27141zoijcleaow.iobyxmoadg();
            if (!zoijcleaow.f27128ppxfxbqfkf.zoijcleaow(this.f27136iobyxmoadg, this.f27141zoijcleaow)) {
                return new zoijcleaow(this.f27136iobyxmoadg, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0);
            }
            lk.wkgbmnqykc wkgbmnqykcVarZoijcleaow = this.f27136iobyxmoadg.zoijcleaow();
            if (wkgbmnqykcVarZoijcleaow.dxjokdxxww() || wkgbmnqykc(this.f27136iobyxmoadg)) {
                return new zoijcleaow(this.f27136iobyxmoadg, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
            }
            long jIobyxmoadg = iobyxmoadg();
            long jPpxfxbqfkf = ppxfxbqfkf();
            if (wkgbmnqykcVarZoijcleaow.eablkybsjg() != -1) {
                jPpxfxbqfkf = Math.min(jPpxfxbqfkf, TimeUnit.SECONDS.toMillis(wkgbmnqykcVarZoijcleaow.eablkybsjg()));
            }
            long millis = 0;
            long millis2 = wkgbmnqykcVarZoijcleaow.lqeggnwhkg() != -1 ? TimeUnit.SECONDS.toMillis(wkgbmnqykcVarZoijcleaow.lqeggnwhkg()) : 0L;
            if (!wkgbmnqykcVarIobyxmoadg.nufgyqmvbu() && wkgbmnqykcVarZoijcleaow.gxszxtbevo() != -1) {
                millis = TimeUnit.SECONDS.toMillis(wkgbmnqykcVarZoijcleaow.gxszxtbevo());
            }
            if (!wkgbmnqykcVarIobyxmoadg.dxjokdxxww() && jIobyxmoadg + millis2 < jPpxfxbqfkf + millis) {
                return new zoijcleaow(objArr7 == true ? 1 : 0, this.f27141zoijcleaow, objArr6 == true ? 1 : 0);
            }
            String str2 = this.f27131btonecajqb;
            if (str2 != null) {
                zdlpuopuiu.lqeggnwhkg(str2);
                str = "If-None-Match";
            } else {
                str = "If-Modified-Since";
                if (this.f27133eablkybsjg != null) {
                    str2 = this.f27135gxszxtbevo;
                    zdlpuopuiu.lqeggnwhkg(str2);
                } else {
                    if (this.f27139ppxfxbqfkf == null) {
                        return new zoijcleaow(this.f27136iobyxmoadg, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0);
                    }
                    str2 = this.f27140wkgbmnqykc;
                    zdlpuopuiu.lqeggnwhkg(str2);
                }
            }
            return new zoijcleaow(this.f27136iobyxmoadg.nufgyqmvbu().iobyxmoadg(str, str2).zoijcleaow(), this.f27141zoijcleaow, objArr5 == true ? 1 : 0);
        }
    }

    public /* synthetic */ zoijcleaow(zynmafqrjb zynmafqrjbVar, d7.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar) {
        this(zynmafqrjbVar, iobyxmoadgVar);
    }

    public final d7.iobyxmoadg iobyxmoadg() {
        return this.f27130zoijcleaow;
    }

    public final zynmafqrjb zoijcleaow() {
        return this.f27129iobyxmoadg;
    }

    private zoijcleaow(zynmafqrjb zynmafqrjbVar, d7.iobyxmoadg iobyxmoadgVar) {
        this.f27129iobyxmoadg = zynmafqrjbVar;
        this.f27130zoijcleaow = iobyxmoadgVar;
    }
}
