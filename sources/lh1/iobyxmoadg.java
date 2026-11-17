package lh1;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import jh1.zoijcleaow;

/* JADX INFO: loaded from: classes6.dex */
public final class iobyxmoadg implements a6.iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final TextView f62575eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final TextView f62576gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final LinearLayout f62577iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final TextView f62578lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    public final View f62579nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final ShapeableImageView f62580ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final TextView f62581wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final MaterialButton f62582zoijcleaow;

    private iobyxmoadg(LinearLayout linearLayout, MaterialButton materialButton, ShapeableImageView shapeableImageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view) {
        this.f62577iobyxmoadg = linearLayout;
        this.f62582zoijcleaow = materialButton;
        this.f62580ppxfxbqfkf = shapeableImageView;
        this.f62581wkgbmnqykc = textView;
        this.f62575eablkybsjg = textView2;
        this.f62576gxszxtbevo = textView3;
        this.f62578lqeggnwhkg = textView4;
        this.f62579nufgyqmvbu = view;
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
        return this.f62577iobyxmoadg;
    }
}
