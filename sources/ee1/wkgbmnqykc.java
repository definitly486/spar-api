package ee1;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.myspar.impl.domain.model.Promotion;

/* JADX INFO: loaded from: classes5.dex */
public final class wkgbmnqykc extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final t81.iobyxmoadg f31223ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final de1.iobyxmoadg f31224zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f31225iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f31227yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f31228zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f31227yggfygwlhe = obj;
            this.f31225iwizpuwonk |= Integer.MIN_VALUE;
            return wkgbmnqykc.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wkgbmnqykc(de1.iobyxmoadg mySparSectionsRepository, t81.iobyxmoadg featureManager, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(mySparSectionsRepository, "mySparSectionsRepository");
        zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f31224zoijcleaow = mySparSectionsRepository;
        this.f31223ppxfxbqfkf = featureManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        wkgbmnqykc wkgbmnqykcVar;
        Object obj;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f31225iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f31225iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objPpxfxbqfkf = iobyxmoadgVar.f31227yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f31225iwizpuwonk;
        boolean z13 = false;
        if (i14 != 0) {
            if (i14 == 1) {
                wkgbmnqykcVar = (wkgbmnqykc) iobyxmoadgVar.f31228zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objPpxfxbqfkf);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = iobyxmoadgVar.f31228zdlpuopuiu;
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
        de1.iobyxmoadg iobyxmoadgVar2 = this.f31224zoijcleaow;
        iobyxmoadgVar.f31228zdlpuopuiu = this;
        iobyxmoadgVar.f31225iwizpuwonk = 1;
        objPpxfxbqfkf = iobyxmoadgVar2.ppxfxbqfkf(false, null, iobyxmoadgVar);
        if (objPpxfxbqfkf == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        wkgbmnqykcVar = this;
        if (zdlpuopuiu.eablkybsjg(((Promotion) objPpxfxbqfkf).getReference(), "monopoly")) {
            t81.iobyxmoadg iobyxmoadgVar3 = wkgbmnqykcVar.f31223ppxfxbqfkf;
            s81.iobyxmoadg iobyxmoadgVar4 = s81.iobyxmoadg.f105734kegysxyocb;
            iobyxmoadgVar.f31228zdlpuopuiu = objPpxfxbqfkf;
            iobyxmoadgVar.f31225iwizpuwonk = 2;
            Object objPpxfxbqfkf2 = iobyxmoadgVar3.ppxfxbqfkf(iobyxmoadgVar4, iobyxmoadgVar);
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
