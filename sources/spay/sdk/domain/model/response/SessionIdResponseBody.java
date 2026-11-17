package spay.sdk.domain.model.response;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kk.xg;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0082\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\b\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0015\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006/"}, d2 = {"Lspay/sdk/domain/model/response/SessionIdResponseBody;", "", "deeplink", "", "state", "sessionId", "clientId", "nonce", "isBnplEnabled", "", "codeChallengeMethod", "codeChallenge", "scope", "refreshTokenIsActive", "clientIdPhone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getClientId", "()Ljava/lang/String;", "getClientIdPhone", "getCodeChallenge", "getCodeChallengeMethod", "getDeeplink", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNonce", "getRefreshTokenIsActive", "getScope", "getSessionId", "getState", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lspay/sdk/domain/model/response/SessionIdResponseBody;", "equals", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SessionIdResponseBody {
    private final String clientId;
    private final String clientIdPhone;
    private final String codeChallenge;
    private final String codeChallengeMethod;
    private final String deeplink;
    private final Boolean isBnplEnabled;
    private final String nonce;
    private final Boolean refreshTokenIsActive;
    private final String scope;
    private final String sessionId;
    private final String state;

    public SessionIdResponseBody() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getRefreshTokenIsActive() {
        return this.refreshTokenIsActive;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getClientIdPhone() {
        return this.clientIdPhone;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getClientId() {
        return this.clientId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsBnplEnabled() {
        return this.isBnplEnabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    public final SessionIdResponseBody copy(String deeplink, String state, String sessionId, String clientId, String nonce, Boolean isBnplEnabled, String codeChallengeMethod, String codeChallenge, String scope, Boolean refreshTokenIsActive, String clientIdPhone) {
        zdlpuopuiu.btonecajqb(deeplink, "deeplink");
        zdlpuopuiu.btonecajqb(state, "state");
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        zdlpuopuiu.btonecajqb(clientId, "clientId");
        zdlpuopuiu.btonecajqb(nonce, "nonce");
        zdlpuopuiu.btonecajqb(codeChallengeMethod, "codeChallengeMethod");
        zdlpuopuiu.btonecajqb(codeChallenge, "codeChallenge");
        zdlpuopuiu.btonecajqb(scope, "scope");
        return new SessionIdResponseBody(deeplink, state, sessionId, clientId, nonce, isBnplEnabled, codeChallengeMethod, codeChallenge, scope, refreshTokenIsActive, clientIdPhone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionIdResponseBody)) {
            return false;
        }
        SessionIdResponseBody sessionIdResponseBody = (SessionIdResponseBody) other;
        return zdlpuopuiu.eablkybsjg(this.deeplink, sessionIdResponseBody.deeplink) && zdlpuopuiu.eablkybsjg(this.state, sessionIdResponseBody.state) && zdlpuopuiu.eablkybsjg(this.sessionId, sessionIdResponseBody.sessionId) && zdlpuopuiu.eablkybsjg(this.clientId, sessionIdResponseBody.clientId) && zdlpuopuiu.eablkybsjg(this.nonce, sessionIdResponseBody.nonce) && zdlpuopuiu.eablkybsjg(this.isBnplEnabled, sessionIdResponseBody.isBnplEnabled) && zdlpuopuiu.eablkybsjg(this.codeChallengeMethod, sessionIdResponseBody.codeChallengeMethod) && zdlpuopuiu.eablkybsjg(this.codeChallenge, sessionIdResponseBody.codeChallenge) && zdlpuopuiu.eablkybsjg(this.scope, sessionIdResponseBody.scope) && zdlpuopuiu.eablkybsjg(this.refreshTokenIsActive, sessionIdResponseBody.refreshTokenIsActive) && zdlpuopuiu.eablkybsjg(this.clientIdPhone, sessionIdResponseBody.clientIdPhone);
    }

    public final String getClientId() {
        return this.clientId;
    }

    public final String getClientIdPhone() {
        return this.clientIdPhone;
    }

    public final String getCodeChallenge() {
        return this.codeChallenge;
    }

    public final String getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final Boolean getRefreshTokenIsActive() {
        return this.refreshTokenIsActive;
    }

    public final String getScope() {
        return this.scope;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        int iIobyxmoadg = xg.iobyxmoadg(this.nonce, xg.iobyxmoadg(this.clientId, xg.iobyxmoadg(this.sessionId, xg.iobyxmoadg(this.state, this.deeplink.hashCode() * 31, 31), 31), 31), 31);
        Boolean bool = this.isBnplEnabled;
        int iIobyxmoadg2 = xg.iobyxmoadg(this.scope, xg.iobyxmoadg(this.codeChallenge, xg.iobyxmoadg(this.codeChallengeMethod, (iIobyxmoadg + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31), 31);
        Boolean bool2 = this.refreshTokenIsActive;
        int iHashCode = (iIobyxmoadg2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.clientIdPhone;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final Boolean isBnplEnabled() {
        return this.isBnplEnabled;
    }

    public String toString() {
        return "SessionIdResponseBody(deeplink=" + this.deeplink + ", state=" + this.state + ", sessionId=" + this.sessionId + ", clientId=" + this.clientId + ", nonce=" + this.nonce + ", isBnplEnabled=" + this.isBnplEnabled + ", codeChallengeMethod=" + this.codeChallengeMethod + ", codeChallenge=" + this.codeChallenge + ", scope=" + this.scope + ", refreshTokenIsActive=" + this.refreshTokenIsActive + ", clientIdPhone=" + this.clientIdPhone + ")";
    }

    public SessionIdResponseBody(String deeplink, String state, String sessionId, String clientId, String nonce, Boolean bool, String codeChallengeMethod, String codeChallenge, String scope, Boolean bool2, String str) {
        zdlpuopuiu.btonecajqb(deeplink, "deeplink");
        zdlpuopuiu.btonecajqb(state, "state");
        zdlpuopuiu.btonecajqb(sessionId, "sessionId");
        zdlpuopuiu.btonecajqb(clientId, "clientId");
        zdlpuopuiu.btonecajqb(nonce, "nonce");
        zdlpuopuiu.btonecajqb(codeChallengeMethod, "codeChallengeMethod");
        zdlpuopuiu.btonecajqb(codeChallenge, "codeChallenge");
        zdlpuopuiu.btonecajqb(scope, "scope");
        this.deeplink = deeplink;
        this.state = state;
        this.sessionId = sessionId;
        this.clientId = clientId;
        this.nonce = nonce;
        this.isBnplEnabled = bool;
        this.codeChallengeMethod = codeChallengeMethod;
        this.codeChallenge = codeChallenge;
        this.scope = scope;
        this.refreshTokenIsActive = bool2;
        this.clientIdPhone = str;
    }

    public /* synthetic */ SessionIdResponseBody(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, Boolean bool2, String str9, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? "-1" : str, (i13 & 2) != 0 ? "-1" : str2, (i13 & 4) != 0 ? "-1" : str3, (i13 & 8) != 0 ? "-1" : str4, (i13 & 16) != 0 ? "-1" : str5, (i13 & 32) != 0 ? null : bool, (i13 & 64) != 0 ? "-1" : str6, (i13 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? "-1" : str7, (i13 & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0 ? str8 : "-1", (i13 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : bool2, (i13 & UserVerificationMethods.USER_VERIFY_ALL) == 0 ? str9 : null);
    }
}
