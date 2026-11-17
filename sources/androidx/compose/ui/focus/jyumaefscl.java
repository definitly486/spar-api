package androidx.compose.ui.focus;

import java.util.Comparator;
import z.pkzmftpjix;

/* JADX INFO: loaded from: classes.dex */
final class jyumaefscl implements Comparator {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final jyumaefscl f6245zdlpuopuiu = new jyumaefscl();

    private jyumaefscl() {
    }

    private final ipoelvxyzq.ppxfxbqfkf zoijcleaow(pkzmftpjix pkzmftpjixVar) {
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVar = new ipoelvxyzq.ppxfxbqfkf(new pkzmftpjix[16], 0);
        while (pkzmftpjixVar != null) {
            ppxfxbqfkfVar.iobyxmoadg(0, pkzmftpjixVar);
            pkzmftpjixVar = pkzmftpjixVar.auzgnhcxok();
        }
        return ppxfxbqfkfVar;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public int compare(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2) {
        int i13 = 0;
        if (!zdlpuopuiu.lqeggnwhkg(focusTargetNode) || !zdlpuopuiu.lqeggnwhkg(focusTargetNode2)) {
            if (zdlpuopuiu.lqeggnwhkg(focusTargetNode)) {
                return -1;
            }
            return zdlpuopuiu.lqeggnwhkg(focusTargetNode2) ? 1 : 0;
        }
        pkzmftpjix pkzmftpjixVarRgvfuqvkyq = z.gtknphoqwx.rgvfuqvkyq(focusTargetNode);
        pkzmftpjix pkzmftpjixVarRgvfuqvkyq2 = z.gtknphoqwx.rgvfuqvkyq(focusTargetNode2);
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(pkzmftpjixVarRgvfuqvkyq, pkzmftpjixVarRgvfuqvkyq2)) {
            return 0;
        }
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow = zoijcleaow(pkzmftpjixVarRgvfuqvkyq);
        ipoelvxyzq.ppxfxbqfkf ppxfxbqfkfVarZoijcleaow2 = zoijcleaow(pkzmftpjixVarRgvfuqvkyq2);
        int iMin = Math.min(ppxfxbqfkfVarZoijcleaow.draadjrbmk() - 1, ppxfxbqfkfVarZoijcleaow2.draadjrbmk() - 1);
        if (iMin >= 0) {
            while (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(ppxfxbqfkfVarZoijcleaow.f49169zdlpuopuiu[i13], ppxfxbqfkfVarZoijcleaow2.f49169zdlpuopuiu[i13])) {
                if (i13 != iMin) {
                    i13++;
                }
            }
            return kotlin.jvm.internal.zdlpuopuiu.draadjrbmk(((pkzmftpjix) ppxfxbqfkfVarZoijcleaow.f49169zdlpuopuiu[i13]).iwxlajgraz(), ((pkzmftpjix) ppxfxbqfkfVarZoijcleaow2.f49169zdlpuopuiu[i13]).iwxlajgraz());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
