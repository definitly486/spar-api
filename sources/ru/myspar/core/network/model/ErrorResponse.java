package ru.myspar.core.network.model;

import androidx.annotation.Keep;
import bk.wflxmlrfwp;
import bk.zoijcleaow;
import dk.gxszxtbevo;
import ek.eablkybsjg;
import ek.ppxfxbqfkf;
import ek.wkgbmnqykc;
import fk.dvvnrvtcbc;
import fk.iozdgvuglv;
import fk.iyctptxqzt;
import fk.wizcaqwiak;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes4.dex */
@wflxmlrfwp
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006*"}, d2 = {"Lru/myspar/core/network/model/ErrorResponse;", "", "", "message", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "write$Self$network_release", "(Lru/myspar/core/network/model/ErrorResponse;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lru/myspar/core/network/model/ErrorResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getMessage$annotations", "()V", "getCode", "getCode$annotations", "Companion", "iobyxmoadg", "zoijcleaow", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ErrorResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String code;
    private final String message;

    public /* synthetic */ class iobyxmoadg implements iozdgvuglv {
        private static final gxszxtbevo descriptor;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public static final iobyxmoadg f87560iobyxmoadg;

        static {
            iobyxmoadg iobyxmoadgVar = new iobyxmoadg();
            f87560iobyxmoadg = iobyxmoadgVar;
            iyctptxqzt iyctptxqztVar = new iyctptxqzt("ru.myspar.core.network.model.ErrorResponse", iobyxmoadgVar, 2);
            iyctptxqztVar.ojitshcjhn("message", true);
            iyctptxqztVar.ojitshcjhn("code", true);
            descriptor = iyctptxqztVar;
        }

        private iobyxmoadg() {
        }

        @Override // fk.iozdgvuglv
        public final zoijcleaow[] eablkybsjg() {
            wizcaqwiak wizcaqwiakVar = wizcaqwiak.f34245iobyxmoadg;
            return new zoijcleaow[]{ck.iobyxmoadg.yggfygwlhe(wizcaqwiakVar), ck.iobyxmoadg.yggfygwlhe(wizcaqwiakVar)};
        }

        @Override // bk.iobyxmoadg
        /* JADX INFO: renamed from: gxszxtbevo, reason: merged with bridge method [inline-methods] */
        public final ErrorResponse zoijcleaow(eablkybsjg decoder) {
            String str;
            int i13;
            String str2;
            zdlpuopuiu.btonecajqb(decoder, "decoder");
            gxszxtbevo gxszxtbevoVar = descriptor;
            ppxfxbqfkf ppxfxbqfkfVarPpxfxbqfkf = decoder.ppxfxbqfkf(gxszxtbevoVar);
            dvvnrvtcbc dvvnrvtcbcVar = null;
            if (ppxfxbqfkfVarPpxfxbqfkf.kcexrzcfyt()) {
                wizcaqwiak wizcaqwiakVar = wizcaqwiak.f34245iobyxmoadg;
                str2 = (String) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 0, wizcaqwiakVar, null);
                str = (String) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 1, wizcaqwiakVar, null);
                i13 = 3;
            } else {
                boolean z13 = true;
                int i14 = 0;
                str = null;
                String str3 = null;
                while (z13) {
                    int iYadqdtsiqt = ppxfxbqfkfVarPpxfxbqfkf.yadqdtsiqt(gxszxtbevoVar);
                    if (iYadqdtsiqt == -1) {
                        z13 = false;
                    } else if (iYadqdtsiqt == 0) {
                        str3 = (String) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 0, wizcaqwiak.f34245iobyxmoadg, str3);
                        i14 |= 1;
                    } else {
                        if (iYadqdtsiqt != 1) {
                            throw new UnknownFieldException(iYadqdtsiqt);
                        }
                        str = (String) ppxfxbqfkfVarPpxfxbqfkf.iozdgvuglv(gxszxtbevoVar, 1, wizcaqwiak.f34245iobyxmoadg, str);
                        i14 |= 2;
                    }
                }
                i13 = i14;
                str2 = str3;
            }
            ppxfxbqfkfVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
            return new ErrorResponse(i13, str2, str, dvvnrvtcbcVar);
        }

        @Override // bk.zoijcleaow, bk.agtfadlqog, bk.iobyxmoadg
        public final gxszxtbevo iobyxmoadg() {
            return descriptor;
        }

        @Override // bk.agtfadlqog
        /* JADX INFO: renamed from: lqeggnwhkg, reason: merged with bridge method [inline-methods] */
        public final void wkgbmnqykc(ek.gxszxtbevo encoder, ErrorResponse value) {
            zdlpuopuiu.btonecajqb(encoder, "encoder");
            zdlpuopuiu.btonecajqb(value, "value");
            gxszxtbevo gxszxtbevoVar = descriptor;
            wkgbmnqykc wkgbmnqykcVarPpxfxbqfkf = encoder.ppxfxbqfkf(gxszxtbevoVar);
            ErrorResponse.write$Self$network_release(value, wkgbmnqykcVarPpxfxbqfkf, gxszxtbevoVar);
            wkgbmnqykcVarPpxfxbqfkf.zoijcleaow(gxszxtbevoVar);
        }

        @Override // fk.iozdgvuglv
        public zoijcleaow[] ppxfxbqfkf() {
            return iozdgvuglv.iobyxmoadg.iobyxmoadg(this);
        }
    }

    /* JADX INFO: renamed from: ru.myspar.core.network.model.ErrorResponse$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final zoijcleaow serializer() {
            return iobyxmoadg.f87560iobyxmoadg;
        }

        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorResponse() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (gtknphoqwx) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, String str, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = errorResponse.message;
        }
        if ((i13 & 2) != 0) {
            str2 = errorResponse.code;
        }
        return errorResponse.copy(str, str2);
    }

    public static /* synthetic */ void getCode$annotations() {
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    public static final /* synthetic */ void write$Self$network_release(ErrorResponse self, wkgbmnqykc output, gxszxtbevo serialDesc) {
        if (output.zdlpuopuiu(serialDesc, 0) || self.message != null) {
            output.yggfygwlhe(serialDesc, 0, wizcaqwiak.f34245iobyxmoadg, self.message);
        }
        if (!output.zdlpuopuiu(serialDesc, 1) && self.code == null) {
            return;
        }
        output.yggfygwlhe(serialDesc, 1, wizcaqwiak.f34245iobyxmoadg, self.code);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    public final ErrorResponse copy(String message, String code) {
        return new ErrorResponse(message, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) other;
        return zdlpuopuiu.eablkybsjg(this.message, errorResponse.message) && zdlpuopuiu.eablkybsjg(this.code, errorResponse.code);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ErrorResponse(message=" + this.message + ", code=" + this.code + ")";
    }

    public /* synthetic */ ErrorResponse(int i13, String str, String str2, dvvnrvtcbc dvvnrvtcbcVar) {
        if ((i13 & 1) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
        if ((i13 & 2) == 0) {
            this.code = null;
        } else {
            this.code = str2;
        }
    }

    public ErrorResponse(String str, String str2) {
        this.message = str;
        this.code = str2;
    }

    public /* synthetic */ ErrorResponse(String str, String str2, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
    }
}
