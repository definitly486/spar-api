package jr0;

import android.content.SharedPreferences;
import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import rj.oxmwwwfdhm;
import rj.zdlpuopuiu;
import sj.dxjokdxxww;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes5.dex */
public abstract class lqeggnwhkg {

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f52226iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ SharedPreferences f52227jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f52228yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f52229zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(SharedPreferences sharedPreferences, String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f52227jyumaefscl = sharedPreferences;
            this.f52226iwizpuwonk = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wwaezpbzkn jyumaefscl(SharedPreferences sharedPreferences, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
            sharedPreferences.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            return wwaezpbzkn.f37140iobyxmoadg;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void yggfygwlhe(String str, zdlpuopuiu zdlpuopuiuVar, SharedPreferences sharedPreferences, String str2) {
            if (kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(str2, str)) {
                zdlpuopuiuVar.eablkybsjg(wwaezpbzkn.f37140iobyxmoadg);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f52227jyumaefscl, this.f52226iwizpuwonk, gxszxtbevoVar);
            iobyxmoadgVar.f52228yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f52229zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                final zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) this.f52228yggfygwlhe;
                final String str = this.f52226iwizpuwonk;
                final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: jr0.eablkybsjg
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                        lqeggnwhkg.iobyxmoadg.yggfygwlhe(str, zdlpuopuiuVar, sharedPreferences, str2);
                    }
                };
                this.f52227jyumaefscl.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                final SharedPreferences sharedPreferences = this.f52227jyumaefscl;
                tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: jr0.gxszxtbevo
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return lqeggnwhkg.iobyxmoadg.jyumaefscl(sharedPreferences, onSharedPreferenceChangeListener);
                    }
                };
                this.f52229zdlpuopuiu = 1;
                if (oxmwwwfdhm.iobyxmoadg(zdlpuopuiuVar, iobyxmoadgVar, this) == objGxszxtbevo) {
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
        /* JADX INFO: renamed from: zdlpuopuiu, reason: merged with bridge method [inline-methods] */
        public final Object invoke(zdlpuopuiu zdlpuopuiuVar, lg.gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(zdlpuopuiuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final sj.lqeggnwhkg iobyxmoadg(SharedPreferences sharedPreferences, String key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sharedPreferences, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        return dxjokdxxww.eablkybsjg(new iobyxmoadg(sharedPreferences, key, null));
    }
}
