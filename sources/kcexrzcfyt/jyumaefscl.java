package kcexrzcfyt;

import android.content.Context;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class jyumaefscl implements istkbnxepw.yggfygwlhe {

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private final Map f54816dxjokdxxww = new HashMap();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final zdlpuopuiu.cllcsxoeiz f54817eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final List f54818gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f54819iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final tbqsvytpvh f54820lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private final long f54821nufgyqmvbu;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final istkbnxepw.istkbnxepw f54822ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final istkbnxepw.zynmafqrjb f54823wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final pmvmpeiblj.iobyxmoadg f54824zoijcleaow;

    public jyumaefscl(Context context, istkbnxepw.istkbnxepw istkbnxepwVar, lereixgezr.rgvfuqvkyq rgvfuqvkyqVar, long j13) {
        this.f54819iobyxmoadg = context;
        this.f54822ppxfxbqfkf = istkbnxepwVar;
        zdlpuopuiu.cllcsxoeiz cllcsxoeizVarZoijcleaow = zdlpuopuiu.cllcsxoeiz.zoijcleaow(context, istkbnxepwVar.ppxfxbqfkf());
        this.f54817eablkybsjg = cllcsxoeizVarZoijcleaow;
        this.f54820lqeggnwhkg = tbqsvytpvh.ppxfxbqfkf(context);
        this.f54818gxszxtbevo = eablkybsjg(metgxyhuhe.zoijcleaow(this, rgvfuqvkyqVar));
        cqumvgiudr.iobyxmoadg iobyxmoadgVar = new cqumvgiudr.iobyxmoadg(cllcsxoeizVarZoijcleaow);
        this.f54824zoijcleaow = iobyxmoadgVar;
        istkbnxepw.zynmafqrjb zynmafqrjbVar = new istkbnxepw.zynmafqrjb(iobyxmoadgVar, 1);
        this.f54823wkgbmnqykc = zynmafqrjbVar;
        iobyxmoadgVar.zoijcleaow(zynmafqrjbVar);
        this.f54821nufgyqmvbu = j13;
    }

    private List eablkybsjg(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals(CommonUrlParts.Values.FALSE_INTEGER) || str.equals("1")) {
                arrayList.add(str);
            } else if (xrmfcynszj.iobyxmoadg(this.f54817eablkybsjg, str)) {
                arrayList.add(str);
            } else {
                lereixgezr.sopmlzcsov.iobyxmoadg("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    tzroggbefp gxszxtbevo(String str) throws CameraUnavailableException {
        try {
            tzroggbefp tzroggbefpVar = (tzroggbefp) this.f54816dxjokdxxww.get(str);
            if (tzroggbefpVar != null) {
                return tzroggbefpVar;
            }
            tzroggbefp tzroggbefpVar2 = new tzroggbefp(str, this.f54817eablkybsjg);
            this.f54816dxjokdxxww.put(str, tzroggbefpVar2);
            return tzroggbefpVar2;
        } catch (CameraAccessExceptionCompat e13) {
            throw czzsidtyhn.iobyxmoadg(e13);
        }
    }

    @Override // istkbnxepw.yggfygwlhe
    public istkbnxepw.iwizpuwonk iobyxmoadg(String str) {
        if (this.f54818gxszxtbevo.contains(str)) {
            return new jpowsppfya(this.f54819iobyxmoadg, this.f54817eablkybsjg, str, gxszxtbevo(str), this.f54824zoijcleaow, this.f54823wkgbmnqykc, this.f54822ppxfxbqfkf.zoijcleaow(), this.f54822ppxfxbqfkf.ppxfxbqfkf(), this.f54820lqeggnwhkg, this.f54821nufgyqmvbu);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // istkbnxepw.yggfygwlhe
    /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
    public zdlpuopuiu.cllcsxoeiz ppxfxbqfkf() {
        return this.f54817eablkybsjg;
    }

    @Override // istkbnxepw.yggfygwlhe
    public pmvmpeiblj.iobyxmoadg wkgbmnqykc() {
        return this.f54824zoijcleaow;
    }

    @Override // istkbnxepw.yggfygwlhe
    public Set zoijcleaow() {
        return new LinkedHashSet(this.f54818gxszxtbevo);
    }
}
