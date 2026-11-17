package kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.R;
import spay.sdk.view.CardLogoCompositeView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class skhdrjzrfn extends kotlin.jvm.internal.vdvldrhtss implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final skhdrjzrfn f58560zdlpuopuiu = new skhdrjzrfn();

    public skhdrjzrfn() {
        super(3, y5.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lspay/sdk/databinding/SpayRvItemSingleHelperBinding;", 0);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p13 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
        View viewInflate = p13.inflate(R.layout.spay_rv_item_single_helper, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i13 = R.id.spay_srish_aciv_helper_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatImageView != null) {
            i13 = R.id.spay_srish_actv_helper_content;
            AppCompatTextView appCompatTextView = (AppCompatTextView) a6.zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (appCompatTextView != null) {
                i13 = R.id.spay_srish_actv_helper_header;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) a6.zoijcleaow.iobyxmoadg(viewInflate, i13);
                if (appCompatTextView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    i13 = R.id.spay_srish_clcv_helper_icon;
                    if (((CardLogoCompositeView) a6.zoijcleaow.iobyxmoadg(viewInflate, i13)) != null) {
                        return new y5(constraintLayout, appCompatImageView, appCompatTextView, appCompatTextView2, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }
}
