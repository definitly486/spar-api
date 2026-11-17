package g3;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class iyctptxqzt implements e0 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private e0.iobyxmoadg f36001eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private v2.cdpycssgdh f36002gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final v2.cdpycssgdh.ppxfxbqfkf f36003iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private String f36004lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private long f36005nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final HashMap f36006ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final xa.vdvldrhtss f36007wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final v2.cdpycssgdh.zoijcleaow f36008zoijcleaow;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public static final xa.vdvldrhtss f36000dxjokdxxww = new xa.vdvldrhtss() { // from class: g3.opjhrmiecq
        @Override // xa.vdvldrhtss
        public final Object get() {
            return iyctptxqzt.wflxmlrfwp();
        }
    };

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private static final Random f35999btonecajqb = new Random();

    private final class iobyxmoadg {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f36009eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f36010gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final String f36011iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private long f36013ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow f36014wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f36015zoijcleaow;

        public iobyxmoadg(String str, int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
            this.f36011iobyxmoadg = str;
            this.f36015zoijcleaow = i13;
            this.f36013ppxfxbqfkf = zoijcleaowVar == null ? -1L : zoijcleaowVar.f11264wkgbmnqykc;
            if (zoijcleaowVar == null || !zoijcleaowVar.zoijcleaow()) {
                return;
            }
            this.f36014wkgbmnqykc = zoijcleaowVar;
        }

        private int draadjrbmk(v2.cdpycssgdh cdpycssgdhVar, v2.cdpycssgdh cdpycssgdhVar2, int i13) {
            if (i13 >= cdpycssgdhVar.rgvfuqvkyq()) {
                if (i13 < cdpycssgdhVar2.rgvfuqvkyq()) {
                    return i13;
                }
                return -1;
            }
            cdpycssgdhVar.agtfadlqog(i13, iyctptxqzt.this.f36003iobyxmoadg);
            for (int i14 = iyctptxqzt.this.f36003iobyxmoadg.f115279agtfadlqog; i14 <= iyctptxqzt.this.f36003iobyxmoadg.f115289ojitshcjhn; i14++) {
                int iZoijcleaow = cdpycssgdhVar2.zoijcleaow(cdpycssgdhVar.wflxmlrfwp(i14));
                if (iZoijcleaow != -1) {
                    return cdpycssgdhVar2.gxszxtbevo(iZoijcleaow, iyctptxqzt.this.f36008zoijcleaow).f115304ppxfxbqfkf;
                }
            }
            return -1;
        }

        public boolean btonecajqb(zoijcleaow.iobyxmoadg iobyxmoadgVar) {
            androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f36126wkgbmnqykc;
            if (zoijcleaowVar == null) {
                return this.f36015zoijcleaow != iobyxmoadgVar.f36125ppxfxbqfkf;
            }
            long j13 = this.f36013ppxfxbqfkf;
            if (j13 == -1) {
                return false;
            }
            if (zoijcleaowVar.f11264wkgbmnqykc > j13) {
                return true;
            }
            if (this.f36014wkgbmnqykc == null) {
                return false;
            }
            int iZoijcleaow = iobyxmoadgVar.f36127zoijcleaow.zoijcleaow(zoijcleaowVar.f11262iobyxmoadg);
            int iZoijcleaow2 = iobyxmoadgVar.f36127zoijcleaow.zoijcleaow(this.f36014wkgbmnqykc.f11262iobyxmoadg);
            androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar2 = iobyxmoadgVar.f36126wkgbmnqykc;
            if (zoijcleaowVar2.f11264wkgbmnqykc < this.f36014wkgbmnqykc.f11264wkgbmnqykc || iZoijcleaow < iZoijcleaow2) {
                return false;
            }
            if (iZoijcleaow > iZoijcleaow2) {
                return true;
            }
            if (!zoijcleaowVar2.zoijcleaow()) {
                int i13 = iobyxmoadgVar.f36126wkgbmnqykc.f11261eablkybsjg;
                return i13 == -1 || i13 > this.f36014wkgbmnqykc.f11265zoijcleaow;
            }
            androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar3 = iobyxmoadgVar.f36126wkgbmnqykc;
            int i14 = zoijcleaowVar3.f11265zoijcleaow;
            int i15 = zoijcleaowVar3.f11263ppxfxbqfkf;
            androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar4 = this.f36014wkgbmnqykc;
            int i16 = zoijcleaowVar4.f11265zoijcleaow;
            if (i14 <= i16) {
                return i14 == i16 && i15 > zoijcleaowVar4.f11263ppxfxbqfkf;
            }
            return true;
        }

        public boolean dxjokdxxww(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
            if (zoijcleaowVar == null) {
                return i13 == this.f36015zoijcleaow;
            }
            androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar2 = this.f36014wkgbmnqykc;
            if (zoijcleaowVar2 == null) {
                return !zoijcleaowVar.zoijcleaow() && zoijcleaowVar.f11264wkgbmnqykc == this.f36013ppxfxbqfkf;
            }
            return zoijcleaowVar.f11264wkgbmnqykc == zoijcleaowVar2.f11264wkgbmnqykc && zoijcleaowVar.f11265zoijcleaow == zoijcleaowVar2.f11265zoijcleaow && zoijcleaowVar.f11263ppxfxbqfkf == zoijcleaowVar2.f11263ppxfxbqfkf;
        }

        public void gtknphoqwx(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
            if (this.f36013ppxfxbqfkf != -1 || i13 != this.f36015zoijcleaow || zoijcleaowVar == null || zoijcleaowVar.f11264wkgbmnqykc < iyctptxqzt.this.agtfadlqog()) {
                return;
            }
            this.f36013ppxfxbqfkf = zoijcleaowVar.f11264wkgbmnqykc;
        }

        public boolean wflxmlrfwp(v2.cdpycssgdh cdpycssgdhVar, v2.cdpycssgdh cdpycssgdhVar2) {
            int iDraadjrbmk = draadjrbmk(cdpycssgdhVar, cdpycssgdhVar2, this.f36015zoijcleaow);
            this.f36015zoijcleaow = iDraadjrbmk;
            if (iDraadjrbmk == -1) {
                return false;
            }
            androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar = this.f36014wkgbmnqykc;
            return zoijcleaowVar == null || cdpycssgdhVar2.zoijcleaow(zoijcleaowVar.f11262iobyxmoadg) != -1;
        }
    }

    public iyctptxqzt() {
        this(f36000dxjokdxxww);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long agtfadlqog() {
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) this.f36006ppxfxbqfkf.get(this.f36004lqeggnwhkg);
        return (iobyxmoadgVar == null || iobyxmoadgVar.f36013ppxfxbqfkf == -1) ? this.f36005nufgyqmvbu + 1 : iobyxmoadgVar.f36013ppxfxbqfkf;
    }

    private void draadjrbmk(iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar.f36013ppxfxbqfkf != -1) {
            this.f36005nufgyqmvbu = iobyxmoadgVar.f36013ppxfxbqfkf;
        }
        this.f36004lqeggnwhkg = null;
    }

    private iobyxmoadg ojitshcjhn(int i13, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        iobyxmoadg iobyxmoadgVar = null;
        long j13 = Long.MAX_VALUE;
        for (iobyxmoadg iobyxmoadgVar2 : this.f36006ppxfxbqfkf.values()) {
            iobyxmoadgVar2.gtknphoqwx(i13, zoijcleaowVar);
            if (iobyxmoadgVar2.dxjokdxxww(i13, zoijcleaowVar)) {
                long j14 = iobyxmoadgVar2.f36013ppxfxbqfkf;
                if (j14 == -1 || j14 < j13) {
                    iobyxmoadgVar = iobyxmoadgVar2;
                    j13 = j14;
                } else if (j14 == j13 && ((iobyxmoadg) y2.stevsuqkhv.nufgyqmvbu(iobyxmoadgVar)).f36014wkgbmnqykc != null && iobyxmoadgVar2.f36014wkgbmnqykc != null) {
                    iobyxmoadgVar = iobyxmoadgVar2;
                }
            }
        }
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        String str = (String) this.f36007wkgbmnqykc.get();
        iobyxmoadg iobyxmoadgVar3 = new iobyxmoadg(str, i13, zoijcleaowVar);
        this.f36006ppxfxbqfkf.put(str, iobyxmoadgVar3);
        return iobyxmoadgVar3;
    }

    private void rgvfuqvkyq(zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar.f36127zoijcleaow.vdvldrhtss()) {
            String str = this.f36004lqeggnwhkg;
            if (str != null) {
                draadjrbmk((iobyxmoadg) y2.iobyxmoadg.eablkybsjg((iobyxmoadg) this.f36006ppxfxbqfkf.get(str)));
                return;
            }
            return;
        }
        iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) this.f36006ppxfxbqfkf.get(this.f36004lqeggnwhkg);
        iobyxmoadg iobyxmoadgVarOjitshcjhn = ojitshcjhn(iobyxmoadgVar.f36125ppxfxbqfkf, iobyxmoadgVar.f36126wkgbmnqykc);
        this.f36004lqeggnwhkg = iobyxmoadgVarOjitshcjhn.f36011iobyxmoadg;
        gxszxtbevo(iobyxmoadgVar);
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f36126wkgbmnqykc;
        if (zoijcleaowVar == null || !zoijcleaowVar.zoijcleaow()) {
            return;
        }
        if (iobyxmoadgVar2 != null && iobyxmoadgVar2.f36013ppxfxbqfkf == iobyxmoadgVar.f36126wkgbmnqykc.f11264wkgbmnqykc && iobyxmoadgVar2.f36014wkgbmnqykc != null && iobyxmoadgVar2.f36014wkgbmnqykc.f11265zoijcleaow == iobyxmoadgVar.f36126wkgbmnqykc.f11265zoijcleaow && iobyxmoadgVar2.f36014wkgbmnqykc.f11263ppxfxbqfkf == iobyxmoadgVar.f36126wkgbmnqykc.f11263ppxfxbqfkf) {
            return;
        }
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar2 = iobyxmoadgVar.f36126wkgbmnqykc;
        this.f36001eablkybsjg.rlfsiqarku(iobyxmoadgVar, ojitshcjhn(iobyxmoadgVar.f36125ppxfxbqfkf, new androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow(zoijcleaowVar2.f11262iobyxmoadg, zoijcleaowVar2.f11264wkgbmnqykc)).f36011iobyxmoadg, iobyxmoadgVarOjitshcjhn.f36011iobyxmoadg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String wflxmlrfwp() {
        byte[] bArr = new byte[12];
        f35999btonecajqb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // g3.e0
    public synchronized void eablkybsjg(zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        try {
            y2.iobyxmoadg.eablkybsjg(this.f36001eablkybsjg);
            v2.cdpycssgdh cdpycssgdhVar = this.f36002gxszxtbevo;
            this.f36002gxszxtbevo = iobyxmoadgVar.f36127zoijcleaow;
            Iterator it = this.f36006ppxfxbqfkf.values().iterator();
            while (it.hasNext()) {
                iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) it.next();
                if (!iobyxmoadgVar2.wflxmlrfwp(cdpycssgdhVar, this.f36002gxszxtbevo) || iobyxmoadgVar2.btonecajqb(iobyxmoadgVar)) {
                    it.remove();
                    if (iobyxmoadgVar2.f36009eablkybsjg) {
                        if (iobyxmoadgVar2.f36011iobyxmoadg.equals(this.f36004lqeggnwhkg)) {
                            draadjrbmk(iobyxmoadgVar2);
                        }
                        this.f36001eablkybsjg.wflxmlrfwp(iobyxmoadgVar, iobyxmoadgVar2.f36011iobyxmoadg, false);
                    }
                }
            }
            rgvfuqvkyq(iobyxmoadgVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
    @Override // g3.e0
    public synchronized void gxszxtbevo(zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        zoijcleaow.iobyxmoadg iobyxmoadgVar2;
        iobyxmoadg iobyxmoadgVar3;
        y2.iobyxmoadg.eablkybsjg(this.f36001eablkybsjg);
        if (iobyxmoadgVar.f36127zoijcleaow.vdvldrhtss()) {
            return;
        }
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f36126wkgbmnqykc;
        if (zoijcleaowVar != null) {
            if (zoijcleaowVar.f11264wkgbmnqykc < agtfadlqog()) {
                return;
            }
            iobyxmoadg iobyxmoadgVar4 = (iobyxmoadg) this.f36006ppxfxbqfkf.get(this.f36004lqeggnwhkg);
            if (iobyxmoadgVar4 != null && iobyxmoadgVar4.f36013ppxfxbqfkf == -1 && iobyxmoadgVar4.f36015zoijcleaow != iobyxmoadgVar.f36125ppxfxbqfkf) {
                return;
            }
        }
        iobyxmoadg iobyxmoadgVarOjitshcjhn = ojitshcjhn(iobyxmoadgVar.f36125ppxfxbqfkf, iobyxmoadgVar.f36126wkgbmnqykc);
        if (this.f36004lqeggnwhkg == null) {
            this.f36004lqeggnwhkg = iobyxmoadgVarOjitshcjhn.f36011iobyxmoadg;
        }
        androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar2 = iobyxmoadgVar.f36126wkgbmnqykc;
        if (zoijcleaowVar2 != null && zoijcleaowVar2.zoijcleaow()) {
            androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar3 = iobyxmoadgVar.f36126wkgbmnqykc;
            androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar4 = new androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow(zoijcleaowVar3.f11262iobyxmoadg, zoijcleaowVar3.f11264wkgbmnqykc, zoijcleaowVar3.f11265zoijcleaow);
            iobyxmoadg iobyxmoadgVarOjitshcjhn2 = ojitshcjhn(iobyxmoadgVar.f36125ppxfxbqfkf, zoijcleaowVar4);
            if (!iobyxmoadgVarOjitshcjhn2.f36009eablkybsjg) {
                iobyxmoadgVarOjitshcjhn2.f36009eablkybsjg = true;
                iobyxmoadgVar.f36127zoijcleaow.nufgyqmvbu(iobyxmoadgVar.f36126wkgbmnqykc.f11262iobyxmoadg, this.f36008zoijcleaow);
                this.f36001eablkybsjg.pkzmftpjix(new zoijcleaow.iobyxmoadg(iobyxmoadgVar.f36122iobyxmoadg, iobyxmoadgVar.f36127zoijcleaow, iobyxmoadgVar.f36125ppxfxbqfkf, zoijcleaowVar4, Math.max(0L, y2.stevsuqkhv.t(this.f36008zoijcleaow.gxszxtbevo(iobyxmoadgVar.f36126wkgbmnqykc.f11265zoijcleaow)) + this.f36008zoijcleaow.wflxmlrfwp()), iobyxmoadgVar.f36121gxszxtbevo, iobyxmoadgVar.f36123lqeggnwhkg, iobyxmoadgVar.f36124nufgyqmvbu, iobyxmoadgVar.f36119dxjokdxxww, iobyxmoadgVar.f36118btonecajqb), iobyxmoadgVarOjitshcjhn2.f36011iobyxmoadg);
            }
        }
        if (iobyxmoadgVarOjitshcjhn.f36009eablkybsjg) {
            iobyxmoadgVar2 = iobyxmoadgVar;
            iobyxmoadgVar3 = iobyxmoadgVarOjitshcjhn;
        } else {
            iobyxmoadgVar3 = iobyxmoadgVarOjitshcjhn;
            iobyxmoadgVar3.f36009eablkybsjg = true;
            iobyxmoadgVar2 = iobyxmoadgVar;
            this.f36001eablkybsjg.pkzmftpjix(iobyxmoadgVar2, iobyxmoadgVar3.f36011iobyxmoadg);
        }
        if (iobyxmoadgVar3.f36011iobyxmoadg.equals(this.f36004lqeggnwhkg) && !iobyxmoadgVar3.f36010gxszxtbevo) {
            iobyxmoadgVar3.f36010gxszxtbevo = true;
            this.f36001eablkybsjg.lereixgezr(iobyxmoadgVar2, iobyxmoadgVar3.f36011iobyxmoadg);
        }
    }

    @Override // g3.e0
    public synchronized String iobyxmoadg() {
        return this.f36004lqeggnwhkg;
    }

    @Override // g3.e0
    public synchronized String lqeggnwhkg(v2.cdpycssgdh cdpycssgdhVar, androidx.media3.exoplayer.source.oxmwwwfdhm.zoijcleaow zoijcleaowVar) {
        return ojitshcjhn(cdpycssgdhVar.nufgyqmvbu(zoijcleaowVar.f11262iobyxmoadg, this.f36008zoijcleaow).f115304ppxfxbqfkf, zoijcleaowVar).f36011iobyxmoadg;
    }

    @Override // g3.e0
    public synchronized void ppxfxbqfkf(zoijcleaow.iobyxmoadg iobyxmoadgVar, int i13) {
        try {
            y2.iobyxmoadg.eablkybsjg(this.f36001eablkybsjg);
            boolean z13 = i13 == 0;
            Iterator it = this.f36006ppxfxbqfkf.values().iterator();
            while (it.hasNext()) {
                iobyxmoadg iobyxmoadgVar2 = (iobyxmoadg) it.next();
                if (iobyxmoadgVar2.btonecajqb(iobyxmoadgVar)) {
                    it.remove();
                    if (iobyxmoadgVar2.f36009eablkybsjg) {
                        boolean zEquals = iobyxmoadgVar2.f36011iobyxmoadg.equals(this.f36004lqeggnwhkg);
                        boolean z14 = z13 && zEquals && iobyxmoadgVar2.f36010gxszxtbevo;
                        if (zEquals) {
                            draadjrbmk(iobyxmoadgVar2);
                        }
                        this.f36001eablkybsjg.wflxmlrfwp(iobyxmoadgVar, iobyxmoadgVar2.f36011iobyxmoadg, z14);
                    }
                }
            }
            rgvfuqvkyq(iobyxmoadgVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // g3.e0
    public synchronized void wkgbmnqykc(zoijcleaow.iobyxmoadg iobyxmoadgVar) {
        e0.iobyxmoadg iobyxmoadgVar2;
        try {
            String str = this.f36004lqeggnwhkg;
            if (str != null) {
                draadjrbmk((iobyxmoadg) y2.iobyxmoadg.eablkybsjg((iobyxmoadg) this.f36006ppxfxbqfkf.get(str)));
            }
            Iterator it = this.f36006ppxfxbqfkf.values().iterator();
            while (it.hasNext()) {
                iobyxmoadg iobyxmoadgVar3 = (iobyxmoadg) it.next();
                it.remove();
                if (iobyxmoadgVar3.f36009eablkybsjg && (iobyxmoadgVar2 = this.f36001eablkybsjg) != null) {
                    iobyxmoadgVar2.wflxmlrfwp(iobyxmoadgVar, iobyxmoadgVar3.f36011iobyxmoadg, false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // g3.e0
    public void zoijcleaow(e0.iobyxmoadg iobyxmoadgVar) {
        this.f36001eablkybsjg = iobyxmoadgVar;
    }

    public iyctptxqzt(xa.vdvldrhtss vdvldrhtssVar) {
        this.f36007wkgbmnqykc = vdvldrhtssVar;
        this.f36003iobyxmoadg = new v2.cdpycssgdh.ppxfxbqfkf();
        this.f36008zoijcleaow = new v2.cdpycssgdh.zoijcleaow();
        this.f36006ppxfxbqfkf = new HashMap();
        this.f36002gxszxtbevo = v2.cdpycssgdh.f115259iobyxmoadg;
        this.f36005nufgyqmvbu = -1L;
    }
}
