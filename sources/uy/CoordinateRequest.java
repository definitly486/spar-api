package uy;

import fk.dvvnrvtcbc;
import fk.iozdgvuglv;
import fk.iyctptxqzt;
import fk.sflfametgt;
import kotlin.Metadata;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: uy.gxszxtbevo, reason: from toString */
/* JADX INFO: loaded from: classes4.dex */
@bk.wflxmlrfwp
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002\u0012\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001f¨\u0006&"}, d2 = {"Luy/gxszxtbevo;", "", "", "lat", "lon", "<init>", "(DD)V", "", "seen0", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "(IDDLfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Luy/gxszxtbevo;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getLat", "()D", "getLat$annotations", "()V", "zoijcleaow", "getLon", "getLon$annotations", "Companion", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CoordinateRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final double lat;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final double lon;

    /* JADX INFO: renamed from: uy.gxszxtbevo$iobyxmoadg */
    public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
        private static final dk.gxszxtbevo descriptor;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f114681iobyxmoadg;

        static {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            f114681iobyxmoadg = iobyxmoadgVar;
            iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.core.data.request.CoordinateRequest", iobyxmoadgVar, 2);
            iyctptxqztVar.ojitshcjhn("lat", false);
            iyctptxqztVar.ojitshcjhn("lon", false);
            descriptor = iyctptxqztVar;
        }

        private iobyxmoadg() {
        }

        @Override // fk.iozdgvuglv
        public final bk.zoijcleaow[] eablkybsjg() {
            fk.yggfygwlhe yggfygwlheVar = fk.yggfygwlhe.f34253iobyxmoadg;
            return new bk.zoijcleaow[]{yggfygwlheVar, yggfygwlheVar};
        }

        @Override // bk.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public final CoordinateRequest zoijcleaow(ek.eablkybsjg decoder) {
            int i13;
            double dZdlpuopuiu;
            double d13;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(decoder, "decoder");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
            if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                double dZdlpuopuiu2 = ppxfxbqfkfVarPpxfxbqfkf.zdlpuopuiu(gxszxtbevoVar, 0);
                dZdlpuopuiu = ppxfxbqfkfVarPpxfxbqfkf.zdlpuopuiu(gxszxtbevoVar, 1);
                d13 = dZdlpuopuiu2;
                i13 = 3;
            } else {
                double dZdlpuopuiu3 = 0.0d;
                boolean z13 = true;
                int i14 = 0;
                double dZdlpuopuiu4 = 0.0d;
                while (z13) {
                    int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                    if (iYadqdtsiqt == -1) {
                        z13 = false;
                    } else if (iYadqdtsiqt == 0) {
                        dZdlpuopuiu4 = ppxfxbqfkfVarPpxfxbqfkf.zdlpuopuiu(gxszxtbevoVar, 0);
                        i14 |= 1;
                    } else {
                        if (iYadqdtsiqt != 1) {
                            throw new UnknownFieldException(iYadqdtsiqt);
                        }
                        dZdlpuopuiu3 = ppxfxbqfkfVarPpxfxbqfkf.zdlpuopuiu(gxszxtbevoVar, 1);
                        i14 |= 2;
                    }
                }
                i13 = i14;
                dZdlpuopuiu = dZdlpuopuiu3;
                d13 = dZdlpuopuiu4;
            }
            ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            return new CoordinateRequest(i13, d13, dZdlpuopuiu, null);
        }

        @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
        public final dk.gxszxtbevo iobyxmoadg() {
            return descriptor;
        }

        @Override // bk.agtfadlqog
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public final void wkgbmnqykc(ek.gxszxtbevo encoder, CoordinateRequest value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(encoder, "encoder");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            ek.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
            CoordinateRequest.iobyxmoadg(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
            wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
        }

        @Override // fk.iozdgvuglv
        public bk.zoijcleaow[] ppxfxbqfkf() {
            return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
        }
    }

    /* JADX INFO: renamed from: uy.gxszxtbevo$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg.f114681iobyxmoadg;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ CoordinateRequest(int i13, double d13, double d14, dvvnrvtcbc dvvnrvtcbcVar) {
        if (3 != (i13 & 3)) {
            sflfametgt.zoijcleaow(i13, 3, iobyxmoadg.f114681iobyxmoadg.iobyxmoadg());
        }
        this.lat = d13;
        this.lon = d14;
    }

    public static final /* synthetic */ void iobyxmoadg(CoordinateRequest self, ek.wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        output.ojitshcjhn(serialDesc, 0, self.lat);
        output.ojitshcjhn(serialDesc, 1, self.lon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoordinateRequest)) {
            return false;
        }
        CoordinateRequest coordinateRequest = (CoordinateRequest) other;
        return Double.compare(this.lat, coordinateRequest.lat) == 0 && Double.compare(this.lon, coordinateRequest.lon) == 0;
    }

    public int hashCode() {
        return (Double.hashCode(this.lat) * 31) + Double.hashCode(this.lon);
    }

    public String toString() {
        return "CoordinateRequest(lat=" + this.lat + ", lon=" + this.lon + ")";
    }

    public CoordinateRequest(double d13, double d14) {
        this.lat = d13;
        this.lon = d14;
    }
}
