package ff0;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import cf0.zoijcleaow;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final TextView f33545eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final TextView f33546gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f33547iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final TextView f33548lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final View f33549nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ShapeableImageView f33550ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final TextView f33551wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f33552zoijcleaow;

    private iobyxmoadg(LinearLayout linearLayout, MaterialButton materialButton, ShapeableImageView shapeableImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view) {
        this.f33547iobyxmoadg = linearLayout;
        this.f33552zoijcleaow = materialButton;
        this.f33550ppxfxbqfkf = shapeableImageView;
        this.f33551wkgbmnqykc = textView;
        this.f33545eablkybsjg = textView2;
        this.f33546gxszxtbevo = textView3;
        this.f33548lqeggnwhkg = textView4;
        this.f33549nufgyqmvbu = view;
    }

    public static iobyxmoadg iobyxmoadg(View view) {
        View viewIobyxmoadg;
        int i13 = zoijcleaow.btnAction;
        MaterialButton materialButton = (MaterialButton) a6.zoijcleaow.iobyxmoadg(view, i13);
        if (materialButton != null) {
            i13 = zoijcleaow.ivPopupImage;
            ShapeableImageView shapeableImageView = (ShapeableImageView) a6.zoijcleaow.iobyxmoadg(view, i13);
            if (shapeableImageView != null) {
                i13 = zoijcleaow.tvDescriptionMessage;
                TextView textView = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                if (textView != null) {
                    i13 = zoijcleaow.tvPromoCode;
                    TextView textView2 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                    if (textView2 != null) {
                        i13 = zoijcleaow.tvSubTitle;
                        TextView textView3 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                        if (textView3 != null) {
                            i13 = zoijcleaow.tvTitle;
                            TextView textView4 = (TextView) a6.zoijcleaow.iobyxmoadg(view, i13);
                            if (textView4 != null && (viewIobyxmoadg = a6.zoijcleaow.iobyxmoadg(view, (i13 = zoijcleaow.vCurtain))) != null) {
                                return new iobyxmoadg((LinearLayout) view, materialButton, shapeableImageView, textView, textView2, textView3, textView4, viewIobyxmoadg);
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
        return this.f33547iobyxmoadg;
    }
}
