package ru.myspar.proloyalty.scango.impl.component.presentation;

import android.content.Context;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import ho1.zoijcleaow;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import ru.myspar.proloyalty.core.base.mvvm.BaseMvvmFragment;
import ru.myspar.proloyalty.scango.impl.component.presentation.BaseScanGoMvvmFragment;
import sw0.eablkybsjg;
import tg.iobyxmoadg;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/myspar/proloyalty/scango/impl/component/presentation/BaseScanGoMvvmFragment;", "Lsw0/eablkybsjg;", "VM", "Lru/myspar/proloyalty/core/base/mvvm/BaseMvvmFragment;", "", "contentLayoutId", "<init>", "(I)V", "Lho1/zoijcleaow;", "zdlpuopuiu", "Lgg/gtknphoqwx;", "getLoadingDialog", "()Lho1/zoijcleaow;", "loadingDialog", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseScanGoMvvmFragment<VM extends eablkybsjg> extends BaseMvvmFragment<VM> {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final gtknphoqwx loadingDialog;

    public BaseScanGoMvvmFragment(int i13) {
        super(i13);
        this.loadingDialog = draadjrbmk.zoijcleaow(new iobyxmoadg() { // from class: fo1.zoijcleaow
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return BaseScanGoMvvmFragment.hcddaimhww(this.f34494zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zoijcleaow hcddaimhww(BaseScanGoMvvmFragment baseScanGoMvvmFragment) {
        Context contextRequireContext = baseScanGoMvvmFragment.requireContext();
        zdlpuopuiu.dxjokdxxww(contextRequireContext, "requireContext(...)");
        return new zoijcleaow(contextRequireContext);
    }
}
