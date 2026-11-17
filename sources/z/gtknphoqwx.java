package z;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public abstract class gtknphoqwx {
    public static final x.rgvfuqvkyq agtfadlqog(btonecajqb btonecajqbVar) {
        if (!btonecajqbVar.wflxmlrfwp().n0()) {
            w.iobyxmoadg.zoijcleaow("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        x.rgvfuqvkyq rgvfuqvkyqVarPmvmpeiblj = gtknphoqwx(btonecajqbVar, rlfsiqarku.iobyxmoadg(2)).pmvmpeiblj();
        if (!rgvfuqvkyqVarPmvmpeiblj.gxszxtbevo()) {
            w.iobyxmoadg.zoijcleaow("LayoutCoordinates is not attached.");
        }
        return rgvfuqvkyqVarPmvmpeiblj;
    }

    public static final void btonecajqb(btonecajqb btonecajqbVar) {
        rgvfuqvkyq(btonecajqbVar).G();
    }

    public static final w0.wkgbmnqykc draadjrbmk(btonecajqb btonecajqbVar) {
        return rgvfuqvkyq(btonecajqbVar).kegysxyocb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf dxjokdxxww(ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar) {
        if (ppxfxbqfkfVar == null || ppxfxbqfkfVar.draadjrbmk() == 0) {
            return null;
        }
        return (androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf) ppxfxbqfkfVar.oxmwwwfdhm(ppxfxbqfkfVar.draadjrbmk() - 1);
    }

    public static final void eablkybsjg(btonecajqb btonecajqbVar, long j13) {
        vdvldrhtss(btonecajqbVar).agtfadlqog(j13);
    }

    public static final xrmfcynszj gtknphoqwx(btonecajqb btonecajqbVar, int i13) {
        xrmfcynszj xrmfcynszjVarF0 = btonecajqbVar.wflxmlrfwp().f0();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(xrmfcynszjVarF0);
        if (xrmfcynszjVarF0.V0() != btonecajqbVar || !czzsidtyhn.dxjokdxxww(i13)) {
            return xrmfcynszjVarF0;
        }
        xrmfcynszj xrmfcynszjVarW0 = xrmfcynszjVarF0.W0();
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(xrmfcynszjVarW0);
        return xrmfcynszjVarW0;
    }

    private static final ipoelvxyzq.ppxfxbqfkf gxszxtbevo(pkzmftpjix pkzmftpjixVar, boolean z13) {
        return z13 ? pkzmftpjixVar.hszhottldk() : pkzmftpjixVar.fiwbwshyhd();
    }

    public static final boolean lqeggnwhkg(btonecajqb btonecajqbVar, int i13) {
        return (btonecajqbVar.wflxmlrfwp().d0() & i13) != 0;
    }

    public static final boolean nufgyqmvbu(btonecajqb btonecajqbVar) {
        return btonecajqbVar.wflxmlrfwp() == btonecajqbVar;
    }

    public static final w0.zdlpuopuiu ojitshcjhn(btonecajqb btonecajqbVar) {
        return rgvfuqvkyq(btonecajqbVar).getLayoutDirection();
    }

    public static final g0.ojitshcjhn oxmwwwfdhm(btonecajqb btonecajqbVar) {
        return rgvfuqvkyq(btonecajqbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ppxfxbqfkf(ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar, androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar2, boolean z13) {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVarGxszxtbevo = gxszxtbevo(rgvfuqvkyq(ppxfxbqfkfVar2), z13);
        int iDraadjrbmk = ppxfxbqfkfVarGxszxtbevo.draadjrbmk() - 1;
        Object[] objArr = ppxfxbqfkfVarGxszxtbevo.f49169zdlpuopuiu;
        if (iDraadjrbmk < objArr.length) {
            while (iDraadjrbmk >= 0) {
                ppxfxbqfkfVar.zoijcleaow(((pkzmftpjix) objArr[iDraadjrbmk]).weqkydbzbr().gtknphoqwx());
                iDraadjrbmk--;
            }
        }
    }

    public static final pkzmftpjix rgvfuqvkyq(btonecajqb btonecajqbVar) {
        xrmfcynszj xrmfcynszjVarF0 = btonecajqbVar.wflxmlrfwp().f0();
        if (xrmfcynszjVarF0 != null) {
            return xrmfcynszjVarF0.S();
        }
        w.iobyxmoadg.ppxfxbqfkf("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new KotlinNothingValueException();
    }

    public static final opjhrmiecq vdvldrhtss(btonecajqb btonecajqbVar) {
        opjhrmiecq opjhrmiecqVarUawqvzlxes = rgvfuqvkyq(btonecajqbVar).uawqvzlxes();
        if (opjhrmiecqVarUawqvzlxes != null) {
            return opjhrmiecqVarUawqvzlxes;
        }
        w.iobyxmoadg.ppxfxbqfkf("This node does not have an owner.");
        throw new KotlinNothingValueException();
    }

    public static final h.auzgnhcxok wflxmlrfwp(btonecajqb btonecajqbVar) {
        return vdvldrhtss(btonecajqbVar).getGraphicsContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final yadqdtsiqt wkgbmnqykc(androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVar) {
        if ((rlfsiqarku.iobyxmoadg(2) & ppxfxbqfkfVar.i0()) != 0) {
            if (ppxfxbqfkfVar instanceof yadqdtsiqt) {
                return (yadqdtsiqt) ppxfxbqfkfVar;
            }
            if (ppxfxbqfkfVar instanceof wflxmlrfwp) {
                androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarI0 = ((wflxmlrfwp) ppxfxbqfkfVar).I0();
                while (ppxfxbqfkfVarI0 != 0) {
                    if (ppxfxbqfkfVarI0 instanceof yadqdtsiqt) {
                        return (yadqdtsiqt) ppxfxbqfkfVarI0;
                    }
                    ppxfxbqfkfVarI0 = (!(ppxfxbqfkfVarI0 instanceof wflxmlrfwp) || (rlfsiqarku.iobyxmoadg(2) & ppxfxbqfkfVarI0.i0()) == 0) ? ppxfxbqfkfVarI0.e0() : ((wflxmlrfwp) ppxfxbqfkfVarI0).I0();
                }
            }
        }
        return null;
    }
}
