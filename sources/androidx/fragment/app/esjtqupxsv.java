package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class esjtqupxsv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final FragmentManager f9218iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final CopyOnWriteArrayList f9219zoijcleaow;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final FragmentManager.wflxmlrfwp f9220iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f9221zoijcleaow;

        public iobyxmoadg(FragmentManager.wflxmlrfwp callback, boolean z13) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(callback, "callback");
            this.f9220iobyxmoadg = callback;
            this.f9221zoijcleaow = z13;
        }

        public final FragmentManager.wflxmlrfwp iobyxmoadg() {
            return this.f9220iobyxmoadg;
        }

        public final boolean zoijcleaow() {
            return this.f9221zoijcleaow;
        }
    }

    public esjtqupxsv(FragmentManager fragmentManager) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(fragmentManager, "fragmentManager");
        this.f9218iobyxmoadg = fragmentManager;
        this.f9219zoijcleaow = new CopyOnWriteArrayList();
    }

    public final void agtfadlqog(Fragment f13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(f13, "f");
        Fragment fragmentFiwbwshyhd = this.f9218iobyxmoadg.fiwbwshyhd();
        if (fragmentFiwbwshyhd != null) {
            FragmentManager parentFragmentManager = fragmentFiwbwshyhd.getParentFragmentManager();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.hszhottldk().agtfadlqog(f13, true);
        }
        for (iobyxmoadg iobyxmoadgVar : this.f9219zoijcleaow) {
            if (!z13 || iobyxmoadgVar.zoijcleaow()) {
                iobyxmoadgVar.iobyxmoadg().agtfadlqog(this.f9218iobyxmoadg, f13);
            }
        }
    }

    public final void btonecajqb(Fragment f13, Bundle outState, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(f13, "f");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(outState, "outState");
        Fragment fragmentFiwbwshyhd = this.f9218iobyxmoadg.fiwbwshyhd();
        if (fragmentFiwbwshyhd != null) {
            FragmentManager parentFragmentManager = fragmentFiwbwshyhd.getParentFragmentManager();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.hszhottldk().btonecajqb(f13, outState, true);
        }
        for (iobyxmoadg iobyxmoadgVar : this.f9219zoijcleaow) {
            if (!z13 || iobyxmoadgVar.zoijcleaow()) {
                iobyxmoadgVar.iobyxmoadg().btonecajqb(this.f9218iobyxmoadg, f13, outState);
            }
        }
    }

    public final void draadjrbmk(Fragment f13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(f13, "f");
        Fragment fragmentFiwbwshyhd = this.f9218iobyxmoadg.fiwbwshyhd();
        if (fragmentFiwbwshyhd != null) {
            FragmentManager parentFragmentManager = fragmentFiwbwshyhd.getParentFragmentManager();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.hszhottldk().draadjrbmk(f13, true);
        }
        for (iobyxmoadg iobyxmoadgVar : this.f9219zoijcleaow) {
            if (!z13 || iobyxmoadgVar.zoijcleaow()) {
                iobyxmoadgVar.iobyxmoadg().draadjrbmk(this.f9218iobyxmoadg, f13);
            }
        }
    }

    public final void dxjokdxxww(Fragment f13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(f13, "f");
        Fragment fragmentFiwbwshyhd = this.f9218iobyxmoadg.fiwbwshyhd();
        if (fragmentFiwbwshyhd != null) {
            FragmentManager parentFragmentManager = fragmentFiwbwshyhd.getParentFragmentManager();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.hszhottldk().dxjokdxxww(f13, true);
        }
        for (iobyxmoadg iobyxmoadgVar : this.f9219zoijcleaow) {
            if (!z13 || iobyxmoadgVar.zoijcleaow()) {
                iobyxmoadgVar.iobyxmoadg().dxjokdxxww(this.f9218iobyxmoadg, f13);
            }
        }
    }

    public final void eablkybsjg(Fragment f13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(f13, "f");
        Fragment fragmentFiwbwshyhd = this.f9218iobyxmoadg.fiwbwshyhd();
        if (fragmentFiwbwshyhd != null) {
            FragmentManager parentFragmentManager = fragmentFiwbwshyhd.getParentFragmentManager();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.hszhottldk().eablkybsjg(f13, true);
        }
        for (iobyxmoadg iobyxmoadgVar : this.f9219zoijcleaow) {
            if (!z13 || iobyxmoadgVar.zoijcleaow()) {
                iobyxmoadgVar.iobyxmoadg().eablkybsjg(this.f9218iobyxmoadg, f13);
            }
        }
    }

    public final void gtknphoqwx(Fragment f13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(f13, "f");
        Fragment fragmentFiwbwshyhd = this.f9218iobyxmoadg.fiwbwshyhd();
        if (fragmentFiwbwshyhd != null) {
            FragmentManager parentFragmentManager = fragmentFiwbwshyhd.getParentFragmentManager();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.hszhottldk().gtknphoqwx(f13, true);
        }
        for (iobyxmoadg iobyxmoadgVar : this.f9219zoijcleaow) {
            if (!z13 || iobyxmoadgVar.zoijcleaow()) {
                iobyxmoadgVar.iobyxmoadg().gtknphoqwx(this.f9218iobyxmoadg, f13);
            }
        }
    }

    public final void gxszxtbevo(Fragment f13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(f13, "f");
        Fragment fragmentFiwbwshyhd = this.f9218iobyxmoadg.fiwbwshyhd();
        if (fragmentFiwbwshyhd != null) {
            FragmentManager parentFragmentManager = fragmentFiwbwshyhd.getParentFragmentManager();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.hszhottldk().gxszxtbevo(f13, true);
        }
        for (iobyxmoadg iobyxmoadgVar : this.f9219zoijcleaow) {
            if (!z13 || iobyxmoadgVar.zoijcleaow()) {
                iobyxmoadgVar.iobyxmoadg().gxszxtbevo(this.f9218iobyxmoadg, f13);
            }
        }
    }

    public final void iobyxmoadg(Fragment f13, Bundle bundle, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(f13, "f");
        Fragment fragmentFiwbwshyhd = this.f9218iobyxmoadg.fiwbwshyhd();
        if (fragmentFiwbwshyhd != null) {
            FragmentManager parentFragmentManager = fragmentFiwbwshyhd.getParentFragmentManager();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.hszhottldk().iobyxmoadg(f13, bundle, true);
        }
        for (iobyxmoadg iobyxmoadgVar : this.f9219zoijcleaow) {
            if (!z13 || iobyxmoadgVar.zoijcleaow()) {
                iobyxmoadgVar.iobyxmoadg().iobyxmoadg(this.f9218iobyxmoadg, f13, bundle);
            }
        }
    }

    public final void lqeggnwhkg(Fragment f13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(f13, "f");
        Context contextGxszxtbevo = this.f9218iobyxmoadg.lxfrhoxuzk().gxszxtbevo();
        Fragment fragmentFiwbwshyhd = this.f9218iobyxmoadg.fiwbwshyhd();
        if (fragmentFiwbwshyhd != null) {
            FragmentManager parentFragmentManager = fragmentFiwbwshyhd.getParentFragmentManager();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.hszhottldk().lqeggnwhkg(f13, true);
        }
        for (iobyxmoadg iobyxmoadgVar : this.f9219zoijcleaow) {
            if (!z13 || iobyxmoadgVar.zoijcleaow()) {
                iobyxmoadgVar.iobyxmoadg().lqeggnwhkg(this.f9218iobyxmoadg, f13, contextGxszxtbevo);
            }
        }
    }

    public final void nufgyqmvbu(Fragment f13, Bundle bundle, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(f13, "f");
        Fragment fragmentFiwbwshyhd = this.f9218iobyxmoadg.fiwbwshyhd();
        if (fragmentFiwbwshyhd != null) {
            FragmentManager parentFragmentManager = fragmentFiwbwshyhd.getParentFragmentManager();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.hszhottldk().nufgyqmvbu(f13, bundle, true);
        }
        for (iobyxmoadg iobyxmoadgVar : this.f9219zoijcleaow) {
            if (!z13 || iobyxmoadgVar.zoijcleaow()) {
                iobyxmoadgVar.iobyxmoadg().nufgyqmvbu(this.f9218iobyxmoadg, f13, bundle);
            }
        }
    }

    public final void ojitshcjhn(FragmentManager.wflxmlrfwp cb3, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cb3, "cb");
        this.f9219zoijcleaow.add(new iobyxmoadg(cb3, z13));
    }

    public final void ppxfxbqfkf(Fragment f13, Bundle bundle, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(f13, "f");
        Fragment fragmentFiwbwshyhd = this.f9218iobyxmoadg.fiwbwshyhd();
        if (fragmentFiwbwshyhd != null) {
            FragmentManager parentFragmentManager = fragmentFiwbwshyhd.getParentFragmentManager();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.hszhottldk().ppxfxbqfkf(f13, bundle, true);
        }
        for (iobyxmoadg iobyxmoadgVar : this.f9219zoijcleaow) {
            if (!z13 || iobyxmoadgVar.zoijcleaow()) {
                iobyxmoadgVar.iobyxmoadg().ppxfxbqfkf(this.f9218iobyxmoadg, f13, bundle);
            }
        }
    }

    public final void rgvfuqvkyq(FragmentManager.wflxmlrfwp cb3) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cb3, "cb");
        synchronized (this.f9219zoijcleaow) {
            try {
                int size = this.f9219zoijcleaow.size();
                for (int i13 = 0; i13 < size; i13++) {
                    if (((iobyxmoadg) this.f9219zoijcleaow.get(i13)).iobyxmoadg() == cb3) {
                        this.f9219zoijcleaow.remove(i13);
                        break;
                    }
                }
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void wflxmlrfwp(Fragment f13, View v13, Bundle bundle, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(f13, "f");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(v13, "v");
        Fragment fragmentFiwbwshyhd = this.f9218iobyxmoadg.fiwbwshyhd();
        if (fragmentFiwbwshyhd != null) {
            FragmentManager parentFragmentManager = fragmentFiwbwshyhd.getParentFragmentManager();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.hszhottldk().wflxmlrfwp(f13, v13, bundle, true);
        }
        for (iobyxmoadg iobyxmoadgVar : this.f9219zoijcleaow) {
            if (!z13 || iobyxmoadgVar.zoijcleaow()) {
                iobyxmoadgVar.iobyxmoadg().wflxmlrfwp(this.f9218iobyxmoadg, f13, v13, bundle);
            }
        }
    }

    public final void wkgbmnqykc(Fragment f13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(f13, "f");
        Fragment fragmentFiwbwshyhd = this.f9218iobyxmoadg.fiwbwshyhd();
        if (fragmentFiwbwshyhd != null) {
            FragmentManager parentFragmentManager = fragmentFiwbwshyhd.getParentFragmentManager();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.hszhottldk().wkgbmnqykc(f13, true);
        }
        for (iobyxmoadg iobyxmoadgVar : this.f9219zoijcleaow) {
            if (!z13 || iobyxmoadgVar.zoijcleaow()) {
                iobyxmoadgVar.iobyxmoadg().wkgbmnqykc(this.f9218iobyxmoadg, f13);
            }
        }
    }

    public final void zoijcleaow(Fragment f13, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(f13, "f");
        Context contextGxszxtbevo = this.f9218iobyxmoadg.lxfrhoxuzk().gxszxtbevo();
        Fragment fragmentFiwbwshyhd = this.f9218iobyxmoadg.fiwbwshyhd();
        if (fragmentFiwbwshyhd != null) {
            FragmentManager parentFragmentManager = fragmentFiwbwshyhd.getParentFragmentManager();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(parentFragmentManager, "parent.getParentFragmentManager()");
            parentFragmentManager.hszhottldk().zoijcleaow(f13, true);
        }
        for (iobyxmoadg iobyxmoadgVar : this.f9219zoijcleaow) {
            if (!z13 || iobyxmoadgVar.zoijcleaow()) {
                iobyxmoadgVar.iobyxmoadg().zoijcleaow(this.f9218iobyxmoadg, f13, contextGxszxtbevo);
            }
        }
    }
}
