package h5;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.jyumaefscl;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class draadjrbmk {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final draadjrbmk f39416iobyxmoadg = new draadjrbmk();

    static final class iobyxmoadg extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f39417zdlpuopuiu = new iobyxmoadg();

        iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final View invoke(View it) {
            zdlpuopuiu.btonecajqb(it, "it");
            Object parent = it.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class zoijcleaow extends jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f39418zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final androidx.navigation.wkgbmnqykc invoke(View it) {
            zdlpuopuiu.btonecajqb(it, "it");
            return draadjrbmk.f39416iobyxmoadg.wkgbmnqykc(it);
        }
    }

    private draadjrbmk() {
    }

    public static final void eablkybsjg(View view, androidx.navigation.wkgbmnqykc wkgbmnqykcVar) {
        zdlpuopuiu.btonecajqb(view, "view");
        view.setTag(ojitshcjhn.nav_controller_view_tag, wkgbmnqykcVar);
    }

    private final androidx.navigation.wkgbmnqykc ppxfxbqfkf(View view) {
        return (androidx.navigation.wkgbmnqykc) lj.wflxmlrfwp.lmojexxdyd(lj.wflxmlrfwp.stevsuqkhv(lj.wflxmlrfwp.agtfadlqog(view, iobyxmoadg.f39417zdlpuopuiu), zoijcleaow.f39418zdlpuopuiu));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.navigation.wkgbmnqykc wkgbmnqykc(View view) {
        Object tag = view.getTag(ojitshcjhn.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (androidx.navigation.wkgbmnqykc) ((WeakReference) tag).get();
        }
        if (tag instanceof androidx.navigation.wkgbmnqykc) {
            return (androidx.navigation.wkgbmnqykc) tag;
        }
        return null;
    }

    public static final androidx.navigation.wkgbmnqykc zoijcleaow(View view) {
        zdlpuopuiu.btonecajqb(view, "view");
        androidx.navigation.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = f39416iobyxmoadg.ppxfxbqfkf(view);
        if (wkgbmnqykcVarPpxfxbqfkf != null) {
            return wkgbmnqykcVarPpxfxbqfkf;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
