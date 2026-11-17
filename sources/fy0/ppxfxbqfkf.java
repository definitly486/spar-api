package fy0;

import bk.wflxmlrfwp;
import gg.draadjrbmk;
import gg.gtknphoqwx;
import gg.ojitshcjhn;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@wflxmlrfwp(with = wkgbmnqykc.class)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lfy0/ppxfxbqfkf;", "", "", "json", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "zdlpuopuiu", "Ljava/lang/String;", "btonecajqb", "()Ljava/lang/String;", "Companion", "iobyxmoadg", "jyumaefscl", "iwizpuwonk", "cqumvgiudr", "esjtqupxsv", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum ppxfxbqfkf {
    BASE("base"),
    SPAR_WINE("sparwine"),
    EVROPOLIS("monopoly"),
    TRENDIS("trendis");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata */
    private final String json;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f35334pmvmpeiblj = ng.zoijcleaow.iobyxmoadg(wkgbmnqykc());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final gtknphoqwx f35335yggfygwlhe = draadjrbmk.iobyxmoadg(ojitshcjhn.PUBLICATION, new tg.iobyxmoadg() { // from class: fy0.zoijcleaow
        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return ppxfxbqfkf.lqeggnwhkg();
        }
    });

    /* JADX INFO: renamed from: fy0.ppxfxbqfkf$iobyxmoadg, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        private final /* synthetic */ bk.zoijcleaow iobyxmoadg() {
            return (bk.zoijcleaow) ppxfxbqfkf.f35335yggfygwlhe.getValue();
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    ppxfxbqfkf(String str) {
        this.json = str;
    }

    public static ng.iobyxmoadg dxjokdxxww() {
        return f35334pmvmpeiblj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ bk.zoijcleaow lqeggnwhkg() {
        return new wkgbmnqykc();
    }

    /* JADX INFO: renamed from: btonecajqb, reason: from getter */
    public final String getJson() {
        return this.json;
    }
}
