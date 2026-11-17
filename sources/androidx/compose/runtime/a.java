package androidx.compose.runtime;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends istkbnxepw {
    public a(tg.iobyxmoadg iobyxmoadgVar) {
        super(iobyxmoadgVar, null);
    }

    private final n1 gxszxtbevo(b bVar) {
        if (!bVar.dxjokdxxww()) {
            if (bVar.ppxfxbqfkf() != null) {
                return new cllcsxoeiz(bVar.ppxfxbqfkf());
            }
            return bVar.gxszxtbevo() != null ? new crxdokpmqz(bVar.gxszxtbevo()) : new k1(bVar.wkgbmnqykc());
        }
        iwxlajgraz iwxlajgrazVarGxszxtbevo = bVar.gxszxtbevo();
        if (iwxlajgrazVarGxszxtbevo == null) {
            Object objLqeggnwhkg = bVar.lqeggnwhkg();
            u0 u0VarEablkybsjg = bVar.eablkybsjg();
            if (u0VarEablkybsjg == null) {
                u0VarEablkybsjg = v0.rgvfuqvkyq();
            }
            iwxlajgrazVarGxszxtbevo = v0.lqeggnwhkg(objLqeggnwhkg, u0VarEablkybsjg);
        }
        return new crxdokpmqz(iwxlajgrazVarGxszxtbevo);
    }

    public final b eablkybsjg(Object obj) {
        return ppxfxbqfkf(obj).nufgyqmvbu();
    }

    public abstract b ppxfxbqfkf(Object obj);

    public final b wkgbmnqykc(Object obj) {
        return ppxfxbqfkf(obj);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[PHI: r5
      0x0034: PHI (r5v2 androidx.compose.runtime.n1) = (r5v5 androidx.compose.runtime.n1), (r5v6 androidx.compose.runtime.n1) binds: [B:17:0x0044, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.compose.runtime.istkbnxepw
    public n1 zoijcleaow(b bVar, n1 n1Var) {
        cllcsxoeiz cllcsxoeizVar;
        n1 n1Var2;
        k1 k1Var;
        crxdokpmqz crxdokpmqzVar;
        n1 n1Var3 = null;
        n1Var3 = null;
        n1Var3 = null;
        n1Var3 = null;
        n1Var3 = null;
        if (n1Var instanceof crxdokpmqz) {
            if (bVar.dxjokdxxww()) {
                crxdokpmqzVar = (crxdokpmqz) n1Var;
                crxdokpmqzVar.zoijcleaow().setValue(bVar.wkgbmnqykc());
            }
        } else if (n1Var instanceof k1) {
            if (bVar.btonecajqb()) {
                k1Var = (k1) n1Var;
                if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bVar.wkgbmnqykc(), k1Var.zoijcleaow())) {
                    n1Var2 = cllcsxoeizVar;
                    n1Var2 = k1Var;
                    n1Var3 = n1Var2;
                }
            }
        } else if (n1Var instanceof cllcsxoeiz) {
            cllcsxoeizVar = (cllcsxoeiz) n1Var;
            if (bVar.ppxfxbqfkf() == cllcsxoeizVar.zoijcleaow()) {
                n1Var2 = cllcsxoeizVar;
                n1Var2 = k1Var;
                n1Var3 = n1Var2;
            }
        }
        if (n1Var3 == null) {
            n1Var3 = crxdokpmqzVar;
            return gxszxtbevo(bVar);
        }
        n1Var3 = crxdokpmqzVar;
        return n1Var3;
    }
}
