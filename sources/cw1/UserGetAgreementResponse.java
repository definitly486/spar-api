package cw1;

import bk.wflxmlrfwp;
import fk.dvvnrvtcbc;
import fk.iozdgvuglv;
import fk.iyctptxqzt;
import fk.sflfametgt;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: cw1.ppxfxbqfkf, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@wflxmlrfwp
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0081\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001a\u0010B#\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001c¨\u0006 "}, d2 = {"Lcw1/ppxfxbqfkf;", "", "", "seen0", "", "isAgreementAccepted", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(IZLfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "zoijcleaow", "(Lcw1/ppxfxbqfkf;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Z", "()Z", "isAgreementAccepted$annotations", "()V", "Companion", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserGetAgreementResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAgreementAccepted;

    /* JADX INFO: renamed from: cw1.ppxfxbqfkf$iobyxmoadg */
    public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
        private static final dk.gxszxtbevo descriptor;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f26015iobyxmoadg;

        static {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            f26015iobyxmoadg = iobyxmoadgVar;
            iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.proloyalty.user.data.dto.user.response.UserGetAgreementResponse", iobyxmoadgVar, 1);
            iyctptxqztVar.ojitshcjhn("isAgreementAccepted", false);
            descriptor = iyctptxqztVar;
        }

        private iobyxmoadg() {
        }

        @Override // fk.iozdgvuglv
        public final bk.zoijcleaow[] eablkybsjg() {
            return new bk.zoijcleaow[]{fk.dxjokdxxww.f34125iobyxmoadg};
        }

        @Override // bk.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public final UserGetAgreementResponse zoijcleaow(ek.eablkybsjg decoder) {
            boolean zOjitshcjhn;
            zdlpuopuiu.btonecajqb(decoder, "decoder");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
            int i13 = 1;
            if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                zOjitshcjhn = ppxfxbqfkfVarPpxfxbqfkf.ojitshcjhn(gxszxtbevoVar, 0);
            } else {
                boolean z13 = true;
                zOjitshcjhn = false;
                int i14 = 0;
                while (z13) {
                    int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                    if (iYadqdtsiqt == -1) {
                        z13 = false;
                    } else {
                        if (iYadqdtsiqt != 0) {
                            throw new UnknownFieldException(iYadqdtsiqt);
                        }
                        zOjitshcjhn = ppxfxbqfkfVarPpxfxbqfkf.ojitshcjhn(gxszxtbevoVar, 0);
                        i14 = 1;
                    }
                }
                i13 = i14;
            }
            ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            return new UserGetAgreementResponse(i13, zOjitshcjhn, null);
        }

        @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
        public final dk.gxszxtbevo iobyxmoadg() {
            return descriptor;
        }

        @Override // bk.agtfadlqog
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public final void wkgbmnqykc(ek.gxszxtbevo encoder, UserGetAgreementResponse value) {
            zdlpuopuiu.btonecajqb(encoder, "encoder");
            zdlpuopuiu.btonecajqb(value, "value");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            ek.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
            UserGetAgreementResponse.zoijcleaow(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
            wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
        }

        @Override // fk.iozdgvuglv
        public bk.zoijcleaow[] ppxfxbqfkf() {
            return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
        }
    }

    /* JADX INFO: renamed from: cw1.ppxfxbqfkf$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg.f26015iobyxmoadg;
        }

        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ UserGetAgreementResponse(int i13, boolean z13, dvvnrvtcbc dvvnrvtcbcVar) {
        if (1 != (i13 & 1)) {
            sflfametgt.zoijcleaow(i13, 1, iobyxmoadg.f26015iobyxmoadg.iobyxmoadg());
        }
        this.isAgreementAccepted = z13;
    }

    public static final /* synthetic */ void zoijcleaow(UserGetAgreementResponse self, ek.wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        output.dxjokdxxww(serialDesc, 0, self.isAgreementAccepted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UserGetAgreementResponse) && this.isAgreementAccepted == ((UserGetAgreementResponse) other).isAgreementAccepted;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isAgreementAccepted);
    }

    /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
    public final boolean getIsAgreementAccepted() {
        return this.isAgreementAccepted;
    }

    public String toString() {
        return "UserGetAgreementResponse(isAgreementAccepted=" + this.isAgreementAccepted + ")";
    }
}
