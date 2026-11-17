package ru.myspar.proloyalty.legacy.presentation.view.filter;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b31.eablkybsjg;
import b31.ojitshcjhn;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.dxjokdxxww;
import tg.draadjrbmk;
import z41.lxfrhoxuzk;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ/\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aR*\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/view/filter/CategoryButton;", "Lru/myspar/proloyalty/legacy/presentation/view/filter/iobyxmoadg;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lgg/wwaezpbzkn;", "eablkybsjg", "(Landroid/util/AttributeSet;)V", "color", "setTextColor", "(I)V", "setIconTint", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "", "title", "setTitle", "(Ljava/lang/String;)V", "", "value", "yggfygwlhe", "Z", "isChecked", "()Z", "setChecked", "(Z)V", "Lz41/lxfrhoxuzk;", "jyumaefscl", "Lz41/lxfrhoxuzk;", "binding", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CategoryButton extends iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final lxfrhoxuzk binding;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private boolean isChecked;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CategoryButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final void eablkybsjg(AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, ojitshcjhn.CategoryButton);
        zdlpuopuiu.dxjokdxxww(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        dxjokdxxww.draadjrbmk(typedArrayObtainStyledAttributes, new draadjrbmk() { // from class: ru.myspar.proloyalty.legacy.presentation.view.filter.zoijcleaow
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return CategoryButton.gxszxtbevo(this.f97613zdlpuopuiu, (TypedArray) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn gxszxtbevo(CategoryButton categoryButton, TypedArray use) {
        zdlpuopuiu.btonecajqb(use, "$this$use");
        categoryButton.binding.f128257zoijcleaow.setText(use.getString(ojitshcjhn.CategoryButton_title));
        categoryButton.setChecked(use.getBoolean(ojitshcjhn.CategoryButton_checked, false));
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    @Override // ru.myspar.proloyalty.legacy.presentation.view.filter.iobyxmoadg, android.view.View
    protected void onSizeChanged(int w13, int h13, int oldw, int oldh) {
    }

    public final void setChecked(boolean z13) {
        this.isChecked = z13;
        ppxfxbqfkf(z13);
    }

    @Override // ru.myspar.proloyalty.legacy.presentation.view.filter.iobyxmoadg
    protected void setIconTint(int color) {
    }

    @Override // ru.myspar.proloyalty.legacy.presentation.view.filter.iobyxmoadg
    protected void setTextColor(int color) {
        this.binding.f128257zoijcleaow.setTextColor(color);
    }

    public final void setTitle(String title) {
        this.binding.f128257zoijcleaow.setText(title);
    }

    public /* synthetic */ CategoryButton(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryButton(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        lxfrhoxuzk lxfrhoxuzkVarZoijcleaow = lxfrhoxuzk.zoijcleaow(dxjokdxxww.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(lxfrhoxuzkVarZoijcleaow, "inflate(...)");
        this.binding = lxfrhoxuzkVarZoijcleaow;
        setRadius(getResources().getDimension(eablkybsjg.content_margin_12));
        eablkybsjg(attributeSet);
    }
}
