package px0;

import fk.dvvnrvtcbc;
import fk.hcddaimhww;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: px0.agtfadlqog, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@bk.wflxmlrfwp
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u0010!B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lpx0/agtfadlqog;", "", "", "page", "<init>", "(Ljava/lang/Integer;)V", "seen0", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "(ILjava/lang/Integer;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Lpx0/agtfadlqog;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getPage", "()Ljava/lang/Integer;", "getPage$annotations", "()V", "Companion", "zoijcleaow", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PurchasesHistoryRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer page;

    /* JADX INFO: renamed from: px0.agtfadlqog$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg.f77404iobyxmoadg;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ PurchasesHistoryRequest(int i13, Integer num, dvvnrvtcbc dvvnrvtcbcVar) {
        if ((i13 & 1) == 0) {
            this.page = null;
        } else {
            this.page = num;
        }
    }

    public static final /* synthetic */ void iobyxmoadg(PurchasesHistoryRequest self, ek.wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        if (!output.zdlpuopuiu(serialDesc, 0) && self.page == null) {
            return;
        }
        output.yggfygwlhe(serialDesc, 0, hcddaimhww.f34142iobyxmoadg, self.page);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PurchasesHistoryRequest) && zdlpuopuiu.eablkybsjg(this.page, ((PurchasesHistoryRequest) other).page);
    }

    public int hashCode() {
        Integer num = this.page;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "PurchasesHistoryRequest(page=" + this.page + ")";
    }

    public PurchasesHistoryRequest(Integer num) {
        this.page = num;
    }
}
