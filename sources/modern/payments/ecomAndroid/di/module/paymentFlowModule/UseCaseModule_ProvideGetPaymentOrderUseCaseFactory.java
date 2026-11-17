package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository;
import modern.payments.ecomAndroid.domain.useCase.GetPaymentOrderUseCase;
import modern.payments.ecomAndroid.util.jsonParamHelper.JsonParamHelperUtil;

/* JADX INFO: loaded from: classes3.dex */
public final class UseCaseModule_ProvideGetPaymentOrderUseCaseFactory implements wkgbmnqykc {
    private final iobyxmoadg ecomApiRepositoryProvider;
    private final iobyxmoadg jsonParamHelperUtilProvider;
    private final iobyxmoadg merchantDataProvider;
    private final UseCaseModule module;
    private final iobyxmoadg reducerProvider;
    private final iobyxmoadg stateHandlerProvider;

    public UseCaseModule_ProvideGetPaymentOrderUseCaseFactory(UseCaseModule useCaseModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5) {
        this.module = useCaseModule;
        this.ecomApiRepositoryProvider = iobyxmoadgVar;
        this.reducerProvider = iobyxmoadgVar2;
        this.merchantDataProvider = iobyxmoadgVar3;
        this.jsonParamHelperUtilProvider = iobyxmoadgVar4;
        this.stateHandlerProvider = iobyxmoadgVar5;
    }

    public static UseCaseModule_ProvideGetPaymentOrderUseCaseFactory create(UseCaseModule useCaseModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2, iobyxmoadg iobyxmoadgVar3, iobyxmoadg iobyxmoadgVar4, iobyxmoadg iobyxmoadgVar5) {
        return new UseCaseModule_ProvideGetPaymentOrderUseCaseFactory(useCaseModule, iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5);
    }

    public static GetPaymentOrderUseCase provideGetPaymentOrderUseCase(UseCaseModule useCaseModule, SafeEcomApiRepository safeEcomApiRepository, Reducer reducer, MerchantDataProvider merchantDataProvider, JsonParamHelperUtil jsonParamHelperUtil, StateHandler stateHandler) {
        return (GetPaymentOrderUseCase) dxjokdxxww.eablkybsjg(useCaseModule.provideGetPaymentOrderUseCase(safeEcomApiRepository, reducer, merchantDataProvider, jsonParamHelperUtil, stateHandler));
    }

    @Override // fg.iobyxmoadg
    public GetPaymentOrderUseCase get() {
        return provideGetPaymentOrderUseCase(this.module, (SafeEcomApiRepository) this.ecomApiRepositoryProvider.get(), (Reducer) this.reducerProvider.get(), (MerchantDataProvider) this.merchantDataProvider.get(), (JsonParamHelperUtil) this.jsonParamHelperUtilProvider.get(), (StateHandler) this.stateHandlerProvider.get());
    }
}
