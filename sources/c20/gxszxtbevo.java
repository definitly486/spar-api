package c20;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;

/* JADX INFO: loaded from: classes4.dex */
public final class gxszxtbevo extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private final k00.iobyxmoadg f18528eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private final c90.iobyxmoadg f18529gxszxtbevo;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final y10.iobyxmoadg f18530ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f18531wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final v10.zoijcleaow f18532zoijcleaow;

    static final class ppxfxbqfkf extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18534iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18536yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18537zdlpuopuiu;

        ppxfxbqfkf(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18536yggfygwlhe = obj;
            this.f18534iwizpuwonk |= Integer.MIN_VALUE;
            return gxszxtbevo.this.eablkybsjg(this);
        }
    }

    static final class zoijcleaow extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f18538iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f18540yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f18541zdlpuopuiu;

        zoijcleaow(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f18540yggfygwlhe = obj;
            this.f18538iwizpuwonk |= Integer.MIN_VALUE;
            return gxszxtbevo.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(v10.zoijcleaow sharedPreferencesRepository, y10.iobyxmoadg authRemoteSource, ca2.ppxfxbqfkf userRepository, k00.iobyxmoadg cartInteractor, c90.iobyxmoadg clearEchecksDialogUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(sharedPreferencesRepository, "sharedPreferencesRepository");
        zdlpuopuiu.btonecajqb(authRemoteSource, "authRemoteSource");
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        zdlpuopuiu.btonecajqb(cartInteractor, "cartInteractor");
        zdlpuopuiu.btonecajqb(clearEchecksDialogUseCase, "clearEchecksDialogUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f18532zoijcleaow = sharedPreferencesRepository;
        this.f18530ppxfxbqfkf = authRemoteSource;
        this.f18531wkgbmnqykc = userRepository;
        this.f18528eablkybsjg = cartInteractor;
        this.f18529gxszxtbevo = clearEchecksDialogUseCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object eablkybsjg(lg.gxszxtbevo gxszxtbevoVar) {
        ppxfxbqfkf ppxfxbqfkfVar;
        gxszxtbevo gxszxtbevoVar2;
        if (gxszxtbevoVar instanceof ppxfxbqfkf) {
            ppxfxbqfkfVar = (ppxfxbqfkf) gxszxtbevoVar;
            int i13 = ppxfxbqfkfVar.f18534iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                ppxfxbqfkfVar.f18534iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
            }
        } else {
            ppxfxbqfkfVar = new ppxfxbqfkf(gxszxtbevoVar);
        }
        Object obj = ppxfxbqfkfVar.f18536yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = ppxfxbqfkfVar.f18534iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                gxszxtbevoVar2 = (gxszxtbevo) ppxfxbqfkfVar.f18537zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        this.f18529gxszxtbevo.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg);
        this.f18532zoijcleaow.zoijcleaow();
        ca2.ppxfxbqfkf ppxfxbqfkfVar2 = this.f18531wkgbmnqykc;
        ppxfxbqfkfVar.f18537zdlpuopuiu = this;
        ppxfxbqfkfVar.f18534iwizpuwonk = 1;
        if (ppxfxbqfkfVar2.iobyxmoadg(ppxfxbqfkfVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        gxszxtbevoVar2 = this;
        k00.iobyxmoadg iobyxmoadgVar = gxszxtbevoVar2.f18528eablkybsjg;
        ppxfxbqfkfVar.f18537zdlpuopuiu = null;
        ppxfxbqfkfVar.f18534iwizpuwonk = 2;
        if (iobyxmoadgVar.esjtqupxsv(ppxfxbqfkfVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
        zoijcleaow zoijcleaowVar;
        gxszxtbevo gxszxtbevoVar2;
        if (gxszxtbevoVar instanceof zoijcleaow) {
            zoijcleaowVar = (zoijcleaow) gxszxtbevoVar;
            int i13 = zoijcleaowVar.f18538iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                zoijcleaowVar.f18538iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
            }
        } else {
            zoijcleaowVar = new zoijcleaow(gxszxtbevoVar);
        }
        Object obj = zoijcleaowVar.f18540yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = zoijcleaowVar.f18538iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                gxszxtbevoVar2 = (gxszxtbevo) zoijcleaowVar.f18541zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }
        gg.zdlpuopuiu.zoijcleaow(obj);
        if (iobyxmoadgVar.iobyxmoadg()) {
            y10.iobyxmoadg iobyxmoadgVar2 = this.f18530ppxfxbqfkf;
            zoijcleaowVar.f18541zdlpuopuiu = this;
            zoijcleaowVar.f18538iwizpuwonk = 1;
            if (iobyxmoadgVar2.ppxfxbqfkf(zoijcleaowVar) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        }
        gxszxtbevoVar2 = this;
        zoijcleaowVar.f18541zdlpuopuiu = null;
        zoijcleaowVar.f18538iwizpuwonk = 2;
        if (gxszxtbevoVar2.eablkybsjg(zoijcleaowVar) == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        return wwaezpbzkn.f37140iobyxmoadg;
    }

    public static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f18533iobyxmoadg;

        public iobyxmoadg(boolean z13) {
            this.f18533iobyxmoadg = z13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof iobyxmoadg) && this.f18533iobyxmoadg == ((iobyxmoadg) obj).f18533iobyxmoadg;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f18533iobyxmoadg);
        }

        public final boolean iobyxmoadg() {
            return this.f18533iobyxmoadg;
        }

        public String toString() {
            return "Params(isNeedToAuthRemote=" + this.f18533iobyxmoadg + ")";
        }

        public /* synthetic */ iobyxmoadg(boolean z13, int i13, gtknphoqwx gtknphoqwxVar) {
            this((i13 & 1) != 0 ? true : z13);
        }
    }
}
