package bw1;

import bk.wflxmlrfwp;
import fk.dvvnrvtcbc;
import fk.iozdgvuglv;
import fk.iyctptxqzt;
import fk.sflfametgt;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: bw1.dxjokdxxww, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@wflxmlrfwp
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002\u0011\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lbw1/dxjokdxxww;", "", "Lbw1/btonecajqb;", "device", "<init>", "(Lbw1/btonecajqb;)V", "", "seen0", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "(ILbw1/btonecajqb;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Lbw1/dxjokdxxww;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lbw1/btonecajqb;", "getDevice", "()Lbw1/btonecajqb;", "getDevice$annotations", "()V", "Companion", "zoijcleaow", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserUploadDeviceInfoRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final UserUploadPushTokenRequest device;

    /* JADX INFO: renamed from: bw1.dxjokdxxww$iobyxmoadg */
    public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
        private static final dk.gxszxtbevo descriptor;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f17189iobyxmoadg;

        static {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            f17189iobyxmoadg = iobyxmoadgVar;
            iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.proloyalty.user.data.dto.user.request.UserUploadDeviceInfoRequest", iobyxmoadgVar, 1);
            iyctptxqztVar.ojitshcjhn("device", false);
            descriptor = iyctptxqztVar;
        }

        private iobyxmoadg() {
        }

        @Override // fk.iozdgvuglv
        public final bk.zoijcleaow[] eablkybsjg() {
            return new bk.zoijcleaow[]{UserUploadPushTokenRequest.iobyxmoadg.f17187iobyxmoadg};
        }

        @Override // bk.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public final UserUploadDeviceInfoRequest zoijcleaow(ek.eablkybsjg decoder) {
            UserUploadPushTokenRequest btonecajqbVar;
            zdlpuopuiu.btonecajqb(decoder, "decoder");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
            int i13 = 1;
            dvvnrvtcbc dvvnrvtcbcVar = null;
            if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                btonecajqbVar = (UserUploadPushTokenRequest) ppxfxbqfkfVarPpxfxbqfkf.lereixgezr(gxszxtbevoVar, 0, UserUploadPushTokenRequest.iobyxmoadg.f17187iobyxmoadg, null);
            } else {
                boolean z13 = true;
                int i14 = 0;
                btonecajqbVar = null;
                while (z13) {
                    int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                    if (iYadqdtsiqt == -1) {
                        z13 = false;
                    } else {
                        if (iYadqdtsiqt != 0) {
                            throw new UnknownFieldException(iYadqdtsiqt);
                        }
                        btonecajqbVar = (UserUploadPushTokenRequest) ppxfxbqfkfVarPpxfxbqfkf.lereixgezr(gxszxtbevoVar, 0, UserUploadPushTokenRequest.iobyxmoadg.f17187iobyxmoadg, btonecajqbVar);
                        i14 = 1;
                    }
                }
                i13 = i14;
            }
            ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            return new UserUploadDeviceInfoRequest(i13, btonecajqbVar, dvvnrvtcbcVar);
        }

        @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
        public final dk.gxszxtbevo iobyxmoadg() {
            return descriptor;
        }

        @Override // bk.agtfadlqog
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public final void wkgbmnqykc(ek.gxszxtbevo encoder, UserUploadDeviceInfoRequest value) {
            zdlpuopuiu.btonecajqb(encoder, "encoder");
            zdlpuopuiu.btonecajqb(value, "value");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            ek.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
            UserUploadDeviceInfoRequest.iobyxmoadg(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
            wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
        }

        @Override // fk.iozdgvuglv
        public bk.zoijcleaow[] ppxfxbqfkf() {
            return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
        }
    }

    /* JADX INFO: renamed from: bw1.dxjokdxxww$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg.f17189iobyxmoadg;
        }

        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ UserUploadDeviceInfoRequest(int i13, UserUploadPushTokenRequest btonecajqbVar, dvvnrvtcbc dvvnrvtcbcVar) {
        if (1 != (i13 & 1)) {
            sflfametgt.zoijcleaow(i13, 1, iobyxmoadg.f17189iobyxmoadg.iobyxmoadg());
        }
        this.device = btonecajqbVar;
    }

    public static final /* synthetic */ void iobyxmoadg(UserUploadDeviceInfoRequest self, ek.wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        output.lqeggnwhkg(serialDesc, 0, UserUploadPushTokenRequest.iobyxmoadg.f17187iobyxmoadg, self.device);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UserUploadDeviceInfoRequest) && zdlpuopuiu.eablkybsjg(this.device, ((UserUploadDeviceInfoRequest) other).device);
    }

    public int hashCode() {
        return this.device.hashCode();
    }

    public String toString() {
        return "UserUploadDeviceInfoRequest(device=" + this.device + ")";
    }

    public UserUploadDeviceInfoRequest(UserUploadPushTokenRequest device) {
        zdlpuopuiu.btonecajqb(device, "device");
        this.device = device;
    }
}
