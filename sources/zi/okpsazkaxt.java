package zi;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class okpsazkaxt extends ikoacuggdj {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final si.gtknphoqwx f130103cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final tg.draadjrbmk f130104esjtqupxsv;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final boolean f130105iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final List f130106jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final zeieaojujs f130107yggfygwlhe;

    public okpsazkaxt(zeieaojujs constructor, List arguments, boolean z13, si.gtknphoqwx memberScope, tg.draadjrbmk refinedTypeFactory) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(constructor, "constructor");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(arguments, "arguments");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(memberScope, "memberScope");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(refinedTypeFactory, "refinedTypeFactory");
        this.f130107yggfygwlhe = constructor;
        this.f130106jyumaefscl = arguments;
        this.f130105iwizpuwonk = z13;
        this.f130103cqumvgiudr = memberScope;
        this.f130104esjtqupxsv = refinedTypeFactory;
        if (!(agtfadlqog() instanceof bj.lqeggnwhkg) || (agtfadlqog() instanceof bj.wflxmlrfwp)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + agtfadlqog() + '\n' + grlcpdaxtj());
    }

    @Override // zi.kegysxyocb
    public si.gtknphoqwx agtfadlqog() {
        return this.f130103cqumvgiudr;
    }

    @Override // zi.grlcpdaxtj
    /* JADX INFO: renamed from: eslsurpljm */
    public ikoacuggdj rhgxfdycjh(opjhrmiecq newAttributes) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(newAttributes, "newAttributes");
        return newAttributes.isEmpty() ? this : new jztzpxfvev(this, newAttributes);
    }

    @Override // zi.kegysxyocb
    public List fyldjkxazc() {
        return this.f130106jyumaefscl;
    }

    @Override // zi.kegysxyocb
    public zeieaojujs grlcpdaxtj() {
        return this.f130107yggfygwlhe;
    }

    @Override // zi.kegysxyocb
    public opjhrmiecq ipoelvxyzq() {
        return opjhrmiecq.f130109yggfygwlhe.btonecajqb();
    }

    @Override // zi.kegysxyocb
    /* JADX INFO: renamed from: krqnebusok, reason: merged with bridge method [inline-methods] */
    public ikoacuggdj ixidwrxhsl(aj.lqeggnwhkg kotlinTypeRefiner) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(kotlinTypeRefiner, "kotlinTypeRefiner");
        ikoacuggdj ikoacuggdjVar = (ikoacuggdj) this.f130104esjtqupxsv.invoke(kotlinTypeRefiner);
        return ikoacuggdjVar == null ? this : ikoacuggdjVar;
    }

    @Override // zi.kegysxyocb
    public boolean mhtqkkgtqm() {
        return this.f130105iwizpuwonk;
    }

    @Override // zi.grlcpdaxtj
    /* JADX INFO: renamed from: yzdjzghtvl */
    public ikoacuggdj fmlbqenlif(boolean z13) {
        if (z13 == mhtqkkgtqm()) {
            return this;
        }
        return z13 ? new vipkmwdibw(this) : new jlmebxxoox(this);
    }
}
