package modern.payments.ecomAndroid.di.module.paymentFlowModule.viewModel;

import ag.wkgbmnqykc;
import androidx.lifecycle.ntlheqmsrt;
import fg.iobyxmoadg;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewModelFactory_Factory<T> implements wkgbmnqykc {
    private final iobyxmoadg viewModelsProvider;

    public ViewModelFactory_Factory(iobyxmoadg iobyxmoadgVar) {
        this.viewModelsProvider = iobyxmoadgVar;
    }

    public static <T> ViewModelFactory_Factory<T> create(iobyxmoadg iobyxmoadgVar) {
        return new ViewModelFactory_Factory<>(iobyxmoadgVar);
    }

    public static <T> ViewModelFactory<T> newInstance(Map<Class<? extends ntlheqmsrt>, iobyxmoadg> map) {
        return new ViewModelFactory<>(map);
    }

    @Override // fg.iobyxmoadg
    public ViewModelFactory<T> get() {
        return newInstance((Map) this.viewModelsProvider.get());
    }
}
