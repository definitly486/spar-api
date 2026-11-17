package kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class of extends kotlin.jvm.internal.vdvldrhtss implements tg.vdvldrhtss {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final of f57940zdlpuopuiu = new of();

    public of() {
        super(3, w4.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lspay/sdk/databinding/SpayRvItemOrderAmountBinding;", 0);
    }

    @Override // tg.vdvldrhtss
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LayoutInflater p13 = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
        View viewInflate = p13.inflate(R.layout.spay_rv_item_order_amount, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i13 = R.id.spay_slo_tv_amount;
        AppCompatTextView appCompatTextView = (AppCompatTextView) a6.zoijcleaow.iobyxmoadg(viewInflate, i13);
        if (appCompatTextView != null) {
            i13 = R.id.spay_slo_tv_old_amount;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) a6.zoijcleaow.iobyxmoadg(viewInflate, i13);
            if (appCompatTextView2 != null) {
                return new w4((ConstraintLayout) viewInflate, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i13)));
    }
}
