package androidx.compose.foundation.layout;

/* JADX INFO: loaded from: classes.dex */
abstract class oxmwwwfdhm extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements z.yadqdtsiqt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final gg.wwaezpbzkn K0(androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVar, androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg iobyxmoadgVar) {
        androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg.wypolnanlu(iobyxmoadgVar, kcexrzcfytVar, w0.agtfadlqog.f118237zoijcleaow.zoijcleaow(), 0.0f, 2, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public abstract long I0(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13);

    public abstract boolean J0();

    @Override // z.yadqdtsiqt
    public final x.istkbnxepw gxszxtbevo(androidx.compose.ui.layout.draadjrbmk draadjrbmkVar, x.pmvmpeiblj pmvmpeibljVar, long j13) {
        long jI0 = I0(draadjrbmkVar, pmvmpeibljVar, j13);
        if (J0()) {
            jI0 = w0.ppxfxbqfkf.eablkybsjg(j13, jI0);
        }
        final androidx.compose.ui.layout.kcexrzcfyt kcexrzcfytVarSflfametgt = pmvmpeibljVar.sflfametgt(jI0);
        return androidx.compose.ui.layout.draadjrbmk.ntlheqmsrt(draadjrbmkVar, kcexrzcfytVarSflfametgt.eslsurpljm(), kcexrzcfytVarSflfametgt.ipoelvxyzq(), null, new tg.draadjrbmk() { // from class: androidx.compose.foundation.layout.vdvldrhtss
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return oxmwwwfdhm.K0(kcexrzcfytVarSflfametgt, (androidx.compose.ui.layout.kcexrzcfyt.iobyxmoadg) obj);
            }
        }, 4, null);
    }

    @Override // z.yadqdtsiqt
    public int lqeggnwhkg(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        return draadjrbmkVar.yggfygwlhe(i13);
    }

    @Override // z.yadqdtsiqt
    public int oxmwwwfdhm(x.wflxmlrfwp wflxmlrfwpVar, x.draadjrbmk draadjrbmkVar, int i13) {
        return draadjrbmkVar.wypolnanlu(i13);
    }
}
