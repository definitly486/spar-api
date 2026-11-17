package ru.myspar.legacy.presentation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c60.nufgyqmvbu;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import e60.zoijcleaow;
import gg.wwaezpbzkn;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import m60.eslsurpljm;
import pm.dxjokdxxww;
import ru.myspar.legacy.presentation.view.BrandLayoutView;
import s40.eablkybsjg;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R6\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/myspar/legacy/presentation/view/BrandLayoutView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lmb0/iobyxmoadg;", "brands", "Lgg/wwaezpbzkn;", "setData", "(Ljava/util/List;)V", "", "isVisible", "setHeaderVisibility", "(Z)V", "Lkotlin/Function2;", "zdlpuopuiu", "Ltg/rgvfuqvkyq;", "getListener", "()Ltg/rgvfuqvkyq;", "setListener", "(Ltg/rgvfuqvkyq;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lm60/eslsurpljm;", "yggfygwlhe", "Lm60/eslsurpljm;", "binding", "Lva0/iobyxmoadg;", "jyumaefscl", "Lva0/iobyxmoadg;", "brandsAdapter", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "legacy_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BrandLayoutView extends LinearLayout {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final va0.iobyxmoadg brandsAdapter;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private eslsurpljm binding;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private rgvfuqvkyq listener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrandLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wwaezpbzkn zoijcleaow(BrandLayoutView brandLayoutView, mb0.iobyxmoadg item, int i13) {
        zdlpuopuiu.btonecajqb(item, "item");
        rgvfuqvkyq rgvfuqvkyqVar = brandLayoutView.listener;
        if (rgvfuqvkyqVar != null) {
            rgvfuqvkyqVar.invoke(item, Integer.valueOf(i13));
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public final rgvfuqvkyq getListener() {
        return this.listener;
    }

    public final RecyclerView getRecyclerView() {
        RecyclerView rvBrands = this.binding.f65496zoijcleaow;
        zdlpuopuiu.dxjokdxxww(rvBrands, "rvBrands");
        return rvBrands;
    }

    public final void setData(List<mb0.iobyxmoadg> brands) {
        zdlpuopuiu.btonecajqb(brands, "brands");
        this.brandsAdapter.wkgbmnqykc(brands);
        eslsurpljm eslsurpljmVar = this.binding;
        RecyclerView rvBrands = eslsurpljmVar.f65496zoijcleaow;
        zdlpuopuiu.dxjokdxxww(rvBrands, "rvBrands");
        zoijcleaow.iobyxmoadg(rvBrands, brands);
        eslsurpljmVar.f65495ppxfxbqfkf.setText(getContext().getString(dxjokdxxww.title_brands));
    }

    public final void setHeaderVisibility(boolean isVisible) {
        TextView tvBrandsCaption = this.binding.f65495ppxfxbqfkf;
        zdlpuopuiu.dxjokdxxww(tvBrandsCaption, "tvBrandsCaption");
        tvBrandsCaption.setVisibility(isVisible ? 0 : 8);
    }

    public final void setListener(rgvfuqvkyq rgvfuqvkyqVar) {
        this.listener = rgvfuqvkyqVar;
    }

    public /* synthetic */ BrandLayoutView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandLayoutView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        eslsurpljm eslsurpljmVarZoijcleaow = eslsurpljm.zoijcleaow(nufgyqmvbu.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(eslsurpljmVarZoijcleaow, "inflate(...)");
        this.binding = eslsurpljmVarZoijcleaow;
        va0.iobyxmoadg iobyxmoadgVar = new va0.iobyxmoadg(new rgvfuqvkyq() { // from class: ge0.iobyxmoadg
            @Override // tg.rgvfuqvkyq
            public final Object invoke(Object obj, Object obj2) {
                return BrandLayoutView.zoijcleaow(this.f36986zdlpuopuiu, (mb0.iobyxmoadg) obj, ((Integer) obj2).intValue());
            }
        });
        this.brandsAdapter = iobyxmoadgVar;
        setOrientation(1);
        RecyclerView recyclerView = this.binding.f65496zoijcleaow;
        recyclerView.setOnFlingListener(null);
        zdlpuopuiu.lqeggnwhkg(recyclerView);
        zoijcleaow.ppxfxbqfkf(recyclerView, iobyxmoadgVar, this.binding);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(eablkybsjg.content_margin_4);
        recyclerView.btonecajqb(new t40.nufgyqmvbu(dimensionPixelSize, 0, dimensionPixelSize, 0, 0, 0, false, false, 250, null));
    }
}
