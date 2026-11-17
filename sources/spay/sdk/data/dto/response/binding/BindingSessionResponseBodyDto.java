package spay.sdk.data.dto.response.binding;

import kotlin.Metadata;
import kotlin.jvm.internal.zdlpuopuiu;
import npi.spay.pd;
import spay.sdk.data.dto.response.DataDtoInterface;
import spay.sdk.domain.model.response.SessionIdResponseBody;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lspay/sdk/data/dto/response/binding/BindingSessionResponseBodyDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/SessionIdResponseBody;", "sessionId", "", "(Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class BindingSessionResponseBodyDto implements DataDtoInterface<SessionIdResponseBody> {

    @ppxfxbqfkf("sessionId")
    private final String sessionId;

    public BindingSessionResponseBodyDto(String str) {
        this.sessionId = str;
    }

    public static /* synthetic */ BindingSessionResponseBodyDto copy$default(BindingSessionResponseBodyDto bindingSessionResponseBodyDto, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = bindingSessionResponseBodyDto.sessionId;
        }
        return bindingSessionResponseBodyDto.copy(str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    public final BindingSessionResponseBodyDto copy(String sessionId) {
        return new BindingSessionResponseBodyDto(sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BindingSessionResponseBodyDto) && zdlpuopuiu.eablkybsjg(this.sessionId, ((BindingSessionResponseBodyDto) other).sessionId);
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        String str = this.sessionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "BindingSessionResponseBodyDto(sessionId=" + this.sessionId + ")";
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    public SessionIdResponseBody toModel() {
        String str = this.sessionId;
        if (str != null) {
            return new SessionIdResponseBody(null, null, str, null, null, null, null, null, null, null, null, 2043, null);
        }
        throw new pd("sessionId");
    }
}
