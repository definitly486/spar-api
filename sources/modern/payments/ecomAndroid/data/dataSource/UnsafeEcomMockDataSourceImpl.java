package modern.payments.ecomAndroid.data.dataSource;

import android.content.Context;
import com.google.gson.Gson;
import io.appmetrica.analytics.impl.C4007z9;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import lm.kcexrzcfyt;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.dto.EcomSbpConfigDto;
import modern.payments.ecomAndroid.data.dto.EcomSdkConfigDto;
import modern.payments.ecomAndroid.domain.dataSource.UnsafeEcomDataSource;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.util.extension.CommonExtensionsKt;
import modern.payments.tracker.ITracker;
import pj.crxdokpmqz;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u000eJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lmodern/payments/ecomAndroid/data/dataSource/UnsafeEcomMockDataSourceImpl;", "Lmodern/payments/ecomAndroid/domain/dataSource/UnsafeEcomDataSource;", "Lmodern/payments/ecomAndroid/data/dataSource/MockResponses;", "Landroid/content/Context;", "context", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "optionsRepository", "<init>", "(Landroid/content/Context;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)V", "Llm/kcexrzcfyt;", "Lmodern/payments/ecomAndroid/data/dto/EcomSdkConfigDto;", "getConfig", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "Lmodern/payments/ecomAndroid/data/dto/EcomSbpConfigDto;", "getSbpConfig", "", "serviceUrl", "getIpAddress", "(Ljava/lang/String;Llg/gxszxtbevo;)Ljava/lang/Object;", "Landroid/content/Context;", "Lmodern/payments/tracker/ITracker;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UnsafeEcomMockDataSourceImpl implements UnsafeEcomDataSource, MockResponses {
    private final Context context;
    private final EcomSdkOptionsRepository optionsRepository;
    private final ITracker tracker;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.dataSource.UnsafeEcomMockDataSourceImpl$getConfig$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.dataSource.UnsafeEcomMockDataSourceImpl", f = "UnsafeEcomMockDataSourceImpl.kt", l = {24}, m = "getConfig")
    static final class AnonymousClass1 extends wkgbmnqykc {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(lg.gxszxtbevo<? super AnonymousClass1> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UnsafeEcomMockDataSourceImpl.this.getConfig(this);
        }
    }

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.data.dataSource.UnsafeEcomMockDataSourceImpl$getSbpConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.data.dataSource.UnsafeEcomMockDataSourceImpl", f = "UnsafeEcomMockDataSourceImpl.kt", l = {C4007z9.J}, m = "getSbpConfig")
    static final class C40541 extends wkgbmnqykc {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C40541(lg.gxszxtbevo<? super C40541> gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UnsafeEcomMockDataSourceImpl.this.getSbpConfig(this);
        }
    }

    public UnsafeEcomMockDataSourceImpl(Context context, ITracker tracker, EcomSdkOptionsRepository optionsRepository) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(optionsRepository, "optionsRepository");
        this.context = context;
        this.tracker = tracker;
        this.optionsRepository = optionsRepository;
    }

    @Override // modern.payments.ecomAndroid.data.dataSource.MockResponses
    public <T> kcexrzcfyt<T> errorResponse(int i13, String str, String str2, String str3) {
        return MockResponses.DefaultImpls.errorResponse(this, i13, str, str2, str3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // modern.payments.ecomAndroid.domain.dataSource.UnsafeEcomDataSource
    public Object getConfig(lg.gxszxtbevo<? super kcexrzcfyt<EcomSdkConfigDto>> gxszxtbevoVar) {
        AnonymousClass1 anonymousClass1;
        UnsafeEcomMockDataSourceImpl unsafeEcomMockDataSourceImpl;
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
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (crxdokpmqz.zoijcleaow(1000L, anonymousClass1) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            unsafeEcomMockDataSourceImpl = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            unsafeEcomMockDataSourceImpl = (UnsafeEcomMockDataSourceImpl) anonymousClass1.L$0;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        EcomSdkConfigDto ecomSdkConfigDto = (EcomSdkConfigDto) new Gson().gtknphoqwx(CommonExtensionsKt.readJsonFromAssets("ecomRemoteConfigAndroid.json", unsafeEcomMockDataSourceImpl.context, unsafeEcomMockDataSourceImpl.tracker, unsafeEcomMockDataSourceImpl.optionsRepository), EcomSdkConfigDto.class);
        zdlpuopuiu.lqeggnwhkg(ecomSdkConfigDto);
        return unsafeEcomMockDataSourceImpl.successfulResponse(ecomSdkConfigDto);
    }

    @Override // modern.payments.ecomAndroid.domain.dataSource.UnsafeEcomDataSource
    public Object getIpAddress(String str, lg.gxszxtbevo<? super kcexrzcfyt<String>> gxszxtbevoVar) {
        kcexrzcfyt kcexrzcfytVarBtonecajqb = kcexrzcfyt.btonecajqb("0.0.0.0");
        zdlpuopuiu.dxjokdxxww(kcexrzcfytVarBtonecajqb, "success(...)");
        return kcexrzcfytVarBtonecajqb;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // modern.payments.ecomAndroid.domain.dataSource.UnsafeEcomDataSource
    public Object getSbpConfig(lg.gxszxtbevo<? super kcexrzcfyt<EcomSbpConfigDto>> gxszxtbevoVar) {
        C40541 c40541;
        UnsafeEcomMockDataSourceImpl unsafeEcomMockDataSourceImpl;
        if (gxszxtbevoVar instanceof C40541) {
            c40541 = (C40541) gxszxtbevoVar;
            int i13 = c40541.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40541.label = i13 - Integer.MIN_VALUE;
            } else {
                c40541 = new C40541(gxszxtbevoVar);
            }
        } else {
            c40541 = new C40541(gxszxtbevoVar);
        }
        Object obj = c40541.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = c40541.label;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            c40541.L$0 = this;
            c40541.label = 1;
            if (crxdokpmqz.zoijcleaow(1000L, c40541) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            unsafeEcomMockDataSourceImpl = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            unsafeEcomMockDataSourceImpl = (UnsafeEcomMockDataSourceImpl) c40541.L$0;
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        EcomSbpConfigDto ecomSbpConfigDto = (EcomSbpConfigDto) new Gson().gtknphoqwx(CommonExtensionsKt.readJsonFromAssets("ecomSbpConfig.json", unsafeEcomMockDataSourceImpl.context, unsafeEcomMockDataSourceImpl.tracker, unsafeEcomMockDataSourceImpl.optionsRepository), EcomSbpConfigDto.class);
        zdlpuopuiu.lqeggnwhkg(ecomSbpConfigDto);
        return unsafeEcomMockDataSourceImpl.successfulResponse(ecomSbpConfigDto);
    }

    @Override // modern.payments.ecomAndroid.data.dataSource.MockResponses
    public <T> kcexrzcfyt<T> successfulResponse(T t13) {
        return MockResponses.DefaultImpls.successfulResponse(this, t13);
    }
}
