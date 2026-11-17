package z;

/* JADX INFO: loaded from: classes.dex */
public abstract class hkdspvbjdz {
    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf zoijcleaow(btonecajqb btonecajqbVar) {
        int iIobyxmoadg = rlfsiqarku.iobyxmoadg(4);
        int iIobyxmoadg2 = rlfsiqarku.iobyxmoadg(2);
        androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf ppxfxbqfkfVarE0 = btonecajqbVar.wflxmlrfwp().e0();
        if (ppxfxbqfkfVarE0 == null || (ppxfxbqfkfVarE0.d0() & iIobyxmoadg) == 0) {
            return null;
        }
        while (ppxfxbqfkfVarE0 != null && (ppxfxbqfkfVarE0.i0() & iIobyxmoadg2) == 0) {
            if ((ppxfxbqfkfVarE0.i0() & iIobyxmoadg) != 0) {
                return ppxfxbqfkfVarE0;
            }
            ppxfxbqfkfVarE0 = ppxfxbqfkfVarE0.e0();
        }
        return null;
    }
}
