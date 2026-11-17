package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import android.content.Context;
import fg.iobyxmoadg;
import lk.lereixgezr;
import modern.payments.ecomAndroid.util.CoilImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class CoilModule_ProvideCoilFactory implements wkgbmnqykc {
    private final iobyxmoadg contextProvider;
    private final CoilModule module;
    private final iobyxmoadg okHttpClientProvider;

    public CoilModule_ProvideCoilFactory(CoilModule coilModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
        this.module = coilModule;
        this.contextProvider = iobyxmoadgVar;
        this.okHttpClientProvider = iobyxmoadgVar2;
    }

    public static CoilModule_ProvideCoilFactory create(CoilModule coilModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
        return new CoilModule_ProvideCoilFactory(coilModule, iobyxmoadgVar, iobyxmoadgVar2);
    }

    public static CoilImpl provideCoil(CoilModule coilModule, Context context, lereixgezr lereixgezrVar) {
        return (CoilImpl) dxjokdxxww.eablkybsjg(coilModule.provideCoil(context, lereixgezrVar));
    }

    @Override // fg.iobyxmoadg
    public CoilImpl get() {
        return provideCoil(this.module, (Context) this.contextProvider.get(), (lereixgezr) this.okHttpClientProvider.get());
    }
}
