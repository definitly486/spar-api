package zg0;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.myspar.impl.domain.model.Promotion;

/* JADX INFO: loaded from: classes4.dex */
public final class eablkybsjg extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final na0.iobyxmoadg f129943ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final yg0.iobyxmoadg f129944zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f129945iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f129947yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f129948zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f129947yggfygwlhe = obj;
            this.f129945iwizpuwonk |= Integer.MIN_VALUE;
            return eablkybsjg.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eablkybsjg(yg0.iobyxmoadg mySparSectionsRepository, na0.iobyxmoadg featureManager, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(mySparSectionsRepository, "mySparSectionsRepository");
        zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f129944zoijcleaow = mySparSectionsRepository;
        this.f129943ppxfxbqfkf = featureManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        eablkybsjg eablkybsjgVar;
        Object obj;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f129945iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f129945iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = iobyxmoadgVar.f129947yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f129945iwizpuwonk;
        boolean z13 = false;
        if (i14 != 0) {
            if (i14 == 1) {
                eablkybsjgVar = (eablkybsjg) iobyxmoadgVar.f129948zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = iobyxmoadgVar.f129948zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            }
            if (((Boolean) objPpxfxbqfkf).booleanValue()) {
                objPpxfxbqfkf = obj;
                obj = objPpxfxbqfkf;
                z13 = true;
            }
            if (z13) {
                return obj;
            }
            return null;
        }
        gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
        yg0.iobyxmoadg iobyxmoadgVar2 = this.f129944zoijcleaow;
        iobyxmoadgVar.f129948zdlpuopuiu = this;
        iobyxmoadgVar.f129945iwizpuwonk = 1;
        objPpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf(false, null, iobyxmoadgVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        eablkybsjgVar = this;
        if (zdlpuopuiu.eablkybsjg(((Promotion) objPpxfxbqfkf).getReference(), "monopoly")) {
            na0.iobyxmoadg iobyxmoadgVar3 = eablkybsjgVar.f129943ppxfxbqfkf;
            iobyxmoadgVar.f129948zdlpuopuiu = objPpxfxbqfkf;
            iobyxmoadgVar.f129945iwizpuwonk = 2;
            Object objPpxfxbqfkf2 = iobyxmoadgVar3.ppxfxbqfkf(iobyxmoadgVar);
            if (objPpxfxbqfkf2 == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            Object obj2 = objPpxfxbqfkf;
            objPpxfxbqfkf = objPpxfxbqfkf2;
            obj = obj2;
            if (((Boolean) objPpxfxbqfkf).booleanValue()) {
                objPpxfxbqfkf = obj;
                obj = objPpxfxbqfkf;
                z13 = true;
            }
        } else {
            obj = objPpxfxbqfkf;
            z13 = true;
        }
        if (z13) {
            return obj;
        }
        return null;
    }
}
