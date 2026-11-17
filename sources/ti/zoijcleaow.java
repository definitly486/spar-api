package ti;

import kotlin.jvm.internal.zdlpuopuiu;
import zi.kegysxyocb;

/* JADX INFO: loaded from: classes3.dex */
public final class zoijcleaow extends iobyxmoadg implements gxszxtbevo {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final jh.eablkybsjg f110556ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ii.gxszxtbevo f110557wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(jh.eablkybsjg classDescriptor, kegysxyocb receiverType, ii.gxszxtbevo gxszxtbevoVar, lqeggnwhkg lqeggnwhkgVar) {
        super(receiverType, lqeggnwhkgVar);
        zdlpuopuiu.btonecajqb(classDescriptor, "classDescriptor");
        zdlpuopuiu.btonecajqb(receiverType, "receiverType");
        this.f110556ppxfxbqfkf = classDescriptor;
        this.f110557wkgbmnqykc = gxszxtbevoVar;
    }

    @Override // ti.gxszxtbevo
    public ii.gxszxtbevo iobyxmoadg() {
        return this.f110557wkgbmnqykc;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f110556ppxfxbqfkf + " }";
    }
}
