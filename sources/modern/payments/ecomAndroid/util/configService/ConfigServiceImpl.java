package modern.payments.ecomAndroid.util.configService;

import android.util.Log;
import com.google.gson.Gson;
import gg.lqeggnwhkg;
import io.appmetrica.analytics.impl.C4007z9;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.gxszxtbevo;
import kotlin.coroutines.jvm.internal.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import mg.zoijcleaow;
import modern.payments.ecomAndroid.data.api.ContentResponse;
import modern.payments.ecomAndroid.data.dto.EcomSdkConfigDto;
import modern.payments.ecomAndroid.domain.configService.ConfigService;
import modern.payments.ecomAndroid.domain.model.response.EcomSdkConfig;
import modern.payments.ecomAndroid.domain.repository.EcomSdkOptionsRepository;
import modern.payments.ecomAndroid.domain.repository.UnsafeEcomApiRepository;
import modern.payments.ecomAndroid.util.ResourceManager;
import modern.payments.ecomAndroid.util.extension.FeatureExtensionsKt;
import modern.payments.tracker.ITracker;
import rg.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0015"}, d2 = {"Lmodern/payments/ecomAndroid/util/configService/ConfigServiceImpl;", "Lmodern/payments/ecomAndroid/domain/configService/ConfigService;", "Lmodern/payments/ecomAndroid/util/ResourceManager;", "resourceManager", "Lmodern/payments/ecomAndroid/domain/repository/UnsafeEcomApiRepository;", "unsafeEcomApiRepository", "Lmodern/payments/tracker/ITracker;", "tracker", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomSdkOptionsRepository", "<init>", "(Lmodern/payments/ecomAndroid/util/ResourceManager;Lmodern/payments/ecomAndroid/domain/repository/UnsafeEcomApiRepository;Lmodern/payments/tracker/ITracker;Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;)V", "Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;", "getRemoteConfig", "(Llg/gxszxtbevo;)Ljava/lang/Object;", "getConfigFromAssets", "()Lmodern/payments/ecomAndroid/domain/model/response/EcomSdkConfig;", "Lmodern/payments/ecomAndroid/util/ResourceManager;", "Lmodern/payments/ecomAndroid/domain/repository/UnsafeEcomApiRepository;", "Lmodern/payments/tracker/ITracker;", "Lmodern/payments/ecomAndroid/domain/repository/EcomSdkOptionsRepository;", "ecomAndroid_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ConfigServiceImpl implements ConfigService {
    private final EcomSdkOptionsRepository ecomSdkOptionsRepository;
    private final ResourceManager resourceManager;
    private final ITracker tracker;
    private final UnsafeEcomApiRepository unsafeEcomApiRepository;

    /* JADX INFO: renamed from: modern.payments.ecomAndroid.util.configService.ConfigServiceImpl$getRemoteConfig$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @gxszxtbevo(c = "modern.payments.ecomAndroid.util.configService.ConfigServiceImpl", f = "ConfigServiceImpl.kt", l = {C4007z9.F}, m = "getRemoteConfig")
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
            return ConfigServiceImpl.this.getRemoteConfig(this);
        }
    }

    public ConfigServiceImpl(ResourceManager resourceManager, UnsafeEcomApiRepository unsafeEcomApiRepository, ITracker tracker, EcomSdkOptionsRepository ecomSdkOptionsRepository) {
        zdlpuopuiu.btonecajqb(resourceManager, "resourceManager");
        zdlpuopuiu.btonecajqb(unsafeEcomApiRepository, "unsafeEcomApiRepository");
        zdlpuopuiu.btonecajqb(tracker, "tracker");
        zdlpuopuiu.btonecajqb(ecomSdkOptionsRepository, "ecomSdkOptionsRepository");
        this.resourceManager = resourceManager;
        this.unsafeEcomApiRepository = unsafeEcomApiRepository;
        this.tracker = tracker;
        this.ecomSdkOptionsRepository = ecomSdkOptionsRepository;
    }

    @Override // modern.payments.ecomAndroid.domain.configService.ConfigService
    public EcomSdkConfig getConfigFromAssets() throws Throwable {
        Throwable th2;
        String strPpxfxbqfkf;
        EcomSdkConfig model = null;
        try {
            Gson gson = new Gson();
            InputStream inputStreamOpen = this.resourceManager.getAssets().open("ecomRemoteConfigAndroid.json");
            zdlpuopuiu.dxjokdxxww(inputStreamOpen, "open(...)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, mj.wkgbmnqykc.f67326zoijcleaow), 8192);
            try {
                strPpxfxbqfkf = gtknphoqwx.ppxfxbqfkf(bufferedReader);
                try {
                    bufferedReader.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    bufferedReader.close();
                } catch (Throwable th5) {
                    lqeggnwhkg.iobyxmoadg(th4, th5);
                }
                th2 = th4;
                strPpxfxbqfkf = null;
            }
            if (th2 != null) {
                throw th2;
            }
            zdlpuopuiu.lqeggnwhkg(strPpxfxbqfkf);
            model = ((EcomSdkConfigDto) gson.gtknphoqwx(strPpxfxbqfkf, EcomSdkConfigDto.class)).toModel();
            FeatureExtensionsKt.track$default(this.tracker, this.ecomSdkOptionsRepository, "CONFIG_FROM_ASSETS : " + model, null, ITracker.Priority.INFO, null, 20, null);
            return model;
        } catch (Exception e13) {
            Log.i("CATCH BLOCK EXCEPTION", e13.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // modern.payments.ecomAndroid.domain.configService.ConfigService
    public Object getRemoteConfig(lg.gxszxtbevo<? super EcomSdkConfig> gxszxtbevoVar) {
        AnonymousClass1 anonymousClass1;
        ConfigServiceImpl configServiceImpl;
        EcomSdkConfig ecomSdkConfig;
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
        Object config = anonymousClass1.result;
        Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
        int i14 = anonymousClass1.label;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(config);
            UnsafeEcomApiRepository unsafeEcomApiRepository = this.unsafeEcomApiRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            config = unsafeEcomApiRepository.getConfig(anonymousClass1);
            if (config == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            configServiceImpl = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            configServiceImpl = (ConfigServiceImpl) anonymousClass1.L$0;
            gg.zdlpuopuiu.zoijcleaow(config);
        }
        ContentResponse contentResponse = (ContentResponse) config;
        if (contentResponse instanceof ContentResponse.Success) {
            ecomSdkConfig = (EcomSdkConfig) ((ContentResponse.Success) contentResponse).getData();
        } else {
            if (!(contentResponse instanceof ContentResponse.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            ecomSdkConfig = null;
        }
        FeatureExtensionsKt.track$default(configServiceImpl.tracker, configServiceImpl.ecomSdkOptionsRepository, "CONFIG_FROM_API : " + ecomSdkConfig, null, ITracker.Priority.INFO, null, 20, null);
        return ecomSdkConfig;
    }
}
