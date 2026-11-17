package metgxyhuhe;

import androidx.compose.runtime.c1;
import androidx.compose.runtime.i1;
import androidx.compose.runtime.iwxlajgraz;
import androidx.compose.runtime.jlmebxxoox;
import androidx.compose.runtime.jyumaefscl;
import gg.wwaezpbzkn;
import gg.zdlpuopuiu;
import java.util.ArrayList;
import java.util.List;
import pj.cllcsxoeiz;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes.dex */
public abstract class gxszxtbevo {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ iwxlajgraz f66897jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        final /* synthetic */ btonecajqb f66898yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f66899zdlpuopuiu;

        /* JADX INFO: renamed from: metgxyhuhe.gxszxtbevo$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1382iobyxmoadg implements sj.nufgyqmvbu {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ iwxlajgraz f66900yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ List f66901zdlpuopuiu;

            C1382iobyxmoadg(List list, iwxlajgraz iwxlajgrazVar) {
                this.f66901zdlpuopuiu = list;
                this.f66900yggfygwlhe = iwxlajgrazVar;
            }

            @Override // sj.nufgyqmvbu
            /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
            public final Object emit(dxjokdxxww dxjokdxxwwVar, lg.gxszxtbevo gxszxtbevoVar) {
                if (dxjokdxxwwVar instanceof wkgbmnqykc) {
                    this.f66901zdlpuopuiu.add(dxjokdxxwwVar);
                } else if (dxjokdxxwwVar instanceof eablkybsjg) {
                    this.f66901zdlpuopuiu.remove(((eablkybsjg) dxjokdxxwwVar).iobyxmoadg());
                }
                this.f66900yggfygwlhe.setValue(kotlin.coroutines.jvm.internal.zoijcleaow.iobyxmoadg(!this.f66901zdlpuopuiu.isEmpty()));
                return wwaezpbzkn.f37140iobyxmoadg;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(btonecajqb btonecajqbVar, iwxlajgraz iwxlajgrazVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f66898yggfygwlhe = btonecajqbVar;
            this.f66897jyumaefscl = iwxlajgrazVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            return new iobyxmoadg(this.f66898yggfygwlhe, this.f66897jyumaefscl, gxszxtbevoVar);
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f66899zdlpuopuiu;
            if (i13 == 0) {
                zdlpuopuiu.zoijcleaow(obj);
                ArrayList arrayList = new ArrayList();
                sj.lqeggnwhkg lqeggnwhkgVarPpxfxbqfkf = this.f66898yggfygwlhe.ppxfxbqfkf();
                C1382iobyxmoadg c1382iobyxmoadg = new C1382iobyxmoadg(arrayList, this.f66897jyumaefscl);
                this.f66899zdlpuopuiu = 1;
                if (lqeggnwhkgVarPpxfxbqfkf.collect(c1382iobyxmoadg, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        public final Object invoke(cllcsxoeiz cllcsxoeizVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(cllcsxoeizVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final i1 iobyxmoadg(btonecajqb btonecajqbVar, androidx.compose.runtime.draadjrbmk draadjrbmkVar, int i13) {
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.ntlheqmsrt(-1805515472, i13, -1, "androidx.compose.foundation.interaction.collectIsFocusedAsState (FocusInteraction.kt:63)");
        }
        Object objYadqdtsiqt = draadjrbmkVar.yadqdtsiqt();
        androidx.compose.runtime.draadjrbmk.iobyxmoadg iobyxmoadgVar = androidx.compose.runtime.draadjrbmk.f5569iobyxmoadg;
        if (objYadqdtsiqt == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt = c1.ppxfxbqfkf(Boolean.FALSE, null, 2, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt);
        }
        iwxlajgraz iwxlajgrazVar = (iwxlajgraz) objYadqdtsiqt;
        int i14 = i13 & 14;
        boolean z13 = ((i14 ^ 6) > 4 && draadjrbmkVar.ulzqkzuiru(btonecajqbVar)) || (i13 & 6) == 4;
        Object objYadqdtsiqt2 = draadjrbmkVar.yadqdtsiqt();
        if (z13 || objYadqdtsiqt2 == iobyxmoadgVar.iobyxmoadg()) {
            objYadqdtsiqt2 = new iobyxmoadg(btonecajqbVar, iwxlajgrazVar, null);
            draadjrbmkVar.jyumaefscl(objYadqdtsiqt2);
        }
        jlmebxxoox.eablkybsjg(btonecajqbVar, (rgvfuqvkyq) objYadqdtsiqt2, draadjrbmkVar, i14);
        if (jyumaefscl.jpowsppfya()) {
            jyumaefscl.mbcevpiqjq();
        }
        return iwxlajgrazVar;
    }
}
