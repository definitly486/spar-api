package com.google.firebase.perf.config;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public class iobyxmoadg {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static volatile iobyxmoadg f24569eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final gd.iobyxmoadg f24570wkgbmnqykc = gd.iobyxmoadg.eablkybsjg();

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final RemoteConfigManager f24571iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private cqumvgiudr f24572ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private md.gxszxtbevo f24573zoijcleaow;

    public iobyxmoadg(RemoteConfigManager remoteConfigManager, md.gxszxtbevo gxszxtbevoVar, cqumvgiudr cqumvgiudrVar) {
        this.f24571iobyxmoadg = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f24573zoijcleaow = gxszxtbevoVar == null ? new md.gxszxtbevo() : gxszxtbevoVar;
        this.f24572ppxfxbqfkf = cqumvgiudrVar == null ? cqumvgiudr.eablkybsjg() : cqumvgiudrVar;
    }

    private md.lqeggnwhkg agtfadlqog(jyumaefscl jyumaefsclVar) {
        return this.f24573zoijcleaow.zoijcleaow(jyumaefsclVar.zoijcleaow());
    }

    private boolean cllcsxoeiz(long j13) {
        return j13 > 0;
    }

    private md.lqeggnwhkg cqumvgiudr(jyumaefscl jyumaefsclVar) {
        return this.f24571iobyxmoadg.getString(jyumaefsclVar.ppxfxbqfkf());
    }

    private boolean draadjrbmk() {
        gtknphoqwx gtknphoqwxVarEablkybsjg = gtknphoqwx.eablkybsjg();
        md.lqeggnwhkg lqeggnwhkgVarCqumvgiudr = cqumvgiudr(gtknphoqwxVarEablkybsjg);
        if (lqeggnwhkgVarCqumvgiudr.wkgbmnqykc()) {
            this.f24572ppxfxbqfkf.draadjrbmk(gtknphoqwxVarEablkybsjg.iobyxmoadg(), (String) lqeggnwhkgVarCqumvgiudr.ppxfxbqfkf());
            return ylkuphrtab((String) lqeggnwhkgVarCqumvgiudr.ppxfxbqfkf());
        }
        md.lqeggnwhkg lqeggnwhkgVarEablkybsjg = eablkybsjg(gtknphoqwxVarEablkybsjg);
        return lqeggnwhkgVarEablkybsjg.wkgbmnqykc() ? ylkuphrtab((String) lqeggnwhkgVarEablkybsjg.ppxfxbqfkf()) : ylkuphrtab(gtknphoqwxVarEablkybsjg.wkgbmnqykc());
    }

    private md.lqeggnwhkg eablkybsjg(jyumaefscl jyumaefsclVar) {
        return this.f24572ppxfxbqfkf.lqeggnwhkg(jyumaefsclVar.iobyxmoadg());
    }

    private boolean gtknphoqwx() {
        draadjrbmk draadjrbmkVarEablkybsjg = draadjrbmk.eablkybsjg();
        md.lqeggnwhkg lqeggnwhkgVarYggfygwlhe = yggfygwlhe(draadjrbmkVarEablkybsjg);
        if (!lqeggnwhkgVarYggfygwlhe.wkgbmnqykc()) {
            md.lqeggnwhkg lqeggnwhkgVarZoijcleaow = zoijcleaow(draadjrbmkVarEablkybsjg);
            return lqeggnwhkgVarZoijcleaow.wkgbmnqykc() ? ((Boolean) lqeggnwhkgVarZoijcleaow.ppxfxbqfkf()).booleanValue() : draadjrbmkVarEablkybsjg.wkgbmnqykc().booleanValue();
        }
        if (this.f24571iobyxmoadg.isLastFetchFailed()) {
            return false;
        }
        this.f24572ppxfxbqfkf.wflxmlrfwp(draadjrbmkVarEablkybsjg.iobyxmoadg(), ((Boolean) lqeggnwhkgVarYggfygwlhe.ppxfxbqfkf()).booleanValue());
        return ((Boolean) lqeggnwhkgVarYggfygwlhe.ppxfxbqfkf()).booleanValue();
    }

    private boolean hkdspvbjdz(long j13) {
        return j13 > 0;
    }

    private md.lqeggnwhkg iwizpuwonk(jyumaefscl jyumaefsclVar) {
        return this.f24571iobyxmoadg.getLong(jyumaefsclVar.ppxfxbqfkf());
    }

    private boolean jpowsppfya(double d13) {
        return 0.0d <= d13 && d13 <= 1.0d;
    }

    private md.lqeggnwhkg jyumaefscl(jyumaefscl jyumaefsclVar) {
        return this.f24571iobyxmoadg.getDouble(jyumaefsclVar.ppxfxbqfkf());
    }

    public static synchronized iobyxmoadg lqeggnwhkg() {
        try {
            if (f24569eablkybsjg == null) {
                f24569eablkybsjg = new iobyxmoadg(null, null, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f24569eablkybsjg;
    }

    private md.lqeggnwhkg ojitshcjhn(jyumaefscl jyumaefsclVar) {
        return this.f24573zoijcleaow.ppxfxbqfkf(jyumaefsclVar.zoijcleaow());
    }

    private boolean pkzmftpjix(long j13) {
        return j13 >= 0;
    }

    private md.lqeggnwhkg ppxfxbqfkf(jyumaefscl jyumaefsclVar) {
        return this.f24572ppxfxbqfkf.ppxfxbqfkf(jyumaefsclVar.iobyxmoadg());
    }

    private md.lqeggnwhkg rgvfuqvkyq(jyumaefscl jyumaefsclVar) {
        return this.f24573zoijcleaow.eablkybsjg(jyumaefsclVar.zoijcleaow());
    }

    private md.lqeggnwhkg wkgbmnqykc(jyumaefscl jyumaefsclVar) {
        return this.f24572ppxfxbqfkf.gxszxtbevo(jyumaefsclVar.iobyxmoadg());
    }

    private boolean wwaezpbzkn(long j13) {
        return j13 >= 0;
    }

    private md.lqeggnwhkg yggfygwlhe(jyumaefscl jyumaefsclVar) {
        return this.f24571iobyxmoadg.getBoolean(jyumaefsclVar.ppxfxbqfkf());
    }

    private boolean ylkuphrtab(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(dd.iobyxmoadg.f27851zoijcleaow)) {
                return true;
            }
        }
        return false;
    }

    private md.lqeggnwhkg zoijcleaow(jyumaefscl jyumaefsclVar) {
        return this.f24572ppxfxbqfkf.zoijcleaow(jyumaefsclVar.iobyxmoadg());
    }

    public Boolean btonecajqb() {
        if (dxjokdxxww().booleanValue()) {
            return Boolean.FALSE;
        }
        ppxfxbqfkf ppxfxbqfkfVarWkgbmnqykc = ppxfxbqfkf.wkgbmnqykc();
        md.lqeggnwhkg lqeggnwhkgVarZoijcleaow = zoijcleaow(ppxfxbqfkfVarWkgbmnqykc);
        if (lqeggnwhkgVarZoijcleaow.wkgbmnqykc()) {
            return (Boolean) lqeggnwhkgVarZoijcleaow.ppxfxbqfkf();
        }
        md.lqeggnwhkg lqeggnwhkgVarAgtfadlqog = agtfadlqog(ppxfxbqfkfVarWkgbmnqykc);
        if (lqeggnwhkgVarAgtfadlqog.wkgbmnqykc()) {
            return (Boolean) lqeggnwhkgVarAgtfadlqog.ppxfxbqfkf();
        }
        return null;
    }

    public double cdpycssgdh() {
        oxmwwwfdhm oxmwwwfdhmVarGxszxtbevo = oxmwwwfdhm.gxszxtbevo();
        md.lqeggnwhkg lqeggnwhkgVarOjitshcjhn = ojitshcjhn(oxmwwwfdhmVarGxszxtbevo);
        if (lqeggnwhkgVarOjitshcjhn.wkgbmnqykc()) {
            double dDoubleValue = ((Double) lqeggnwhkgVarOjitshcjhn.ppxfxbqfkf()).doubleValue() / 100.0d;
            if (jpowsppfya(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        md.lqeggnwhkg lqeggnwhkgVarJyumaefscl = jyumaefscl(oxmwwwfdhmVarGxszxtbevo);
        if (lqeggnwhkgVarJyumaefscl.wkgbmnqykc() && jpowsppfya(((Double) lqeggnwhkgVarJyumaefscl.ppxfxbqfkf()).doubleValue())) {
            this.f24572ppxfxbqfkf.btonecajqb(oxmwwwfdhmVarGxszxtbevo.iobyxmoadg(), ((Double) lqeggnwhkgVarJyumaefscl.ppxfxbqfkf()).doubleValue());
            return ((Double) lqeggnwhkgVarJyumaefscl.ppxfxbqfkf()).doubleValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = ppxfxbqfkf(oxmwwwfdhmVarGxszxtbevo);
        if (lqeggnwhkgVarPpxfxbqfkf.wkgbmnqykc() && jpowsppfya(((Double) lqeggnwhkgVarPpxfxbqfkf.ppxfxbqfkf()).doubleValue())) {
            return ((Double) lqeggnwhkgVarPpxfxbqfkf.ppxfxbqfkf()).doubleValue();
        }
        return this.f24571iobyxmoadg.isLastFetchFailed() ? oxmwwwfdhmVarGxszxtbevo.eablkybsjg().doubleValue() : oxmwwwfdhmVarGxszxtbevo.wkgbmnqykc().doubleValue();
    }

    public void dsvhmnatus(Context context) {
        f24570wkgbmnqykc.dxjokdxxww(md.agtfadlqog.zoijcleaow(context));
        this.f24572ppxfxbqfkf.dxjokdxxww(context);
    }

    public Boolean dxjokdxxww() {
        zoijcleaow zoijcleaowVarEablkybsjg = zoijcleaow.eablkybsjg();
        md.lqeggnwhkg lqeggnwhkgVarAgtfadlqog = agtfadlqog(zoijcleaowVarEablkybsjg);
        return lqeggnwhkgVarAgtfadlqog.wkgbmnqykc() ? (Boolean) lqeggnwhkgVarAgtfadlqog.ppxfxbqfkf() : zoijcleaowVarEablkybsjg.wkgbmnqykc();
    }

    public long esjtqupxsv() {
        wflxmlrfwp wflxmlrfwpVarEablkybsjg = wflxmlrfwp.eablkybsjg();
        md.lqeggnwhkg lqeggnwhkgVarRgvfuqvkyq = rgvfuqvkyq(wflxmlrfwpVarEablkybsjg);
        if (lqeggnwhkgVarRgvfuqvkyq.wkgbmnqykc() && pkzmftpjix(((Long) lqeggnwhkgVarRgvfuqvkyq.ppxfxbqfkf()).longValue())) {
            return ((Long) lqeggnwhkgVarRgvfuqvkyq.ppxfxbqfkf()).longValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarIwizpuwonk = iwizpuwonk(wflxmlrfwpVarEablkybsjg);
        if (lqeggnwhkgVarIwizpuwonk.wkgbmnqykc() && pkzmftpjix(((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue())) {
            this.f24572ppxfxbqfkf.gtknphoqwx(wflxmlrfwpVarEablkybsjg.iobyxmoadg(), ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue());
            return ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = wkgbmnqykc(wflxmlrfwpVarEablkybsjg);
        return (lqeggnwhkgVarWkgbmnqykc.wkgbmnqykc() && pkzmftpjix(((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue())) ? ((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue() : wflxmlrfwpVarEablkybsjg.wkgbmnqykc().longValue();
    }

    public double gxszxtbevo() {
        eablkybsjg eablkybsjgVarEablkybsjg = eablkybsjg.eablkybsjg();
        md.lqeggnwhkg lqeggnwhkgVarOjitshcjhn = ojitshcjhn(eablkybsjgVarEablkybsjg);
        if (lqeggnwhkgVarOjitshcjhn.wkgbmnqykc()) {
            double dDoubleValue = ((Double) lqeggnwhkgVarOjitshcjhn.ppxfxbqfkf()).doubleValue() / 100.0d;
            if (jpowsppfya(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        md.lqeggnwhkg lqeggnwhkgVarJyumaefscl = jyumaefscl(eablkybsjgVarEablkybsjg);
        if (lqeggnwhkgVarJyumaefscl.wkgbmnqykc() && jpowsppfya(((Double) lqeggnwhkgVarJyumaefscl.ppxfxbqfkf()).doubleValue())) {
            this.f24572ppxfxbqfkf.btonecajqb(eablkybsjgVarEablkybsjg.iobyxmoadg(), ((Double) lqeggnwhkgVarJyumaefscl.ppxfxbqfkf()).doubleValue());
            return ((Double) lqeggnwhkgVarJyumaefscl.ppxfxbqfkf()).doubleValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = ppxfxbqfkf(eablkybsjgVarEablkybsjg);
        return (lqeggnwhkgVarPpxfxbqfkf.wkgbmnqykc() && jpowsppfya(((Double) lqeggnwhkgVarPpxfxbqfkf.ppxfxbqfkf()).doubleValue())) ? ((Double) lqeggnwhkgVarPpxfxbqfkf.ppxfxbqfkf()).doubleValue() : eablkybsjgVarEablkybsjg.wkgbmnqykc().doubleValue();
    }

    public boolean hcddaimhww() {
        Boolean boolBtonecajqb = btonecajqb();
        return (boolBtonecajqb == null || boolBtonecajqb.booleanValue()) && wflxmlrfwp();
    }

    public String iobyxmoadg() {
        String strGxszxtbevo;
        gxszxtbevo gxszxtbevoVarEablkybsjg = gxszxtbevo.eablkybsjg();
        if (dd.iobyxmoadg.f27849iobyxmoadg.booleanValue()) {
            return gxszxtbevoVarEablkybsjg.wkgbmnqykc();
        }
        String strPpxfxbqfkf = gxszxtbevoVarEablkybsjg.ppxfxbqfkf();
        long jLongValue = strPpxfxbqfkf != null ? ((Long) this.f24571iobyxmoadg.getRemoteConfigValueOrDefault(strPpxfxbqfkf, -1L)).longValue() : -1L;
        String strIobyxmoadg = gxszxtbevoVarEablkybsjg.iobyxmoadg();
        if (!gxszxtbevo.lqeggnwhkg(jLongValue) || (strGxszxtbevo = gxszxtbevo.gxszxtbevo(jLongValue)) == null) {
            md.lqeggnwhkg lqeggnwhkgVarEablkybsjg = eablkybsjg(gxszxtbevoVarEablkybsjg);
            return lqeggnwhkgVarEablkybsjg.wkgbmnqykc() ? (String) lqeggnwhkgVarEablkybsjg.ppxfxbqfkf() : gxszxtbevoVarEablkybsjg.wkgbmnqykc();
        }
        this.f24572ppxfxbqfkf.draadjrbmk(strIobyxmoadg, strGxszxtbevo);
        return strGxszxtbevo;
    }

    public long iozdgvuglv() {
        zdlpuopuiu zdlpuopuiuVarEablkybsjg = zdlpuopuiu.eablkybsjg();
        md.lqeggnwhkg lqeggnwhkgVarIwizpuwonk = iwizpuwonk(zdlpuopuiuVarEablkybsjg);
        if (lqeggnwhkgVarIwizpuwonk.wkgbmnqykc() && wwaezpbzkn(((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue())) {
            this.f24572ppxfxbqfkf.gtknphoqwx(zdlpuopuiuVarEablkybsjg.iobyxmoadg(), ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue());
            return ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = wkgbmnqykc(zdlpuopuiuVarEablkybsjg);
        return (lqeggnwhkgVarWkgbmnqykc.wkgbmnqykc() && wwaezpbzkn(((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue())) ? ((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue() : zdlpuopuiuVarEablkybsjg.wkgbmnqykc().longValue();
    }

    public long istkbnxepw() {
        vdvldrhtss vdvldrhtssVarGxszxtbevo = vdvldrhtss.gxszxtbevo();
        md.lqeggnwhkg lqeggnwhkgVarRgvfuqvkyq = rgvfuqvkyq(vdvldrhtssVarGxszxtbevo);
        if (lqeggnwhkgVarRgvfuqvkyq.wkgbmnqykc() && pkzmftpjix(((Long) lqeggnwhkgVarRgvfuqvkyq.ppxfxbqfkf()).longValue())) {
            return ((Long) lqeggnwhkgVarRgvfuqvkyq.ppxfxbqfkf()).longValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarIwizpuwonk = iwizpuwonk(vdvldrhtssVarGxszxtbevo);
        if (lqeggnwhkgVarIwizpuwonk.wkgbmnqykc() && pkzmftpjix(((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue())) {
            this.f24572ppxfxbqfkf.gtknphoqwx(vdvldrhtssVarGxszxtbevo.iobyxmoadg(), ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue());
            return ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = wkgbmnqykc(vdvldrhtssVarGxszxtbevo);
        if (lqeggnwhkgVarWkgbmnqykc.wkgbmnqykc() && pkzmftpjix(((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue())) {
            return ((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue();
        }
        return this.f24571iobyxmoadg.isLastFetchFailed() ? vdvldrhtssVarGxszxtbevo.eablkybsjg().longValue() : vdvldrhtssVarGxszxtbevo.wkgbmnqykc().longValue();
    }

    public double kcexrzcfyt() {
        dxjokdxxww dxjokdxxwwVarGxszxtbevo = dxjokdxxww.gxszxtbevo();
        md.lqeggnwhkg lqeggnwhkgVarJyumaefscl = jyumaefscl(dxjokdxxwwVarGxszxtbevo);
        if (lqeggnwhkgVarJyumaefscl.wkgbmnqykc() && jpowsppfya(((Double) lqeggnwhkgVarJyumaefscl.ppxfxbqfkf()).doubleValue())) {
            this.f24572ppxfxbqfkf.btonecajqb(dxjokdxxwwVarGxszxtbevo.iobyxmoadg(), ((Double) lqeggnwhkgVarJyumaefscl.ppxfxbqfkf()).doubleValue());
            return ((Double) lqeggnwhkgVarJyumaefscl.ppxfxbqfkf()).doubleValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = ppxfxbqfkf(dxjokdxxwwVarGxszxtbevo);
        if (lqeggnwhkgVarPpxfxbqfkf.wkgbmnqykc() && jpowsppfya(((Double) lqeggnwhkgVarPpxfxbqfkf.ppxfxbqfkf()).doubleValue())) {
            return ((Double) lqeggnwhkgVarPpxfxbqfkf.ppxfxbqfkf()).doubleValue();
        }
        return this.f24571iobyxmoadg.isLastFetchFailed() ? dxjokdxxwwVarGxszxtbevo.eablkybsjg().doubleValue() : dxjokdxxwwVarGxszxtbevo.wkgbmnqykc().doubleValue();
    }

    public long lereixgezr() {
        agtfadlqog agtfadlqogVarGxszxtbevo = agtfadlqog.gxszxtbevo();
        md.lqeggnwhkg lqeggnwhkgVarRgvfuqvkyq = rgvfuqvkyq(agtfadlqogVarGxszxtbevo);
        if (lqeggnwhkgVarRgvfuqvkyq.wkgbmnqykc() && pkzmftpjix(((Long) lqeggnwhkgVarRgvfuqvkyq.ppxfxbqfkf()).longValue())) {
            return ((Long) lqeggnwhkgVarRgvfuqvkyq.ppxfxbqfkf()).longValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarIwizpuwonk = iwizpuwonk(agtfadlqogVarGxszxtbevo);
        if (lqeggnwhkgVarIwizpuwonk.wkgbmnqykc() && pkzmftpjix(((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue())) {
            this.f24572ppxfxbqfkf.gtknphoqwx(agtfadlqogVarGxszxtbevo.iobyxmoadg(), ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue());
            return ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = wkgbmnqykc(agtfadlqogVarGxszxtbevo);
        if (lqeggnwhkgVarWkgbmnqykc.wkgbmnqykc() && pkzmftpjix(((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue())) {
            return ((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue();
        }
        return this.f24571iobyxmoadg.isLastFetchFailed() ? agtfadlqogVarGxszxtbevo.eablkybsjg().longValue() : agtfadlqogVarGxszxtbevo.wkgbmnqykc().longValue();
    }

    public double lmojexxdyd() {
        yggfygwlhe yggfygwlheVarGxszxtbevo = yggfygwlhe.gxszxtbevo();
        md.lqeggnwhkg lqeggnwhkgVarJyumaefscl = jyumaefscl(yggfygwlheVarGxszxtbevo);
        if (lqeggnwhkgVarJyumaefscl.wkgbmnqykc() && jpowsppfya(((Double) lqeggnwhkgVarJyumaefscl.ppxfxbqfkf()).doubleValue())) {
            this.f24572ppxfxbqfkf.btonecajqb(yggfygwlheVarGxszxtbevo.iobyxmoadg(), ((Double) lqeggnwhkgVarJyumaefscl.ppxfxbqfkf()).doubleValue());
            return ((Double) lqeggnwhkgVarJyumaefscl.ppxfxbqfkf()).doubleValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = ppxfxbqfkf(yggfygwlheVarGxszxtbevo);
        if (lqeggnwhkgVarPpxfxbqfkf.wkgbmnqykc() && jpowsppfya(((Double) lqeggnwhkgVarPpxfxbqfkf.ppxfxbqfkf()).doubleValue())) {
            return ((Double) lqeggnwhkgVarPpxfxbqfkf.ppxfxbqfkf()).doubleValue();
        }
        return this.f24571iobyxmoadg.isLastFetchFailed() ? yggfygwlheVarGxszxtbevo.eablkybsjg().doubleValue() : yggfygwlheVarGxszxtbevo.wkgbmnqykc().doubleValue();
    }

    public boolean nufgyqmvbu() {
        wkgbmnqykc wkgbmnqykcVarEablkybsjg = wkgbmnqykc.eablkybsjg();
        md.lqeggnwhkg lqeggnwhkgVarAgtfadlqog = agtfadlqog(wkgbmnqykcVarEablkybsjg);
        if (lqeggnwhkgVarAgtfadlqog.wkgbmnqykc()) {
            return ((Boolean) lqeggnwhkgVarAgtfadlqog.ppxfxbqfkf()).booleanValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarYggfygwlhe = yggfygwlhe(wkgbmnqykcVarEablkybsjg);
        if (lqeggnwhkgVarYggfygwlhe.wkgbmnqykc()) {
            this.f24572ppxfxbqfkf.wflxmlrfwp(wkgbmnqykcVarEablkybsjg.iobyxmoadg(), ((Boolean) lqeggnwhkgVarYggfygwlhe.ppxfxbqfkf()).booleanValue());
            return ((Boolean) lqeggnwhkgVarYggfygwlhe.ppxfxbqfkf()).booleanValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarZoijcleaow = zoijcleaow(wkgbmnqykcVarEablkybsjg);
        return lqeggnwhkgVarZoijcleaow.wkgbmnqykc() ? ((Boolean) lqeggnwhkgVarZoijcleaow.ppxfxbqfkf()).booleanValue() : wkgbmnqykcVarEablkybsjg.wkgbmnqykc().booleanValue();
    }

    public long oxmwwwfdhm() {
        nufgyqmvbu nufgyqmvbuVarEablkybsjg = nufgyqmvbu.eablkybsjg();
        md.lqeggnwhkg lqeggnwhkgVarIwizpuwonk = iwizpuwonk(nufgyqmvbuVarEablkybsjg);
        if (lqeggnwhkgVarIwizpuwonk.wkgbmnqykc() && wwaezpbzkn(((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue())) {
            this.f24572ppxfxbqfkf.gtknphoqwx(nufgyqmvbuVarEablkybsjg.iobyxmoadg(), ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue());
            return ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = wkgbmnqykc(nufgyqmvbuVarEablkybsjg);
        return (lqeggnwhkgVarWkgbmnqykc.wkgbmnqykc() && wwaezpbzkn(((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue())) ? ((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue() : nufgyqmvbuVarEablkybsjg.wkgbmnqykc().longValue();
    }

    public long pmvmpeiblj() {
        ojitshcjhn ojitshcjhnVarEablkybsjg = ojitshcjhn.eablkybsjg();
        md.lqeggnwhkg lqeggnwhkgVarRgvfuqvkyq = rgvfuqvkyq(ojitshcjhnVarEablkybsjg);
        if (lqeggnwhkgVarRgvfuqvkyq.wkgbmnqykc() && hkdspvbjdz(((Long) lqeggnwhkgVarRgvfuqvkyq.ppxfxbqfkf()).longValue())) {
            return ((Long) lqeggnwhkgVarRgvfuqvkyq.ppxfxbqfkf()).longValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarIwizpuwonk = iwizpuwonk(ojitshcjhnVarEablkybsjg);
        if (lqeggnwhkgVarIwizpuwonk.wkgbmnqykc() && hkdspvbjdz(((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue())) {
            this.f24572ppxfxbqfkf.gtknphoqwx(ojitshcjhnVarEablkybsjg.iobyxmoadg(), ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue());
            return ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = wkgbmnqykc(ojitshcjhnVarEablkybsjg);
        return (lqeggnwhkgVarWkgbmnqykc.wkgbmnqykc() && hkdspvbjdz(((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue())) ? ((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue() : ojitshcjhnVarEablkybsjg.wkgbmnqykc().longValue();
    }

    public long vdvldrhtss() {
        lqeggnwhkg lqeggnwhkgVarEablkybsjg = lqeggnwhkg.eablkybsjg();
        md.lqeggnwhkg lqeggnwhkgVarIwizpuwonk = iwizpuwonk(lqeggnwhkgVarEablkybsjg);
        if (lqeggnwhkgVarIwizpuwonk.wkgbmnqykc() && wwaezpbzkn(((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue())) {
            this.f24572ppxfxbqfkf.gtknphoqwx(lqeggnwhkgVarEablkybsjg.iobyxmoadg(), ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue());
            return ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = wkgbmnqykc(lqeggnwhkgVarEablkybsjg);
        return (lqeggnwhkgVarWkgbmnqykc.wkgbmnqykc() && wwaezpbzkn(((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue())) ? ((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue() : lqeggnwhkgVarEablkybsjg.wkgbmnqykc().longValue();
    }

    public boolean wflxmlrfwp() {
        return gtknphoqwx() && !draadjrbmk();
    }

    public void wypolnanlu(md.gxszxtbevo gxszxtbevoVar) {
        this.f24573zoijcleaow = gxszxtbevoVar;
    }

    public long yadqdtsiqt() {
        kcexrzcfyt kcexrzcfytVarEablkybsjg = kcexrzcfyt.eablkybsjg();
        md.lqeggnwhkg lqeggnwhkgVarIwizpuwonk = iwizpuwonk(kcexrzcfytVarEablkybsjg);
        if (lqeggnwhkgVarIwizpuwonk.wkgbmnqykc() && wwaezpbzkn(((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue())) {
            this.f24572ppxfxbqfkf.gtknphoqwx(kcexrzcfytVarEablkybsjg.iobyxmoadg(), ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue());
            return ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = wkgbmnqykc(kcexrzcfytVarEablkybsjg);
        return (lqeggnwhkgVarWkgbmnqykc.wkgbmnqykc() && wwaezpbzkn(((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue())) ? ((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue() : kcexrzcfytVarEablkybsjg.wkgbmnqykc().longValue();
    }

    public long zdlpuopuiu() {
        btonecajqb btonecajqbVarEablkybsjg = btonecajqb.eablkybsjg();
        md.lqeggnwhkg lqeggnwhkgVarIwizpuwonk = iwizpuwonk(btonecajqbVarEablkybsjg);
        if (lqeggnwhkgVarIwizpuwonk.wkgbmnqykc() && cllcsxoeiz(((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue())) {
            this.f24572ppxfxbqfkf.gtknphoqwx(btonecajqbVarEablkybsjg.iobyxmoadg(), ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue());
            return ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = wkgbmnqykc(btonecajqbVarEablkybsjg);
        return (lqeggnwhkgVarWkgbmnqykc.wkgbmnqykc() && cllcsxoeiz(((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue())) ? ((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue() : btonecajqbVarEablkybsjg.wkgbmnqykc().longValue();
    }

    public long zynmafqrjb() {
        rgvfuqvkyq rgvfuqvkyqVarEablkybsjg = rgvfuqvkyq.eablkybsjg();
        md.lqeggnwhkg lqeggnwhkgVarRgvfuqvkyq = rgvfuqvkyq(rgvfuqvkyqVarEablkybsjg);
        if (lqeggnwhkgVarRgvfuqvkyq.wkgbmnqykc() && pkzmftpjix(((Long) lqeggnwhkgVarRgvfuqvkyq.ppxfxbqfkf()).longValue())) {
            return ((Long) lqeggnwhkgVarRgvfuqvkyq.ppxfxbqfkf()).longValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarIwizpuwonk = iwizpuwonk(rgvfuqvkyqVarEablkybsjg);
        if (lqeggnwhkgVarIwizpuwonk.wkgbmnqykc() && pkzmftpjix(((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue())) {
            this.f24572ppxfxbqfkf.gtknphoqwx(rgvfuqvkyqVarEablkybsjg.iobyxmoadg(), ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue());
            return ((Long) lqeggnwhkgVarIwizpuwonk.ppxfxbqfkf()).longValue();
        }
        md.lqeggnwhkg lqeggnwhkgVarWkgbmnqykc = wkgbmnqykc(rgvfuqvkyqVarEablkybsjg);
        return (lqeggnwhkgVarWkgbmnqykc.wkgbmnqykc() && pkzmftpjix(((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue())) ? ((Long) lqeggnwhkgVarWkgbmnqykc.ppxfxbqfkf()).longValue() : rgvfuqvkyqVarEablkybsjg.wkgbmnqykc().longValue();
    }
}
