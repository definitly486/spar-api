package ru.myspar.proloyalty.core.base.api.bottomsheet;

import android.view.View;
import b31.agtfadlqog;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import w11.iobyxmoadg;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0014"}, d2 = {"Lru/myspar/proloyalty/core/base/api/bottomsheet/BaseBottomSheetDialogFragment;", "Lru/myspar/proloyalty/core/base/api/bottomsheet/FixedBottomSheetFragment;", "", "layoutId", "<init>", "(I)V", "getTheme", "()I", "", "error", "Lgg/wwaezpbzkn;", "sopmlzcsov", "(Ljava/lang/Throwable;)V", "Landroid/view/View;", "bottomSheet", "ulzqkzuiru", "(Landroid/view/View;)V", "esjtqupxsv", "I", "cllcsxoeiz", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseBottomSheetDialogFragment extends FixedBottomSheetFragment {

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name and from kotlin metadata */
    private final int layoutId;

    public BaseBottomSheetDialogFragment(int i13) {
        super(i13);
        this.layoutId = i13;
    }

    @Override // ru.myspar.proloyalty.core.base.api.bottomsheet.FixedBottomSheetFragment
    /* JADX INFO: renamed from: cllcsxoeiz, reason: from getter */
    public int getLayoutId() {
        return this.layoutId;
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return agtfadlqog.AppBottomSheetDialogTheme;
    }

    protected final void sopmlzcsov(Throwable error) {
        zdlpuopuiu.btonecajqb(error, "error");
        iobyxmoadg.f118559iobyxmoadg.zoijcleaow(error);
    }

    protected final void ulzqkzuiru(View bottomSheet) {
        zdlpuopuiu.btonecajqb(bottomSheet, "bottomSheet");
        bottomSheet.getLayoutParams().height = -2;
    }
}
