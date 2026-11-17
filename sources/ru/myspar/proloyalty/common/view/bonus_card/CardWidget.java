package ru.myspar.proloyalty.common.view.bonus_card;

import android.content.Context;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import b31.eablkybsjg;
import b31.gtknphoqwx;
import com.google.android.material.textview.MaterialTextView;
import fr0.zoijcleaow;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import mj.kcexrzcfyt;
import p41.dxjokdxxww;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/myspar/proloyalty/common/view/bonus_card/CardWidget;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "zoijcleaow", "(Ljava/lang/String;)Ljava/lang/String;", "bonuses", "text", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Ljava/lang/String;Ljava/lang/String;)V", "Lfr0/zoijcleaow;", "zdlpuopuiu", "Lfr0/zoijcleaow;", "binding", "view_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CardWidget extends CardView {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final zoijcleaow binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final String zoijcleaow(String str) {
        Float fOjitshcjhn = kcexrzcfyt.ojitshcjhn(str);
        if (fOjitshcjhn == null) {
            return null;
        }
        return getContext().getResources().getQuantityString(gtknphoqwx.plural_bonuses, (int) fOjitshcjhn.floatValue());
    }

    public final void iobyxmoadg(String bonuses, String text) {
        zdlpuopuiu.btonecajqb(bonuses, "bonuses");
        zdlpuopuiu.btonecajqb(text, "text");
        zoijcleaow zoijcleaowVar = this.binding;
        zoijcleaowVar.f34900gxszxtbevo.setText(text);
        zoijcleaowVar.f34903wkgbmnqykc.setText(bonuses);
        MaterialTextView materialTextView = zoijcleaowVar.f34899eablkybsjg;
        String strZoijcleaow = zoijcleaow(bonuses);
        if (strZoijcleaow == null) {
            strZoijcleaow = "";
        }
        materialTextView.setText(strZoijcleaow);
    }

    public /* synthetic */ CardWidget(Context context, AttributeSet attributeSet, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardWidget(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        zoijcleaow zoijcleaowVarZoijcleaow = zoijcleaow.zoijcleaow(dxjokdxxww.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(zoijcleaowVarZoijcleaow, "inflate(...)");
        this.binding = zoijcleaowVarZoijcleaow;
        setRadius(getResources().getDimension(eablkybsjg.content_margin_16));
    }
}
