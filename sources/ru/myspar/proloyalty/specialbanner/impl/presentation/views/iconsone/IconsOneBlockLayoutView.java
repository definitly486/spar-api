package ru.myspar.proloyalty.specialbanner.impl.presentation.views.iconsone;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import as1.zoijcleaow;
import b31.eablkybsjg;
import c31.gxszxtbevo;
import gr1.iobyxmoadg;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import p41.dxjokdxxww;
import z41.ipoelvxyzq;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/myspar/proloyalty/specialbanner/impl/presentation/views/iconsone/IconsOneBlockLayoutView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Las1/zoijcleaow;", "data", "Lgg/wwaezpbzkn;", "setData", "(Las1/zoijcleaow;)V", "Lz41/ipoelvxyzq;", "zdlpuopuiu", "Lz41/ipoelvxyzq;", "binding", "Lgr1/iobyxmoadg;", "yggfygwlhe", "Lgr1/iobyxmoadg;", "iconsOneBlockAdapter", "Lc31/gxszxtbevo;", "jyumaefscl", "Lc31/gxszxtbevo;", "itemDecoration", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IconsOneBlockLayoutView extends FrameLayout {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata */
    private final gxszxtbevo itemDecoration;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final iobyxmoadg iconsOneBlockAdapter;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private ipoelvxyzq binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IconsOneBlockLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    public final void setData(zoijcleaow data) {
        zdlpuopuiu.btonecajqb(data, "data");
        this.iconsOneBlockAdapter.wkgbmnqykc(data.iobyxmoadg());
    }

    public /* synthetic */ IconsOneBlockLayoutView(Context context, AttributeSet attributeSet, int i13, int i14, gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconsOneBlockLayoutView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        ipoelvxyzq ipoelvxyzqVarZoijcleaow = ipoelvxyzq.zoijcleaow(dxjokdxxww.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(ipoelvxyzqVarZoijcleaow, "inflate(...)");
        this.binding = ipoelvxyzqVarZoijcleaow;
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
        this.iconsOneBlockAdapter = iobyxmoadgVar;
        gxszxtbevo gxszxtbevoVar = new gxszxtbevo(context, eablkybsjg.content_margin_24, false, 4, null);
        this.itemDecoration = gxszxtbevoVar;
        RecyclerView recyclerView = this.binding.f128114zoijcleaow;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.btonecajqb(gxszxtbevoVar);
        recyclerView.setAdapter(iobyxmoadgVar);
    }
}
