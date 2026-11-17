package modern.payments.ecomAndroid.domain.useCase;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import io.appmetrica.analytics.impl.C4007z9;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.domain.provider.IpAddressProvider;
import modern.payments.ecomAndroid.domain.repository.UnsafeEcomApiRepository;
import modern.payments.ecomAndroid.domain.useCase.base.BaseUseCaseWithoutParamNoResponse;
import pj.cllcsxoeiz;
import pj.dxjokdxxww;
import pj.pkzmftpjix;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmodern/payments/ecomAndroid/domain/useCase/GetIpAddressUseCase;", "Lmodern/payments/ecomAndroid/domain/useCase/base/BaseUseCaseWithoutParamNoResponse;", "Lmodern/payments/ecomAndroid/domain/repository/UnsafeEcomApiRepository;", "unsafeEcomApiRepository", "Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;", "ipAddressProvider", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/UnsafeEcomApiRepository;Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;)V", "Lpj/pkzmftpjix;", "dispatcher", "Lgg/wwaezpbzkn;", "invoke", "(Lpj/pkzmftpjix;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/repository/UnsafeEcomApiRepository;", "Lmodern/payments/ecomAndroid/domain/provider/IpAddressProvider;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GetIpAddressUseCase extends BaseUseCaseWithoutParamNoResponse {
    private final IpAddressProvider ipAddressProvider;
    private final UnsafeEcomApiRepository unsafeEcomApiRepository;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.domain.useCase.GetIpAddressUseCase$invoke$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.domain.useCase.GetIpAddressUseCase$invoke$2", f = "GetIpAddressUseCase.kt", l = {C4007z9.F}, m = "invokeSuspend")
    static final class AnonymousClass2 extends draadjrbmk implements rgvfuqvkyq {
        int label;

        AnonymousClass2(lg.gxszxtbevo<? super AnonymousClass2> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return GetIpAddressUseCase.this.new AnonymousClass2(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            String str;
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                UnsafeEcomApiRepository unsafeEcomApiRepository = GetIpAddressUseCase.this.unsafeEcomApiRepository;
                this.label = 1;
                obj = UnsafeEcomApiRepository.DefaultImpls.getIpAddress$default(unsafeEcomApiRepository, null, this, 1, null);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            ContentResponse contentResponse = (ContentResponse) obj;
            if (contentResponse instanceof ContentResponse.Success) {
                str = (String) ((ContentResponse.Success) contentResponse).getData();
            } else {
                if (!(contentResponse instanceof ContentResponse.Failure)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "";
            }
            GetIpAddressUseCase.this.ipAddressProvider.updateIpAddress(str);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((AnonymousClass2) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public GetIpAddressUseCase(UnsafeEcomApiRepository unsafeEcomApiRepository, IpAddressProvider ipAddressProvider) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(unsafeEcomApiRepository, "unsafeEcomApiRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ipAddressProvider, "ipAddressProvider");
        this.unsafeEcomApiRepository = unsafeEcomApiRepository;
        this.ipAddressProvider = ipAddressProvider;
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCaseWithoutParamNoResponse
    public Object invoke(pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objLqeggnwhkg = dxjokdxxww.lqeggnwhkg(pkzmftpjixVar, new AnonymousClass2(null), gxszxtbevoVar);
        return objLqeggnwhkg == zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }
}
