package kk;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class yadqdtsiqt extends RecyclerView.iozdgvuglv {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final AppCompatImageView f59404eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final AppCompatImageView f59405iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final AppCompatTextView f59406ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final AppCompatTextView f59407wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final AppCompatImageView f59408zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yadqdtsiqt(View itemView) {
        super(itemView);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(itemView, "itemView");
        this.f59405iobyxmoadg = (AppCompatImageView) itemView.findViewById(R.id.spay_aciv_bullet_background);
        this.f59408zoijcleaow = (AppCompatImageView) itemView.findViewById(R.id.spay_aciv_bullet);
        this.f59406ppxfxbqfkf = (AppCompatTextView) itemView.findViewById(R.id.spay_actv_write_off_date);
        this.f59407wkgbmnqykc = (AppCompatTextView) itemView.findViewById(R.id.spay_actv_amount);
        this.f59404eablkybsjg = (AppCompatImageView) itemView.findViewById(R.id.spay_incl_bottom_divider);
        itemView.getResources();
    }
}
