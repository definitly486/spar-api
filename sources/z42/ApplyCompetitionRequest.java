package z42;

import bk.wflxmlrfwp;
import fk.dvvnrvtcbc;
import fk.iozdgvuglv;
import fk.iyctptxqzt;
import fk.sflfametgt;
import fk.wizcaqwiak;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: z42.iobyxmoadg, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@wflxmlrfwp
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\u0012 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H×\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0015R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u001c\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lz42/iobyxmoadg;", "", "", "bannerId", "blockId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Lz42/iobyxmoadg;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBannerId", "getBannerId$annotations", "()V", "zoijcleaow", "getBlockId", "getBlockId$annotations", "Companion", "impl_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ApplyCompetitionRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final String bannerId;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final String blockId;

    /* JADX INFO: renamed from: z42.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    public /* synthetic */ class C3274iobyxmoadg implements iozdgvuglv {
        private static final dk.gxszxtbevo descriptor;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final C3274iobyxmoadg f129056iobyxmoadg;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public static final int f129057zoijcleaow;

        static {
            C3274iobyxmoadg c3274iobyxmoadg = new C3274iobyxmoadg();
            f129056iobyxmoadg = c3274iobyxmoadg;
            f129057zoijcleaow = 8;
            iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.specialbanner.impl.data.remote.model.ApplyCompetitionRequest", c3274iobyxmoadg, 2);
            iyctptxqztVar.ojitshcjhn("banner_id", false);
            iyctptxqztVar.ojitshcjhn("block_id", false);
            descriptor = iyctptxqztVar;
        }

        private C3274iobyxmoadg() {
        }

        @Override // fk.iozdgvuglv
        public final bk.zoijcleaow[] eablkybsjg() {
            wizcaqwiak wizcaqwiakVar = wizcaqwiak.f34245iobyxmoadg;
            return new bk.zoijcleaow[]{wizcaqwiakVar, wizcaqwiakVar};
        }

        @Override // bk.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public final ApplyCompetitionRequest zoijcleaow(ek.eablkybsjg decoder) {
            String strVdvldrhtss;
            String strVdvldrhtss2;
            int i13;
            zdlpuopuiu.btonecajqb(decoder, "decoder");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
            dvvnrvtcbc dvvnrvtcbcVar = null;
            if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                strVdvldrhtss = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 0);
                strVdvldrhtss2 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                i13 = 3;
            } else {
                boolean z13 = true;
                int i14 = 0;
                strVdvldrhtss = null;
                String strVdvldrhtss3 = null;
                while (z13) {
                    int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                    if (iYadqdtsiqt == -1) {
                        z13 = false;
                    } else if (iYadqdtsiqt == 0) {
                        strVdvldrhtss = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 0);
                        i14 |= 1;
                    } else {
                        if (iYadqdtsiqt != 1) {
                            throw new UnknownFieldException(iYadqdtsiqt);
                        }
                        strVdvldrhtss3 = ppxfxbqfkfVarPpxfxbqfkf.vdvldrhtss(gxszxtbevoVar, 1);
                        i14 |= 2;
                    }
                }
                strVdvldrhtss2 = strVdvldrhtss3;
                i13 = i14;
            }
            ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            return new ApplyCompetitionRequest(i13, strVdvldrhtss, strVdvldrhtss2, dvvnrvtcbcVar);
        }

        @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
        public final dk.gxszxtbevo iobyxmoadg() {
            return descriptor;
        }

        @Override // bk.agtfadlqog
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public final void wkgbmnqykc(ek.gxszxtbevo encoder, ApplyCompetitionRequest value) {
            zdlpuopuiu.btonecajqb(encoder, "encoder");
            zdlpuopuiu.btonecajqb(value, "value");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            ek.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
            ApplyCompetitionRequest.iobyxmoadg(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
            wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
        }

        @Override // fk.iozdgvuglv
        public bk.zoijcleaow[] ppxfxbqfkf() {
            return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
        }
    }

    /* JADX INFO: renamed from: z42.iobyxmoadg$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return C3274iobyxmoadg.f129056iobyxmoadg;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ ApplyCompetitionRequest(int i13, String str, String str2, dvvnrvtcbc dvvnrvtcbcVar) {
        if (3 != (i13 & 3)) {
            sflfametgt.zoijcleaow(i13, 3, C3274iobyxmoadg.f129056iobyxmoadg.iobyxmoadg());
        }
        this.bannerId = str;
        this.blockId = str2;
    }

    public static final /* synthetic */ void iobyxmoadg(ApplyCompetitionRequest self, ek.wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        output.istkbnxepw(serialDesc, 0, self.bannerId);
        output.istkbnxepw(serialDesc, 1, self.blockId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplyCompetitionRequest)) {
            return false;
        }
        ApplyCompetitionRequest applyCompetitionRequest = (ApplyCompetitionRequest) other;
        return zdlpuopuiu.eablkybsjg(this.bannerId, applyCompetitionRequest.bannerId) && zdlpuopuiu.eablkybsjg(this.blockId, applyCompetitionRequest.blockId);
    }

    public int hashCode() {
        return (this.bannerId.hashCode() * 31) + this.blockId.hashCode();
    }

    public String toString() {
        return "ApplyCompetitionRequest(bannerId=" + this.bannerId + ", blockId=" + this.blockId + ")";
    }

    public ApplyCompetitionRequest(String bannerId, String blockId) {
        zdlpuopuiu.btonecajqb(bannerId, "bannerId");
        zdlpuopuiu.btonecajqb(blockId, "blockId");
        this.bannerId = bannerId;
        this.blockId = blockId;
    }
}
