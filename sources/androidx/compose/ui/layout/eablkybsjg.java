package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg implements iozdgvuglv {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final yggfygwlhe f6476eablkybsjg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final iozdgvuglv[] f6477ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final yggfygwlhe f6478wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final String f6479zoijcleaow;

    public eablkybsjg(String str, iozdgvuglv[] iozdgvuglvVarArr) {
        this.f6479zoijcleaow = str;
        this.f6477ppxfxbqfkf = iozdgvuglvVarArr;
        yggfygwlhe.iobyxmoadg iobyxmoadgVar = yggfygwlhe.f6560iobyxmoadg;
        ArrayList arrayList = new ArrayList(iozdgvuglvVarArr.length);
        for (iozdgvuglv iozdgvuglvVar : iozdgvuglvVarArr) {
            arrayList.add(iozdgvuglvVar.iobyxmoadg());
        }
        yggfygwlhe[] yggfygwlheVarArr = (yggfygwlhe[]) arrayList.toArray(new yggfygwlhe[0]);
        this.f6478wkgbmnqykc = iwizpuwonk.zoijcleaow(iobyxmoadgVar, (yggfygwlhe[]) Arrays.copyOf(yggfygwlheVarArr, yggfygwlheVarArr.length));
        yggfygwlhe.iobyxmoadg iobyxmoadgVar2 = yggfygwlhe.f6560iobyxmoadg;
        iozdgvuglv[] iozdgvuglvVarArr2 = this.f6477ppxfxbqfkf;
        ArrayList arrayList2 = new ArrayList(iozdgvuglvVarArr2.length);
        for (iozdgvuglv iozdgvuglvVar2 : iozdgvuglvVarArr2) {
            arrayList2.add(iozdgvuglvVar2.zoijcleaow());
        }
        yggfygwlhe[] yggfygwlheVarArr2 = (yggfygwlhe[]) arrayList2.toArray(new yggfygwlhe[0]);
        this.f6476eablkybsjg = iwizpuwonk.zoijcleaow(iobyxmoadgVar2, (yggfygwlhe[]) Arrays.copyOf(yggfygwlheVarArr2, yggfygwlheVarArr2.length));
    }

    @Override // androidx.compose.ui.layout.iozdgvuglv
    public yggfygwlhe iobyxmoadg() {
        return this.f6478wkgbmnqykc;
    }

    public String toString() {
        String str = this.f6479zoijcleaow;
        return str == null ? hg.agtfadlqog.wizcaqwiak(this.f6477ppxfxbqfkf, null, "innermostOf(", ")", 0, null, null, 57, null) : str;
    }

    @Override // androidx.compose.ui.layout.iozdgvuglv
    public yggfygwlhe zoijcleaow() {
        return this.f6476eablkybsjg;
    }
}
