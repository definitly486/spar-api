package androidx.compose.ui.platform;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
final class yfnezrywwk extends androidx.compose.ui.wkgbmnqykc.ppxfxbqfkf implements d0.iobyxmoadg {

    /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
    private ViewGroup f7139ylkuphrtab;

    public yfnezrywwk(ViewGroup viewGroup) {
        this.f7139ylkuphrtab = viewGroup;
    }

    public final void H0(ViewGroup viewGroup) {
        this.f7139ylkuphrtab = viewGroup;
    }

    @Override // d0.iobyxmoadg
    public Object rlfsiqarku(x.rgvfuqvkyq rgvfuqvkyqVar, tg.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        long jEablkybsjg = x.vdvldrhtss.eablkybsjg(rgvfuqvkyqVar);
        g.lqeggnwhkg lqeggnwhkgVar = (g.lqeggnwhkg) iobyxmoadgVar.invoke();
        g.lqeggnwhkg lqeggnwhkgVarOxmwwwfdhm = lqeggnwhkgVar != null ? lqeggnwhkgVar.oxmwwwfdhm(jEablkybsjg) : null;
        if (lqeggnwhkgVarOxmwwwfdhm != null) {
            this.f7139ylkuphrtab.requestRectangleOnScreen(h.yzdjzghtvl.iobyxmoadg(lqeggnwhkgVarOxmwwwfdhm), false);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}
