package xl;

import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes3.dex */
public class lqeggnwhkg extends kcexrzcfyt {
    public lqeggnwhkg(String str, String str2, String str3) {
        super(str);
        vl.zoijcleaow.btonecajqb(str2);
        vl.zoijcleaow.btonecajqb(str3);
        eablkybsjg().ppxfxbqfkf(ExternalMetricsManagerImpl.NAME, str).ppxfxbqfkf("publicId", str2).ppxfxbqfkf("systemId", str3);
        oipsdeybqn();
    }

    private void oipsdeybqn() {
        if (yfnezrywwk("publicId")) {
            eablkybsjg().ppxfxbqfkf("pubSysKey", "PUBLIC");
        } else if (yfnezrywwk("systemId")) {
            eablkybsjg().ppxfxbqfkf("pubSysKey", "SYSTEM");
        }
    }

    private boolean yfnezrywwk(String str) {
        return !wl.kcexrzcfyt.btonecajqb(ppxfxbqfkf(str));
    }

    @Override // xl.zdlpuopuiu
    void hcddaimhww(wl.lqeggnwhkg lqeggnwhkgVar, gxszxtbevo.iobyxmoadg iobyxmoadgVar) {
        if (iobyxmoadgVar.agtfadlqog() != gxszxtbevo.iobyxmoadg.EnumC3087iobyxmoadg.html || yfnezrywwk("publicId") || yfnezrywwk("systemId")) {
            lqeggnwhkgVar.zoijcleaow("<!DOCTYPE");
        } else {
            lqeggnwhkgVar.zoijcleaow("<!doctype");
        }
        if (yfnezrywwk(ExternalMetricsManagerImpl.NAME)) {
            lqeggnwhkgVar.zoijcleaow(" ").zoijcleaow(ppxfxbqfkf(ExternalMetricsManagerImpl.NAME));
        }
        if (yfnezrywwk("pubSysKey")) {
            lqeggnwhkgVar.zoijcleaow(" ").zoijcleaow(ppxfxbqfkf("pubSysKey"));
        }
        if (yfnezrywwk("publicId")) {
            lqeggnwhkgVar.zoijcleaow(" \"").zoijcleaow(ppxfxbqfkf("publicId")).iobyxmoadg('\"');
        }
        if (yfnezrywwk("systemId")) {
            lqeggnwhkgVar.zoijcleaow(" \"").zoijcleaow(ppxfxbqfkf("systemId")).iobyxmoadg('\"');
        }
        lqeggnwhkgVar.iobyxmoadg('>');
    }

    @Override // xl.zdlpuopuiu
    public String istkbnxepw() {
        return "#doctype";
    }

    public String sflfametgt() {
        return ppxfxbqfkf("publicId");
    }

    public String ydmasvzmpa() {
        return ppxfxbqfkf(ExternalMetricsManagerImpl.NAME);
    }

    public void zfvoamnweg(String str) {
        if (str != null) {
            wkgbmnqykc("pubSysKey", str);
        }
    }
}
