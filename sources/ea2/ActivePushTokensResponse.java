package ea2;

import bk.wflxmlrfwp;
import bk.zoijcleaow;
import ek.wkgbmnqykc;
import fk.dvvnrvtcbc;
import fk.gxszxtbevo;
import fk.wizcaqwiak;
import hg.jyumaefscl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: ea2.iobyxmoadg, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@wflxmlrfwp
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\u001b\u001dB+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lea2/iobyxmoadg;", "", "", "seen0", "", "", "pushTokens", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "ppxfxbqfkf", "(Lea2/iobyxmoadg;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Ljava/util/List;", "zoijcleaow", "()Ljava/util/List;", "getPushTokens$annotations", "()V", "Companion", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ActivePushTokensResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final zoijcleaow[] f31035zoijcleaow = {new gxszxtbevo(wizcaqwiak.f34245iobyxmoadg)};

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final List pushTokens;

    /* JADX INFO: renamed from: ea2.iobyxmoadg$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final zoijcleaow serializer() {
            return C0655iobyxmoadg.f31037iobyxmoadg;
        }

        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ ActivePushTokensResponse(int i13, List list, dvvnrvtcbc dvvnrvtcbcVar) {
        if ((i13 & 1) == 0) {
            this.pushTokens = jyumaefscl.wflxmlrfwp();
        } else {
            this.pushTokens = list;
        }
    }

    public static final /* synthetic */ void ppxfxbqfkf(ActivePushTokensResponse self, wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        zoijcleaow[] zoijcleaowVarArr = f31035zoijcleaow;
        if (!output.zdlpuopuiu(serialDesc, 0) && zdlpuopuiu.eablkybsjg(self.pushTokens, jyumaefscl.wflxmlrfwp())) {
            return;
        }
        output.lqeggnwhkg(serialDesc, 0, zoijcleaowVarArr[0], self.pushTokens);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ActivePushTokensResponse) && zdlpuopuiu.eablkybsjg(this.pushTokens, ((ActivePushTokensResponse) other).pushTokens);
    }

    public int hashCode() {
        return this.pushTokens.hashCode();
    }

    public String toString() {
        return "ActivePushTokensResponse(pushTokens=" + this.pushTokens + ")";
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final List getPushTokens() {
        return this.pushTokens;
    }
}
