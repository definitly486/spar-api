package com.airbnb.lottie;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class wypolnanlu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Object f20523iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Throwable f20524zoijcleaow;

    public wypolnanlu(Object obj) {
        this.f20523iobyxmoadg = obj;
        this.f20524zoijcleaow = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wypolnanlu)) {
            return false;
        }
        wypolnanlu wypolnanluVar = (wypolnanlu) obj;
        if (zoijcleaow() != null && zoijcleaow().equals(wypolnanluVar.zoijcleaow())) {
            return true;
        }
        if (iobyxmoadg() == null || wypolnanluVar.iobyxmoadg() == null) {
            return false;
        }
        return iobyxmoadg().toString().equals(iobyxmoadg().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{zoijcleaow(), iobyxmoadg()});
    }

    public Throwable iobyxmoadg() {
        return this.f20524zoijcleaow;
    }

    public Object zoijcleaow() {
        return this.f20523iobyxmoadg;
    }

    public wypolnanlu(Throwable th2) {
        this.f20524zoijcleaow = th2;
        this.f20523iobyxmoadg = null;
    }
}
