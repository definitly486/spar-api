package ru.myspar.legacy.presentation.view.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import c60.nufgyqmvbu;
import c60.wkgbmnqykc;
import ge0.ojitshcjhn;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.b;
import ru.myspar.legacy.presentation.view.components.ChipView;
import s40.agtfadlqog;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010$\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u000eR$\u0010*\u001a\u00020%2\u0006\u0010\u0015\u001a\u00020%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lru/myspar/legacy/presentation/view/components/ChipView;", "Landroidx/cardview/widget/CardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "selected", "Lgg/wwaezpbzkn;", "setSelected", "(Z)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "value", "zdlpuopuiu", "I", "getIcon", "()I", "setIcon", "(I)V", "icon", "Lm60/b;", "yggfygwlhe", "Lm60/b;", "binding", "getIconIsVisible", "()Z", "setIconIsVisible", "iconIsVisible", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "jyumaefscl", "iobyxmoadg", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChipView extends CardView {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final b binding;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private int icon;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public static final int f89993iwizpuwonk = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final boolean getIconIsVisible() {
        AppCompatImageView ivIcon = this.binding.f65353zoijcleaow;
        zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
        return ivIcon.getVisibility() == 0;
    }

    private final void setIconIsVisible(boolean z13) {
        AppCompatImageView ivIcon = this.binding.f65353zoijcleaow;
        zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
        ivIcon.setVisibility(z13 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zoijcleaow(ChipView chipView, TypedArray use) {
        zdlpuopuiu.btonecajqb(use, "$this$use");
        String string = use.getString(agtfadlqog.ChipView_title);
        if (string == null) {
            string = "";
        }
        chipView.setTitle(string);
        chipView.setIcon(use.getResourceId(agtfadlqog.ChipView_icon, -1));
        chipView.setIconIsVisible(chipView.icon != -1);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.binding.f65352ppxfxbqfkf.getText().toString();
    }

    @Override // android.view.View
    protected void onSizeChanged(int w13, int h13, int oldw, int oldh) {
        setOutlineProvider(new ojitshcjhn(w13, h13, this.binding.getRoot().getRadius()));
    }

    public final void setIcon(int i13) {
        this.icon = i13;
        if (i13 != -1) {
            AppCompatImageView ivIcon = this.binding.f65353zoijcleaow;
            zdlpuopuiu.dxjokdxxww(ivIcon, "ivIcon");
            wkgbmnqykc.iobyxmoadg(ivIcon, i13);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        this.binding.f65352ppxfxbqfkf.setSelected(selected);
        this.binding.f65353zoijcleaow.setSelected(selected);
        super.setSelected(selected);
    }

    public final void setTitle(String value) {
        zdlpuopuiu.btonecajqb(value, "value");
        this.binding.f65352ppxfxbqfkf.setText(value);
    }

    public /* synthetic */ ChipView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        this.icon = -1;
        b bVarPpxfxbqfkf = b.ppxfxbqfkf(nufgyqmvbu.nufgyqmvbu(this), this, true);
        zdlpuopuiu.dxjokdxxww(bVarPpxfxbqfkf, "inflate(...)");
        this.binding = bVarPpxfxbqfkf;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, agtfadlqog.ChipView, 0, 0);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        nufgyqmvbu.draadjrbmk(typedArrayObtainStyledAttributes, new draadjrbmk() { // from class: ie0.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return ChipView.zoijcleaow(this.f42459zdlpuopuiu, (TypedArray) obj);
            }
        });
    }
}
