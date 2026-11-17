package spay.sdk;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.gson.Gson;
import gf.iobyxmoadg;
import gg.eablkybsjg;
import gg.vdvldrhtss;
import gg.wwaezpbzkn;
import kk.ag;
import kk.bq;
import kk.c20;
import kk.c30;
import kk.c8;
import kk.ef;
import kk.g40;
import kk.gg;
import kk.gu;
import kk.hg0;
import kk.if0;
import kk.ii0;
import kk.jh;
import kk.jpowsppfya;
import kk.k50;
import kk.ka;
import kk.lh;
import kk.mc;
import kk.nb;
import kk.nk;
import kk.nw;
import kk.p2;
import kk.qb;
import kk.r00;
import kk.r20;
import kk.r80;
import kk.ss;
import kk.tk;
import kk.uf;
import kk.ux;
import kk.v90;
import kk.w00;
import kk.yo;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.hkdspvbjdz;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.Dn;
import pj.btonecajqb;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.dxjokdxxww;
import pj.ikoacuggdj;
import spay.sdk.api.InitializationResult;
import spay.sdk.api.PaymentResult;
import spay.sdk.api.SPayMethod;
import spay.sdk.api.SPaySdkInitConfig;
import spay.sdk.api.SPayStage;
import spay.sdk.api.model.SPaymentRequest;
import spay.sdk.data.dto.SPaySdkInitConfigDto;
import tg.draadjrbmk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ^2\u00020\u0001:\u0001^J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u000f¢\u0006\u0004\b\u0017\u0010\u0013J_\u0010 \u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b \u0010!J_\u0010\"\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b\"\u0010!Jg\u0010$\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J]\u0010(\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b(\u0010!J]\u0010)\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b)\u0010!J_\u0010*\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b*\u0010!J_\u0010+\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00182\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00060\u000fH\u0007¢\u0006\u0004\b+\u0010!J'\u0010/\u001a\u0014\u0012\u0004\u0012\u00020-\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180.0,2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b/\u00100J\u001d\u00102\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u00101\u001a\u00020\u001f¢\u0006\u0004\b2\u00103R$\u0010;\u001a\u0004\u0018\u0001048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010E\u001a\u00020D8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010L\u001a\u00020K8\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\bL\u0010M\u0012\u0004\bR\u0010'\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010T\u001a\u00020S8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020Z8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006_"}, d2 = {"Lspay/sdk/SPaySdkApp;", "", "Lspay/sdk/api/SPayMethod;", "method", "Lspay/sdk/api/model/SPaymentRequest;", "request", "Lgg/wwaezpbzkn;", "pay", "(Lspay/sdk/api/SPayMethod;Lspay/sdk/api/model/SPaymentRequest;)V", "Landroid/content/Context;", "context", "Lspay/sdk/api/SPaySdkInitConfig;", "config", "initialize", "(Landroid/content/Context;Lspay/sdk/api/SPaySdkInitConfig;)V", "Lkotlin/Function1;", "Lspay/sdk/api/InitializationResult;", "initializationResultCallback", "reInitialize$SPaySDK_baseRelease", "(Landroid/content/Context;Ltg/draadjrbmk;)V", "reInitialize", "Lspay/sdk/api/SdkReadyCheckResult;", "callback", "isReadyForSPaySdk", "", "apiKey", "merchantLogin", "bankInvoiceId", "orderNumber", "appPackage", "language", "Lspay/sdk/api/PaymentResult;", "payWithBonuses", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltg/draadjrbmk;)V", "payWithPaymentAccounts", "bindingId", "payWithBinding", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltg/draadjrbmk;)V", "logout", "()V", "payWithoutRefresh", "payWithPartPay", "payWithBankInvoiceId", "payOnline", "Lgg/vdvldrhtss;", "", "", "checkPermissions", "(Landroid/content/Context;)Lgg/vdvldrhtss;", "paymentResult", "completePayment", "(Landroid/content/Context;Lspay/sdk/api/PaymentResult;)V", "Lkk/bq;", "b", "Lkk/bq;", "getSdkComponent$SPaySDK_baseRelease", "()Lkk/bq;", "setSdkComponent$SPaySDK_baseRelease", "(Lkk/bq;)V", "sdkComponent", "Lpj/cllcsxoeiz;", "c", "Lpj/cllcsxoeiz;", "getScope$SPaySDK_baseRelease", "()Lpj/cllcsxoeiz;", "setScope$SPaySDK_baseRelease", "(Lpj/cllcsxoeiz;)V", "scope", "Lkk/ka;", "sPaySdkMerchantOptionsRepository", "Lkk/ka;", "getSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease", "()Lkk/ka;", "setSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease", "(Lkk/ka;)V", "Lkk/gg;", "_secureSharedPreferences", "Lkk/gg;", "get_secureSharedPreferences$SPaySDK_baseRelease", "()Lkk/gg;", "set_secureSharedPreferences$SPaySDK_baseRelease", "(Lkk/gg;)V", "get_secureSharedPreferences$SPaySDK_baseRelease$annotations", "Lkk/nw;", "loggingContract", "Lkk/nw;", "getLoggingContract$SPaySDK_baseRelease", "()Lkk/nw;", "setLoggingContract$SPaySDK_baseRelease", "(Lkk/nw;)V", "Lkk/yo;", "getSecureSharedPreferences$SPaySDK_baseRelease", "()Lkk/yo;", "secureSharedPreferences", "Companion", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SPaySdkApp {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile SPaySdkApp f107829d;
    public gg _secureSharedPreferences;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yo f107830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public bq sdkComponent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public cllcsxoeiz scope = dsvhmnatus.iobyxmoadg(ikoacuggdj.zoijcleaow());
    public nw loggingContract;
    public ka sPaySdkMerchantOptionsRepository;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lspay/sdk/SPaySdkApp$Companion;", "", "Lspay/sdk/SPaySdkApp;", "getInstance", "()Lspay/sdk/SPaySdkApp;", "", "INIT_CONFIG", "Ljava/lang/String;", "instance", "Lspay/sdk/SPaySdkApp;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(gtknphoqwx gtknphoqwxVar) {
        }

        public final synchronized SPaySdkApp getInstance() {
            SPaySdkApp sPaySdkApp;
            try {
                if (SPaySdkApp.f107829d == null) {
                    SPaySdkApp.f107829d = new SPaySdkApp(null);
                }
                sPaySdkApp = SPaySdkApp.f107829d;
                zdlpuopuiu.lqeggnwhkg(sPaySdkApp);
            } catch (Throwable th2) {
                throw th2;
            }
            return sPaySdkApp;
        }
    }

    public SPaySdkApp(gtknphoqwx gtknphoqwxVar) {
    }

    public static final void access$cacheConfigToSharedPreferences(SPaySdkApp sPaySdkApp, SPaySdkInitConfig sPaySdkInitConfig) {
        sPaySdkApp.getClass();
        String strZdlpuopuiu = new Gson().zdlpuopuiu(sPaySdkInitConfig.toSPaySdkInitConfigDto());
        zdlpuopuiu.dxjokdxxww(strZdlpuopuiu, "gson.toJson(config.toSPaySdkInitConfigDto())");
        yo yoVar = sPaySdkApp.f107830a;
        if (yoVar != null) {
            ef.zoijcleaow(yoVar, "SPaySdkInitConfig", strZdlpuopuiu);
        }
    }

    public static final void access$initLocalSecuredSharedPrefs(SPaySdkApp sPaySdkApp, Context context) {
        if (sPaySdkApp.f107830a == null) {
            yo yoVar = new yo(context);
            sPaySdkApp.f107830a = yoVar;
            yoVar.ppxfxbqfkf();
        }
    }

    public static /* synthetic */ void get_secureSharedPreferences$SPaySDK_baseRelease$annotations() {
    }

    public final SPaySdkInitConfig a(draadjrbmk draadjrbmkVar) {
        try {
            yo yoVar = this.f107830a;
            String str = yoVar != null ? (String) ef.iobyxmoadg(yoVar, "SPaySdkInitConfig", "") : null;
            if (str != null) {
                try {
                    return ((SPaySdkInitConfigDto) new Gson().gtknphoqwx(str, SPaySdkInitConfigDto.class)).toSPaySdkInitConfig();
                } catch (Exception e13) {
                    a(e13);
                }
            }
            return null;
        } catch (Exception e14) {
            draadjrbmkVar.invoke(new InitializationResult.ConfigError("SPaySdkApp initialize with exception : " + e14.getMessage()));
            return null;
        }
    }

    public final vdvldrhtss checkPermissions(Context context) {
        c cVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(context, "context");
        synchronized (r80.f58283iobyxmoadg) {
            cVarIobyxmoadg = c.f107839f.iobyxmoadg();
        }
        return cVarIobyxmoadg.a(context);
    }

    public final void completePayment(Context context, PaymentResult paymentResult) {
        c cVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(paymentResult, "paymentResult");
        synchronized (r80.f58283iobyxmoadg) {
            cVarIobyxmoadg = c.f107839f.iobyxmoadg();
        }
        cVarIobyxmoadg.getClass();
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(paymentResult, "paymentResult");
        context.startActivity(new Intent(context, (Class<?>) RedirectActivity.class).putExtra("PAYMENT_RESULT", paymentResult));
    }

    public final nw getLoggingContract$SPaySDK_baseRelease() {
        nw nwVar = this.loggingContract;
        if (nwVar != null) {
            return nwVar;
        }
        zdlpuopuiu.pmvmpeiblj("loggingContract");
        return null;
    }

    public final ka getSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease() {
        ka kaVar = this.sPaySdkMerchantOptionsRepository;
        if (kaVar != null) {
            return kaVar;
        }
        zdlpuopuiu.pmvmpeiblj("sPaySdkMerchantOptionsRepository");
        return null;
    }

    /* JADX INFO: renamed from: getScope$SPaySDK_baseRelease, reason: from getter */
    public final cllcsxoeiz getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: getSdkComponent$SPaySDK_baseRelease, reason: from getter */
    public final bq getSdkComponent() {
        return this.sdkComponent;
    }

    public final yo getSecureSharedPreferences$SPaySDK_baseRelease() {
        gg ggVar = get_secureSharedPreferences$SPaySDK_baseRelease();
        zdlpuopuiu.nufgyqmvbu(ggVar, "null cannot be cast to non-null type spay.sdk.utils.storage.SecureSharedPreferences");
        return (yo) ggVar;
    }

    public final gg get_secureSharedPreferences$SPaySDK_baseRelease() {
        gg ggVar = this._secureSharedPreferences;
        if (ggVar != null) {
            return ggVar;
        }
        zdlpuopuiu.pmvmpeiblj("_secureSharedPreferences");
        return null;
    }

    public final void initialize(Context context, SPaySdkInitConfig config) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(config, "config");
        try {
            dxjokdxxww.eablkybsjg(ikoacuggdj.iobyxmoadg(), new c30(this, context, config, null));
            a(context);
            bq bqVar = this.sdkComponent;
            if (bqVar != null) {
                tk tkVar = (tk) bqVar;
                this.sPaySdkMerchantOptionsRepository = (ka) tkVar.f58686eablkybsjg.get();
                this._secureSharedPreferences = (gg) tkVar.f58695lqeggnwhkg.get();
                this.loggingContract = (nw) tkVar.f58696nufgyqmvbu.get();
            }
            SPayStage stage = config.getStage();
            boolean enableLogging = config.getEnableLogging();
            iobyxmoadg.iobyxmoadg(context);
            if ((stage == SPayStage.SandBoxWithoutBankApp || stage == SPayStage.SandboxRealBankApp) && enableLogging) {
                jc2.iobyxmoadg.f51100iobyxmoadg.ojitshcjhn(new mc());
                ((ux) getLoggingContract$SPaySDK_baseRelease()).f58915iobyxmoadg = true;
            }
            int i13 = r00.f58257iobyxmoadg[config.getStage().ordinal()];
            if (i13 == 1) {
                ag.f55814zoijcleaow = 7;
            } else if (i13 != 2) {
                ag.f55814zoijcleaow = 1;
            } else {
                ag.f55814zoijcleaow = 6;
            }
            nb nbVar = (nb) getSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease();
            nbVar.getClass();
            zdlpuopuiu.btonecajqb(config, "options");
            nbVar.f57752iobyxmoadg = config;
            p2.f58030zoijcleaow = config.getSpasiboBonuses();
            getSecureSharedPreferences$SPaySDK_baseRelease().ppxfxbqfkf();
            SPaySdkInitConfig sPaySdkInitConfig = ((nb) getSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease()).f57752iobyxmoadg;
            if (sPaySdkInitConfig == null) {
                throw Dn.f70543zdlpuopuiu;
            }
            sPaySdkInitConfig.getInitializationResult().invoke(InitializationResult.Success.INSTANCE);
        } catch (Exception e13) {
            SPaySdkInitConfig sPaySdkInitConfig2 = ((nb) getSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease()).f57752iobyxmoadg;
            if (sPaySdkInitConfig2 == null) {
                throw Dn.f70543zdlpuopuiu;
            }
            sPaySdkInitConfig2.getInitializationResult().invoke(new InitializationResult.ConfigError("SPaySdkApp initialize with exception : " + e13.getMessage()));
        }
    }

    public final void isReadyForSPaySdk(Context context, draadjrbmk callback) {
        c cVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(callback, "callback");
        try {
            synchronized (r80.f58283iobyxmoadg) {
                cVarIobyxmoadg = c.f107839f.iobyxmoadg();
            }
            cVarIobyxmoadg.a(context, callback);
        } catch (Exception unused) {
            r80 r80Var = r80.f58283iobyxmoadg;
            r80.f58286zoijcleaow = null;
            r80.f58284ppxfxbqfkf = null;
            c.f107840g = null;
            r80Var.iobyxmoadg().a(context, callback);
        }
    }

    public final void logout() {
        c cVarIobyxmoadg;
        synchronized (r80.f58283iobyxmoadg) {
            cVarIobyxmoadg = c.f107839f.iobyxmoadg();
        }
        cVarIobyxmoadg.getClass();
        Companion companion = INSTANCE;
        if (companion.getInstance().getSecureSharedPreferences$SPaySDK_baseRelease().f59470zoijcleaow != null) {
            companion.getInstance().getSecureSharedPreferences$SPaySDK_baseRelease().zoijcleaow();
        }
    }

    public final void pay(SPayMethod method, SPaymentRequest request) {
        c cVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(method, "method");
        zdlpuopuiu.btonecajqb(request, "request");
        synchronized (r80.f58283iobyxmoadg) {
            cVarIobyxmoadg = c.f107839f.iobyxmoadg();
        }
        cVarIobyxmoadg.a(method, request);
    }

    @eablkybsjg
    public final void payOnline(Context context, String apiKey, String merchantLogin, String bankInvoiceId, String orderNumber, String appPackage, String language, draadjrbmk callback) {
        c cVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb(callback, "callback");
        synchronized (r80.f58283iobyxmoadg) {
            cVarIobyxmoadg = c.f107839f.iobyxmoadg();
        }
        cVarIobyxmoadg.getClass();
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb("", "phoneNumber");
        zdlpuopuiu.btonecajqb(callback, "callback");
        cVarIobyxmoadg.a(SPayMethod.Default.INSTANCE, new SPaymentRequest(context, apiKey, bankInvoiceId, orderNumber, merchantLogin, appPackage, "", callback));
    }

    @eablkybsjg
    public final void payWithBankInvoiceId(Context context, String apiKey, String merchantLogin, String bankInvoiceId, String orderNumber, String appPackage, String language, draadjrbmk callback) {
        c cVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb(callback, "callback");
        synchronized (r80.f58283iobyxmoadg) {
            cVarIobyxmoadg = c.f107839f.iobyxmoadg();
        }
        v90.iobyxmoadg(cVarIobyxmoadg, context, apiKey, merchantLogin, bankInvoiceId, orderNumber, appPackage, callback);
    }

    @eablkybsjg
    public final void payWithBinding(Context context, String apiKey, String merchantLogin, String bankInvoiceId, String bindingId, String orderNumber, String appPackage, String language, draadjrbmk callback) {
        c cVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(bindingId, "bindingId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb(callback, "callback");
        synchronized (r80.f58283iobyxmoadg) {
            cVarIobyxmoadg = c.f107839f.iobyxmoadg();
        }
        cVarIobyxmoadg.getClass();
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(bindingId, "bindingId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb("", "phoneNumber");
        zdlpuopuiu.btonecajqb(callback, "callback");
        cVarIobyxmoadg.a(new SPayMethod.WithBinding(bindingId), new SPaymentRequest(context, apiKey, bankInvoiceId, orderNumber, merchantLogin, appPackage, "", callback));
    }

    @eablkybsjg
    public final void payWithBonuses(Context context, String apiKey, String merchantLogin, String bankInvoiceId, String orderNumber, String appPackage, String language, draadjrbmk callback) {
        c cVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb(callback, "callback");
        synchronized (r80.f58283iobyxmoadg) {
            cVarIobyxmoadg = c.f107839f.iobyxmoadg();
        }
        cVarIobyxmoadg.getClass();
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb("", "phoneNumber");
        zdlpuopuiu.btonecajqb(callback, "callback");
        cVarIobyxmoadg.a(SPayMethod.WithBonuses.INSTANCE, new SPaymentRequest(context, apiKey, bankInvoiceId, orderNumber, merchantLogin, appPackage, "", callback));
    }

    @eablkybsjg
    public final void payWithPartPay(Context context, String apiKey, String merchantLogin, String bankInvoiceId, String orderNumber, String appPackage, String language, draadjrbmk callback) {
        c cVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb(callback, "callback");
        synchronized (r80.f58283iobyxmoadg) {
            cVarIobyxmoadg = c.f107839f.iobyxmoadg();
        }
        cVarIobyxmoadg.getClass();
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb("", "phoneNumber");
        zdlpuopuiu.btonecajqb(callback, "callback");
        cVarIobyxmoadg.a(SPayMethod.WithPartPay.INSTANCE, new SPaymentRequest(context, apiKey, bankInvoiceId, orderNumber, merchantLogin, appPackage, "", callback));
    }

    @eablkybsjg
    public final void payWithPaymentAccounts(Context context, String apiKey, String merchantLogin, String bankInvoiceId, String orderNumber, String appPackage, String language, draadjrbmk callback) {
        c cVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb(callback, "callback");
        synchronized (r80.f58283iobyxmoadg) {
            cVarIobyxmoadg = c.f107839f.iobyxmoadg();
        }
        cVarIobyxmoadg.getClass();
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb("", "phoneNumber");
        zdlpuopuiu.btonecajqb(callback, "callback");
        cVarIobyxmoadg.a(SPayMethod.WithPaymentAccount.INSTANCE, new SPaymentRequest(context, apiKey, bankInvoiceId, orderNumber, merchantLogin, appPackage, "", callback));
    }

    @eablkybsjg
    public final void payWithoutRefresh(Context context, String apiKey, String merchantLogin, String bankInvoiceId, String orderNumber, String appPackage, String language, draadjrbmk callback) {
        c cVarIobyxmoadg;
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb(callback, "callback");
        synchronized (r80.f58283iobyxmoadg) {
            cVarIobyxmoadg = c.f107839f.iobyxmoadg();
        }
        cVarIobyxmoadg.getClass();
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(apiKey, "apiKey");
        zdlpuopuiu.btonecajqb(merchantLogin, "merchantLogin");
        zdlpuopuiu.btonecajqb(bankInvoiceId, "bankInvoiceId");
        zdlpuopuiu.btonecajqb(orderNumber, "orderNumber");
        zdlpuopuiu.btonecajqb(appPackage, "appPackage");
        zdlpuopuiu.btonecajqb("", "phoneNumber");
        zdlpuopuiu.btonecajqb(callback, "callback");
        cVarIobyxmoadg.a(SPayMethod.WithoutRefresh.INSTANCE, new SPaymentRequest(context, apiKey, bankInvoiceId, orderNumber, merchantLogin, appPackage, "", callback));
    }

    public final void reInitialize$SPaySDK_baseRelease(Context context, draadjrbmk initializationResultCallback) {
        zdlpuopuiu.btonecajqb(context, "context");
        zdlpuopuiu.btonecajqb(initializationResultCallback, "initializationResultCallback");
        hkdspvbjdz hkdspvbjdzVar = new hkdspvbjdz();
        btonecajqb.zoijcleaow(null, new g40(this, context, hkdspvbjdzVar, initializationResultCallback, null), 1, null);
        if (this.sdkComponent != null) {
            SPaySdkInitConfig sPaySdkInitConfig = ((nb) getSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease()).f57752iobyxmoadg;
            if (sPaySdkInitConfig == null) {
                throw Dn.f70543zdlpuopuiu;
            }
            sPaySdkInitConfig.getInitializationResult().invoke(new InitializationResult.ConfigError("SPaySdkApp reInitialize failed. Please initialize SDK again."));
            return;
        }
        SPaySdkInitConfig sPaySdkInitConfig2 = (SPaySdkInitConfig) hkdspvbjdzVar.f60015zdlpuopuiu;
        if (sPaySdkInitConfig2 == null) {
            new k50(this);
        } else {
            initialize(context, sPaySdkInitConfig2.copy((127 & 1) != 0 ? sPaySdkInitConfig2.enableBnpl : false, (127 & 2) != 0 ? sPaySdkInitConfig2.stage : null, (127 & 4) != 0 ? sPaySdkInitConfig2.helperConfig : null, (127 & 8) != 0 ? sPaySdkInitConfig2.spasiboBonuses : false, (127 & 16) != 0 ? sPaySdkInitConfig2.resultViewNeeded : false, (127 & 32) != 0 ? sPaySdkInitConfig2.enableLogging : false, (127 & 64) != 0 ? sPaySdkInitConfig2.enableOutsideTouchCancelling : false, (127 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? sPaySdkInitConfig2.initializationResult : initializationResultCallback));
            wwaezpbzkn wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
        }
    }

    public final void setLoggingContract$SPaySDK_baseRelease(nw nwVar) {
        zdlpuopuiu.btonecajqb(nwVar, "<set-?>");
        this.loggingContract = nwVar;
    }

    public final void setSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease(ka kaVar) {
        zdlpuopuiu.btonecajqb(kaVar, "<set-?>");
        this.sPaySdkMerchantOptionsRepository = kaVar;
    }

    public final void setScope$SPaySDK_baseRelease(cllcsxoeiz cllcsxoeizVar) {
        zdlpuopuiu.btonecajqb(cllcsxoeizVar, "<set-?>");
        this.scope = cllcsxoeizVar;
    }

    public final void setSdkComponent$SPaySDK_baseRelease(bq bqVar) {
        this.sdkComponent = bqVar;
    }

    public final void set_secureSharedPreferences$SPaySDK_baseRelease(gg ggVar) {
        zdlpuopuiu.btonecajqb(ggVar, "<set-?>");
        this._secureSharedPreferences = ggVar;
    }

    public final void a(Exception exc) {
        SPaySdkInitConfig sPaySdkInitConfig = ((nb) getSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease()).f57752iobyxmoadg;
        if (sPaySdkInitConfig != null) {
            sPaySdkInitConfig.getInitializationResult().invoke(new InitializationResult.ConfigError("SPaySdkApp initialize with exception : " + exc.getMessage()));
            return;
        }
        throw Dn.f70543zdlpuopuiu;
    }

    public final synchronized void a(Context context) {
        if (this.sdkComponent != null) {
            return;
        }
        Context context2 = (Context) ag.dxjokdxxww.zoijcleaow(context);
        ag.dxjokdxxww.iobyxmoadg(context2, Context.class);
        this.sdkComponent = new tk(new c8(), new qb(), new hg0(), new lh(), new nk(), new uf(), new c20(), new r20(), new jh(), new ss(), new gu(), new if0(), new ii0(), new jpowsppfya(), new w00(), context2);
    }
}
