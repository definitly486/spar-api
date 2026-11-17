package t6;

import bz.q2;
import bz.u4;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class hcddaimhww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ikoacuggdj f109815iobyxmoadg;

    class iobyxmoadg implements kc2.nufgyqmvbu {
        iobyxmoadg() {
        }

        @Override // kc2.nufgyqmvbu
        public Collection zoijcleaow() {
            return Collections.unmodifiableCollection(hcddaimhww.this.f109815iobyxmoadg.zoijcleaow());
        }
    }

    public hcddaimhww(ikoacuggdj ikoacuggdjVar) {
        this.f109815iobyxmoadg = ikoacuggdjVar;
    }

    private static String iobyxmoadg(Object obj, Object obj2) {
        return String.format(Locale.ROOT, "%s:%s", obj, obj2);
    }

    public void eablkybsjg(kc2.lqeggnwhkg lqeggnwhkgVar, bz.n0 n0Var) {
        int i13;
        kc2.nufgyqmvbu.zoijcleaow zoijcleaowVar = kc2.nufgyqmvbu.zoijcleaow.Info;
        if ((n0Var instanceof q2) || (n0Var instanceof u4)) {
            zoijcleaowVar = kc2.nufgyqmvbu.zoijcleaow.Warning;
            i13 = 3;
        } else {
            i13 = 2;
        }
        this.f109815iobyxmoadg.ppxfxbqfkf(zoijcleaowVar, iobyxmoadg(lqeggnwhkgVar, n0Var.getMessage()), i13);
    }

    public void gxszxtbevo(kc2.lqeggnwhkg lqeggnwhkgVar, kc2.nufgyqmvbu.zoijcleaow zoijcleaowVar, String str, int i13) {
        this.f109815iobyxmoadg.ppxfxbqfkf(zoijcleaowVar, iobyxmoadg(lqeggnwhkgVar, str), i13);
    }

    public void wkgbmnqykc(String str) {
        this.f109815iobyxmoadg.ppxfxbqfkf(kc2.nufgyqmvbu.zoijcleaow.Info, str, 0);
    }

    public kc2.nufgyqmvbu zoijcleaow() {
        return new iobyxmoadg();
    }
}
