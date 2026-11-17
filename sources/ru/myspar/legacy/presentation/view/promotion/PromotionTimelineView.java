package ru.myspar.legacy.presentation.view.promotion;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.iobyxmoadg;
import c60.lqeggnwhkg;
import da.zoijcleaow;
import gg.wwaezpbzkn;
import hg.jyumaefscl;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import s40.agtfadlqog;
import s40.gxszxtbevo;
import s40.ppxfxbqfkf;
import v1.metgxyhuhe;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\rJ\u0019\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\rR*\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\rR\u0016\u0010 \u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017¨\u0006\""}, d2 = {"Lru/myspar/legacy/presentation/view/promotion/PromotionTimelineView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "count", "Lgg/wwaezpbzkn;", "ppxfxbqfkf", "(I)V", "Landroid/view/View;", "zoijcleaow", "()Landroid/view/View;", "selectedItem", "wkgbmnqykc", "iobyxmoadg", "(Landroid/util/AttributeSet;)V", "value", "zdlpuopuiu", "I", "getItemCount", "()I", "setItemCount", "itemCount", "yggfygwlhe", "getSelectedItem", "setSelectedItem", "jyumaefscl", "selectedColor", "iwizpuwonk", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PromotionTimelineView extends LinearLayout {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private int selectedColor;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private int selectedItem;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private int itemCount;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public static final int f90031cqumvgiudr = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromotionTimelineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final void iobyxmoadg(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, agtfadlqog.PromotionTimelineView);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.selectedColor = typedArrayObtainStyledAttributes.getResourceId(typedArrayObtainStyledAttributes.getIndex(agtfadlqog.PromotionTimelineView_selected_color), zoijcleaow.colorOnSurface);
        wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void ppxfxbqfkf(int count) {
        removeAllViews();
        for (int i13 = 0; i13 < count; i13++) {
            addView(zoijcleaow());
        }
    }

    private final void wkgbmnqykc(int selectedItem) {
        int i13 = 0;
        for (Object obj : metgxyhuhe.iobyxmoadg(this)) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                jyumaefscl.iwizpuwonk();
            }
            lqeggnwhkg.wkgbmnqykc((View) obj, i13 <= selectedItem ? this.selectedColor : ppxfxbqfkf.colorTextIcons4);
            i13 = i14;
        }
    }

    private final View zoijcleaow() {
        View view = new View(getContext());
        view.setBackgroundResource(gxszxtbevo.shape_promo_timeline);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
        return view;
    }

    public final int getItemCount() {
        return this.itemCount;
    }

    public final int getSelectedItem() {
        return this.selectedItem;
    }

    public final void setItemCount(int i13) {
        this.itemCount = i13;
        ppxfxbqfkf(i13);
    }

    public final void setSelectedItem(int i13) {
        this.selectedItem = i13;
        wkgbmnqykc(i13);
    }

    public /* synthetic */ PromotionTimelineView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionTimelineView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        this.selectedColor = zoijcleaow.colorOnSurface;
        setShowDividers(2);
        setDividerDrawable(iobyxmoadg.getDrawable(context, gxszxtbevo.shape_timeline_item_divider));
        iobyxmoadg(attributeSet);
    }
}
