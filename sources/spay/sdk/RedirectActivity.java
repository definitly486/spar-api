package spay.sdk;

import ag.dxjokdxxww;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.wkgbmnqykc;
import androidx.lifecycle.crxdokpmqz;
import androidx.lifecycle.gtknphoqwx;
import androidx.lifecycle.oxmwwwfdhm;
import androidx.lifecycle.ulzqkzuiru;
import kk.a2;
import kk.b9;
import kk.bt;
import kk.de0;
import kk.e6;
import kk.ec0;
import kk.ej;
import kk.fa;
import kk.fs;
import kk.g4;
import kk.h7;
import kk.ib;
import kk.ii0;
import kk.jhduphickx;
import kk.jlmebxxoox;
import kk.kc;
import kk.l1;
import kk.m60;
import kk.o00;
import kk.od0;
import kk.on;
import kk.pc;
import kk.pc0;
import kk.r80;
import kk.rj;
import kk.tc;
import kk.tf;
import kk.uawqvzlxes;
import kk.ve;
import kk.z8;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.zdlpuopuiu;
import sj.wypolnanlu;
import spay.sdk.RedirectActivity;
import spay.sdk.api.ErrorCode;
import spay.sdk.api.MerchantError;
import spay.sdk.api.PaymentResult;
import spay.sdk.domain.model.response.ErrorEntity;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lspay/sdk/RedirectActivity;", "Landroidx/appcompat/app/wkgbmnqykc;", "<init>", "()V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RedirectActivity extends wkgbmnqykc {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f107822g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pc0 f107823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b9 f107824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g4 f107825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h7 f107826d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public tc f107827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WebView f107828f;

    public static final void a(RedirectActivity redirectActivity) {
        LinearLayout linearLayout = new LinearLayout(redirectActivity);
        linearLayout.setLayoutParams(new RelativeLayout.LayoutParams(0, 0));
        WebView webView = new WebView(redirectActivity);
        redirectActivity.f107828f = webView;
        WebSettings settings = webView.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setAllowFileAccess(true);
            settings.setDomStorageEnabled(true);
        }
        WebView webView2 = redirectActivity.f107828f;
        if (webView2 != null) {
            webView2.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
        }
        linearLayout.addView(redirectActivity.f107828f);
    }

    @Override // androidx.fragment.app.oxmwwwfdhm, androidx.activity.nufgyqmvbu, androidx.core.app.lqeggnwhkg, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g4 g4Var = null;
        if (this.f107823a == null && r80.f58286zoijcleaow == null) {
            od0 od0Var = r80.f58284ppxfxbqfkf;
            if (od0Var != null) {
                tc tcVar = this.f107827e;
                if (tcVar == null) {
                    zdlpuopuiu.pmvmpeiblj("userIdManager");
                    tcVar = null;
                }
                od0Var.invoke(new PaymentResult.Error(tcVar.iobyxmoadg(), ErrorCode.INNER_COMPONENTS_HAS_NOT_BEEN_INITIALIZED_ON_COMPONENT_READY_CHECK, new MerchantError.InnerSdkComponentsError(null, 1, null)));
            }
            finish();
        }
        rj rjVar = r80.f58286zoijcleaow;
        if (rjVar != null) {
            this.f107823a = (pc0) rjVar.f58377dvvnrvtcbc.get();
            jlmebxxoox jlmebxxooxVar = (jlmebxxoox) rjVar.f58386iobyxmoadg.f58688gtknphoqwx.get();
            bt btVarZoijcleaow = rjVar.f58386iobyxmoadg.zoijcleaow();
            a2 a2Var = (a2) rjVar.f58380esjtqupxsv.get();
            de0 de0Var = (de0) rjVar.f58386iobyxmoadg.f58687esjtqupxsv.get();
            pc pcVar = (pc) rjVar.f58369btonecajqb.get();
            m60 m60Var = (m60) rjVar.f58432wkgbmnqykc.get();
            ii0 ii0Var = rjVar.f58386iobyxmoadg.f58706zoijcleaow;
            this.f107825c = new g4(jlmebxxooxVar, btVarZoijcleaow, a2Var, de0Var, pcVar, m60Var, (jhduphickx) dxjokdxxww.eablkybsjg(new jhduphickx()));
            Context context = rjVar.f58386iobyxmoadg.f58690iobyxmoadg;
            zdlpuopuiu.btonecajqb(context, "context");
            this.f107826d = rjVar.iobyxmoadg();
            this.f107827e = rjVar.f58386iobyxmoadg.ppxfxbqfkf();
        }
        if (this.f107823a != null) {
            pc0 pc0Var = this.f107823a;
            if (pc0Var == null) {
                zdlpuopuiu.pmvmpeiblj("viewModelFactory");
                pc0Var = null;
            }
            this.f107824b = (b9) new crxdokpmqz(this, pc0Var).zoijcleaow(b9.class);
        } else {
            od0 od0Var2 = r80.f58284ppxfxbqfkf;
            if (od0Var2 != null) {
                tc tcVar2 = this.f107827e;
                if (tcVar2 == null) {
                    zdlpuopuiu.pmvmpeiblj("userIdManager");
                    tcVar2 = null;
                }
                od0Var2.invoke(new PaymentResult.Error(tcVar2.iobyxmoadg(), "000000000000", new MerchantError.UnexpectedError("Ошибка внутренних компонентов SPaySdk")));
            }
            finish();
        }
        super.onCreate(bundle);
        zdlpuopuiu.btonecajqb(this, "<this>");
        if (this.f107824b != null) {
            a();
            b9 b9Var = this.f107824b;
            if (b9Var == null) {
                zdlpuopuiu.pmvmpeiblj("viewModel");
                b9Var = null;
            }
            wypolnanlu wypolnanluVarZoijcleaow = sj.dxjokdxxww.zoijcleaow(b9Var.f55935jpowsppfya);
            gtknphoqwx.zoijcleaow zoijcleaowVar = gtknphoqwx.zoijcleaow.STARTED;
            pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new tf(this, zoijcleaowVar, wypolnanluVarZoijcleaow, null, this), 3, null);
            b9 b9Var2 = this.f107824b;
            if (b9Var2 == null) {
                zdlpuopuiu.pmvmpeiblj("viewModel");
                b9Var2 = null;
            }
            pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new on(this, zoijcleaowVar, sj.dxjokdxxww.lereixgezr(b9Var2.f55929hcddaimhww), null, this), 3, null);
            b9 b9Var3 = this.f107824b;
            if (b9Var3 == null) {
                zdlpuopuiu.pmvmpeiblj("viewModel");
                b9Var3 = null;
            }
            pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new fs(this, zoijcleaowVar, sj.dxjokdxxww.zoijcleaow(b9Var3.f55933istkbnxepw), null, this), 3, null);
            b9 b9Var4 = this.f107824b;
            if (b9Var4 == null) {
                zdlpuopuiu.pmvmpeiblj("viewModel");
                b9Var4 = null;
            }
            pj.gtknphoqwx.wkgbmnqykc(oxmwwwfdhm.iobyxmoadg(this), null, null, new ej(this, zoijcleaowVar, sj.dxjokdxxww.lereixgezr(sj.dxjokdxxww.zoijcleaow(b9Var4.f55930hkdspvbjdz)), null, this), 3, null);
        }
        if (this.f107825c == null) {
            od0 od0Var3 = r80.f58284ppxfxbqfkf;
            if (od0Var3 != null) {
                tc tcVar3 = this.f107827e;
                if (tcVar3 == null) {
                    zdlpuopuiu.pmvmpeiblj("userIdManager");
                    tcVar3 = null;
                }
                od0Var3.invoke(new PaymentResult.Error(tcVar3.iobyxmoadg(), ErrorCode.BANK_AUTHENTICATOR_DEPENDENCY_IS_NOT_INITIALIZED_ON_MOBILE_APP_CHECK, new MerchantError.InnerSdkComponentsError(null, 1, null)));
            }
            finish();
            return;
        }
        b9 b9Var5 = this.f107824b;
        if (b9Var5 == null) {
            zdlpuopuiu.pmvmpeiblj("viewModel");
            b9Var5 = null;
        }
        g4 g4Var2 = this.f107825c;
        if (g4Var2 != null) {
            g4Var = g4Var2;
        } else {
            zdlpuopuiu.pmvmpeiblj("bankAuthenticator");
        }
        b9Var5.f55957zynmafqrjb = g4Var.zoijcleaow(this);
    }

    @Override // androidx.appcompat.app.wkgbmnqykc, androidx.fragment.app.oxmwwwfdhm, android.app.Activity
    public final void onDestroy() {
        b9 b9Var = this.f107824b;
        if (b9Var != null) {
            b9Var.f55923draadjrbmk.f55769zoijcleaow = false;
        }
        h7 h7Var = this.f107826d;
        if (h7Var != null) {
            pj.gtknphoqwx.wkgbmnqykc(SPaySdkApp.INSTANCE.getInstance().getScope(), null, null, new e6(h7Var, null), 3, null);
        }
        super.onDestroy();
    }

    @Override // androidx.activity.nufgyqmvbu, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Object payStatus;
        kc z8Var;
        zdlpuopuiu.btonecajqb(intent, "intent");
        super.onNewIntent(intent);
        Parcelable parcelableExtra = intent.getParcelableExtra("PAYMENT_RESULT");
        b9 b9Var = null;
        PaymentResult paymentResult = parcelableExtra instanceof PaymentResult ? (PaymentResult) parcelableExtra : null;
        if (paymentResult != null) {
            b9 b9Var2 = this.f107824b;
            if (b9Var2 == null) {
                zdlpuopuiu.pmvmpeiblj("viewModel");
            } else {
                b9Var = b9Var2;
            }
            zdlpuopuiu.btonecajqb(paymentResult, "<this>");
            if (paymentResult instanceof PaymentResult.Error) {
                payStatus = new z8(ErrorEntity.Unknown.INSTANCE);
            } else if (paymentResult instanceof PaymentResult.Processing) {
                payStatus = fa.f56514iobyxmoadg;
            } else if (paymentResult instanceof PaymentResult.Success) {
                payStatus = ib.f57019iobyxmoadg;
            } else {
                if (!(paymentResult instanceof PaymentResult.Cancel)) {
                    throw new NoWhenBranchMatchedException();
                }
                payStatus = new z8(ErrorEntity.CanceledByUser.INSTANCE);
            }
            b9Var.getClass();
            zdlpuopuiu.btonecajqb(payStatus, "payStatus");
            if (payStatus instanceof z8) {
                z8Var = new z8(((z8) payStatus).f59540iobyxmoadg);
            } else if (payStatus instanceof fa) {
                z8Var = fa.f56514iobyxmoadg;
            } else {
                if (!(payStatus instanceof ib)) {
                    throw new NoWhenBranchMatchedException();
                }
                z8Var = ib.f57019iobyxmoadg;
            }
            ((ve) b9Var.f55949wflxmlrfwp).zoijcleaow(new l1(z8Var));
        }
    }

    @Override // androidx.fragment.app.oxmwwwfdhm, android.app.Activity
    public final void onResume() {
        super.onResume();
        b9 b9Var = this.f107824b;
        if (b9Var == null) {
            zdlpuopuiu.pmvmpeiblj("viewModel");
            b9Var = null;
        }
        a2 a2Var = b9Var.f55923draadjrbmk;
        if (a2Var.f55769zoijcleaow) {
            return;
        }
        ((ve) a2Var.f55768iobyxmoadg).zoijcleaow(ec0.f56401iobyxmoadg);
        a2Var.f55769zoijcleaow = true;
    }

    public final void a() {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: gc2.iobyxmoadg
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                RedirectActivity.a(this.f36840iobyxmoadg, thread, th2);
            }
        });
    }

    public static final void a(RedirectActivity this$0, Thread thread, Throwable exception) {
        zdlpuopuiu.btonecajqb(this$0, "this$0");
        b9 b9Var = this$0.f107824b;
        if (b9Var == null) {
            zdlpuopuiu.pmvmpeiblj("viewModel");
            b9Var = null;
        }
        zdlpuopuiu.dxjokdxxww(exception, "exception");
        b9Var.getClass();
        zdlpuopuiu.btonecajqb(exception, "exception");
        pj.gtknphoqwx.wkgbmnqykc(ulzqkzuiru.iobyxmoadg(b9Var), null, null, new uawqvzlxes(exception, b9Var, null), 3, null);
        o00 block = new o00(this$0, exception);
        zdlpuopuiu.btonecajqb(block, "block");
    }
}
