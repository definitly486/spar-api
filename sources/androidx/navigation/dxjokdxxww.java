package androidx.navigation;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.hkdspvbjdz;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
@agtfadlqog.zoijcleaow("navigation")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/navigation/dxjokdxxww;", "Landroidx/navigation/agtfadlqog;", "Landroidx/navigation/nufgyqmvbu;", "Landroidx/navigation/ojitshcjhn;", "navigatorProvider", "<init>", "(Landroidx/navigation/ojitshcjhn;)V", "Landroidx/navigation/ppxfxbqfkf;", "entry", "Landroidx/navigation/gtknphoqwx;", "navOptions", "Landroidx/navigation/agtfadlqog$iobyxmoadg;", "navigatorExtras", "Lgg/wwaezpbzkn;", "wflxmlrfwp", "(Landroidx/navigation/ppxfxbqfkf;Landroidx/navigation/gtknphoqwx;Landroidx/navigation/agtfadlqog$iobyxmoadg;)V", "draadjrbmk", "()Landroidx/navigation/nufgyqmvbu;", "", "entries", "eablkybsjg", "(Ljava/util/List;Landroidx/navigation/gtknphoqwx;Landroidx/navigation/agtfadlqog$iobyxmoadg;)V", "ppxfxbqfkf", "Landroidx/navigation/ojitshcjhn;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class dxjokdxxww extends agtfadlqog {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata */
    private final ojitshcjhn navigatorProvider;

    static final class iobyxmoadg extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ hkdspvbjdz f12075zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(hkdspvbjdz hkdspvbjdzVar) {
            super(1);
            this.f12075zdlpuopuiu = hkdspvbjdzVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            zdlpuopuiu.btonecajqb(key, "key");
            Object obj = this.f12075zdlpuopuiu.f60015zdlpuopuiu;
            boolean z13 = true;
            if (obj != null && ((Bundle) obj).containsKey(key)) {
                z13 = false;
            }
            return Boolean.valueOf(z13);
        }
    }

    public dxjokdxxww(ojitshcjhn navigatorProvider) {
        zdlpuopuiu.btonecajqb(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    private final void wflxmlrfwp(ppxfxbqfkf entry, gtknphoqwx navOptions, agtfadlqog.iobyxmoadg navigatorExtras) {
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = entry.eablkybsjg();
        zdlpuopuiu.nufgyqmvbu(lqeggnwhkgVarEablkybsjg, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        nufgyqmvbu nufgyqmvbuVar = (nufgyqmvbu) lqeggnwhkgVarEablkybsjg;
        hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
        hkdspvbjdzVar.f60015zdlpuopuiu = entry.ppxfxbqfkf();
        int iWwaezpbzkn = nufgyqmvbuVar.wwaezpbzkn();
        String strYlkuphrtab = nufgyqmvbuVar.ylkuphrtab();
        if (iWwaezpbzkn == 0 && strYlkuphrtab == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + nufgyqmvbuVar.btonecajqb()).toString());
        }
        lqeggnwhkg lqeggnwhkgVarIstkbnxepw = strYlkuphrtab != null ? nufgyqmvbuVar.istkbnxepw(strYlkuphrtab, false) : (lqeggnwhkg) nufgyqmvbuVar.iozdgvuglv().eablkybsjg(iWwaezpbzkn);
        if (lqeggnwhkgVarIstkbnxepw == null) {
            throw new IllegalArgumentException("navigation destination " + nufgyqmvbuVar.lmojexxdyd() + " is not a direct child of this NavGraph");
        }
        if (strYlkuphrtab != null) {
            if (!zdlpuopuiu.eablkybsjg(strYlkuphrtab, lqeggnwhkgVarIstkbnxepw.agtfadlqog())) {
                lqeggnwhkg.zoijcleaow zoijcleaowVarOxmwwwfdhm = lqeggnwhkgVarIstkbnxepw.oxmwwwfdhm(strYlkuphrtab);
                Bundle bundlePpxfxbqfkf = zoijcleaowVarOxmwwwfdhm != null ? zoijcleaowVarOxmwwwfdhm.ppxfxbqfkf() : null;
                if (bundlePpxfxbqfkf != null && !bundlePpxfxbqfkf.isEmpty()) {
                    Bundle bundle = new Bundle();
                    bundle.putAll(bundlePpxfxbqfkf);
                    Object obj = hkdspvbjdzVar.f60015zdlpuopuiu;
                    if (((Bundle) obj) != null) {
                        bundle.putAll((Bundle) obj);
                    }
                    hkdspvbjdzVar.f60015zdlpuopuiu = bundle;
                }
            }
            if (!lqeggnwhkgVarIstkbnxepw.dxjokdxxww().isEmpty()) {
                List listIobyxmoadg = h5.eablkybsjg.iobyxmoadg(lqeggnwhkgVarIstkbnxepw.dxjokdxxww(), new iobyxmoadg(hkdspvbjdzVar));
                if (!listIobyxmoadg.isEmpty()) {
                    throw new IllegalArgumentException(("Cannot navigate to startDestination " + lqeggnwhkgVarIstkbnxepw + ". Missing required arguments [" + listIobyxmoadg + ']').toString());
                }
            }
        }
        this.navigatorProvider.wkgbmnqykc(lqeggnwhkgVarIstkbnxepw.draadjrbmk()).eablkybsjg(hg.jyumaefscl.eablkybsjg(zoijcleaow().iobyxmoadg(lqeggnwhkgVarIstkbnxepw, lqeggnwhkgVarIstkbnxepw.wkgbmnqykc((Bundle) hkdspvbjdzVar.f60015zdlpuopuiu))), navOptions, navigatorExtras);
    }

    @Override // androidx.navigation.agtfadlqog
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public nufgyqmvbu iobyxmoadg() {
        return new nufgyqmvbu(this);
    }

    @Override // androidx.navigation.agtfadlqog
    public void eablkybsjg(List entries, gtknphoqwx navOptions, agtfadlqog.iobyxmoadg navigatorExtras) {
        zdlpuopuiu.btonecajqb(entries, "entries");
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            wflxmlrfwp((ppxfxbqfkf) it.next(), navOptions, navigatorExtras);
        }
    }
}
