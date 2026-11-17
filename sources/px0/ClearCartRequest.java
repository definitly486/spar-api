package px0;

import fk.dvvnrvtcbc;
import fk.wizcaqwiak;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: px0.zoijcleaow, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@bk.wflxmlrfwp
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0011 B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014¨\u0006!"}, d2 = {"Lpx0/zoijcleaow;", "", "", "partnerCode", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "(ILjava/lang/String;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Lpx0/zoijcleaow;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPartnerCode", "getPartnerCode$annotations", "()V", "Companion", "zoijcleaow", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ClearCartRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerCode;

    /* JADX INFO: renamed from: px0.zoijcleaow$zoijcleaow, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg.f77457iobyxmoadg;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ ClearCartRequest(int i13, String str, dvvnrvtcbc dvvnrvtcbcVar) {
        if ((i13 & 1) == 0) {
            this.partnerCode = null;
        } else {
            this.partnerCode = str;
        }
    }

    public static final /* synthetic */ void iobyxmoadg(ClearCartRequest self, ek.wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        if (!output.zdlpuopuiu(serialDesc, 0) && self.partnerCode == null) {
            return;
        }
        output.yggfygwlhe(serialDesc, 0, wizcaqwiak.f34245iobyxmoadg, self.partnerCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClearCartRequest) && zdlpuopuiu.eablkybsjg(this.partnerCode, ((ClearCartRequest) other).partnerCode);
    }

    public int hashCode() {
        String str = this.partnerCode;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "ClearCartRequest(partnerCode=" + this.partnerCode + ")";
    }

    public ClearCartRequest(String str) {
        this.partnerCode = str;
    }
}
