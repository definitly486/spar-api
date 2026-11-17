package modern.payments.ecomAndroid.domain.useCase;

import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.gtknphoqwx;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.data.api.ContentResponseKt;
import modern.payments.ecomAndroid.data.api.ErrorEntity;
import modern.payments.ecomAndroid.domain.State;
import modern.payments.ecomAndroid.domain.StateHandler;
import modern.payments.ecomAndroid.domain.cache.AppDataRepository;
import modern.payments.ecomAndroid.domain.model.MerchantInitialData;
import modern.payments.ecomAndroid.domain.model.request.PaymentTokenRequestBody;
import modern.payments.ecomAndroid.domain.model.response.PaymentTokenResponseBody;
import modern.payments.ecomAndroid.domain.model.response.SessionIdResponseBody;
import modern.payments.ecomAndroid.domain.provider.MerchantDataProvider;
import modern.payments.ecomAndroid.domain.reducer.Reducer;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.MerchantAnalyticRepository;
import modern.payments.ecomAndroid.domain.repository.SafeEcomApiRepository;
import modern.payments.ecomAndroid.presentation.Action;
import modern.payments.ecomAndroid.secureChapter.EncryptedDataHandler;
import modern.payments.ecomAndroid.util.exception.EcomInternalException;
import modern.payments.ecomAndroid.util.extension.FeatureExtensionsKt;
import modern.payments.ecomAndroid.util.extension.StringExtensionsKt;
import modern.payments.tracker.ITracker;
import pj.cllcsxoeiz;
import pj.krqnebusok;
import pj.pkzmftpjix;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001cH\u0096B¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010-R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010.¨\u00060"}, d2 = {"Lmodern/payments/ecomAndroid/domain/useCase/GetPaymentTokenUseCaseImpl;", "Lmodern/payments/ecomAndroid/domain/useCase/GetPaymentTokenUseCase;", "Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;", "ecomApiRepository", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "reducer", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "merchantDataProvider", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "stateHandler", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "appDataRepository", "Lmodern/payments/ecomAndroid/secureChapter/EncryptedDataHandler;", "encryptedDataHandler", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "merchantAnalyticRepository", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomSdkOptionsRepository", "<init>", "(Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;Lmodern/payments/ecomAndroid/domain/reducer/Reducer;Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;Lmodern/payments/ecomAndroid/domain/StateHandler;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;Lmodern/payments/ecomAndroid/secureChapter/EncryptedDataHandler;Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)V", "", "bindingId", "Lmodern/payments/ecomAndroid/domain/model/request/PaymentTokenRequestBody;", "getRequest", "(Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "params", "Lpj/pkzmftpjix;", "dispatcher", "Lgg/wwaezpbzkn;", "invoke", "(Lmodern/payments/ecomAndroid/domain/model/request/PaymentTokenRequestBody;Lpj/pkzmftpjix;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/data/api/ErrorEntity;", "errorEntity", "Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "getDefaultException", "(Lmodern/payments/ecomAndroid/data/api/ErrorEntity;)Lmodern/payments/ecomAndroid/domain/State$Error$DefaultException;", "Lmodern/payments/ecomAndroid/domain/repository/SafeEcomApiRepository;", "Lmodern/payments/ecomAndroid/domain/reducer/Reducer;", "Lmodern/payments/ecomAndroid/domain/provider/MerchantDataProvider;", "Lmodern/payments/ecomAndroid/domain/StateHandler;", "Lmodern/payments/tracker/ITracker;", "Lmodern/payments/ecomAndroid/domain/cache/AppDataRepository;", "Lmodern/payments/ecomAndroid/secureChapter/EncryptedDataHandler;", "Lmodern/payments/ecomAndroid/domain/repository/MerchantAnalyticRepository;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GetPaymentTokenUseCaseImpl implements GetPaymentTokenUseCase {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TRACKER_TAG = "GetPaymentTokenUseCase";
    private final AppDataRepository appDataRepository;
    private final SafeEcomApiRepository ecomApiRepository;
    private final EcomSdkOptionsRepository ecomSdkOptionsRepository;
    private final EncryptedDataHandler encryptedDataHandler;
    private final MerchantAnalyticRepository merchantAnalyticRepository;
    private final MerchantDataProvider merchantDataProvider;
    private final Reducer reducer;
    private final StateHandler stateHandler;
    private final ITracker tracker;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lmodern/payments/ecomAndroid/domain/useCase/GetPaymentTokenUseCaseImpl$Companion;", "", "()V", "TRACKER_TAG", "", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.domain.useCase.GetPaymentTokenUseCaseImpl$getRequest$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.domain.useCase.GetPaymentTokenUseCaseImpl", f = "GetPaymentTokenUseCaseImpl.kt", l = {43, 49}, m = "getRequest")
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
            return GetPaymentTokenUseCaseImpl.this.getRequest(null, this);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.domain.useCase.GetPaymentTokenUseCaseImpl$invoke$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lpj/cllcsxoeiz;", "Lgg/wwaezpbzkn;", "<anonymous>", "(Lpj/cllcsxoeiz;)V"}, k = 3, mv = {1, 9, 0})
    @gxszxtbevo(c = "modern.payments.ecomAndroid.domain.useCase.GetPaymentTokenUseCaseImpl$invoke$2", f = "GetPaymentTokenUseCaseImpl.kt", l = {75, 78, 84}, m = "invokeSuspend")
    static final class AnonymousClass2 extends draadjrbmk implements rgvfuqvkyq {
        final /* synthetic */ pkzmftpjix $dispatcher;
        final /* synthetic */ PaymentTokenRequestBody $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaymentTokenRequestBody paymentTokenRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super AnonymousClass2> gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.$params = paymentTokenRequestBody;
            this.$dispatcher = pkzmftpjixVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo<wwaezpbzkn> create(Object obj, lg.gxszxtbevo<?> gxszxtbevoVar) {
            return GetPaymentTokenUseCaseImpl.this.new AnonymousClass2(this.$params, this.$dispatcher, gxszxtbevoVar);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x005e  */
        /* JADX WARN: Code duplicated, block: B:22:0x0092 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x009b  */
        /* JADX WARN: Code duplicated, block: B:26:0x009f  */
        /* JADX WARN: Code duplicated, block: B:29:0x00de  */
        /* JADX WARN: Instruction removed from duplicated block: B:20:0x005e, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:26:0x009f, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            ContentResponse contentResponse;
            Action handlePaymentToken;
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 == 1) {
                    zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 == 2) {
                        zdlpuopuiu.zoijcleaow(obj);
                        contentResponse = (ContentResponse) obj;
                        if (contentResponse instanceof ContentResponse.Failure) {
                            ITracker.DefaultImpls.track$default(GetPaymentTokenUseCaseImpl.this.tracker, "<init> response failure:\n" + contentResponse, null, null, null, 14, null);
                            GetPaymentTokenUseCaseImpl getPaymentTokenUseCaseImpl = GetPaymentTokenUseCaseImpl.this;
                            PaymentTokenRequestBody paymentTokenRequestBody = this.$params;
                            ErrorEntity error = ((ContentResponse.Failure) contentResponse).getError();
                            pkzmftpjix pkzmftpjixVar = this.$dispatcher;
                            this.label = 3;
                            obj = getPaymentTokenUseCaseImpl.handleFailureResponse(paymentTokenRequestBody, error, pkzmftpjixVar, (lg.gxszxtbevo) this);
                            if (obj == objGxszxtbevo) {
                                return objGxszxtbevo;
                            }
                        } else {
                            if (contentResponse instanceof ContentResponse.Success) {
                                throw new NoWhenBranchMatchedException();
                            }
                            FeatureExtensionsKt.track$default(GetPaymentTokenUseCaseImpl.this.tracker, GetPaymentTokenUseCaseImpl.this.ecomSdkOptionsRepository, "<init> response success:\n" + contentResponse, null, null, null, 28, null);
                            handlePaymentToken = new Action.HandlePaymentToken((PaymentTokenResponseBody) ((ContentResponse.Success) contentResponse).getData());
                        }
                        GetPaymentTokenUseCaseImpl.this.reducer.invoke(handlePaymentToken);
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                    if (i13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zdlpuopuiu.zoijcleaow(obj);
                }
                handlePaymentToken = new Action.HandleException((State.Error) obj);
                GetPaymentTokenUseCaseImpl.this.reducer.invoke(handlePaymentToken);
                return wwaezpbzkn.f37140iobyxmoadg;
            }
            zdlpuopuiu.zoijcleaow(obj);
            GetPaymentTokenUseCaseImpl.this.stateHandler.setState(new State.Loading.JustASecond(null, 1, null));
            MerchantAnalyticRepository merchantAnalyticRepository = GetPaymentTokenUseCaseImpl.this.merchantAnalyticRepository;
            this.label = 1;
            if (merchantAnalyticRepository.onPaymentStarted(this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            SafeEcomApiRepository safeEcomApiRepository = GetPaymentTokenUseCaseImpl.this.ecomApiRepository;
            PaymentTokenRequestBody paymentTokenRequestBody2 = this.$params;
            this.label = 2;
            obj = safeEcomApiRepository.getPaymentToken(paymentTokenRequestBody2, this);
            if (obj == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            contentResponse = (ContentResponse) obj;
            if (contentResponse instanceof ContentResponse.Failure) {
                ITracker.DefaultImpls.track$default(GetPaymentTokenUseCaseImpl.this.tracker, "<init> response failure:\n" + contentResponse, null, null, null, 14, null);
                GetPaymentTokenUseCaseImpl getPaymentTokenUseCaseImpl2 = GetPaymentTokenUseCaseImpl.this;
                PaymentTokenRequestBody paymentTokenRequestBody3 = this.$params;
                ErrorEntity error2 = ((ContentResponse.Failure) contentResponse).getError();
                pkzmftpjix pkzmftpjixVar2 = this.$dispatcher;
                this.label = 3;
                obj = getPaymentTokenUseCaseImpl2.handleFailureResponse(paymentTokenRequestBody3, error2, pkzmftpjixVar2, (lg.gxszxtbevo) this);
                if (obj == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
                handlePaymentToken = new Action.HandleException((State.Error) obj);
            } else {
                if (contentResponse instanceof ContentResponse.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                FeatureExtensionsKt.track$default(GetPaymentTokenUseCaseImpl.this.tracker, GetPaymentTokenUseCaseImpl.this.ecomSdkOptionsRepository, "<init> response success:\n" + contentResponse, null, null, null, 28, null);
                handlePaymentToken = new Action.HandlePaymentToken((PaymentTokenResponseBody) ((ContentResponse.Success) contentResponse).getData());
            }
            GetPaymentTokenUseCaseImpl.this.reducer.invoke(handlePaymentToken);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
            return ((AnonymousClass2) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public GetPaymentTokenUseCaseImpl(SafeEcomApiRepository ecomApiRepository, Reducer reducer, MerchantDataProvider merchantDataProvider, StateHandler stateHandler, ITracker tracker, AppDataRepository appDataRepository, EncryptedDataHandler encryptedDataHandler, MerchantAnalyticRepository merchantAnalyticRepository, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ecomApiRepository, "ecomApiRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reducer, "reducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(merchantDataProvider, "merchantDataProvider");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(stateHandler, "stateHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(tracker, "tracker");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(appDataRepository, "appDataRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encryptedDataHandler, "encryptedDataHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(merchantAnalyticRepository, "merchantAnalyticRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        this.ecomApiRepository = ecomApiRepository;
        this.reducer = reducer;
        this.merchantDataProvider = merchantDataProvider;
        this.stateHandler = stateHandler;
        this.tracker = tracker;
        this.appDataRepository = appDataRepository;
        this.encryptedDataHandler = encryptedDataHandler;
        this.merchantAnalyticRepository = merchantAnalyticRepository;
        this.ecomSdkOptionsRepository = ecomSdkOptionsRepository;
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public State.Error.DefaultException getDefaultException(ErrorEntity errorEntity) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(errorEntity, "errorEntity");
        return new State.Error.DefaultException.WhilePayment(errorEntity, false, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:36:0x0116 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // modern.payments.ecomAndroid.domain.useCase.GetPaymentTokenUseCase
    public Object getRequest(String str, lg.gxszxtbevo<? super PaymentTokenRequestBody> gxszxtbevoVar) {
        AnonymousClass1 anonymousClass1;
        SessionIdResponseBody sessionIdResponseBody;
        GetPaymentTokenUseCaseImpl getPaymentTokenUseCaseImpl;
        String str2;
        String str3;
        Object objPmvmpeiblj;
        String str4;
        String str5;
        GetPaymentTokenUseCaseImpl getPaymentTokenUseCaseImpl2;
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
        Object jwe = anonymousClass1.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = anonymousClass1.label;
        if (i14 != 0) {
            if (i14 == 1) {
                sessionIdResponseBody = (SessionIdResponseBody) anonymousClass1.L$2;
                str3 = (String) anonymousClass1.L$1;
                getPaymentTokenUseCaseImpl = (GetPaymentTokenUseCaseImpl) anonymousClass1.L$0;
                zdlpuopuiu.zoijcleaow(jwe);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str6 = (String) anonymousClass1.L$3;
                sessionIdResponseBody = (SessionIdResponseBody) anonymousClass1.L$2;
                String str7 = (String) anonymousClass1.L$1;
                getPaymentTokenUseCaseImpl2 = (GetPaymentTokenUseCaseImpl) anonymousClass1.L$0;
                zdlpuopuiu.zoijcleaow(jwe);
                str4 = str6;
                str5 = str7;
            }
            MerchantInitialData merchantInitialData = (MerchantInitialData) jwe;
            ITracker iTracker = getPaymentTokenUseCaseImpl2.tracker;
            EcomSdkOptionsRepository ecomSdkOptionsRepository = getPaymentTokenUseCaseImpl2.ecomSdkOptionsRepository;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("<init> bindingId (");
            sb3.append(str5);
            sb3.append("), encryptedCardData (");
            sb3.append(str4 != null ? StringExtensionsKt.maskData(str4) : null);
            sb3.append("), sessionIdResult (");
            sb3.append(sessionIdResponseBody);
            sb3.append("), merchantData (");
            sb3.append(merchantInitialData);
            sb3.append(')');
            FeatureExtensionsKt.track$default(iTracker, ecomSdkOptionsRepository, sb3.toString(), null, null, TRACKER_TAG, 12, null);
            if (!getPaymentTokenUseCaseImpl2.appDataRepository.isBindingCardPaymentMode() && str5 == null) {
                throw EcomInternalException.EcomTokenRequestBindingIdIsNullException.INSTANCE;
            }
            if (getPaymentTokenUseCaseImpl2.appDataRepository.isNewCardPaymentMode() || str4 != null) {
                return new PaymentTokenRequestBody(sessionIdResponseBody.getSessionId(), merchantInitialData.getMerchantLogin(), merchantInitialData.getBankInvoiceId(), str5, str4);
            }
            throw EcomInternalException.EcomTokenRequestCardDataIsNullException.INSTANCE;
        }
        zdlpuopuiu.zoijcleaow(jwe);
        sessionIdResponseBody = (SessionIdResponseBody) ContentResponseKt.getOrThrow$default((ContentResponse) this.appDataRepository.getSessionIdResponse().getValue(), null, 1, null);
        if (this.appDataRepository.isBindingCardPaymentMode()) {
            str3 = str;
            getPaymentTokenUseCaseImpl = this;
            str2 = null;
        } else if (this.appDataRepository.isNewCardPaymentMode()) {
            EncryptedDataHandler encryptedDataHandler = this.encryptedDataHandler;
            String ecomPublicKey = sessionIdResponseBody.getEcomPublicKey();
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = str;
            anonymousClass1.L$2 = sessionIdResponseBody;
            anonymousClass1.label = 1;
            jwe = encryptedDataHandler.getJwe(ecomPublicKey, anonymousClass1);
            if (jwe == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            getPaymentTokenUseCaseImpl = this;
            str3 = str;
        } else {
            getPaymentTokenUseCaseImpl = this;
            str2 = null;
            str3 = str;
        }
        lqeggnwhkg lqeggnwhkgVarLereixgezr = dxjokdxxww.lereixgezr(getPaymentTokenUseCaseImpl.merchantDataProvider.getMerchantData());
        anonymousClass1.L$0 = getPaymentTokenUseCaseImpl;
        anonymousClass1.L$1 = str3;
        anonymousClass1.L$2 = sessionIdResponseBody;
        anonymousClass1.L$3 = str2;
        anonymousClass1.label = 2;
        objPmvmpeiblj = dxjokdxxww.pmvmpeiblj(lqeggnwhkgVarLereixgezr, anonymousClass1);
        if (objPmvmpeiblj == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        str4 = str2;
        jwe = objPmvmpeiblj;
        str5 = str3;
        getPaymentTokenUseCaseImpl2 = getPaymentTokenUseCaseImpl;
        MerchantInitialData merchantInitialData2 = (MerchantInitialData) jwe;
        ITracker iTracker2 = getPaymentTokenUseCaseImpl2.tracker;
        EcomSdkOptionsRepository ecomSdkOptionsRepository2 = getPaymentTokenUseCaseImpl2.ecomSdkOptionsRepository;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("<init> bindingId (");
        sb4.append(str5);
        sb4.append("), encryptedCardData (");
        sb4.append(str4 != null ? StringExtensionsKt.maskData(str4) : null);
        sb4.append("), sessionIdResult (");
        sb4.append(sessionIdResponseBody);
        sb4.append("), merchantData (");
        sb4.append(merchantInitialData2);
        sb4.append(')');
        FeatureExtensionsKt.track$default(iTracker2, ecomSdkOptionsRepository2, sb4.toString(), null, null, TRACKER_TAG, 12, null);
        if (!getPaymentTokenUseCaseImpl2.appDataRepository.isBindingCardPaymentMode()) {
        }
        if (getPaymentTokenUseCaseImpl2.appDataRepository.isNewCardPaymentMode()) {
        }
        return new PaymentTokenRequestBody(sessionIdResponseBody.getSessionId(), merchantInitialData2.getMerchantLogin(), merchantInitialData2.getBankInvoiceId(), str5, str4);
        str2 = (String) jwe;
        lqeggnwhkg lqeggnwhkgVarLereixgezr2 = dxjokdxxww.lereixgezr(getPaymentTokenUseCaseImpl.merchantDataProvider.getMerchantData());
        anonymousClass1.L$0 = getPaymentTokenUseCaseImpl;
        anonymousClass1.L$1 = str3;
        anonymousClass1.L$2 = sessionIdResponseBody;
        anonymousClass1.L$3 = str2;
        anonymousClass1.label = 2;
        objPmvmpeiblj = dxjokdxxww.pmvmpeiblj(lqeggnwhkgVarLereixgezr2, anonymousClass1);
        if (objPmvmpeiblj == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        str4 = str2;
        jwe = objPmvmpeiblj;
        str5 = str3;
        getPaymentTokenUseCaseImpl2 = getPaymentTokenUseCaseImpl;
        MerchantInitialData merchantInitialData3 = (MerchantInitialData) jwe;
        ITracker iTracker3 = getPaymentTokenUseCaseImpl2.tracker;
        EcomSdkOptionsRepository ecomSdkOptionsRepository3 = getPaymentTokenUseCaseImpl2.ecomSdkOptionsRepository;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("<init> bindingId (");
        sb5.append(str5);
        sb5.append("), encryptedCardData (");
        sb5.append(str4 != null ? StringExtensionsKt.maskData(str4) : null);
        sb5.append("), sessionIdResult (");
        sb5.append(sessionIdResponseBody);
        sb5.append("), merchantData (");
        sb5.append(merchantInitialData3);
        sb5.append(')');
        FeatureExtensionsKt.track$default(iTracker3, ecomSdkOptionsRepository3, sb5.toString(), null, null, TRACKER_TAG, 12, null);
        if (!getPaymentTokenUseCaseImpl2.appDataRepository.isBindingCardPaymentMode()) {
        }
        if (getPaymentTokenUseCaseImpl2.appDataRepository.isNewCardPaymentMode()) {
        }
        return new PaymentTokenRequestBody(sessionIdResponseBody.getSessionId(), merchantInitialData3.getMerchantLogin(), merchantInitialData3.getBankInvoiceId(), str5, str4);
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public /* bridge */ /* synthetic */ Object handleFailureResponse(PaymentTokenRequestBody paymentTokenRequestBody, ErrorEntity errorEntity, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        return handleFailureResponse2(paymentTokenRequestBody, errorEntity, pkzmftpjixVar, (lg.gxszxtbevo<? super State.Error>) gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public /* bridge */ /* synthetic */ Object invoke(PaymentTokenRequestBody paymentTokenRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        return invoke2(paymentTokenRequestBody, pkzmftpjixVar, (lg.gxszxtbevo<? super wwaezpbzkn>) gxszxtbevoVar);
    }

    @Override // modern.payments.ecomAndroid.domain.useCase.base.BaseUseCase
    public /* bridge */ /* synthetic */ Object retry(PaymentTokenRequestBody paymentTokenRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        return retry2(paymentTokenRequestBody, pkzmftpjixVar, (lg.gxszxtbevo<? super wwaezpbzkn>) gxszxtbevoVar);
    }

    /* JADX INFO: renamed from: handleFailureResponse, reason: avoid collision after fix types in other method */
    public Object handleFailureResponse2(PaymentTokenRequestBody paymentTokenRequestBody, ErrorEntity errorEntity, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super State.Error> gxszxtbevoVar) {
        return GetPaymentTokenUseCase.DefaultImpls.handleFailureResponse(this, paymentTokenRequestBody, errorEntity, pkzmftpjixVar, gxszxtbevoVar);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public Object invoke2(PaymentTokenRequestBody paymentTokenRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        Object objLqeggnwhkg = pj.dxjokdxxww.lqeggnwhkg(pkzmftpjixVar.plus(krqnebusok.zoijcleaow(null, 1, null)), new AnonymousClass2(paymentTokenRequestBody, pkzmftpjixVar, null), gxszxtbevoVar);
        return objLqeggnwhkg == zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: renamed from: retry, reason: avoid collision after fix types in other method */
    public Object retry2(PaymentTokenRequestBody paymentTokenRequestBody, pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo<? super wwaezpbzkn> gxszxtbevoVar) {
        return GetPaymentTokenUseCase.DefaultImpls.retry(this, paymentTokenRequestBody, pkzmftpjixVar, gxszxtbevoVar);
    }
}
