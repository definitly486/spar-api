package ok;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lk.cdpycssgdh;
import lk.wkgbmnqykc;
import lk.yggfygwlhe;
import lk.zynmafqrjb;
import mj.kcexrzcfyt;
import mk.wflxmlrfwp;
import rk.ppxfxbqfkf;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f72996ppxfxbqfkf = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final zynmafqrjb f72997iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final cdpycssgdh f72998zoijcleaow;

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:24:0x003b  */
        public final boolean iobyxmoadg(cdpycssgdh response, zynmafqrjb request) {
            zdlpuopuiu.btonecajqb(response, "response");
            zdlpuopuiu.btonecajqb(request, "request");
            int iBtonecajqb = response.btonecajqb();
            if (iBtonecajqb != 200 && iBtonecajqb != 410 && iBtonecajqb != 414 && iBtonecajqb != 501 && iBtonecajqb != 203 && iBtonecajqb != 204) {
                if (iBtonecajqb == 307) {
                    if (cdpycssgdh.vdvldrhtss(response, "Expires", null, 2, null) == null && response.lqeggnwhkg().eablkybsjg() == -1 && !response.lqeggnwhkg().wkgbmnqykc() && !response.lqeggnwhkg().ppxfxbqfkf()) {
                        return false;
                    }
                } else if (iBtonecajqb != 308 && iBtonecajqb != 404 && iBtonecajqb != 405) {
                    switch (iBtonecajqb) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            if (cdpycssgdh.vdvldrhtss(response, "Expires", null, 2, null) == null) {
                                return false;
                            }
                            break;
                        default:
                            return false;
                    }
                }
            }
            return (response.lqeggnwhkg().btonecajqb() || request.zoijcleaow().btonecajqb()) ? false : true;
        }

        private iobyxmoadg() {
        }
    }

    /* JADX INFO: renamed from: ok.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C1589zoijcleaow {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private long f72999btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private int f73000draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private long f73001dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private String f73002eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private String f73003gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private Date f73004gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final long f73005iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private String f73006lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private Date f73007nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final cdpycssgdh f73008ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private Date f73009wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final zynmafqrjb f73010zoijcleaow;

        public C1589zoijcleaow(long j13, zynmafqrjb request, cdpycssgdh cdpycssgdhVar) {
            zdlpuopuiu.btonecajqb(request, "request");
            this.f73005iobyxmoadg = j13;
            this.f73010zoijcleaow = request;
            this.f73008ppxfxbqfkf = cdpycssgdhVar;
            this.f73000draadjrbmk = -1;
            if (cdpycssgdhVar != null) {
                this.f73001dxjokdxxww = cdpycssgdhVar.wwaezpbzkn();
                this.f72999btonecajqb = cdpycssgdhVar.istkbnxepw();
                yggfygwlhe yggfygwlheVarKcexrzcfyt = cdpycssgdhVar.kcexrzcfyt();
                int size = yggfygwlheVarKcexrzcfyt.size();
                for (int i13 = 0; i13 < size; i13++) {
                    String strWkgbmnqykc = yggfygwlheVarKcexrzcfyt.wkgbmnqykc(i13);
                    String strBtonecajqb = yggfygwlheVarKcexrzcfyt.btonecajqb(i13);
                    if (kcexrzcfyt.istkbnxepw(strWkgbmnqykc, "Date", true)) {
                        this.f73009wkgbmnqykc = ppxfxbqfkf.iobyxmoadg(strBtonecajqb);
                        this.f73002eablkybsjg = strBtonecajqb;
                    } else if (kcexrzcfyt.istkbnxepw(strWkgbmnqykc, "Expires", true)) {
                        this.f73007nufgyqmvbu = ppxfxbqfkf.iobyxmoadg(strBtonecajqb);
                    } else if (kcexrzcfyt.istkbnxepw(strWkgbmnqykc, "Last-Modified", true)) {
                        this.f73004gxszxtbevo = ppxfxbqfkf.iobyxmoadg(strBtonecajqb);
                        this.f73006lqeggnwhkg = strBtonecajqb;
                    } else if (kcexrzcfyt.istkbnxepw(strWkgbmnqykc, "ETag", true)) {
                        this.f73003gtknphoqwx = strBtonecajqb;
                    } else if (kcexrzcfyt.istkbnxepw(strWkgbmnqykc, "Age", true)) {
                        this.f73000draadjrbmk = wflxmlrfwp.yadqdtsiqt(strBtonecajqb, -1);
                    }
                }
            }
        }

        private final boolean eablkybsjg(zynmafqrjb zynmafqrjbVar) {
            return (zynmafqrjbVar.wkgbmnqykc("If-Modified-Since") == null && zynmafqrjbVar.wkgbmnqykc("If-None-Match") == null) ? false : true;
        }

        private final boolean gxszxtbevo() {
            cdpycssgdh cdpycssgdhVar = this.f73008ppxfxbqfkf;
            zdlpuopuiu.lqeggnwhkg(cdpycssgdhVar);
            return cdpycssgdhVar.lqeggnwhkg().eablkybsjg() == -1 && this.f73007nufgyqmvbu == null;
        }

        private final long iobyxmoadg() {
            Date date = this.f73009wkgbmnqykc;
            long jMax = date != null ? Math.max(0L, this.f72999btonecajqb - date.getTime()) : 0L;
            int i13 = this.f73000draadjrbmk;
            if (i13 != -1) {
                jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i13));
            }
            long j13 = this.f72999btonecajqb;
            return jMax + (j13 - this.f73001dxjokdxxww) + (this.f73005iobyxmoadg - j13);
        }

        private final zoijcleaow ppxfxbqfkf() {
            String str;
            if (this.f73008ppxfxbqfkf == null) {
                return new zoijcleaow(this.f73010zoijcleaow, null);
            }
            if ((!this.f73010zoijcleaow.gxszxtbevo() || this.f73008ppxfxbqfkf.ojitshcjhn() != null) && zoijcleaow.f72996ppxfxbqfkf.iobyxmoadg(this.f73008ppxfxbqfkf, this.f73010zoijcleaow)) {
                wkgbmnqykc wkgbmnqykcVarZoijcleaow = this.f73010zoijcleaow.zoijcleaow();
                if (wkgbmnqykcVarZoijcleaow.dxjokdxxww() || eablkybsjg(this.f73010zoijcleaow)) {
                    return new zoijcleaow(this.f73010zoijcleaow, null);
                }
                wkgbmnqykc wkgbmnqykcVarLqeggnwhkg = this.f73008ppxfxbqfkf.lqeggnwhkg();
                long jIobyxmoadg = iobyxmoadg();
                long jWkgbmnqykc = wkgbmnqykc();
                if (wkgbmnqykcVarZoijcleaow.eablkybsjg() != -1) {
                    jWkgbmnqykc = Math.min(jWkgbmnqykc, TimeUnit.SECONDS.toMillis(wkgbmnqykcVarZoijcleaow.eablkybsjg()));
                }
                long millis = 0;
                long millis2 = wkgbmnqykcVarZoijcleaow.lqeggnwhkg() != -1 ? TimeUnit.SECONDS.toMillis(wkgbmnqykcVarZoijcleaow.lqeggnwhkg()) : 0L;
                if (!wkgbmnqykcVarLqeggnwhkg.nufgyqmvbu() && wkgbmnqykcVarZoijcleaow.gxszxtbevo() != -1) {
                    millis = TimeUnit.SECONDS.toMillis(wkgbmnqykcVarZoijcleaow.gxszxtbevo());
                }
                if (!wkgbmnqykcVarLqeggnwhkg.dxjokdxxww()) {
                    long j13 = millis2 + jIobyxmoadg;
                    if (j13 < millis + jWkgbmnqykc) {
                        cdpycssgdh.iobyxmoadg iobyxmoadgVarCqumvgiudr = this.f73008ppxfxbqfkf.cqumvgiudr();
                        if (j13 >= jWkgbmnqykc) {
                            iobyxmoadgVarCqumvgiudr.iobyxmoadg("Warning", "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (jIobyxmoadg > 86400000 && gxszxtbevo()) {
                            iobyxmoadgVarCqumvgiudr.iobyxmoadg("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new zoijcleaow(null, iobyxmoadgVarCqumvgiudr.ppxfxbqfkf());
                    }
                }
                String str2 = this.f73003gtknphoqwx;
                if (str2 != null) {
                    str = "If-None-Match";
                } else {
                    if (this.f73004gxszxtbevo != null) {
                        str2 = this.f73006lqeggnwhkg;
                    } else {
                        if (this.f73009wkgbmnqykc == null) {
                            return new zoijcleaow(this.f73010zoijcleaow, null);
                        }
                        str2 = this.f73002eablkybsjg;
                    }
                    str = "If-Modified-Since";
                }
                yggfygwlhe.iobyxmoadg iobyxmoadgVarEablkybsjg = this.f73010zoijcleaow.eablkybsjg().eablkybsjg();
                zdlpuopuiu.lqeggnwhkg(str2);
                iobyxmoadgVarEablkybsjg.wkgbmnqykc(str, str2);
                return new zoijcleaow(this.f73010zoijcleaow.nufgyqmvbu().btonecajqb(iobyxmoadgVarEablkybsjg.gxszxtbevo()).zoijcleaow(), this.f73008ppxfxbqfkf);
            }
            return new zoijcleaow(this.f73010zoijcleaow, null);
        }

        private final long wkgbmnqykc() {
            cdpycssgdh cdpycssgdhVar = this.f73008ppxfxbqfkf;
            zdlpuopuiu.lqeggnwhkg(cdpycssgdhVar);
            wkgbmnqykc wkgbmnqykcVarLqeggnwhkg = cdpycssgdhVar.lqeggnwhkg();
            if (wkgbmnqykcVarLqeggnwhkg.eablkybsjg() != -1) {
                return TimeUnit.SECONDS.toMillis(wkgbmnqykcVarLqeggnwhkg.eablkybsjg());
            }
            Date date = this.f73007nufgyqmvbu;
            if (date != null) {
                Date date2 = this.f73009wkgbmnqykc;
                long time = date.getTime() - (date2 != null ? date2.getTime() : this.f72999btonecajqb);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            if (this.f73004gxszxtbevo == null || this.f73008ppxfxbqfkf.cdpycssgdh().gtknphoqwx().vdvldrhtss() != null) {
                return 0L;
            }
            Date date3 = this.f73009wkgbmnqykc;
            long time2 = date3 != null ? date3.getTime() : this.f73001dxjokdxxww;
            Date date4 = this.f73004gxszxtbevo;
            zdlpuopuiu.lqeggnwhkg(date4);
            long time3 = time2 - date4.getTime();
            if (time3 > 0) {
                return time3 / ((long) 10);
            }
            return 0L;
        }

        public final zoijcleaow zoijcleaow() {
            zoijcleaow zoijcleaowVarPpxfxbqfkf = ppxfxbqfkf();
            return (zoijcleaowVarPpxfxbqfkf.zoijcleaow() == null || !this.f73010zoijcleaow.zoijcleaow().draadjrbmk()) ? zoijcleaowVarPpxfxbqfkf : new zoijcleaow(null, null);
        }
    }

    public zoijcleaow(zynmafqrjb zynmafqrjbVar, cdpycssgdh cdpycssgdhVar) {
        this.f72997iobyxmoadg = zynmafqrjbVar;
        this.f72998zoijcleaow = cdpycssgdhVar;
    }

    public final cdpycssgdh iobyxmoadg() {
        return this.f72998zoijcleaow;
    }

    public final zynmafqrjb zoijcleaow() {
        return this.f72997iobyxmoadg;
    }
}
