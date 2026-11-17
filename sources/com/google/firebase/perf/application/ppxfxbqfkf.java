package com.google.firebase.perf.application;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.Trace;
import hd.gxszxtbevo;
import java.util.WeakHashMap;
import ld.gtknphoqwx;
import md.btonecajqb;
import md.lqeggnwhkg;

/* JADX INFO: loaded from: classes2.dex */
public class ppxfxbqfkf extends FragmentManager.wflxmlrfwp {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final gd.iobyxmoadg f24545gxszxtbevo = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final wkgbmnqykc f24546eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final WeakHashMap f24547iobyxmoadg = new WeakHashMap();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final gtknphoqwx f24548ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final iobyxmoadg f24549wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final md.iobyxmoadg f24550zoijcleaow;

    public ppxfxbqfkf(md.iobyxmoadg iobyxmoadgVar, gtknphoqwx gtknphoqwxVar, iobyxmoadg iobyxmoadgVar2, wkgbmnqykc wkgbmnqykcVar) {
        this.f24550zoijcleaow = iobyxmoadgVar;
        this.f24548ppxfxbqfkf = gtknphoqwxVar;
        this.f24549wkgbmnqykc = iobyxmoadgVar2;
        this.f24546eablkybsjg = wkgbmnqykcVar;
    }

    @Override // androidx.fragment.app.FragmentManager.wflxmlrfwp
    public void dxjokdxxww(FragmentManager fragmentManager, Fragment fragment) {
        super.dxjokdxxww(fragmentManager, fragment);
        f24545gxszxtbevo.zoijcleaow("FragmentMonitor %s.onFragmentResumed", fragment.getClass().getSimpleName());
        Trace trace = new Trace(ojitshcjhn(fragment), this.f24548ppxfxbqfkf, this.f24550zoijcleaow, this.f24549wkgbmnqykc);
        trace.start();
        trace.putAttribute("Parent_fragment", fragment.getParentFragment() == null ? "No parent" : fragment.getParentFragment().getClass().getSimpleName());
        if (fragment.getActivity() != null) {
            trace.putAttribute("Hosting_activity", fragment.getActivity().getClass().getSimpleName());
        }
        this.f24547iobyxmoadg.put(fragment, trace);
        this.f24546eablkybsjg.wkgbmnqykc(fragment);
    }

    @Override // androidx.fragment.app.FragmentManager.wflxmlrfwp
    public void gxszxtbevo(FragmentManager fragmentManager, Fragment fragment) {
        super.gxszxtbevo(fragmentManager, fragment);
        gd.iobyxmoadg iobyxmoadgVar = f24545gxszxtbevo;
        iobyxmoadgVar.zoijcleaow("FragmentMonitor %s.onFragmentPaused ", fragment.getClass().getSimpleName());
        if (!this.f24547iobyxmoadg.containsKey(fragment)) {
            iobyxmoadgVar.gtknphoqwx("FragmentMonitor: missed a fragment trace from %s", fragment.getClass().getSimpleName());
            return;
        }
        Trace trace = (Trace) this.f24547iobyxmoadg.get(fragment);
        this.f24547iobyxmoadg.remove(fragment);
        lqeggnwhkg lqeggnwhkgVarGxszxtbevo = this.f24546eablkybsjg.gxszxtbevo(fragment);
        if (!lqeggnwhkgVarGxszxtbevo.wkgbmnqykc()) {
            iobyxmoadgVar.gtknphoqwx("onFragmentPaused: recorder failed to trace %s", fragment.getClass().getSimpleName());
        } else {
            btonecajqb.iobyxmoadg(trace, (gxszxtbevo.iobyxmoadg) lqeggnwhkgVarGxszxtbevo.ppxfxbqfkf());
            trace.stop();
        }
    }

    public String ojitshcjhn(Fragment fragment) {
        return "_st_" + fragment.getClass().getSimpleName();
    }
}
