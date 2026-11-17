package pa2;

import android.content.SharedPreferences;
import gg.wwaezpbzkn;
import kotlin.coroutines.jvm.internal.draadjrbmk;
import lg.gxszxtbevo;
import rj.oxmwwwfdhm;
import rj.zdlpuopuiu;
import sj.dxjokdxxww;
import sj.lqeggnwhkg;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wkgbmnqykc {

    static final class iobyxmoadg extends draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f76295iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ SharedPreferences f76296jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f76297yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f76298zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(SharedPreferences sharedPreferences, String str, gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f76296jyumaefscl = sharedPreferences;
            this.f76295iwizpuwonk = str;
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
        public final gxszxtbevo create(Object obj, gxszxtbevo gxszxtbevoVar) {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f76296jyumaefscl, this.f76295iwizpuwonk, gxszxtbevoVar);
            iobyxmoadgVar.f76297yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f76298zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                final zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) this.f76297yggfygwlhe;
                final String str = this.f76295iwizpuwonk;
                final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: pa2.zoijcleaow
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                        wkgbmnqykc.iobyxmoadg.yggfygwlhe(str, zdlpuopuiuVar, sharedPreferences, str2);
                    }
                };
                this.f76296jyumaefscl.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                final SharedPreferences sharedPreferences = this.f76296jyumaefscl;
                tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: pa2.ppxfxbqfkf
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return wkgbmnqykc.iobyxmoadg.jyumaefscl(sharedPreferences, onSharedPreferenceChangeListener);
                    }
                };
                this.f76298zdlpuopuiu = 1;
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
        public final Object invoke(zdlpuopuiu zdlpuopuiuVar, gxszxtbevo gxszxtbevoVar) {
            return ((iobyxmoadg) create(zdlpuopuiuVar, gxszxtbevoVar)).invokeSuspend(wwaezpbzkn.f37140iobyxmoadg);
        }
    }

    public static final lqeggnwhkg iobyxmoadg(SharedPreferences sharedPreferences, String key) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sharedPreferences, "<this>");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(key, "key");
        return dxjokdxxww.eablkybsjg(new iobyxmoadg(sharedPreferences, key, null));
    }
}
