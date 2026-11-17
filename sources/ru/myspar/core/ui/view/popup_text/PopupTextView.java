package ru.myspar.core.ui.view.popup_text;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import b60.wkgbmnqykc;
import com.google.android.material.textview.MaterialTextView;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.ui.view.popup_text.PopupTextView;
import s40.eablkybsjg;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/myspar/core/ui/view/popup_text/PopupTextView;", "Lcom/google/android/material/textview/MaterialTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "text", "Lgg/wwaezpbzkn;", "setPopupText", "(Ljava/lang/String;)V", "yadqdtsiqt", "()V", "pmvmpeiblj", "Lgg/gtknphoqwx;", "getPopupMargin", "()I", "popupMargin", "zynmafqrjb", "getMarginStart", "marginStart", "Lb60/wkgbmnqykc;", "istkbnxepw", "Lb60/wkgbmnqykc;", "getPopupContentBinding", "()Lb60/wkgbmnqykc;", "popupContentBinding", "Landroid/widget/PopupWindow;", "cdpycssgdh", "getPopup", "()Landroid/widget/PopupWindow;", "popup", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PopupTextView extends MaterialTextView {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx popup;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name and from kotlin metadata */
    private final wkgbmnqykc popupContentBinding;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx popupMargin;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx marginStart;

    public static final class iobyxmoadg implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ String f87603zoijcleaow;

        public iobyxmoadg(String str) {
            this.f87603zoijcleaow = str;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
            view.removeOnLayoutChangeListener(this);
            PopupTextView.this.getPopupContentBinding().getRoot().setText(this.f87603zoijcleaow);
            PopupTextView.this.getPopupContentBinding().getRoot().measure(View.MeasureSpec.makeMeasureSpec((((int) PopupTextView.this.getX()) + PopupTextView.this.getMeasuredWidth()) - PopupTextView.this.getMarginStart(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
            PopupTextView.this.getPopup().setWidth(PopupTextView.this.getPopupContentBinding().getRoot().getMeasuredWidth());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PopupTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PopupWindow cdpycssgdh(PopupTextView popupTextView) {
        PopupWindow popupWindow = new PopupWindow((View) popupTextView.popupContentBinding.getRoot(), -2, -2, true);
        popupWindow.setElevation(0.0f);
        popupWindow.setOverlapAnchor(false);
        return popupWindow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int istkbnxepw(Context context) {
        return context.getResources().getDimensionPixelSize(eablkybsjg.content_margin_8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int zynmafqrjb(Context context) {
        return context.getResources().getDimensionPixelSize(eablkybsjg.content_margin_16);
    }

    public final int getMarginStart() {
        return ((Number) this.marginStart.getValue()).intValue();
    }

    public final PopupWindow getPopup() {
        return (PopupWindow) this.popup.getValue();
    }

    public final wkgbmnqykc getPopupContentBinding() {
        return this.popupContentBinding;
    }

    public final int getPopupMargin() {
        return ((Number) this.popupMargin.getValue()).intValue();
    }

    public final void setPopupText(String text) {
        zdlpuopuiu.btonecajqb(text, "text");
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new iobyxmoadg(text));
            return;
        }
        getPopupContentBinding().getRoot().setText(text);
        getPopupContentBinding().getRoot().measure(View.MeasureSpec.makeMeasureSpec((((int) getX()) + getMeasuredWidth()) - getMarginStart(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        getPopup().setWidth(getPopupContentBinding().getRoot().getMeasuredWidth());
    }

    public final void yadqdtsiqt() {
        getLocationOnScreen(new int[2]);
        getPopup().showAsDropDown(this, getMeasuredWidth() - getPopup().getWidth(), getPopupMargin(), 8388611);
    }

    public /* synthetic */ PopupTextView(Context context, AttributeSet attributeSet, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupTextView(final Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        this.popupMargin = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: g60.iobyxmoadg
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Integer.valueOf(PopupTextView.istkbnxepw(context));
            }
        });
        this.marginStart = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: g60.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Integer.valueOf(PopupTextView.zynmafqrjb(context));
            }
        });
        wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = wkgbmnqykc.ppxfxbqfkf(LayoutInflater.from(context));
        wkgbmnqykcVarPpxfxbqfkf.getRoot().setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        zdlpuopuiu.dxjokdxxww(wkgbmnqykcVarPpxfxbqfkf, "apply(...)");
        this.popupContentBinding = wkgbmnqykcVarPpxfxbqfkf;
        this.popup = draadjrbmk.zoijcleaow(new tg.iobyxmoadg() { // from class: g60.ppxfxbqfkf
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return PopupTextView.cdpycssgdh(this.f36501zdlpuopuiu);
            }
        });
    }
}
