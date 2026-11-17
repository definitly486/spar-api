package fe0;

import android.view.View;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.gxszxtbevo;
import androidx.lifecycle.vdvldrhtss;
import androidx.lifecycle.vipkmwdibw;
import com.google.android.material.tabs.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: fe0.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C0739iobyxmoadg implements gxszxtbevo {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        final /* synthetic */ wkgbmnqykc f33535zdlpuopuiu;

        C0739iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
            this.f33535zdlpuopuiu = wkgbmnqykcVar;
        }

        @Override // androidx.lifecycle.gxszxtbevo
        public void onDestroy(vdvldrhtss owner) {
            zdlpuopuiu.btonecajqb(owner, "owner");
            this.f33535zdlpuopuiu.zoijcleaow();
            super.onDestroy(owner);
        }
    }

    public static final void iobyxmoadg(wkgbmnqykc wkgbmnqykcVar, a6.iobyxmoadg binding) {
        gtknphoqwx lifecycle;
        zdlpuopuiu.btonecajqb(wkgbmnqykcVar, "<this>");
        zdlpuopuiu.btonecajqb(binding, "binding");
        if (!wkgbmnqykcVar.ppxfxbqfkf()) {
            wkgbmnqykcVar.iobyxmoadg();
        }
        View root = binding.getRoot();
        zdlpuopuiu.dxjokdxxww(root, "getRoot(...)");
        vdvldrhtss vdvldrhtssVarIobyxmoadg = vipkmwdibw.iobyxmoadg(root);
        if (vdvldrhtssVarIobyxmoadg == null || (lifecycle = vdvldrhtssVarIobyxmoadg.getLifecycle()) == null) {
            return;
        }
        lifecycle.iobyxmoadg(new C0739iobyxmoadg(wkgbmnqykcVar));
    }
}
