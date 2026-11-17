package ru.myspar.specialbanner.impl.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import gg.gtknphoqwx;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.v;
import p62.ppxfxbqfkf;
import p62.wkgbmnqykc;
import r52.agtfadlqog;
import r52.nufgyqmvbu;
import ru.myspar.specialbanner.impl.presentation.views.VerticalPromoBlockLayoutView;
import tg.draadjrbmk;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/myspar/specialbanner/impl/presentation/views/VerticalPromoBlockLayoutView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp62/wkgbmnqykc;", "data", "Lgg/wwaezpbzkn;", "setData", "(Lp62/wkgbmnqykc;)V", "Lkotlin/Function1;", "Lp62/ppxfxbqfkf;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "(Ltg/draadjrbmk;)V", "zdlpuopuiu", "Ltg/draadjrbmk;", "Lm60/v;", "yggfygwlhe", "Lm60/v;", "binding", "Lr52/nufgyqmvbu;", "jyumaefscl", "Lgg/gtknphoqwx;", "getProductsBlockAdapter", "()Lr52/nufgyqmvbu;", "productsBlockAdapter", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VerticalPromoBlockLayoutView extends FrameLayout {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx productsBlockAdapter;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private v binding;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk listener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VerticalPromoBlockLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final nufgyqmvbu getProductsBlockAdapter() {
        return (nufgyqmvbu) this.productsBlockAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nufgyqmvbu ppxfxbqfkf(final VerticalPromoBlockLayoutView verticalPromoBlockLayoutView) {
        return new nufgyqmvbu(new draadjrbmk() { // from class: b72.jyumaefscl
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return VerticalPromoBlockLayoutView.wkgbmnqykc(this.f15452zdlpuopuiu, (p62.ppxfxbqfkf) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn wkgbmnqykc(VerticalPromoBlockLayoutView verticalPromoBlockLayoutView, ppxfxbqfkf it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmk draadjrbmkVar = verticalPromoBlockLayoutView.listener;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(it);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void setData(wkgbmnqykc data) {
        zdlpuopuiu.btonecajqb(data, "data");
        getProductsBlockAdapter().wkgbmnqykc(data.eablkybsjg());
    }

    public final void setListener(draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.listener = listener;
    }

    public /* synthetic */ VerticalPromoBlockLayoutView(Context context, AttributeSet attributeSet, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalPromoBlockLayoutView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        v vVarZoijcleaow = v.zoijcleaow(c60.nufgyqmvbu.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(vVarZoijcleaow, "inflate(...)");
        this.binding = vVarZoijcleaow;
        this.productsBlockAdapter = gg.draadjrbmk.zoijcleaow(new iobyxmoadg() { // from class: b72.yggfygwlhe
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return VerticalPromoBlockLayoutView.ppxfxbqfkf(this.f15463zdlpuopuiu);
            }
        });
        v vVar = this.binding;
        vVar.f66038zoijcleaow.setLayoutManager(new LinearLayoutManager(context));
        vVar.f66038zoijcleaow.setAdapter(getProductsBlockAdapter());
        vVar.f66038zoijcleaow.btonecajqb(new agtfadlqog());
    }
}
