package org.slf4j.helpers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class gxszxtbevo implements am.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private bm.iobyxmoadg f74190cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private Queue f74191esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private Method f74192iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private Boolean f74193jyumaefscl;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private final boolean f74194lereixgezr;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private volatile am.iobyxmoadg f74195yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f74196zdlpuopuiu;

    public gxszxtbevo(String str, Queue queue, boolean z13) {
        this.f74196zdlpuopuiu = str;
        this.f74191esjtqupxsv = queue;
        this.f74194lereixgezr = z13;
    }

    private am.iobyxmoadg ppxfxbqfkf() {
        if (this.f74190cqumvgiudr == null) {
            this.f74190cqumvgiudr = new bm.iobyxmoadg(this, this.f74191esjtqupxsv);
        }
        return this.f74190cqumvgiudr;
    }

    @Override // am.iobyxmoadg
    public void agtfadlqog(String str, Object... objArr) {
        zoijcleaow().agtfadlqog(str, objArr);
    }

    @Override // am.iobyxmoadg
    public void btonecajqb(String str, Object... objArr) {
        zoijcleaow().btonecajqb(str, objArr);
    }

    @Override // am.iobyxmoadg
    public void cqumvgiudr(String str) {
        zoijcleaow().cqumvgiudr(str);
    }

    @Override // am.iobyxmoadg
    public boolean draadjrbmk() {
        return zoijcleaow().draadjrbmk();
    }

    @Override // am.iobyxmoadg
    public void dxjokdxxww(String str, Object obj, Object obj2) {
        zoijcleaow().dxjokdxxww(str, obj, obj2);
    }

    public boolean eablkybsjg() {
        Boolean bool = this.f74193jyumaefscl;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f74192iwizpuwonk = this.f74195yggfygwlhe.getClass().getMethod("log", bm.ppxfxbqfkf.class);
            this.f74193jyumaefscl = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f74193jyumaefscl = Boolean.FALSE;
        }
        return this.f74193jyumaefscl.booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f74196zdlpuopuiu.equals(((gxszxtbevo) obj).f74196zdlpuopuiu);
    }

    @Override // am.iobyxmoadg
    public String getName() {
        return this.f74196zdlpuopuiu;
    }

    public boolean gtknphoqwx() {
        return this.f74195yggfygwlhe == null;
    }

    public boolean gxszxtbevo() {
        return this.f74195yggfygwlhe instanceof ppxfxbqfkf;
    }

    public int hashCode() {
        return this.f74196zdlpuopuiu.hashCode();
    }

    @Override // am.iobyxmoadg
    public void iobyxmoadg(String str, Throwable th2) {
        zoijcleaow().iobyxmoadg(str, th2);
    }

    @Override // am.iobyxmoadg
    public void jyumaefscl(String str, Throwable th2) {
        zoijcleaow().jyumaefscl(str, th2);
    }

    @Override // am.iobyxmoadg
    public void kcexrzcfyt(String str, Object obj) {
        zoijcleaow().kcexrzcfyt(str, obj);
    }

    @Override // am.iobyxmoadg
    public void lereixgezr(String str) {
        zoijcleaow().lereixgezr(str);
    }

    @Override // am.iobyxmoadg
    public void lqeggnwhkg(String str, Object obj, Object obj2) {
        zoijcleaow().lqeggnwhkg(str, obj, obj2);
    }

    @Override // am.iobyxmoadg
    public boolean nufgyqmvbu() {
        return zoijcleaow().nufgyqmvbu();
    }

    @Override // am.iobyxmoadg
    public void ojitshcjhn(String str, Throwable th2) {
        zoijcleaow().ojitshcjhn(str, th2);
    }

    public void oxmwwwfdhm(am.iobyxmoadg iobyxmoadgVar) {
        this.f74195yggfygwlhe = iobyxmoadgVar;
    }

    @Override // am.iobyxmoadg
    public void rgvfuqvkyq(String str, Object... objArr) {
        zoijcleaow().rgvfuqvkyq(str, objArr);
    }

    @Override // am.iobyxmoadg
    public void vdvldrhtss(String str, Object obj) {
        zoijcleaow().vdvldrhtss(str, obj);
    }

    public void wflxmlrfwp(bm.ppxfxbqfkf ppxfxbqfkfVar) {
        if (eablkybsjg()) {
            try {
                this.f74192iwizpuwonk.invoke(this.f74195yggfygwlhe, ppxfxbqfkfVar);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    @Override // am.iobyxmoadg
    public void wkgbmnqykc(String str) {
        zoijcleaow().wkgbmnqykc(str);
    }

    @Override // am.iobyxmoadg
    public void yggfygwlhe(String str, Object obj) {
        zoijcleaow().yggfygwlhe(str, obj);
    }

    @Override // am.iobyxmoadg
    public void zdlpuopuiu(String str, Object obj) {
        zoijcleaow().zdlpuopuiu(str, obj);
    }

    am.iobyxmoadg zoijcleaow() {
        if (this.f74195yggfygwlhe != null) {
            return this.f74195yggfygwlhe;
        }
        return this.f74194lereixgezr ? ppxfxbqfkf.f74202zdlpuopuiu : ppxfxbqfkf();
    }
}
