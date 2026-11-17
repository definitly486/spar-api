package sr0;

import ah.gtknphoqwx;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.gxszxtbevo;
import androidx.lifecycle.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import wg.wkgbmnqykc;

/* JADX INFO: loaded from: classes5.dex */
public final class ppxfxbqfkf implements wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final int f108438ppxfxbqfkf = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final draadjrbmk f108439iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private a6.iobyxmoadg f108440zoijcleaow;

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f108441yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f108442zdlpuopuiu;

        iobyxmoadg(Fragment fragment, zoijcleaow zoijcleaowVar) {
            this.f108442zdlpuopuiu = fragment;
            this.f108441yggfygwlhe = zoijcleaowVar;
        }

        @Override // androidx.lifecycle.gxszxtbevo
        public void lqeggnwhkg(vdvldrhtss owner) {
            zdlpuopuiu.btonecajqb(owner, "owner");
            this.f108442zdlpuopuiu.getParentFragmentManager().B(this.f108441yggfygwlhe, false);
        }

        @Override // androidx.lifecycle.gxszxtbevo
        public void onDestroy(vdvldrhtss owner) {
            zdlpuopuiu.btonecajqb(owner, "owner");
            this.f108442zdlpuopuiu.getParentFragmentManager().Y(this.f108441yggfygwlhe);
        }
    }

    public static final class zoijcleaow extends FragmentManager.wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Fragment f108443iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f108444zoijcleaow;

        zoijcleaow(Fragment fragment, ppxfxbqfkf ppxfxbqfkfVar) {
            this.f108443iobyxmoadg = fragment;
            this.f108444zoijcleaow = ppxfxbqfkfVar;
        }

        @Override // androidx.fragment.app.FragmentManager.wflxmlrfwp
        public void agtfadlqog(FragmentManager fm2, Fragment f13) {
            zdlpuopuiu.btonecajqb(fm2, "fm");
            zdlpuopuiu.btonecajqb(f13, "f");
            super.agtfadlqog(fm2, f13);
            if (f13 == this.f108443iobyxmoadg) {
                this.f108444zoijcleaow.f108440zoijcleaow = null;
            }
        }
    }

    public ppxfxbqfkf(Fragment fragment, draadjrbmk viewBindingFactory) {
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        zdlpuopuiu.btonecajqb(viewBindingFactory, "viewBindingFactory");
        this.f108439iobyxmoadg = viewBindingFactory;
        fragment.getLifecycle().iobyxmoadg(new iobyxmoadg(fragment, new zoijcleaow(fragment, this)));
    }

    @Override // wg.wkgbmnqykc
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public a6.iobyxmoadg iobyxmoadg(Fragment thisRef, gtknphoqwx property) {
        zdlpuopuiu.btonecajqb(thisRef, "thisRef");
        zdlpuopuiu.btonecajqb(property, "property");
        a6.iobyxmoadg iobyxmoadgVar = this.f108440zoijcleaow;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        if (!thisRef.getViewLifecycleOwner().getLifecycle().zoijcleaow().wkgbmnqykc(androidx.lifecycle.gtknphoqwx.zoijcleaow.INITIALIZED)) {
            throw new IllegalStateException("Should not attempt to get bindings when Fragment views are destroyed.");
        }
        draadjrbmk draadjrbmkVar = this.f108439iobyxmoadg;
        View viewRequireView = thisRef.requireView();
        zdlpuopuiu.dxjokdxxww(viewRequireView, "requireView(...)");
        a6.iobyxmoadg iobyxmoadgVar2 = (a6.iobyxmoadg) draadjrbmkVar.invoke(viewRequireView);
        this.f108440zoijcleaow = iobyxmoadgVar2;
        return iobyxmoadgVar2;
    }
}
