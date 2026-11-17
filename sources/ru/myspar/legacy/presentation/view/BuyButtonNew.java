package ru.myspar.legacy.presentation.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import c60.nufgyqmvbu;
import com.google.android.material.textview.MaterialTextView;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.krqnebusok;
import ru.myspar.core.domain.models.ColorsUiModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001\rB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R*\u0010 \u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u000eR$\u0010'\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/myspar/legacy/presentation/view/BuyButtonNew;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lge0/zoijcleaow;", "state", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Lge0/zoijcleaow;)V", "", "enabled", "setEnabled", "(Z)V", "Lru/myspar/core/domain/models/ColorsUiModel;", "colorsModel", "setColorsModel", "(Lru/myspar/core/domain/models/ColorsUiModel;)V", "Lm60/krqnebusok;", "zdlpuopuiu", "Lm60/krqnebusok;", "binding", "yggfygwlhe", "Lge0/zoijcleaow;", "getButtonState", "()Lge0/zoijcleaow;", "setButtonState", "buttonState", "", "value", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "jyumaefscl", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BuyButtonNew extends FrameLayout {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private ge0.zoijcleaow buttonState;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final krqnebusok binding;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final int f89921iwizpuwonk = 8;

    public /* synthetic */ class zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f89925iobyxmoadg;

        static {
            int[] iArr = new int[ge0.zoijcleaow.values().length];
            try {
                iArr[ge0.zoijcleaow.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ge0.zoijcleaow.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ge0.zoijcleaow.PROGRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ge0.zoijcleaow.UNDEFINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f89925iobyxmoadg = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyButtonNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final void iobyxmoadg(ge0.zoijcleaow state) {
        int i13 = zoijcleaow.f89925iobyxmoadg[state.ordinal()];
        if (i13 == 1 || i13 == 2) {
            this.binding.f65713zoijcleaow.setAlpha(0.0f);
            MaterialTextView tvTitle = this.binding.f65712ppxfxbqfkf;
            zdlpuopuiu.dxjokdxxww(tvTitle, "tvTitle");
            tvTitle.setVisibility(0);
            setEnabled(true);
            return;
        }
        if (i13 == 3) {
            this.binding.f65713zoijcleaow.setAlpha(1.0f);
            MaterialTextView tvTitle2 = this.binding.f65712ppxfxbqfkf;
            zdlpuopuiu.dxjokdxxww(tvTitle2, "tvTitle");
            tvTitle2.setVisibility(8);
            setEnabled(false);
            return;
        }
        if (i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        this.binding.f65713zoijcleaow.setAlpha(0.0f);
        MaterialTextView tvTitle3 = this.binding.f65712ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvTitle3, "tvTitle");
        tvTitle3.setVisibility(8);
        setEnabled(false);
    }

    public final ge0.zoijcleaow getButtonState() {
        return this.buttonState;
    }

    public final String getText() {
        return this.binding.f65712ppxfxbqfkf.getText().toString();
    }

    public final void setButtonState(ge0.zoijcleaow state) {
        zdlpuopuiu.btonecajqb(state, "state");
        this.buttonState = state;
        iobyxmoadg(state);
    }

    public final void setColorsModel(ColorsUiModel colorsModel) {
        zdlpuopuiu.btonecajqb(colorsModel, "colorsModel");
        Context context = getContext();
        zdlpuopuiu.dxjokdxxww(context, "getContext(...)");
        ColorStateList colorStateListOkpsazkaxt = colorsModel.okpsazkaxt(context, ColorsUiModel.iobyxmoadg.PRIMARY);
        Context context2 = getContext();
        zdlpuopuiu.dxjokdxxww(context2, "getContext(...)");
        int iWypolnanlu = colorsModel.wypolnanlu(context2, ColorsUiModel.iobyxmoadg.ON_PRIMARY);
        this.binding.getRoot().setBackgroundTintMode(PorterDuff.Mode.SRC_ATOP);
        this.binding.getRoot().setBackgroundTintList(colorStateListOkpsazkaxt);
        this.binding.f65712ppxfxbqfkf.setTextColor(iWypolnanlu);
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.binding.getRoot().setEnabled(enabled);
        this.binding.f65712ppxfxbqfkf.setEnabled(enabled);
    }

    public final void setText(String value) {
        zdlpuopuiu.btonecajqb(value, "value");
        this.binding.f65712ppxfxbqfkf.setText(value);
    }

    public /* synthetic */ BuyButtonNew(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyButtonNew(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        krqnebusok krqnebusokVarPpxfxbqfkf = krqnebusok.ppxfxbqfkf(nufgyqmvbu.nufgyqmvbu(this), this, true);
        zdlpuopuiu.dxjokdxxww(krqnebusokVarPpxfxbqfkf, "inflate(...)");
        this.binding = krqnebusokVarPpxfxbqfkf;
        this.buttonState = ge0.zoijcleaow.UNDEFINED;
    }
}
