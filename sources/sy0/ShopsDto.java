package sy0;

import bk.wflxmlrfwp;
import fk.dvvnrvtcbc;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: sy0.eablkybsjg, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@wflxmlrfwp
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002\u001e B5\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lsy0/eablkybsjg;", "", "", "seen0", "", "Lsy0/zoijcleaow;", "shops", "Lsy0/gxszxtbevo;", "shopsReferences", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Lsy0/gxszxtbevo;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "wkgbmnqykc", "(Lsy0/eablkybsjg;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Ljava/util/List;", "zoijcleaow", "()Ljava/util/List;", "getShops$annotations", "()V", "Lsy0/gxszxtbevo;", "ppxfxbqfkf", "()Lsy0/gxszxtbevo;", "getShopsReferences$annotations", "Companion", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ShopsDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final bk.zoijcleaow[] f108708ppxfxbqfkf = {new fk.gxszxtbevo(ShopDto.iobyxmoadg.f108742iobyxmoadg), null};

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final List shops;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final ShopsReferencesDto shopsReferences;

    /* JADX INFO: renamed from: sy0.eablkybsjg$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg.f108711iobyxmoadg;
        }

        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ ShopsDto(int i13, List list, ShopsReferencesDto gxszxtbevoVar, dvvnrvtcbc dvvnrvtcbcVar) {
        if ((i13 & 1) == 0) {
            this.shops = null;
        } else {
            this.shops = list;
        }
        if ((i13 & 2) == 0) {
            this.shopsReferences = null;
        } else {
            this.shopsReferences = gxszxtbevoVar;
        }
    }

    public static final /* synthetic */ void wkgbmnqykc(ShopsDto self, ek.wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        bk.zoijcleaow[] zoijcleaowVarArr = f108708ppxfxbqfkf;
        if (output.zdlpuopuiu(serialDesc, 0) || self.shops != null) {
            output.yggfygwlhe(serialDesc, 0, zoijcleaowVarArr[0], self.shops);
        }
        if (!output.zdlpuopuiu(serialDesc, 1) && self.shopsReferences == null) {
            return;
        }
        output.yggfygwlhe(serialDesc, 1, ShopsReferencesDto.iobyxmoadg.f108715iobyxmoadg, self.shopsReferences);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopsDto)) {
            return false;
        }
        ShopsDto shopsDto = (ShopsDto) other;
        return zdlpuopuiu.eablkybsjg(this.shops, shopsDto.shops) && zdlpuopuiu.eablkybsjg(this.shopsReferences, shopsDto.shopsReferences);
    }

    public int hashCode() {
        List list = this.shops;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ShopsReferencesDto gxszxtbevoVar = this.shopsReferences;
        return iHashCode + (gxszxtbevoVar != null ? gxszxtbevoVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: from getter */
    public final ShopsReferencesDto getShopsReferences() {
        return this.shopsReferences;
    }

    public String toString() {
        return "ShopsDto(shops=" + this.shops + ", shopsReferences=" + this.shopsReferences + ")";
    }

    /* JADX INFO: renamed from: zoijcleaow, reason: from getter */
    public final List getShops() {
        return this.shops;
    }
}
