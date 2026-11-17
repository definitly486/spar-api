package kk;

import com.google.gson.Gson;
import java.util.LinkedHashMap;
import spay.sdk.domain.model.response.SPaySdkConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class s80 implements m60 {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final qy f58530iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public SPaySdkConfig f58531ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final LinkedHashMap f58532wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final gg f58533zoijcleaow;

    public s80(qy configService, gg defaultSharedPreferences) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configService, "configService");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(defaultSharedPreferences, "defaultSharedPreferences");
        this.f58530iobyxmoadg = configService;
        this.f58533zoijcleaow = defaultSharedPreferences;
        this.f58532wkgbmnqykc = new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object iobyxmoadg(kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        p70 p70Var;
        s80 s80Var;
        s80 s80Var2;
        if (wkgbmnqykcVar instanceof p70) {
            p70Var = (p70) wkgbmnqykcVar;
            int i13 = p70Var.f58048cqumvgiudr;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                p70Var.f58048cqumvgiudr = i13 - Integer.MIN_VALUE;
            } else {
                p70Var = new p70(this, wkgbmnqykcVar);
            }
        } else {
            p70Var = new p70(this, wkgbmnqykcVar);
        }
        Object objIobyxmoadg = p70Var.f58050jyumaefscl;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = p70Var.f58048cqumvgiudr;
        if (i14 == 0) {
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            qy qyVar = this.f58530iobyxmoadg;
            p70Var.f58052zdlpuopuiu = this;
            p70Var.f58051yggfygwlhe = this;
            p70Var.f58048cqumvgiudr = 1;
            objIobyxmoadg = ((b10) qyVar).iobyxmoadg(p70Var);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            s80Var = this;
            s80Var2 = s80Var;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s80Var2 = p70Var.f58051yggfygwlhe;
            s80Var = p70Var.f58052zdlpuopuiu;
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        }
        SPaySdkConfig sPaySdkConfigZoijcleaow = (SPaySdkConfig) objIobyxmoadg;
        if (sPaySdkConfigZoijcleaow == null) {
            sPaySdkConfigZoijcleaow = s80Var.zoijcleaow();
        }
        s80Var2.f58531ppxfxbqfkf = sPaySdkConfigZoijcleaow;
        SPaySdkConfig sPaySdkConfig = s80Var.f58531ppxfxbqfkf;
        if (sPaySdkConfig != null) {
            s80Var.f58531ppxfxbqfkf = sPaySdkConfig;
            SPaySdkConfig.Localization localization = sPaySdkConfig.getLocalization();
            if (localization != null) {
                s80Var.f58532wkgbmnqykc.put("bankApp", localization.getBankApp());
                s80Var.f58532wkgbmnqykc.put("enableSPay", localization.getEnableSPay());
                s80Var.f58532wkgbmnqykc.put("payError", localization.getPayError());
                s80Var.f58532wkgbmnqykc.put("payLoading", localization.getPayLoading());
                s80Var.f58532wkgbmnqykc.put("bankAppLoading", localization.getBankAppLoading());
                s80Var.f58532wkgbmnqykc.put("successEnableSPay", localization.getSuccessEnableSPay());
                s80Var.f58532wkgbmnqykc.put("userProfileInfo", localization.getUserProfileInfo());
            }
            String strZdlpuopuiu = new Gson().zdlpuopuiu(s80Var.f58531ppxfxbqfkf);
            if (strZdlpuopuiu != null) {
                s80Var.f58533zoijcleaow.a("APP_CONFIG", strZdlpuopuiu);
            }
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }

    public final SPaySdkConfig zoijcleaow() {
        try {
            return (SPaySdkConfig) new Gson().gtknphoqwx((String) this.f58533zoijcleaow.b("APP_CONFIG", "-1"), SPaySdkConfig.class);
        } catch (Exception e13) {
            jc2.iobyxmoadg.f51100iobyxmoadg.rgvfuqvkyq("CATCH_BLOCK_EXCEPTION_TAG").btonecajqb(e13);
            return null;
        }
    }
}
