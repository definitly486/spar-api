package q01;

import gg.wwaezpbzkn;
import k01.wkgbmnqykc;
import kotlin.jvm.internal.zdlpuopuiu;
import kz0.lqeggnwhkg;
import lg.gxszxtbevo;
import pj.pkzmftpjix;
import ru.myspar.proloyalty.core.domain.models.cart.Cart;

/* JADX INFO: loaded from: classes5.dex */
public final class zoijcleaow extends zr0.ppxfxbqfkf {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final wkgbmnqykc f77627ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final k01.ppxfxbqfkf f77628zoijcleaow;

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        int f77629iwizpuwonk;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        /* synthetic */ Object f77631yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        Object f77632zdlpuopuiu;

        iobyxmoadg(gxszxtbevo gxszxtbevoVar) {
            super(gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            this.f77631yggfygwlhe = obj;
            this.f77629iwizpuwonk |= Integer.MIN_VALUE;
            return zoijcleaow.this.iobyxmoadg(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zoijcleaow(k01.ppxfxbqfkf cartLocalSource, wkgbmnqykc cartRemoteSource, pkzmftpjix coroutineDispatcher) {
        super(coroutineDispatcher);
        zdlpuopuiu.btonecajqb(cartLocalSource, "cartLocalSource");
        zdlpuopuiu.btonecajqb(cartRemoteSource, "cartRemoteSource");
        zdlpuopuiu.btonecajqb(coroutineDispatcher, "coroutineDispatcher");
        this.f77628zoijcleaow = cartLocalSource;
        this.f77627ppxfxbqfkf = cartRemoteSource;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zr0.ppxfxbqfkf
    /* JADX INFO: renamed from: ppxfxbqfkf, reason: merged with bridge method [inline-methods] */
    public Object iobyxmoadg(wwaezpbzkn wwaezpbzknVar, gxszxtbevo gxszxtbevoVar) {
        iobyxmoadg iobyxmoadgVar;
        zoijcleaow zoijcleaowVar;
        if (gxszxtbevoVar instanceof iobyxmoadg) {
            iobyxmoadgVar = (iobyxmoadg) gxszxtbevoVar;
            int i13 = iobyxmoadgVar.f77629iwizpuwonk;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                iobyxmoadgVar.f77629iwizpuwonk = i13 - Integer.MIN_VALUE;
            } else {
                iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
            }
        } else {
            iobyxmoadgVar = new iobyxmoadg(gxszxtbevoVar);
        }
        Object objIobyxmoadg = iobyxmoadgVar.f77631yggfygwlhe;
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i14 = iobyxmoadgVar.f77629iwizpuwonk;
        if (i14 != 0) {
            if (i14 == 1) {
                zoijcleaowVar = (zoijcleaow) iobyxmoadgVar.f77632zdlpuopuiu;
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
            }
        }
        gg.zdlpuopuiu.zoijcleaow(objIobyxmoadg);
        k01.ppxfxbqfkf ppxfxbqfkfVar = this.f77628zoijcleaow;
        iobyxmoadgVar.f77632zdlpuopuiu = this;
        iobyxmoadgVar.f77629iwizpuwonk = 1;
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
        wkgbmnqykc wkgbmnqykcVar = zoijcleaowVar.f77627ppxfxbqfkf;
        iobyxmoadgVar.f77632zdlpuopuiu = null;
        iobyxmoadgVar.f77629iwizpuwonk = 2;
        objIobyxmoadg = wkgbmnqykcVar.draadjrbmk(lqeggnwhkgVar, iobyxmoadgVar);
        return objIobyxmoadg == objGxszxtbevo ? objGxszxtbevo : objIobyxmoadg;
    }
}
