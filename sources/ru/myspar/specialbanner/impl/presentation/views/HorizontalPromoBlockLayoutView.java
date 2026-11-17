package ru.myspar.specialbanner.impl.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import c60.nufgyqmvbu;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import e60.zoijcleaow;
import gg.wwaezpbzkn;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.f0;
import p62.ppxfxbqfkf;
import r52.iobyxmoadg;
import r52.lqeggnwhkg;
import ru.myspar.specialbanner.impl.presentation.views.HorizontalPromoBlockLayoutView;
import t40.dxjokdxxww;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/myspar/specialbanner/impl/presentation/views/HorizontalPromoBlockLayoutView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lp62/iobyxmoadg;", "data", "Lgg/wwaezpbzkn;", "setData", "(Lp62/iobyxmoadg;)V", "Lkotlin/Function1;", "Lp62/ppxfxbqfkf;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnPromoClickListener", "(Ltg/draadjrbmk;)V", "zdlpuopuiu", "Ltg/draadjrbmk;", "onPromoClicked", "Lm60/f0;", "yggfygwlhe", "Lm60/f0;", "binding", "Lr52/lqeggnwhkg;", "jyumaefscl", "Lr52/lqeggnwhkg;", "itemDecoration", "Lr52/iobyxmoadg;", "iwizpuwonk", "Lr52/iobyxmoadg;", "productAdapter", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HorizontalPromoBlockLayoutView extends FrameLayout {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name and from kotlin metadata */
    private final iobyxmoadg productAdapter;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final lqeggnwhkg itemDecoration;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final f0 binding;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private draadjrbmk onPromoClicked;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalPromoBlockLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zoijcleaow(HorizontalPromoBlockLayoutView horizontalPromoBlockLayoutView, ppxfxbqfkf it) {
        zdlpuopuiu.btonecajqb(it, "it");
        draadjrbmk draadjrbmkVar = horizontalPromoBlockLayoutView.onPromoClicked;
        if (draadjrbmkVar != null) {
            draadjrbmkVar.invoke(it);
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final void setData(p62.iobyxmoadg data) {
        zdlpuopuiu.btonecajqb(data, "data");
        f0 f0Var = this.binding;
        RecyclerView rvProducts = f0Var.f65503zoijcleaow;
        zdlpuopuiu.dxjokdxxww(rvProducts, "rvProducts");
        zoijcleaow.zoijcleaow(rvProducts, data.eablkybsjg().size() >= 3);
        f0Var.f65503zoijcleaow.setItemAnimator(null);
        f0Var.f65503zoijcleaow.setHasFixedSize(false);
        this.productAdapter.wkgbmnqykc(data.eablkybsjg());
    }

    public final void setOnPromoClickListener(draadjrbmk listener) {
        zdlpuopuiu.btonecajqb(listener, "listener");
        this.onPromoClicked = listener;
    }

    public /* synthetic */ HorizontalPromoBlockLayoutView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalPromoBlockLayoutView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        f0 f0VarZoijcleaow = f0.zoijcleaow(nufgyqmvbu.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(f0VarZoijcleaow, "inflate(...)");
        this.binding = f0VarZoijcleaow;
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg();
        this.itemDecoration = lqeggnwhkgVar;
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg(new draadjrbmk() { // from class: b72.iobyxmoadg
            @Override // tg.draadjrbmk
            public final Object invoke(Object obj) {
                return HorizontalPromoBlockLayoutView.zoijcleaow(this.f15451zdlpuopuiu, (p62.ppxfxbqfkf) obj);
            }
        });
        this.productAdapter = iobyxmoadgVar;
        f0VarZoijcleaow.f65503zoijcleaow.setOnFlingListener(null);
        new dxjokdxxww(0, 1, null).attachToRecyclerView(f0VarZoijcleaow.f65503zoijcleaow);
        RecyclerView rvProducts = f0VarZoijcleaow.f65503zoijcleaow;
        zdlpuopuiu.dxjokdxxww(rvProducts, "rvProducts");
        zoijcleaow.ppxfxbqfkf(rvProducts, iobyxmoadgVar, f0VarZoijcleaow);
        f0VarZoijcleaow.f65503zoijcleaow.btonecajqb(lqeggnwhkgVar);
    }
}
