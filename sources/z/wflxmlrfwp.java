package z;

/* JADX INFO: loaded from: classes.dex */
public abstract class wflxmlrfwp extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf {

    /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
    private androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf f127335pkzmftpjix;

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private final int f127336ylkuphrtab = czzsidtyhn.lqeggnwhkg(this);

    private final void L0(int i13, boolean z13) {
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarE0;
        int iI0 = i0();
        B0(i13);
        if (iI0 != i13) {
            if (gtknphoqwx.nufgyqmvbu(this)) {
                w0(i13);
            }
            if (n0()) {
                androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp = wflxmlrfwp();
                androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarK0 = this;
                while (ppxfxbqfkfVarK0 != null) {
                    i13 |= ppxfxbqfkfVarK0.i0();
                    ppxfxbqfkfVarK0.B0(i13);
                    if (ppxfxbqfkfVarK0 == ppxfxbqfkfVarWflxmlrfwp) {
                        break;
                    } else {
                        ppxfxbqfkfVarK0 = ppxfxbqfkfVarK0.k0();
                    }
                }
                if (z13 && ppxfxbqfkfVarK0 == ppxfxbqfkfVarWflxmlrfwp) {
                    i13 = czzsidtyhn.nufgyqmvbu(ppxfxbqfkfVarWflxmlrfwp);
                    ppxfxbqfkfVarWflxmlrfwp.B0(i13);
                }
                int iD0 = i13 | ((ppxfxbqfkfVarK0 == null || (ppxfxbqfkfVarE0 = ppxfxbqfkfVarK0.e0()) == null) ? 0 : ppxfxbqfkfVarE0.d0());
                while (ppxfxbqfkfVarK0 != null) {
                    iD0 |= ppxfxbqfkfVarK0.i0();
                    ppxfxbqfkfVarK0.w0(iD0);
                    ppxfxbqfkfVarK0 = ppxfxbqfkfVarK0.k0();
                }
            }
        }
    }

