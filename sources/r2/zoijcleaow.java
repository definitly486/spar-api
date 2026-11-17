package r2;

import android.os.Bundle;
import gg.cqumvgiudr;
import gg.vdvldrhtss;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import q5.btonecajqb;
import q5.gxszxtbevo;
import sj.zynmafqrjb;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final gxszxtbevo.zoijcleaow f81469eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f81470iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final Map f81471ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final Map f81472wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Map f81473zoijcleaow;

    public zoijcleaow(Map initialState) {
        zdlpuopuiu.btonecajqb(initialState, "initialState");
        this.f81470iobyxmoadg = tzroggbefp.iwizpuwonk(initialState);
        this.f81473zoijcleaow = new LinkedHashMap();
        this.f81471ppxfxbqfkf = new LinkedHashMap();
        this.f81472wkgbmnqykc = new LinkedHashMap();
        this.f81469eablkybsjg = new gxszxtbevo.zoijcleaow() { // from class: r2.iobyxmoadg
            @Override // q5.gxszxtbevo.zoijcleaow
            public final Bundle iobyxmoadg() {
                return zoijcleaow.gxszxtbevo(this.f81467iobyxmoadg);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle gxszxtbevo(zoijcleaow zoijcleaowVar) {
        vdvldrhtss[] vdvldrhtssVarArr;
        for (Map.Entry entry : tzroggbefp.yggfygwlhe(zoijcleaowVar.f81472wkgbmnqykc).entrySet()) {
            zoijcleaowVar.lqeggnwhkg((String) entry.getKey(), ((zynmafqrjb) entry.getValue()).getValue());
        }
        for (Map.Entry entry2 : tzroggbefp.yggfygwlhe(zoijcleaowVar.f81473zoijcleaow).entrySet()) {
            zoijcleaowVar.lqeggnwhkg((String) entry2.getKey(), ((gxszxtbevo.zoijcleaow) entry2.getValue()).iobyxmoadg());
        }
        Map map = zoijcleaowVar.f81470iobyxmoadg;
        if (map.isEmpty()) {
            vdvldrhtssVarArr = new vdvldrhtss[0];
        } else {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry3 : map.entrySet()) {
                arrayList.add(cqumvgiudr.iobyxmoadg((String) entry3.getKey(), entry3.getValue()));
            }
            vdvldrhtssVarArr = (vdvldrhtss[]) arrayList.toArray(new vdvldrhtss[0]);
        }
        Bundle bundleZoijcleaow = q1.ppxfxbqfkf.zoijcleaow((vdvldrhtss[]) Arrays.copyOf(vdvldrhtssVarArr, vdvldrhtssVarArr.length));
        btonecajqb.iobyxmoadg(bundleZoijcleaow);
        return bundleZoijcleaow;
    }

    public final Object eablkybsjg(String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        Object objRemove = this.f81470iobyxmoadg.remove(key);
        this.f81471ppxfxbqfkf.remove(key);
        this.f81472wkgbmnqykc.remove(key);
        return objRemove;
    }

    public final void lqeggnwhkg(String key, Object obj) {
        zdlpuopuiu.btonecajqb(key, "key");
        this.f81470iobyxmoadg.put(key, obj);
        zynmafqrjb zynmafqrjbVar = (zynmafqrjb) this.f81471ppxfxbqfkf.get(key);
        if (zynmafqrjbVar != null) {
            zynmafqrjbVar.setValue(obj);
        }
        zynmafqrjb zynmafqrjbVar2 = (zynmafqrjb) this.f81472wkgbmnqykc.get(key);
        if (zynmafqrjbVar2 != null) {
            zynmafqrjbVar2.setValue(obj);
        }
    }

    public final void nufgyqmvbu(String key, gxszxtbevo.zoijcleaow provider) {
        zdlpuopuiu.btonecajqb(key, "key");
        zdlpuopuiu.btonecajqb(provider, "provider");
        this.f81473zoijcleaow.put(key, provider);
    }

    public final Object ppxfxbqfkf(String key) {
        Object value;
        zdlpuopuiu.btonecajqb(key, "key");
        try {
            zynmafqrjb zynmafqrjbVar = (zynmafqrjb) this.f81472wkgbmnqykc.get(key);
            return (zynmafqrjbVar == null || (value = zynmafqrjbVar.getValue()) == null) ? this.f81470iobyxmoadg.get(key) : value;
        } catch (ClassCastException unused) {
            eablkybsjg(key);
            return null;
        }
    }

    public final gxszxtbevo.zoijcleaow wkgbmnqykc() {
        return this.f81469eablkybsjg;
    }

    public final void zoijcleaow(String key) {
        zdlpuopuiu.btonecajqb(key, "key");
        this.f81473zoijcleaow.remove(key);
    }

    public /* synthetic */ zoijcleaow(Map map, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? tzroggbefp.dxjokdxxww() : map);
    }
}
