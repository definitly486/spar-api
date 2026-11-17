package kk;

import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import modern.payments.ecomAndroid.data.util.ApiImmutableConstantsKt;
import spay.sdk.R;
import spay.sdk.domain.model.MerchantData;

/* JADX INFO: loaded from: classes3.dex */
public final class c00 implements xy {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final tc f56071eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final fj f56072iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final jlmebxxoox f56073ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final li0 f56074wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final u80 f56075zoijcleaow;

    public c00(fj resourceManager, u80 setCookieHandler, jlmebxxoox sPayDataContract, li0 xPodStickyHandler, tc userIdManager) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(resourceManager, "resourceManager");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(setCookieHandler, "setCookieHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(xPodStickyHandler, "xPodStickyHandler");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(userIdManager, "userIdManager");
        this.f56072iobyxmoadg = resourceManager;
        this.f56075zoijcleaow = setCookieHandler;
        this.f56073ppxfxbqfkf = sPayDataContract;
        this.f56074wkgbmnqykc = xPodStickyHandler;
        this.f56071eablkybsjg = userIdManager;
    }

    public static String iobyxmoadg() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    public static String ppxfxbqfkf() {
        String source = cm.kcexrzcfyt.wwaezpbzkn().jlmebxxoox(cm.rgvfuqvkyq.cqumvgiudr("UTC")).kcexrzcfyt(em.iobyxmoadg.lqeggnwhkg("yyyy-MM-dd'T'HH:mm:ssXXX"));
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(source, "source");
        if (!mj.kcexrzcfyt.ulzqkzuiru(source, 'Z', false, 2, null)) {
            return source;
        }
        return mj.kcexrzcfyt.y(source, source.length() - 1) + "+00:00";
    }

