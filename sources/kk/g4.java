package kk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import npi.spay.Cn;
import spay.sdk.R;
import spay.sdk.RedirectActivity;
import spay.sdk.domain.model.FakeBankAuthData;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.response.SPaySdkConfig;
import spay.sdk.domain.model.response.SessionIdResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class g4 implements sflfametgt {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final pc f56632eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final m60 f56633gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final jlmebxxoox f56634iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final jhduphickx f56635lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final a2 f56636ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final de0 f56637wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final bt f56638zoijcleaow;

    public g4(jlmebxxoox sPayDataContract, bt metricFacade, a2 bankAuthenticationContract, de0 authHandler, pc sPaySdkReducer, m60 sPaySdkConfigRepository, jhduphickx sidLoginManager) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bankAuthenticationContract, "bankAuthenticationContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authHandler, "authHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkConfigRepository, "sPaySdkConfigRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sidLoginManager, "sidLoginManager");
        this.f56634iobyxmoadg = sPayDataContract;
        this.f56638zoijcleaow = metricFacade;
        this.f56636ppxfxbqfkf = bankAuthenticationContract;
        this.f56637wkgbmnqykc = authHandler;
        this.f56632eablkybsjg = sPaySdkReducer;
        this.f56633gxszxtbevo = sPaySdkConfigRepository;
        this.f56635lqeggnwhkg = sidLoginManager;
    }

    public static final void wkgbmnqykc(g4 this$0, RedirectActivity activity, hkdspvbjdz reason, pj.agtfadlqog cancellableContinuation, Intent intent) {
        dh0 dh0Var;
        y0 y0Var;
        int i13;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(this$0, "this$0");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(activity, "$activity");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(reason, "$reason");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cancellableContinuation, "$cancellableContinuation");
        Bundle extras = intent.getExtras();
        if ((extras == null || !extras.containsKey("FAKE_BANK_AUTH_INTENT_KEY")) && intent.getData() == null) {
            return;
        }
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(intent, "intent");
        this$0.getClass();
        int i14 = ag.f55814zoijcleaow;
        if (i14 == 6) {
            Parcelable parcelableExtra = intent.getParcelableExtra("FAKE_BANK_AUTH_INTENT_KEY");
            FakeBankAuthData fakeBankAuthData = parcelableExtra instanceof FakeBankAuthData ? (FakeBankAuthData) parcelableExtra : null;
            dh0Var = fakeBankAuthData != null ? new dh0(Boolean.TRUE, fakeBankAuthData.getState(), fakeBankAuthData.getNonce(), fakeBankAuthData.getAuthCode(), 48) : new dh0(Boolean.FALSE, null, null, null, 62);
        } else if (i14 == 5 || i14 == 4) {
            dh0 dh0VarIobyxmoadg = this$0.f56635lqeggnwhkg.iobyxmoadg(intent);
            dh0Var = new dh0(Boolean.TRUE, dh0VarIobyxmoadg.f56295zoijcleaow, dh0VarIobyxmoadg.f56293ppxfxbqfkf, dh0VarIobyxmoadg.f56294wkgbmnqykc, 48);
        } else {
            dh0Var = this$0.f56635lqeggnwhkg.iobyxmoadg(intent);
        }
        Context baseContext = activity.getBaseContext();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(baseContext, "activity.baseContext");
        Boolean bool = dh0Var.f56292iobyxmoadg;
        Boolean bool2 = Boolean.TRUE;
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(bool, bool2)) {
            if (reason == hkdspvbjdz.AUTH_FOR_FULL_EMISSION) {
                this$0.f56638zoijcleaow.iobyxmoadg(new ow(nd.LC_BANK_APP_AUTH_GOOD, we0.PAY_VIEW, mp.LC, null, null, null, null, 120));
            } else {
                this$0.f56638zoijcleaow.iobyxmoadg(new ow(gtknphoqwx.LC_BANK_APP_SDK_AUTH_GOOD, we0.AUTH_VIEW, mp.LC, null, null, null, null, 120));
            }
            y0Var = new y0(dh0Var, null, true, 2);
        } else if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(dh0Var.f56292iobyxmoadg, bool2) || !((i13 = ag.f55814zoijcleaow) == 5 || i13 == 4)) {
            if (reason == hkdspvbjdz.AUTH_FOR_FULL_EMISSION) {
                this$0.f56638zoijcleaow.iobyxmoadg(new ow(nd.LC_BANK_APP_AUTH_FAIL, we0.PAY_VIEW, mp.LC, null, null, null, null, 120));
            } else {
                this$0.f56638zoijcleaow.iobyxmoadg(new ow(gtknphoqwx.LC_BANK_APP_SDK_AUTH_FAIL, we0.AUTH_VIEW, mp.LC, null, null, null, null, 120));
            }
            y0Var = new y0(null, baseContext.getString(R.string.spay_exception_bank_auth_failed), false, 1);
        } else {
            if (reason == hkdspvbjdz.AUTH_FOR_FULL_EMISSION) {
                this$0.f56638zoijcleaow.iobyxmoadg(new ow(nd.LC_BANK_APP_AUTH_GOOD, we0.PAY_VIEW, mp.LC, null, null, null, null, 120));
            } else {
                this$0.f56638zoijcleaow.iobyxmoadg(new ow(gtknphoqwx.LC_BANK_APP_SDK_AUTH_GOOD, we0.AUTH_VIEW, mp.LC, null, null, null, null, 120));
            }
            y0Var = new y0(dh0Var, null, true, 2);
        }
        this$0.f56636ppxfxbqfkf.f55769zoijcleaow = true;
        ((jf0) this$0.f56637wkgbmnqykc).f57192zoijcleaow = true;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cancellableContinuation, "<this>");
        if (cancellableContinuation.isActive()) {
            cancellableContinuation.cllcsxoeiz(y0Var, null);
        }
        pj.agtfadlqog.iobyxmoadg.iobyxmoadg(cancellableContinuation, null, 1, null);
    }

    @Override // kk.sflfametgt
    public final Object iobyxmoadg(RedirectActivity redirectActivity, hkdspvbjdz hkdspvbjdzVar, lg.gxszxtbevo gxszxtbevoVar) {
        String deeplink;
        String strLqeggnwhkg;
        String str;
        RedirectActivity context;
        hkdspvbjdz hkdspvbjdzVar2;
        pj.rgvfuqvkyq rgvfuqvkyqVar = new pj.rgvfuqvkyq(mg.zoijcleaow.ppxfxbqfkf(gxszxtbevoVar), 1);
        rgvfuqvkyqVar.lereixgezr();
        SessionIdResponseBody sessionIdResponseBodyDraadjrbmk = ((auzgnhcxok) this.f56634iobyxmoadg).draadjrbmk();
        if (sessionIdResponseBodyDraadjrbmk != null && (deeplink = sessionIdResponseBodyDraadjrbmk.getDeeplink()) != null && (strLqeggnwhkg = ir.lqeggnwhkg(deeplink)) != null) {
            Uri uri = Uri.parse(strLqeggnwhkg);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(uri, "parse(this)");
            if (uri != null) {
                String clientID = uri.getQueryParameter("client_id");
                if (clientID == null) {
                    clientID = "-1";
                }
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(clientID, "deepLink.getQueryParamet…ID) ?: STRING_UNAVAILABLE");
                String scope = uri.getQueryParameter("scope");
                if (scope == null) {
                    scope = "-1";
                }
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(scope, "deepLink.getQueryParamet…PE) ?: STRING_UNAVAILABLE");
                String state = uri.getQueryParameter("state");
                if (state == null) {
                    state = "-1";
                }
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(state, "deepLink.getQueryParamet…TE) ?: STRING_UNAVAILABLE");
                String nonce = uri.getQueryParameter("nonce");
                if (nonce == null) {
                    nonce = "-1";
                }
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(nonce, "deepLink.getQueryParamet…CE) ?: STRING_UNAVAILABLE");
                String queryParameter = uri.getQueryParameter("code_challenge");
                if (queryParameter == null) {
                    queryParameter = "-1";
                    str = queryParameter;
                } else {
                    str = "-1";
                }
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(queryParameter, "deepLink.getQueryParamet…GE) ?: STRING_UNAVAILABLE");
                String queryParameter2 = uri.getQueryParameter("code_challenge_method");
                String str2 = queryParameter2 == null ? str : queryParameter2;
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(str2, "deepLink.getQueryParamet…OD) ?: STRING_UNAVAILABLE");
                String redirectUri = uri.getQueryParameter("redirect_uri");
                if (redirectUri == null) {
                    redirectUri = str;
                }
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(redirectUri, "deepLink.getQueryParamet…RI) ?: STRING_UNAVAILABLE");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clientID, "clientID");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(scope, "scope");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(state, "state");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(nonce, "nonce");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(redirectUri, "redirectUri");
                Uri.Builder builderBuildUpon = Uri.parse("sberbankidlogin://sberbankid").buildUpon();
                builderBuildUpon.appendQueryParameter("code_challenge", queryParameter);
                builderBuildUpon.appendQueryParameter("code_challenge_method", str2);
                builderBuildUpon.appendQueryParameter("client_id", clientID);
                builderBuildUpon.appendQueryParameter("scope", scope);
                builderBuildUpon.appendQueryParameter("state", state);
                builderBuildUpon.appendQueryParameter("nonce", nonce);
                builderBuildUpon.appendQueryParameter("redirect_uri", redirectUri);
                Uri uriBuild = builderBuildUpon.build();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(uriBuild, "uri.buildUpon().apply {\n…                }.build()");
                Uri.Builder builderBuildUpon2 = uriBuild.buildUpon();
                MerchantData merchantData = ((auzgnhcxok) this.f56634iobyxmoadg).f55859lmojexxdyd;
                if (merchantData == null) {
                    throw Cn.f70541zdlpuopuiu;
                }
                Uri uri2 = builderBuildUpon2.appendQueryParameter("package", merchantData.getAppPackage()).build();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(uri2, "with(sPayDataContract) {…           .build()\n    }");
                if (ag.f55814zoijcleaow == 6) {
                    ((ve) this.f56632eablkybsjg).zoijcleaow(bh.f56009iobyxmoadg);
                    context = redirectActivity;
                    hkdspvbjdzVar2 = hkdspvbjdzVar;
                } else {
                    jhduphickx jhduphickxVar = this.f56635lqeggnwhkg;
                    jhduphickxVar.getClass();
                    context = redirectActivity;
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
                    kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uri2, "uri");
                    jhduphickxVar.f57197iobyxmoadg = uri2.getQueryParameter("state");
                    jhduphickxVar.f57198zoijcleaow = uri2.getQueryParameter("nonce");
                    context.startActivity(new Intent("android.intent.action.VIEW", uri2.buildUpon().appendQueryParameter("auth_type", "app2app").build()));
                    this.f56636ppxfxbqfkf.f55769zoijcleaow = false;
                    hkdspvbjdzVar2 = hkdspvbjdzVar;
                    if (hkdspvbjdzVar2 == hkdspvbjdz.AUTH_FOR_FULL_EMISSION) {
                        this.f56638zoijcleaow.iobyxmoadg(new ow(nd.LC_BANK_APP_AUTH, we0.PAY_VIEW, mp.LC, null, null, null, null, 120));
                    } else {
                        this.f56638zoijcleaow.iobyxmoadg(new ow(gtknphoqwx.LC_BANK_APP_SDK_AUTH, we0.AUTH_VIEW, mp.LC, null, null, null, null, 120));
                    }
                }
                u1.iobyxmoadg iobyxmoadgVarPpxfxbqfkf = ppxfxbqfkf(rgvfuqvkyqVar, context, hkdspvbjdzVar2);
                context.addOnNewIntentListener(iobyxmoadgVarPpxfxbqfkf);
                rgvfuqvkyqVar.stevsuqkhv(new b3(context, iobyxmoadgVarPpxfxbqfkf));
                Object objZdlpuopuiu = rgvfuqvkyqVar.zdlpuopuiu();
                if (objZdlpuopuiu == mg.zoijcleaow.gxszxtbevo()) {
                    kotlin.coroutines.jvm.internal.nufgyqmvbu.ppxfxbqfkf(gxszxtbevoVar);
                }
                return objZdlpuopuiu;
            }
        }
        throw npi.spay.ip.f70575zdlpuopuiu;
    }

    public final u1.iobyxmoadg ppxfxbqfkf(final pj.rgvfuqvkyq rgvfuqvkyqVar, final RedirectActivity redirectActivity, final hkdspvbjdz hkdspvbjdzVar) {
        return new u1.iobyxmoadg() { // from class: kk.u3
            @Override // u1.iobyxmoadg
            public final void accept(Object obj) {
                g4.wkgbmnqykc(this.f58763iobyxmoadg, redirectActivity, hkdspvbjdzVar, rgvfuqvkyqVar, (Intent) obj);
            }
        };
    }

    @Override // kk.sflfametgt
    public final boolean zoijcleaow(RedirectActivity context) {
        ArrayList<SPaySdkConfig.Schema> schemas;
        Object next;
        SPaySdkConfig.Schema schema;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        SPaySdkConfig sPaySdkConfigZoijcleaow = ((s80) this.f56633gxszxtbevo).zoijcleaow();
        String bankAppAuthUri = null;
        if (sPaySdkConfigZoijcleaow != null && (schemas = sPaySdkConfigZoijcleaow.getSchemas()) != null) {
            Iterator<T> it = schemas.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                schema = (SPaySdkConfig.Schema) next;
            } while (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(schema != null ? schema.getStand() : null, eh.iobyxmoadg()));
            SPaySdkConfig.Schema schema2 = (SPaySdkConfig.Schema) next;
            if (schema2 != null) {
                bankAppAuthUri = schema2.getBankAppAuthUri();
            }
        }
        this.f56635lqeggnwhkg.getClass();
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(context, "context");
        if (bankAppAuthUri == null) {
            bankAppAuthUri = "sberbankidlogin://sberbankid";
        }
        boolean z13 = new Intent("android.intent.action.VIEW", Uri.parse(bankAppAuthUri)).resolveActivity(context.getPackageManager()) == null;
        this.f56638zoijcleaow.iobyxmoadg(new ow(!z13 ? xr.LC_BANK_APP_FOUND : xr.LC_NO_BANK_APP_FOUND, we0.MERCHANT_VIEW, mp.LC, null, null, null, null, 120));
        return !z13;
    }
}
