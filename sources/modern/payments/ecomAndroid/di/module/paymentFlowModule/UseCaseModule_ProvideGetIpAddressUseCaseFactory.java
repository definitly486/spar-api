package modern.payments.ecomAndroid.di.module.paymentFlowModule;

import ag.dxjokdxxww;
import ag.wkgbmnqykc;
import fg.iobyxmoadg;
import modern.payments.ecomAndroid.domain.provider.IpAddressProvider;
import modern.payments.ecomAndroid.domain.repository.UnsafeEcomApiRepository;
import modern.payments.ecomAndroid.domain.useCase.GetIpAddressUseCase;

/* JADX INFO: loaded from: classes3.dex */
public final class UseCaseModule_ProvideGetIpAddressUseCaseFactory implements wkgbmnqykc {
    private final iobyxmoadg ipAddressProvider;
    private final UseCaseModule module;
    private final iobyxmoadg unsafeEcomApiRepositoryProvider;

    public UseCaseModule_ProvideGetIpAddressUseCaseFactory(UseCaseModule useCaseModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
        this.module = useCaseModule;
        this.unsafeEcomApiRepositoryProvider = iobyxmoadgVar;
        this.ipAddressProvider = iobyxmoadgVar2;
    }

    public static UseCaseModule_ProvideGetIpAddressUseCaseFactory create(UseCaseModule useCaseModule, iobyxmoadg iobyxmoadgVar, iobyxmoadg iobyxmoadgVar2) {
        return new UseCaseModule_ProvideGetIpAddressUseCaseFactory(useCaseModule, iobyxmoadgVar, iobyxmoadgVar2);
    }

    public static GetIpAddressUseCase provideGetIpAddressUseCase(UseCaseModule useCaseModule, UnsafeEcomApiRepository unsafeEcomApiRepository, IpAddressProvider ipAddressProvider) {
        return (GetIpAddressUseCase) dxjokdxxww.eablkybsjg(useCaseModule.provideGetIpAddressUseCase(unsafeEcomApiRepository, ipAddressProvider));
    }

    @Override // fg.iobyxmoadg
    public GetIpAddressUseCase get() {
        return provideGetIpAddressUseCase(this.module, (UnsafeEcomApiRepository) this.unsafeEcomApiRepositoryProvider.get(), (IpAddressProvider) this.ipAddressProvider.get());
    }
}
