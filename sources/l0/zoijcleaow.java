package l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class zoijcleaow implements gxszxtbevo {
    public abstract int eablkybsjg(int i13);

    public abstract int gxszxtbevo(int i13);

    @Override // l0.gxszxtbevo
    public int iobyxmoadg(int i13) {
        int iEablkybsjg = eablkybsjg(i13);
        if (iEablkybsjg == -1 || eablkybsjg(iEablkybsjg) == -1) {
            return -1;
        }
        return iEablkybsjg;
    }

    @Override // l0.gxszxtbevo
    public int ppxfxbqfkf(int i13) {
        return eablkybsjg(i13);
    }

    @Override // l0.gxszxtbevo
    public int wkgbmnqykc(int i13) {
        int iGxszxtbevo = gxszxtbevo(i13);
        if (iGxszxtbevo == -1 || gxszxtbevo(iGxszxtbevo) == -1) {
            return -1;
        }
        return iGxszxtbevo;
    }

    @Override // l0.gxszxtbevo
    public int zoijcleaow(int i13) {
        return gxszxtbevo(i13);
    }
}
