package m60;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import ru.myspar.legacy.presentation.dialogs.comboset.buildyourcombo.views.ComboProductsListTitle;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final RecyclerView f66202eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final ComboProductsListTitle f66203gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f66204iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final ComboProductsListTitle f66205lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final FrameLayout f66206ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final RecyclerView f66207wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f66208zoijcleaow;

    private zoijcleaow(LinearLayout linearLayout, MaterialButton materialButton, FrameLayout frameLayout, RecyclerView recyclerView, RecyclerView recyclerView2, ComboProductsListTitle comboProductsListTitle, ComboProductsListTitle comboProductsListTitle2) {
        this.f66204iobyxmoadg = linearLayout;
        this.f66208zoijcleaow = materialButton;
        this.f66206ppxfxbqfkf = frameLayout;
        this.f66207wkgbmnqykc = recyclerView;
        this.f66202eablkybsjg = recyclerView2;
        this.f66203gxszxtbevo = comboProductsListTitle;
        this.f66205lqeggnwhkg = comboProductsListTitle2;
    }

    public static zoijcleaow iobyxmoadg(View view) {
        int i13 = pm.eablkybsjg.btnAddToBasket;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = pm.eablkybsjg.btn_dismiss_dialog;
            FrameLayout frameLayout = (FrameLayout) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (frameLayout != null) {
                i13 = pm.eablkybsjg.rvProductsFirst;
                RecyclerView recyclerView = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (recyclerView != null) {
                    i13 = pm.eablkybsjg.rvProductsSecond;
                    RecyclerView recyclerView2 = (RecyclerView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (recyclerView2 != null) {
                        i13 = pm.eablkybsjg.titleProductsFirst;
                        ComboProductsListTitle comboProductsListTitle = (ComboProductsListTitle) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (comboProductsListTitle != null) {
                            i13 = pm.eablkybsjg.titleProductsSecond;
                            ComboProductsListTitle comboProductsListTitle2 = (ComboProductsListTitle) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (comboProductsListTitle2 != null) {
                                return new zoijcleaow((LinearLayout) view, materialButton, frameLayout, recyclerView, recyclerView2, comboProductsListTitle, comboProductsListTitle2);
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
    public LinearLayout getRoot() {
        return this.f66204iobyxmoadg;
    }
}
