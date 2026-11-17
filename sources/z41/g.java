package z41;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.yandex.mapkit.mapview.MapView;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f128013eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f128014gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f128015iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MapView f128016ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final RecyclerView f128017wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialCardView f128018zoijcleaow;

    private g(View view, MaterialCardView materialCardView, MapView mapView, RecyclerView recyclerView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f128015iobyxmoadg = view;
        this.f128018zoijcleaow = materialCardView;
        this.f128016ppxfxbqfkf = mapView;
        this.f128017wkgbmnqykc = recyclerView;
        this.f128013eablkybsjg = materialTextView;
        this.f128014gxszxtbevo = materialTextView2;
    }

    public static g iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.cvShops;
        MaterialCardView materialCardView = (MaterialCardView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialCardView != null) {
            i13 = vk0.wkgbmnqykc.mvShops;
            MapView mapView = (MapView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (mapView != null) {
                i13 = vk0.wkgbmnqykc.rvShops;
                RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (recyclerView != null) {
                    i13 = vk0.wkgbmnqykc.tvOpenMap;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        i13 = vk0.wkgbmnqykc.tvTitle;
                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView2 != null) {
                            return new g(view, materialCardView, mapView, recyclerView, materialTextView, materialTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static g zoijcleaow(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(vk0.eablkybsjg.view_special_banner_map_proloyalty, viewGroup);
        return iobyxmoadg(viewGroup);
    }

    @Override // a6.iobyxmoadg
    public View getRoot() {
        return this.f128015iobyxmoadg;
    }
}
