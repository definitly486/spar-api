package lk;

import java.io.Closeable;
import java.io.EOFException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cdpycssgdh implements Closeable {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private final long f62854cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final zdlpuopuiu f62855cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final yggfygwlhe f62856esjtqupxsv;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private final qk.ppxfxbqfkf f62857iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private final cdpycssgdh f62858istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f62859iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final String f62860jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final yadqdtsiqt f62861lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private tg.iobyxmoadg f62862lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private final boolean f62863pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final cdpycssgdh f62864pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private wkgbmnqykc f62865wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private final long f62866yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final pmvmpeiblj f62867yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final boolean f62868ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final zynmafqrjb f62869zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final cdpycssgdh f62870zynmafqrjb;

    public cdpycssgdh(zynmafqrjb request, pmvmpeiblj protocol, String message, int i13, zdlpuopuiu zdlpuopuiuVar, yggfygwlhe headers, yadqdtsiqt body, cdpycssgdh cdpycssgdhVar, cdpycssgdh cdpycssgdhVar2, cdpycssgdh cdpycssgdhVar3, long j13, long j14, qk.ppxfxbqfkf ppxfxbqfkfVar, tg.iobyxmoadg trailersFn) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(protocol, "protocol");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(headers, "headers");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(body, "body");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(trailersFn, "trailersFn");
        this.f62869zdlpuopuiu = request;
        this.f62867yggfygwlhe = protocol;
        this.f62860jyumaefscl = message;
        this.f62859iwizpuwonk = i13;
        this.f62855cqumvgiudr = zdlpuopuiuVar;
        this.f62856esjtqupxsv = headers;
        this.f62861lereixgezr = body;
        this.f62864pmvmpeiblj = cdpycssgdhVar;
        this.f62870zynmafqrjb = cdpycssgdhVar2;
        this.f62858istkbnxepw = cdpycssgdhVar3;
        this.f62854cdpycssgdh = j13;
        this.f62866yadqdtsiqt = j14;
        this.f62857iozdgvuglv = ppxfxbqfkfVar;
        this.f62862lmojexxdyd = trailersFn;
        this.f62868ylkuphrtab = mk.draadjrbmk.zdlpuopuiu(this);
        this.f62863pkzmftpjix = mk.draadjrbmk.kcexrzcfyt(this);
    }

    public static /* synthetic */ String vdvldrhtss(cdpycssgdh cdpycssgdhVar, String str, String str2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        return cdpycssgdhVar.rgvfuqvkyq(str, str2);
    }

    public final wkgbmnqykc agtfadlqog() {
        return this.f62865wwaezpbzkn;
    }

    public final int btonecajqb() {
        return this.f62859iwizpuwonk;
    }

    public final zynmafqrjb cdpycssgdh() {
        return this.f62869zdlpuopuiu;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mk.draadjrbmk.eablkybsjg(this);
    }

    public final iobyxmoadg cqumvgiudr() {
        return mk.draadjrbmk.draadjrbmk(this);
    }

    public final qk.ppxfxbqfkf draadjrbmk() {
        return this.f62857iozdgvuglv;
    }

    public final List dxjokdxxww() {
        String str;
        yggfygwlhe yggfygwlheVar = this.f62856esjtqupxsv;
        int i13 = this.f62859iwizpuwonk;
        if (i13 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i13 != 407) {
                return hg.jyumaefscl.wflxmlrfwp();
            }
            str = "Proxy-Authenticate";
        }
        return rk.eablkybsjg.iobyxmoadg(yggfygwlheVar, str);
    }

    public final void hkdspvbjdz(wkgbmnqykc wkgbmnqykcVar) {
        this.f62865wwaezpbzkn = wkgbmnqykcVar;
    }

    public final long istkbnxepw() {
        return this.f62866yadqdtsiqt;
    }

    public final boolean iwxlajgraz() {
        return this.f62868ylkuphrtab;
    }

    public final cdpycssgdh jyumaefscl() {
        return this.f62864pmvmpeiblj;
    }

    public final yggfygwlhe kcexrzcfyt() {
        return this.f62856esjtqupxsv;
    }

    public final yadqdtsiqt lereixgezr(long j13) throws EOFException {
        bl.eablkybsjg eablkybsjgVarPeek = this.f62861lereixgezr.draadjrbmk().peek();
        bl.ppxfxbqfkf ppxfxbqfkfVar = new bl.ppxfxbqfkf();
        eablkybsjgVarPeek.lrnfpwlwnk(j13);
        ppxfxbqfkfVar.crxdokpmqz(eablkybsjgVarPeek, Math.min(j13, eablkybsjgVarPeek.zoijcleaow().dsvhmnatus()));
        return yadqdtsiqt.f63238yggfygwlhe.iobyxmoadg(ppxfxbqfkfVar, this.f62861lereixgezr.dxjokdxxww(), ppxfxbqfkfVar.dsvhmnatus());
    }

    public final wkgbmnqykc lqeggnwhkg() {
        return mk.draadjrbmk.oxmwwwfdhm(this);
    }

    public final cdpycssgdh nufgyqmvbu() {
        return this.f62870zynmafqrjb;
    }

    public final zdlpuopuiu ojitshcjhn() {
        return this.f62855cqumvgiudr;
    }

    public final cdpycssgdh pmvmpeiblj() {
        return this.f62858istkbnxepw;
    }

    public final String rgvfuqvkyq(String name, String str) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
        return mk.draadjrbmk.lqeggnwhkg(this, name, str);
    }

    public String toString() {
        return mk.draadjrbmk.rgvfuqvkyq(this);
    }

    public final yadqdtsiqt wkgbmnqykc() {
        return this.f62861lereixgezr;
    }

    public final long wwaezpbzkn() {
        return this.f62854cdpycssgdh;
    }

    public final String zdlpuopuiu() {
        return this.f62860jyumaefscl;
    }

    public final pmvmpeiblj zynmafqrjb() {
        return this.f62867yggfygwlhe;
    }

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        private tg.iobyxmoadg f62871agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        private cdpycssgdh f62872btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private long f62873draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private cdpycssgdh f62874dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private zdlpuopuiu f62875eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        private long f62876gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private yggfygwlhe.iobyxmoadg f62877gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private zynmafqrjb f62878iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private yadqdtsiqt f62879lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private cdpycssgdh f62880nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f62881ppxfxbqfkf;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        private qk.ppxfxbqfkf f62882wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private String f62883wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private pmvmpeiblj f62884zoijcleaow;

        /* JADX INFO: renamed from: lk.cdpycssgdh$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1281iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ qk.ppxfxbqfkf f62885zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1281iobyxmoadg(qk.ppxfxbqfkf ppxfxbqfkfVar) {
                super(0);
                this.f62885zdlpuopuiu = ppxfxbqfkfVar;
            }

            @Override // tg.iobyxmoadg
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final yggfygwlhe invoke() {
                return this.f62885zdlpuopuiu.yggfygwlhe();
            }
        }

        static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final zoijcleaow f62886zdlpuopuiu = new zoijcleaow();

            zoijcleaow() {
                super(0);
            }

            @Override // tg.iobyxmoadg
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final yggfygwlhe invoke() {
                return yggfygwlhe.f63244yggfygwlhe.iobyxmoadg(new String[0]);
            }
        }

        public iobyxmoadg() {
            this.f62881ppxfxbqfkf = -1;
            this.f62879lqeggnwhkg = mk.wflxmlrfwp.wflxmlrfwp();
            this.f62871agtfadlqog = zoijcleaow.f62886zdlpuopuiu;
            this.f62877gxszxtbevo = new yggfygwlhe.iobyxmoadg();
        }

        public iobyxmoadg agtfadlqog(cdpycssgdh cdpycssgdhVar) {
            return mk.draadjrbmk.wflxmlrfwp(this, cdpycssgdhVar);
        }

        public iobyxmoadg btonecajqb(yggfygwlhe headers) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(headers, "headers");
            return mk.draadjrbmk.dxjokdxxww(this, headers);
        }

        public final void cqumvgiudr(cdpycssgdh cdpycssgdhVar) {
            this.f62880nufgyqmvbu = cdpycssgdhVar;
        }

        public iobyxmoadg draadjrbmk(String message) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
            return mk.draadjrbmk.btonecajqb(this, message);
        }

        public iobyxmoadg dxjokdxxww(String name, String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return mk.draadjrbmk.nufgyqmvbu(this, name, value);
        }

        public iobyxmoadg eablkybsjg(int i13) {
            return mk.draadjrbmk.gxszxtbevo(this, i13);
        }

        public final void esjtqupxsv(cdpycssgdh cdpycssgdhVar) {
            this.f62872btonecajqb = cdpycssgdhVar;
        }

        public final void gtknphoqwx(qk.ppxfxbqfkf exchange) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(exchange, "exchange");
            this.f62882wflxmlrfwp = exchange;
            this.f62871agtfadlqog = new C1281iobyxmoadg(exchange);
        }

        public final int gxszxtbevo() {
            return this.f62881ppxfxbqfkf;
        }

        public iobyxmoadg iobyxmoadg(String name, String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(name, "name");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            return mk.draadjrbmk.zoijcleaow(this, name, value);
        }

        public iobyxmoadg istkbnxepw(tg.iobyxmoadg trailersFn) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(trailersFn, "trailersFn");
            return mk.draadjrbmk.vdvldrhtss(this, trailersFn);
        }

        public final void iwizpuwonk(String str) {
            this.f62883wkgbmnqykc = str;
        }

        public final void jyumaefscl(yggfygwlhe.iobyxmoadg iobyxmoadgVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<set-?>");
            this.f62877gxszxtbevo = iobyxmoadgVar;
        }

        public final void kcexrzcfyt(yadqdtsiqt yadqdtsiqtVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(yadqdtsiqtVar, "<set-?>");
            this.f62879lqeggnwhkg = yadqdtsiqtVar;
        }

        public final void lereixgezr(pmvmpeiblj pmvmpeibljVar) {
            this.f62884zoijcleaow = pmvmpeibljVar;
        }

        public final yggfygwlhe.iobyxmoadg lqeggnwhkg() {
            return this.f62877gxszxtbevo;
        }

        public iobyxmoadg nufgyqmvbu(zdlpuopuiu zdlpuopuiuVar) {
            this.f62875eablkybsjg = zdlpuopuiuVar;
            return this;
        }

        public iobyxmoadg ojitshcjhn(pmvmpeiblj protocol) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(protocol, "protocol");
            return mk.draadjrbmk.agtfadlqog(this, protocol);
        }

        public iobyxmoadg oxmwwwfdhm(long j13) {
            this.f62876gtknphoqwx = j13;
            return this;
        }

        public final void pmvmpeiblj(zynmafqrjb zynmafqrjbVar) {
            this.f62878iobyxmoadg = zynmafqrjbVar;
        }

        public cdpycssgdh ppxfxbqfkf() {
            int i13 = this.f62881ppxfxbqfkf;
            if (i13 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f62881ppxfxbqfkf).toString());
            }
            zynmafqrjb zynmafqrjbVar = this.f62878iobyxmoadg;
            if (zynmafqrjbVar == null) {
                throw new IllegalStateException("request == null");
            }
            pmvmpeiblj pmvmpeibljVar = this.f62884zoijcleaow;
            if (pmvmpeibljVar == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f62883wkgbmnqykc;
            if (str != null) {
                return new cdpycssgdh(zynmafqrjbVar, pmvmpeibljVar, str, i13, this.f62875eablkybsjg, this.f62877gxszxtbevo.gxszxtbevo(), this.f62879lqeggnwhkg, this.f62880nufgyqmvbu, this.f62874dxjokdxxww, this.f62872btonecajqb, this.f62876gtknphoqwx, this.f62873draadjrbmk, this.f62882wflxmlrfwp, this.f62871agtfadlqog);
            }
            throw new IllegalStateException("message == null");
        }

        public iobyxmoadg rgvfuqvkyq(long j13) {
            this.f62873draadjrbmk = j13;
            return this;
        }

        public iobyxmoadg vdvldrhtss(zynmafqrjb request) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
            return mk.draadjrbmk.ojitshcjhn(this, request);
        }

        public iobyxmoadg wflxmlrfwp(cdpycssgdh cdpycssgdhVar) {
            return mk.draadjrbmk.gtknphoqwx(this, cdpycssgdhVar);
        }

        public iobyxmoadg wkgbmnqykc(cdpycssgdh cdpycssgdhVar) {
            return mk.draadjrbmk.wkgbmnqykc(this, cdpycssgdhVar);
        }

        public final void yggfygwlhe(int i13) {
            this.f62881ppxfxbqfkf = i13;
        }

        public final void zdlpuopuiu(cdpycssgdh cdpycssgdhVar) {
            this.f62874dxjokdxxww = cdpycssgdhVar;
        }

        public iobyxmoadg zoijcleaow(yadqdtsiqt body) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(body, "body");
            return mk.draadjrbmk.ppxfxbqfkf(this, body);
        }

        public final void zynmafqrjb(tg.iobyxmoadg iobyxmoadgVar) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<set-?>");
            this.f62871agtfadlqog = iobyxmoadgVar;
        }

        public iobyxmoadg(cdpycssgdh response) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(response, "response");
            this.f62881ppxfxbqfkf = -1;
            this.f62879lqeggnwhkg = mk.wflxmlrfwp.wflxmlrfwp();
            this.f62871agtfadlqog = zoijcleaow.f62886zdlpuopuiu;
            this.f62878iobyxmoadg = response.cdpycssgdh();
            this.f62884zoijcleaow = response.zynmafqrjb();
            this.f62881ppxfxbqfkf = response.btonecajqb();
            this.f62883wkgbmnqykc = response.zdlpuopuiu();
            this.f62875eablkybsjg = response.ojitshcjhn();
            this.f62877gxszxtbevo = response.kcexrzcfyt().eablkybsjg();
            this.f62879lqeggnwhkg = response.wkgbmnqykc();
            this.f62880nufgyqmvbu = response.jyumaefscl();
            this.f62874dxjokdxxww = response.nufgyqmvbu();
            this.f62872btonecajqb = response.pmvmpeiblj();
            this.f62876gtknphoqwx = response.wwaezpbzkn();
            this.f62873draadjrbmk = response.istkbnxepw();
            this.f62882wflxmlrfwp = response.draadjrbmk();
            this.f62871agtfadlqog = response.f62862lmojexxdyd;
        }
    }
}
