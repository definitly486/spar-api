package g20;

import gg.wwaezpbzkn;
import kotlin.jvm.internal.zdlpuopuiu;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.core.domain.models.cart.Cart;
import t00.lqeggnwhkg;
import w10.wkgbmnqykc;

/* JADX INFO: loaded from: classes4.dex */
public final class zoijcleaow extends ft.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wkgbmnqykc f35863ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final w10.ppxfxbqfkf f35864zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f35865iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f35867yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f35868zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f35867yggfygwlhe = obj;
            this.f35865iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(w10.ppxfxbqfkf cartLocalSource, wkgbmnqykc cartRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(cartLocalSource, "cartLocalSource");
        zdlpuopuiu.btonecajqb(cartRemoteSource, "cartRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f35864zoijcleaow = cartLocalSource;
        this.f35863ppxfxbqfkf = cartRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ft.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f35865iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f35865iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f35867yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f35865iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f35868zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        w10.ppxfxbqfkf ppxfxbqfkfVar = this.f35864zoijcleaow;
        iobyxmoadgVar.f35868zdlpuopuiu = this;
        iobyxmoadgVar.f35865iwizpuwonk = 1;
        objIobyxmoadg = ppxfxbqfkfVar.iobyxmoadg(iobyxmoadgVar);
        if (objIobyxmoadg == objGxszxtbevo) {
            return objGxszxtbevo;
        }
        zoijcleaowVar = this;
        Cart cart = (Cart) objIobyxmoadg;
        String strCllcsxoeiz = cart.cllcsxoeiz();
        if (strCllcsxoeiz == null) {
            strCllcsxoeiz = "";
        }
        lqeggnwhkg lqeggnwhkgVar = new lqeggnwhkg(strCllcsxoeiz, cart.dxjokdxxww());
        wkgbmnqykc wkgbmnqykcVar = zoijcleaowVar.f35863ppxfxbqfkf;
        iobyxmoadgVar.f35868zdlpuopuiu = null;
        iobyxmoadgVar.f35865iwizpuwonk = 2;
        objIobyxmoadg = wkgbmnqykcVar.wflxmlrfwp(lqeggnwhkgVar, iobyxmoadgVar);
        return objIobyxmoadg == objGxszxtbevo ? objGxszxtbevo : objIobyxmoadg;
    }
}
