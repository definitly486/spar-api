package spay.seamlessAuth.core.data.network.request;

import com.google.android.gms.common.Scopes;
import hg.jyumaefscl;
import java.util.List;
import kk.xg;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;
import yd.ppxfxbqfkf;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lspay/seamlessAuth/core/data/network/request/ExchangeTokenRequest;", "", "subjectToken", "", "resource", "resourceClientId", "subjectTokenType", "grantType", "scope", "", "Lspay/seamlessAuth/core/data/network/request/ScopeItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getGrantType", "()Ljava/lang/String;", "getResource", "getResourceClientId", "getScope", "()Ljava/util/List;", "getSubjectToken", "getSubjectTokenType", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ExchangeTokenRequest {

    @ppxfxbqfkf("grant_type")
    private final String grantType;

    @ppxfxbqfkf("resource")
    private final String resource;

    @ppxfxbqfkf("resource_client_id")
    private final String resourceClientId;

    @ppxfxbqfkf("scope")
    private final List<ScopeItem> scope;

    @ppxfxbqfkf("subject_token")
    private final String subjectToken;

    @ppxfxbqfkf("subject_token_type")
    private final String subjectTokenType;

    public ExchangeTokenRequest(String subjectToken, String resource, String resourceClientId, String subjectTokenType, String grantType, List<ScopeItem> scope) {
        zdlpuopuiu.btonecajqb(subjectToken, "subjectToken");
        zdlpuopuiu.btonecajqb(resource, "resource");
        zdlpuopuiu.btonecajqb(resourceClientId, "resourceClientId");
        zdlpuopuiu.btonecajqb(subjectTokenType, "subjectTokenType");
        zdlpuopuiu.btonecajqb(grantType, "grantType");
        zdlpuopuiu.btonecajqb(scope, "scope");
        this.subjectToken = subjectToken;
        this.resource = resource;
        this.resourceClientId = resourceClientId;
        this.subjectTokenType = subjectTokenType;
        this.grantType = grantType;
        this.scope = scope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExchangeTokenRequest copy$default(ExchangeTokenRequest exchangeTokenRequest, String str, String str2, String str3, String str4, String str5, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = exchangeTokenRequest.subjectToken;
        }
        if ((i13 & 2) != 0) {
            str2 = exchangeTokenRequest.resource;
        }
        String str6 = str2;
        if ((i13 & 4) != 0) {
            str3 = exchangeTokenRequest.resourceClientId;
        }
        String str7 = str3;
        if ((i13 & 8) != 0) {
            str4 = exchangeTokenRequest.subjectTokenType;
        }
        String str8 = str4;
        if ((i13 & 16) != 0) {
            str5 = exchangeTokenRequest.grantType;
        }
        String str9 = str5;
        if ((i13 & 32) != 0) {
            list = exchangeTokenRequest.scope;
        }
        return exchangeTokenRequest.copy(str, str6, str7, str8, str9, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubjectToken() {
        return this.subjectToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getResource() {
        return this.resource;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getResourceClientId() {
        return this.resourceClientId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubjectTokenType() {
        return this.subjectTokenType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGrantType() {
        return this.grantType;
    }

    public final List<ScopeItem> component6() {
        return this.scope;
    }

    public final ExchangeTokenRequest copy(String subjectToken, String resource, String resourceClientId, String subjectTokenType, String grantType, List<ScopeItem> scope) {
        zdlpuopuiu.btonecajqb(subjectToken, "subjectToken");
        zdlpuopuiu.btonecajqb(resource, "resource");
        zdlpuopuiu.btonecajqb(resourceClientId, "resourceClientId");
        zdlpuopuiu.btonecajqb(subjectTokenType, "subjectTokenType");
        zdlpuopuiu.btonecajqb(grantType, "grantType");
        zdlpuopuiu.btonecajqb(scope, "scope");
        return new ExchangeTokenRequest(subjectToken, resource, resourceClientId, subjectTokenType, grantType, scope);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExchangeTokenRequest)) {
            return false;
        }
        ExchangeTokenRequest exchangeTokenRequest = (ExchangeTokenRequest) other;
        return zdlpuopuiu.eablkybsjg(this.subjectToken, exchangeTokenRequest.subjectToken) && zdlpuopuiu.eablkybsjg(this.resource, exchangeTokenRequest.resource) && zdlpuopuiu.eablkybsjg(this.resourceClientId, exchangeTokenRequest.resourceClientId) && zdlpuopuiu.eablkybsjg(this.subjectTokenType, exchangeTokenRequest.subjectTokenType) && zdlpuopuiu.eablkybsjg(this.grantType, exchangeTokenRequest.grantType) && zdlpuopuiu.eablkybsjg(this.scope, exchangeTokenRequest.scope);
    }

    public final String getGrantType() {
        return this.grantType;
    }

    public final String getResource() {
        return this.resource;
    }

    public final String getResourceClientId() {
        return this.resourceClientId;
    }

    public final List<ScopeItem> getScope() {
        return this.scope;
    }

    public final String getSubjectToken() {
        return this.subjectToken;
    }

    public final String getSubjectTokenType() {
        return this.subjectTokenType;
    }

    public int hashCode() {
        return this.scope.hashCode() + xg.iobyxmoadg(this.grantType, xg.iobyxmoadg(this.subjectTokenType, xg.iobyxmoadg(this.resourceClientId, xg.iobyxmoadg(this.resource, this.subjectToken.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        return "ExchangeTokenRequest(subjectToken=" + this.subjectToken + ", resource=" + this.resource + ", resourceClientId=" + this.resourceClientId + ", subjectTokenType=" + this.subjectTokenType + ", grantType=" + this.grantType + ", scope=" + this.scope + ")";
    }

    public /* synthetic */ ExchangeTokenRequest(String str, String str2, String str3, String str4, String str5, List list, int i13, gtknphoqwx gtknphoqwxVar) {
        this(str, str2, str3, (i13 & 8) != 0 ? "SBERID_APP_TOKEN" : str4, (i13 & 16) != 0 ? "urn:ietf:params:oauth:grant-type:token-exchange" : str5, (i13 & 32) != 0 ? jyumaefscl.eablkybsjg(new ScopeItem(Scopes.OPEN_ID)) : list);
    }
}
