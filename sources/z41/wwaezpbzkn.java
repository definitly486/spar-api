package z41;

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

/* JADX INFO: loaded from: classes5.dex */
public final class wwaezpbzkn implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
    public final MaterialTextView f128454agtfadlqog;

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    public final RecyclerView f128455btonecajqb;

    /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
    public final MaterialTextView f128456draadjrbmk;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MapView f128457dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final ComposeView f128458eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    public final MaterialButtonToggleGroup f128459gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ComposeView f128460gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ConstraintLayout f128461iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final Group f128462lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final AppCompatImageView f128463nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialButton f128464ppxfxbqfkf;

    /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
    public final MaterialTextView f128465wflxmlrfwp;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final MaterialButton f128466wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ImageButton f128467zoijcleaow;

    private wwaezpbzkn(ConstraintLayout constraintLayout, ImageButton imageButton, MaterialButton materialButton, MaterialButton materialButton2, ComposeView composeView, ComposeView composeView2, Group group, AppCompatImageView appCompatImageView, MapView mapView, RecyclerView recyclerView, MaterialButtonToggleGroup materialButtonToggleGroup, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3) {
        this.f128461iobyxmoadg = constraintLayout;
        this.f128467zoijcleaow = imageButton;
        this.f128464ppxfxbqfkf = materialButton;
        this.f128466wkgbmnqykc = materialButton2;
        this.f128458eablkybsjg = composeView;
        this.f128460gxszxtbevo = composeView2;
        this.f128462lqeggnwhkg = group;
        this.f128463nufgyqmvbu = appCompatImageView;
        this.f128457dxjokdxxww = mapView;
        this.f128455btonecajqb = recyclerView;
        this.f128459gtknphoqwx = materialButtonToggleGroup;
        this.f128456draadjrbmk = materialTextView;
        this.f128465wflxmlrfwp = materialTextView2;
        this.f128454agtfadlqog = materialTextView3;
    }

    public static wwaezpbzkn iobyxmoadg(View view) {
        int i13 = vk0.wkgbmnqykc.btnFilters;
        ImageButton imageButton = (ImageButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (imageButton != null) {
            i13 = vk0.wkgbmnqykc.btnInList;
            MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialButton != null) {
                i13 = vk0.wkgbmnqykc.btnOnMap;
                MaterialButton materialButton2 = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (materialButton2 != null) {
                    i13 = vk0.wkgbmnqykc.clLoading;
                    ComposeView composeView = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (composeView != null) {
                        i13 = vk0.wkgbmnqykc.cvActionBar;
                        ComposeView composeView2 = (ComposeView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (composeView2 != null) {
                            i13 = vk0.wkgbmnqykc.groupMap;
                            Group group = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (group != null) {
                                i13 = vk0.wkgbmnqykc.ivNavigation;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (appCompatImageView != null) {
                                    i13 = vk0.wkgbmnqykc.mapView;
                                    MapView mapView = (MapView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (mapView != null) {
                                        i13 = vk0.wkgbmnqykc.rvShops;
                                        RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                        if (recyclerView != null) {
                                            i13 = vk0.wkgbmnqykc.tbGroup;
                                            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) a6.zoijcleaow.iobyxmoadg(view, i13);
                                            if (materialButtonToggleGroup != null) {
                                                i13 = vk0.wkgbmnqykc.tvEmptyListError;
                                                MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                if (materialTextView != null) {
                                                    i13 = vk0.wkgbmnqykc.tvZoomDecrease;
                                                    MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                    if (materialTextView2 != null) {
                                                        i13 = vk0.wkgbmnqykc.tvZoomIncrease;
                                                        MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                                        if (materialTextView3 != null) {
                                                            return new wwaezpbzkn((ConstraintLayout) view, imageButton, materialButton, materialButton2, composeView, composeView2, group, appCompatImageView, mapView, recyclerView, materialButtonToggleGroup, materialTextView, materialTextView2, materialTextView3);
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
        return this.f128461iobyxmoadg;
    }
}
