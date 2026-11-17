package modern.payments.ecomAndroid.domain.useCase;

import com.google.protobuf.DescriptorProtos;
import gg.wwaezpbzkn;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.Utils;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.model.MerchantInitialData;
import modern.payments.ecomAndroid.domain.model.request.PaymentOrderRequestBody;
import modern.payments.ecomAndroid.domain.model.response.PaymentOrderResponseBody;
import modern.payments.ecomAndroid.domain.model.response.PaymentTokenResponseBody;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository;
import modern.payments.ecomAndroid.presentation.Action;
import modern.payments.ecomAndroid.presentation.fragment.EcomChallengeFragmentKt;
import modern.payments.ecomAndroid.presentation.viewModel.Ecom3dsMethodViewModelKt;
import modern.payments.ecomAndroid.util.extension.StringExtensionsKt;
import modern.payments.ecomAndroid.util.jsonParamHelper.JsonParamHelperUtil;
import pj.cllcsxoeiz;
import pj.pkzmftpjix;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0096B¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lmodern/payments/ecomAndroid/domain/useCase/GetPaymentOrderUseCaseImpl;", "Lmodern/payments/ecomAndroid/domain/useCase/GetPaymentOrderUseCase;", "Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;", "ecomApiRepository", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "reducer", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "merchantDataProvider", "Lmodern/payments/ecomAndroid/util/jsonParamHelper/JsonParamHelperUtil;", "jsonParamHelperUtil", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "stateHandler", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;Lmodern/payments/ecomAndroid/domain/reducer/Reducer;Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;Lmodern/payments/ecomAndroid/util/jsonParamHelper/JsonParamHelperUtil;Lmodern/payments/ecomAndroid/domain/StateHandler;)V", "Lmodern/payments/ecomAndroid/domain/model/response/PaymentTokenResponseBody;", "paymentTokenResponse", "Lpj/cllcsxoeiz;", "coroutineScope", "Lmodern/payments/ecomAndroid/domain/model/request/PaymentOrderRequestBody;", "getRequest", "(Lmodern/payments/ecomAndroid/domain/model/response/PaymentTokenResponseBody;Lpj/cllcsxoeiz;Llg/gxszxtbevo;)Ljava/lang/Object;", "params", "Lpj/pkzmftpjix;", "dispatcher", "Lgg/wwaezpbzkn;", "invoke", "(Lmodern/payments/ecomAndroid/domain/model/request/PaymentOrderRequestBody;Lpj/pkzmftpjix;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "errorEntity", "Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "getDefaultException", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;)Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "Lmodern/payments/ecomAndroid/util/jsonParamHelper/JsonParamHelperUtil;", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "scope", "Lpj/cllcsxoeiz;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GetPaymentOrderUseCaseImpl implements GetPaymentOrderUseCase {
    private final SafeEcomApiRepository ecomApiRepository;
    private final JsonParamHelperUtil jsonParamHelperUtil;
    private final MerchantDataProvider merchantDataProvider;
    private final Reducer reducer;
    private cllcsxoeiz scope;
    private final StateHandler stateHandler;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.domain.useCase.GetPaymentOrderUseCaseImpl$getRequest$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.domain.useCase.GetPaymentOrderUseCaseImpl", f = "GetPaymentOrderUseCaseImpl.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "getRequest")
    static final class AnonymousClass1 extends wkgbmnqykc {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetPaymentOrderUseCaseImpl.this.getRequest(null, null, this);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.domain.useCase.GetPaymentOrderUseCaseImpl$invoke$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.domain.useCase.GetPaymentOrderUseCaseImpl", f = "GetPaymentOrderUseCaseImpl.kt", l = {60, 63}, m = "invoke")
    static final class C40651 extends wkgbmnqykc {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C40651(lg.gxszxtbevo<? super C40651> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetPaymentOrderUseCaseImpl.this.invoke2((PaymentOrderRequestBody) null, (pkzmftpjix) null, (lg.gxszxtbevo<? super wwaezpbzkn>) this);
        }
    }

    public GetPaymentOrderUseCaseImpl(SafeEcomApiRepository ecomApiRepository, Reducer reducer, MerchantDataProvider merchantDataProvider, JsonParamHelperUtil jsonParamHelperUtil, StateHandler stateHandler) {
        zdlpuopuiu.btonecajqb(ecomApiRepository, "ecomApiRepository");
        zdlpuopuiu.btonecajqb(reducer, "reducer");
        zdlpuopuiu.btonecajqb(merchantDataProvider, "merchantDataProvider");
        zdlpuopuiu.btonecajqb(jsonParamHelperUtil, "jsonParamHelperUtil");
        zdlpuopuiu.btonecajqb(stateHandler, "stateHandler");
        this.ecomApiRepository = ecomApiRepository;
        this.reducer = reducer;
        this.merchantDataProvider = merchantDataProvider;
        this.jsonParamHelperUtil = jsonParamHelperUtil;
        this.stateHandler = stateHandler;
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public State.Error.DefaultException getDefaultException(ErrorEntity errorEntity) {
        zdlpuopuiu.btonecajqb(errorEntity, "errorEntity");
        return new State.Error.DefaultException.WhilePayment(errorEntity, false, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    @Override // modern.payments.ecomAndroid.domain.useCase.GetPaymentOrderUseCase
    public Object getRequest(PaymentTokenResponseBody paymentTokenResponseBody, cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super PaymentOrderRequestBody> gxszxtbevoVar) {
        AnonymousClass1 anonymousClass1;
        PaymentTokenResponseBody paymentTokenResponseBody2;
        cllcsxoeiz cllcsxoeizVar2;
        GetPaymentOrderUseCaseImpl getPaymentOrderUseCaseImpl;
        String str;
        String str2;
        String str3;
        String str4;
        if (gxszxtbevoVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) gxszxtbevoVar;
            int i13 = anonymousClass1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i13 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(gxszxtbevoVar);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objPmvmpeiblj = anonymousClass2.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = anonymousClass2.label;
        if (i14 != 0) {
            if (i14 == 1) {
                cllcsxoeiz cllcsxoeizVar3 = (cllcsxoeiz) anonymousClass2.L$2;
                PaymentTokenResponseBody paymentTokenResponseBody3 = (PaymentTokenResponseBody) anonymousClass2.L$1;
                GetPaymentOrderUseCaseImpl getPaymentOrderUseCaseImpl2 = (GetPaymentOrderUseCaseImpl) anonymousClass2.L$0;
                gg.zdlpuopuiu.zoijcleaow(objPmvmpeiblj);
                cllcsxoeizVar2 = cllcsxoeizVar3;
                paymentTokenResponseBody2 = paymentTokenResponseBody3;
                getPaymentOrderUseCaseImpl = getPaymentOrderUseCaseImpl2;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str5 = (String) anonymousClass2.L$3;
                String str6 = (String) anonymousClass2.L$2;
                str3 = (String) anonymousClass2.L$1;
                String str7 = (String) anonymousClass2.L$0;
                gg.zdlpuopuiu.zoijcleaow(objPmvmpeiblj);
                str4 = str5;
                str = str6;
                str2 = str7;
            }
            return new PaymentOrderRequestBody(str2, str3, str, str4, null, (Map) objPmvmpeiblj, Ecom3dsMethodViewModelKt.THREE_DS_METHOD_NOTIFICATION_URL, StringExtensionsKt.decodeBase64(EcomChallengeFragmentKt.POSTBACK_URL), null, 272, null);
        }
        gg.zdlpuopuiu.zoijcleaow(objPmvmpeiblj);
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(this.merchantDataProvider.getMerchantData());
        anonymousClass2.L$0 = this;
        paymentTokenResponseBody2 = paymentTokenResponseBody;
        anonymousClass2.L$1 = paymentTokenResponseBody2;
        cllcsxoeizVar2 = cllcsxoeizVar;
        anonymousClass2.L$2 = cllcsxoeizVar2;
        anonymousClass2.label = 1;
        objPmvmpeiblj = dxjokdxxww.pmvmpeiblj(lqeggnwhkgVarLereixgezr, anonymousClass2);
        if (objPmvmpeiblj == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        getPaymentOrderUseCaseImpl = this;
        MerchantInitialData merchantInitialData = (MerchantInitialData) objPmvmpeiblj;
        getPaymentOrderUseCaseImpl.scope = cllcsxoeizVar2;
        String strGenerateRqUID32Sym = Utils.INSTANCE.generateRqUID32Sym();
        String merchantLogin = merchantInitialData.getMerchantLogin();
        String bankInvoiceId = merchantInitialData.getBankInvoiceId();
        String paymentToken = paymentTokenResponseBody2.getPaymentToken();
        JsonParamHelperUtil jsonParamHelperUtil = getPaymentOrderUseCaseImpl.jsonParamHelperUtil;
        anonymousClass2.L$0 = strGenerateRqUID32Sym;
        anonymousClass2.L$1 = merchantLogin;
        anonymousClass2.L$2 = bankInvoiceId;
        anonymousClass2.L$3 = paymentToken;
        anonymousClass2.label = 2;
        Object paramsMap$default = JsonParamHelperUtil.DefaultImpls.getParamsMap$default(jsonParamHelperUtil, "", null, anonymousClass2, 2, null);
        if (paramsMap$default == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        str = bankInvoiceId;
        objPmvmpeiblj = paramsMap$default;
        str2 = strGenerateRqUID32Sym;
        str3 = merchantLogin;
        str4 = paymentToken;
        return new PaymentOrderRequestBody(str2, str3, str, str4, null, (Map) objPmvmpeiblj, Ecom3dsMethodViewModelKt.THREE_DS_METHOD_NOTIFICATION_URL, StringExtensionsKt.decodeBase64(EcomChallengeFragmentKt.POSTBACK_URL), null, 272, null);
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public /* bridge */ /* synthetic */ Object handleFailureResponse(PaymentOrderRequestBody paymentOrderRequestBody, ErrorEntity errorEntity, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        return handleFailureResponse2(paymentOrderRequestBody, errorEntity, pkzmftpjixVar, (lg.gxszxtbevo<? super State.Error>) gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public /* bridge */ /* synthetic */ Object invoke(PaymentOrderRequestBody paymentOrderRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        return invoke2(paymentOrderRequestBody, pkzmftpjixVar, (lg.gxszxtbevo<? super wwaezpbzkn>) gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public /* bridge */ /* synthetic */ Object retry(PaymentOrderRequestBody paymentOrderRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        return retry2(paymentOrderRequestBody, pkzmftpjixVar, (lg.gxszxtbevo<? super wwaezpbzkn>) gxszxtbevoVar);
    }

    /* JADX INFO: renamed from: handleFailureResponse, reason: avoid collision after fix types in other method */
    public Object handleFailureResponse2(PaymentOrderRequestBody paymentOrderRequestBody, ErrorEntity errorEntity, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super State.Error> gxszxtbevoVar) {
        return GetPaymentOrderUseCase.DefaultImpls.handleFailureResponse(this, paymentOrderRequestBody, errorEntity, pkzmftpjixVar, gxszxtbevoVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public Object invoke2(PaymentOrderRequestBody paymentOrderRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        C40651 c40651;
        Object obj;
        pkzmftpjix pkzmftpjixVar2;
        PaymentOrderRequestBody paymentOrderRequestBody2;
        GetPaymentOrderUseCaseImpl getPaymentOrderUseCaseImpl;
        Action handlePaymentOrder;
        if (gxszxtbevoVar instanceof C40651) {
            c40651 = (C40651) gxszxtbevoVar;
            int i13 = c40651.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40651.label = i13 - Integer.MIN_VALUE;
            } else {
                c40651 = new C40651(gxszxtbevoVar);
            }
        } else {
            c40651 = new C40651(gxszxtbevoVar);
        }
        Object objHandleFailureResponse = c40651.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c40651.label;
        if (i14 != 0) {
            if (i14 == 1) {
                pkzmftpjix pkzmftpjixVar3 = (pkzmftpjix) c40651.L$2;
                PaymentOrderRequestBody paymentOrderRequestBody3 = (PaymentOrderRequestBody) c40651.L$1;
                GetPaymentOrderUseCaseImpl getPaymentOrderUseCaseImpl2 = (GetPaymentOrderUseCaseImpl) c40651.L$0;
                gg.zdlpuopuiu.zoijcleaow(objHandleFailureResponse);
                paymentOrderRequestBody2 = paymentOrderRequestBody3;
                getPaymentOrderUseCaseImpl = getPaymentOrderUseCaseImpl2;
                obj = objHandleFailureResponse;
                pkzmftpjixVar2 = pkzmftpjixVar3;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getPaymentOrderUseCaseImpl = (GetPaymentOrderUseCaseImpl) c40651.L$0;
                gg.zdlpuopuiu.zoijcleaow(objHandleFailureResponse);
            }
            handlePaymentOrder = new Action.HandleException((State.Error) objHandleFailureResponse);
            getPaymentOrderUseCaseImpl.reducer.invoke(handlePaymentOrder);
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(objHandleFailureResponse);
        this.stateHandler.setState(new State.Loading.JustASecond(null, 1, null));
        SafeEcomApiRepository safeEcomApiRepository = this.ecomApiRepository;
        c40651.L$0 = this;
        c40651.L$1 = paymentOrderRequestBody;
        c40651.L$2 = pkzmftpjixVar;
        c40651.label = 1;
        Object paymentOrder = safeEcomApiRepository.getPaymentOrder(paymentOrderRequestBody, c40651);
        if (paymentOrder == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        obj = paymentOrder;
        pkzmftpjixVar2 = pkzmftpjixVar;
        paymentOrderRequestBody2 = paymentOrderRequestBody;
        getPaymentOrderUseCaseImpl = this;
        ContentResponse contentResponse = (ContentResponse) obj;
        if (contentResponse instanceof ContentResponse.Failure) {
            ErrorEntity error = ((ContentResponse.Failure) contentResponse).getError();
            c40651.L$0 = getPaymentOrderUseCaseImpl;
            c40651.L$1 = null;
            c40651.L$2 = null;
            c40651.label = 2;
            objHandleFailureResponse = getPaymentOrderUseCaseImpl.handleFailureResponse(paymentOrderRequestBody2, error, pkzmftpjixVar2, (lg.gxszxtbevo) c40651);
            if (objHandleFailureResponse == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            handlePaymentOrder = new Action.HandleException((State.Error) objHandleFailureResponse);
        } else {
            if (!(contentResponse instanceof ContentResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            handlePaymentOrder = new Action.HandlePaymentOrder((PaymentOrderResponseBody) ((ContentResponse.Success) contentResponse).getData(), getPaymentOrderUseCaseImpl.scope);
        }
        getPaymentOrderUseCaseImpl.reducer.invoke(handlePaymentOrder);
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: renamed from: retry, reason: avoid collision after fix types in other method */
    public Object retry2(PaymentOrderRequestBody paymentOrderRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        return GetPaymentOrderUseCase.DefaultImpls.retry(this, paymentOrderRequestBody, pkzmftpjixVar, gxszxtbevoVar);
    }
}
