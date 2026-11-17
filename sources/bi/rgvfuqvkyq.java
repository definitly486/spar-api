package bi;

import zi.ikoacuggdj;
import zi.kegysxyocb;
import zi.ntlheqmsrt;

/* JADX INFO: loaded from: classes3.dex */
public final class rgvfuqvkyq implements vi.cqumvgiudr {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final rgvfuqvkyq f16330iobyxmoadg = new rgvfuqvkyq();

    private rgvfuqvkyq() {
    }

    @Override // vi.cqumvgiudr
    public kegysxyocb iobyxmoadg(di.vdvldrhtss proto, String flexibleId, ikoacuggdj lowerBound, ikoacuggdj upperBound) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(proto, "proto");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(flexibleId, "flexibleId");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lowerBound, "lowerBound");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(upperBound, "upperBound");
        if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(flexibleId, "kotlin.jvm.PlatformType")) {
            return proto.pmvmpeiblj(gi.iobyxmoadg.f37415lqeggnwhkg) ? new xh.gtknphoqwx(lowerBound, upperBound) : ntlheqmsrt.eablkybsjg(lowerBound, upperBound);
        }
        return bj.draadjrbmk.wkgbmnqykc(bj.gtknphoqwx.f16456ikoacuggdj, flexibleId, lowerBound.toString(), upperBound.toString());
    }
}
