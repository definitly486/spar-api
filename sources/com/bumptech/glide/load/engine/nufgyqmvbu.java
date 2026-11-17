package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class nufgyqmvbu implements com.bumptech.glide.load.engine.gxszxtbevo.iobyxmoadg, Runnable, Comparable, h9.iobyxmoadg.gxszxtbevo {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private wflxmlrfwp f20926cdpycssgdh;

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private boolean f20927cllcsxoeiz;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final u1.eablkybsjg f20928cqumvgiudr;

    /* JADX INFO: renamed from: crxdokpmqz, reason: collision with root package name */
    private volatile boolean f20929crxdokpmqz;

    /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
    private Object f20930dsvhmnatus;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private EnumC0385nufgyqmvbu f20932hcddaimhww;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private long f20933hkdspvbjdz;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private int f20934iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private com.bumptech.glide.btonecajqb f20935istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final eablkybsjg f20936iwizpuwonk;

    /* JADX INFO: renamed from: jlmebxxoox, reason: collision with root package name */
    private boolean f20937jlmebxxoox;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private lqeggnwhkg f20938jpowsppfya;

    /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
    private l8.eablkybsjg f20940kegysxyocb;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private n8.iobyxmoadg f20942lmojexxdyd;

    /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
    private l8.iobyxmoadg f20943mbcevpiqjq;

    /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
    private com.bumptech.glide.load.data.wkgbmnqykc f20944ntlheqmsrt;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private int f20945pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private com.bumptech.glide.wkgbmnqykc f20946pmvmpeiblj;

    /* JADX INFO: renamed from: sopmlzcsov, reason: collision with root package name */
    private volatile boolean f20947sopmlzcsov;

    /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
    private l8.eablkybsjg f20948stevsuqkhv;

    /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
    private Object f20949tzroggbefp;

    /* JADX INFO: renamed from: ulzqkzuiru, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.gxszxtbevo f20950ulzqkzuiru;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private l8.lqeggnwhkg f20951wwaezpbzkn;

    /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
    private Thread f20952wypolnanlu;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private int f20953yadqdtsiqt;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private zoijcleaow f20955ylkuphrtab;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private l8.eablkybsjg f20957zynmafqrjb;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.lqeggnwhkg f20956zdlpuopuiu = new com.bumptech.glide.load.engine.lqeggnwhkg();

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f20954yggfygwlhe = new ArrayList();

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final h9.ppxfxbqfkf f20939jyumaefscl = h9.ppxfxbqfkf.iobyxmoadg();

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final wkgbmnqykc f20931esjtqupxsv = new wkgbmnqykc();

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final gxszxtbevo f20941lereixgezr = new gxszxtbevo();

    interface eablkybsjg {
        p8.iobyxmoadg iobyxmoadg();
    }

    private static class gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f20958iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private boolean f20959ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f20960zoijcleaow;

        gxszxtbevo() {
        }

        private boolean iobyxmoadg(boolean z13) {
            return (this.f20959ppxfxbqfkf || z13 || this.f20960zoijcleaow) && this.f20958iobyxmoadg;
        }

        synchronized void eablkybsjg() {
            this.f20960zoijcleaow = false;
            this.f20958iobyxmoadg = false;
            this.f20959ppxfxbqfkf = false;
        }

        synchronized boolean ppxfxbqfkf() {
            this.f20959ppxfxbqfkf = true;
            return iobyxmoadg(false);
        }

        synchronized boolean wkgbmnqykc(boolean z13) {
            this.f20958iobyxmoadg = true;
            return iobyxmoadg(z13);
        }

        synchronized boolean zoijcleaow() {
            this.f20960zoijcleaow = true;
            return iobyxmoadg(false);
        }
    }

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f20961iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        static final /* synthetic */ int[] f20962ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        static final /* synthetic */ int[] f20963zoijcleaow;

        static {
            int[] iArr = new int[l8.ppxfxbqfkf.values().length];
            f20962ppxfxbqfkf = iArr;
            try {
                iArr[l8.ppxfxbqfkf.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20962ppxfxbqfkf[l8.ppxfxbqfkf.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0385nufgyqmvbu.values().length];
            f20963zoijcleaow = iArr2;
            try {
                iArr2[EnumC0385nufgyqmvbu.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20963zoijcleaow[EnumC0385nufgyqmvbu.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20963zoijcleaow[EnumC0385nufgyqmvbu.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20963zoijcleaow[EnumC0385nufgyqmvbu.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20963zoijcleaow[EnumC0385nufgyqmvbu.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[lqeggnwhkg.values().length];
            f20961iobyxmoadg = iArr3;
            try {
                iArr3[lqeggnwhkg.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20961iobyxmoadg[lqeggnwhkg.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20961iobyxmoadg[lqeggnwhkg.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private enum lqeggnwhkg {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.nufgyqmvbu$nufgyqmvbu, reason: collision with other inner class name */
    private enum EnumC0385nufgyqmvbu {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    private final class ppxfxbqfkf implements dxjokdxxww.iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final l8.iobyxmoadg f20975iobyxmoadg;

        ppxfxbqfkf(l8.iobyxmoadg iobyxmoadgVar) {
            this.f20975iobyxmoadg = iobyxmoadgVar;
        }

        @Override // com.bumptech.glide.load.engine.dxjokdxxww.iobyxmoadg
        public n8.ppxfxbqfkf iobyxmoadg(n8.ppxfxbqfkf ppxfxbqfkfVar) {
            return nufgyqmvbu.this.iwizpuwonk(this.f20975iobyxmoadg, ppxfxbqfkfVar);
        }
    }

    private static class wkgbmnqykc {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private l8.eablkybsjg f20977iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private oxmwwwfdhm f20978ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private l8.btonecajqb f20979zoijcleaow;

        wkgbmnqykc() {
        }

        void iobyxmoadg() {
            this.f20977iobyxmoadg = null;
            this.f20979zoijcleaow = null;
            this.f20978ppxfxbqfkf = null;
        }

        boolean ppxfxbqfkf() {
            return this.f20978ppxfxbqfkf != null;
        }

        void wkgbmnqykc(l8.eablkybsjg eablkybsjgVar, l8.btonecajqb btonecajqbVar, oxmwwwfdhm oxmwwwfdhmVar) {
            this.f20977iobyxmoadg = eablkybsjgVar;
            this.f20979zoijcleaow = btonecajqbVar;
            this.f20978ppxfxbqfkf = oxmwwwfdhmVar;
        }

        void zoijcleaow(eablkybsjg eablkybsjgVar, l8.lqeggnwhkg lqeggnwhkgVar) {
            h9.zoijcleaow.iobyxmoadg("DecodeJob.encode");
            try {
                eablkybsjgVar.iobyxmoadg().zoijcleaow(this.f20977iobyxmoadg, new com.bumptech.glide.load.engine.eablkybsjg(this.f20979zoijcleaow, this.f20978ppxfxbqfkf, lqeggnwhkgVar));
            } finally {
                this.f20978ppxfxbqfkf.lqeggnwhkg();
                h9.zoijcleaow.eablkybsjg();
            }
        }
    }

    interface zoijcleaow {
        void iobyxmoadg(nufgyqmvbu nufgyqmvbuVar);

        void ppxfxbqfkf(GlideException glideException);

        void wkgbmnqykc(n8.ppxfxbqfkf ppxfxbqfkfVar, l8.iobyxmoadg iobyxmoadgVar, boolean z13);
    }

    nufgyqmvbu(eablkybsjg eablkybsjgVar, u1.eablkybsjg eablkybsjgVar2) {
        this.f20936iwizpuwonk = eablkybsjgVar;
        this.f20928cqumvgiudr = eablkybsjgVar2;
    }

    private com.bumptech.glide.load.engine.gxszxtbevo btonecajqb() {
        int i13 = iobyxmoadg.f20963zoijcleaow[this.f20932hcddaimhww.ordinal()];
        if (i13 == 1) {
            return new kcexrzcfyt(this.f20956zdlpuopuiu, this);
        }
        if (i13 == 2) {
            return new com.bumptech.glide.load.engine.ppxfxbqfkf(this.f20956zdlpuopuiu, this);
        }
        if (i13 == 3) {
            return new jyumaefscl(this.f20956zdlpuopuiu, this);
        }
        if (i13 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f20932hcddaimhww);
    }

    private void cdpycssgdh() {
        Throwable th2;
        this.f20939jyumaefscl.ppxfxbqfkf();
        if (!this.f20947sopmlzcsov) {
            this.f20947sopmlzcsov = true;
            return;
        }
        if (this.f20954yggfygwlhe.isEmpty()) {
            th2 = null;
        } else {
            List list = this.f20954yggfygwlhe;
            th2 = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th2);
    }

    private l8.lqeggnwhkg draadjrbmk(l8.iobyxmoadg iobyxmoadgVar) {
        l8.lqeggnwhkg lqeggnwhkgVar = this.f20951wwaezpbzkn;
        boolean z13 = iobyxmoadgVar == l8.iobyxmoadg.RESOURCE_DISK_CACHE || this.f20956zdlpuopuiu.cqumvgiudr();
        l8.gxszxtbevo gxszxtbevoVar = com.bumptech.glide.load.resource.bitmap.ojitshcjhn.f21106btonecajqb;
        Boolean bool = (Boolean) lqeggnwhkgVar.ppxfxbqfkf(gxszxtbevoVar);
        if (bool != null && (!bool.booleanValue() || z13)) {
            return lqeggnwhkgVar;
        }
        l8.lqeggnwhkg lqeggnwhkgVar2 = new l8.lqeggnwhkg();
        lqeggnwhkgVar2.wkgbmnqykc(this.f20951wwaezpbzkn);
        lqeggnwhkgVar2.gxszxtbevo(gxszxtbevoVar, Boolean.valueOf(z13));
        return lqeggnwhkgVar2;
    }

    private void dxjokdxxww() {
        n8.ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg;
        if (Log.isLoggable("DecodeJob", 2)) {
            rgvfuqvkyq("Retrieved data", this.f20933hkdspvbjdz, "data: " + this.f20949tzroggbefp + ", cache key: " + this.f20948stevsuqkhv + ", fetcher: " + this.f20944ntlheqmsrt);
        }
        try {
            ppxfxbqfkfVarLqeggnwhkg = lqeggnwhkg(this.f20944ntlheqmsrt, this.f20949tzroggbefp, this.f20943mbcevpiqjq);
        } catch (GlideException e13) {
            e13.ojitshcjhn(this.f20940kegysxyocb, this.f20943mbcevpiqjq);
            this.f20954yggfygwlhe.add(e13);
            ppxfxbqfkfVarLqeggnwhkg = null;
        }
        if (ppxfxbqfkfVarLqeggnwhkg != null) {
            oxmwwwfdhm(ppxfxbqfkfVarLqeggnwhkg, this.f20943mbcevpiqjq, this.f20937jlmebxxoox);
        } else {
            pmvmpeiblj();
        }
    }

    private void esjtqupxsv() {
        this.f20941lereixgezr.eablkybsjg();
        this.f20931esjtqupxsv.iobyxmoadg();
        this.f20956zdlpuopuiu.iobyxmoadg();
        this.f20947sopmlzcsov = false;
        this.f20946pmvmpeiblj = null;
        this.f20957zynmafqrjb = null;
        this.f20951wwaezpbzkn = null;
        this.f20935istkbnxepw = null;
        this.f20926cdpycssgdh = null;
        this.f20955ylkuphrtab = null;
        this.f20932hcddaimhww = null;
        this.f20950ulzqkzuiru = null;
        this.f20952wypolnanlu = null;
        this.f20948stevsuqkhv = null;
        this.f20949tzroggbefp = null;
        this.f20943mbcevpiqjq = null;
        this.f20944ntlheqmsrt = null;
        this.f20933hkdspvbjdz = 0L;
        this.f20929crxdokpmqz = false;
        this.f20930dsvhmnatus = null;
        this.f20954yggfygwlhe.clear();
        this.f20928cqumvgiudr.iobyxmoadg(this);
    }

    private EnumC0385nufgyqmvbu gtknphoqwx(EnumC0385nufgyqmvbu enumC0385nufgyqmvbu) {
        int i13 = iobyxmoadg.f20963zoijcleaow[enumC0385nufgyqmvbu.ordinal()];
        if (i13 == 1) {
            return this.f20942lmojexxdyd.iobyxmoadg() ? EnumC0385nufgyqmvbu.DATA_CACHE : gtknphoqwx(EnumC0385nufgyqmvbu.DATA_CACHE);
        }
        if (i13 == 2) {
            return this.f20927cllcsxoeiz ? EnumC0385nufgyqmvbu.FINISHED : EnumC0385nufgyqmvbu.SOURCE;
        }
        if (i13 == 3 || i13 == 4) {
            return EnumC0385nufgyqmvbu.FINISHED;
        }
        if (i13 == 5) {
            return this.f20942lmojexxdyd.zoijcleaow() ? EnumC0385nufgyqmvbu.RESOURCE_CACHE : gtknphoqwx(EnumC0385nufgyqmvbu.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0385nufgyqmvbu);
    }

    private void istkbnxepw() {
        int i13 = iobyxmoadg.f20961iobyxmoadg[this.f20938jpowsppfya.ordinal()];
        if (i13 == 1) {
            this.f20932hcddaimhww = gtknphoqwx(EnumC0385nufgyqmvbu.INITIALIZE);
            this.f20950ulzqkzuiru = btonecajqb();
            pmvmpeiblj();
        } else if (i13 == 2) {
            pmvmpeiblj();
        } else {
            if (i13 == 3) {
                dxjokdxxww();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f20938jpowsppfya);
        }
    }

    private void jyumaefscl() {
        if (this.f20941lereixgezr.ppxfxbqfkf()) {
            esjtqupxsv();
        }
    }

    private void kcexrzcfyt() {
        cdpycssgdh();
        this.f20955ylkuphrtab.ppxfxbqfkf(new GlideException("Failed to load resource", new ArrayList(this.f20954yggfygwlhe)));
        jyumaefscl();
    }

    private void lereixgezr(lqeggnwhkg lqeggnwhkgVar) {
        this.f20938jpowsppfya = lqeggnwhkgVar;
        this.f20955ylkuphrtab.iobyxmoadg(this);
    }

    private n8.ppxfxbqfkf lqeggnwhkg(com.bumptech.glide.load.data.wkgbmnqykc wkgbmnqykcVar, Object obj, l8.iobyxmoadg iobyxmoadgVar) {
        if (obj == null) {
            wkgbmnqykcVar.zoijcleaow();
            return null;
        }
        try {
            long jZoijcleaow = g9.lqeggnwhkg.zoijcleaow();
            n8.ppxfxbqfkf ppxfxbqfkfVarNufgyqmvbu = nufgyqmvbu(obj, iobyxmoadgVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                ojitshcjhn("Decoded result " + ppxfxbqfkfVarNufgyqmvbu, jZoijcleaow);
            }
            return ppxfxbqfkfVarNufgyqmvbu;
        } finally {
            wkgbmnqykcVar.zoijcleaow();
        }
    }

    private n8.ppxfxbqfkf nufgyqmvbu(Object obj, l8.iobyxmoadg iobyxmoadgVar) {
        return zynmafqrjb(obj, iobyxmoadgVar, this.f20956zdlpuopuiu.nufgyqmvbu(obj.getClass()));
    }

    private void ojitshcjhn(String str, long j13) {
        rgvfuqvkyq(str, j13, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void oxmwwwfdhm(n8.ppxfxbqfkf ppxfxbqfkfVar, l8.iobyxmoadg iobyxmoadgVar, boolean z13) {
        oxmwwwfdhm oxmwwwfdhmVar;
        h9.zoijcleaow.iobyxmoadg("DecodeJob.notifyEncodeAndRelease");
        try {
            if (ppxfxbqfkfVar instanceof n8.zoijcleaow) {
                ((n8.zoijcleaow) ppxfxbqfkfVar).iobyxmoadg();
            }
            if (this.f20931esjtqupxsv.ppxfxbqfkf()) {
                ppxfxbqfkfVar = oxmwwwfdhm.wkgbmnqykc(ppxfxbqfkfVar);
                oxmwwwfdhmVar = ppxfxbqfkfVar;
            } else {
                oxmwwwfdhmVar = 0;
            }
            vdvldrhtss(ppxfxbqfkfVar, iobyxmoadgVar, z13);
            this.f20932hcddaimhww = EnumC0385nufgyqmvbu.ENCODE;
            try {
                if (this.f20931esjtqupxsv.ppxfxbqfkf()) {
                    this.f20931esjtqupxsv.zoijcleaow(this.f20936iwizpuwonk, this.f20951wwaezpbzkn);
                }
                if (oxmwwwfdhmVar != 0) {
                    oxmwwwfdhmVar.lqeggnwhkg();
                }
                zdlpuopuiu();
                h9.zoijcleaow.eablkybsjg();
            } catch (Throwable th2) {
                if (oxmwwwfdhmVar != 0) {
                    oxmwwwfdhmVar.lqeggnwhkg();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            h9.zoijcleaow.eablkybsjg();
            throw th3;
        }
    }

    private void pmvmpeiblj() {
        this.f20952wypolnanlu = Thread.currentThread();
        this.f20933hkdspvbjdz = g9.lqeggnwhkg.zoijcleaow();
        boolean zZoijcleaow = false;
        while (!this.f20929crxdokpmqz && this.f20950ulzqkzuiru != null && !(zZoijcleaow = this.f20950ulzqkzuiru.zoijcleaow())) {
            this.f20932hcddaimhww = gtknphoqwx(this.f20932hcddaimhww);
            this.f20950ulzqkzuiru = btonecajqb();
            if (this.f20932hcddaimhww == EnumC0385nufgyqmvbu.SOURCE) {
                lereixgezr(lqeggnwhkg.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f20932hcddaimhww == EnumC0385nufgyqmvbu.FINISHED || this.f20929crxdokpmqz) && !zZoijcleaow) {
            kcexrzcfyt();
        }
    }

    private void rgvfuqvkyq(String str, long j13, String str2) {
        String str3;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(" in ");
        sb3.append(g9.lqeggnwhkg.iobyxmoadg(j13));
        sb3.append(", load key: ");
        sb3.append(this.f20926cdpycssgdh);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb3.append(str3);
        sb3.append(", thread: ");
        sb3.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb3.toString());
    }

    private void vdvldrhtss(n8.ppxfxbqfkf ppxfxbqfkfVar, l8.iobyxmoadg iobyxmoadgVar, boolean z13) {
        cdpycssgdh();
        this.f20955ylkuphrtab.wkgbmnqykc(ppxfxbqfkfVar, iobyxmoadgVar, z13);
    }

    private int wflxmlrfwp() {
        return this.f20935istkbnxepw.ordinal();
    }

    private void zdlpuopuiu() {
        if (this.f20941lereixgezr.zoijcleaow()) {
            esjtqupxsv();
        }
    }

    private n8.ppxfxbqfkf zynmafqrjb(Object obj, l8.iobyxmoadg iobyxmoadgVar, vdvldrhtss vdvldrhtssVar) {
        l8.lqeggnwhkg lqeggnwhkgVarDraadjrbmk = draadjrbmk(iobyxmoadgVar);
        com.bumptech.glide.load.data.eablkybsjg eablkybsjgVarDraadjrbmk = this.f20946pmvmpeiblj.dxjokdxxww().draadjrbmk(obj);
        try {
            return vdvldrhtssVar.iobyxmoadg(eablkybsjgVarDraadjrbmk, lqeggnwhkgVarDraadjrbmk, this.f20953yadqdtsiqt, this.f20934iozdgvuglv, new ppxfxbqfkf(iobyxmoadgVar));
        } finally {
            eablkybsjgVarDraadjrbmk.zoijcleaow();
        }
    }

    nufgyqmvbu agtfadlqog(com.bumptech.glide.wkgbmnqykc wkgbmnqykcVar, Object obj, wflxmlrfwp wflxmlrfwpVar, l8.eablkybsjg eablkybsjgVar, int i13, int i14, Class cls, Class cls2, com.bumptech.glide.btonecajqb btonecajqbVar, n8.iobyxmoadg iobyxmoadgVar, Map map, boolean z13, boolean z14, boolean z15, l8.lqeggnwhkg lqeggnwhkgVar, zoijcleaow zoijcleaowVar, int i15) {
        this.f20956zdlpuopuiu.jyumaefscl(wkgbmnqykcVar, obj, eablkybsjgVar, i13, i14, iobyxmoadgVar, cls, cls2, btonecajqbVar, lqeggnwhkgVar, map, z13, z14, this.f20936iwizpuwonk);
        this.f20946pmvmpeiblj = wkgbmnqykcVar;
        this.f20957zynmafqrjb = eablkybsjgVar;
        this.f20935istkbnxepw = btonecajqbVar;
        this.f20926cdpycssgdh = wflxmlrfwpVar;
        this.f20953yadqdtsiqt = i13;
        this.f20934iozdgvuglv = i14;
        this.f20942lmojexxdyd = iobyxmoadgVar;
        this.f20927cllcsxoeiz = z15;
        this.f20951wwaezpbzkn = lqeggnwhkgVar;
        this.f20955ylkuphrtab = zoijcleaowVar;
        this.f20945pkzmftpjix = i15;
        this.f20938jpowsppfya = lqeggnwhkg.INITIALIZE;
        this.f20930dsvhmnatus = obj;
        return this;
    }

    void cqumvgiudr(boolean z13) {
        if (this.f20941lereixgezr.wkgbmnqykc(z13)) {
            esjtqupxsv();
        }
    }

    @Override // h9.iobyxmoadg.gxszxtbevo
    public h9.ppxfxbqfkf eablkybsjg() {
        return this.f20939jyumaefscl;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
    public int compareTo(nufgyqmvbu nufgyqmvbuVar) {
        int iWflxmlrfwp = wflxmlrfwp() - nufgyqmvbuVar.wflxmlrfwp();
        return iWflxmlrfwp == 0 ? this.f20945pkzmftpjix - nufgyqmvbuVar.f20945pkzmftpjix : iWflxmlrfwp;
    }

    @Override // com.bumptech.glide.load.engine.gxszxtbevo.iobyxmoadg
    public void iobyxmoadg(l8.eablkybsjg eablkybsjgVar, Exception exc, com.bumptech.glide.load.data.wkgbmnqykc wkgbmnqykcVar, l8.iobyxmoadg iobyxmoadgVar) {
        wkgbmnqykcVar.zoijcleaow();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.rgvfuqvkyq(eablkybsjgVar, iobyxmoadgVar, wkgbmnqykcVar.iobyxmoadg());
        this.f20954yggfygwlhe.add(glideException);
        if (Thread.currentThread() != this.f20952wypolnanlu) {
            lereixgezr(lqeggnwhkg.SWITCH_TO_SOURCE_SERVICE);
        } else {
            pmvmpeiblj();
        }
    }

    n8.ppxfxbqfkf iwizpuwonk(l8.iobyxmoadg iobyxmoadgVar, n8.ppxfxbqfkf ppxfxbqfkfVar) {
        n8.ppxfxbqfkf ppxfxbqfkfVarIobyxmoadg;
        l8.gtknphoqwx gtknphoqwxVar;
        l8.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow;
        l8.eablkybsjg wkgbmnqykcVar;
        Class<?> cls = ppxfxbqfkfVar.get().getClass();
        l8.btonecajqb btonecajqbVarAgtfadlqog = null;
        if (iobyxmoadgVar != l8.iobyxmoadg.RESOURCE_DISK_CACHE) {
            l8.gtknphoqwx gtknphoqwxVarKcexrzcfyt = this.f20956zdlpuopuiu.kcexrzcfyt(cls);
            gtknphoqwxVar = gtknphoqwxVarKcexrzcfyt;
            ppxfxbqfkfVarIobyxmoadg = gtknphoqwxVarKcexrzcfyt.iobyxmoadg(this.f20946pmvmpeiblj, ppxfxbqfkfVar, this.f20953yadqdtsiqt, this.f20934iozdgvuglv);
        } else {
            ppxfxbqfkfVarIobyxmoadg = ppxfxbqfkfVar;
            gtknphoqwxVar = null;
        }
        if (!ppxfxbqfkfVar.equals(ppxfxbqfkfVarIobyxmoadg)) {
            ppxfxbqfkfVar.zoijcleaow();
        }
        if (this.f20956zdlpuopuiu.iwizpuwonk(ppxfxbqfkfVarIobyxmoadg)) {
            btonecajqbVarAgtfadlqog = this.f20956zdlpuopuiu.agtfadlqog(ppxfxbqfkfVarIobyxmoadg);
            ppxfxbqfkfVarZoijcleaow = btonecajqbVarAgtfadlqog.zoijcleaow(this.f20951wwaezpbzkn);
        } else {
            ppxfxbqfkfVarZoijcleaow = l8.ppxfxbqfkf.NONE;
        }
        l8.btonecajqb btonecajqbVar = btonecajqbVarAgtfadlqog;
        if (!this.f20942lmojexxdyd.wkgbmnqykc(!this.f20956zdlpuopuiu.esjtqupxsv(this.f20948stevsuqkhv), iobyxmoadgVar, ppxfxbqfkfVarZoijcleaow)) {
            return ppxfxbqfkfVarIobyxmoadg;
        }
        if (btonecajqbVar == null) {
            throw new Registry.NoResultEncoderAvailableException(ppxfxbqfkfVarIobyxmoadg.get().getClass());
        }
        int i13 = iobyxmoadg.f20962ppxfxbqfkf[ppxfxbqfkfVarZoijcleaow.ordinal()];
        if (i13 == 1) {
            wkgbmnqykcVar = new com.bumptech.glide.load.engine.wkgbmnqykc(this.f20948stevsuqkhv, this.f20957zynmafqrjb);
        } else {
            if (i13 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + ppxfxbqfkfVarZoijcleaow);
            }
            wkgbmnqykcVar = new zdlpuopuiu(this.f20956zdlpuopuiu.zoijcleaow(), this.f20948stevsuqkhv, this.f20957zynmafqrjb, this.f20953yadqdtsiqt, this.f20934iozdgvuglv, gtknphoqwxVar, cls, this.f20951wwaezpbzkn);
        }
        oxmwwwfdhm oxmwwwfdhmVarWkgbmnqykc = oxmwwwfdhm.wkgbmnqykc(ppxfxbqfkfVarIobyxmoadg);
        this.f20931esjtqupxsv.wkgbmnqykc(wkgbmnqykcVar, btonecajqbVar, oxmwwwfdhmVarWkgbmnqykc);
        return oxmwwwfdhmVarWkgbmnqykc;
    }

    @Override // com.bumptech.glide.load.engine.gxszxtbevo.iobyxmoadg
    public void ppxfxbqfkf() {
        lereixgezr(lqeggnwhkg.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // java.lang.Runnable
    public void run() {
        h9.zoijcleaow.ppxfxbqfkf("DecodeJob#run(reason=%s, model=%s)", this.f20938jpowsppfya, this.f20930dsvhmnatus);
        com.bumptech.glide.load.data.wkgbmnqykc wkgbmnqykcVar = this.f20944ntlheqmsrt;
        try {
            try {
                try {
                    if (this.f20929crxdokpmqz) {
                        kcexrzcfyt();
                        if (wkgbmnqykcVar != null) {
                            wkgbmnqykcVar.zoijcleaow();
                        }
                        h9.zoijcleaow.eablkybsjg();
                        return;
                    }
                    istkbnxepw();
                    if (wkgbmnqykcVar != null) {
                        wkgbmnqykcVar.zoijcleaow();
                    }
                    h9.zoijcleaow.eablkybsjg();
                } catch (Throwable th2) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f20929crxdokpmqz + ", stage: " + this.f20932hcddaimhww, th2);
                    }
                    if (this.f20932hcddaimhww != EnumC0385nufgyqmvbu.ENCODE) {
                        this.f20954yggfygwlhe.add(th2);
                        kcexrzcfyt();
                    }
                    if (!this.f20929crxdokpmqz) {
                        throw th2;
                    }
                    throw th2;
                }
            } catch (com.bumptech.glide.load.engine.zoijcleaow e13) {
                throw e13;
            }
        } catch (Throwable th3) {
            if (wkgbmnqykcVar != null) {
                wkgbmnqykcVar.zoijcleaow();
            }
            h9.zoijcleaow.eablkybsjg();
            throw th3;
        }
    }

    @Override // com.bumptech.glide.load.engine.gxszxtbevo.iobyxmoadg
    public void wkgbmnqykc(l8.eablkybsjg eablkybsjgVar, Object obj, com.bumptech.glide.load.data.wkgbmnqykc wkgbmnqykcVar, l8.iobyxmoadg iobyxmoadgVar, l8.eablkybsjg eablkybsjgVar2) {
        this.f20948stevsuqkhv = eablkybsjgVar;
        this.f20949tzroggbefp = obj;
        this.f20944ntlheqmsrt = wkgbmnqykcVar;
        this.f20943mbcevpiqjq = iobyxmoadgVar;
        this.f20940kegysxyocb = eablkybsjgVar2;
        this.f20937jlmebxxoox = eablkybsjgVar != this.f20956zdlpuopuiu.ppxfxbqfkf().get(0);
        if (Thread.currentThread() != this.f20952wypolnanlu) {
            lereixgezr(lqeggnwhkg.DECODE_DATA);
            return;
        }
        h9.zoijcleaow.iobyxmoadg("DecodeJob.decodeFromRetrievedData");
        try {
            dxjokdxxww();
        } finally {
            h9.zoijcleaow.eablkybsjg();
        }
    }

    boolean yadqdtsiqt() {
        EnumC0385nufgyqmvbu enumC0385nufgyqmvbuGtknphoqwx = gtknphoqwx(EnumC0385nufgyqmvbu.INITIALIZE);
        return enumC0385nufgyqmvbuGtknphoqwx == EnumC0385nufgyqmvbu.RESOURCE_CACHE || enumC0385nufgyqmvbuGtknphoqwx == EnumC0385nufgyqmvbu.DATA_CACHE;
    }

    public void zoijcleaow() {
        this.f20929crxdokpmqz = true;
        com.bumptech.glide.load.engine.gxszxtbevo gxszxtbevoVar = this.f20950ulzqkzuiru;
        if (gxszxtbevoVar != null) {
            gxszxtbevoVar.cancel();
        }
    }
}
