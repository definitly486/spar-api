package ru.myspar.proloyalty.specialbanner.impl.presentation.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ls1.zoijcleaow;
import mr1.eablkybsjg;
import p41.dxjokdxxww;
import ru.myspar.proloyalty.specialbanner.impl.presentation.views.TableBlockLayoutView;
import tg.iobyxmoadg;
import z41.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/myspar/proloyalty/specialbanner/impl/presentation/views/TableBlockLayoutView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lls1/zoijcleaow;", "data", "Lgg/wwaezpbzkn;", "setData", "(Lls1/zoijcleaow;)V", "spanCount", "setSpanCount", "(I)V", "Lz41/l;", "zdlpuopuiu", "Lz41/l;", "binding", "Lmr1/eablkybsjg;", "yggfygwlhe", "Lgg/gtknphoqwx;", "getTableAdapter", "()Lmr1/eablkybsjg;", "tableAdapter", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TableBlockLayoutView extends FrameLayout {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx tableAdapter;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private l binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TableBlockLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        zdlpuopuiu.btonecajqb(context, "context");
    }

    private final eablkybsjg getTableAdapter() {
        return (eablkybsjg) this.tableAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eablkybsjg zoijcleaow() {
        return new eablkybsjg();
    }

    public final void setData(zoijcleaow data) {
        zdlpuopuiu.btonecajqb(data, "data");
        getTableAdapter().wkgbmnqykc(data.iobyxmoadg());
    }

    public final void setSpanCount(int spanCount) {
        RecyclerView.rgvfuqvkyq layoutManager = this.binding.f128228zoijcleaow.getLayoutManager();
        zdlpuopuiu.nufgyqmvbu(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        ((GridLayoutManager) layoutManager).x1(spanCount);
    }

    public /* synthetic */ TableBlockLayoutView(Context context, AttributeSet attributeSet, int i13, int i14, kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TableBlockLayoutView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        zdlpuopuiu.btonecajqb(context, "context");
        l lVarZoijcleaow = l.zoijcleaow(dxjokdxxww.nufgyqmvbu(this), this);
        zdlpuopuiu.dxjokdxxww(lVarZoijcleaow, "inflate(...)");
        this.binding = lVarZoijcleaow;
        this.tableAdapter = draadjrbmk.zoijcleaow(new iobyxmoadg() { // from class: vs1.zdlpuopuiu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return TableBlockLayoutView.zoijcleaow();
            }
        });
        RecyclerView recyclerView = this.binding.f128228zoijcleaow;
        recyclerView.setAdapter(getTableAdapter());
        recyclerView.setLayoutManager(new GridLayoutManager(context, 2));
    }
}
