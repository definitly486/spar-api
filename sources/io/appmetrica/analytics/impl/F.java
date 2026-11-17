package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45771c;

    public F(int i13, int i14, int i15) {
        this.f45769a = i13;
        this.f45770b = i14;
        this.f45771c = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(F.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.impl.id.AdvIdGetterController.CanTrackIdentifiers");
        }
        F f13 = (F) obj;
        return this.f45769a == f13.f45769a && this.f45770b == f13.f45770b && this.f45771c == f13.f45771c;
    }

    public final int hashCode() {
        return AbstractC3481e8.a(this.f45771c) + ((AbstractC3481e8.a(this.f45770b) + (AbstractC3481e8.a(this.f45769a) * 31)) * 31);
    }

    public final String toString() {
        return "CanTrackIdentifiers(canTrackGaid=" + G.a(this.f45769a) + ", canTrackHoaid=" + G.a(this.f45770b) + ", canTrackYandexAdvId=" + G.a(this.f45771c) + ')';
    }
}
