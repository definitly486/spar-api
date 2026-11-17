package j40;

import java.util.Iterator;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import ng.zoijcleaow;

/* JADX INFO: loaded from: classes4.dex */
public enum iobyxmoadg {
    BITRIX_OLD("old"),
    BITRIX_NEW("new");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final String f50685zdlpuopuiu;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final /* synthetic */ ng.iobyxmoadg f50681esjtqupxsv = zoijcleaow.iobyxmoadg(iobyxmoadg());

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final C1089iobyxmoadg f50684yggfygwlhe = new C1089iobyxmoadg(null);

    /* JADX INFO: renamed from: j40.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public static final class C1089iobyxmoadg {
        public /* synthetic */ C1089iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final iobyxmoadg iobyxmoadg(String str) {
            Object next;
            Iterator<E> it = iobyxmoadg.wkgbmnqykc().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!zdlpuopuiu.eablkybsjg(((iobyxmoadg) next).lqeggnwhkg(), str));
            iobyxmoadg iobyxmoadgVar = (iobyxmoadg) next;
            return iobyxmoadgVar == null ? iobyxmoadg.BITRIX_NEW : iobyxmoadgVar;
        }

        private C1089iobyxmoadg() {
        }
    }

    iobyxmoadg(String str) {
        this.f50685zdlpuopuiu = str;
    }

    public static ng.iobyxmoadg wkgbmnqykc() {
        return f50681esjtqupxsv;
    }

    public final String lqeggnwhkg() {
        return this.f50685zdlpuopuiu;
    }
}