    public final lk.zynmafqrjb zoijcleaow(lk.zynmafqrjb request) {
        Object objB;
        Object objB2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(request, "request");
        jlmebxxoox jlmebxxooxVar = this.f56073ppxfxbqfkf;
        lk.zynmafqrjb.iobyxmoadg iobyxmoadgVarNufgyqmvbu = request.nufgyqmvbu();
        boolean z13 = kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zy.wkgbmnqykc(request), "sessionId") || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zy.wkgbmnqykc(request), "sdkAuth") || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zy.wkgbmnqykc(request), "revokeTokenSdk");
        u80 u80Var = this.f56075zoijcleaow;
        if (z13) {
            objB = u80Var.f58794iobyxmoadg.b("X-Sdk-Refresh-Data", "");
            objB2 = u80Var.f58794iobyxmoadg.b("X-Sdk-Id-Key", "");
            if (mj.kcexrzcfyt.zfvoamnweg((CharSequence) objB) && mj.kcexrzcfyt.zfvoamnweg((CharSequence) objB2)) {
                u80Var.f58797zoijcleaow.iobyxmoadg(new ow(gtknphoqwx.ST_GET_FAIL_REFRESH, we0.AUTH_VIEW, mp.ST_GET_FAIL, null, null, null, null, 120));
            } else {
                u80Var.f58797zoijcleaow.iobyxmoadg(new ow(gtknphoqwx.ST_GET_GOOD_REFRESH, we0.AUTH_VIEW, mp.ST_GET_GOOD, null, null, null, null, 120));
            }
        } else {
            u80Var.getClass();
            objB = null;
            objB2 = null;
        }
        StringBuilder sb3 = new StringBuilder();
        List listKcexrzcfyt = hg.jyumaefscl.kcexrzcfyt((String) objB, (String) objB2, u80Var.f58793eablkybsjg, u80Var.f58796wkgbmnqykc);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listKcexrzcfyt) {
            String str = (String) obj;
            if (str != null && !kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str, "")) {
                arrayList.add(obj);
            }
        }
        int i13 = 0;
        for (Object obj2 : arrayList) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            String str2 = (String) obj2;
            if (i13 != arrayList.size() - 1) {
                sb3.append(str2);
                sb3.append("; ");
            } else {
                sb3.append(str2);
            }
            i13 = i14;
        }
        String string = sb3.toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "StringBuilder().apply(builderAction).toString()");
        if (mj.kcexrzcfyt.zfvoamnweg(string)) {
            string = null;
        }
        lk.zynmafqrjb.iobyxmoadg iobyxmoadgVarIobyxmoadg = iobyxmoadgVarNufgyqmvbu.iobyxmoadg("Cookie", String.valueOf(string));
        auzgnhcxok auzgnhcxokVar = (auzgnhcxok) jlmebxxooxVar;
        String str3 = auzgnhcxokVar.f55856jyumaefscl;
        if (str3 == null) {
            str3 = "";
        }
        iobyxmoadgVarIobyxmoadg.dxjokdxxww("appName", str3);
        MerchantData merchantDataDxjokdxxww = auzgnhcxokVar.dxjokdxxww();
        String authorization = merchantDataDxjokdxxww != null ? merchantDataDxjokdxxww.getAuthorization() : null;
        if (authorization == null) {
            authorization = "";
        }
        lk.zynmafqrjb.iobyxmoadg iobyxmoadgVarIobyxmoadg2 = iobyxmoadgVarIobyxmoadg.iobyxmoadg("Authorization", authorization);
        String string2 = UUID.randomUUID().toString();
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string2, "randomUUID().toString()");
        lk.zynmafqrjb.iobyxmoadg iobyxmoadgVarIobyxmoadg3 = iobyxmoadgVarIobyxmoadg2.iobyxmoadg("RqUID", mj.kcexrzcfyt.hcddaimhww(string2, "-", "", false, 4, null)).iobyxmoadg("UserTm", ppxfxbqfkf()).iobyxmoadg("Accept-Language", "RU");
        MerchantData merchantDataDxjokdxxww2 = auzgnhcxokVar.dxjokdxxww();
        String orderNumber = merchantDataDxjokdxxww2 != null ? merchantDataDxjokdxxww2.getOrderNumber() : null;
        if (orderNumber == null) {
            orderNumber = "";
        }
        lk.zynmafqrjb.iobyxmoadg iobyxmoadgVarIobyxmoadg4 = iobyxmoadgVarIobyxmoadg3.iobyxmoadg("orderNumber", orderNumber);
        fj fjVar = this.f56072iobyxmoadg;
        int i15 = R.string.spay_OsType;
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(RELEASE, "RELEASE");
        lk.zynmafqrjb.iobyxmoadg iobyxmoadgVarIobyxmoadg5 = iobyxmoadgVarIobyxmoadg4.iobyxmoadg("OS", fjVar.iobyxmoadg(i15, RELEASE)).iobyxmoadg("deviceName", iobyxmoadg()).iobyxmoadg("x-b3-spanid", auzgnhcxokVar.f55874zoijcleaow.f56578zoijcleaow).iobyxmoadg("x-b3-traceid", auzgnhcxokVar.f55874zoijcleaow.f56577iobyxmoadg).iobyxmoadg("sdkVersion", "3.0.6");
        String str4 = auzgnhcxokVar.f55868wflxmlrfwp;
        if (str4 == null) {
            str4 = "";
        }
        lk.zynmafqrjb.iobyxmoadg iobyxmoadgVarIobyxmoadg6 = iobyxmoadgVarIobyxmoadg5.iobyxmoadg("X-Net-Add-Source", str4);
        MerchantData merchantDataDxjokdxxww3 = auzgnhcxokVar.dxjokdxxww();
        String merchantLogin = merchantDataDxjokdxxww3 != null ? merchantDataDxjokdxxww3.getMerchantLogin() : null;
        if (merchantLogin == null) {
            merchantLogin = "";
        }
        lk.zynmafqrjb.iobyxmoadg iobyxmoadgVarIobyxmoadg7 = iobyxmoadgVarIobyxmoadg6.iobyxmoadg("merchantLogin", merchantLogin);
        String str5 = (String) sj.dxjokdxxww.zoijcleaow(auzgnhcxokVar.f55858lereixgezr).getValue();
        if (str5 != null && str5.length() != 0) {
            iobyxmoadgVarIobyxmoadg7 = iobyxmoadgVarIobyxmoadg7.iobyxmoadg("localSessionId", str5);
        }
        String str6 = this.f56074wkgbmnqykc.f57479iobyxmoadg;
        String str7 = str6 != null ? str6 : "";
        if (str7.length() != 0) {
            iobyxmoadgVarIobyxmoadg7 = iobyxmoadgVarIobyxmoadg7.iobyxmoadg("x-pod-sticky", str7);
        }
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zy.wkgbmnqykc(request), "payOnline") || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zy.wkgbmnqykc(request), "listCards") || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zy.wkgbmnqykc(request), "revokeTokenSdk") || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zy.wkgbmnqykc(request), "sessionId") || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zy.wkgbmnqykc(request), "paymentToken") || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zy.wkgbmnqykc(request), "token-exchange") || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zy.wkgbmnqykc(request), "listPaymentAccounts") || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zy.wkgbmnqykc(request), "bindingSession") || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zy.wkgbmnqykc(request), "createBindingOtp") || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zy.wkgbmnqykc(request), "confirmBindingOtp") || kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(zy.wkgbmnqykc(request), "payBinding")) {
            iobyxmoadgVarIobyxmoadg7 = iobyxmoadgVarIobyxmoadg7.iobyxmoadg("X-System-Id", ApiImmutableConstantsKt.STATIC_SYSTEM_ID_HEADER);
        }
        return iobyxmoadgVarIobyxmoadg7.iobyxmoadg("userId", this.f56071eablkybsjg.iobyxmoadg()).zoijcleaow();
    }
}
