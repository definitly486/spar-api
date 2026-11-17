package b00;

import bk.wflxmlrfwp;
import dk.gxszxtbevo;
import ek.wkgbmnqykc;
import fk.dvvnrvtcbc;
import fk.wizcaqwiak;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: b00.zoijcleaow, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@wflxmlrfwp
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001a\u0010B%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001f"}, d2 = {"Lb00/zoijcleaow;", "", "", "seen0", "", "token", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "zoijcleaow", "(Lb00/zoijcleaow;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Ljava/lang/String;", "getToken$annotations", "()V", "Companion", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FetchSmsDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final String token;

    /* JADX INFO: renamed from: b00.zoijcleaow$zoijcleaow, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg.f14923iobyxmoadg;
        }

        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ FetchSmsDto(int i13, String str, dvvnrvtcbc dvvnrvtcbcVar) {
        if ((i13 & 1) == 0) {
            this.token = null;
        } else {
            this.token = str;
        }
    }

    public static final /* synthetic */ void zoijcleaow(FetchSmsDto self, wkgbmnqykc output, gxszxtbevo serialDesc) {
        if (!output.zdlpuopuiu(serialDesc, 0) && self.token == null) {
            return;
        }
        output.yggfygwlhe(serialDesc, 0, wizcaqwiak.f34245iobyxmoadg, self.token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FetchSmsDto) && zdlpuopuiu.eablkybsjg(this.token, ((FetchSmsDto) other).token);
    }

    public int hashCode() {
        String str = this.token;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public String toString() {
        return "FetchSmsDto(token=" + this.token + ")";
    }
}
