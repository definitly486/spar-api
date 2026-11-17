package androidx.navigation;

import android.os.Bundle;
import gg.wwaezpbzkn;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class agtfadlqog {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private h5.wflxmlrfwp f12056iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f12057zoijcleaow;

    public interface iobyxmoadg {
    }

    static final class ppxfxbqfkf extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ gtknphoqwx f12058yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        ppxfxbqfkf(gtknphoqwx gtknphoqwxVar, iobyxmoadg iobyxmoadgVar) {
            super(1);
            this.f12058yggfygwlhe = gtknphoqwxVar;
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final androidx.navigation.ppxfxbqfkf invoke(androidx.navigation.ppxfxbqfkf backStackEntry) {
            lqeggnwhkg lqeggnwhkgVarWkgbmnqykc;
            zdlpuopuiu.btonecajqb(backStackEntry, "backStackEntry");
            lqeggnwhkg lqeggnwhkgVarEablkybsjg = backStackEntry.eablkybsjg();
            if (lqeggnwhkgVarEablkybsjg == null) {
                lqeggnwhkgVarEablkybsjg = null;
            }
            if (lqeggnwhkgVarEablkybsjg != null && (lqeggnwhkgVarWkgbmnqykc = agtfadlqog.this.wkgbmnqykc(lqeggnwhkgVarEablkybsjg, backStackEntry.ppxfxbqfkf(), this.f12058yggfygwlhe, null)) != null) {
                return zdlpuopuiu.eablkybsjg(lqeggnwhkgVarWkgbmnqykc, lqeggnwhkgVarEablkybsjg) ? backStackEntry : agtfadlqog.this.zoijcleaow().iobyxmoadg(lqeggnwhkgVarWkgbmnqykc, lqeggnwhkgVarWkgbmnqykc.wkgbmnqykc(backStackEntry.ppxfxbqfkf()));
            }
            return null;
        }
    }

    static final class wkgbmnqykc extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final wkgbmnqykc f12060zdlpuopuiu = new wkgbmnqykc();

        wkgbmnqykc() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            iobyxmoadg((draadjrbmk) obj);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        public final void iobyxmoadg(draadjrbmk navOptions) {
            zdlpuopuiu.btonecajqb(navOptions, "$this$navOptions");
            navOptions.wkgbmnqykc(true);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface zoijcleaow {
        String value();
    }

    public void btonecajqb(androidx.navigation.ppxfxbqfkf popUpTo, boolean z13) {
        zdlpuopuiu.btonecajqb(popUpTo, "popUpTo");
        List list = (List) zoijcleaow().zoijcleaow().getValue();
        if (!list.contains(popUpTo)) {
            throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        androidx.navigation.ppxfxbqfkf ppxfxbqfkfVar = null;
        while (gtknphoqwx()) {
            ppxfxbqfkfVar = (androidx.navigation.ppxfxbqfkf) listIterator.previous();
            if (zdlpuopuiu.eablkybsjg(ppxfxbqfkfVar, popUpTo)) {
                break;
            }
        }
        if (ppxfxbqfkfVar != null) {
            zoijcleaow().nufgyqmvbu(ppxfxbqfkfVar, z13);
        }
    }

    public Bundle dxjokdxxww() {
        return null;
    }

    public void eablkybsjg(List entries, gtknphoqwx gtknphoqwxVar, iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(entries, "entries");
        Iterator it = lj.wflxmlrfwp.yadqdtsiqt(lj.wflxmlrfwp.dsvhmnatus(hg.jyumaefscl.ikoacuggdj(entries), new ppxfxbqfkf(gtknphoqwxVar, iobyxmoadgVar))).iterator();
        while (it.hasNext()) {
            zoijcleaow().gtknphoqwx((androidx.navigation.ppxfxbqfkf) it.next());
        }
    }

    public boolean gtknphoqwx() {
        return true;
    }

    public void gxszxtbevo(h5.wflxmlrfwp state) {
        zdlpuopuiu.btonecajqb(state, "state");
        this.f12056iobyxmoadg = state;
        this.f12057zoijcleaow = true;
    }

    public abstract lqeggnwhkg iobyxmoadg();

    public void lqeggnwhkg(androidx.navigation.ppxfxbqfkf backStackEntry) {
        zdlpuopuiu.btonecajqb(backStackEntry, "backStackEntry");
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = backStackEntry.eablkybsjg();
        if (lqeggnwhkgVarEablkybsjg == null) {
            lqeggnwhkgVarEablkybsjg = null;
        }
        if (lqeggnwhkgVarEablkybsjg == null) {
            return;
        }
        wkgbmnqykc(lqeggnwhkgVarEablkybsjg, null, h5.btonecajqb.iobyxmoadg(wkgbmnqykc.f12060zdlpuopuiu), null);
        zoijcleaow().gxszxtbevo(backStackEntry);
    }

    public void nufgyqmvbu(Bundle savedState) {
        zdlpuopuiu.btonecajqb(savedState, "savedState");
    }

    public final boolean ppxfxbqfkf() {
        return this.f12057zoijcleaow;
    }

    public lqeggnwhkg wkgbmnqykc(lqeggnwhkg destination, Bundle bundle, gtknphoqwx gtknphoqwxVar, iobyxmoadg iobyxmoadgVar) {
        zdlpuopuiu.btonecajqb(destination, "destination");
        return destination;
    }

    protected final h5.wflxmlrfwp zoijcleaow() {
        h5.wflxmlrfwp wflxmlrfwpVar = this.f12056iobyxmoadg;
        if (wflxmlrfwpVar != null) {
            return wflxmlrfwpVar;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }
}
