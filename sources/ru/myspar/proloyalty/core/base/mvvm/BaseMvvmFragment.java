package ru.myspar.proloyalty.core.base.mvvm;

import androidx.core.content.zoijcleaow;
import kotlin.Metadata;
import pw0.iobyxmoadg;
import ru.myspar.proloyalty.core.base.api.fragment.BaseFragment;
import sw0.eablkybsjg;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b'\u0018\u0000*\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\u00020\u0003B\u0013\b\u0016\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00018$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/myspar/proloyalty/core/base/mvvm/BaseMvvmFragment;", "Lsw0/eablkybsjg;", "VM", "Lru/myspar/proloyalty/core/base/api/fragment/BaseFragment;", "", "layoutId", "<init>", "(I)V", "()V", "Lgg/wwaezpbzkn;", "ylkuphrtab", "onStart", "onStop", "", "isHidden", "onHiddenChanged", "(Z)V", "wwaezpbzkn", "()Lsw0/eablkybsjg;", "viewModel", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseMvvmFragment<VM extends eablkybsjg> extends BaseFragment {
    public BaseMvvmFragment(int i13) {
        super(i13);
    }

    private final void ylkuphrtab() {
        zoijcleaow zoijcleaowVarRequireActivity = requireActivity();
        pw0.zoijcleaow zoijcleaowVar = zoijcleaowVarRequireActivity instanceof pw0.zoijcleaow ? (pw0.zoijcleaow) zoijcleaowVarRequireActivity : null;
        if (zoijcleaowVar != null) {
            zoijcleaowVar.iobyxmoadg(this);
        }
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean isHidden) {
        super.onHiddenChanged(isHidden);
        if (isVisible()) {
            ylkuphrtab();
        }
        wwaezpbzkn().jyumaefscl(new iobyxmoadg.C1718iobyxmoadg(isHidden));
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (!isHidden()) {
            ylkuphrtab();
        }
        wwaezpbzkn().jyumaefscl(iobyxmoadg.zoijcleaow.f77388iobyxmoadg);
    }

    @Override // ru.myspar.proloyalty.core.base.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onStop() {
        wwaezpbzkn().jyumaefscl(iobyxmoadg.ppxfxbqfkf.f77387iobyxmoadg);
        super.onStop();
    }

    protected abstract eablkybsjg wwaezpbzkn();

    public BaseMvvmFragment() {
    }
}
