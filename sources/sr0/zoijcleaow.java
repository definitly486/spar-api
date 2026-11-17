package sr0;

import ah.gtknphoqwx;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.gxszxtbevo;
import androidx.lifecycle.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import wg.wkgbmnqykc;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final draadjrbmk f108445iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private a6.iobyxmoadg f108446zoijcleaow;

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ C2663zoijcleaow f108447yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ DialogFragment f108448zdlpuopuiu;

        iobyxmoadg(DialogFragment dialogFragment, C2663zoijcleaow c2663zoijcleaow) {
            this.f108448zdlpuopuiu = dialogFragment;
            this.f108447yggfygwlhe = c2663zoijcleaow;
        }

        @Override // androidx.lifecycle.gxszxtbevo
        public void lqeggnwhkg(vdvldrhtss owner) {
            zdlpuopuiu.btonecajqb(owner, "owner");
            this.f108448zdlpuopuiu.getParentFragmentManager().B(this.f108447yggfygwlhe, false);
        }

        @Override // androidx.lifecycle.gxszxtbevo
        public void onDestroy(vdvldrhtss owner) {
            zdlpuopuiu.btonecajqb(owner, "owner");
            this.f108448zdlpuopuiu.getParentFragmentManager().Y(this.f108447yggfygwlhe);
        }
    }

    /* JADX INFO: renamed from: sr0.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C2663zoijcleaow extends FragmentManager.wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ DialogFragment f108449iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f108450zoijcleaow;

        C2663zoijcleaow(DialogFragment dialogFragment, zoijcleaow zoijcleaowVar) {
            this.f108449iobyxmoadg = dialogFragment;
            this.f108450zoijcleaow = zoijcleaowVar;
        }

        @Override // androidx.fragment.app.FragmentManager.wflxmlrfwp
        public void agtfadlqog(FragmentManager fm2, Fragment f13) {
            zdlpuopuiu.btonecajqb(fm2, "fm");
            zdlpuopuiu.btonecajqb(f13, "f");
            super.agtfadlqog(fm2, f13);
            if (f13 == this.f108449iobyxmoadg) {
                this.f108450zoijcleaow.f108446zoijcleaow = null;
            }
        }
    }

    public zoijcleaow(DialogFragment fragment, draadjrbmk viewBindingFactory) {
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        zdlpuopuiu.btonecajqb(viewBindingFactory, "viewBindingFactory");
        this.f108445iobyxmoadg = viewBindingFactory;
        fragment.getLifecycle().iobyxmoadg(new iobyxmoadg(fragment, new C2663zoijcleaow(fragment, this)));
    }

    @Override // wg.wkgbmnqykc
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public a6.iobyxmoadg iobyxmoadg(DialogFragment thisRef, gtknphoqwx property) {
        zdlpuopuiu.btonecajqb(thisRef, "thisRef");
        zdlpuopuiu.btonecajqb(property, "property");
        a6.iobyxmoadg iobyxmoadgVar = this.f108446zoijcleaow;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        androidx.lifecycle.gtknphoqwx lifecycle = thisRef.getLifecycle();
        zdlpuopuiu.dxjokdxxww(lifecycle, "<get-lifecycle>(...)");
        if (!lifecycle.zoijcleaow().wkgbmnqykc(androidx.lifecycle.gtknphoqwx.zoijcleaow.INITIALIZED)) {
            throw new IllegalStateException("Should not attempt to get bindings when DialogFragment views are destroyed.");
        }
        draadjrbmk draadjrbmkVar = this.f108445iobyxmoadg;
        LayoutInflater layoutInflater = thisRef.getLayoutInflater();
        zdlpuopuiu.dxjokdxxww(layoutInflater, "getLayoutInflater(...)");
        a6.iobyxmoadg iobyxmoadgVar2 = (a6.iobyxmoadg) draadjrbmkVar.invoke(layoutInflater);
        this.f108446zoijcleaow = iobyxmoadgVar2;
        return iobyxmoadgVar2;
    }
}
