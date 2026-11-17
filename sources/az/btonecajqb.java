package az;

import bk.wflxmlrfwp;
import fk.zynmafqrjb;
import gg.draadjrbmk;
import gg.ojitshcjhn;
import java.lang.annotation.Annotation;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@wflxmlrfwp
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Laz/btonecajqb;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "iobyxmoadg", "yggfygwlhe", "jyumaefscl", "iwizpuwonk", "cqumvgiudr", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum btonecajqb {
    ANALOGUE,
    RELATED,
    PERSONAL_COMPOSITE,
    POPULAR;


    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f14740lereixgezr = ng.zoijcleaow.iobyxmoadg(wkgbmnqykc());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private static final gg.gtknphoqwx f14742zdlpuopuiu = draadjrbmk.iobyxmoadg(ojitshcjhn.PUBLICATION, new tg.iobyxmoadg() { // from class: az.dxjokdxxww
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return btonecajqb.lqeggnwhkg();
        }
    });

    /* JADX INFO: renamed from: az.btonecajqb$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ bk.zoijcleaow iobyxmoadg() {
            return (bk.zoijcleaow) btonecajqb.f14742zdlpuopuiu.getValue();
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
        return zynmafqrjb.iobyxmoadg("ru.myspar.core.data.request.catalog.RecommendationTypeDto", values(), new String[]{"recServiceRecomendations/analogue", "recServiceRecomendations/related", "recServiceRecomendations/personalComposite", "recServiceRecomendations/popular"}, new Annotation[][]{null, null, null, null}, null);
    }
}
