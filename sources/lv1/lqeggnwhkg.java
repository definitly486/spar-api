package lv1;

import fk.zynmafqrjb;
import java.lang.annotation.Annotation;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@bk.wflxmlrfwp
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Llv1/lqeggnwhkg;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "iobyxmoadg", "yggfygwlhe", "jyumaefscl", "iwizpuwonk", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum lqeggnwhkg {
    ONLINE,
    SBP_ONLINE,
    USER_CARD;


    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f64211esjtqupxsv = ng.zoijcleaow.iobyxmoadg(wkgbmnqykc());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final gg.gtknphoqwx f64215zdlpuopuiu = gg.draadjrbmk.iobyxmoadg(gg.ojitshcjhn.PUBLICATION, new tg.iobyxmoadg() { // from class: lv1.gxszxtbevo
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return lqeggnwhkg.lqeggnwhkg();
        }
    });

    /* JADX INFO: renamed from: lv1.lqeggnwhkg$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ bk.zoijcleaow iobyxmoadg() {
            return (bk.zoijcleaow) lqeggnwhkg.f64215zdlpuopuiu.getValue();
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ bk.zoijcleaow lqeggnwhkg() {
        return zynmafqrjb.iobyxmoadg("ru.myspar.proloyalty.tipsorder.impl.data.source.remote.model.PaymentMethodTypeDto", values(), new String[]{"online", "sbp_online", "user_card"}, new Annotation[][]{null, null, null}, null);
    }
}
