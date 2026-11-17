package io.appmetrica.analytics.networktasks.internal;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class RequestDataHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private NetworkTask.Method f48853a = NetworkTask.Method.GET;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f48854b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f48855c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f48856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f48857e;

    public void applySendTime(long j13) {
        this.f48856d = Long.valueOf(j13);
        this.f48857e = Integer.valueOf(((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(TimeUnit.MILLISECONDS.toSeconds(j13) * 1000) / 1000);
    }

    public Map<String, List<String>> getHeaders() {
        return this.f48854b;
    }

    public NetworkTask.Method getMethod() {
        return this.f48853a;
    }

    public byte[] getPostData() {
        return this.f48855c;
    }

    public Long getSendTimestamp() {
        return this.f48856d;
    }

    public Integer getSendTimezoneSec() {
        return this.f48857e;
    }

    public void setHeader(String str, String... strArr) {
        this.f48854b.put(str, Arrays.asList(strArr));
    }

    public void setPostData(byte[] bArr) {
        this.f48853a = NetworkTask.Method.POST;
        this.f48855c = bArr;
    }
}
