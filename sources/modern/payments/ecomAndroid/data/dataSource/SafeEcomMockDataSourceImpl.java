package modern.payments.ecomAndroid.data.dataSource;

import android.content.Context;
import com.google.gson.Gson;
import gg.wwaezpbzkn;
import io.appmetrica.analytics.impl.C4007z9;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import lm.kcexrzcfyt;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.common.MockConstants;
import modern.payments.ecomAndroid.data.dto.EcomPaymentOrderResponseBodyDto;
import modern.payments.ecomAndroid.data.dto.EcomPaymentTokenResponseBodyDto;
import modern.payments.ecomAndroid.data.dto.EcomSessionIdResponseBodyDto;
import modern.payments.ecomAndroid.data.dto.FinishMethodResponseBodyDto;
import modern.payments.ecomAndroid.data.dto.FinishPaymentResponseBodyDto;
import modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource;
import modern.payments.ecomAndroid.domain.model.request.DeactivateBindingRequestBody;
import modern.payments.ecomAndroid.domain.model.request.Finish3dsMethodRequestBody;
import modern.payments.ecomAndroid.domain.model.request.Finish3dsPaymentRequestBody;
import modern.payments.ecomAndroid.domain.model.request.PaymentOrderRequestBody;
import modern.payments.ecomAndroid.domain.model.request.PaymentTokenRequestBody;
import modern.payments.ecomAndroid.domain.model.request.SessionIdRequestBody;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.util.extension.CommonExtensionsKt;
import modern.payments.ecomAndroid.util.networkErrorHandler.impl.OkHttpErrorHandlerImpl;
import modern.payments.tracker.ITracker;
import pj.crxdokpmqz;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\r2\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b#\u0010$J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\r2\u0006\u0010&\u001a\u00020%H\u0096@¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010*R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,¨\u0006."}, d2 = {"Lmodern/payments/ecomAndroid/data/dataSource/SafeEcomMockDataSourceImpl;", "Lmodern/payments/ecomAndroid/domain/dataSource/SafeEcomDataSource;", "Lmodern/payments/ecomAndroid/data/dataSource/MockResponses;", "Landroid/content/Context;", "context", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomSdkOptionsRepository", "<init>", "(Landroid/content/Context;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)V", "Lmodern/payments/ecomAndroid/domain/model/request/SessionIdRequestBody;", "sessionIdRequestBody", "Llm/kcexrzcfyt;", "Lmodern/payments/ecomAndroid/data/dto/EcomSessionIdResponseBodyDto;", "getSessionId", "(Lmodern/payments/ecomAndroid/domain/model/request/SessionIdRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/DeactivateBindingRequestBody;", "deactivateBindingRequestBody", "Lgg/wwaezpbzkn;", "deactivateBinding", "(Lmodern/payments/ecomAndroid/domain/model/request/DeactivateBindingRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/PaymentTokenRequestBody;", "paymentTokenRequestBody", "Lmodern/payments/ecomAndroid/data/dto/EcomPaymentTokenResponseBodyDto;", "getPaymentToken", "(Lmodern/payments/ecomAndroid/domain/model/request/PaymentTokenRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/PaymentOrderRequestBody;", "paymentOrderRequestBody", "Lmodern/payments/ecomAndroid/data/dto/EcomPaymentOrderResponseBodyDto;", "getPaymentOrder", "(Lmodern/payments/ecomAndroid/domain/model/request/PaymentOrderRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsPaymentRequestBody;", "finishPaymentRequestBody", "Lmodern/payments/ecomAndroid/data/dto/FinishPaymentResponseBodyDto;", "finish3dsPayment", "(Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsPaymentRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsMethodRequestBody;", "finishMethodRequestBody", "Lmodern/payments/ecomAndroid/data/dto/FinishMethodResponseBodyDto;", "finish3dsMethod", "(Lmodern/payments/ecomAndroid/domain/model/request/Finish3dsMethodRequestBody;Llg/gxszxtbevo;)Ljava/lang/Object;", "Landroid/content/Context;", "Lmodern/payments/tracker/ITracker;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "Companion", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SafeEcomMockDataSourceImpl implements SafeEcomDataSource, MockResponses {
    private static final Companion Companion = new Companion(null);
    private static Map<String, Integer> attemptsCount = new LinkedHashMap();
    private final Context context;
    private final EcomSdkOptionsRepository ecomSdkOptionsRepository;
    private final ITracker tracker;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmodern/payments/ecomAndroid/data/dataSource/SafeEcomMockDataSourceImpl$Companion;", "", "()V", "attemptsCount", "", "", "", "getAttemptsCount", "()Ljava/util/Map;", "setAttemptsCount", "(Ljava/util/Map;)V", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final Map<String, Integer> getAttemptsCount() {
            return SafeEcomMockDataSourceImpl.attemptsCount;
        }

        public final void setAttemptsCount(Map<String, Integer> map) {
            zdlpuopuiu.btonecajqb(map, "<set-?>");
            SafeEcomMockDataSourceImpl.attemptsCount = map;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.dataSource.SafeEcomMockDataSourceImpl$deactivateBinding$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.dataSource.SafeEcomMockDataSourceImpl", f = "SafeEcomMockDataSourceImpl.kt", l = {46}, m = "deactivateBinding")
    static final class AnonymousClass1 extends wkgbmnqykc {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SafeEcomMockDataSourceImpl.this.deactivateBinding(null, this);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.dataSource.SafeEcomMockDataSourceImpl$finish3dsMethod$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.dataSource.SafeEcomMockDataSourceImpl", f = "SafeEcomMockDataSourceImpl.kt", l = {78}, m = "finish3dsMethod")
    static final class C40491 extends wkgbmnqykc {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C40491(lg.gxszxtbevo<? super C40491> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SafeEcomMockDataSourceImpl.this.finish3dsMethod(null, this);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.dataSource.SafeEcomMockDataSourceImpl$finish3dsPayment$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.dataSource.SafeEcomMockDataSourceImpl", f = "SafeEcomMockDataSourceImpl.kt", l = {73}, m = "finish3dsPayment")
    static final class C40501 extends wkgbmnqykc {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C40501(lg.gxszxtbevo<? super C40501> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SafeEcomMockDataSourceImpl.this.finish3dsPayment(null, this);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.dataSource.SafeEcomMockDataSourceImpl$getPaymentOrder$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.dataSource.SafeEcomMockDataSourceImpl", f = "SafeEcomMockDataSourceImpl.kt", l = {62}, m = "getPaymentOrder")
    static final class C40511 extends wkgbmnqykc {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C40511(lg.gxszxtbevo<? super C40511> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SafeEcomMockDataSourceImpl.this.getPaymentOrder(null, this);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.dataSource.SafeEcomMockDataSourceImpl$getPaymentToken$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.dataSource.SafeEcomMockDataSourceImpl", f = "SafeEcomMockDataSourceImpl.kt", l = {51}, m = "getPaymentToken")
    static final class C40521 extends wkgbmnqykc {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C40521(lg.gxszxtbevo<? super C40521> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SafeEcomMockDataSourceImpl.this.getPaymentToken(null, this);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.dataSource.SafeEcomMockDataSourceImpl$getSessionId$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.dataSource.SafeEcomMockDataSourceImpl", f = "SafeEcomMockDataSourceImpl.kt", l = {C4007z9.J}, m = "getSessionId")
    static final class C40531 extends wkgbmnqykc {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C40531(lg.gxszxtbevo<? super C40531> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SafeEcomMockDataSourceImpl.this.getSessionId(null, this);
        }
    }

    public SafeEcomMockDataSourceImpl(Context context, ITracker tracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        this.context = context;
        this.tracker = tracker;
        this.ecomSdkOptionsRepository = ecomSdkOptionsRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource
    public Object deactivateBinding(DeactivateBindingRequestBody deactivateBindingRequestBody, lg.gxszxtbevo<? super kcexrzcfyt<wwaezpbzkn>> gxszxtbevoVar) {
        AnonymousClass1 anonymousClass1;
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
        Object obj = anonymousClass1.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = anonymousClass1.label;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            anonymousClass1.label = 1;
            if (crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, anonymousClass1) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        kcexrzcfyt kcexrzcfytVarDxjokdxxww = kcexrzcfyt.dxjokdxxww(200, wwaezpbzkn.f37140iobyxmoadg);
        zdlpuopuiu.dxjokdxxww(kcexrzcfytVarDxjokdxxww, "success(...)");
        return kcexrzcfytVarDxjokdxxww;
    }

    @Override // modern.payments.ecomAndroid.data.dataSource.MockResponses
    public <T> kcexrzcfyt<T> errorResponse(int i13, String str, String str2, String str3) {
        return MockResponses.DefaultImpls.errorResponse(this, i13, str, str2, str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource
    public Object finish3dsMethod(Finish3dsMethodRequestBody finish3dsMethodRequestBody, lg.gxszxtbevo<? super kcexrzcfyt<FinishMethodResponseBodyDto>> gxszxtbevoVar) {
        C40491 c40491;
        SafeEcomMockDataSourceImpl safeEcomMockDataSourceImpl;
        if (gxszxtbevoVar instanceof C40491) {
            c40491 = (C40491) gxszxtbevoVar;
            int i13 = c40491.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40491.label = i13 - Integer.MIN_VALUE;
            } else {
                c40491 = new C40491(gxszxtbevoVar);
            }
        } else {
            c40491 = new C40491(gxszxtbevoVar);
        }
        Object obj = c40491.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c40491.label;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            c40491.L$0 = this;
            c40491.label = 1;
            if (crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, c40491) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            safeEcomMockDataSourceImpl = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SafeEcomMockDataSourceImpl safeEcomMockDataSourceImpl2 = (SafeEcomMockDataSourceImpl) c40491.L$0;
            gg.zdlpuopuiu.zoijcleaow(obj);
            safeEcomMockDataSourceImpl = safeEcomMockDataSourceImpl2;
        }
        return MockResponses.DefaultImpls.errorResponse$default(safeEcomMockDataSourceImpl, OkHttpErrorHandlerImpl.HTTP_NOT_FOUND, "Not found", null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource
    public Object finish3dsPayment(Finish3dsPaymentRequestBody finish3dsPaymentRequestBody, lg.gxszxtbevo<? super kcexrzcfyt<FinishPaymentResponseBodyDto>> gxszxtbevoVar) {
        C40501 c40501;
        SafeEcomMockDataSourceImpl safeEcomMockDataSourceImpl;
        if (gxszxtbevoVar instanceof C40501) {
            c40501 = (C40501) gxszxtbevoVar;
            int i13 = c40501.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40501.label = i13 - Integer.MIN_VALUE;
            } else {
                c40501 = new C40501(gxszxtbevoVar);
            }
        } else {
            c40501 = new C40501(gxszxtbevoVar);
        }
        Object obj = c40501.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c40501.label;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            c40501.L$0 = this;
            c40501.label = 1;
            if (crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, c40501) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            safeEcomMockDataSourceImpl = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SafeEcomMockDataSourceImpl safeEcomMockDataSourceImpl2 = (SafeEcomMockDataSourceImpl) c40501.L$0;
            gg.zdlpuopuiu.zoijcleaow(obj);
            safeEcomMockDataSourceImpl = safeEcomMockDataSourceImpl2;
        }
        return MockResponses.DefaultImpls.errorResponse$default(safeEcomMockDataSourceImpl, OkHttpErrorHandlerImpl.HTTP_NOT_FOUND, "Not found", null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource
    public Object getPaymentOrder(PaymentOrderRequestBody paymentOrderRequestBody, lg.gxszxtbevo<? super kcexrzcfyt<EcomPaymentOrderResponseBodyDto>> gxszxtbevoVar) {
        C40511 c40511;
        SafeEcomMockDataSourceImpl safeEcomMockDataSourceImpl;
        if (gxszxtbevoVar instanceof C40511) {
            c40511 = (C40511) gxszxtbevoVar;
            int i13 = c40511.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40511.label = i13 - Integer.MIN_VALUE;
            } else {
                c40511 = new C40511(gxszxtbevoVar);
            }
        } else {
            c40511 = new C40511(gxszxtbevoVar);
        }
        Object obj = c40511.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c40511.label;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            c40511.L$0 = this;
            c40511.label = 1;
            if (crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, c40511) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            safeEcomMockDataSourceImpl = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            safeEcomMockDataSourceImpl = (SafeEcomMockDataSourceImpl) c40511.L$0;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        EcomPaymentOrderResponseBodyDto ecomPaymentOrderResponseBodyDto = (EcomPaymentOrderResponseBodyDto) new Gson().gtknphoqwx(CommonExtensionsKt.readJsonFromAssets("ecomPaymentOrder.json", safeEcomMockDataSourceImpl.context, safeEcomMockDataSourceImpl.tracker, safeEcomMockDataSourceImpl.ecomSdkOptionsRepository), EcomPaymentOrderResponseBodyDto.class);
        zdlpuopuiu.lqeggnwhkg(ecomPaymentOrderResponseBodyDto);
        return safeEcomMockDataSourceImpl.successfulResponse(ecomPaymentOrderResponseBodyDto);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource
    public Object getPaymentToken(PaymentTokenRequestBody paymentTokenRequestBody, lg.gxszxtbevo<? super kcexrzcfyt<EcomPaymentTokenResponseBodyDto>> gxszxtbevoVar) {
        C40521 c40521;
        SafeEcomMockDataSourceImpl safeEcomMockDataSourceImpl;
        if (gxszxtbevoVar instanceof C40521) {
            c40521 = (C40521) gxszxtbevoVar;
            int i13 = c40521.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40521.label = i13 - Integer.MIN_VALUE;
            } else {
                c40521 = new C40521(gxszxtbevoVar);
            }
        } else {
            c40521 = new C40521(gxszxtbevoVar);
        }
        Object obj = c40521.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c40521.label;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            c40521.L$0 = this;
            c40521.label = 1;
            if (crxdokpmqz.zoijcleaow(1000L, c40521) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            safeEcomMockDataSourceImpl = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            safeEcomMockDataSourceImpl = (SafeEcomMockDataSourceImpl) c40521.L$0;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        EcomPaymentTokenResponseBodyDto ecomPaymentTokenResponseBodyDto = (EcomPaymentTokenResponseBodyDto) new Gson().gtknphoqwx(CommonExtensionsKt.readJsonFromAssets("ecomPaymentToken.json", safeEcomMockDataSourceImpl.context, safeEcomMockDataSourceImpl.tracker, safeEcomMockDataSourceImpl.ecomSdkOptionsRepository), EcomPaymentTokenResponseBodyDto.class);
        zdlpuopuiu.lqeggnwhkg(ecomPaymentTokenResponseBodyDto);
        return safeEcomMockDataSourceImpl.successfulResponse(ecomPaymentTokenResponseBodyDto);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // modern.payments.ecomAndroid.domain.dataSource.SafeEcomDataSource
    public Object getSessionId(SessionIdRequestBody sessionIdRequestBody, lg.gxszxtbevo<? super kcexrzcfyt<EcomSessionIdResponseBodyDto>> gxszxtbevoVar) {
        C40531 c40531;
        SafeEcomMockDataSourceImpl safeEcomMockDataSourceImpl;
        if (gxszxtbevoVar instanceof C40531) {
            c40531 = (C40531) gxszxtbevoVar;
            int i13 = c40531.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40531.label = i13 - Integer.MIN_VALUE;
            } else {
                c40531 = new C40531(gxszxtbevoVar);
            }
        } else {
            c40531 = new C40531(gxszxtbevoVar);
        }
        Object obj = c40531.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c40531.label;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            attemptsCount.clear();
            c40531.L$0 = this;
            c40531.label = 1;
            if (crxdokpmqz.zoijcleaow(MockConstants.TWO_SECONDS_DELAY, c40531) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            safeEcomMockDataSourceImpl = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            safeEcomMockDataSourceImpl = (SafeEcomMockDataSourceImpl) c40531.L$0;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        EcomSessionIdResponseBodyDto ecomSessionIdResponseBodyDto = (EcomSessionIdResponseBodyDto) new Gson().gtknphoqwx(CommonExtensionsKt.readJsonFromAssets("ecomSessionIdResponse.json", safeEcomMockDataSourceImpl.context, safeEcomMockDataSourceImpl.tracker, safeEcomMockDataSourceImpl.ecomSdkOptionsRepository), EcomSessionIdResponseBodyDto.class);
        zdlpuopuiu.lqeggnwhkg(ecomSessionIdResponseBodyDto);
        return safeEcomMockDataSourceImpl.successfulResponse(ecomSessionIdResponseBodyDto);
    }

    @Override // modern.payments.ecomAndroid.data.dataSource.MockResponses
    public <T> kcexrzcfyt<T> successfulResponse(T t13) {
        return MockResponses.DefaultImpls.successfulResponse(this, t13);
    }
}
