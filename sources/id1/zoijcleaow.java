package id1;

import gg.kcexrzcfyt;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import ow1.esjtqupxsv;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.reviewWithBonuses.ReviewWithBonuses;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final t81.iobyxmoadg f42446ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final esjtqupxsv f42447wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final sc1.ppxfxbqfkf f42448zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f42449iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f42451yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f42452zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f42451yggfygwlhe = obj;
            this.f42449iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(sc1.ppxfxbqfkf mySparDialogsRepository, t81.iobyxmoadg featureManager, esjtqupxsv isAuthUseCase, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(mySparDialogsRepository, "mySparDialogsRepository");
        zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        zdlpuopuiu.btonecajqb(isAuthUseCase, "isAuthUseCase");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f42448zoijcleaow = mySparDialogsRepository;
        this.f42446ppxfxbqfkf = featureManager;
        this.f42447wkgbmnqykc = isAuthUseCase;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        Object objWkgbmnqykc;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f42449iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f42449iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = iobyxmoadgVar.f42451yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f42449iwizpuwonk;
        try {
            if (i14 != 0) {
                if (i14 == 1) {
                    zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f42452zdlpuopuiu;
                    gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
                } else {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
                }
                objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((ReviewWithBonuses) objPpxfxbqfkf);
                if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                    return null;
                }
                return objWkgbmnqykc;
            }
            gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            if (!((Boolean) this.f42447wkgbmnqykc.zoijcleaow(wwaezpbzkn.f37140iobyxmoadg)).booleanValue()) {
                return null;
            }
            t81.iobyxmoadg iobyxmoadgVar2 = this.f42446ppxfxbqfkf;
            s81.iobyxmoadg iobyxmoadgVar3 = s81.iobyxmoadg.f105738ntlheqmsrt;
            iobyxmoadgVar.f42452zdlpuopuiu = this;
            iobyxmoadgVar.f42449iwizpuwonk = 1;
            objPpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf(iobyxmoadgVar3, iobyxmoadgVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            zoijcleaowVar = this;
            if (!((Boolean) objPpxfxbqfkf).booleanValue()) {
                return null;
            }
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar4 = kcexrzcfyt.f37117yggfygwlhe;
            sc1.ppxfxbqfkf ppxfxbqfkfVar = zoijcleaowVar.f42448zoijcleaow;
            iobyxmoadgVar.f42452zdlpuopuiu = null;
            iobyxmoadgVar.f42449iwizpuwonk = 2;
            objPpxfxbqfkf = ppxfxbqfkfVar.ppxfxbqfkf(iobyxmoadgVar);
            if (objPpxfxbqfkf == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc((ReviewWithBonuses) objPpxfxbqfkf);
            if (kcexrzcfyt.draadjrbmk(objWkgbmnqykc)) {
                return null;
            }
            return objWkgbmnqykc;
        } catch (Throwable th2) {
            kcexrzcfyt.iobyxmoadg iobyxmoadgVar5 = kcexrzcfyt.f37117yggfygwlhe;
            objWkgbmnqykc = kcexrzcfyt.wkgbmnqykc(gg.zdlpuopuiu.iobyxmoadg(th2));
        }
    }
}
