package modern.payments.ecomAndroid.data.cache;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.model.response.SessionIdResponseBody;
import sj.dxjokdxxww;
import sj.kegysxyocb;
import sj.wypolnanlu;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR(\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001bR\"\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lmodern/payments/ecomAndroid/data/cache/AppDataRepositoryImpl;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "<init>", "()V", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode;", "paymentMode", "Lgg/wwaezpbzkn;", "setPaymentMode", "(Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode;)V", "", "isNewCardPaymentMode", "()Z", "isBindingCardPaymentMode", "Lmodern/payments/ecomAndroid/data/api/ContentResponse;", "Lmodern/payments/ecomAndroid/domain/model/response/SessionIdResponseBody;", "new", "setSessionIdResponse", "(Lmodern/payments/ecomAndroid/data/api/ContentResponse;)V", "", "setLocalSessionId", "(Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "_paymentMode", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode;", "Lsj/zynmafqrjb;", "_sessionIdResponse", "Lsj/zynmafqrjb;", "Lsj/wypolnanlu;", "sessionIdResponse", "Lsj/wypolnanlu;", "getSessionIdResponse", "()Lsj/wypolnanlu;", "_localSessionId", "localSessionId", "getLocalSessionId", "getPaymentMode", "()Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository$PaymentMode;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AppDataRepositoryImpl implements AppDataRepository {
    private final zynmafqrjb _localSessionId;
    private AppDataRepository.PaymentMode _paymentMode = AppDataRepository.PaymentMode.NewCardPaymentMode.INSTANCE;
    private final zynmafqrjb _sessionIdResponse;
    private final wypolnanlu localSessionId;
    private final wypolnanlu sessionIdResponse;

    public AppDataRepositoryImpl() {
        zynmafqrjb zynmafqrjbVarIobyxmoadg = kegysxyocb.iobyxmoadg(null);
        this._sessionIdResponse = zynmafqrjbVarIobyxmoadg;
        this.sessionIdResponse = dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg);
        zynmafqrjb zynmafqrjbVarIobyxmoadg2 = kegysxyocb.iobyxmoadg(null);
        this._localSessionId = zynmafqrjbVarIobyxmoadg2;
        this.localSessionId = dxjokdxxww.zoijcleaow(zynmafqrjbVarIobyxmoadg2);
    }

    @Override // modern.payments.ecomAndroid.domain.cache.AppDataRepository
    public wypolnanlu getLocalSessionId() {
        return this.localSessionId;
    }

    @Override // modern.payments.ecomAndroid.domain.cache.AppDataRepository
    /* JADX INFO: renamed from: getPaymentMode, reason: from getter */
    public AppDataRepository.PaymentMode get_paymentMode() {
        return this._paymentMode;
    }

    @Override // modern.payments.ecomAndroid.domain.cache.AppDataRepository
    public String getSessionId() {
        SessionIdResponseBody sessionIdResponseBody;
        Object value = getSessionIdResponse().getValue();
        ContentResponse.Success success = value instanceof ContentResponse.Success ? (ContentResponse.Success) value : null;
        if (success == null || (sessionIdResponseBody = (SessionIdResponseBody) success.getData()) == null) {
            return null;
        }
        return sessionIdResponseBody.getSessionId();
    }

    @Override // modern.payments.ecomAndroid.domain.cache.AppDataRepository
    public wypolnanlu getSessionIdResponse() {
        return this.sessionIdResponse;
    }

    @Override // modern.payments.ecomAndroid.domain.cache.AppDataRepository
    public boolean isBindingCardPaymentMode() {
        return this._paymentMode instanceof AppDataRepository.PaymentMode.BindingCardPaymentMode;
    }

    @Override // modern.payments.ecomAndroid.domain.cache.AppDataRepository
    public boolean isNewCardPaymentMode() {
        return this._paymentMode instanceof AppDataRepository.PaymentMode.NewCardPaymentMode;
    }

    @Override // modern.payments.ecomAndroid.domain.cache.AppDataRepository
    public void setLocalSessionId(String str) {
        zdlpuopuiu.btonecajqb(str, "new");
        this._localSessionId.setValue(str);
    }

    @Override // modern.payments.ecomAndroid.domain.cache.AppDataRepository
    public void setPaymentMode(AppDataRepository.PaymentMode paymentMode) {
        zdlpuopuiu.btonecajqb(paymentMode, "paymentMode");
        this._paymentMode = paymentMode;
    }

    @Override // modern.payments.ecomAndroid.domain.cache.AppDataRepository
    public void setSessionIdResponse(ContentResponse<SessionIdResponseBody> contentResponse) {
        zdlpuopuiu.btonecajqb(contentResponse, "new");
        this._sessionIdResponse.setValue(contentResponse);
    }
}
