package bm;

import java.util.Queue;
import org.slf4j.helpers.gxszxtbevo;

/* JADX INFO: loaded from: classes3.dex */
public class iobyxmoadg implements am.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    Queue f16765jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    gxszxtbevo f16766yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    String f16767zdlpuopuiu;

    public iobyxmoadg(gxszxtbevo gxszxtbevoVar, Queue queue) {
        this.f16766yggfygwlhe = gxszxtbevoVar;
        this.f16767zdlpuopuiu = gxszxtbevoVar.getName();
        this.f16765jyumaefscl = queue;
    }

    private void eablkybsjg(zoijcleaow zoijcleaowVar, am.ppxfxbqfkf ppxfxbqfkfVar, String str, Object[] objArr) {
        Throwable thIobyxmoadg = org.slf4j.helpers.zoijcleaow.iobyxmoadg(objArr);
        if (thIobyxmoadg != null) {
            zoijcleaow(zoijcleaowVar, ppxfxbqfkfVar, str, org.slf4j.helpers.zoijcleaow.zoijcleaow(objArr), thIobyxmoadg);
        } else {
            zoijcleaow(zoijcleaowVar, ppxfxbqfkfVar, str, objArr, null);
        }
    }

    private void gtknphoqwx(zoijcleaow zoijcleaowVar, am.ppxfxbqfkf ppxfxbqfkfVar, String str, Object obj) {
        zoijcleaow(zoijcleaowVar, ppxfxbqfkfVar, str, new Object[]{obj}, null);
    }

    private void gxszxtbevo(zoijcleaow zoijcleaowVar, am.ppxfxbqfkf ppxfxbqfkfVar, String str, Throwable th2) {
        zoijcleaow(zoijcleaowVar, ppxfxbqfkfVar, str, null, th2);
    }

    private void ppxfxbqfkf(zoijcleaow zoijcleaowVar, am.ppxfxbqfkf ppxfxbqfkfVar, String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            zoijcleaow(zoijcleaowVar, ppxfxbqfkfVar, str, new Object[]{obj}, (Throwable) obj2);
        } else {
            zoijcleaow(zoijcleaowVar, ppxfxbqfkfVar, str, new Object[]{obj, obj2}, null);
        }
    }

    private void zoijcleaow(zoijcleaow zoijcleaowVar, am.ppxfxbqfkf ppxfxbqfkfVar, String str, Object[] objArr, Throwable th2) {
        wkgbmnqykc wkgbmnqykcVar = new wkgbmnqykc();
        wkgbmnqykcVar.btonecajqb(System.currentTimeMillis());
        wkgbmnqykcVar.ppxfxbqfkf(zoijcleaowVar);
        wkgbmnqykcVar.wkgbmnqykc(this.f16766yggfygwlhe);
        wkgbmnqykcVar.eablkybsjg(this.f16767zdlpuopuiu);
        wkgbmnqykcVar.gxszxtbevo(ppxfxbqfkfVar);
        wkgbmnqykcVar.lqeggnwhkg(str);
        wkgbmnqykcVar.nufgyqmvbu(Thread.currentThread().getName());
        wkgbmnqykcVar.zoijcleaow(objArr);
        wkgbmnqykcVar.dxjokdxxww(th2);
        this.f16765jyumaefscl.add(wkgbmnqykcVar);
    }

    @Override // am.iobyxmoadg
    public void agtfadlqog(String str, Object... objArr) {
        eablkybsjg(zoijcleaow.DEBUG, null, str, objArr);
    }

    @Override // am.iobyxmoadg
    public void btonecajqb(String str, Object... objArr) {
        eablkybsjg(zoijcleaow.WARN, null, str, objArr);
    }

    @Override // am.iobyxmoadg
    public void cqumvgiudr(String str) {
        gxszxtbevo(zoijcleaow.WARN, null, str, null);
    }

    @Override // am.iobyxmoadg
    public boolean draadjrbmk() {
        return true;
    }

    @Override // am.iobyxmoadg
    public void dxjokdxxww(String str, Object obj, Object obj2) {
        ppxfxbqfkf(zoijcleaow.TRACE, null, str, obj, obj2);
    }

    @Override // am.iobyxmoadg
    public String getName() {
        return this.f16767zdlpuopuiu;
    }

    @Override // am.iobyxmoadg
    public void iobyxmoadg(String str, Throwable th2) {
        gxszxtbevo(zoijcleaow.ERROR, null, str, th2);
    }

    @Override // am.iobyxmoadg
    public void jyumaefscl(String str, Throwable th2) {
        gxszxtbevo(zoijcleaow.DEBUG, null, str, th2);
    }

    @Override // am.iobyxmoadg
    public void kcexrzcfyt(String str, Object obj) {
        gtknphoqwx(zoijcleaow.WARN, null, str, obj);
    }

    @Override // am.iobyxmoadg
    public void lereixgezr(String str) {
        gxszxtbevo(zoijcleaow.TRACE, null, str, null);
    }

    @Override // am.iobyxmoadg
    public void lqeggnwhkg(String str, Object obj, Object obj2) {
        ppxfxbqfkf(zoijcleaow.DEBUG, null, str, obj, obj2);
    }

    @Override // am.iobyxmoadg
    public boolean nufgyqmvbu() {
        return true;
    }

    @Override // am.iobyxmoadg
    public void ojitshcjhn(String str, Throwable th2) {
        gxszxtbevo(zoijcleaow.WARN, null, str, th2);
    }

    @Override // am.iobyxmoadg
    public void rgvfuqvkyq(String str, Object... objArr) {
        eablkybsjg(zoijcleaow.TRACE, null, str, objArr);
    }

    @Override // am.iobyxmoadg
    public void vdvldrhtss(String str, Object obj) {
        gtknphoqwx(zoijcleaow.INFO, null, str, obj);
    }

    @Override // am.iobyxmoadg
    public void wkgbmnqykc(String str) {
        gxszxtbevo(zoijcleaow.DEBUG, null, str, null);
    }

    @Override // am.iobyxmoadg
    public void yggfygwlhe(String str, Object obj) {
        gtknphoqwx(zoijcleaow.DEBUG, null, str, obj);
    }

    @Override // am.iobyxmoadg
    public void zdlpuopuiu(String str, Object obj) {
        gtknphoqwx(zoijcleaow.TRACE, null, str, obj);
    }
}
