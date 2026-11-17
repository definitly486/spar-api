package v1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public abstract class rlfsiqarku {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.gtknphoqwx implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ View f115188iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private /* synthetic */ Object f115189jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f115190yggfygwlhe;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(View view, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f115188iwizpuwonk = view;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f115188iwizpuwonk, gxszxtbevoVar);
            iobyxmoadgVar.f115189jyumaefscl = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            lj.draadjrbmk draadjrbmkVar;
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f115190yggfygwlhe;
            if (i13 != 0) {
                if (i13 == 1) {
                    draadjrbmkVar = (lj.draadjrbmk) this.f115189jyumaefscl;
                    gg.zdlpuopuiu.zoijcleaow(obj);
                } else {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gg.zdlpuopuiu.zoijcleaow(obj);
                }
                return gg.wwaezpbzkn.f37140iobyxmoadg;
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
            draadjrbmkVar = (lj.draadjrbmk) this.f115189jyumaefscl;
            View view = this.f115188iwizpuwonk;
            this.f115189jyumaefscl = draadjrbmkVar;
            this.f115190yggfygwlhe = 1;
            if (draadjrbmkVar.iobyxmoadg(view, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
            View view2 = this.f115188iwizpuwonk;
            if (view2 instanceof ViewGroup) {
                lj.btonecajqb btonecajqbVarZoijcleaow = metgxyhuhe.zoijcleaow((ViewGroup) view2);
                this.f115189jyumaefscl = null;
                this.f115190yggfygwlhe = 2;
                if (draadjrbmkVar.ppxfxbqfkf(btonecajqbVarZoijcleaow, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            }
            return gg.wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(lj.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(draadjrbmkVar, gxszxtbevoVar)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    /* synthetic */ class zoijcleaow extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final zoijcleaow f115191zdlpuopuiu = new zoijcleaow();

        zoijcleaow() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // tg.draadjrbmk
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final lj.btonecajqb iobyxmoadg(View view) {
        return lj.wflxmlrfwp.zoijcleaow(new iobyxmoadg(view, null));
    }

    public static final lj.btonecajqb zoijcleaow(View view) {
        return lj.wflxmlrfwp.agtfadlqog(view.getParent(), zoijcleaow.f115191zdlpuopuiu);
    }
}
