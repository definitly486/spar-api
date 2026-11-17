package androidx.compose.ui.layout;

import v1.skhdrjzrfn;
import x.dsvhmnatus;
import x.mbcevpiqjq;
import x.tzroggbefp;

/* JADX INFO: loaded from: classes.dex */
public abstract class wwaezpbzkn {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final androidx.collection.ojitshcjhn f6554iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final androidx.collection.iozdgvuglv f6555ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final iozdgvuglv[] f6556zoijcleaow;

    static {
        androidx.collection.iozdgvuglv iozdgvuglvVar = new androidx.collection.iozdgvuglv(8);
        int iNufgyqmvbu = skhdrjzrfn.draadjrbmk.nufgyqmvbu();
        iozdgvuglv.iobyxmoadg iobyxmoadgVar = iozdgvuglv.f6490iobyxmoadg;
        iozdgvuglvVar.oxmwwwfdhm(iNufgyqmvbu, iobyxmoadgVar.gxszxtbevo());
        iozdgvuglvVar.oxmwwwfdhm(skhdrjzrfn.draadjrbmk.lqeggnwhkg(), iobyxmoadgVar.eablkybsjg());
        iozdgvuglvVar.oxmwwwfdhm(skhdrjzrfn.draadjrbmk.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
        iozdgvuglvVar.oxmwwwfdhm(skhdrjzrfn.draadjrbmk.wkgbmnqykc(), iobyxmoadgVar.ppxfxbqfkf());
        iozdgvuglvVar.oxmwwwfdhm(skhdrjzrfn.draadjrbmk.btonecajqb(), iobyxmoadgVar.lqeggnwhkg());
        iozdgvuglvVar.oxmwwwfdhm(skhdrjzrfn.draadjrbmk.gxszxtbevo(), iobyxmoadgVar.wkgbmnqykc());
        iozdgvuglvVar.oxmwwwfdhm(skhdrjzrfn.draadjrbmk.gtknphoqwx(), iobyxmoadgVar.nufgyqmvbu());
        f6554iobyxmoadg = iozdgvuglvVar;
        f6556zoijcleaow = new iozdgvuglv[]{iobyxmoadgVar.gxszxtbevo(), iobyxmoadgVar.eablkybsjg(), iobyxmoadgVar.iobyxmoadg(), iobyxmoadgVar.nufgyqmvbu(), iobyxmoadgVar.lqeggnwhkg(), iobyxmoadgVar.wkgbmnqykc(), iobyxmoadgVar.ppxfxbqfkf(), iobyxmoadgVar.dxjokdxxww(), iobyxmoadgVar.zoijcleaow()};
        androidx.collection.iozdgvuglv iozdgvuglvVar2 = new androidx.collection.iozdgvuglv(7);
        iozdgvuglvVar2.oxmwwwfdhm(skhdrjzrfn.draadjrbmk.nufgyqmvbu(), iobyxmoadgVar.gxszxtbevo());
        iozdgvuglvVar2.oxmwwwfdhm(skhdrjzrfn.draadjrbmk.lqeggnwhkg(), iobyxmoadgVar.eablkybsjg());
        iozdgvuglvVar2.oxmwwwfdhm(skhdrjzrfn.draadjrbmk.zoijcleaow(), iobyxmoadgVar.iobyxmoadg());
        iozdgvuglvVar2.oxmwwwfdhm(skhdrjzrfn.draadjrbmk.btonecajqb(), iobyxmoadgVar.lqeggnwhkg());
        iozdgvuglvVar2.oxmwwwfdhm(skhdrjzrfn.draadjrbmk.gtknphoqwx(), iobyxmoadgVar.nufgyqmvbu());
        iozdgvuglvVar2.oxmwwwfdhm(skhdrjzrfn.draadjrbmk.gxszxtbevo(), iobyxmoadgVar.wkgbmnqykc());
        iozdgvuglvVar2.oxmwwwfdhm(skhdrjzrfn.draadjrbmk.wkgbmnqykc(), iobyxmoadgVar.ppxfxbqfkf());
        f6555ppxfxbqfkf = iozdgvuglvVar2;
    }

    public static final androidx.compose.ui.wkgbmnqykc eablkybsjg(androidx.compose.ui.wkgbmnqykc wkgbmnqykcVar, gxszxtbevo gxszxtbevoVar) {
        return wkgbmnqykcVar.eablkybsjg(new RulerProviderModifierElement(gxszxtbevoVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void gxszxtbevo(dsvhmnatus dsvhmnatusVar, yggfygwlhe yggfygwlheVar, long j13, int i13, int i14) {
        if (tzroggbefp.zoijcleaow(j13, mbcevpiqjq.iobyxmoadg())) {
            return;
        }
        dsvhmnatusVar.ixidwrxhsl(yggfygwlheVar.iobyxmoadg(), (int) ((j13 >>> 48) & 65535));
        dsvhmnatusVar.ixidwrxhsl(yggfygwlheVar.ppxfxbqfkf(), (int) ((j13 >>> 32) & 65535));
        dsvhmnatusVar.ixidwrxhsl(yggfygwlheVar.zoijcleaow(), i13 - ((int) ((j13 >>> 16) & 65535)));
        dsvhmnatusVar.ixidwrxhsl(yggfygwlheVar.wkgbmnqykc(), i14 - ((int) (j13 & 65535)));
    }
}
