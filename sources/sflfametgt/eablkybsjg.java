package sflfametgt;

import androidx.compose.runtime.c1;
import androidx.compose.runtime.iwxlajgraz;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class eablkybsjg extends ikoacuggdj {

    /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
    private iwxlajgraz f106161jpowsppfya;

    /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
    public static final iobyxmoadg f106160hkdspvbjdz = new iobyxmoadg(null);

    /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
    private static final rhgxfdycjh.jyumaefscl f106159cllcsxoeiz = rhgxfdycjh.zoijcleaow.zoijcleaow(new tg.rgvfuqvkyq() { // from class: sflfametgt.zoijcleaow
        @Override // tg.rgvfuqvkyq
        public final Object invoke(Object obj, Object obj2) {
            return eablkybsjg.auzgnhcxok((rhgxfdycjh.lereixgezr) obj, (eablkybsjg) obj2);
        }
    }, new tg.draadjrbmk() { // from class: sflfametgt.ppxfxbqfkf
        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            return eablkybsjg.iwxlajgraz((List) obj);
        }
    });

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final rhgxfdycjh.jyumaefscl iobyxmoadg() {
            return eablkybsjg.f106159cllcsxoeiz;
        }

        private iobyxmoadg() {
        }
    }

    public eablkybsjg(int i13, float f13, tg.iobyxmoadg iobyxmoadgVar) {
        super(i13, f13);
        this.f106161jpowsppfya = c1.ppxfxbqfkf(iobyxmoadgVar, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List auzgnhcxok(rhgxfdycjh.lereixgezr lereixgezrVar, eablkybsjg eablkybsjgVar) {
        return hg.jyumaefscl.rgvfuqvkyq(Integer.valueOf(eablkybsjgVar.cqumvgiudr()), Float.valueOf(zg.gtknphoqwx.wflxmlrfwp(eablkybsjgVar.esjtqupxsv(), -0.5f, 0.5f)), Integer.valueOf(eablkybsjgVar.pkzmftpjix()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int dvvnrvtcbc(List list) {
        Object obj = list.get(2);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eablkybsjg iwxlajgraz(final List list) {
        Object obj = list.get(0);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = list.get(1);
        kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new eablkybsjg(iIntValue, ((Float) obj2).floatValue(), new tg.iobyxmoadg() { // from class: sflfametgt.wkgbmnqykc
            @Override // tg.iobyxmoadg
            public final Object invoke() {
                return Integer.valueOf(eablkybsjg.dvvnrvtcbc(list));
            }
        });
    }

    public final iwxlajgraz igdgnonuha() {
        return this.f106161jpowsppfya;
    }

    @Override // sflfametgt.ikoacuggdj
    public int pkzmftpjix() {
        return ((Number) ((tg.iobyxmoadg) this.f106161jpowsppfya.getValue()).invoke()).intValue();
    }
}
