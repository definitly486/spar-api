package modern.payments.ecomAndroid.domain.useCase.initialData;

import gg.wwaezpbzkn;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import mj.kcexrzcfyt;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.useCase.base.BaseUseCaseWithoutParamNoResponse;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lmodern/payments/ecomAndroid/domain/useCase/initialData/GetLocalSessionIdUseCase;", "Lmodern/payments/ecomAndroid/domain/useCase/base/BaseUseCaseWithoutParamNoResponse;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "appDataRepository", "<init>", "(Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;)V", "Lpj/pkzmftpjix;", "dispatcher", "Lgg/wwaezpbzkn;", "invoke", "(Lpj/pkzmftpjix;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GetLocalSessionIdUseCase extends BaseUseCaseWithoutParamNoResponse {
    private final AppDataRepository appDataRepository;

    public GetLocalSessionIdUseCase(AppDataRepository appDataRepository) {
        zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        this.appDataRepository = appDataRepository;
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCaseWithoutParamNoResponse
    public Object invoke(pkzmftpjix pkzmftpjixVar, gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) throws IOException {
        String string = UUID.randomUUID().toString();
        zdlpuopuiu.dxjokdxxww(string, "toString(...)");
        StringBuilder sb3 = new StringBuilder();
        for (int i13 = 0; i13 < string.length(); i13++) {
            char cCharAt = string.charAt(i13);
            if (cCharAt != '-') {
                sb3.append(cCharAt);
            }
        }
        String string2 = sb3.toString();
        zdlpuopuiu.dxjokdxxww(string2, "toString(...)");
        String upperCase = kcexrzcfyt.y(string2, 12).toUpperCase(Locale.ROOT);
        zdlpuopuiu.dxjokdxxww(upperCase, "toUpperCase(...)");
        this.appDataRepository.setLocalSessionId(upperCase);
        return wwaezpbzkn.f37140iobyxmoadg;
    }
}
