package v2;

import java.util.Collections;
import java.util.List;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class iozdgvuglv {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final String f115366ppxfxbqfkf = stevsuqkhv.uawqvzlxes(0);

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final String f115367wkgbmnqykc = stevsuqkhv.uawqvzlxes(1);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final yadqdtsiqt f115368iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final com.google.common.collect.zdlpuopuiu f115369zoijcleaow;

    public iozdgvuglv(yadqdtsiqt yadqdtsiqtVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= yadqdtsiqtVar.f115705iobyxmoadg)) {
            throw new IndexOutOfBoundsException();
        }
        this.f115368iobyxmoadg = yadqdtsiqtVar;
        this.f115369zoijcleaow = com.google.common.collect.zdlpuopuiu.jyumaefscl(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iozdgvuglv.class != obj.getClass()) {
            return false;
        }
        iozdgvuglv iozdgvuglvVar = (iozdgvuglv) obj;
        return this.f115368iobyxmoadg.equals(iozdgvuglvVar.f115368iobyxmoadg) && this.f115369zoijcleaow.equals(iozdgvuglvVar.f115369zoijcleaow);
    }

    public int hashCode() {
        return this.f115368iobyxmoadg.hashCode() + (this.f115369zoijcleaow.hashCode() * 31);
    }

    public int iobyxmoadg() {
        return this.f115368iobyxmoadg.f115706ppxfxbqfkf;
    }
}
