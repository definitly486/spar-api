package igdgnonuha;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.nufgyqmvbu, z.yadqdtsiqt {

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    public static final int f42889ylkuphrtab = androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf.f7473wwaezpbzkn;

    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn I0(int i13, androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, int i14, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.cdpycssgdh(iobyxmoadgVar, kcexrzcfytVar, vg.iobyxmoadg.wkgbmnqykc((i13 - kcexrzcfytVar.eslsurpljm()) / 2.0f), vg.iobyxmoadg.wkgbmnqykc((i14 - kcexrzcfytVar.ipoelvxyzq()) / 2.0f), 0.0f, 4, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // z.yadqdtsiqt
    public x.istkbnxepw gxszxtbevo(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        boolean z13 = n0() && ((Boolean) z.dxjokdxxww.iobyxmoadg(this, w.wkgbmnqykc())).booleanValue();
        long j14 = w.f44025ppxfxbqfkf;
        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(j13);
        final int iMax = z13 ? Math.max(kcexrzcfytVarSflfametgt.eslsurpljm(), draadjrbmkVar.hszhottldk(w0.gtknphoqwx.nufgyqmvbu(j14))) : kcexrzcfytVarSflfametgt.eslsurpljm();
        final int iMax2 = z13 ? Math.max(kcexrzcfytVarSflfametgt.ipoelvxyzq(), draadjrbmkVar.hszhottldk(w0.gtknphoqwx.lqeggnwhkg(j14))) : kcexrzcfytVarSflfametgt.ipoelvxyzq();
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, iMax, iMax2, null, new tg.draadjrbmk() { // from class: igdgnonuha.e0
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return f0.I0(iMax, kcexrzcfytVarSflfametgt, iMax2, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }
}
