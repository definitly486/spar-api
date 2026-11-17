package ru.myspar.specialbanner.impl.presentation.views.map;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import b52.zynmafqrjb;
import c60.nufgyqmvbu;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import java.util.List;
import k62.zoijcleaow;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import p52.gxszxtbevo;
import ru.myspar.specialbanner.impl.presentation.views.map.ShopServicesView;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/myspar/specialbanner/impl/presentation/views/map/ShopServicesView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lk62/zoijcleaow;", "data", "Lgg/wwaezpbzkn;", "setData", "(Ljava/util/List;)V", "Lb52/zynmafqrjb;", "zdlpuopuiu", "Lb52/zynmafqrjb;", "binding", "Lp52/gxszxtbevo;", "yggfygwlhe", "Lgg/gtknphoqwx;", "getServiceAdapter", "()Lp52/gxszxtbevo;", "serviceAdapter", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShopServicesView extends FrameLayout {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx serviceAdapter;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final zynmafqrjb binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShopServicesView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final gxszxtbevo getServiceAdapter() {
        return (gxszxtbevo) this.serviceAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gxszxtbevo zoijcleaow() {
        return new gxszxtbevo();
    }

    public final void setData(List<zoijcleaow> data) {
        zdlpuopuiu.btonecajqb(data, "data");
        getServiceAdapter().wkgbmnqykc(data);
    }

    public /* synthetic */ ShopServicesView(Context context, AttributeSet attributeSet, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopServicesView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        zynmafqrjb zynmafqrjbVarZoijcleaow = zynmafqrjb.zoijcleaow(nufgyqmvbu.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(zynmafqrjbVarZoijcleaow, "inflate(...)");
        this.binding = zynmafqrjbVarZoijcleaow;
        this.serviceAdapter = draadjrbmk.zoijcleaow(new iobyxmoadg() { // from class: c72.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return ShopServicesView.zoijcleaow();
            }
        });
        zynmafqrjbVarZoijcleaow.f15355zoijcleaow.setLayoutManager(new LinearLayoutManager(context, 0, false));
        zynmafqrjbVarZoijcleaow.f15355zoijcleaow.setAdapter(getServiceAdapter());
    }
}
