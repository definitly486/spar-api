package c1;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class nufgyqmvbu extends eablkybsjg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected float f18394a = -1.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f18395b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f18396c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f18397d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private wkgbmnqykc f18398e = this.f18275kegysxyocb;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18399f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18400g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18401h;

    static /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        static final /* synthetic */ int[] f18402iobyxmoadg;

        static {
            int[] iArr = new int[wkgbmnqykc.iobyxmoadg.values().length];
            f18402iobyxmoadg = iArr;
            try {
                iArr[wkgbmnqykc.iobyxmoadg.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18402iobyxmoadg[wkgbmnqykc.iobyxmoadg.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18402iobyxmoadg[wkgbmnqykc.iobyxmoadg.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18402iobyxmoadg[wkgbmnqykc.iobyxmoadg.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18402iobyxmoadg[wkgbmnqykc.iobyxmoadg.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18402iobyxmoadg[wkgbmnqykc.iobyxmoadg.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18402iobyxmoadg[wkgbmnqykc.iobyxmoadg.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18402iobyxmoadg[wkgbmnqykc.iobyxmoadg.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18402iobyxmoadg[wkgbmnqykc.iobyxmoadg.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public nufgyqmvbu() {
        this.f18297ribwqtqdhb.clear();
        this.f18297ribwqtqdhb.add(this.f18398e);
        int length = this.f18269jlmebxxoox.length;
        for (int i13 = 0; i13 < length; i13++) {
            this.f18269jlmebxxoox[i13] = this.f18398e;
        }
    }

    @Override // c1.eablkybsjg
    public void A(z0.wkgbmnqykc wkgbmnqykcVar, boolean z13) {
        if (hkdspvbjdz() == null) {
            return;
        }
        int iEsjtqupxsv = wkgbmnqykcVar.esjtqupxsv(this.f18398e);
        if (this.f18399f == 1) {
            w(iEsjtqupxsv);
            x(0);
            ezmngbhpjk(hkdspvbjdz().lereixgezr());
            u(0);
            return;
        }
        w(0);
        x(iEsjtqupxsv);
        u(hkdspvbjdz().jlmebxxoox());
        ezmngbhpjk(0);
    }

    public wkgbmnqykc B() {
        return this.f18398e;
    }

    public int C() {
        return this.f18399f;
    }

    public int D() {
        return this.f18395b;
    }

    public int E() {
        return this.f18396c;
    }

    public float F() {
        return this.f18394a;
    }

    public void G(int i13) {
        this.f18398e.zdlpuopuiu(i13);
        this.f18401h = true;
    }

    public void H(int i13) {
        if (i13 > -1) {
            this.f18394a = -1.0f;
            this.f18395b = i13;
            this.f18396c = -1;
        }
    }

    public void I(int i13) {
        if (i13 > -1) {
            this.f18394a = -1.0f;
            this.f18395b = -1;
            this.f18396c = i13;
        }
    }

    public void J(float f13) {
        if (f13 > -1.0f) {
            this.f18394a = f13;
            this.f18395b = -1;
            this.f18396c = -1;
        }
    }

    public void K(int i13) {
        if (this.f18399f == i13) {
            return;
        }
        this.f18399f = i13;
        this.f18297ribwqtqdhb.clear();
        if (this.f18399f == 1) {
            this.f18398e = this.f18303stevsuqkhv;
        } else {
            this.f18398e = this.f18275kegysxyocb;
        }
        this.f18297ribwqtqdhb.add(this.f18398e);
        int length = this.f18269jlmebxxoox.length;
        for (int i14 = 0; i14 < length; i14++) {
            this.f18269jlmebxxoox[i14] = this.f18398e;
        }
    }

    @Override // c1.eablkybsjg
    public void agtfadlqog(eablkybsjg eablkybsjgVar, HashMap map) {
        super.agtfadlqog(eablkybsjgVar, map);
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) eablkybsjgVar;
        this.f18394a = nufgyqmvbuVar.f18394a;
        this.f18395b = nufgyqmvbuVar.f18395b;
        this.f18396c = nufgyqmvbuVar.f18396c;
        this.f18397d = nufgyqmvbuVar.f18397d;
        K(nufgyqmvbuVar.f18399f);
    }

    @Override // c1.eablkybsjg
    public boolean bfopjjpdmp() {
        return this.f18401h;
    }

    @Override // c1.eablkybsjg
    public void lqeggnwhkg(z0.wkgbmnqykc wkgbmnqykcVar, boolean z13) {
        gxszxtbevo gxszxtbevoVar = (gxszxtbevo) hkdspvbjdz();
        if (gxszxtbevoVar == null) {
            return;
        }
        wkgbmnqykc wkgbmnqykcVarVdvldrhtss = gxszxtbevoVar.vdvldrhtss(wkgbmnqykc.iobyxmoadg.LEFT);
        wkgbmnqykc wkgbmnqykcVarVdvldrhtss2 = gxszxtbevoVar.vdvldrhtss(wkgbmnqykc.iobyxmoadg.RIGHT);
        eablkybsjg eablkybsjgVar = this.f18259ikoacuggdj;
        boolean z14 = eablkybsjgVar != null && eablkybsjgVar.f18268jhduphickx[0] == eablkybsjg.zoijcleaow.WRAP_CONTENT;
        if (this.f18399f == 0) {
            wkgbmnqykcVarVdvldrhtss = gxszxtbevoVar.vdvldrhtss(wkgbmnqykc.iobyxmoadg.TOP);
            wkgbmnqykcVarVdvldrhtss2 = gxszxtbevoVar.vdvldrhtss(wkgbmnqykc.iobyxmoadg.BOTTOM);
            eablkybsjg eablkybsjgVar2 = this.f18259ikoacuggdj;
            z14 = eablkybsjgVar2 != null && eablkybsjgVar2.f18268jhduphickx[1] == eablkybsjg.zoijcleaow.WRAP_CONTENT;
        }
        if (this.f18401h && this.f18398e.agtfadlqog()) {
            z0.dxjokdxxww dxjokdxxwwVarVdvldrhtss = wkgbmnqykcVar.vdvldrhtss(this.f18398e);
            wkgbmnqykcVar.gxszxtbevo(dxjokdxxwwVarVdvldrhtss, this.f18398e.eablkybsjg());
            if (this.f18395b != -1) {
                if (z14) {
                    wkgbmnqykcVar.nufgyqmvbu(wkgbmnqykcVar.vdvldrhtss(wkgbmnqykcVarVdvldrhtss2), dxjokdxxwwVarVdvldrhtss, 0, 5);
                }
            } else if (this.f18396c != -1 && z14) {
                z0.dxjokdxxww dxjokdxxwwVarVdvldrhtss2 = wkgbmnqykcVar.vdvldrhtss(wkgbmnqykcVarVdvldrhtss2);
                wkgbmnqykcVar.nufgyqmvbu(dxjokdxxwwVarVdvldrhtss, wkgbmnqykcVar.vdvldrhtss(wkgbmnqykcVarVdvldrhtss), 0, 5);
                wkgbmnqykcVar.nufgyqmvbu(dxjokdxxwwVarVdvldrhtss2, dxjokdxxwwVarVdvldrhtss, 0, 5);
            }
            this.f18401h = false;
            return;
        }
        if (this.f18395b != -1) {
            z0.dxjokdxxww dxjokdxxwwVarVdvldrhtss3 = wkgbmnqykcVar.vdvldrhtss(this.f18398e);
            wkgbmnqykcVar.eablkybsjg(dxjokdxxwwVarVdvldrhtss3, wkgbmnqykcVar.vdvldrhtss(wkgbmnqykcVarVdvldrhtss), this.f18395b, 8);
            if (z14) {
                wkgbmnqykcVar.nufgyqmvbu(wkgbmnqykcVar.vdvldrhtss(wkgbmnqykcVarVdvldrhtss2), dxjokdxxwwVarVdvldrhtss3, 0, 5);
                return;
            }
            return;
        }
        if (this.f18396c == -1) {
            if (this.f18394a != -1.0f) {
                wkgbmnqykcVar.wkgbmnqykc(z0.wkgbmnqykc.kcexrzcfyt(wkgbmnqykcVar, wkgbmnqykcVar.vdvldrhtss(this.f18398e), wkgbmnqykcVar.vdvldrhtss(wkgbmnqykcVarVdvldrhtss2), this.f18394a));
                return;
            }
            return;
        }
        z0.dxjokdxxww dxjokdxxwwVarVdvldrhtss4 = wkgbmnqykcVar.vdvldrhtss(this.f18398e);
        z0.dxjokdxxww dxjokdxxwwVarVdvldrhtss5 = wkgbmnqykcVar.vdvldrhtss(wkgbmnqykcVarVdvldrhtss2);
        wkgbmnqykcVar.eablkybsjg(dxjokdxxwwVarVdvldrhtss4, dxjokdxxwwVarVdvldrhtss5, -this.f18396c, 8);
        if (z14) {
            wkgbmnqykcVar.nufgyqmvbu(dxjokdxxwwVarVdvldrhtss4, wkgbmnqykcVar.vdvldrhtss(wkgbmnqykcVarVdvldrhtss), 0, 5);
            wkgbmnqykcVar.nufgyqmvbu(dxjokdxxwwVarVdvldrhtss5, dxjokdxxwwVarVdvldrhtss4, 0, 5);
        }
    }

    @Override // c1.eablkybsjg
    public boolean nufgyqmvbu() {
        return true;
    }

    @Override // c1.eablkybsjg
    public boolean opjhrmiecq() {
        return this.f18401h;
    }

    @Override // c1.eablkybsjg
    public wkgbmnqykc vdvldrhtss(wkgbmnqykc.iobyxmoadg iobyxmoadgVar) {
        int i13 = iobyxmoadg.f18402iobyxmoadg[iobyxmoadgVar.ordinal()];
        if (i13 == 1 || i13 == 2) {
            if (this.f18399f == 1) {
                return this.f18398e;
            }
            return null;
        }
        if ((i13 == 3 || i13 == 4) && this.f18399f == 0) {
            return this.f18398e;
        }
        return null;
    }
}
