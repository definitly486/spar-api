package m60;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class w implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    public final MaterialTextView f66048dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final AppCompatImageView f66049eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final MaterialTextView f66050gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final View f66051iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final MaterialTextView f66052lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final MaterialTextView f66053nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final MaterialCardView f66054ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Group f66055wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f66056zoijcleaow;

    private w(View view, MaterialButton materialButton, MaterialCardView materialCardView, Group group, AppCompatImageView appCompatImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, MaterialTextView materialTextView4) {
        this.f66051iobyxmoadg = view;
        this.f66056zoijcleaow = materialButton;
        this.f66054ppxfxbqfkf = materialCardView;
        this.f66055wkgbmnqykc = group;
        this.f66049eablkybsjg = appCompatImageView;
        this.f66050gxszxtbevo = materialTextView;
        this.f66052lqeggnwhkg = materialTextView2;
        this.f66053nufgyqmvbu = materialTextView3;
        this.f66048dxjokdxxww = materialTextView4;
    }

    public static w iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.btnReward;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = pm.eablkybsjg.card;
            MaterialCardView materialCardView = (MaterialCardView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (materialCardView != null) {
                i13 = pm.eablkybsjg.groupPrice;
                Group group = (Group) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (group != null) {
                    i13 = pm.eablkybsjg.ivPromo;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (appCompatImageView != null) {
                        i13 = pm.eablkybsjg.tvName;
                        MaterialTextView materialTextView = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (materialTextView != null) {
                            i13 = pm.eablkybsjg.tvOldPrice;
                            MaterialTextView materialTextView2 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (materialTextView2 != null) {
                                i13 = pm.eablkybsjg.tvPrice;
                                MaterialTextView materialTextView3 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                if (materialTextView3 != null) {
                                    i13 = pm.eablkybsjg.tvRewardText;
                                    MaterialTextView materialTextView4 = (MaterialTextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                                    if (materialTextView4 != null) {
                                        return new w(view, materialButton, materialCardView, group, appCompatImageView, materialTextView, materialTextView2, materialTextView3, materialTextView4);
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

    public static w zoijcleaow(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(pm.gxszxtbevo.view_promo, viewGroup);
        return iobyxmoadg(viewGroup);
    }

    @Override // a6.iobyxmoadg
    public View getRoot() {
        return this.f66051iobyxmoadg;
    }
}
