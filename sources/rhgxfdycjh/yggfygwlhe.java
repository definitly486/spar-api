package rhgxfdycjh;

import android.os.Bundle;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yggfygwlhe implements rgvfuqvkyq, q5.dxjokdxxww {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final q5.gxszxtbevo f82689iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final androidx.lifecycle.kcexrzcfyt f82690jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final q5.nufgyqmvbu f82691yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final /* synthetic */ rgvfuqvkyq f82692zdlpuopuiu;

    public yggfygwlhe(rgvfuqvkyq rgvfuqvkyqVar) {
        this.f82692zdlpuopuiu = rgvfuqvkyqVar;
        q5.nufgyqmvbu nufgyqmvbuVarZoijcleaow = q5.nufgyqmvbu.f77857ppxfxbqfkf.zoijcleaow(this);
        this.f82691yggfygwlhe = nufgyqmvbuVarZoijcleaow;
        this.f82690jyumaefscl = androidx.lifecycle.kcexrzcfyt.f9492gtknphoqwx.iobyxmoadg(this);
        this.f82689iwizpuwonk = nufgyqmvbuVarZoijcleaow.zoijcleaow();
        Object objEablkybsjg = eablkybsjg("androidx.savedstate.SavedStateRegistry");
        nufgyqmvbuVarZoijcleaow.wkgbmnqykc(objEablkybsjg instanceof Bundle ? (Bundle) objEablkybsjg : null);
        zoijcleaow("androidx.savedstate.SavedStateRegistry", new tg.iobyxmoadg() { // from class: rhgxfdycjh.zdlpuopuiu
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return yggfygwlhe.gxszxtbevo(this.f82693zdlpuopuiu);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object gxszxtbevo(yggfygwlhe yggfygwlheVar) {
        gg.vdvldrhtss[] vdvldrhtssVarArr;
        Map mapDxjokdxxww = tzroggbefp.dxjokdxxww();
        if (mapDxjokdxxww.isEmpty()) {
            vdvldrhtssVarArr = new gg.vdvldrhtss[0];
        } else {
            ArrayList arrayList = new ArrayList(mapDxjokdxxww.size());
            for (Map.Entry entry : mapDxjokdxxww.entrySet()) {
                arrayList.add(gg.cqumvgiudr.iobyxmoadg((String) entry.getKey(), entry.getValue()));
            }
            vdvldrhtssVarArr = (gg.vdvldrhtss[]) arrayList.toArray(new gg.vdvldrhtss[0]);
        }
        Bundle bundleZoijcleaow = q1.ppxfxbqfkf.zoijcleaow((gg.vdvldrhtss[]) Arrays.copyOf(vdvldrhtssVarArr, vdvldrhtssVarArr.length));
        q5.btonecajqb.iobyxmoadg(bundleZoijcleaow);
        yggfygwlheVar.f82691yggfygwlhe.eablkybsjg(bundleZoijcleaow);
        if (q5.ppxfxbqfkf.gxszxtbevo(q5.ppxfxbqfkf.iobyxmoadg(bundleZoijcleaow))) {
            return null;
        }
        return bundleZoijcleaow;
    }

    @Override // rhgxfdycjh.rgvfuqvkyq
    public Object eablkybsjg(String str) {
        return this.f82692zdlpuopuiu.eablkybsjg(str);
    }

    @Override // q5.dxjokdxxww
    public q5.gxszxtbevo getSavedStateRegistry() {
        return this.f82689iwizpuwonk;
    }

    @Override // rhgxfdycjh.rgvfuqvkyq
    public boolean iobyxmoadg(Object obj) {
        return this.f82692zdlpuopuiu.iobyxmoadg(obj);
    }

    @Override // androidx.lifecycle.vdvldrhtss
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public androidx.lifecycle.kcexrzcfyt getLifecycle() {
        return this.f82690jyumaefscl;
    }

    @Override // rhgxfdycjh.rgvfuqvkyq
    public Map wkgbmnqykc() {
        return this.f82692zdlpuopuiu.wkgbmnqykc();
    }

    @Override // rhgxfdycjh.rgvfuqvkyq
    public rgvfuqvkyq.iobyxmoadg zoijcleaow(String str, tg.iobyxmoadg iobyxmoadgVar) {
        return this.f82692zdlpuopuiu.zoijcleaow(str, iobyxmoadgVar);
    }
}
