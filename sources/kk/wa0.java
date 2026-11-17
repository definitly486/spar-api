package kk;

import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import modern.payments.ecomAndroid.util.interceptor.impl.HostSelectionInterceptorImpl;
import npi.spay.Cn;
import spay.sdk.domain.model.MerchantData;
import spay.sdk.domain.model.request.SdkAuthRequestBody;
import spay.sdk.domain.model.response.ErrorEntity;
import spay.sdk.domain.model.response.SessionIdResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public final class wa0 extends bw {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final sj.zynmafqrjb f59119eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final pc f59120ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final de0 f59121wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa0(bt metricFacade, jlmebxxoox sPayDataContract, pc sPaySdkReducer, xf sPayStorage, de0 authHandler) {
        String deeplink;
        String strLqeggnwhkg;
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(authHandler, "authHandler");
        this.f59120ppxfxbqfkf = sPaySdkReducer;
        this.f59121wkgbmnqykc = authHandler;
        sj.zynmafqrjb zynmafqrjbVarIobyxmoadg = sj.kegysxyocb.iobyxmoadg(null);
        this.f59119eablkybsjg = zynmafqrjbVarIobyxmoadg;
        int iIobyxmoadg = lq.iobyxmoadg(ag.f55814zoijcleaow);
        boolean z13 = iIobyxmoadg == 3 || iIobyxmoadg == 4;
        hl hlVar = ((ln) ((ij) sPayStorage).f57056zoijcleaow.getValue()).f57485iobyxmoadg;
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(hlVar, "null cannot be cast to non-null type spay.sdk.domain.OutcomeState.HandleWebViewAuthorizationWithPhoneNumber");
        String str = ((ez) hlVar).f56474iobyxmoadg;
        SessionIdResponseBody sessionIdResponseBodyDraadjrbmk = ((auzgnhcxok) this.f56063zoijcleaow).draadjrbmk();
        if (sessionIdResponseBodyDraadjrbmk != null && (deeplink = sessionIdResponseBodyDraadjrbmk.getDeeplink()) != null && (strLqeggnwhkg = ir.lqeggnwhkg(deeplink)) != null) {
            Uri uri = Uri.parse(strLqeggnwhkg);
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(uri, "parse(this)");
            if (uri != null) {
                MerchantData merchantData = ((auzgnhcxok) this.f56063zoijcleaow).f55859lmojexxdyd;
                if (merchantData == null) {
                    throw Cn.f70541zdlpuopuiu;
                }
                String appPackage = merchantData.getAppPackage();
                SessionIdResponseBody sessionIdResponseBodyDraadjrbmk2 = ((auzgnhcxok) this.f56063zoijcleaow).draadjrbmk();
                String clientIdPhone = sessionIdResponseBodyDraadjrbmk2 != null ? sessionIdResponseBodyDraadjrbmk2.getClientIdPhone() : null;
                String queryParameter = uri.getQueryParameter("scope");
                queryParameter = queryParameter == null ? "-1" : queryParameter;
                String queryParameter2 = uri.getQueryParameter("state");
                queryParameter2 = queryParameter2 == null ? "-1" : queryParameter2;
                String queryParameter3 = uri.getQueryParameter("nonce");
                queryParameter3 = queryParameter3 == null ? "-1" : queryParameter3;
                String queryParameter4 = uri.getQueryParameter("code_challenge");
                String str2 = queryParameter4 == null ? "-1" : queryParameter4;
                String queryParameter5 = uri.getQueryParameter("code_challenge_method");
                String str3 = queryParameter5 != null ? queryParameter5 : "-1";
                String queryParameter6 = uri.getQueryParameter("redirect_uri");
                queryParameter6 = queryParameter6 == null ? "-1" : queryParameter6;
                boolean z14 = z13;
                Uri.Builder builderScheme = new Uri.Builder().scheme(HostSelectionInterceptorImpl.PROTOCOL_HTTPS);
                String str4 = "aWQtaWZ0LnNiZXIucnU=";
                switch (lq.iobyxmoadg(ag.f55814zoijcleaow)) {
                    case 0:
                    case 5:
                    case 6:
                        str4 = "aWQuc2Jlci5ydQ==";
                        break;
                    case 1:
                        str4 = "aWQtcHNpLnNiZXIucnU=";
                        break;
                    case 2:
                    case 3:
                    case 4:
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                Uri uriBuild = builderScheme.authority(ir.ppxfxbqfkf(str4)).path("CSAFront/oidc/authorize.do").appendQueryParameter("client_id", clientIdPhone).appendQueryParameter("scope", queryParameter).appendQueryParameter("code_challenge_method", str3).appendQueryParameter("nonce", queryParameter3).appendQueryParameter("state", queryParameter2).appendQueryParameter("code_challenge", str2).appendQueryParameter("redirect_uri", queryParameter6).appendQueryParameter("response_type", "code").appendQueryParameter("login_hint", str).appendQueryParameter("client_type", "PRIVATE").appendQueryParameter("package", appPackage).build();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(uriBuild, "Builder()\n            .s…age)\n            .build()");
                zynmafqrjbVarIobyxmoadg.setValue(!z14 ? uriBuild : null);
                return;
            }
        }
        throw npi.spay.ip.f70575zdlpuopuiu;
    }

    public final void draadjrbmk(dy event) {
        kz gVar;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(event, "event");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(event, rv.f58473iobyxmoadg)) {
            ((ve) this.f59120ppxfxbqfkf).zoijcleaow(new g(new g60(new s90(this, null))));
            return;
        }
        if (event instanceof vw) {
            Uri uri = ((vw) event).f59063iobyxmoadg;
            String queryParameter = uri != null ? uri.getQueryParameter("state") : null;
            String queryParameter2 = uri != null ? uri.getQueryParameter("code") : null;
            if (queryParameter == null || queryParameter2 == null) {
                gVar = new g(new w7(new ErrorEntity.ApiError("-11", "Не удалось авторизоваться по НМТ")));
            } else {
                ((jf0) this.f59121wkgbmnqykc).f57192zoijcleaow = true;
                gVar = new nt(new dh0(Boolean.TRUE, queryParameter, null, queryParameter2, 52), SdkAuthRequestBody.AuthMethod.PHONE);
            }
            ((ve) this.f59120ppxfxbqfkf).zoijcleaow(gVar);
        }
    }
}
