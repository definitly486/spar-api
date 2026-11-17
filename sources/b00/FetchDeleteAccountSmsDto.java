package b00;

import bk.wflxmlrfwp;
import dk.gxszxtbevo;
import ek.wkgbmnqykc;
import fk.dvvnrvtcbc;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: b00.iobyxmoadg, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@wflxmlrfwp
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\u001b\u001fB/\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u0014R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u001c\u0012\u0004\b \u0010\u001e\u001a\u0004\b\u001f\u0010\u0014¨\u0006\""}, d2 = {"Lb00/iobyxmoadg;", "", "", "seen0", "", "dateEnd", "dateNow", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "ppxfxbqfkf", "(Lb00/iobyxmoadg;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Ljava/lang/String;", "getDateEnd$annotations", "()V", "zoijcleaow", "getDateNow$annotations", "Companion", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FetchDeleteAccountSmsDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dateEnd;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dateNow;

    /* JADX INFO: renamed from: b00.iobyxmoadg$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return C0247iobyxmoadg.f14918iobyxmoadg;
        }

        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ FetchDeleteAccountSmsDto(int i13, String str, String str2, dvvnrvtcbc dvvnrvtcbcVar) {
        if ((i13 & 1) == 0) {
            this.dateEnd = "";
        } else {
            this.dateEnd = str;
        }
        if ((i13 & 2) == 0) {
            this.dateNow = "";
        } else {
            this.dateNow = str2;
        }
    }

    public static final /* synthetic */ void ppxfxbqfkf(FetchDeleteAccountSmsDto self, wkgbmnqykc output, gxszxtbevo serialDesc) {
        if (output.zdlpuopuiu(serialDesc, 0) || !zdlpuopuiu.eablkybsjg(self.dateEnd, "")) {
            output.istkbnxepw(serialDesc, 0, self.dateEnd);
        }
        if (!output.zdlpuopuiu(serialDesc, 1) && zdlpuopuiu.eablkybsjg(self.dateNow, "")) {
            return;
        }
        output.istkbnxepw(serialDesc, 1, self.dateNow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FetchDeleteAccountSmsDto)) {
            return false;
        }
        FetchDeleteAccountSmsDto fetchDeleteAccountSmsDto = (FetchDeleteAccountSmsDto) other;
        return zdlpuopuiu.eablkybsjg(this.dateEnd, fetchDeleteAccountSmsDto.dateEnd) && zdlpuopuiu.eablkybsjg(this.dateNow, fetchDeleteAccountSmsDto.dateNow);
    }

    public int hashCode() {
        return (this.dateEnd.hashCode() * 31) + this.dateNow.hashCode();
    }

    /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
    public final String getDateEnd() {
        return this.dateEnd;
    }

    public String toString() {
        return "FetchDeleteAccountSmsDto(dateEnd=" + this.dateEnd + ", dateNow=" + this.dateNow + ")";
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final String getDateNow() {
        return this.dateNow;
    }
}
