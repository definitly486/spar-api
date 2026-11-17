package cw1;

import bk.wflxmlrfwp;
import fk.dvvnrvtcbc;
import fk.wizcaqwiak;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: cw1.iobyxmoadg, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@wflxmlrfwp
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001a\u0010B%\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcw1/iobyxmoadg;", "", "", "seen0", "", "surveyUrl", "Lfk/dvvnrvtcbc;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lfk/dvvnrvtcbc;)V", "self", "Lek/wkgbmnqykc;", "output", "Ldk/gxszxtbevo;", "serialDesc", "Lgg/wwaezpbzkn;", "zoijcleaow", "(Lcw1/iobyxmoadg;Lek/wkgbmnqykc;Ldk/gxszxtbevo;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "iobyxmoadg", "Ljava/lang/String;", "getSurveyUrl$annotations", "()V", "Companion", "user_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UploadUserSettingsResponse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name and from kotlin metadata and from toString */
    private final String surveyUrl;

    /* JADX INFO: renamed from: cw1.iobyxmoadg$zoijcleaow, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final bk.zoijcleaow serializer() {
            return C0459iobyxmoadg.f26003iobyxmoadg;
        }

        public /* synthetic */ Companion(gtknphoqwx gtknphoqwxVar) {
            this();
        }
    }

    public /* synthetic */ UploadUserSettingsResponse(int i13, String str, dvvnrvtcbc dvvnrvtcbcVar) {
        if ((i13 & 1) == 0) {
            this.surveyUrl = null;
        } else {
            this.surveyUrl = str;
        }
    }

    public static final /* synthetic */ void zoijcleaow(UploadUserSettingsResponse self, ek.wkgbmnqykc output, dk.gxszxtbevo serialDesc) {
        if (!output.zdlpuopuiu(serialDesc, 0) && self.surveyUrl == null) {
            return;
        }
        output.yggfygwlhe(serialDesc, 0, wizcaqwiak.f34245iobyxmoadg, self.surveyUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UploadUserSettingsResponse) && zdlpuopuiu.eablkybsjg(this.surveyUrl, ((UploadUserSettingsResponse) other).surveyUrl);
    }

    public int hashCode() {
        String str = this.surveyUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX INFO: renamed from: iobyxmoadg, reason: from getter */
    public final String getSurveyUrl() {
        return this.surveyUrl;
    }

    public String toString() {
        return "UploadUserSettingsResponse(surveyUrl=" + this.surveyUrl + ")";
    }
}
