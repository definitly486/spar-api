package ys;

import ah.gtknphoqwx;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.gxszxtbevo;
import androidx.lifecycle.vdvldrhtss;
import kotlin.jvm.internal.zdlpuopuiu;
import tg.draadjrbmk;
import wg.wkgbmnqykc;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf implements wkgbmnqykc {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final int f126314ppxfxbqfkf = 8;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final draadjrbmk f126315iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private a6.iobyxmoadg f126316zoijcleaow;

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f126317yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ Fragment f126318zdlpuopuiu;

        iobyxmoadg(Fragment fragment, zoijcleaow zoijcleaowVar) {
            this.f126318zdlpuopuiu = fragment;
            this.f126317yggfygwlhe = zoijcleaowVar;
        }

        @Override // androidx.lifecycle.gxszxtbevo
        public void lqeggnwhkg(vdvldrhtss owner) {
            zdlpuopuiu.btonecajqb(owner, "owner");
            this.f126318zdlpuopuiu.getParentFragmentManager().B(this.f126317yggfygwlhe, false);
        }

        @Override // androidx.lifecycle.gxszxtbevo
        public void onDestroy(vdvldrhtss owner) {
            zdlpuopuiu.btonecajqb(owner, "owner");
            this.f126318zdlpuopuiu.getParentFragmentManager().Y(this.f126317yggfygwlhe);
        }
    }

    public static final class zoijcleaow extends FragmentManager.wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ Fragment f126319iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ ppxfxbqfkf f126320zoijcleaow;

        zoijcleaow(Fragment fragment, ppxfxbqfkf ppxfxbqfkfVar) {
            this.f126319iobyxmoadg = fragment;
            this.f126320zoijcleaow = ppxfxbqfkfVar;
        }

        @Override // androidx.fragment.app.FragmentManager.wflxmlrfwp
        public void agtfadlqog(FragmentManager fm2, Fragment f13) {
            zdlpuopuiu.btonecajqb(fm2, "fm");
            zdlpuopuiu.btonecajqb(f13, "f");
            super.agtfadlqog(fm2, f13);
            if (f13 == this.f126319iobyxmoadg) {
                this.f126320zoijcleaow.f126316zoijcleaow = null;
            }
        }
    }

    public ppxfxbqfkf(Fragment fragment, draadjrbmk viewBindingFactory) {
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        zdlpuopuiu.btonecajqb(viewBindingFactory, "viewBindingFactory");
        this.f126315iobyxmoadg = viewBindingFactory;
        fragment.getLifecycle().iobyxmoadg(new iobyxmoadg(fragment, new zoijcleaow(fragment, this)));
    }

    @Override // wg.wkgbmnqykc
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public a6.iobyxmoadg iobyxmoadg(Fragment thisRef, gtknphoqwx property) {
        zdlpuopuiu.btonecajqb(thisRef, "thisRef");
        zdlpuopuiu.btonecajqb(property, "property");
        a6.iobyxmoadg iobyxmoadgVar = this.f126316zoijcleaow;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        if (!thisRef.getViewLifecycleOwner().getLifecycle().zoijcleaow().wkgbmnqykc(androidx.lifecycle.gtknphoqwx.zoijcleaow.INITIALIZED)) {
            throw new IllegalStateException("Should not attempt to get bindings when Fragment views are destroyed.");
        }
        draadjrbmk draadjrbmkVar = this.f126315iobyxmoadg;
        View viewRequireView = thisRef.requireView();
        zdlpuopuiu.dxjokdxxww(viewRequireView, "requireView(...)");
        a6.iobyxmoadg iobyxmoadgVar2 = (a6.iobyxmoadg) draadjrbmkVar.invoke(viewRequireView);
        this.f126316zoijcleaow = iobyxmoadgVar2;
        return iobyxmoadgVar2;
    }
}
