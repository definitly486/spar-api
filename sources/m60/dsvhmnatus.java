package m60;

import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.textview.MaterialTextView;
import com.yandex.mapkit.mapview.MapView;

/* JADX INFO: loaded from: classes4.dex */
public final class dsvhmnatus implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final MaterialTextView f65448agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final RecyclerView f65449btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f65450draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MapView f65451dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ComposeView f65452eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialButtonToggleGroup f65453gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ComposeView f65454gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f65455iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Group f65456lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final AppCompatImageView f65457nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f65458ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final MaterialTextView f65459wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f65460wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ImageButton f65461zoijcleaow;

    private dsvhmnatus(ConstraintLayout constraintLayout, ImageButton imageButton, MaterialButton materialButton, MaterialButton materialButton2, ComposeView composeView, ComposeView composeView2, Group group, AppCompatImageView appCompatImageView, MapView mapView, RecyclerView recyclerView, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f65455iobyxmoadg = constraintLayout;
        this.f65461zoijcleaow = imageButton;
        this.f65458ppxfxbqfkf = materialButton;
        this.f65460wkgbmnqykc = materialButton2;
        this.f65452eablkybsjg = composeView;
        this.f65454gxszxtbevo = composeView2;
        this.f65456lqeggnwhkg = group;
        this.f65457nufgyqmvbu = appCompatImageView;
        this.f65451dxjokdxxww = mapView;
        this.f65449btonecajqb = recyclerView;
        this.f65453gtknphoqwx = materialButtonToggleGroup;
        this.f65450draadjrbmk = materialTextView;
        this.f65459wflxmlrfwp = materialTextView2;
        this.f65448agtfadlqog = materialTextView3;
    }

    public static dsvhmnatus iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.btnFilters;
        ImageButton imageButton = (ImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (imageButton != null) {
            i13 = pm.eablkybsjg.btnInList;
            MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton != null) {
                i13 = pm.eablkybsjg.btnOnMap;
                MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialButton2 != null) {
                    i13 = pm.eablkybsjg.clLoading;
                    ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (composeView != null) {
                        i13 = pm.eablkybsjg.cvActionBar;
                        ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (composeView2 != null) {
                            i13 = pm.eablkybsjg.groupMap;
                            Group group = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (group != null) {
                                i13 = pm.eablkybsjg.ivNavigation;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (appCompatImageView != null) {
                                    i13 = pm.eablkybsjg.mapView;
                                    MapView mapView = (MapView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (mapView != null) {
                                        i13 = pm.eablkybsjg.rvShops;
                                        RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (recyclerView != null) {
                                            i13 = pm.eablkybsjg.tbGroup;
                                            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialButtonToggleGroup != null) {
                                                i13 = pm.eablkybsjg.tvEmptyListError;
                                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView != null) {
                                                    i13 = pm.eablkybsjg.tvZoomDecrease;
                                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                    if (materialTextView2 != null) {
                                                        i13 = pm.eablkybsjg.tvZoomIncrease;
                                                        MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                        if (materialTextView3 != null) {
                                                            return new dsvhmnatus((ConstraintLayout) view, imageButton, materialButton, materialButton2, composeView, composeView2, group, appCompatImageView, mapView, recyclerView, materialButtonToggleGroup, materialTextView, materialTextView2, materialTextView3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i13)));
    }

    @Override // a6.iobyxmoadg
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f65455iobyxmoadg;
    }
}
