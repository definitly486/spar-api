package ys;

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

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements wkgbmnqykc {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final draadjrbmk f126321iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private a6.iobyxmoadg f126322zoijcleaow;

    public static final class iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ C3221zoijcleaow f126323yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ DialogFragment f126324zdlpuopuiu;

        iobyxmoadg(DialogFragment dialogFragment, C3221zoijcleaow c3221zoijcleaow) {
            this.f126324zdlpuopuiu = dialogFragment;
            this.f126323yggfygwlhe = c3221zoijcleaow;
        }

        @Override // androidx.lifecycle.gxszxtbevo
        public void lqeggnwhkg(vdvldrhtss owner) {
            zdlpuopuiu.btonecajqb(owner, "owner");
            this.f126324zdlpuopuiu.getParentFragmentManager().B(this.f126323yggfygwlhe, false);
        }

        @Override // androidx.lifecycle.gxszxtbevo
        public void onDestroy(vdvldrhtss owner) {
            zdlpuopuiu.btonecajqb(owner, "owner");
            this.f126324zdlpuopuiu.getParentFragmentManager().Y(this.f126323yggfygwlhe);
        }
    }

    /* JADX INFO: renamed from: ys.zoijcleaow$zoijcleaow, reason: collision with other inner class name */
    public static final class C3221zoijcleaow extends FragmentManager.wflxmlrfwp {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final /* synthetic */ DialogFragment f126325iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f126326zoijcleaow;

        C3221zoijcleaow(DialogFragment dialogFragment, zoijcleaow zoijcleaowVar) {
            this.f126325iobyxmoadg = dialogFragment;
            this.f126326zoijcleaow = zoijcleaowVar;
        }

        @Override // androidx.fragment.app.FragmentManager.wflxmlrfwp
        public void agtfadlqog(FragmentManager fm2, Fragment f13) {
            zdlpuopuiu.btonecajqb(fm2, "fm");
            zdlpuopuiu.btonecajqb(f13, "f");
            super.agtfadlqog(fm2, f13);
            if (f13 == this.f126325iobyxmoadg) {
                this.f126326zoijcleaow.f126322zoijcleaow = null;
            }
        }
    }

    public zoijcleaow(DialogFragment fragment, draadjrbmk viewBindingFactory) {
        zdlpuopuiu.btonecajqb(fragment, "fragment");
        zdlpuopuiu.btonecajqb(viewBindingFactory, "viewBindingFactory");
        this.f126321iobyxmoadg = viewBindingFactory;
        fragment.getLifecycle().iobyxmoadg(new iobyxmoadg(fragment, new C3221zoijcleaow(fragment, this)));
    }

    @Override // wg.wkgbmnqykc
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public a6.iobyxmoadg iobyxmoadg(DialogFragment thisRef, gtknphoqwx property) {
        zdlpuopuiu.btonecajqb(thisRef, "thisRef");
        zdlpuopuiu.btonecajqb(property, "property");
        a6.iobyxmoadg iobyxmoadgVar = this.f126322zoijcleaow;
        if (iobyxmoadgVar != null) {
            return iobyxmoadgVar;
        }
        androidx.lifecycle.gtknphoqwx lifecycle = thisRef.getLifecycle();
        zdlpuopuiu.dxjokdxxww(lifecycle, "<get-lifecycle>(...)");
        if (!lifecycle.zoijcleaow().wkgbmnqykc(androidx.lifecycle.gtknphoqwx.zoijcleaow.INITIALIZED)) {
            throw new IllegalStateException("Should not attempt to get bindings when DialogFragment views are destroyed.");
        }
        draadjrbmk draadjrbmkVar = this.f126321iobyxmoadg;
        LayoutInflater layoutInflater = thisRef.getLayoutInflater();
        zdlpuopuiu.dxjokdxxww(layoutInflater, "getLayoutInflater(...)");
        a6.iobyxmoadg iobyxmoadgVar2 = (a6.iobyxmoadg) draadjrbmkVar.invoke(layoutInflater);
        this.f126322zoijcleaow = iobyxmoadgVar2;
        return iobyxmoadgVar2;
    }
}
