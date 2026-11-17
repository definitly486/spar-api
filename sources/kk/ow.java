package kk;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ow {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Integer f58000eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final String f58001gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final io f58002iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    public final String f58003lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final mp f58004ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final Map f58005wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final we0 f58006zoijcleaow;

    public ow(io action, we0 view, mp actionType, Map map, Integer num, String str, String str2, int i13) {
        view = (i13 & 2) != 0 ? we0.NONE : view;
        map = (i13 & 8) != 0 ? null : map;
        num = (i13 & 16) != 0 ? null : num;
        str = (i13 & 32) != 0 ? null : str;
        str2 = (i13 & 64) != 0 ? null : str2;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(action, "action");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(view, "view");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(actionType, "actionType");
        this.f58002iobyxmoadg = action;
        this.f58006zoijcleaow = view;
        this.f58004ppxfxbqfkf = actionType;
        this.f58005wkgbmnqykc = map;
        this.f58000eablkybsjg = num;
        this.f58001gxszxtbevo = str;
        this.f58003lqeggnwhkg = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow)) {
            return false;
        }
        ow owVar = (ow) obj;
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58002iobyxmoadg, owVar.f58002iobyxmoadg) && this.f58006zoijcleaow == owVar.f58006zoijcleaow && this.f58004ppxfxbqfkf == owVar.f58004ppxfxbqfkf && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58005wkgbmnqykc, owVar.f58005wkgbmnqykc) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58000eablkybsjg, owVar.f58000eablkybsjg) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58001gxszxtbevo, owVar.f58001gxszxtbevo) && kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f58003lqeggnwhkg, owVar.f58003lqeggnwhkg);
    }

    public final int hashCode() {
        int iHashCode = (this.f58004ppxfxbqfkf.hashCode() + ((this.f58006zoijcleaow.hashCode() + (this.f58002iobyxmoadg.hashCode() * 31)) * 31)) * 31;
        Map map = this.f58005wkgbmnqykc;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Integer num = this.f58000eablkybsjg;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f58001gxszxtbevo;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f58003lqeggnwhkg;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "MetricEvent(action=" + this.f58002iobyxmoadg + ", view=" + this.f58006zoijcleaow + ", actionType=" + this.f58004ppxfxbqfkf + ", actionParams=" + this.f58005wkgbmnqykc + ", httpCode=" + this.f58000eablkybsjg + ", errorCode=" + this.f58001gxszxtbevo + ", parsingError=" + this.f58003lqeggnwhkg + ")";
    }
}
