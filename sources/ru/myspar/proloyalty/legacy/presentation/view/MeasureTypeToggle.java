package ru.myspar.proloyalty.legacy.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.dxjokdxxww;
import ru.myspar.proloyalty.core.models.measure_type.MeasureType;
import ru.myspar.proloyalty.legacy.presentation.view.MeasureTypeToggle;
import z41.a;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R*\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/myspar/proloyalty/legacy/presentation/view/MeasureTypeToggle;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/myspar/proloyalty/core/models/measure_type/MeasureType;", "measure", "Lgg/wwaezpbzkn;", "ppxfxbqfkf", "(Lru/myspar/proloyalty/core/models/measure_type/MeasureType;)V", "", "enabled", "setEnabled", "(Z)V", "", "units", "wkgbmnqykc", "(Ljava/util/List;Lru/myspar/proloyalty/core/models/measure_type/MeasureType;)V", "Lz41/a;", "zdlpuopuiu", "Lz41/a;", "binding", "Lkotlin/Function0;", "yggfygwlhe", "Ltg/iobyxmoadg;", "getListener", "()Ltg/iobyxmoadg;", "setListener", "(Ltg/iobyxmoadg;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MeasureTypeToggle extends RelativeLayout {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private tg.iobyxmoadg listener;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final a binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MeasureTypeToggle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final void ppxfxbqfkf(MeasureType measure) {
        ViewGroup.LayoutParams layoutParams = this.binding.f127813zoijcleaow.getLayoutParams();
        zdlpuopuiu.nufgyqmvbu(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (measure instanceof MeasureType.AMOUNT) {
            layoutParams2.removeRule(21);
            layoutParams2.addRule(20, -1);
        } else {
            if (!(measure instanceof MeasureType.WEIGHT)) {
                throw new NoWhenBranchMatchedException();
            }
            layoutParams2.removeRule(20);
            layoutParams2.addRule(21, -1);
        }
        this.binding.f127813zoijcleaow.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zoijcleaow(MeasureTypeToggle measureTypeToggle, View view) {
        tg.iobyxmoadg iobyxmoadgVar = measureTypeToggle.listener;
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.invoke();
        }
    }

    public final tg.iobyxmoadg getListener() {
        return this.listener;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.binding.f127809gxszxtbevo.setEnabled(enabled);
    }

    public final void setListener(tg.iobyxmoadg iobyxmoadgVar) {
        this.listener = iobyxmoadgVar;
    }

    public final void wkgbmnqykc(List units, MeasureType measure) {
        zdlpuopuiu.btonecajqb(units, "units");
        zdlpuopuiu.btonecajqb(measure, "measure");
        int iIndexOf = units.indexOf(measure);
        if (iIndexOf < 0) {
            return;
        }
        ppxfxbqfkf((MeasureType) units.get(iIndexOf));
    }

    public /* synthetic */ MeasureTypeToggle(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeasureTypeToggle(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        a aVarPpxfxbqfkf = a.ppxfxbqfkf(dxjokdxxww.nufgyqmvbu(this), this, true);
        zdlpuopuiu.dxjokdxxww(aVarPpxfxbqfkf, "inflate(...)");
        this.binding = aVarPpxfxbqfkf;
        aVarPpxfxbqfkf.f127809gxszxtbevo.setOnClickListener(new View.OnClickListener() { // from class: bc1.gtknphoqwx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeasureTypeToggle.zoijcleaow(this.f15754zdlpuopuiu, view);
            }
        });
    }
}
