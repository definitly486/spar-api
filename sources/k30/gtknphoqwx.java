package k30;

import android.content.SharedPreferences;
import gg.wwaezpbzkn;
import rj.oxmwwwfdhm;
import rj.zdlpuopuiu;
import tg.rgvfuqvkyq;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gtknphoqwx {

    static final class iobyxmoadg extends kotlin.coroutines.jvm.internal.draadjrbmk implements rgvfuqvkyq {

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        final /* synthetic */ String f53676iwizpuwonk;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        final /* synthetic */ SharedPreferences f53677jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private /* synthetic */ Object f53678yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f53679zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        iobyxmoadg(SharedPreferences sharedPreferences, String str, lg.gxszxtbevo gxszxtbevoVar) {
            super(2, gxszxtbevoVar);
            this.f53677jyumaefscl = sharedPreferences;
            this.f53676iwizpuwonk = str;
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
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg(this.f53677jyumaefscl, this.f53676iwizpuwonk, gxszxtbevoVar);
            iobyxmoadgVar.f53678yggfygwlhe = obj;
            return iobyxmoadgVar;
        }

        @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
        public final Object invokeSuspend(Object obj) {
            Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
            int i13 = this.f53679zdlpuopuiu;
            if (i13 == 0) {
                gg.zdlpuopuiu.zoijcleaow(obj);
                final zdlpuopuiu zdlpuopuiuVar = (zdlpuopuiu) this.f53678yggfygwlhe;
                final String str = this.f53676iwizpuwonk;
                final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: k30.dxjokdxxww
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                        gtknphoqwx.iobyxmoadg.yggfygwlhe(str, zdlpuopuiuVar, sharedPreferences, str2);
                    }
                };
                this.f53677jyumaefscl.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                final SharedPreferences sharedPreferences = this.f53677jyumaefscl;
                tg.iobyxmoadg iobyxmoadgVar = new tg.iobyxmoadg() { // from class: k30.btonecajqb
                    @Override // tg.iobyxmoadg
                    public final Object invoke() {
                        return gtknphoqwx.iobyxmoadg.jyumaefscl(sharedPreferences, onSharedPreferenceChangeListener);
                    }
                };
                this.f53679zdlpuopuiu = 1;
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
        return sj.dxjokdxxww.eablkybsjg(new iobyxmoadg(sharedPreferences, key, null));
    }
}
