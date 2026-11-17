package ru.myspar.common.view.bonus_card;

import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import c60.nufgyqmvbu;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ps.iobyxmoadg;
import s40.eablkybsjg;
import s40.gtknphoqwx;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/myspar/common/view/bonus_card/CardWidget;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bonuses", "", "text", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(ILjava/lang/String;)V", "Lps/iobyxmoadg;", "zdlpuopuiu", "Lps/iobyxmoadg;", "binding", "view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CardWidget extends CardView {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final iobyxmoadg binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public final void iobyxmoadg(int bonuses, String text) {
        zdlpuopuiu.btonecajqb(text, "text");
        iobyxmoadg iobyxmoadgVar = this.binding;
        iobyxmoadgVar.f77263gxszxtbevo.setText(text);
        iobyxmoadgVar.f77266wkgbmnqykc.setText(n30.iobyxmoadg.f68492iobyxmoadg.ppxfxbqfkf(Integer.valueOf(bonuses)));
        iobyxmoadgVar.f77262eablkybsjg.setText(getContext().getResources().getQuantityString(gtknphoqwx.plural_bonuses, bonuses));
    }

    public /* synthetic */ CardWidget(Context context, AttributeSet attributeSet, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWidget(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        iobyxmoadg iobyxmoadgVarZoijcleaow = iobyxmoadg.zoijcleaow(nufgyqmvbu.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(iobyxmoadgVarZoijcleaow, "inflate(...)");
        this.binding = iobyxmoadgVarZoijcleaow;
        setRadius(getResources().getDimension(eablkybsjg.content_margin_16));
    }
}
