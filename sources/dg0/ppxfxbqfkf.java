package dg0;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.reviewWithBonuses.ReviewWithBonuses;

/* JADX INFO: loaded from: classes4.dex */
public final class ppxfxbqfkf extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final na0.iobyxmoadg f28126ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final c20.eablkybsjg f28127wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final of0.ppxfxbqfkf f28128zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f28129iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f28131yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f28132zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f28131yggfygwlhe = obj;
            this.f28129iwizpuwonk |= Integer.MIN_VALUE;
            return ppxfxbqfkf.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppxfxbqfkf(of0.ppxfxbqfkf mySparDialogsRepository, na0.iobyxmoadg featureManager, c20.eablkybsjg isLoggedInUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(mySparDialogsRepository, "mySparDialogsRepository");
        zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        zdlpuopuiu.btonecajqb(isLoggedInUseCase, "isLoggedInUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f28128zoijcleaow = mySparDialogsRepository;
        this.f28126ppxfxbqfkf = featureManager;
        this.f28127wkgbmnqykc = isLoggedInUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        ppxfxbqfkf ppxfxbqfkfVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f28129iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f28129iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f28131yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f28129iwizpuwonk;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    ppxfxbqfkfVar = (ppxfxbqfkf) iobyxmoadgVar.f28132zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((ReviewWithBonuses) objIobyxmoadg);
                if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                    return null;
                }
                return objWkgbmnqykc;
            }
            gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            if (!((Boolean) this.f28127wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                return null;
            }
            na0.iobyxmoadg iobyxmoadgVar2 = this.f28126ppxfxbqfkf;
            iobyxmoadgVar.f28132zdlpuopuiu = this;
            iobyxmoadgVar.f28129iwizpuwonk = 1;
            objIobyxmoadg = iobyxmoadgVar2.iobyxmoadg(iobyxmoadgVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            ppxfxbqfkfVar = this;
            if (!((Boolean) objIobyxmoadg).booleanValue()) {
                return null;
            }
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = kcexrzcfyt.f37117yggfygwlhe;
            of0.ppxfxbqfkf ppxfxbqfkfVar2 = ppxfxbqfkfVar.f28128zoijcleaow;
            iobyxmoadgVar.f28132zdlpuopuiu = null;
            iobyxmoadgVar.f28129iwizpuwonk = 2;
            objIobyxmoadg = ppxfxbqfkfVar2.ppxfxbqfkf(iobyxmoadgVar);
            if (objIobyxmoadg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((ReviewWithBonuses) objIobyxmoadg);
            if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                return null;
            }
            return objWkgbmnqykc;
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
    }
}
