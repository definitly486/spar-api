package ru.myspar.core.domain.utils.webview;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lru/myspar/core/domain/utils/webview/WebViewException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "fullMessage", "", "<init>", "(Ljava/lang/String;)V", "CommonError", "HttpError", "Lru/myspar/core/domain/utils/webview/WebViewException$CommonError;", "Lru/myspar/core/domain/utils/webview/WebViewException$HttpError;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class WebViewException extends Exception {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\t¨\u0006\u0019"}, d2 = {"Lru/myspar/core/domain/utils/webview/WebViewException$CommonError;", "Lru/myspar/core/domain/utils/webview/WebViewException;", "", ImagesContract.URL, "reason", "webViewErrorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getUrl", "yggfygwlhe", "getReason", "jyumaefscl", "getWebViewErrorCode", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CommonError extends WebViewException {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name and from kotlin metadata and from toString */
        private final String webViewErrorCode;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String reason;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        public /* synthetic */ CommonError(String str, String str2, String str3, int i13, gtknphoqwx gtknphoqwxVar) {
            this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CommonError)) {
                return false;
            }
            CommonError commonError = (CommonError) other;
            return zdlpuopuiu.eablkybsjg(this.url, commonError.url) && zdlpuopuiu.eablkybsjg(this.reason, commonError.reason) && zdlpuopuiu.eablkybsjg(this.webViewErrorCode, commonError.webViewErrorCode);
        }

        public int hashCode() {
            String str = this.url;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.reason;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.webViewErrorCode;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "CommonError(url=" + this.url + ", reason=" + this.reason + ", webViewErrorCode=" + this.webViewErrorCode + ")";
        }

        public CommonError(String str, String str2, String str3) {
            super("url: " + str + ", reason: " + str2 + ", code: " + str3, null);
            this.url = str;
            this.reason = str2;
            this.webViewErrorCode = str3;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lru/myspar/core/domain/utils/webview/WebViewException$HttpError;", "Lru/myspar/core/domain/utils/webview/WebViewException;", "", ImagesContract.URL, "statusCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zdlpuopuiu", "Ljava/lang/String;", "getUrl", "yggfygwlhe", "getStatusCode", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HttpError extends WebViewException {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name and from kotlin metadata and from toString */
        private final String statusCode;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HttpError(String url, String statusCode) {
            super("url: " + url + ", status: " + statusCode, null);
            zdlpuopuiu.btonecajqb(url, "url");
            zdlpuopuiu.btonecajqb(statusCode, "statusCode");
            this.url = url;
            this.statusCode = statusCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HttpError)) {
                return false;
            }
            HttpError httpError = (HttpError) other;
            return zdlpuopuiu.eablkybsjg(this.url, httpError.url) && zdlpuopuiu.eablkybsjg(this.statusCode, httpError.statusCode);
        }

        public int hashCode() {
            return (this.url.hashCode() * 31) + this.statusCode.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "HttpError(url=" + this.url + ", statusCode=" + this.statusCode + ")";
        }
    }

    public /* synthetic */ WebViewException(String str, gtknphoqwx gtknphoqwxVar) {
        this(str);
    }

    private WebViewException(String str) {
        super(str);
    }
}
