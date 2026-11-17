package io.appmetrica.analytics.coreutils.internal;

import hg.jyumaefscl;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/ReferenceHolder;", "", "<init>", "()V", "reference", "Lgg/wwaezpbzkn;", "storeReference", "(Ljava/lang/Object;)V", "removeReference", "", "peekReferences", "()Ljava/util/Set;", "core-utils_release"}, k = 1, mv = {1, 6, 0})
public final class ReferenceHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f45293a = new LinkedHashSet();

    public final Set<Object> peekReferences() {
        return jyumaefscl.r(this.f45293a);
    }

    public final void removeReference(Object reference) {
        this.f45293a.remove(reference);
    }

    public final void storeReference(Object reference) {
        this.f45293a.add(reference);
    }
}
