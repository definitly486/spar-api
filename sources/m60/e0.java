package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.yandex.mapkit.mapview.MapView;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final MaterialTextView f65478eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f65479gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f65480iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MapView f65481ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final RecyclerView f65482wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialCardView f65483zoijcleaow;

    private e0(View view, MaterialCardView materialCardView, MapView mapView, RecyclerView recyclerView, MaterialTextView materialTextView, MaterialTextView materialTextView2) {
        this.f65480iobyxmoadg = view;
        this.f65483zoijcleaow = materialCardView;
        this.f65481ppxfxbqfkf = mapView;
        this.f65482wkgbmnqykc = recyclerView;
        this.f65478eablkybsjg = materialTextView;
        this.f65479gxszxtbevo = materialTextView2;
    }

    public static e0 iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.cvShops;
        MaterialCardView materialCardView = (MaterialCardView) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialCardView != null) {
            i13 = pm.eablkybsjg.mvShops;
            MapView mapView = (MapView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (mapView != null) {
                i13 = pm.eablkybsjg.rvShops;
                RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (recyclerView != null) {
                    i13 = pm.eablkybsjg.tvOpenMap;
                    MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (materialTextView != null) {
                        i13 = pm.eablkybsjg.tvTitle;
                        MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView2 != null) {
                            return new e0(view, materialCardView, mapView, recyclerView, materialTextView, materialTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    public static e0 zoijcleaow(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(pm.gxszxtbevo.view_special_banner_map, viewGroup);
        return iobyxmoadg(viewGroup);
    }

    @Override // a6.iobyxmoadg
    public View getRoot() {
        return this.f65480iobyxmoadg;
    }
}
