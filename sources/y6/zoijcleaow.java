package y6;

import bl.btonecajqb;
import bl.dxjokdxxww;
import bl.esjtqupxsv;
import bl.iozdgvuglv;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.jyumaefscl;
import mj.kcexrzcfyt;
import mj.rgvfuqvkyq;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.krqnebusok;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes2.dex */
public final class zoijcleaow implements Closeable, Flushable {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private int f123963cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final esjtqupxsv f123964cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final esjtqupxsv f123965esjtqupxsv;

    /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
    private final eablkybsjg f123966hcddaimhww;

    /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
    private boolean f123967iozdgvuglv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private long f123968istkbnxepw;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f123969iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f123970jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final esjtqupxsv f123971lereixgezr;

    /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
    private boolean f123972lmojexxdyd;

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private boolean f123973pkzmftpjix;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private final LinkedHashMap f123974pmvmpeiblj;

    /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
    private boolean f123975wwaezpbzkn;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private bl.wkgbmnqykc f123976yadqdtsiqt;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final long f123977yggfygwlhe;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private boolean f123978ylkuphrtab;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final esjtqupxsv f123979zdlpuopuiu;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private final cllcsxoeiz f123980zynmafqrjb;

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    public static final iobyxmoadg f123962jpowsppfya = new iobyxmoadg(null);

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    private static final rgvfuqvkyq f123961hkdspvbjdz = new rgvfuqvkyq("[a-z0-9_-]{1,120}");

    public static final class eablkybsjg extends btonecajqb {
        eablkybsjg(dxjokdxxww dxjokdxxwwVar) {
            super(dxjokdxxwwVar);
        }

        @Override // bl.btonecajqb, bl.dxjokdxxww
        public iozdgvuglv rgvfuqvkyq(esjtqupxsv esjtqupxsvVar, boolean z13) {
            esjtqupxsv esjtqupxsvVarNufgyqmvbu = esjtqupxsvVar.nufgyqmvbu();
            if (esjtqupxsvVarNufgyqmvbu != null) {
                wkgbmnqykc(esjtqupxsvVarNufgyqmvbu);
            }
            return super.rgvfuqvkyq(esjtqupxsvVar, z13);
        }
    }

    static final class gxszxtbevo extends draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f123982zdlpuopuiu;

