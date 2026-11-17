package zi;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ylkuphrtab extends grlcpdaxtj implements dj.lqeggnwhkg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final ikoacuggdj f130165jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final ikoacuggdj f130166yggfygwlhe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylkuphrtab(ikoacuggdj lowerBound, ikoacuggdj upperBound) {
        super(null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(lowerBound, "lowerBound");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(upperBound, "upperBound");
        this.f130166yggfygwlhe = lowerBound;
        this.f130165jyumaefscl = upperBound;
    }

    public abstract String a(ki.agtfadlqog agtfadlqogVar, ki.iwizpuwonk iwizpuwonkVar);

    @Override // zi.kegysxyocb
    public si.gtknphoqwx agtfadlqog() {
        return yzdjzghtvl().agtfadlqog();
    }

    public final ikoacuggdj eslsurpljm() {
        return this.f130166yggfygwlhe;
    }

    @Override // zi.kegysxyocb
    public List fyldjkxazc() {
        return yzdjzghtvl().fyldjkxazc();
    }

    @Override // zi.kegysxyocb
    public zeieaojujs grlcpdaxtj() {
        return yzdjzghtvl().grlcpdaxtj();
    }

    @Override // zi.kegysxyocb
    public opjhrmiecq ipoelvxyzq() {
        return yzdjzghtvl().ipoelvxyzq();
    }

    public final ikoacuggdj krqnebusok() {
        return this.f130165jyumaefscl;
    }

    @Override // zi.kegysxyocb
    public boolean mhtqkkgtqm() {
        return yzdjzghtvl().mhtqkkgtqm();
    }

    public String toString() {
        return ki.agtfadlqog.f55532gtknphoqwx.ntlheqmsrt(this);
    }

    public abstract ikoacuggdj yzdjzghtvl();
}
