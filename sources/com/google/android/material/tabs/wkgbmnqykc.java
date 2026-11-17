package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private RecyclerView.btonecajqb f23180btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private TabLayout.ppxfxbqfkf f23181dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zoijcleaow f23182eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private RecyclerView.nufgyqmvbu f23183gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TabLayout f23184iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f23185lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private ppxfxbqfkf f23186nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f23187ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final boolean f23188wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ViewPager2 f23189zoijcleaow;

    private class iobyxmoadg extends RecyclerView.btonecajqb {
        iobyxmoadg() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.btonecajqb
        public void eablkybsjg(int i13, int i14) {
            wkgbmnqykc.this.wkgbmnqykc();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.btonecajqb
        public void iobyxmoadg() {
            wkgbmnqykc.this.wkgbmnqykc();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.btonecajqb
        public void ppxfxbqfkf(int i13, int i14) {
            wkgbmnqykc.this.wkgbmnqykc();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.btonecajqb
        public void wkgbmnqykc(int i13, int i14, int i15) {
            wkgbmnqykc.this.wkgbmnqykc();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.btonecajqb
        public void zoijcleaow(int i13, int i14, Object obj) {
            wkgbmnqykc.this.wkgbmnqykc();
        }
    }

    private static class ppxfxbqfkf extends ViewPager2.dxjokdxxww {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final WeakReference f23191iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private int f23192ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private int f23193zoijcleaow;

        ppxfxbqfkf(TabLayout tabLayout) {
            this.f23191iobyxmoadg = new WeakReference(tabLayout);
            wkgbmnqykc();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.dxjokdxxww
        public void iobyxmoadg(int i13) {
            this.f23193zoijcleaow = this.f23192ppxfxbqfkf;
            this.f23192ppxfxbqfkf = i13;
            TabLayout tabLayout = (TabLayout) this.f23191iobyxmoadg.get();
            if (tabLayout != null) {
                tabLayout.crxdokpmqz(this.f23192ppxfxbqfkf);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.dxjokdxxww
        public void ppxfxbqfkf(int i13) {
            TabLayout tabLayout = (TabLayout) this.f23191iobyxmoadg.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i13 || i13 >= tabLayout.getTabCount()) {
                return;
            }
            int i14 = this.f23192ppxfxbqfkf;
            tabLayout.hkdspvbjdz(tabLayout.zynmafqrjb(i13), i14 == 0 || (i14 == 2 && this.f23193zoijcleaow == 0));
        }

        void wkgbmnqykc() {
            this.f23192ppxfxbqfkf = 0;
            this.f23193zoijcleaow = 0;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.dxjokdxxww
        public void zoijcleaow(int i13, float f13, int i14) {
            TabLayout tabLayout = (TabLayout) this.f23191iobyxmoadg.get();
            if (tabLayout != null) {
                int i15 = this.f23192ppxfxbqfkf;
                tabLayout.stevsuqkhv(i13, f13, i15 != 2 || this.f23193zoijcleaow == 1, (i15 == 2 && this.f23193zoijcleaow == 0) ? false : true, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.wkgbmnqykc$wkgbmnqykc, reason: collision with other inner class name */
    private static class C0402wkgbmnqykc implements TabLayout.ppxfxbqfkf {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final ViewPager2 f23194iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final boolean f23195zoijcleaow;

        C0402wkgbmnqykc(ViewPager2 viewPager2, boolean z13) {
            this.f23194iobyxmoadg = viewPager2;
            this.f23195zoijcleaow = z13;
        }

        @Override // com.google.android.material.tabs.TabLayout.zoijcleaow
        public void iobyxmoadg(TabLayout.eablkybsjg eablkybsjgVar) {
            this.f23194iobyxmoadg.btonecajqb(eablkybsjgVar.lqeggnwhkg(), this.f23195zoijcleaow);
        }

        @Override // com.google.android.material.tabs.TabLayout.zoijcleaow
        public void ppxfxbqfkf(TabLayout.eablkybsjg eablkybsjgVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.zoijcleaow
        public void zoijcleaow(TabLayout.eablkybsjg eablkybsjgVar) {
        }
    }

    public interface zoijcleaow {
        void iobyxmoadg(TabLayout.eablkybsjg eablkybsjgVar, int i13);
    }

    public wkgbmnqykc(TabLayout tabLayout, ViewPager2 viewPager2, zoijcleaow zoijcleaowVar) {
        this(tabLayout, viewPager2, true, zoijcleaowVar);
    }

    public void iobyxmoadg() {
        if (this.f23185lqeggnwhkg) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.nufgyqmvbu adapter = this.f23189zoijcleaow.getAdapter();
        this.f23183gxszxtbevo = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.f23185lqeggnwhkg = true;
        ppxfxbqfkf ppxfxbqfkfVar = new ppxfxbqfkf(this.f23184iobyxmoadg);
        this.f23186nufgyqmvbu = ppxfxbqfkfVar;
        this.f23189zoijcleaow.lqeggnwhkg(ppxfxbqfkfVar);
        C0402wkgbmnqykc c0402wkgbmnqykc = new C0402wkgbmnqykc(this.f23189zoijcleaow, this.f23188wkgbmnqykc);
        this.f23181dxjokdxxww = c0402wkgbmnqykc;
        this.f23184iobyxmoadg.nufgyqmvbu(c0402wkgbmnqykc);
        if (this.f23187ppxfxbqfkf) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            this.f23180btonecajqb = iobyxmoadgVar;
            this.f23183gxszxtbevo.registerAdapterDataObserver(iobyxmoadgVar);
        }
        wkgbmnqykc();
        this.f23184iobyxmoadg.dsvhmnatus(this.f23189zoijcleaow.getCurrentItem(), 0.0f, true);
    }

    public boolean ppxfxbqfkf() {
        return this.f23185lqeggnwhkg;
    }

    void wkgbmnqykc() {
        this.f23184iobyxmoadg.wwaezpbzkn();
        RecyclerView.nufgyqmvbu nufgyqmvbuVar = this.f23183gxszxtbevo;
        if (nufgyqmvbuVar != null) {
            int itemCount = nufgyqmvbuVar.getItemCount();
            for (int i13 = 0; i13 < itemCount; i13++) {
                TabLayout.eablkybsjg eablkybsjgVarYadqdtsiqt = this.f23184iobyxmoadg.yadqdtsiqt();
                this.f23182eablkybsjg.iobyxmoadg(eablkybsjgVarYadqdtsiqt, i13);
                this.f23184iobyxmoadg.gtknphoqwx(eablkybsjgVarYadqdtsiqt, false);
            }
            if (itemCount > 0) {
                int iMin = Math.min(this.f23189zoijcleaow.getCurrentItem(), this.f23184iobyxmoadg.getTabCount() - 1);
                if (iMin != this.f23184iobyxmoadg.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.f23184iobyxmoadg;
                    tabLayout.jpowsppfya(tabLayout.zynmafqrjb(iMin));
                }
            }
        }
    }

    public void zoijcleaow() {
        RecyclerView.nufgyqmvbu nufgyqmvbuVar;
        if (this.f23187ppxfxbqfkf && (nufgyqmvbuVar = this.f23183gxszxtbevo) != null) {
            nufgyqmvbuVar.unregisterAdapterDataObserver(this.f23180btonecajqb);
            this.f23180btonecajqb = null;
        }
        this.f23184iobyxmoadg.pkzmftpjix(this.f23181dxjokdxxww);
        this.f23189zoijcleaow.agtfadlqog(this.f23186nufgyqmvbu);
        this.f23181dxjokdxxww = null;
        this.f23186nufgyqmvbu = null;
        this.f23183gxszxtbevo = null;
        this.f23185lqeggnwhkg = false;
    }

    public wkgbmnqykc(TabLayout tabLayout, ViewPager2 viewPager2, boolean z13, zoijcleaow zoijcleaowVar) {
        this(tabLayout, viewPager2, z13, true, zoijcleaowVar);
    }

    public wkgbmnqykc(TabLayout tabLayout, ViewPager2 viewPager2, boolean z13, boolean z14, zoijcleaow zoijcleaowVar) {
        this.f23184iobyxmoadg = tabLayout;
        this.f23189zoijcleaow = viewPager2;
        this.f23187ppxfxbqfkf = z13;
        this.f23188wkgbmnqykc = z14;
        this.f23182eablkybsjg = zoijcleaowVar;
    }
}
