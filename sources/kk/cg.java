package kk;

import androidx.appcompat.widget.AppCompatImageView;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class cg extends en {

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ikoacuggdj f56153zoijcleaow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(ikoacuggdj viewBinding) {
        super(viewBinding);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(viewBinding, "viewBinding");
        this.f56153zoijcleaow = viewBinding;
    }

    @Override // kk.en
    public final void zoijcleaow(Object obj) {
        xd item = (xd) obj;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(item, "item");
        ikoacuggdj ikoacuggdjVar = this.f56153zoijcleaow;
        if (item.f59297iobyxmoadg) {
            AppCompatImageView spaySribgsSection = ikoacuggdjVar.f57060zoijcleaow;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySribgsSection, "spaySribgsSection");
            x40.iobyxmoadg(spaySribgsSection, R.drawable.spay_ic_bnpl_payment_current_section);
        } else {
            AppCompatImageView spaySribgsSection2 = ikoacuggdjVar.f57060zoijcleaow;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(spaySribgsSection2, "spaySribgsSection");
            x40.iobyxmoadg(spaySribgsSection2, R.drawable.spay_ic_bnpl_payment_section);
        }
    }
}
