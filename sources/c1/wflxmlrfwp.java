package c1;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class wflxmlrfwp extends btonecajqb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18425c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18426d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18427e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18428f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18429g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f18430h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f18431i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f18432j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f18433k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f18434l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f18435m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected d1.zoijcleaow.iobyxmoadg f18436n = new d1.zoijcleaow.iobyxmoadg();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    d1.zoijcleaow.InterfaceC0476zoijcleaow f18437o = null;

    public void D(boolean z13) {
        int i13 = this.f18429g;
        if (i13 > 0 || this.f18430h > 0) {
            if (z13) {
                this.f18431i = this.f18430h;
                this.f18432j = i13;
            } else {
                this.f18431i = i13;
                this.f18432j = this.f18430h;
            }
        }
    }

    public void E() {
        for (int i13 = 0; i13 < this.f18229b; i13++) {
            eablkybsjg eablkybsjgVar = this.f18228a[i13];
            if (eablkybsjgVar != null) {
                eablkybsjgVar.e(true);
            }
        }
    }

    public boolean F(HashSet hashSet) {
        for (int i13 = 0; i13 < this.f18229b; i13++) {
            if (hashSet.contains(this.f18228a[i13])) {
                return true;
            }
        }
        return false;
    }

    public int G() {
        return this.f18435m;
    }

    public int H() {
        return this.f18434l;
    }

    public int I() {
        return this.f18426d;
    }

    public int J() {
        return this.f18431i;
    }

    public int K() {
        return this.f18432j;
    }

    public int L() {
        return this.f18425c;
    }

    public abstract void M(int i13, int i14, int i15, int i16);

    protected void N(eablkybsjg eablkybsjgVar, eablkybsjg.zoijcleaow zoijcleaowVar, int i13, eablkybsjg.zoijcleaow zoijcleaowVar2, int i14) {
        while (this.f18437o == null && hkdspvbjdz() != null) {
            this.f18437o = ((gxszxtbevo) hkdspvbjdz()).T();
        }
        d1.zoijcleaow.iobyxmoadg iobyxmoadgVar = this.f18436n;
        iobyxmoadgVar.f26675iobyxmoadg = zoijcleaowVar;
        iobyxmoadgVar.f26680zoijcleaow = zoijcleaowVar2;
        iobyxmoadgVar.f26678ppxfxbqfkf = i13;
        iobyxmoadgVar.f26679wkgbmnqykc = i14;
        this.f18437o.zoijcleaow(eablkybsjgVar, iobyxmoadgVar);
        eablkybsjgVar.u(this.f18436n.f26673eablkybsjg);
        eablkybsjgVar.ezmngbhpjk(this.f18436n.f26674gxszxtbevo);
        eablkybsjgVar.fmlbqenlif(this.f18436n.f26677nufgyqmvbu);
        eablkybsjgVar.wizcaqwiak(this.f18436n.f26676lqeggnwhkg);
    }

    protected boolean O() {
        eablkybsjg eablkybsjgVar = this.f18259ikoacuggdj;
        d1.zoijcleaow.InterfaceC0476zoijcleaow interfaceC0476zoijcleaowT = eablkybsjgVar != null ? ((gxszxtbevo) eablkybsjgVar).T() : null;
        if (interfaceC0476zoijcleaowT == null) {
            return false;
        }
        for (int i13 = 0; i13 < this.f18229b; i13++) {
            eablkybsjg eablkybsjgVar2 = this.f18228a[i13];
            if (eablkybsjgVar2 != null && !(eablkybsjgVar2 instanceof nufgyqmvbu)) {
                eablkybsjg.zoijcleaow zoijcleaowVarIwizpuwonk = eablkybsjgVar2.iwizpuwonk(0);
                eablkybsjg.zoijcleaow zoijcleaowVarIwizpuwonk2 = eablkybsjgVar2.iwizpuwonk(1);
                eablkybsjg.zoijcleaow zoijcleaowVar = eablkybsjg.zoijcleaow.MATCH_CONSTRAINT;
                if (zoijcleaowVarIwizpuwonk != zoijcleaowVar || eablkybsjgVar2.f18264iwizpuwonk == 1 || zoijcleaowVarIwizpuwonk2 != zoijcleaowVar || eablkybsjgVar2.f18238cqumvgiudr == 1) {
                    if (zoijcleaowVarIwizpuwonk == zoijcleaowVar) {
                        zoijcleaowVarIwizpuwonk = eablkybsjg.zoijcleaow.WRAP_CONTENT;
                    }
                    if (zoijcleaowVarIwizpuwonk2 == zoijcleaowVar) {
                        zoijcleaowVarIwizpuwonk2 = eablkybsjg.zoijcleaow.WRAP_CONTENT;
                    }
                    d1.zoijcleaow.iobyxmoadg iobyxmoadgVar = this.f18436n;
                    iobyxmoadgVar.f26675iobyxmoadg = zoijcleaowVarIwizpuwonk;
                    iobyxmoadgVar.f26680zoijcleaow = zoijcleaowVarIwizpuwonk2;
                    iobyxmoadgVar.f26678ppxfxbqfkf = eablkybsjgVar2.jlmebxxoox();
                    this.f18436n.f26679wkgbmnqykc = eablkybsjgVar2.lereixgezr();
                    interfaceC0476zoijcleaowT.zoijcleaow(eablkybsjgVar2, this.f18436n);
                    eablkybsjgVar2.u(this.f18436n.f26673eablkybsjg);
                    eablkybsjgVar2.ezmngbhpjk(this.f18436n.f26674gxszxtbevo);
                    eablkybsjgVar2.wizcaqwiak(this.f18436n.f26676lqeggnwhkg);
                }
            }
        }
        return true;
    }

    public boolean P() {
        return this.f18433k;
    }

    protected void Q(boolean z13) {
        this.f18433k = z13;
    }

    public void R(int i13, int i14) {
        this.f18434l = i13;
        this.f18435m = i14;
    }

    public void S(int i13) {
        this.f18427e = i13;
        this.f18425c = i13;
        this.f18428f = i13;
        this.f18426d = i13;
        this.f18429g = i13;
        this.f18430h = i13;
    }

    public void T(int i13) {
        this.f18426d = i13;
    }

    public void U(int i13) {
        this.f18430h = i13;
    }

    public void V(int i13) {
        this.f18427e = i13;
        this.f18431i = i13;
    }

    public void W(int i13) {
        this.f18428f = i13;
        this.f18432j = i13;
    }

    public void X(int i13) {
        this.f18429g = i13;
        this.f18431i = i13;
        this.f18432j = i13;
    }

    public void Y(int i13) {
        this.f18425c = i13;
    }

    @Override // c1.btonecajqb, c1.dxjokdxxww
    public void zoijcleaow(gxszxtbevo gxszxtbevoVar) {
        E();
    }
}
