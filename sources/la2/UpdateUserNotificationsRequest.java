package la2;

import bk.wflxmlrfwp;
import fk.dvvnrvtcbc;
import fk.iozdgvuglv;
import fk.iyctptxqzt;
import fk.sflfametgt;
import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: renamed from: la2.gxszxtbevo, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@wflxmlrfwp
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0002\u0013\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u0012\u0004\b$\u0010!\u001a\u0004\b#\u0010\u001fR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u001d\u0012\u0004\b'\u0010!\u001a\u0004\b&\u0010\u001f¨\u0006)"}, d2 = {"Lla2/gxszxtbevo;", "", "", "blockEmail", "blockSms", "blockPush", "<init>", "(ZZZ)V", "", "seen0", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "(IZZZLfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "iobyxmoadg", "(Lla2/gxszxtbevo;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getBlockEmail", "()Z", "getBlockEmail$annotations", "()V", "zoijcleaow", "getBlockSms", "getBlockSms$annotations", "ppxfxbqfkf", "getBlockPush", "getBlockPush$annotations", "Companion", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UpdateUserNotificationsRequest {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean blockEmail;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean blockPush;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean blockSms;

    /* JADX INFO: renamed from: la2.gxszxtbevo$iobyxmoadg */
    public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
        private static final dk.gxszxtbevo descriptor;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f62009iobyxmoadg;

        static {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            f62009iobyxmoadg = iobyxmoadgVar;
            iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.user.remote.dto.request.UpdateUserNotificationsRequest", iobyxmoadgVar, 3);
            iyctptxqztVar.ojitshcjhn("block_email", false);
            iyctptxqztVar.ojitshcjhn("block_sms", false);
            iyctptxqztVar.ojitshcjhn("block_push", false);
            descriptor = iyctptxqztVar;
        }

        private iobyxmoadg() {
        }

        @Override // fk.iozdgvuglv
        public final bk.zoijcleaow[] eablkybsjg() {
            fk.dxjokdxxww dxjokdxxwwVar = fk.dxjokdxxww.f34125iobyxmoadg;
            return new bk.zoijcleaow[]{dxjokdxxwwVar, dxjokdxxwwVar, dxjokdxxwwVar};
        }

        @Override // bk.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public final UpdateUserNotificationsRequest zoijcleaow(ek.eablkybsjg decoder) {
            boolean z13;
            boolean zOjitshcjhn;
            boolean z14;
            int i13;
            zdlpuopuiu.btonecajqb(decoder, "decoder");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            ek.ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
            if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                boolean zOjitshcjhn2 = ppxfxbqfkfVarPpxfxbqfkf.ojitshcjhn(gxszxtbevoVar, 0);
                boolean zOjitshcjhn3 = ppxfxbqfkfVarPpxfxbqfkf.ojitshcjhn(gxszxtbevoVar, 1);
                z13 = zOjitshcjhn2;
                zOjitshcjhn = ppxfxbqfkfVarPpxfxbqfkf.ojitshcjhn(gxszxtbevoVar, 2);
                z14 = zOjitshcjhn3;
                i13 = 7;
            } else {
                boolean z15 = true;
                boolean zOjitshcjhn4 = false;
                boolean zOjitshcjhn5 = false;
                boolean zOjitshcjhn6 = false;
                int i14 = 0;
                while (z15) {
                    int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                    if (iYadqdtsiqt == -1) {
                        z15 = false;
                    } else if (iYadqdtsiqt == 0) {
                        zOjitshcjhn4 = ppxfxbqfkfVarPpxfxbqfkf.ojitshcjhn(gxszxtbevoVar, 0);
                        i14 |= 1;
                    } else if (iYadqdtsiqt == 1) {
                        zOjitshcjhn6 = ppxfxbqfkfVarPpxfxbqfkf.ojitshcjhn(gxszxtbevoVar, 1);
                        i14 |= 2;
                    } else {
                        if (iYadqdtsiqt != 2) {
                            throw new UnknownFieldException(iYadqdtsiqt);
                        }
                        zOjitshcjhn5 = ppxfxbqfkfVarPpxfxbqfkf.ojitshcjhn(gxszxtbevoVar, 2);
                        i14 |= 4;
                    }
                }
                z13 = zOjitshcjhn4;
                zOjitshcjhn = zOjitshcjhn5;
                z14 = zOjitshcjhn6;
                i13 = i14;
            }
            ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            return new UpdateUserNotificationsRequest(i13, z13, z14, zOjitshcjhn, null);
        }

        @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
        public final dk.gxszxtbevo iobyxmoadg() {
            return descriptor;
        }

        @Override // bk.agtfadlqog
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public final void wkgbmnqykc(ek.gxszxtbevo encoder, UpdateUserNotificationsRequest value) {
            zdlpuopuiu.btonecajqb(encoder, "encoder");
            zdlpuopuiu.btonecajqb(value, "value");
            dk.gxszxtbevo gxszxtbevoVar = descriptor;
            ek.wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
            UpdateUserNotificationsRequest.iobyxmoadg(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
            wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
        }

        @Override // fk.iozdgvuglv
        public bk.zoijcleaow[] ppxfxbqfkf() {
            return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
        }
    }

    /* JADX INFO: renamed from: la2.gxszxtbevo$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return iobyxmoadg.f62009iobyxmoadg;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ UpdateUserNotificationsRequest(int i13, boolean z13, boolean z14, boolean z15, dvvnrvtcbc dvvnrvtcbcVar) {
        if (7 != (i13 & 7)) {
            sflfametgt.zoijcleaow(i13, 7, iobyxmoadg.f62009iobyxmoadg.iobyxmoadg());
        }
        this.blockEmail = z13;
        this.blockSms = z14;
        this.blockPush = z15;
    }

    public static final /* synthetic */ void iobyxmoadg(UpdateUserNotificationsRequest self, ek.wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        output.dxjokdxxww(serialDesc, 0, self.blockEmail);
        output.dxjokdxxww(serialDesc, 1, self.blockSms);
        output.dxjokdxxww(serialDesc, 2, self.blockPush);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateUserNotificationsRequest)) {
            return false;
        }
        UpdateUserNotificationsRequest updateUserNotificationsRequest = (UpdateUserNotificationsRequest) other;
        return this.blockEmail == updateUserNotificationsRequest.blockEmail && this.blockSms == updateUserNotificationsRequest.blockSms && this.blockPush == updateUserNotificationsRequest.blockPush;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.blockEmail) * 31) + Boolean.hashCode(this.blockSms)) * 31) + Boolean.hashCode(this.blockPush);
    }

    public String toString() {
        return "UpdateUserNotificationsRequest(blockEmail=" + this.blockEmail + ", blockSms=" + this.blockSms + ", blockPush=" + this.blockPush + ")";
    }

    public UpdateUserNotificationsRequest(boolean z13, boolean z14, boolean z15) {
        this.blockEmail = z13;
        this.blockSms = z14;
        this.blockPush = z15;
    }
}
