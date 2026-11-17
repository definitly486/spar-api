package xb;

import cc.ojitshcjhn;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public final class eablkybsjg implements sd.gxszxtbevo {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final ojitshcjhn f121953iobyxmoadg;

    public eablkybsjg(ojitshcjhn userMetadata) {
        zdlpuopuiu.btonecajqb(userMetadata, "userMetadata");
        this.f121953iobyxmoadg = userMetadata;
    }

    @Override // sd.gxszxtbevo
    public void iobyxmoadg(sd.eablkybsjg rolloutsState) {
        zdlpuopuiu.btonecajqb(rolloutsState, "rolloutsState");
        ojitshcjhn ojitshcjhnVar = this.f121953iobyxmoadg;
        Set setZoijcleaow = rolloutsState.zoijcleaow();
        zdlpuopuiu.dxjokdxxww(setZoijcleaow, "rolloutsState.rolloutAssignments");
        Set<sd.wkgbmnqykc> set = setZoijcleaow;
        ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(set, 10));
        for (sd.wkgbmnqykc wkgbmnqykcVar : set) {
            arrayList.add(cc.dxjokdxxww.zoijcleaow(wkgbmnqykcVar.wkgbmnqykc(), wkgbmnqykcVar.zoijcleaow(), wkgbmnqykcVar.ppxfxbqfkf(), wkgbmnqykcVar.gxszxtbevo(), wkgbmnqykcVar.eablkybsjg()));
        }
        ojitshcjhnVar.zdlpuopuiu(arrayList);
        lqeggnwhkg.gxszxtbevo().zoijcleaow("Updated Crashlytics Rollout State");
    }
}
