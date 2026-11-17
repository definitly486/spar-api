package c1;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class gxszxtbevo extends agtfadlqog {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18338d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f18342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f18343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f18344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f18345k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d1.zoijcleaow f18336b = new d1.zoijcleaow(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d1.eablkybsjg f18337c = new d1.eablkybsjg(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected d1.zoijcleaow.InterfaceC0476zoijcleaow f18339e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f18340f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected z0.wkgbmnqykc f18341g = new z0.wkgbmnqykc();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18346l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18347m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ppxfxbqfkf[] f18348n = new ppxfxbqfkf[4];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ppxfxbqfkf[] f18349o = new ppxfxbqfkf[4];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f18350p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f18351q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f18352r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18353s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f18354t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f18355u = 257;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f18356v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f18357w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f18358x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    int f18359y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private WeakReference f18360z = null;
    private WeakReference A = null;
    private WeakReference B = null;
    private WeakReference C = null;
    HashSet D = new HashSet();
    public d1.zoijcleaow.iobyxmoadg E = new d1.zoijcleaow.iobyxmoadg();

    private void H(eablkybsjg eablkybsjgVar) {
        int i13 = this.f18346l + 1;
        ppxfxbqfkf[] ppxfxbqfkfVarArr = this.f18349o;
        if (i13 >= ppxfxbqfkfVarArr.length) {
            this.f18349o = (ppxfxbqfkf[]) Arrays.copyOf(ppxfxbqfkfVarArr, ppxfxbqfkfVarArr.length * 2);
        }
        this.f18349o[this.f18346l] = new ppxfxbqfkf(eablkybsjgVar, 0, a0());
        this.f18346l++;
    }

    private void K(wkgbmnqykc wkgbmnqykcVar, z0.dxjokdxxww dxjokdxxwwVar) {
        this.f18341g.nufgyqmvbu(dxjokdxxwwVar, this.f18341g.vdvldrhtss(wkgbmnqykcVar), 0, 5);
    }

    private void L(wkgbmnqykc wkgbmnqykcVar, z0.dxjokdxxww dxjokdxxwwVar) {
        this.f18341g.nufgyqmvbu(this.f18341g.vdvldrhtss(wkgbmnqykcVar), dxjokdxxwwVar, 0, 5);
    }

    private void M(eablkybsjg eablkybsjgVar) {
        int i13 = this.f18347m + 1;
        ppxfxbqfkf[] ppxfxbqfkfVarArr = this.f18348n;
        if (i13 >= ppxfxbqfkfVarArr.length) {
            this.f18348n = (ppxfxbqfkf[]) Arrays.copyOf(ppxfxbqfkfVarArr, ppxfxbqfkfVarArr.length * 2);
        }
        this.f18348n[this.f18347m] = new ppxfxbqfkf(eablkybsjgVar, 1, a0());
        this.f18347m++;
    }

    public static boolean d0(int i13, eablkybsjg eablkybsjgVar, d1.zoijcleaow.InterfaceC0476zoijcleaow interfaceC0476zoijcleaow, d1.zoijcleaow.iobyxmoadg iobyxmoadgVar, int i14) {
        int i15;
        int i16;
        if (interfaceC0476zoijcleaow == null) {
            return false;
        }
        if (eablkybsjgVar.crxdokpmqz() == 8 || (eablkybsjgVar instanceof nufgyqmvbu) || (eablkybsjgVar instanceof iobyxmoadg)) {
            iobyxmoadgVar.f26673eablkybsjg = 0;
            iobyxmoadgVar.f26674gxszxtbevo = 0;
            return false;
        }
        iobyxmoadgVar.f26675iobyxmoadg = eablkybsjgVar.istkbnxepw();
        iobyxmoadgVar.f26680zoijcleaow = eablkybsjgVar.ulzqkzuiru();
        iobyxmoadgVar.f26678ppxfxbqfkf = eablkybsjgVar.jlmebxxoox();
        iobyxmoadgVar.f26679wkgbmnqykc = eablkybsjgVar.lereixgezr();
        iobyxmoadgVar.f26672dxjokdxxww = false;
        iobyxmoadgVar.f26671btonecajqb = i14;
        eablkybsjg.zoijcleaow zoijcleaowVar = iobyxmoadgVar.f26675iobyxmoadg;
        eablkybsjg.zoijcleaow zoijcleaowVar2 = eablkybsjg.zoijcleaow.MATCH_CONSTRAINT;
        boolean z13 = zoijcleaowVar == zoijcleaowVar2;
        boolean z14 = iobyxmoadgVar.f26680zoijcleaow == zoijcleaowVar2;
        boolean z15 = z13 && eablkybsjgVar.f18317xrmfcynszj > 0.0f;
        boolean z16 = z14 && eablkybsjgVar.f18317xrmfcynszj > 0.0f;
        if (z13 && eablkybsjgVar.ikoacuggdj(0) && eablkybsjgVar.f18264iwizpuwonk == 0 && !z15) {
            iobyxmoadgVar.f26675iobyxmoadg = eablkybsjg.zoijcleaow.WRAP_CONTENT;
            if (z14 && eablkybsjgVar.f18238cqumvgiudr == 0) {
                iobyxmoadgVar.f26675iobyxmoadg = eablkybsjg.zoijcleaow.FIXED;
            }
            z13 = false;
        }
        if (z14 && eablkybsjgVar.ikoacuggdj(1) && eablkybsjgVar.f18238cqumvgiudr == 0 && !z16) {
            iobyxmoadgVar.f26680zoijcleaow = eablkybsjg.zoijcleaow.WRAP_CONTENT;
            if (z13 && eablkybsjgVar.f18264iwizpuwonk == 0) {
                iobyxmoadgVar.f26680zoijcleaow = eablkybsjg.zoijcleaow.FIXED;
            }
            z14 = false;
        }
        if (eablkybsjgVar.bfopjjpdmp()) {
            iobyxmoadgVar.f26675iobyxmoadg = eablkybsjg.zoijcleaow.FIXED;
            z13 = false;
        }
        if (eablkybsjgVar.opjhrmiecq()) {
            iobyxmoadgVar.f26680zoijcleaow = eablkybsjg.zoijcleaow.FIXED;
            z14 = false;
        }
        if (z15) {
            if (eablkybsjgVar.f18246esjtqupxsv[0] == 4) {
                iobyxmoadgVar.f26675iobyxmoadg = eablkybsjg.zoijcleaow.FIXED;
            } else if (!z14) {
                eablkybsjg.zoijcleaow zoijcleaowVar3 = iobyxmoadgVar.f26680zoijcleaow;
                eablkybsjg.zoijcleaow zoijcleaowVar4 = eablkybsjg.zoijcleaow.FIXED;
                if (zoijcleaowVar3 == zoijcleaowVar4) {
                    i16 = iobyxmoadgVar.f26679wkgbmnqykc;
                } else {
                    iobyxmoadgVar.f26675iobyxmoadg = eablkybsjg.zoijcleaow.WRAP_CONTENT;
                    interfaceC0476zoijcleaow.zoijcleaow(eablkybsjgVar, iobyxmoadgVar);
                    i16 = iobyxmoadgVar.f26674gxszxtbevo;
                }
                iobyxmoadgVar.f26675iobyxmoadg = zoijcleaowVar4;
                iobyxmoadgVar.f26678ppxfxbqfkf = (int) (eablkybsjgVar.cqumvgiudr() * i16);
            }
        }
        if (z16) {
            if (eablkybsjgVar.f18246esjtqupxsv[1] == 4) {
                iobyxmoadgVar.f26680zoijcleaow = eablkybsjg.zoijcleaow.FIXED;
            } else if (!z13) {
                eablkybsjg.zoijcleaow zoijcleaowVar5 = iobyxmoadgVar.f26675iobyxmoadg;
                eablkybsjg.zoijcleaow zoijcleaowVar6 = eablkybsjg.zoijcleaow.FIXED;
                if (zoijcleaowVar5 == zoijcleaowVar6) {
                    i15 = iobyxmoadgVar.f26678ppxfxbqfkf;
                } else {
                    iobyxmoadgVar.f26680zoijcleaow = eablkybsjg.zoijcleaow.WRAP_CONTENT;
                    interfaceC0476zoijcleaow.zoijcleaow(eablkybsjgVar, iobyxmoadgVar);
                    i15 = iobyxmoadgVar.f26673eablkybsjg;
                }
                iobyxmoadgVar.f26680zoijcleaow = zoijcleaowVar6;
                if (eablkybsjgVar.esjtqupxsv() == -1) {
                    iobyxmoadgVar.f26679wkgbmnqykc = (int) (i15 / eablkybsjgVar.cqumvgiudr());
                } else {
                    iobyxmoadgVar.f26679wkgbmnqykc = (int) (eablkybsjgVar.cqumvgiudr() * i15);
                }
            }
        }
        interfaceC0476zoijcleaow.zoijcleaow(eablkybsjgVar, iobyxmoadgVar);
        eablkybsjgVar.u(iobyxmoadgVar.f26673eablkybsjg);
        eablkybsjgVar.ezmngbhpjk(iobyxmoadgVar.f26674gxszxtbevo);
        eablkybsjgVar.fmlbqenlif(iobyxmoadgVar.f26677nufgyqmvbu);
        eablkybsjgVar.wizcaqwiak(iobyxmoadgVar.f26676lqeggnwhkg);
        iobyxmoadgVar.f26671btonecajqb = d1.zoijcleaow.iobyxmoadg.f26669gtknphoqwx;
        return iobyxmoadgVar.f26672dxjokdxxww;
    }

    private void f0() {
        this.f18346l = 0;
        this.f18347m = 0;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x0307 A[PHI: r2 r16
      0x0307: PHI (r2v15 ??) = (r2v14 ??), (r2v19 ??), (r2v19 ??), (r2v19 ??) binds: [B:138:0x02c8, B:146:0x02ed, B:147:0x02ef, B:149:0x02f5] A[DONT_GENERATE, DONT_INLINE]
      0x0307: PHI (r16v4 boolean) = (r16v3 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:138:0x02c8, B:146:0x02ed, B:147:0x02ef, B:149:0x02f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // c1.agtfadlqog
    public void C() {
        int i13;
        int i14;
        boolean z13;
        boolean zK0;
        boolean z14;
        ?? r13;
        ?? r14;
        ?? r15;
        boolean z15;
        int i15;
        eablkybsjg.zoijcleaow zoijcleaowVar;
        int i16 = 0;
        this.f18298rlfsiqarku = 0;
        this.f18240czzsidtyhn = 0;
        this.f18357w = false;
        this.f18358x = false;
        int size = this.f18227a.size();
        int iMax = Math.max(0, jlmebxxoox());
        int iMax2 = Math.max(0, lereixgezr());
        eablkybsjg.zoijcleaow[] zoijcleaowVarArr = this.f18268jhduphickx;
        eablkybsjg.zoijcleaow zoijcleaowVar2 = zoijcleaowVarArr[1];
        eablkybsjg.zoijcleaow zoijcleaowVar3 = zoijcleaowVarArr[0];
        if (this.f18338d == 0 && gtknphoqwx.zoijcleaow(this.f18355u, 1)) {
            d1.nufgyqmvbu.nufgyqmvbu(this, T());
            for (int i17 = 0; i17 < size; i17++) {
                eablkybsjg eablkybsjgVar = (eablkybsjg) this.f18227a.get(i17);
                if (eablkybsjgVar.oipsdeybqn() && !(eablkybsjgVar instanceof nufgyqmvbu) && !(eablkybsjgVar instanceof iobyxmoadg) && !(eablkybsjgVar instanceof wflxmlrfwp) && !eablkybsjgVar.zfvoamnweg()) {
                    eablkybsjg.zoijcleaow zoijcleaowVarIwizpuwonk = eablkybsjgVar.iwizpuwonk(0);
                    eablkybsjg.zoijcleaow zoijcleaowVarIwizpuwonk2 = eablkybsjgVar.iwizpuwonk(1);
                    eablkybsjg.zoijcleaow zoijcleaowVar4 = eablkybsjg.zoijcleaow.MATCH_CONSTRAINT;
                    if (zoijcleaowVarIwizpuwonk != zoijcleaowVar4 || eablkybsjgVar.f18264iwizpuwonk == 1 || zoijcleaowVarIwizpuwonk2 != zoijcleaowVar4 || eablkybsjgVar.f18238cqumvgiudr == 1) {
                        d0(0, eablkybsjgVar, this.f18339e, new d1.zoijcleaow.iobyxmoadg(), d1.zoijcleaow.iobyxmoadg.f26669gtknphoqwx);
                    }
                }
            }
        }
        if (size <= 2 || !((zoijcleaowVar3 == (zoijcleaowVar = eablkybsjg.zoijcleaow.WRAP_CONTENT) || zoijcleaowVar2 == zoijcleaowVar) && gtknphoqwx.zoijcleaow(this.f18355u, UserVerificationMethods.USER_VERIFY_ALL) && d1.dxjokdxxww.ppxfxbqfkf(this, T()))) {
            i13 = iMax2;
            i14 = iMax;
            z13 = false;
        } else {
            if (zoijcleaowVar3 == zoijcleaowVar) {
                if (iMax >= jlmebxxoox() || iMax <= 0) {
                    iMax = jlmebxxoox();
                } else {
                    u(iMax);
                    this.f18357w = true;
                }
            }
            if (zoijcleaowVar2 == zoijcleaowVar) {
                if (iMax2 >= lereixgezr() || iMax2 <= 0) {
                    iMax2 = lereixgezr();
                } else {
                    ezmngbhpjk(iMax2);
                    this.f18358x = true;
                }
            }
            i13 = iMax2;
            i14 = iMax;
            z13 = true;
        }
        boolean z16 = e0(64) || e0(UserVerificationMethods.USER_VERIFY_PATTERN);
        z0.wkgbmnqykc wkgbmnqykcVar = this.f18341g;
        wkgbmnqykcVar.f127491dxjokdxxww = false;
        wkgbmnqykcVar.f127489btonecajqb = false;
        if (this.f18355u != 0 && z16) {
            wkgbmnqykcVar.f127489btonecajqb = true;
        }
        ArrayList arrayList = this.f18227a;
        eablkybsjg.zoijcleaow zoijcleaowVarIstkbnxepw = istkbnxepw();
        eablkybsjg.zoijcleaow zoijcleaowVar5 = eablkybsjg.zoijcleaow.WRAP_CONTENT;
        boolean z17 = zoijcleaowVarIstkbnxepw == zoijcleaowVar5 || ulzqkzuiru() == zoijcleaowVar5;
        f0();
        for (int i18 = 0; i18 < size; i18++) {
            eablkybsjg eablkybsjgVar2 = (eablkybsjg) this.f18227a.get(i18);
            if (eablkybsjgVar2 instanceof agtfadlqog) {
                ((agtfadlqog) eablkybsjgVar2).C();
            }
        }
        boolean zE0 = e0(64);
        ?? r16 = z13;
        int i19 = 0;
        boolean zG = true;
        while (zG) {
            int i23 = i19 + 1;
            try {
                this.f18341g.yadqdtsiqt();
                f0();
                ojitshcjhn(this.f18341g);
                for (int i24 = i16; i24 < size; i24++) {
                    ((eablkybsjg) this.f18227a.get(i24)).ojitshcjhn(this.f18341g);
                }
                zG = G(this.f18341g);
                WeakReference weakReference = this.f18360z;
                if (weakReference != null && weakReference.get() != null) {
                    L((wkgbmnqykc) this.f18360z.get(), this.f18341g.vdvldrhtss(this.f18275kegysxyocb));
                    this.f18360z = null;
                }
                WeakReference weakReference2 = this.B;
                if (weakReference2 != null && weakReference2.get() != null) {
                    K((wkgbmnqykc) this.B.get(), this.f18341g.vdvldrhtss(this.f18281mbcevpiqjq));
                    this.B = null;
                }
                WeakReference weakReference3 = this.A;
                if (weakReference3 != null && weakReference3.get() != null) {
                    L((wkgbmnqykc) this.A.get(), this.f18341g.vdvldrhtss(this.f18303stevsuqkhv));
                    this.A = null;
                }
                WeakReference weakReference4 = this.C;
                if (weakReference4 != null && weakReference4.get() != null) {
                    K((wkgbmnqykc) this.C.get(), this.f18341g.vdvldrhtss(this.f18305tzroggbefp));
                    this.C = null;
                }
                if (zG) {
                    this.f18341g.pmvmpeiblj();
                }
            } catch (Exception e13) {
                e13.printStackTrace();
                System.out.println("EXCEPTION : " + e13);
            }
            if (zG) {
                zK0 = k0(this.f18341g, gtknphoqwx.f18335iobyxmoadg);
            } else {
                A(this.f18341g, zE0);
                for (int i25 = 0; i25 < size; i25++) {
                    ((eablkybsjg) this.f18227a.get(i25)).A(this.f18341g, zE0);
                }
                zK0 = false;
            }
            if (z17 && i23 < 8 && gtknphoqwx.f18335iobyxmoadg[2]) {
                int i26 = 0;
                int iMax3 = 0;
                int iMax4 = 0;
                while (i26 < size) {
                    eablkybsjg eablkybsjgVar3 = (eablkybsjg) this.f18227a.get(i26);
                    iMax4 = Math.max(iMax4, eablkybsjgVar3.f18298rlfsiqarku + eablkybsjgVar3.jlmebxxoox());
                    iMax3 = Math.max(iMax3, eablkybsjgVar3.f18240czzsidtyhn + eablkybsjgVar3.lereixgezr());
                    i26++;
                    zK0 = zK0;
                }
                z14 = zK0;
                int iMax5 = Math.max(this.f18287oipsdeybqn, iMax4);
                int iMax6 = Math.max(this.f18234bfopjjpdmp, iMax3);
                eablkybsjg.zoijcleaow zoijcleaowVar6 = eablkybsjg.zoijcleaow.WRAP_CONTENT;
                r16 = r16;
                if (zoijcleaowVar3 == zoijcleaowVar6 && jlmebxxoox() < iMax5) {
                    r16 = r16;
                    u(iMax5);
                    this.f18268jhduphickx[0] = zoijcleaowVar6;
                    r16 = 1;
                    z14 = true;
                }
                if (zoijcleaowVar2 == zoijcleaowVar6 && lereixgezr() < iMax6) {
                    ezmngbhpjk(iMax6);
                    this.f18268jhduphickx[1] = zoijcleaowVar6;
                    r16 = 1;
                    z14 = true;
                }
            } else {
                z14 = zK0;
            }
            int iMax7 = Math.max(this.f18287oipsdeybqn, jlmebxxoox());
            ?? r17 = r16;
            if (iMax7 > jlmebxxoox()) {
                u(iMax7);
                this.f18268jhduphickx[0] = eablkybsjg.zoijcleaow.FIXED;
                r17 = 1;
                z14 = true;
            }
            int iMax8 = Math.max(this.f18234bfopjjpdmp, lereixgezr());
            if (iMax8 > lereixgezr()) {
                ezmngbhpjk(iMax8);
                r13 = 1;
                this.f18268jhduphickx[1] = eablkybsjg.zoijcleaow.FIXED;
                r14 = 1;
                z14 = true;
            } else {
                r13 = 1;
                r14 = r17;
            }
            if (r14 == 0) {
                eablkybsjg.zoijcleaow zoijcleaowVar7 = this.f18268jhduphickx[0];
                eablkybsjg.zoijcleaow zoijcleaowVar8 = eablkybsjg.zoijcleaow.WRAP_CONTENT;
                if (zoijcleaowVar7 == zoijcleaowVar8 && i14 > 0) {
                    r14 = r14;
                    if (jlmebxxoox() > i14) {
                        this.f18357w = r13;
                        this.f18268jhduphickx[0] = eablkybsjg.zoijcleaow.FIXED;
                        u(i14);
                        ?? r18 = r13;
                        z14 = r18 == true ? 1 : 0;
                        r14 = r18;
                    }
                }
                r14 = r14;
                r14 = r14;
                if (this.f18268jhduphickx[r13] != zoijcleaowVar8 || i13 <= 0 || lereixgezr() <= i13) {
                    r15 = r14;
                    z15 = z14;
                    i15 = 8;
                } else {
                    this.f18358x = r13;
                    this.f18268jhduphickx[r13] = eablkybsjg.zoijcleaow.FIXED;
                    ezmngbhpjk(i13);
                    i15 = 8;
                    z15 = true;
                    r15 = 1;
                }
            } else {
                r15 = r14;
                z15 = z14;
                i15 = 8;
            }
            zG = i23 > i15 ? false : z15;
            i19 = i23;
            i16 = 0;
            r16 = r15;
        }
        this.f18227a = arrayList;
        if (r16 != 0) {
            eablkybsjg.zoijcleaow[] zoijcleaowVarArr2 = this.f18268jhduphickx;
            zoijcleaowVarArr2[0] = zoijcleaowVar3;
            zoijcleaowVarArr2[1] = zoijcleaowVar2;
        }
        auzgnhcxok(this.f18341g.iwizpuwonk());
    }

    void F(eablkybsjg eablkybsjgVar, int i13) {
        if (i13 == 0) {
            H(eablkybsjgVar);
        } else if (i13 == 1) {
            M(eablkybsjgVar);
        }
    }

    public boolean G(z0.wkgbmnqykc wkgbmnqykcVar) {
        boolean zE0 = e0(64);
        lqeggnwhkg(wkgbmnqykcVar, zE0);
        int size = this.f18227a.size();
        boolean z13 = false;
        for (int i13 = 0; i13 < size; i13++) {
            eablkybsjg eablkybsjgVar = (eablkybsjg) this.f18227a.get(i13);
            eablkybsjgVar.c(0, false);
            eablkybsjgVar.c(1, false);
            if (eablkybsjgVar instanceof iobyxmoadg) {
                z13 = true;
            }
        }
        if (z13) {
            for (int i14 = 0; i14 < size; i14++) {
                eablkybsjg eablkybsjgVar2 = (eablkybsjg) this.f18227a.get(i14);
                if (eablkybsjgVar2 instanceof iobyxmoadg) {
                    ((iobyxmoadg) eablkybsjgVar2).I();
                }
            }
        }
        this.D.clear();
        for (int i15 = 0; i15 < size; i15++) {
            eablkybsjg eablkybsjgVar3 = (eablkybsjg) this.f18227a.get(i15);
            if (eablkybsjgVar3.gxszxtbevo()) {
                if (eablkybsjgVar3 instanceof wflxmlrfwp) {
                    this.D.add(eablkybsjgVar3);
                } else {
                    eablkybsjgVar3.lqeggnwhkg(wkgbmnqykcVar, zE0);
                }
            }
        }
        while (this.D.size() > 0) {
            int size2 = this.D.size();
            Iterator it = this.D.iterator();
            while (it.hasNext()) {
                wflxmlrfwp wflxmlrfwpVar = (wflxmlrfwp) ((eablkybsjg) it.next());
                if (wflxmlrfwpVar.F(this.D)) {
                    wflxmlrfwpVar.lqeggnwhkg(wkgbmnqykcVar, zE0);
                    this.D.remove(wflxmlrfwpVar);
                    break;
                }
            }
            if (size2 == this.D.size()) {
                Iterator it2 = this.D.iterator();
                while (it2.hasNext()) {
                    ((eablkybsjg) it2.next()).lqeggnwhkg(wkgbmnqykcVar, zE0);
                }
                this.D.clear();
            }
        }
        if (z0.wkgbmnqykc.f127485kcexrzcfyt) {
            HashSet<eablkybsjg> hashSet = new HashSet();
            for (int i16 = 0; i16 < size; i16++) {
                eablkybsjg eablkybsjgVar4 = (eablkybsjg) this.f18227a.get(i16);
                if (!eablkybsjgVar4.gxszxtbevo()) {
                    hashSet.add(eablkybsjgVar4);
                }
            }
            eablkybsjg(this, wkgbmnqykcVar, hashSet, istkbnxepw() == eablkybsjg.zoijcleaow.WRAP_CONTENT ? 0 : 1, false);
            for (eablkybsjg eablkybsjgVar5 : hashSet) {
                gtknphoqwx.iobyxmoadg(this, wkgbmnqykcVar, eablkybsjgVar5);
                eablkybsjgVar5.lqeggnwhkg(wkgbmnqykcVar, zE0);
            }
        } else {
            for (int i17 = 0; i17 < size; i17++) {
                eablkybsjg eablkybsjgVar6 = (eablkybsjg) this.f18227a.get(i17);
                if (eablkybsjgVar6 instanceof gxszxtbevo) {
                    eablkybsjg.zoijcleaow[] zoijcleaowVarArr = eablkybsjgVar6.f18268jhduphickx;
                    eablkybsjg.zoijcleaow zoijcleaowVar = zoijcleaowVarArr[0];
                    eablkybsjg.zoijcleaow zoijcleaowVar2 = zoijcleaowVarArr[1];
                    eablkybsjg.zoijcleaow zoijcleaowVar3 = eablkybsjg.zoijcleaow.WRAP_CONTENT;
                    if (zoijcleaowVar == zoijcleaowVar3) {
                        eablkybsjgVar6.krqnebusok(eablkybsjg.zoijcleaow.FIXED);
                    }
                    if (zoijcleaowVar2 == zoijcleaowVar3) {
                        eablkybsjgVar6.q(eablkybsjg.zoijcleaow.FIXED);
                    }
                    eablkybsjgVar6.lqeggnwhkg(wkgbmnqykcVar, zE0);
                    if (zoijcleaowVar == zoijcleaowVar3) {
                        eablkybsjgVar6.krqnebusok(zoijcleaowVar);
                    }
                    if (zoijcleaowVar2 == zoijcleaowVar3) {
                        eablkybsjgVar6.q(zoijcleaowVar2);
                    }
                } else {
                    gtknphoqwx.iobyxmoadg(this, wkgbmnqykcVar, eablkybsjgVar6);
                    if (!eablkybsjgVar6.gxszxtbevo()) {
                        eablkybsjgVar6.lqeggnwhkg(wkgbmnqykcVar, zE0);
                    }
                }
            }
        }
        if (this.f18346l > 0) {
            zoijcleaow.zoijcleaow(this, wkgbmnqykcVar, null, 0);
        }
        if (this.f18347m > 0) {
            zoijcleaow.zoijcleaow(this, wkgbmnqykcVar, null, 1);
        }
        return true;
    }

    public void I(wkgbmnqykc wkgbmnqykcVar) {
        WeakReference weakReference = this.C;
        if (weakReference == null || weakReference.get() == null || wkgbmnqykcVar.eablkybsjg() > ((wkgbmnqykc) this.C.get()).eablkybsjg()) {
            this.C = new WeakReference(wkgbmnqykcVar);
        }
    }

    public void J(wkgbmnqykc wkgbmnqykcVar) {
        WeakReference weakReference = this.A;
        if (weakReference == null || weakReference.get() == null || wkgbmnqykcVar.eablkybsjg() > ((wkgbmnqykc) this.A.get()).eablkybsjg()) {
            this.A = new WeakReference(wkgbmnqykcVar);
        }
    }

    void N(wkgbmnqykc wkgbmnqykcVar) {
        WeakReference weakReference = this.B;
        if (weakReference == null || weakReference.get() == null || wkgbmnqykcVar.eablkybsjg() > ((wkgbmnqykc) this.B.get()).eablkybsjg()) {
            this.B = new WeakReference(wkgbmnqykcVar);
        }
    }

    void O(wkgbmnqykc wkgbmnqykcVar) {
        WeakReference weakReference = this.f18360z;
        if (weakReference == null || weakReference.get() == null || wkgbmnqykcVar.eablkybsjg() > ((wkgbmnqykc) this.f18360z.get()).eablkybsjg()) {
            this.f18360z = new WeakReference(wkgbmnqykcVar);
        }
    }

    public boolean P(boolean z13) {
        return this.f18337c.gxszxtbevo(z13);
    }

    public boolean Q(boolean z13) {
        return this.f18337c.lqeggnwhkg(z13);
    }

    public boolean R(boolean z13, int i13) {
        return this.f18337c.nufgyqmvbu(z13, i13);
    }

    public void S(z0.eablkybsjg eablkybsjgVar) {
        this.f18341g.jyumaefscl(eablkybsjgVar);
    }

    public d1.zoijcleaow.InterfaceC0476zoijcleaow T() {
        return this.f18339e;
    }

    public int U() {
        return this.f18355u;
    }

    public z0.wkgbmnqykc V() {
        return this.f18341g;
    }

    public boolean W() {
        return false;
    }

    public void X() {
        this.f18337c.btonecajqb();
    }

    public void Y() {
        this.f18337c.gtknphoqwx();
    }

    public boolean Z() {
        return this.f18358x;
    }

    public boolean a0() {
        return this.f18340f;
    }

    public boolean b0() {
        return this.f18357w;
    }

    public long c0(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23, int i24) {
        this.f18342h = i23;
        this.f18343i = i24;
        return this.f18336b.wkgbmnqykc(this, i13, i23, i24, i14, i15, i16, i17, i18, i19);
    }

    public boolean e0(int i13) {
        return (this.f18355u & i13) == i13;
    }

    public void g0(d1.zoijcleaow.InterfaceC0476zoijcleaow interfaceC0476zoijcleaow) {
        this.f18339e = interfaceC0476zoijcleaow;
        this.f18337c.agtfadlqog(interfaceC0476zoijcleaow);
    }

    public void h0(int i13) {
        this.f18355u = i13;
        z0.wkgbmnqykc.f127485kcexrzcfyt = e0(UserVerificationMethods.USER_VERIFY_NONE);
    }

    public void i0(int i13) {
        this.f18338d = i13;
    }

    public void j0(boolean z13) {
        this.f18340f = z13;
    }

    public boolean k0(z0.wkgbmnqykc wkgbmnqykcVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zE0 = e0(64);
        A(wkgbmnqykcVar, zE0);
        int size = this.f18227a.size();
        boolean z13 = false;
        for (int i13 = 0; i13 < size; i13++) {
            eablkybsjg eablkybsjgVar = (eablkybsjg) this.f18227a.get(i13);
            eablkybsjgVar.A(wkgbmnqykcVar, zE0);
            if (eablkybsjgVar.jztzpxfvev()) {
                z13 = true;
            }
        }
        return z13;
    }

    public void l0() {
        this.f18336b.eablkybsjg(this);
    }

    @Override // c1.agtfadlqog, c1.eablkybsjg
    public void nuxfzjnpeb() {
        this.f18341g.yadqdtsiqt();
        this.f18342h = 0;
        this.f18344j = 0;
        this.f18343i = 0;
        this.f18345k = 0;
        this.f18356v = false;
        super.nuxfzjnpeb();
    }

    @Override // c1.eablkybsjg
    public void stevsuqkhv(StringBuilder sb3) {
        sb3.append(this.f18288ojitshcjhn + ":{\n");
        sb3.append("  actualWidth:" + this.f18289okpsazkaxt);
        sb3.append("\n");
        sb3.append("  actualHeight:" + this.f18273jztzpxfvev);
        sb3.append("\n");
        Iterator it = B().iterator();
        while (it.hasNext()) {
            ((eablkybsjg) it.next()).stevsuqkhv(sb3);
            sb3.append(",\n");
        }
        sb3.append("}");
    }

    @Override // c1.eablkybsjg
    public void z(boolean z13, boolean z14) {
        super.z(z13, z14);
        int size = this.f18227a.size();
        for (int i13 = 0; i13 < size; i13++) {
            ((eablkybsjg) this.f18227a.get(i13)).z(z13, z14);
        }
    }
}
