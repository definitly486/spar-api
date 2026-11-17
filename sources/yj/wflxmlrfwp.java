package yj;

import java.util.concurrent.atomic.AtomicReferenceArray;
import uj.lereixgezr;

/* JADX INFO: loaded from: classes3.dex */
final class wflxmlrfwp extends lereixgezr {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f125504cqumvgiudr;

    public wflxmlrfwp(long j13, wflxmlrfwp wflxmlrfwpVar, int i13) {
        super(j13, wflxmlrfwpVar, i13);
        this.f125504cqumvgiudr = new AtomicReferenceArray(draadjrbmk.f125487gxszxtbevo);
    }

    public final /* synthetic */ AtomicReferenceArray jyumaefscl() {
        return this.f125504cqumvgiudr;
    }

    @Override // uj.lereixgezr
    public void kcexrzcfyt(int i13, Throwable th2, lg.btonecajqb btonecajqbVar) {
        jyumaefscl().set(i13, draadjrbmk.f125486eablkybsjg);
        zdlpuopuiu();
    }

    @Override // uj.lereixgezr
    public int oxmwwwfdhm() {
        return draadjrbmk.f125487gxszxtbevo;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f113652jyumaefscl + ", hashCode=" + hashCode() + ']';
    }
}
