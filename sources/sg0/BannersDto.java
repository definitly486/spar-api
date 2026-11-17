package sg0;

import fk.dvvnrvtcbc;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: sg0.wkgbmnqykc, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@bk.wflxmlrfwp
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002\u001c\u001eB+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lsg0/wkgbmnqykc;", "", "", "seen0", "", "Lsg0/ppxfxbqfkf;", "bannerGroups", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "ppxfxbqfkf", "(Lsg0/wkgbmnqykc;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Ljava/util/List;", "zoijcleaow", "()Ljava/util/List;", "getBannerGroups$annotations", "()V", "Companion", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BannersDto {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final List bannerGroups;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public static final int f106468zoijcleaow = 8;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final bk.zoijcleaow[] f106467ppxfxbqfkf = {new fk.gxszxtbevo(BannerGroupDto.iobyxmoadg.f106461iobyxmoadg)};

    /* JADX INFO: renamed from: sg0.wkgbmnqykc$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg.f106470iobyxmoadg;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ BannersDto(int i13, List list, dvvnrvtcbc dvvnrvtcbcVar) {
        if ((i13 & 1) == 0) {
            this.bannerGroups = null;
        } else {
            this.bannerGroups = list;
        }
    }

    public static final /* synthetic */ void ppxfxbqfkf(BannersDto self, ek.wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        bk.zoijcleaow[] zoijcleaowVarArr = f106467ppxfxbqfkf;
        if (!output.zdlpuopuiu(serialDesc, 0) && self.bannerGroups == null) {
            return;
        }
        output.yggfygwlhe(serialDesc, 0, zoijcleaowVarArr[0], self.bannerGroups);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BannersDto) && zdlpuopuiu.eablkybsjg(this.bannerGroups, ((BannersDto) other).bannerGroups);
    }

    public int hashCode() {
        List list = this.bannerGroups;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "BannersDto(bannerGroups=" + this.bannerGroups + ")";
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final List getBannerGroups() {
        return this.bannerGroups;
    }
}