        gxszxtbevo(lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return zoijcleaow.this.new gxszxtbevo(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            mg.zoijcleaow.gxszxtbevo();
            if (this.f123982zdlpuopuiu != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zdlpuopuiu.zoijcleaow(obj);
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            synchronized (zoijcleaowVar) {
                if (!zoijcleaowVar.f123972lmojexxdyd || zoijcleaowVar.f123975wwaezpbzkn) {
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                try {
                    zoijcleaowVar.crxdokpmqz();
                } catch (IOException unused) {
                    zoijcleaowVar.f123978ylkuphrtab = true;
                }
                try {
                    if (zoijcleaowVar.wwaezpbzkn()) {
                        zoijcleaowVar.okpsazkaxt();
                    }
                } catch (IOException unused2) {
                    zoijcleaowVar.f123973pkzmftpjix = true;
                    zoijcleaowVar.f123976yadqdtsiqt = bl.zdlpuopuiu.zoijcleaow(bl.zdlpuopuiu.iobyxmoadg());
                }
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((gxszxtbevo) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    static final class lqeggnwhkg extends jyumaefscl implements tg.draadjrbmk {
        lqeggnwhkg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((IOException) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(IOException iOException) {
            zoijcleaow.this.f123967iozdgvuglv = true;
        }
    }

    public final class ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f123985eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f123986gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f123987iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private C3133zoijcleaow f123988lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private int f123989nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final ArrayList f123990ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final ArrayList f123991wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final long[] f123992zoijcleaow;

        public ppxfxbqfkf(String str) {
            this.f123987iobyxmoadg = str;
            this.f123992zoijcleaow = new long[zoijcleaow.this.f123969iwizpuwonk];
            this.f123990ppxfxbqfkf = new ArrayList(zoijcleaow.this.f123969iwizpuwonk);
            this.f123991wkgbmnqykc = new ArrayList(zoijcleaow.this.f123969iwizpuwonk);
            StringBuilder sb3 = new StringBuilder(str);
            sb3.append('.');
            int length = sb3.length();
            int i13 = zoijcleaow.this.f123969iwizpuwonk;
            for (int i14 = 0; i14 < i13; i14++) {
                sb3.append(i14);
                this.f123990ppxfxbqfkf.add(zoijcleaow.this.f123979zdlpuopuiu.gtknphoqwx(sb3.toString()));
                sb3.append(".tmp");
                this.f123991wkgbmnqykc.add(zoijcleaow.this.f123979zdlpuopuiu.gtknphoqwx(sb3.toString()));
                sb3.setLength(length);
            }
        }

        public final wkgbmnqykc agtfadlqog() {
            if (!this.f123985eablkybsjg || this.f123988lqeggnwhkg != null || this.f123986gxszxtbevo) {
                return null;
            }
            ArrayList arrayList = this.f123990ppxfxbqfkf;
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (!zoijcleaowVar.f123966hcddaimhww.btonecajqb((esjtqupxsv) arrayList.get(i13))) {
                    try {
                        zoijcleaowVar.ntlheqmsrt(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
            }
            this.f123989nufgyqmvbu++;
            return zoijcleaow.this.new wkgbmnqykc(this);
        }

        public final void btonecajqb(List list) throws IOException {
            if (list.size() != zoijcleaow.this.f123969iwizpuwonk) {
                throw new IOException("unexpected journal line: " + list);
            }
            try {
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    this.f123992zoijcleaow[i13] = Long.parseLong((String) list.get(i13));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + list);
            }
        }

        public final void draadjrbmk(boolean z13) {
            this.f123985eablkybsjg = z13;
        }

        public final void dxjokdxxww(C3133zoijcleaow c3133zoijcleaow) {
            this.f123988lqeggnwhkg = c3133zoijcleaow;
        }

        public final long[] eablkybsjg() {
            return this.f123992zoijcleaow;
        }

        public final void gtknphoqwx(int i13) {
            this.f123989nufgyqmvbu = i13;
        }

        public final int gxszxtbevo() {
            return this.f123989nufgyqmvbu;
        }

        public final ArrayList iobyxmoadg() {
            return this.f123990ppxfxbqfkf;
        }

        public final boolean lqeggnwhkg() {
            return this.f123985eablkybsjg;
        }

        public final boolean nufgyqmvbu() {
            return this.f123986gxszxtbevo;
        }

        public final void ojitshcjhn(bl.wkgbmnqykc wkgbmnqykcVar) {
            for (long j13 : this.f123992zoijcleaow) {
                wkgbmnqykcVar.o(32).ixidwrxhsl(j13);
            }
        }

        public final ArrayList ppxfxbqfkf() {
            return this.f123991wkgbmnqykc;
        }

        public final void wflxmlrfwp(boolean z13) {
            this.f123986gxszxtbevo = z13;
        }

        public final String wkgbmnqykc() {
            return this.f123987iobyxmoadg;
        }

        public final C3133zoijcleaow zoijcleaow() {
            return this.f123988lqeggnwhkg;
        }
    }

    public final class wkgbmnqykc implements Closeable {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private boolean f123994yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final ppxfxbqfkf f123995zdlpuopuiu;

        public wkgbmnqykc(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f123995zdlpuopuiu = ppxfxbqfkfVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f123994yggfygwlhe) {
                return;
            }
            this.f123994yggfygwlhe = true;
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            synchronized (zoijcleaowVar) {
                try {
                    ppxfxbqfkf ppxfxbqfkfVar = this.f123995zdlpuopuiu;
                    ppxfxbqfkfVar.gtknphoqwx(ppxfxbqfkfVar.gxszxtbevo() - 1);
                    if (this.f123995zdlpuopuiu.gxszxtbevo() == 0 && this.f123995zdlpuopuiu.nufgyqmvbu()) {
                        zoijcleaowVar.ntlheqmsrt(this.f123995zdlpuopuiu);
                    }
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final C3133zoijcleaow iobyxmoadg() {
            C3133zoijcleaow c3133zoijcleaowZynmafqrjb;
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            synchronized (zoijcleaowVar) {
                close();
                c3133zoijcleaowZynmafqrjb = zoijcleaowVar.zynmafqrjb(this.f123995zdlpuopuiu.wkgbmnqykc());
            }
            return c3133zoijcleaowZynmafqrjb;
        }

        public final esjtqupxsv wkgbmnqykc(int i13) {
            if (this.f123994yggfygwlhe) {
                throw new IllegalStateException("snapshot is closed");
            }
            return (esjtqupxsv) this.f123995zdlpuopuiu.iobyxmoadg().get(i13);
        }
    }

    /* JADX INFO: renamed from: y6.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public final class C3133zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ppxfxbqfkf f123996iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final boolean[] f123997ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private boolean f123999zoijcleaow;

        public C3133zoijcleaow(ppxfxbqfkf ppxfxbqfkfVar) {
            this.f123996iobyxmoadg = ppxfxbqfkfVar;
            this.f123997ppxfxbqfkf = new boolean[zoijcleaow.this.f123969iwizpuwonk];
        }

        private final void wkgbmnqykc(boolean z13) {
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            synchronized (zoijcleaowVar) {
                try {
                    if (this.f123999zoijcleaow) {
                        throw new IllegalStateException("editor is closed");
                    }
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f123996iobyxmoadg.zoijcleaow(), this)) {
                        zoijcleaowVar.lereixgezr(this, z13);
                    }
                    this.f123999zoijcleaow = true;
                    wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void eablkybsjg() {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f123996iobyxmoadg.zoijcleaow(), this)) {
                this.f123996iobyxmoadg.wflxmlrfwp(true);
            }
        }

        public final esjtqupxsv gxszxtbevo(int i13) {
            esjtqupxsv esjtqupxsvVar;
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            synchronized (zoijcleaowVar) {
                if (this.f123999zoijcleaow) {
                    throw new IllegalStateException("editor is closed");
                }
                this.f123997ppxfxbqfkf[i13] = true;
                Object obj = this.f123996iobyxmoadg.ppxfxbqfkf().get(i13);
                i7.eablkybsjg.iobyxmoadg(zoijcleaowVar.f123966hcddaimhww, (esjtqupxsv) obj);
                esjtqupxsvVar = (esjtqupxsv) obj;
            }
            return esjtqupxsvVar;
        }

        public final void iobyxmoadg() {
            wkgbmnqykc(false);
        }

        public final ppxfxbqfkf lqeggnwhkg() {
            return this.f123996iobyxmoadg;
        }

        public final boolean[] nufgyqmvbu() {
            return this.f123997ppxfxbqfkf;
        }

        public final wkgbmnqykc ppxfxbqfkf() {
            wkgbmnqykc wkgbmnqykcVarIstkbnxepw;
            zoijcleaow zoijcleaowVar = zoijcleaow.this;
            synchronized (zoijcleaowVar) {
                zoijcleaow();
                wkgbmnqykcVarIstkbnxepw = zoijcleaowVar.istkbnxepw(this.f123996iobyxmoadg.wkgbmnqykc());
            }
            return wkgbmnqykcVarIstkbnxepw;
        }

        public final void zoijcleaow() {
            wkgbmnqykc(true);
        }
    }

    public zoijcleaow(dxjokdxxww dxjokdxxwwVar, esjtqupxsv esjtqupxsvVar, pkzmftpjix pkzmftpjixVar, long j13, int i13, int i14) {
        this.f123979zdlpuopuiu = esjtqupxsvVar;
        this.f123977yggfygwlhe = j13;
        this.f123970jyumaefscl = i13;
        this.f123969iwizpuwonk = i14;
        if (j13 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i14 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f123964cqumvgiudr = esjtqupxsvVar.gtknphoqwx("journal");
        this.f123965esjtqupxsv = esjtqupxsvVar.gtknphoqwx("journal.tmp");
        this.f123971lereixgezr = esjtqupxsvVar.gtknphoqwx("journal.bkp");
        this.f123974pmvmpeiblj = new LinkedHashMap(0, 0.75f, true);
        this.f123980zynmafqrjb = dsvhmnatus.iobyxmoadg(krqnebusok.zoijcleaow(null, 1, null).plus(pkzmftpjixVar.crxdokpmqz(1)));
        this.f123966hcddaimhww = new eablkybsjg(dxjokdxxwwVar);
    }

    private final void cqumvgiudr() {
        if (this.f123975wwaezpbzkn) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void crxdokpmqz() {
        while (this.f123968istkbnxepw > this.f123977yggfygwlhe) {
            if (!ulzqkzuiru()) {
                return;
            }
        }
        this.f123978ylkuphrtab = false;
    }

    private final bl.wkgbmnqykc dsvhmnatus() {
        return bl.zdlpuopuiu.zoijcleaow(new y6.ppxfxbqfkf(this.f123966hcddaimhww.iobyxmoadg(this.f123964cqumvgiudr), new lqeggnwhkg()));
    }

    private final void hkdspvbjdz() {
        pj.gtknphoqwx.wkgbmnqykc(this.f123980zynmafqrjb, null, null, new gxszxtbevo(null), 3, null);
    }

    private final void jlmebxxoox(String str) {
        if (f123961hkdspvbjdz.ojitshcjhn(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    private final void kegysxyocb() throws Throwable {
        wwaezpbzkn wwaezpbzknVar;
        bl.eablkybsjg eablkybsjgVarPpxfxbqfkf = bl.zdlpuopuiu.ppxfxbqfkf(this.f123966hcddaimhww.vdvldrhtss(this.f123964cqumvgiudr));
        Throwable th2 = null;
        try {
            String strRoivzttewh = eablkybsjgVarPpxfxbqfkf.roivzttewh();
            String strRoivzttewh2 = eablkybsjgVarPpxfxbqfkf.roivzttewh();
            String strRoivzttewh3 = eablkybsjgVarPpxfxbqfkf.roivzttewh();
            String strRoivzttewh4 = eablkybsjgVarPpxfxbqfkf.roivzttewh();
            String strRoivzttewh5 = eablkybsjgVarPpxfxbqfkf.roivzttewh();
            if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg("libcore.io.DiskLruCache", strRoivzttewh) || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg("1", strRoivzttewh2) || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(String.valueOf(this.f123970jyumaefscl), strRoivzttewh3) || !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(String.valueOf(this.f123969iwizpuwonk), strRoivzttewh4) || strRoivzttewh5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strRoivzttewh + ", " + strRoivzttewh2 + ", " + strRoivzttewh3 + ", " + strRoivzttewh4 + ", " + strRoivzttewh5 + ']');
            }
            int i13 = 0;
            while (true) {
                try {
                    mbcevpiqjq(eablkybsjgVarPpxfxbqfkf.roivzttewh());
                    i13++;
                } catch (EOFException unused) {
                    this.f123963cdpycssgdh = i13 - this.f123974pmvmpeiblj.size();
                    if (eablkybsjgVarPpxfxbqfkf.n()) {
                        this.f123976yadqdtsiqt = dsvhmnatus();
                    } else {
                        okpsazkaxt();
                    }
                    wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                    if (eablkybsjgVarPpxfxbqfkf != null) {
                        try {
                            eablkybsjgVarPpxfxbqfkf.close();
                        } catch (Throwable th3) {
                            th2 = th3;
                        }
                    }
                    if (th2 == null) {
                        throw th2;
                    }
                    kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wwaezpbzknVar);
                }
            }
        } catch (Throwable th4) {
            if (eablkybsjgVarPpxfxbqfkf != null) {
                try {
                    eablkybsjgVarPpxfxbqfkf.close();
                } catch (Throwable th5) {
                    gg.lqeggnwhkg.iobyxmoadg(th4, th5);
                }
            }
            th2 = th4;
            wwaezpbzknVar = null;
            if (th2 == null) {
                throw th2;
            }
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wwaezpbzknVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void lereixgezr(C3133zoijcleaow c3133zoijcleaow, boolean z13) {
        ppxfxbqfkf ppxfxbqfkfVarLqeggnwhkg = c3133zoijcleaow.lqeggnwhkg();
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarLqeggnwhkg.zoijcleaow(), c3133zoijcleaow)) {
            throw new IllegalStateException("Check failed.");
        }
        int i13 = 0;
        if (!z13 || ppxfxbqfkfVarLqeggnwhkg.nufgyqmvbu()) {
            int i14 = this.f123969iwizpuwonk;
            while (i13 < i14) {
                this.f123966hcddaimhww.nufgyqmvbu((esjtqupxsv) ppxfxbqfkfVarLqeggnwhkg.ppxfxbqfkf().get(i13));
                i13++;
            }
        } else {
            int i15 = this.f123969iwizpuwonk;
            for (int i16 = 0; i16 < i15; i16++) {
                if (c3133zoijcleaow.nufgyqmvbu()[i16] && !this.f123966hcddaimhww.btonecajqb((esjtqupxsv) ppxfxbqfkfVarLqeggnwhkg.ppxfxbqfkf().get(i16))) {
                    c3133zoijcleaow.iobyxmoadg();
                    return;
                }
            }
            int i17 = this.f123969iwizpuwonk;
            while (i13 < i17) {
                esjtqupxsv esjtqupxsvVar = (esjtqupxsv) ppxfxbqfkfVarLqeggnwhkg.ppxfxbqfkf().get(i13);
                esjtqupxsv esjtqupxsvVar2 = (esjtqupxsv) ppxfxbqfkfVarLqeggnwhkg.iobyxmoadg().get(i13);
                if (this.f123966hcddaimhww.btonecajqb(esjtqupxsvVar)) {
                    this.f123966hcddaimhww.ppxfxbqfkf(esjtqupxsvVar, esjtqupxsvVar2);
                } else {
                    i7.eablkybsjg.iobyxmoadg(this.f123966hcddaimhww, (esjtqupxsv) ppxfxbqfkfVarLqeggnwhkg.iobyxmoadg().get(i13));
                }
                long j13 = ppxfxbqfkfVarLqeggnwhkg.eablkybsjg()[i13];
                Long lWkgbmnqykc = this.f123966hcddaimhww.draadjrbmk(esjtqupxsvVar2).wkgbmnqykc();
                long jLongValue = lWkgbmnqykc != null ? lWkgbmnqykc.longValue() : 0L;
                ppxfxbqfkfVarLqeggnwhkg.eablkybsjg()[i13] = jLongValue;
                this.f123968istkbnxepw = (this.f123968istkbnxepw - j13) + jLongValue;
                i13++;
            }
        }
        ppxfxbqfkfVarLqeggnwhkg.dxjokdxxww(null);
        if (ppxfxbqfkfVarLqeggnwhkg.nufgyqmvbu()) {
            ntlheqmsrt(ppxfxbqfkfVarLqeggnwhkg);
            return;
        }
        this.f123963cdpycssgdh++;
        bl.wkgbmnqykc wkgbmnqykcVar = this.f123976yadqdtsiqt;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wkgbmnqykcVar);
        if (z13 || ppxfxbqfkfVarLqeggnwhkg.lqeggnwhkg()) {
            ppxfxbqfkfVarLqeggnwhkg.draadjrbmk(true);
            wkgbmnqykcVar.metgxyhuhe("CLEAN");
            wkgbmnqykcVar.o(32);
            wkgbmnqykcVar.metgxyhuhe(ppxfxbqfkfVarLqeggnwhkg.wkgbmnqykc());
            ppxfxbqfkfVarLqeggnwhkg.ojitshcjhn(wkgbmnqykcVar);
            wkgbmnqykcVar.o(10);
        } else {
            this.f123974pmvmpeiblj.remove(ppxfxbqfkfVarLqeggnwhkg.wkgbmnqykc());
            wkgbmnqykcVar.metgxyhuhe("REMOVE");
            wkgbmnqykcVar.o(32);
            wkgbmnqykcVar.metgxyhuhe(ppxfxbqfkfVarLqeggnwhkg.wkgbmnqykc());
            wkgbmnqykcVar.o(10);
        }
        wkgbmnqykcVar.flush();
        if (this.f123968istkbnxepw > this.f123977yggfygwlhe || wwaezpbzkn()) {
            hkdspvbjdz();
        }
    }

    private final void mbcevpiqjq(String str) throws IOException {
        String strSubstring;
        int iYfnezrywwk = kcexrzcfyt.yfnezrywwk(str, ' ', 0, false, 6, null);
        if (iYfnezrywwk == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i13 = iYfnezrywwk + 1;
        int iYfnezrywwk2 = kcexrzcfyt.yfnezrywwk(str, ' ', i13, false, 4, null);
        if (iYfnezrywwk2 == -1) {
            strSubstring = str.substring(i13);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (iYfnezrywwk == 6 && kcexrzcfyt.stevsuqkhv(str, "REMOVE", false, 2, null)) {
                this.f123974pmvmpeiblj.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i13, iYfnezrywwk2);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        LinkedHashMap linkedHashMap = this.f123974pmvmpeiblj;
        Object ppxfxbqfkfVar = linkedHashMap.get(strSubstring);
        if (ppxfxbqfkfVar == null) {
            ppxfxbqfkfVar = new ppxfxbqfkf(strSubstring);
            linkedHashMap.put(strSubstring, ppxfxbqfkfVar);
        }
        ppxfxbqfkf ppxfxbqfkfVar2 = (ppxfxbqfkf) ppxfxbqfkfVar;
        if (iYfnezrywwk2 != -1 && iYfnezrywwk == 5 && kcexrzcfyt.stevsuqkhv(str, "CLEAN", false, 2, null)) {
            String strSubstring2 = str.substring(iYfnezrywwk2 + 1);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(strSubstring2, "this as java.lang.String).substring(startIndex)");
            List listMhtqkkgtqm = kcexrzcfyt.mhtqkkgtqm(strSubstring2, new char[]{' '}, false, 0, 6, null);
            ppxfxbqfkfVar2.draadjrbmk(true);
            ppxfxbqfkfVar2.dxjokdxxww(null);
            ppxfxbqfkfVar2.btonecajqb(listMhtqkkgtqm);
            return;
        }
        if (iYfnezrywwk2 == -1 && iYfnezrywwk == 5 && kcexrzcfyt.stevsuqkhv(str, "DIRTY", false, 2, null)) {
            ppxfxbqfkfVar2.dxjokdxxww(new C3133zoijcleaow(ppxfxbqfkfVar2));
            return;
        }
        if (iYfnezrywwk2 == -1 && iYfnezrywwk == 4 && kcexrzcfyt.stevsuqkhv(str, "READ", false, 2, null)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ntlheqmsrt(ppxfxbqfkf ppxfxbqfkfVar) {
        bl.wkgbmnqykc wkgbmnqykcVar;
        if (ppxfxbqfkfVar.gxszxtbevo() > 0 && (wkgbmnqykcVar = this.f123976yadqdtsiqt) != null) {
            wkgbmnqykcVar.metgxyhuhe("DIRTY");
            wkgbmnqykcVar.o(32);
            wkgbmnqykcVar.metgxyhuhe(ppxfxbqfkfVar.wkgbmnqykc());
            wkgbmnqykcVar.o(10);
            wkgbmnqykcVar.flush();
        }
        if (ppxfxbqfkfVar.gxszxtbevo() > 0 || ppxfxbqfkfVar.zoijcleaow() != null) {
            ppxfxbqfkfVar.wflxmlrfwp(true);
            return true;
        }
        int i13 = this.f123969iwizpuwonk;
        for (int i14 = 0; i14 < i13; i14++) {
            this.f123966hcddaimhww.nufgyqmvbu((esjtqupxsv) ppxfxbqfkfVar.iobyxmoadg().get(i14));
            this.f123968istkbnxepw -= ppxfxbqfkfVar.eablkybsjg()[i14];
            ppxfxbqfkfVar.eablkybsjg()[i14] = 0;
        }
        this.f123963cdpycssgdh++;
        bl.wkgbmnqykc wkgbmnqykcVar2 = this.f123976yadqdtsiqt;
        if (wkgbmnqykcVar2 != null) {
            wkgbmnqykcVar2.metgxyhuhe("REMOVE");
            wkgbmnqykcVar2.o(32);
            wkgbmnqykcVar2.metgxyhuhe(ppxfxbqfkfVar.wkgbmnqykc());
            wkgbmnqykcVar2.o(10);
        }
        this.f123974pmvmpeiblj.remove(ppxfxbqfkfVar.wkgbmnqykc());
        if (wwaezpbzkn()) {
            hkdspvbjdz();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void okpsazkaxt() {
        wwaezpbzkn wwaezpbzknVar;
        try {
            bl.wkgbmnqykc wkgbmnqykcVar = this.f123976yadqdtsiqt;
            if (wkgbmnqykcVar != null) {
                wkgbmnqykcVar.close();
            }
            bl.wkgbmnqykc wkgbmnqykcVarZoijcleaow = bl.zdlpuopuiu.zoijcleaow(this.f123966hcddaimhww.rgvfuqvkyq(this.f123965esjtqupxsv, false));
            Throwable th2 = null;
            try {
                wkgbmnqykcVarZoijcleaow.metgxyhuhe("libcore.io.DiskLruCache").o(10);
                wkgbmnqykcVarZoijcleaow.metgxyhuhe("1").o(10);
                wkgbmnqykcVarZoijcleaow.ixidwrxhsl(this.f123970jyumaefscl).o(10);
                wkgbmnqykcVarZoijcleaow.ixidwrxhsl(this.f123969iwizpuwonk).o(10);
                wkgbmnqykcVarZoijcleaow.o(10);
                for (ppxfxbqfkf ppxfxbqfkfVar : this.f123974pmvmpeiblj.values()) {
                    if (ppxfxbqfkfVar.zoijcleaow() != null) {
                        wkgbmnqykcVarZoijcleaow.metgxyhuhe("DIRTY");
                        wkgbmnqykcVarZoijcleaow.o(32);
                        wkgbmnqykcVarZoijcleaow.metgxyhuhe(ppxfxbqfkfVar.wkgbmnqykc());
                        wkgbmnqykcVarZoijcleaow.o(10);
                    } else {
                        wkgbmnqykcVarZoijcleaow.metgxyhuhe("CLEAN");
                        wkgbmnqykcVarZoijcleaow.o(32);
                        wkgbmnqykcVarZoijcleaow.metgxyhuhe(ppxfxbqfkfVar.wkgbmnqykc());
                        ppxfxbqfkfVar.ojitshcjhn(wkgbmnqykcVarZoijcleaow);
                        wkgbmnqykcVarZoijcleaow.o(10);
                    }
                }
                wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
                if (wkgbmnqykcVarZoijcleaow != null) {
                    try {
                        wkgbmnqykcVarZoijcleaow.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
            } catch (Throwable th4) {
                if (wkgbmnqykcVarZoijcleaow != null) {
                    try {
                        wkgbmnqykcVarZoijcleaow.close();
                    } catch (Throwable th5) {
                        gg.lqeggnwhkg.iobyxmoadg(th4, th5);
                    }
                }
                wwaezpbzknVar = null;
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wwaezpbzknVar);
            if (this.f123966hcddaimhww.btonecajqb(this.f123964cqumvgiudr)) {
                this.f123966hcddaimhww.ppxfxbqfkf(this.f123964cqumvgiudr, this.f123971lereixgezr);
                this.f123966hcddaimhww.ppxfxbqfkf(this.f123965esjtqupxsv, this.f123964cqumvgiudr);
                this.f123966hcddaimhww.nufgyqmvbu(this.f123971lereixgezr);
            } else {
                this.f123966hcddaimhww.ppxfxbqfkf(this.f123965esjtqupxsv, this.f123964cqumvgiudr);
            }
            this.f123976yadqdtsiqt = dsvhmnatus();
            this.f123963cdpycssgdh = 0;
            this.f123967iozdgvuglv = false;
            this.f123973pkzmftpjix = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    private final void pmvmpeiblj() throws IOException {
        close();
        i7.eablkybsjg.zoijcleaow(this.f123966hcddaimhww, this.f123979zdlpuopuiu);
    }

    private final boolean ulzqkzuiru() {
        for (ppxfxbqfkf ppxfxbqfkfVar : this.f123974pmvmpeiblj.values()) {
            if (!ppxfxbqfkfVar.nufgyqmvbu()) {
                ntlheqmsrt(ppxfxbqfkfVar);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean wwaezpbzkn() {
        return this.f123963cdpycssgdh >= 2000;
    }

    private final void wypolnanlu() {
        Iterator it = this.f123974pmvmpeiblj.values().iterator();
        long j13 = 0;
        while (it.hasNext()) {
            ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) it.next();
            int i13 = 0;
            if (ppxfxbqfkfVar.zoijcleaow() == null) {
                int i14 = this.f123969iwizpuwonk;
                while (i13 < i14) {
                    j13 += ppxfxbqfkfVar.eablkybsjg()[i13];
                    i13++;
                }
            } else {
                ppxfxbqfkfVar.dxjokdxxww(null);
                int i15 = this.f123969iwizpuwonk;
                while (i13 < i15) {
                    this.f123966hcddaimhww.nufgyqmvbu((esjtqupxsv) ppxfxbqfkfVar.iobyxmoadg().get(i13));
                    this.f123966hcddaimhww.nufgyqmvbu((esjtqupxsv) ppxfxbqfkfVar.ppxfxbqfkf().get(i13));
                    i13++;
                }
                it.remove();
            }
        }
        this.f123968istkbnxepw = j13;
    }

    public final synchronized void cdpycssgdh() {
        try {
            if (this.f123972lmojexxdyd) {
                return;
            }
            this.f123966hcddaimhww.nufgyqmvbu(this.f123965esjtqupxsv);
            if (this.f123966hcddaimhww.btonecajqb(this.f123971lereixgezr)) {
                if (this.f123966hcddaimhww.btonecajqb(this.f123964cqumvgiudr)) {
                    this.f123966hcddaimhww.nufgyqmvbu(this.f123971lereixgezr);
                } else {
                    this.f123966hcddaimhww.ppxfxbqfkf(this.f123971lereixgezr, this.f123964cqumvgiudr);
                }
            }
            if (this.f123966hcddaimhww.btonecajqb(this.f123964cqumvgiudr)) {
                try {
                    kegysxyocb();
                    wypolnanlu();
                    this.f123972lmojexxdyd = true;
                    return;
                } catch (IOException unused) {
                    try {
                        pmvmpeiblj();
                        this.f123975wwaezpbzkn = false;
                        okpsazkaxt();
                        this.f123972lmojexxdyd = true;
                    } catch (Throwable th2) {
                        this.f123975wwaezpbzkn = false;
                        throw th2;
                    }
                }
            }
            okpsazkaxt();
            this.f123972lmojexxdyd = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f123972lmojexxdyd && !this.f123975wwaezpbzkn) {
                for (ppxfxbqfkf ppxfxbqfkfVar : (ppxfxbqfkf[]) this.f123974pmvmpeiblj.values().toArray(new ppxfxbqfkf[0])) {
                    C3133zoijcleaow c3133zoijcleaowZoijcleaow = ppxfxbqfkfVar.zoijcleaow();
                    if (c3133zoijcleaowZoijcleaow != null) {
                        c3133zoijcleaowZoijcleaow.eablkybsjg();
                    }
                }
                crxdokpmqz();
                dsvhmnatus.eablkybsjg(this.f123980zynmafqrjb, null, 1, null);
                bl.wkgbmnqykc wkgbmnqykcVar = this.f123976yadqdtsiqt;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wkgbmnqykcVar);
                wkgbmnqykcVar.close();
                this.f123976yadqdtsiqt = null;
                this.f123975wwaezpbzkn = true;
                return;
            }
            this.f123975wwaezpbzkn = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f123972lmojexxdyd) {
            cqumvgiudr();
            crxdokpmqz();
            bl.wkgbmnqykc wkgbmnqykcVar = this.f123976yadqdtsiqt;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wkgbmnqykcVar);
            wkgbmnqykcVar.flush();
        }
    }

    public final synchronized wkgbmnqykc istkbnxepw(String str) {
        wkgbmnqykc wkgbmnqykcVarAgtfadlqog;
        cqumvgiudr();
        jlmebxxoox(str);
        cdpycssgdh();
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f123974pmvmpeiblj.get(str);
        if (ppxfxbqfkfVar != null && (wkgbmnqykcVarAgtfadlqog = ppxfxbqfkfVar.agtfadlqog()) != null) {
            this.f123963cdpycssgdh++;
            bl.wkgbmnqykc wkgbmnqykcVar = this.f123976yadqdtsiqt;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wkgbmnqykcVar);
            wkgbmnqykcVar.metgxyhuhe("READ");
            wkgbmnqykcVar.o(32);
            wkgbmnqykcVar.metgxyhuhe(str);
            wkgbmnqykcVar.o(10);
            if (wwaezpbzkn()) {
                hkdspvbjdz();
            }
            return wkgbmnqykcVarAgtfadlqog;
        }
        return null;
    }

    public final synchronized C3133zoijcleaow zynmafqrjb(String str) {
        cqumvgiudr();
        jlmebxxoox(str);
        cdpycssgdh();
        ppxfxbqfkf ppxfxbqfkfVar = (ppxfxbqfkf) this.f123974pmvmpeiblj.get(str);
        if ((ppxfxbqfkfVar != null ? ppxfxbqfkfVar.zoijcleaow() : null) != null) {
            return null;
        }
        if (ppxfxbqfkfVar != null && ppxfxbqfkfVar.gxszxtbevo() != 0) {
            return null;
        }
        if (!this.f123978ylkuphrtab && !this.f123973pkzmftpjix) {
            bl.wkgbmnqykc wkgbmnqykcVar = this.f123976yadqdtsiqt;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(wkgbmnqykcVar);
            wkgbmnqykcVar.metgxyhuhe("DIRTY");
            wkgbmnqykcVar.o(32);
            wkgbmnqykcVar.metgxyhuhe(str);
            wkgbmnqykcVar.o(10);
            wkgbmnqykcVar.flush();
            if (this.f123967iozdgvuglv) {
                return null;
            }
            if (ppxfxbqfkfVar == null) {
                ppxfxbqfkfVar = new ppxfxbqfkf(str);
                this.f123974pmvmpeiblj.put(str, ppxfxbqfkfVar);
            }
            C3133zoijcleaow c3133zoijcleaow = new C3133zoijcleaow(ppxfxbqfkfVar);
            ppxfxbqfkfVar.dxjokdxxww(c3133zoijcleaow);
            return c3133zoijcleaow;
        }
        hkdspvbjdz();
        return null;
    }
}
