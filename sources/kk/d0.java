package kk;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends o7 {

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final kotlin.jvm.internal.jyumaefscl f56204wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(zs hintsItemDiffUtilCallback, tg.draadjrbmk hintCloseActionListener) {
        super(hintCloseActionListener, hintsItemDiffUtilCallback);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hintsItemDiffUtilCallback, "hintsItemDiffUtilCallback");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(hintCloseActionListener, "hintCloseActionListener");
        this.f56204wkgbmnqykc = (kotlin.jvm.internal.jyumaefscl) hintCloseActionListener;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kotlin.jvm.internal.jyumaefscl, tg.draadjrbmk] */
    @Override // androidx.recyclerview.widget.RecyclerView.nufgyqmvbu
    public final RecyclerView.iozdgvuglv onCreateViewHolder(ViewGroup parent, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.spay_rv_item_hint_helper, parent, false);
        int i14 = R.id.spay_srihh_aciv_dismiss_hint;
        AppCompatImageView appCompatImageView = (AppCompatImageView) a6.zoijcleaow.iobyxmoadg(viewInflate, i14);
        if (appCompatImageView != null) {
            i14 = R.id.spay_srihh_actv_dash;
            if (((AppCompatTextView) a6.zoijcleaow.iobyxmoadg(viewInflate, i14)) != null) {
                i14 = R.id.spay_srihh_actv_hint;
                AppCompatTextView appCompatTextView = (AppCompatTextView) a6.zoijcleaow.iobyxmoadg(viewInflate, i14);
                if (appCompatTextView != null) {
                    s3 s3Var = new s3((ConstraintLayout) viewInflate, appCompatImageView, appCompatTextView);
                    kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(s3Var, "inflate(LayoutInflater.f….context), parent, false)");
                    return new vr(s3Var, this.f56204wkgbmnqykc);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i14)));
    }
}
