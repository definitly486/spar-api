package androidx.compose.runtime;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class grlcpdaxtj implements ipoelvxyzq {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private final ezmngbhpjk.ojitshcjhn f5629btonecajqb;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final boolean f5631eablkybsjg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private final q f5632gtknphoqwx;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final wkgbmnqykc f5633gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final pmvmpeiblj f5634iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private final Object f5635lqeggnwhkg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final oxmwwwfdhm f5637ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final tg.rgvfuqvkyq f5638wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final cqumvgiudr f5639zoijcleaow;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private AtomicReference f5636nufgyqmvbu = new AtomicReference(mhtqkkgtqm.InitialPending);

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private androidx.collection.vipkmwdibw f5630dxjokdxxww = androidx.collection.jhduphickx.iobyxmoadg();

    public /* synthetic */ class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final /* synthetic */ int[] f5640iobyxmoadg;

        static {
            int[] iArr = new int[mhtqkkgtqm.values().length];
            try {
                iArr[mhtqkkgtqm.InitialPending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mhtqkkgtqm.RecomposePending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mhtqkkgtqm.Recomposing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mhtqkkgtqm.ApplyPending.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mhtqkkgtqm.Applied.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mhtqkkgtqm.Cancelled.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[mhtqkkgtqm.Invalid.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f5640iobyxmoadg = iArr;
        }
    }

    public grlcpdaxtj(pmvmpeiblj pmvmpeibljVar, cqumvgiudr cqumvgiudrVar, oxmwwwfdhm oxmwwwfdhmVar, Set set, tg.rgvfuqvkyq rgvfuqvkyqVar, boolean z13, wkgbmnqykc wkgbmnqykcVar, Object obj) {
        this.f5634iobyxmoadg = pmvmpeibljVar;
        this.f5639zoijcleaow = cqumvgiudrVar;
        this.f5637ppxfxbqfkf = oxmwwwfdhmVar;
        this.f5638wkgbmnqykc = rgvfuqvkyqVar;
        this.f5631eablkybsjg = z13;
        this.f5633gxszxtbevo = wkgbmnqykcVar;
        this.f5635lqeggnwhkg = obj;
        ezmngbhpjk.ojitshcjhn ojitshcjhnVar = new ezmngbhpjk.ojitshcjhn();
        ojitshcjhnVar.oxmwwwfdhm(set, oxmwwwfdhmVar.mhtqkkgtqm());
        this.f5629btonecajqb = ojitshcjhnVar;
        this.f5632gtknphoqwx = new q(wkgbmnqykcVar.iobyxmoadg());
    }

    private final void lqeggnwhkg() {
        mhtqkkgtqm mhtqkkgtqmVar = mhtqkkgtqm.RecomposePending;
        mhtqkkgtqm mhtqkkgtqmVar2 = mhtqkkgtqm.ApplyPending;
        if (mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f5636nufgyqmvbu, mhtqkkgtqmVar, mhtqkkgtqmVar2)) {
            return;
        }
        fmlbqenlif.zoijcleaow("Unexpected state change from: " + mhtqkkgtqmVar + " to: " + mhtqkkgtqmVar2 + '.');
    }

    private final void ppxfxbqfkf() {
        synchronized (this.f5635lqeggnwhkg) {
            try {
                q qVar = this.f5632gtknphoqwx;
                wkgbmnqykc wkgbmnqykcVar = this.f5633gxszxtbevo;
                kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(wkgbmnqykcVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                qVar.draadjrbmk(wkgbmnqykcVar, this.f5629btonecajqb);
                this.f5629btonecajqb.wflxmlrfwp();
                this.f5629btonecajqb.agtfadlqog();
                this.f5629btonecajqb.btonecajqb();
                this.f5634iobyxmoadg.ntlheqmsrt(null);
                gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            } catch (Throwable th2) {
                this.f5629btonecajqb.btonecajqb();
                this.f5634iobyxmoadg.ntlheqmsrt(null);
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.ipoelvxyzq
    public void apply() throws Exception {
        try {
            switch (iobyxmoadg.f5640iobyxmoadg[((mhtqkkgtqm) this.f5636nufgyqmvbu.get()).ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    ppxfxbqfkf();
                    mhtqkkgtqm mhtqkkgtqmVar = mhtqkkgtqm.ApplyPending;
                    mhtqkkgtqm mhtqkkgtqmVar2 = mhtqkkgtqm.Applied;
                    if (mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f5636nufgyqmvbu, mhtqkkgtqmVar, mhtqkkgtqmVar2)) {
                        return;
                    }
                    fmlbqenlif.zoijcleaow("Unexpected state change from: " + mhtqkkgtqmVar + " to: " + mhtqkkgtqmVar2 + '.');
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e13) {
            this.f5636nufgyqmvbu.set(mhtqkkgtqm.Invalid);
            throw e13;
        }
    }

    @Override // androidx.compose.runtime.ipoelvxyzq
    public void cancel() {
        this.f5636nufgyqmvbu.set(mhtqkkgtqm.Cancelled);
        androidx.collection.vipkmwdibw vipkmwdibwVarOjitshcjhn = this.f5629btonecajqb.ojitshcjhn();
        this.f5629btonecajqb.btonecajqb();
        this.f5634iobyxmoadg.ntlheqmsrt(vipkmwdibwVarOjitshcjhn);
    }

    public final ezmngbhpjk.ojitshcjhn eablkybsjg() {
        return this.f5629btonecajqb;
    }

    public final boolean gxszxtbevo() {
        return this.f5636nufgyqmvbu.get() == mhtqkkgtqm.Recomposing;
    }

    @Override // androidx.compose.runtime.ipoelvxyzq
    public boolean iobyxmoadg() {
        return ((mhtqkkgtqm) this.f5636nufgyqmvbu.get()).compareTo(mhtqkkgtqm.ApplyPending) >= 0;
    }

    public final void nufgyqmvbu() {
        Object obj = this.f5636nufgyqmvbu.get();
        mhtqkkgtqm mhtqkkgtqmVar = mhtqkkgtqm.RecomposePending;
        if (obj == mhtqkkgtqmVar) {
            return;
        }
        mhtqkkgtqm mhtqkkgtqmVar2 = mhtqkkgtqm.ApplyPending;
        if (mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f5636nufgyqmvbu, mhtqkkgtqmVar2, mhtqkkgtqmVar)) {
            return;
        }
        fmlbqenlif.zoijcleaow("Unexpected state change from: " + mhtqkkgtqmVar2 + " to: " + mhtqkkgtqmVar + '.');
    }

    public final q wkgbmnqykc() {
        return this.f5632gtknphoqwx;
    }

    @Override // androidx.compose.runtime.ipoelvxyzq
    public boolean zoijcleaow(b0 b0Var) throws Exception {
        try {
            switch (iobyxmoadg.f5640iobyxmoadg[((mhtqkkgtqm) this.f5636nufgyqmvbu.get()).ordinal()]) {
                case 1:
                    if (this.f5631eablkybsjg) {
                        this.f5637ppxfxbqfkf.G();
                    }
                    try {
                        this.f5630dxjokdxxww = this.f5639zoijcleaow.zoijcleaow(this.f5634iobyxmoadg, b0Var, this.f5638wkgbmnqykc);
                        if (this.f5631eablkybsjg) {
                            this.f5637ppxfxbqfkf.auzgnhcxok();
                        }
                        mhtqkkgtqm mhtqkkgtqmVar = mhtqkkgtqm.InitialPending;
                        mhtqkkgtqm mhtqkkgtqmVar2 = mhtqkkgtqm.RecomposePending;
                        if (!mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f5636nufgyqmvbu, mhtqkkgtqmVar, mhtqkkgtqmVar2)) {
                            fmlbqenlif.zoijcleaow("Unexpected state change from: " + mhtqkkgtqmVar + " to: " + mhtqkkgtqmVar2 + '.');
                        }
                        if (this.f5630dxjokdxxww.wkgbmnqykc()) {
                            lqeggnwhkg();
                        }
                        return iobyxmoadg();
                    } catch (Throwable th2) {
                        if (this.f5631eablkybsjg) {
                            this.f5637ppxfxbqfkf.auzgnhcxok();
                        }
                        throw th2;
                    }
                case 2:
                    mhtqkkgtqm mhtqkkgtqmVar3 = mhtqkkgtqm.RecomposePending;
                    mhtqkkgtqm mhtqkkgtqmVar4 = mhtqkkgtqm.Recomposing;
                    if (!mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f5636nufgyqmvbu, mhtqkkgtqmVar3, mhtqkkgtqmVar4)) {
                        fmlbqenlif.zoijcleaow("Unexpected state change from: " + mhtqkkgtqmVar3 + " to: " + mhtqkkgtqmVar4 + '.');
                    }
                    try {
                        this.f5630dxjokdxxww = this.f5639zoijcleaow.ojitshcjhn(this.f5634iobyxmoadg, b0Var, this.f5630dxjokdxxww);
                        if (!mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f5636nufgyqmvbu, mhtqkkgtqmVar4, mhtqkkgtqmVar3)) {
                            fmlbqenlif.zoijcleaow("Unexpected state change from: " + mhtqkkgtqmVar4 + " to: " + mhtqkkgtqmVar3 + '.');
                        }
                        if (this.f5630dxjokdxxww.wkgbmnqykc()) {
                            lqeggnwhkg();
                        }
                        return iobyxmoadg();
                    } catch (Throwable th3) {
                        mhtqkkgtqm mhtqkkgtqmVar5 = mhtqkkgtqm.Recomposing;
                        mhtqkkgtqm mhtqkkgtqmVar6 = mhtqkkgtqm.RecomposePending;
                        if (!mbcevpiqjq.wkgbmnqykc.iobyxmoadg(this.f5636nufgyqmvbu, mhtqkkgtqmVar5, mhtqkkgtqmVar6)) {
                            fmlbqenlif.zoijcleaow("Unexpected state change from: " + mhtqkkgtqmVar5 + " to: " + mhtqkkgtqmVar6 + '.');
                        }
                        throw th3;
                    }
                case 3:
                    jyumaefscl.yggfygwlhe("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e13) {
            this.f5636nufgyqmvbu.set(mhtqkkgtqm.Invalid);
            throw e13;
        }
    }
}
