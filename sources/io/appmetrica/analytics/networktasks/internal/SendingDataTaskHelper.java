package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.io.Compressor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class SendingDataTaskHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f48862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Compressor f48863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeProvider f48864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RequestDataHolder f48865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ResponseDataHolder f48866e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final NetworkResponseHandler f48867f;

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this(requestBodyEncrypter, compressor, new SystemTimeProvider(), requestDataHolder, responseDataHolder, networkResponseHandler);
    }

    public boolean isResponseValid() {
        DefaultResponseParser.Response response = (DefaultResponseParser.Response) this.f48867f.handle(this.f48866e);
        return response != null && "accepted".equals(response.mStatus);
    }

    public void onPerformRequest() {
        this.f48865d.applySendTime(this.f48864c.currentTimeMillis());
    }

    public boolean prepareAndSetPostData(byte[] bArr) {
        byte[] bArrEncrypt;
        try {
            byte[] bArrCompress = this.f48863b.compress(bArr);
            if (bArrCompress == null || (bArrEncrypt = this.f48862a.encrypt(bArrCompress)) == null) {
                return false;
            }
            this.f48865d.setPostData(bArrEncrypt);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public SendingDataTaskHelper(RequestBodyEncrypter requestBodyEncrypter, Compressor compressor, TimeProvider timeProvider, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, NetworkResponseHandler<DefaultResponseParser.Response> networkResponseHandler) {
        this.f48862a = requestBodyEncrypter;
        this.f48863b = compressor;
        this.f48864c = timeProvider;
        this.f48865d = requestDataHolder;
        this.f48866e = responseDataHolder;
        this.f48867f = networkResponseHandler;
    }
}
