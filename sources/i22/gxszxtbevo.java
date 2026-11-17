package i22;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import pj.pkzmftpjix;
import ru.myspar.user.models.User;

/* JADX INFO: loaded from: classes6.dex */
public final class gxszxtbevo extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final ca2.wkgbmnqykc f41799ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final na0.iobyxmoadg f41800wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final ca2.ppxfxbqfkf f41801zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f41802iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f41804yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f41805zdlpuopuiu;

        iobyxmoadg(lg.gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f41804yggfygwlhe = obj;
            this.f41802iwizpuwonk |= Integer.MIN_VALUE;
            return gxszxtbevo.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxszxtbevo(ca2.ppxfxbqfkf userRepository, ca2.wkgbmnqykc userSharedPreferences, na0.iobyxmoadg featureManager, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(userRepository, "userRepository");
        zdlpuopuiu.btonecajqb(userSharedPreferences, "userSharedPreferences");
        zdlpuopuiu.btonecajqb(featureManager, "featureManager");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f41801zoijcleaow = userRepository;
        this.f41799ppxfxbqfkf = userSharedPreferences;
        this.f41800wkgbmnqykc = featureManager;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, lg.gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        gxszxtbevo gxszxtbevoVar2;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f41802iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f41802iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objLqeggnwhkg = iobyxmoadgVar.f41804yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f41802iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                gxszxtbevoVar2 = (gxszxtbevo) iobyxmoadgVar.f41805zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objLqeggnwhkg);
        if (this.f41799ppxfxbqfkf.nufgyqmvbu() && xx.iobyxmoadg.f123319iobyxmoadg.opjhrmiecq()) {
            ca2.ppxfxbqfkf ppxfxbqfkfVar = this.f41801zoijcleaow;
            iobyxmoadgVar.f41805zdlpuopuiu = this;
            iobyxmoadgVar.f41802iwizpuwonk = 1;
            objLqeggnwhkg = ppxfxbqfkfVar.lqeggnwhkg(iobyxmoadgVar);
            if (objLqeggnwhkg == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            gxszxtbevoVar2 = this;
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
        User user = (User) objLqeggnwhkg;
        if (user != null ? user.getScanGoAccessGranted() : false) {
            na0.iobyxmoadg iobyxmoadgVar2 = gxszxtbevoVar2.f41800wkgbmnqykc;
            iobyxmoadgVar.f41805zdlpuopuiu = null;
            iobyxmoadgVar.f41802iwizpuwonk = 2;
            objLqeggnwhkg = iobyxmoadgVar2.yggfygwlhe(iobyxmoadgVar);
            return objLqeggnwhkg == objGxszxtbevo ? objGxszxtbevo : objLqeggnwhkg;
        }
        return kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(false);
    }
}
