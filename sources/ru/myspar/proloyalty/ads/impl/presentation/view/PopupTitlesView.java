package ru.myspar.proloyalty.ads.impl.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.textview.MaterialTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.dxjokdxxww;
import p41.ppxfxbqfkf;
import t1.zoijcleaow;
import z41.mhtqkkgtqm;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/myspar/proloyalty/ads/impl/presentation/view/PopupTitlesView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "", "text", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Landroid/widget/TextView;Ljava/lang/String;)V", "Ll91/zoijcleaow;", "data", "setData", "(Ll91/zoijcleaow;)V", "Lz41/mhtqkkgtqm;", "zdlpuopuiu", "Lz41/mhtqkkgtqm;", "binding", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PopupTitlesView extends CardView {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private mhtqkkgtqm binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PopupTitlesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final void iobyxmoadg(TextView textView, String str) {
        textView.setText(zoijcleaow.iobyxmoadg(str, 0, null, null));
        textView.setVisibility(str.length() > 0 ? 0 : 8);
    }

    public final void setData(l91.zoijcleaow data) {
        zdlpuopuiu.btonecajqb(data, "data");
        MaterialTextView tvTitle = this.binding.f128263eablkybsjg;
        zdlpuopuiu.dxjokdxxww(tvTitle, "tvTitle");
        iobyxmoadg(tvTitle, data.wkgbmnqykc());
        MaterialTextView tvSubtitle = this.binding.f128267zoijcleaow;
        zdlpuopuiu.dxjokdxxww(tvSubtitle, "tvSubtitle");
        iobyxmoadg(tvSubtitle, data.iobyxmoadg());
        MaterialTextView tvSubtitleText = this.binding.f128265ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvSubtitleText, "tvSubtitleText");
        iobyxmoadg(tvSubtitleText, data.zoijcleaow());
        MaterialTextView tvText = this.binding.f128266wkgbmnqykc;
        zdlpuopuiu.dxjokdxxww(tvText, "tvText");
        iobyxmoadg(tvText, data.ppxfxbqfkf());
    }

    public /* synthetic */ PopupTitlesView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupTitlesView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        mhtqkkgtqm mhtqkkgtqmVarPpxfxbqfkf = mhtqkkgtqm.ppxfxbqfkf(dxjokdxxww.nufgyqmvbu(this), this, true);
        zdlpuopuiu.dxjokdxxww(mhtqkkgtqmVarPpxfxbqfkf, "inflate(...)");
        this.binding = mhtqkkgtqmVarPpxfxbqfkf;
        setCardBackgroundColor(ppxfxbqfkf.ppxfxbqfkf(context, da.zoijcleaow.colorSurface));
    }
}
