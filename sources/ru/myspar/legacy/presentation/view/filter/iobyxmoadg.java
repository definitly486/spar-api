package ru.myspar.legacy.presentation.view.filter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.cardview.widget.CardView;
import ge0.ojitshcjhn;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class iobyxmoadg extends CardView {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private ColorsUiModel f89999zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iobyxmoadg(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final int iobyxmoadg(boolean z13, ColorsUiModel.iobyxmoadg iobyxmoadgVar, int i13, int i14) {
        ColorsUiModel colorsUiModel = this.f89999zdlpuopuiu;
        if (colorsUiModel != null && z13) {
            Context context = getContext();
            zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
            return colorsUiModel.wypolnanlu(context, iobyxmoadgVar);
        }
        if (z13) {
            Context context2 = getContext();
            zdlpuopuiu.dxjokdxxww(context2, "getContext(...)");
            return c60.zoijcleaow.ppxfxbqfkf(context2, i13);
        }
        Context context3 = getContext();
        zdlpuopuiu.dxjokdxxww(context3, "getContext(...)");
        return c60.zoijcleaow.ppxfxbqfkf(context3, i14);
    }

    static /* synthetic */ int zoijcleaow(iobyxmoadg iobyxmoadgVar, boolean z13, ColorsUiModel.iobyxmoadg iobyxmoadgVar2, int i13, int i14, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getColor");
        }
        if ((i15 & 2) != 0) {
            iobyxmoadgVar2 = ColorsUiModel.iobyxmoadg.ON_PRIMARY;
        }
        if ((i15 & 4) != 0) {
            i13 = da.zoijcleaow.colorOnPrimary;
        }
        if ((i15 & 8) != 0) {
            i14 = da.zoijcleaow.colorOnSurface;
        }
        return iobyxmoadgVar.iobyxmoadg(z13, iobyxmoadgVar2, i13, i14);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i13, int i14, int i15, int i16) {
        getLayoutParams().width = i13;
        getLayoutParams().height = i14;
        setOutlineProvider(new ojitshcjhn(i13, i14, getRadius()));
    }

    protected final void ppxfxbqfkf(boolean z13) {
        setCardBackgroundColor(iobyxmoadg(z13, ColorsUiModel.iobyxmoadg.PRIMARY, lqeggnwhkg.iobyxmoadg.colorPrimary, s40.ppxfxbqfkf.colorSpecialSurface1));
        setIconTint(zoijcleaow(this, z13, null, 0, 0, 14, null));
        setTextColor(zoijcleaow(this, z13, null, 0, 0, 14, null));
    }

    public final void setColorsModel(ColorsUiModel colorsUiModel) {
        this.f89999zdlpuopuiu = colorsUiModel;
    }

    protected abstract void setIconTint(int i13);

    protected abstract void setTextColor(int i13);
}
