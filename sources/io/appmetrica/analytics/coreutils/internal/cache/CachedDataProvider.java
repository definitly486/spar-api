package io.appmetrica.analytics.coreutils.internal.cache;

/* JADX INFO: loaded from: classes3.dex */
public interface CachedDataProvider {

    public static class CachedData<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f45294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile long f45295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile long f45296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f45297d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Object f45298e = null;

        public CachedData(long j13, long j14, String str) {
            this.f45294a = String.format("[CachedData-%s]", str);
            this.f45295b = j13;
            this.f45296c = j14;
        }

        public T getData() {
            return (T) this.f45298e;
        }

        public long getExpiryTime() {
            return this.f45296c;
        }

        public long getRefreshTime() {
            return this.f45295b;
        }

        public final boolean isEmpty() {
            return this.f45298e == null;
        }

        public void setData(T t13) {
            this.f45298e = t13;
            this.f45297d = System.currentTimeMillis();
        }

        public void setExpirationPolicy(long j13, long j14) {
            this.f45295b = j13;
            this.f45296c = j14;
        }

        public final boolean shouldClearData() {
            if (this.f45297d == 0) {
                return false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f45297d;
            return jCurrentTimeMillis > this.f45296c || jCurrentTimeMillis < 0;
        }

        public final boolean shouldUpdateData() {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f45297d;
            return jCurrentTimeMillis > this.f45295b || jCurrentTimeMillis < 0;
        }

        public String toString() {
            return "CachedData{tag='" + this.f45294a + "', refreshTime=" + this.f45295b + ", expiryTime=" + this.f45296c + ", mCachedTime=" + this.f45297d + ", mCachedData=" + this.f45298e + '}';
        }
    }
}
