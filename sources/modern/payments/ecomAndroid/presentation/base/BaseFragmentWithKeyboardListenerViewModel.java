package modern.payments.ecomAndroid.presentation.base;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.ConfigRepository;
import sj.dxjokdxxww;
import sj.kegysxyocb;
import sj.wypolnanlu;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/presentation/base/BaseFragmentWithKeyboardListenerViewModel;", "ActionEvent", "Lmodern/payments/ecomAndroid/presentation/base/BaseViewModel;", "Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;", "configRepository", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "reducer", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/ConfigRepository;Lmodern/payments/ecomAndroid/domain/reducer/Reducer;)V", "Lmodern/payments/ecomAndroid/presentation/base/KeyboardState;", "state", "Lgg/wwaezpbzkn;", "setKeyboardVisibility", "(Lmodern/payments/ecomAndroid/presentation/base/KeyboardState;)V", "Lsj/zynmafqrjb;", "_isKeyboardVisible", "Lsj/zynmafqrjb;", "Lsj/wypolnanlu;", "isKeyboardVisible", "Lsj/wypolnanlu;", "()Lsj/wypolnanlu;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class BaseFragmentWithKeyboardListenerViewModel<ActionEvent> extends BaseViewModel<ActionEvent> {
    private final zynmafqrjb _isKeyboardVisible;
    private final wypolnanlu isKeyboardVisible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFragmentWithKeyboardListenerViewModel(ConfigRepository configRepository, Reducer reducer) {
        super(configRepository, reducer);
        zdlpuopuiu.btonecajqb(configRepository, "configRepository");
        zdlpuopuiu.btonecajqb(reducer, "reducer");
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(new KeyboardState(false, 0, 3, null));
        this._isKeyboardVisible = zynmafqrjbVarIobyxmoadg;
        this.isKeyboardVisible = dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
    }

    /* JADX INFO: renamed from: isKeyboardVisible, reason: from getter */
    public final wypolnanlu getIsKeyboardVisible() {
        return this.isKeyboardVisible;
    }

    public void setKeyboardVisibility(KeyboardState state) {
        zdlpuopuiu.btonecajqb(state, "state");
        this._isKeyboardVisible.setValue(state);
    }
}
