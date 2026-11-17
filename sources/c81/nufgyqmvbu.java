package c81;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class nufgyqmvbu implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final TabLayout f19241iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final TabLayout f19242zoijcleaow;

    private nufgyqmvbu(TabLayout tabLayout, TabLayout tabLayout2) {
        this.f19241iobyxmoadg = tabLayout;
        this.f19242zoijcleaow = tabLayout2;
    }

    public static nufgyqmvbu iobyxmoadg(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TabLayout tabLayout = (TabLayout) view;
        return new nufgyqmvbu(tabLayout, tabLayout);
    }

    public static nufgyqmvbu ppxfxbqfkf(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z13) {
        View viewInflate = layoutInflater.inflate(u71.eablkybsjg.item_evropolis_dialog_tabs_proloyalty, viewGroup, false);
        if (z13) {
            viewGroup.addView(viewInflate);
        }
        return iobyxmoadg(viewInflate);
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public TabLayout getRoot() {
        return this.f19241iobyxmoadg;
    }
}
