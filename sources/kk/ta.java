package kk;

import java.util.LinkedHashMap;
import java.util.Map;
import modern.payments.ecomAndroid.util.analytics.EcomMetricKey;
import npi.spay.Cn;
import spay.sdk.domain.model.MerchantData;

/* JADX INFO: loaded from: classes3.dex */
public final class ta {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final rb2.zoijcleaow f58638iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final jlmebxxoox f58639zoijcleaow;

    public ta(rb2.zoijcleaow clickstreamLite, jlmebxxoox sPayDataContract) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(clickstreamLite, "clickstreamLite");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        this.f58638iobyxmoadg = clickstreamLite;
        this.f58639zoijcleaow = sPayDataContract;
    }

    public final void iobyxmoadg(ow metric) {
        Object objWkgbmnqykc;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metric, "metric");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        MerchantData merchantData = ((auzgnhcxok) this.f58639zoijcleaow).f55859lmojexxdyd;
        if (merchantData == null) {
            throw Cn.f70541zdlpuopuiu;
        }
        linkedHashMap.put(EcomMetricKey.ORDER_NUMBER, merchantData.getOrderNumber());
        linkedHashMap.put(EcomMetricKey.MERCHANT_LOGIN, merchantData.getMerchantLogin());
        linkedHashMap.put(EcomMetricKey.VIEW, metric.f58006zoijcleaow.f59155zdlpuopuiu);
        linkedHashMap.put(EcomMetricKey.ACTION_TYPE, metric.f58004ppxfxbqfkf.f57680zdlpuopuiu);
        Integer num = metric.f58000eablkybsjg;
        if (num != null) {
            linkedHashMap.put(EcomMetricKey.HTTP_CODE, String.valueOf(num.intValue()));
        }
        String str = metric.f58001gxszxtbevo;
        if (str != null) {
            linkedHashMap.put(EcomMetricKey.ERROR_CODE, str);
        }
        String str2 = metric.f58003lqeggnwhkg;
        if (str2 != null) {
            linkedHashMap.put(EcomMetricKey.PARSING_ERROR, str2);
        }
        linkedHashMap.put(EcomMetricKey.SDK_VERSION, "3.0.6");
        Map map = metric.f58005wkgbmnqykc;
        String str3 = "";
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                str3 = ((Object) str3) + new gg.vdvldrhtss(entry.getKey(), entry.getValue()) + "; ";
            }
        }
        if (str3 == null || mj.kcexrzcfyt.zfvoamnweg(str3)) {
            str3 = null;
        }
        if (str3 != null) {
            linkedHashMap.put(EcomMetricKey.ACTION_PARAMS, str3);
        }
        String strWkgbmnqykc = ir.wkgbmnqykc(((auzgnhcxok) this.f58639zoijcleaow).gtknphoqwx());
        if (strWkgbmnqykc != null) {
            linkedHashMap.put(EcomMetricKey.SESSION_ID, strWkgbmnqykc);
        }
        String strWkgbmnqykc2 = ir.wkgbmnqykc((String) sj.dxjokdxxww.zoijcleaow(((auzgnhcxok) this.f58639zoijcleaow).f55858lereixgezr).getValue());
        if (strWkgbmnqykc2 != null) {
            linkedHashMap.put(EcomMetricKey.LOCAL_SESSION_ID, strWkgbmnqykc2);
        }
        try {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar = gg.kcexrzcfyt.f37117yggfygwlhe;
            rb2.zoijcleaow zoijcleaowVar = this.f58638iobyxmoadg;
            rb2.iobyxmoadg iobyxmoadgVar2 = new rb2.iobyxmoadg(metric.f58002iobyxmoadg.a(), rb2.iobyxmoadg.zoijcleaow.BUSINESS, null, null, 12, null);
            iobyxmoadgVar2.iobyxmoadg(linkedHashMap);
            zoijcleaowVar.iobyxmoadg(iobyxmoadgVar2);
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.wwaezpbzkn.f37140iobyxmoadg);
        } catch (Throwable th2) {
            gg.kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = gg.kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = gg.kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
        if (gg.kcexrzcfyt.dxjokdxxww(objWkgbmnqykc) != null) {
            jc2.iobyxmoadg.f51100iobyxmoadg.dxjokdxxww("Exception while sending inner analytics", new Object[0]);
        }
        m9 block = new m9(metric, linkedHashMap);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
    }
}
