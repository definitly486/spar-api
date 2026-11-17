package la2;

import bk.wflxmlrfwp;
import fk.dvvnrvtcbc;
import fk.wizcaqwiak;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: la2.btonecajqb, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@wflxmlrfwp
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002\u0012 B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lla2/btonecajqb;", "", "", "product", "action", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Lla2/btonecajqb;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProduct", "getProduct$annotations", "()V", "zoijcleaow", "getAction", "getAction$annotations", "Companion", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserChangeFavoriteRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final String product;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final String action;

    /* JADX INFO: renamed from: la2.btonecajqb$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg.f62005iobyxmoadg;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ UserChangeFavoriteRequest(int i13, String str, String str2, dvvnrvtcbc dvvnrvtcbcVar) {
        if ((i13 & 1) == 0) {
            this.product = null;
        } else {
            this.product = str;
        }
        if ((i13 & 2) == 0) {
            this.action = null;
        } else {
            this.action = str2;
        }
    }

    public static final /* synthetic */ void iobyxmoadg(UserChangeFavoriteRequest self, ek.wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        if (output.zdlpuopuiu(serialDesc, 0) || self.product != null) {
            output.yggfygwlhe(serialDesc, 0, wizcaqwiak.f34245iobyxmoadg, self.product);
        }
        if (!output.zdlpuopuiu(serialDesc, 1) && self.action == null) {
            return;
        }
        output.yggfygwlhe(serialDesc, 1, wizcaqwiak.f34245iobyxmoadg, self.action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserChangeFavoriteRequest)) {
            return false;
        }
        UserChangeFavoriteRequest userChangeFavoriteRequest = (UserChangeFavoriteRequest) other;
        return zdlpuopuiu.eablkybsjg(this.product, userChangeFavoriteRequest.product) && zdlpuopuiu.eablkybsjg(this.action, userChangeFavoriteRequest.action);
    }

    public int hashCode() {
        String str = this.product;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.action;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "UserChangeFavoriteRequest(product=" + this.product + ", action=" + this.action + ")";
    }

    public UserChangeFavoriteRequest(String str, String str2) {
        this.product = str;
        this.action = str2;
    }
}
