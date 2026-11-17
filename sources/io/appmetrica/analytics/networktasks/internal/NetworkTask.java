package io.appmetrica.analytics.networktasks.internal;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public class NetworkTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f48843a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f48844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IExecutionPolicy f48845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExponentialBackoffPolicy f48846d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final UnderlyingNetworkTask f48847e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f48848f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f48849g;

    public enum Method {
        GET,
        POST
    }

    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i13);
    }

    public NetworkTask(Executor executor, IExecutionPolicy iExecutionPolicy, ExponentialBackoffPolicy exponentialBackoffPolicy, UnderlyingNetworkTask underlyingNetworkTask, List<ShouldTryNextHostCondition> list, String str) {
        this.f48844b = executor;
        this.f48845c = iExecutionPolicy;
        this.f48846d = exponentialBackoffPolicy;
        this.f48847e = underlyingNetworkTask;
        this.f48848f = list;
        this.f48849g = str;
    }

    private synchronized boolean a(int i13) {
        if (!a(i13)) {
            return false;
        }
        this.f48843a = i13;
        return true;
    }

    public String description() {
        return this.f48847e.description();
    }

    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f48845c;
    }

    public Executor getExecutor() {
        return this.f48844b;
    }

    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f48846d;
    }

    public RequestDataHolder getRequestDataHolder() {
        return this.f48847e.getRequestDataHolder();
    }

    public ResponseDataHolder getResponseDataHolder() {
        return this.f48847e.getResponseDataHolder();
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f48847e.getRetryPolicyConfig();
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f48847e.getSslSocketFactory();
    }

    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f48847e;
    }

    public String getUrl() {
        return this.f48847e.getFullUrlFormer().getUrl();
    }

    public String getUserAgent() {
        return this.f48849g;
    }

    public boolean isRemoved() {
        return this.f48843a == 9;
    }

    public boolean onCreateNetworkTask() {
        if (a(3)) {
            return this.f48847e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean zA = a(4);
        if (zA) {
            this.f48847e.getFullUrlFormer().incrementAttemptNumber();
            this.f48847e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f48847e.onPerformRequest();
        }
        return zA;
    }

    public boolean onRequestComplete() {
        boolean zOnRequestComplete;
        boolean z13;
        synchronized (this) {
            try {
                if (a(5, 6)) {
                    zOnRequestComplete = this.f48847e.onRequestComplete();
                    if (zOnRequestComplete) {
                        this.f48843a = 5;
                    } else {
                        this.f48843a = 6;
                    }
                    z13 = true;
                } else {
                    zOnRequestComplete = false;
                    z13 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z13) {
            this.f48847e.onPostRequestComplete(zOnRequestComplete);
        }
        return zOnRequestComplete;
    }

    public void onRequestError(Throwable th2) {
        if (a(6)) {
            this.f48847e.onRequestError(th2);
        }
    }

    public void onShouldNotExecute() {
        if (a(7)) {
            this.f48847e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean zA = a(2);
        if (zA) {
            this.f48847e.onTaskAdded();
        }
        return zA;
    }

    public void onTaskFinished() {
        int i13;
        boolean zA;
        synchronized (this) {
            i13 = this.f48843a;
            zA = a(8);
        }
        if (zA) {
            this.f48847e.onTaskFinished();
            if (i13 == 5) {
                this.f48847e.onSuccessfulTaskFinished();
            } else if (i13 == 6 || i13 == 7) {
                this.f48847e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (a(9)) {
            this.f48847e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean zHasMoreHosts;
        boolean z13;
        int i13;
        try {
            zHasMoreHosts = this.f48847e.getFullUrlFormer().hasMoreHosts();
            int responseCode = this.f48847e.getResponseDataHolder().getResponseCode();
            Iterator it = this.f48848f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z13 = true;
                    break;
                }
                if (!((ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                    z13 = false;
                    break;
                }
            }
            i13 = this.f48843a;
        } catch (Throwable th2) {
            throw th2;
        }
        return i13 != 9 && i13 != 8 && zHasMoreHosts && z13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:40:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0065 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x0018, B:7:0x001b, B:49:0x0077, B:52:0x0081, B:15:0x002a, B:25:0x003f, B:26:0x0042, B:28:0x0047, B:30:0x004c, B:32:0x0051, B:38:0x005d, B:39:0x0060, B:41:0x0065, B:43:0x006a, B:47:0x0071, B:53:0x0084), top: B:58:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x006a A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x0018, B:7:0x001b, B:49:0x0077, B:52:0x0081, B:15:0x002a, B:25:0x003f, B:26:0x0042, B:28:0x0047, B:30:0x004c, B:32:0x0051, B:38:0x005d, B:39:0x0060, B:41:0x0065, B:43:0x006a, B:47:0x0071, B:53:0x0084), top: B:58:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0076  */
    private synchronized boolean a(int... iArr) {
        Boolean bool;
        Boolean bool2;
        Boolean boolValueOf;
        try {
            bool = Boolean.TRUE;
            int i13 = this.f48843a;
            for (int i14 : iArr) {
                boolean z13 = true;
                switch (e.a(i14)) {
                    case 0:
                        boolValueOf = null;
                        break;
                    case 1:
                        if (i13 != 1) {
                            z13 = false;
                        }
                        boolValueOf = Boolean.valueOf(z13);
                        break;
                    case 2:
                        if (i13 == 2) {
                            boolValueOf = Boolean.TRUE;
                        } else if (i13 == 9) {
                            boolValueOf = Boolean.FALSE;
                        } else {
                            boolValueOf = null;
                        }
                        break;
                    case 3:
                        if (i13 == 3 || i13 == 5 || i13 == 6) {
                            boolValueOf = Boolean.TRUE;
                        } else if (i13 == 9) {
                            boolValueOf = Boolean.FALSE;
                        } else {
                            boolValueOf = null;
                        }
                        break;
                    case 4:
                    case 5:
                        if (i13 == 4) {
                            boolValueOf = Boolean.TRUE;
                        } else if (i13 == 9) {
                            boolValueOf = Boolean.FALSE;
                        } else {
                            boolValueOf = null;
                        }
                        break;
                    case 6:
                        if (i13 == 3) {
                            boolValueOf = Boolean.TRUE;
                        } else if (i13 == 2) {
                            boolValueOf = Boolean.TRUE;
                        } else if (i13 == 9) {
                            boolValueOf = Boolean.FALSE;
                        } else {
                            boolValueOf = null;
                        }
                        break;
                    case 7:
                        if (i13 == 5 || i13 == 6 || i13 == 7 || i13 == 2 || i13 == 3 || i13 == 4) {
                            boolValueOf = Boolean.TRUE;
                        } else if (i13 == 9) {
                            boolValueOf = Boolean.FALSE;
                        } else {
                            boolValueOf = null;
                        }
                        break;
                    case 8:
                        if (i13 == 1) {
                            boolValueOf = null;
                        } else {
                            if (i13 == 9) {
                                z13 = false;
                            }
                            boolValueOf = Boolean.valueOf(z13);
                        }
                        break;
                    default:
                        boolValueOf = Boolean.FALSE;
                        break;
                }
                if (!Boolean.TRUE.equals(boolValueOf)) {
                    bool = boolValueOf;
                    bool2 = Boolean.TRUE;
                    bool2.equals(bool);
                }
            }
            bool2 = Boolean.TRUE;
            bool2.equals(bool);
        } catch (Throwable th2) {
            throw th2;
        }
        return bool2.equals(bool);
    }
}
