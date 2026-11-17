package pd;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import gg.wwaezpbzkn;
import kotlin.jvm.internal.jyumaefscl;
import pj.dsvhmnatus;
import rj.oxmwwwfdhm;
import rj.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ojitshcjhn {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.remoteconfig.iobyxmoadg f76413jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f76414yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f76415zdlpuopuiu;

        /* JADX INFO: renamed from: pd.ojitshcjhn$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1689iobyxmoadg extends jyumaefscl implements tg.iobyxmoadg {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ wkgbmnqykc f76416zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1689iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
                super(0);
                this.f76416zdlpuopuiu = wkgbmnqykcVar;
            }

            @Override // tg.iobyxmoadg
            public /* bridge */ /* synthetic */ Object invoke() {
                iobyxmoadg();
                return wwaezpbzkn.f37140iobyxmoadg;
            }

            public final void iobyxmoadg() {
                this.f76416zdlpuopuiu.remove();
            }
        }

        public static final class zoijcleaow implements ppxfxbqfkf {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final /* synthetic */ com.google.firebase.remoteconfig.iobyxmoadg f76417iobyxmoadg;

            /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
            final /* synthetic */ zdlpuopuiu f76418zoijcleaow;

            zoijcleaow(com.google.firebase.remoteconfig.iobyxmoadg iobyxmoadgVar, zdlpuopuiu zdlpuopuiuVar) {
                this.f76417iobyxmoadg = iobyxmoadgVar;
                this.f76418zoijcleaow = zdlpuopuiuVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void wkgbmnqykc(zdlpuopuiu $this$callbackFlow, pd.zoijcleaow configUpdate) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb($this$callbackFlow, "$$this$callbackFlow");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configUpdate, "$configUpdate");
                rj.agtfadlqog.zoijcleaow($this$callbackFlow, configUpdate);
            }

            @Override // pd.ppxfxbqfkf
            public void iobyxmoadg(FirebaseRemoteConfigException error) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(error, "error");
                dsvhmnatus.ppxfxbqfkf(this.f76418zoijcleaow, "Error listening for config updates.", error);
            }

            @Override // pd.ppxfxbqfkf
            public void zoijcleaow(final pd.zoijcleaow configUpdate) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(configUpdate, "configUpdate");
                com.google.firebase.remoteconfig.iobyxmoadg iobyxmoadgVar = this.f76417iobyxmoadg;
                final zdlpuopuiu zdlpuopuiuVar = this.f76418zoijcleaow;
                iobyxmoadgVar.jyumaefscl(new Runnable() { // from class: pd.rgvfuqvkyq
                    @Override // java.lang.Runnable
                    public final void run() {
                        ojitshcjhn.iobyxmoadg.zoijcleaow.wkgbmnqykc(zdlpuopuiuVar, configUpdate);
                    }
                });
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(com.google.firebase.remoteconfig.iobyxmoadg iobyxmoadgVar, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f76413jyumaefscl = iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f76413jyumaefscl, gxszxtbevoVar);
            iobyxmoadgVar.f76414yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f76415zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) this.f76414yggfygwlhe;
                com.google.firebase.remoteconfig.iobyxmoadg iobyxmoadgVar = this.f76413jyumaefscl;
                wkgbmnqykc wkgbmnqykcVarLqeggnwhkg = iobyxmoadgVar.lqeggnwhkg(new zoijcleaow(iobyxmoadgVar, zdlpuopuiuVar));
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(wkgbmnqykcVarLqeggnwhkg, "FirebaseRemoteConfig.con…      }\n        }\n      )");
                C1689iobyxmoadg c1689iobyxmoadg = new C1689iobyxmoadg(wkgbmnqykcVarLqeggnwhkg);
                this.f76415zdlpuopuiu = 1;
                if (oxmwwwfdhm.iobyxmoadg(zdlpuopuiuVar, c1689iobyxmoadg, this) == objGxszxtbevo) {
                    return objGxszxtbevo;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gg.zdlpuopuiu.zoijcleaow(obj);
            }
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        @Override // tg.rgvfuqvkyq
        /* JADX INFO: renamed from: ojitshcjhn, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(zdlpuopuiuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final sj.lqeggnwhkg iobyxmoadg(com.google.firebase.remoteconfig.iobyxmoadg iobyxmoadgVar) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iobyxmoadgVar, "<this>");
        return sj.dxjokdxxww.eablkybsjg(new iobyxmoadg(iobyxmoadgVar, null));
    }
}
