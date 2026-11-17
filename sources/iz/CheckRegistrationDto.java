package iz;

import bk.wflxmlrfwp;
import dk.gxszxtbevo;
import ek.wkgbmnqykc;
import fk.dvvnrvtcbc;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: renamed from: iz.ppxfxbqfkf, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@wflxmlrfwp
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002\u001b\u001dB+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u0012\u0004\b!\u0010 \u001a\u0004\b\u001b\u0010\u001e¨\u0006#"}, d2 = {"Liz/ppxfxbqfkf;", "", "", "seen0", "", "isOnSite", "haveCard", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(IZZLfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "ppxfxbqfkf", "(Liz/ppxfxbqfkf;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Z", "zoijcleaow", "()Z", "isOnSite$annotations", "()V", "getHaveCard$annotations", "Companion", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CheckRegistrationDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOnSite;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean haveCard;

    /* JADX INFO: renamed from: iz.ppxfxbqfkf$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg.f50052iobyxmoadg;
        }

        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ CheckRegistrationDto(int i13, boolean z13, boolean z14, dvvnrvtcbc dvvnrvtcbcVar) {
        if ((i13 & 1) == 0) {
            this.isOnSite = false;
        } else {
            this.isOnSite = z13;
        }
        if ((i13 & 2) == 0) {
            this.haveCard = false;
        } else {
            this.haveCard = z14;
        }
    }

    public static final /* synthetic */ void ppxfxbqfkf(CheckRegistrationDto self, wkgbmnqykc output, gxszxtbevo serialDesc) {
        if (output.zdlpuopuiu(serialDesc, 0) || self.isOnSite) {
            output.dxjokdxxww(serialDesc, 0, self.isOnSite);
        }
        if (output.zdlpuopuiu(serialDesc, 1) || self.haveCard) {
            output.dxjokdxxww(serialDesc, 1, self.haveCard);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckRegistrationDto)) {
            return false;
        }
        CheckRegistrationDto checkRegistrationDto = (CheckRegistrationDto) other;
        return this.isOnSite == checkRegistrationDto.isOnSite && this.haveCard == checkRegistrationDto.haveCard;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isOnSite) * 31) + Boolean.hashCode(this.haveCard);
    }

    /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
    public final boolean getHaveCard() {
        return this.haveCard;
    }

    public String toString() {
        return "CheckRegistrationDto(isOnSite=" + this.isOnSite + ", haveCard=" + this.haveCard + ")";
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final boolean getIsOnSite() {
        return this.isOnSite;
    }
}