    private final void M0(int i13, androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
        int iI0 = i0();
        if ((i13 & rlfsiqarku.iobyxmoadg(2)) == 0 || (rlfsiqarku.iobyxmoadg(2) & iI0) == 0 || (this instanceof yadqdtsiqt)) {
            return;
        }
        w.iobyxmoadg.zoijcleaow("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + ppxfxbqfkfVar);
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void G0(xrmfcynszj xrmfcynszjVar) {
        super.G0(xrmfcynszjVar);
        for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
            ppxfxbqfkfVarI0.G0(xrmfcynszjVar);
        }
    }

    protected final btonecajqb H0(btonecajqb btonecajqbVar) {
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarWflxmlrfwp = btonecajqbVar.wflxmlrfwp();
        if (ppxfxbqfkfVarWflxmlrfwp != btonecajqbVar) {
            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar = btonecajqbVar instanceof androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ? (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) btonecajqbVar : null;
            androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarK0 = ppxfxbqfkfVar != null ? ppxfxbqfkfVar.k0() : null;
            if (ppxfxbqfkfVarWflxmlrfwp == wflxmlrfwp() && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarK0, this)) {
                return btonecajqbVar;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (ppxfxbqfkfVarWflxmlrfwp.n0()) {
            w.iobyxmoadg.zoijcleaow("Cannot delegate to an already attached node");
        }
        ppxfxbqfkfVarWflxmlrfwp.x0(wflxmlrfwp());
        int iI0 = i0();
        int iNufgyqmvbu = czzsidtyhn.nufgyqmvbu(ppxfxbqfkfVarWflxmlrfwp);
        ppxfxbqfkfVarWflxmlrfwp.B0(iNufgyqmvbu);
        M0(iNufgyqmvbu, ppxfxbqfkfVarWflxmlrfwp);
        ppxfxbqfkfVarWflxmlrfwp.y0(this.f127335pkzmftpjix);
        this.f127335pkzmftpjix = ppxfxbqfkfVarWflxmlrfwp;
        ppxfxbqfkfVarWflxmlrfwp.D0(this);
        L0(i0() | iNufgyqmvbu, false);
        if (n0()) {
            if ((iNufgyqmvbu & rlfsiqarku.iobyxmoadg(2)) == 0 || (iI0 & rlfsiqarku.iobyxmoadg(2)) != 0) {
                G0(f0());
            } else {
                okpsazkaxt okpsazkaxtVarWeqkydbzbr = gtknphoqwx.rgvfuqvkyq(this).weqkydbzbr();
                wflxmlrfwp().G0(null);
                okpsazkaxtVarWeqkydbzbr.istkbnxepw();
            }
            ppxfxbqfkfVarWflxmlrfwp.o0();
            ppxfxbqfkfVarWflxmlrfwp.u0();
            czzsidtyhn.iobyxmoadg(ppxfxbqfkfVarWflxmlrfwp);
        }
        return btonecajqbVar;
    }

    public final androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf I0() {
        return this.f127335pkzmftpjix;
    }

    public final int J0() {
        return this.f127336ylkuphrtab;
    }

    protected final void K0(btonecajqb btonecajqbVar) {
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar = null;
        for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarE0 = this.f127335pkzmftpjix; ppxfxbqfkfVarE0 != null; ppxfxbqfkfVarE0 = ppxfxbqfkfVarE0.e0()) {
            if (ppxfxbqfkfVarE0 == btonecajqbVar) {
                if (ppxfxbqfkfVarE0.n0()) {
                    czzsidtyhn.wkgbmnqykc(ppxfxbqfkfVarE0);
                    ppxfxbqfkfVarE0.v0();
                    ppxfxbqfkfVarE0.p0();
                }
                ppxfxbqfkfVarE0.x0(ppxfxbqfkfVarE0);
                ppxfxbqfkfVarE0.w0(0);
                if (ppxfxbqfkfVar == null) {
                    this.f127335pkzmftpjix = ppxfxbqfkfVarE0.e0();
                } else {
                    ppxfxbqfkfVar.y0(ppxfxbqfkfVarE0.e0());
                }
                ppxfxbqfkfVarE0.y0(null);
                ppxfxbqfkfVarE0.D0(null);
                int iI0 = i0();
                int iNufgyqmvbu = czzsidtyhn.nufgyqmvbu(this);
                L0(iNufgyqmvbu, true);
                if (n0() && (iI0 & rlfsiqarku.iobyxmoadg(2)) != 0 && (rlfsiqarku.iobyxmoadg(2) & iNufgyqmvbu) == 0) {
                    okpsazkaxt okpsazkaxtVarWeqkydbzbr = gtknphoqwx.rgvfuqvkyq(this).weqkydbzbr();
                    wflxmlrfwp().G0(null);
                    okpsazkaxtVarWeqkydbzbr.istkbnxepw();
                    return;
                }
                return;
            }
            ppxfxbqfkfVar = ppxfxbqfkfVarE0;
        }
        throw new IllegalStateException(("Could not find delegate: " + btonecajqbVar).toString());
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void o0() {
        super.o0();
        for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
            ppxfxbqfkfVarI0.G0(f0());
            if (!ppxfxbqfkfVarI0.n0()) {
                ppxfxbqfkfVarI0.o0();
            }
        }
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void p0() {
        for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
            ppxfxbqfkfVarI0.p0();
        }
        super.p0();
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void t0() {
        super.t0();
        for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
            ppxfxbqfkfVarI0.t0();
        }
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void u0() {
        for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
            ppxfxbqfkfVarI0.u0();
        }
        super.u0();
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void v0() {
        super.v0();
        for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
            ppxfxbqfkfVarI0.v0();
        }
    }

    @Override // androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf
    public void x0(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
        super.x0(ppxfxbqfkfVar);
        for (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = I0(); ppxfxbqfkfVarI0 != null; ppxfxbqfkfVarI0 = ppxfxbqfkfVarI0.e0()) {
            ppxfxbqfkfVarI0.x0(ppxfxbqfkfVar);
        }
    }
}
