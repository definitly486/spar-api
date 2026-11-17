package qr;

import de0.wkgbmnqykc;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import hg.jyumaefscl;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import mg.zoijcleaow;
import pj.cllcsxoeiz;
import pj.dsvhmnatus;
import pj.gtknphoqwx;
import pu.ppxfxbqfkf;
import ru.myspar.common.view.product.model.product.ProductUiModel;
import ru.myspar.core.domain.models.cart.ProductUIData;
import tg.rgvfuqvkyq;
import tg.vdvldrhtss;

/* JADX INFO: loaded from: classes4.dex */
public final class iobyxmoadg implements vdvldrhtss {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final int f80527yggfygwlhe = wkgbmnqykc.f27897zdlpuopuiu;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wkgbmnqykc f80528zdlpuopuiu;

    /* JADX INFO: renamed from: qr.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    static final class C1786iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        final /* synthetic */ iobyxmoadg f80529cqumvgiudr;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ List f80530iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ List f80531jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f80532yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f80533zdlpuopuiu;

        /* JADX INFO: renamed from: qr.iobyxmoadg$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1787iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ List f80534cqumvgiudr;

            /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
            final /* synthetic */ int f80535esjtqupxsv;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ iobyxmoadg f80536iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ List f80537jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ ppxfxbqfkf f80538yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            int f80539zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1787iobyxmoadg(ppxfxbqfkf ppxfxbqfkfVar, List list, iobyxmoadg iobyxmoadgVar, List list2, int i13, gxszxtbevo gxszxtbevoVar) {
                super(2, gxszxtbevoVar);
                this.f80538yggfygwlhe = ppxfxbqfkfVar;
                this.f80537jyumaefscl = list;
                this.f80536iwizpuwonk = iobyxmoadgVar;
                this.f80534cqumvgiudr = list2;
                this.f80535esjtqupxsv = i13;
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
                return new C1787iobyxmoadg(this.f80538yggfygwlhe, this.f80537jyumaefscl, this.f80536iwizpuwonk, this.f80534cqumvgiudr, this.f80535esjtqupxsv, gxszxtbevoVar);
            }

            @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
            public final Object invokeSuspend(Object obj) {
                zoijcleaow.gxszxtbevo();
                if (this.f80539zdlpuopuiu != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
                ppxfxbqfkf ppxfxbqfkfVar = this.f80538yggfygwlhe;
                if (!(ppxfxbqfkfVar instanceof ProductUiModel)) {
                    return wwaezpbzkn.f37140iobyxmoadg;
                }
                for (Object obj2 : this.f80537jyumaefscl) {
                    if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(((ProductUIData) obj2).getId(), ((ProductUiModel) ppxfxbqfkfVar).getId())) {
                        this.f80534cqumvgiudr.set(this.f80535esjtqupxsv, this.f80536iwizpuwonk.f80528zdlpuopuiu.invoke((ProductUiModel) this.f80538yggfygwlhe, (ProductUIData) obj2));
                        return wwaezpbzkn.f37140iobyxmoadg;
                    }
                }
                obj2 = null;
                this.f80534cqumvgiudr.set(this.f80535esjtqupxsv, this.f80536iwizpuwonk.f80528zdlpuopuiu.invoke((ProductUiModel) this.f80538yggfygwlhe, (ProductUIData) obj2));
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            @Override // tg.rgvfuqvkyq
            public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
                return ((C1787iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1786iobyxmoadg(List list, List list2, iobyxmoadg iobyxmoadgVar, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f80531jyumaefscl = list;
            this.f80530iwizpuwonk = list2;
            this.f80529cqumvgiudr = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            C1786iobyxmoadg c1786iobyxmoadg = new C1786iobyxmoadg(this.f80531jyumaefscl, this.f80530iwizpuwonk, this.f80529cqumvgiudr, gxszxtbevoVar);
            c1786iobyxmoadg.f80532yggfygwlhe = obj;
            return c1786iobyxmoadg;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = zoijcleaow.gxszxtbevo();
            int i13 = this.f80533zdlpuopuiu;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                List list = (List) this.f80532yggfygwlhe;
                zdlpuopuiu.zoijcleaow(obj);
                return list;
            }
            zdlpuopuiu.zoijcleaow(obj);
            cllcsxoeiz cllcsxoeizVar = (cllcsxoeiz) this.f80532yggfygwlhe;
            List listP = jyumaefscl.p(this.f80531jyumaefscl);
            List list2 = this.f80530iwizpuwonk;
            iobyxmoadg iobyxmoadgVar = this.f80529cqumvgiudr;
            ArrayList arrayList = new ArrayList(jyumaefscl.cqumvgiudr(listP, 10));
            int i14 = 0;
            for (Object obj2 : listP) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    jyumaefscl.iwizpuwonk();
                }
                arrayList.add(gtknphoqwx.zoijcleaow(cllcsxoeizVar, null, null, new C1787iobyxmoadg((ppxfxbqfkf) obj2, list2, iobyxmoadgVar, listP, i14, null), 3, null));
                i14 = i15;
            }
            this.f80532yggfygwlhe = listP;
            this.f80533zdlpuopuiu = 1;
            return pj.gxszxtbevo.iobyxmoadg(arrayList, this) == objGxszxtbevo ? objGxszxtbevo : listP;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, gxszxtbevo gxszxtbevoVar) {
            return ((C1786iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public iobyxmoadg(wkgbmnqykc updateProductUiModelUseCase) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(updateProductUiModelUseCase, "updateProductUiModelUseCase");
        this.f80528zdlpuopuiu = updateProductUiModelUseCase;
    }

    @Override // tg.vdvldrhtss
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public Object invoke(List list, List list2, gxszxtbevo gxszxtbevoVar) {
        return dsvhmnatus.gxszxtbevo(new C1786iobyxmoadg(list, list2, this, null), gxszxtbevoVar);
    }
}
